package org.example.observer;

public class NhaDauTu implements Observer {
    private String name;

    public NhaDauTu(String name) {
        this.name = name;
    }

    @Override
    public void updates(CoPhieu coPhieu) {
        System.out.println("nha dau tu" + name + "nhan dc thong bao: gia co phieu da thay doi thanh" + coPhieu.getPrice());
    }
}
