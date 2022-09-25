package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.sqlite.SQLiteDatabase;
import dagger.C68214a;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.libraries.ac.b.i.b */
/* compiled from: PG */
public final class C147079b implements C147074as {

    /* renamed from: a */
    private final C68214a f397117a;

    public C147079b(C68214a aVar) {
        this.f397117a = aVar;
    }

    /* renamed from: a */
    public final void mo123885a(SQLiteDatabase sQLiteDatabase) {
        for (Integer num : new TreeSet(((Map) this.f397117a.mo27525b()).keySet())) {
            ((C147074as) ((Map) this.f397117a.mo27525b()).get(num)).mo123885a(sQLiteDatabase);
        }
    }

    /* renamed from: b */
    public final void mo123886b() {
        for (Integer num : new TreeSet(((Map) this.f397117a.mo27525b()).keySet())) {
            ((C147074as) ((Map) this.f397117a.mo27525b()).get(num)).mo123886b();
        }
    }
}
