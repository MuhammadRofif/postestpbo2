package com.pbo.sistem_pengelolaan_tugas_harian;

public interface Crud {
    void create(Tugas tugas);
    void read();
    void update(int id, Tugas tugas);
    void delete(int id);
}

