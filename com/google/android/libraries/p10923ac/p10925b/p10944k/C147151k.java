package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.b.k.k */
/* compiled from: PG */
public final /* synthetic */ class C147151k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147160t f397279a;

    /* renamed from: b */
    public final /* synthetic */ List f397280b;

    public /* synthetic */ C147151k(C147160t tVar, List list) {
        this.f397279a = tVar;
        this.f397280b = list;
    }

    public final Object call() {
        C147160t tVar = this.f397279a;
        for (C60870cx cxVar : this.f397280b) {
            try {
                cxVar.get();
            } catch (Exception unused) {
                C147244a aVar = (C147244a) tVar.f397316g.mo27525b();
            }
        }
        return null;
    }
}
