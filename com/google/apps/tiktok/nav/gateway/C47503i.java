package com.google.apps.tiktok.nav.gateway;

import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.apps.tiktok.nav.gateway.i */
/* compiled from: PG */
public abstract class C47503i {
    /* renamed from: d */
    public static C47502h m84541d() {
        C47494a aVar = new C47494a();
        aVar.mo51352b(C58485gu.m89845m());
        C58485gu m = C58485gu.m89845m();
        if (m != null) {
            aVar.f123318a = m;
            aVar.f123319b = null;
            return aVar;
        }
        throw new NullPointerException("Null accountUiCallbacks");
    }

    /* renamed from: a */
    public abstract C58485gu mo51353a();

    /* renamed from: b */
    public abstract List mo51354b();

    /* renamed from: c */
    public abstract List mo51355c();
}
