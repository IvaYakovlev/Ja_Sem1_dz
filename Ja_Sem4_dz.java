    ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        System.out.println("Введите фио, возраст и пол");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (run) {
            String str = scanner.nextLine();
            if (str.equals("q")) {
                System.out.println("Вышли)))");
                break;
            }
            String[] fio = str.split(" ");
            index.add(i);
            familia.add(fio[0]);
            name.add(fio[1]);
            batka.add(fio[2]);
            age.add(Integer.parseInt(fio[3]));
            gender.add(fio[4]);

            i++;
        }
        ArrayList<Integer> temporary = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            temporary.add(age.get(j));

        int max = age.get(0);
        for (int j = 0; j < age.size()-1; j++) {
            int temp;
            for (int k = 1; k < age.size()- 1 - j; k++) {
                if (age.get(k)>max) {
                    temp = index.get(k);
        }
        // Сортировка индексов по возрасту
        for (int j = 0; j < index.size()-1 ; j++) {
            for (int k = 0; k < index.size() - 1 - j; k++) {
                if (temporary.get(k) > temporary.get(k + 1)) {

                }
                    int temp = index.get(k);
                    index.set(k, index.get(k + 1));
                    index.set(k + 1, temp);
                    temp = temporary.get(k);
                    temporary.set(k, temporary.get(k + 1));
                    temporary.set(k + 1, temp);

                }
            }
        }
        for (int j = 0; j < index.size() ; j++) {
            System.out.printf("%s %s. %s. %s %s \n", familia.get(index.get(j)), name.get(index.get(j)).charAt(0),
                    batka.get(index.get(j)).charAt(0), age.get(index.get(j)), gender.get(index.get(j)));
        }

        ArrayList<String> temporary2 = new ArrayList<>();
        for (int j = 0; j < index.size(); j++) {
            temporary2.add(gender.get(index.get(j)));
        }
        // Сортировка по полу
        for (int j = 0; j < index.size()-1 ; j++) {

                if (temporary2.get(j).contains("м")&&temporary2.get(j+1).contains("ж")){
                    int temp = index.get(j);
                    index.set(j, index.get(j + 1));
                    index.set(j + 1, temp);
                    String temp2 = temporary2.get(j);
                    temporary2.set(j, temporary2.get(j + 1));
                    temporary2.set(j + 1, temp2);
                }
                else continue;
        }
        System.out.println("\n");
        for (int j = 0; j < index.size() ; j++) {
            System.out.printf("%s %s. %s. %s %s \n", familia.get(index.get(j)), name.get(index.get(j)).charAt(0),
                    batka.get(index.get(j)).charAt(0), age.get(index.get(j)), gender.get(index.get(j)));
        }

        /*
                index.forEach(n -> System.out.print(n));
        age.forEach(n -> System.out.println(n));
//        scanner.close();
        for (String [] person : data) {
            char name = person[1].charAt(0);
            char batka = person[2].charAt(0);
            System.out.printf("%s %s.%s. %s %s \n", person[0], name, batka, person[3], person[4]);
        }
        System.out.println("Введите q для завершения или s для сортировки");
        String s;
        while (true){
            s = scanner.nextLine();
            if(s.equals("s")||s.equals("q")){
                break;
            }
        }
        if(s.equals("s")){
            data.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    int r = Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                    return r;
                }
            });
        }
        System.out.println();
        for (String [] person : data) {
            char name = person[1].charAt(0);
            char batka = person[2].charAt(0);
            System.out.printf("%s %s.%s. %s %s \n", person[0], name, batka, person[3], person[4]);
        }*/
    }
}
// 2 вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!
// 4. реализовать сортировку по возрасту с использованием индексов