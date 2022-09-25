package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import androidx.core.p097i.C1970e;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dm */
/* compiled from: PG */
abstract class C104626dm {
    /* renamed from: f */
    static C104625dl m173179f(C9270n nVar, C7718hj hjVar) {
        C104640e eVar = new C104640e();
        eVar.f291352a = nVar;
        if (hjVar != null) {
            eVar.f291353b = hjVar;
            eVar.f291354c = null;
            eVar.f291355d = null;
            eVar.mo94279b(-1);
            return eVar;
        }
        throw new NullPointerException("Null loggingEntry");
    }

    /* renamed from: a */
    public abstract int mo94280a();

    /* renamed from: b */
    public abstract C1970e mo94281b();

    /* renamed from: c */
    public abstract C9270n mo94282c();

    /* renamed from: d */
    public abstract C7718hj mo94283d();

    /* renamed from: e */
    public abstract C7718hj mo94284e();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C7718hj mo94285g() {
        if (mo94281b() == null) {
            return null;
        }
        C1970e b = mo94281b();
        b.getClass();
        return (C7718hj) b.f5888a;
    }
}
