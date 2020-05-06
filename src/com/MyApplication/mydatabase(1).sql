-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Май 06 2020 г., 17:16
-- Версия сервера: 10.4.11-MariaDB
-- Версия PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `mydatabase`
--

-- --------------------------------------------------------

--
-- Структура таблицы `foods`
--

CREATE TABLE `foods` (
  `id` int(11) NOT NULL,
  `name` varchar(64) NOT NULL,
  `ing` text NOT NULL,
  `cook` text NOT NULL,
  `category` enum('ТОРТЫ','ВЫПЕЧКА','САЛАТ','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `foods`
--

INSERT INTO `foods` (`id`, `name`, `ing`, `cook`, `category`) VALUES
(4, 'Торт Ричард', '120 г сливочного масла \r\n 190 г сахарного песка \r\n340 г пшеничной муки\r\n200 г сметаны 20% ', '1. С половины лимона снять цедру. К размягчённому сливочному маслу добавить сахарный песок и взбить миксером добела. Вбить яйца.', 'ТОРТЫ'),
(7, 'Двухцветные безглютеновые маффины', '1 ст.л. семян льна \r\n3 ст.л. кипятка \r\n100 г масла гхи или сливочного ', '1. Семена льна измельчаем в кофемолке, заливаем кипятком. Это у нас замена яиц для связки теста. 2. Смешиваем всю муку, добавляем растопленное масло', 'ТОРТЫ'),
(9, 'Бабушкины булочки', '\"600 г мука \r\n100 г сахар \r\nщепотка соль \r\n300 мл молоко (теплое) ', '1. В теплое молоко отправляем дрожжи, растворяем. Сразу сахар, соль, яйца и растительное масло с майонезом. Хорошо все перемешиваем. 2. Теперь можно вводить муку, тесто получается мягким.', 'ВЫПЕЧКА'),
(11, 'Булочки с абрикосами', '\"200 мл молоко \r\n10 г дрожжи сырые (сухие - 3 г)\r\n30 г масло \r\n2-3 щеп. соль ', '1. Раскрошить в миску свежие дрожжи, добавить сахар, тёплое молоко и хорошо размешать до растворения дрожжей. Добавить соль и ванильный сахар и, частями добавляя муку, замесить тесто. Оно должно получиться вязким. 2. Положить сливочное масло комнатной температуры и тщательно вмешать ложкой в тесто.', 'ВЫПЕЧКА'),
(12, 'Печенье с крошкой', '4 яйца \r\n500 г творога \r\n2 ст.л. сметаны 20 % \r\n7 ст.л. сахара ', 'Отделить желтки от белков.\r\n2. К желткам добавить сахар. Взбить до крепкой пены. 3. Добавить крахмал (я брала картофельный), творог и сметану, все взбить до однородной массы.', 'ВЫПЕЧКА'),
(13, 'Печенье с крошкой', '4 яйца \r\n500 г творога \r\n2 ст.л. сметаны 20 % \r\n7 ст.л. сахара ', 'Отделить желтки от белков.\r\n2. К желткам добавить сахар. Взбить до крепкой пены. 3. Добавить крахмал (я брала картофельный), творог и сметану, все взбить до однородной массы.', 'ВЫПЕЧКА'),
(15, 'Фруктовый салат Angel', '1 кг пекинской капусты \r\n2 свежих огурца \r\n1 болгарский перец \r\n150 г корейской моркови \r\nсоль', '1. Пекинскую капусту порезала, добавила соль, сахар и уксус. Помяла немного руками и оставила минут на 15. 2. Добавила корейскую морковь, свежий огурец и болгарский перец. Перемешала.', 'САЛАТ'),
(16, 'Салат Цезарь', '250-300 филе курицы \r\nСоевый соус\r\nОливковое масло\r\nФранцузская горчица', 'Филе курицы, большие куски запекала в сотейнике айкук в собственном соку. Маленькие кусочки курицы - для плова. Классно, когда в одной посуде можно готовить одновременно несколько блюд. Если нет посуды айкук, можно отварить, но вкус будет не тот. Когда курица запеклась, нарезаем кубиками 1х1 см. Перец режем соломкой 1х3 см. И пекинку тоже соломкой. 2. Оливки режем колечками. И все продукты смешиваем. ', 'САЛАТ'),
(18, 'Оливье', 'Картоп,морковь,горох,майонез,огурец,яйцо', 'Все перемешивать', 'САЛАТ');

-- --------------------------------------------------------

--
-- Структура таблицы `mybasket`
--

CREATE TABLE `mybasket` (
  `userid` int(11) NOT NULL,
  `name` varchar(64) NOT NULL,
  `ingredients` text NOT NULL,
  `cooking` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `mybasket`
--

INSERT INTO `mybasket` (`userid`, `name`, `ingredients`, `cooking`) VALUES
(2, 'Фруктовый салат Angel', '1 кг пекинской капусты \r\n2 свежих огурца \r\n1 болгарский перец \r\n150 г корейской моркови \r\nсоль', '1. Пекинскую капусту порезала, добавила соль, сахар и уксус. Помяла немного руками и оставила минут на 15. 2. Добавила корейскую морковь, свежий огурец и болгарский перец. Перемешала.'),
(6, 'Фруктовый салат Angel', '1 кг пекинской капусты \r\n2 свежих огурца \r\n1 болгарский перец \r\n150 г корейской моркови \r\nсоль', '1. Пекинскую капусту порезала, добавила соль, сахар и уксус. Помяла немного руками и оставила минут на 15. 2. Добавила корейскую морковь, свежий огурец и болгарский перец. Перемешала.');

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(64) NOT NULL,
  `surname` varchar(64) NOT NULL,
  `login` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `role` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id`, `name`, `surname`, `login`, `password`, `role`) VALUES
(1, 'Moldir', 'Zhanseiitova', 'Moldir', 'moldir', 'user'),
(2, 'moldir', 'zhanseiitova', 'molya', '12345', 'USER'),
(6, 'zhansaya', 'zhetkergen', 'zhapok', '555', 'USER'),
(7, 'Togzhan', 'Anuar', 'tohzh', '123', 'USER');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `foods`
--
ALTER TABLE `foods`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `mybasket`
--
ALTER TABLE `mybasket`
  ADD PRIMARY KEY (`userid`);

--
-- Индексы таблицы `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `foods`
--
ALTER TABLE `foods`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT для таблицы `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
