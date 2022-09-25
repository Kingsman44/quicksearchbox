package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2037n.C24787at;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4701g.C62359v;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ej */
/* compiled from: PG */
public final class C24653ej {
    /* renamed from: a */
    public static void m45754a(Class cls, C24530h hVar) {
        hVar.mo29945d(C24805p.PRIMITIVE_RUN_ERROR, C24657en.m45762b(cls));
    }

    /* renamed from: b */
    public static void m45755b(Class cls, C24530h hVar) {
        hVar.mo29945d(C24805p.PRIMITIVE_RUN_START, C24657en.m45762b(cls));
    }

    /* renamed from: c */
    public static void m45756c(Class cls, C24530h hVar, C62355r rVar) {
        C24807r rVar2 = (C24807r) C24808s.f67804l.createBuilder();
        String b = C24657en.m45762b(cls);
        rVar2.copyOnWrite();
        C24808s sVar = (C24808s) rVar2.instance;
        b.getClass();
        sVar.f67806a |= 1;
        sVar.f67807b = b;
        m45758e(rVar2, rVar);
        hVar.mo29947f(C24805p.PRIMITIVE_RUN_SUCCESS, (C24808s) rVar2.build());
    }

    /* renamed from: d */
    public static void m45757d(Class cls, C24530h hVar, C24787at atVar, C62355r rVar) {
        C24807r rVar2 = (C24807r) C24808s.f67804l.createBuilder();
        String b = C24657en.m45762b(cls);
        rVar2.copyOnWrite();
        C24808s sVar = (C24808s) rVar2.instance;
        b.getClass();
        sVar.f67806a |= 1;
        sVar.f67807b = b;
        rVar2.copyOnWrite();
        C24808s sVar2 = (C24808s) rVar2.instance;
        atVar.getClass();
        sVar2.f67810e = atVar;
        sVar2.f67806a |= 8;
        m45758e(rVar2, rVar);
        hVar.mo29947f(C24805p.PRIMITIVE_RUN_SUCCESS, (C24808s) rVar2.build());
    }

    /* renamed from: e */
    private static void m45758e(C24807r rVar, C62355r rVar2) {
        C62359v vVar = rVar2.f168336c;
        if (vVar == null) {
            vVar = C62359v.f168346b;
        }
        long j = vVar.f168348a;
        if (j > 0) {
            rVar.copyOnWrite();
            C24808s sVar = (C24808s) rVar.instance;
            C24808s sVar2 = C24808s.f67804l;
            sVar.f67806a |= 256;
            sVar.f67815j = j;
        }
    }
}
