package by.itstep.javatraining.revision.task;

/*	Task 05. The Next Even Number [следующее чётное число]
 *
 *	На вход дается натуральное число N. Вычислите следующее за ним чётное число.
 *
 *	Формат входных данных [input]
 *	На вход дается целое положительное число N.
 *
 *	Формат выходных данных [output]
 *	Выведите одно целое число - ответ на задачу.
 *
 *  Примечание
 *  На забудьте предусмотреть "защиту от дурака": если данные не подходят по условию задачи,
 *  то необходимо возвратить 0
 *
 *	[Sample method input 1]: 1
 *	[Sample method output 1]: 2
 *
 *	[ input 2]: 2
 *	[output 2]: 4
 *
 *	[ input 3]: 3
 *	[output 3]: 4
 */

public class Task05 {
    public static int start(int number) {
    	if(number <= 0) {
    		return 0;
    	}
        return (number + 1) % 2 == 0 ? number + 1 : number + 2;
    }
}
