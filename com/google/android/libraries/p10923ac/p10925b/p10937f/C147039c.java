package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64007bq;
import com.google.protos.p4895aw.p4902b.C64008br;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.b.f.c */
/* compiled from: PG */
public final /* synthetic */ class C147039c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147041e f397012a;

    /* renamed from: b */
    public final /* synthetic */ Map f397013b;

    public /* synthetic */ C147039c(C147041e eVar, Map map) {
        this.f397012a = eVar;
        this.f397013b = map;
    }

    public final Object call() {
        C147041e eVar = this.f397012a;
        Map map = this.f397013b;
        synchronized (eVar.f397019d) {
            for (Map.Entry entry : map.entrySet()) {
                C64007bq bqVar = (C64007bq) C64008br.f173093c.createBuilder();
                String str = (String) ((C60870cx) entry.getKey()).get();
                bqVar.copyOnWrite();
                C64008br brVar = (C64008br) bqVar.instance;
                str.getClass();
                brVar.f173095a = 2;
                brVar.f173096b = str;
                C64008br brVar2 = (C64008br) bqVar.build();
                eVar.f397016a.put(brVar2, (Account) entry.getValue());
                eVar.f397017b.put((Account) entry.getValue(), brVar2);
            }
            eVar.f397020e = null;
        }
        return null;
    }
}
