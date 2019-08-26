import { Type} from './type';
import { List} from './list';

export default class GroceryItem {
    constructor(
        public id = 0,
        public name = '',
        public type: Type,
        public list: List,
    ) {}
}