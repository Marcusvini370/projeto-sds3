import { format } from 'date-fns';

export type Seller = {
    id: number;
    name: string
  }

  //função para arredonda o numero em 1 casa decila etc

export const formatLocalDate = (date: string, pattern: string) => {
    const dt = new Date(date);
    const dtDateOnly = new Date(dt.valueOf() + dt.getTimezoneOffset() * 60 * 1000);
    return format(dtDateOnly, pattern);
  }