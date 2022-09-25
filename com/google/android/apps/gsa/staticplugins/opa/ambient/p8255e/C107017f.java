package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e;

import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.f */
/* compiled from: PG */
public abstract class C107017f {
    /* renamed from: d */
    public static C107016e m177726d() {
        C106846a aVar = new C106846a();
        aVar.mo95686b(Optional.empty());
        aVar.mo95687c(Optional.empty());
        C58485gu m = C58485gu.m89845m();
        if (m != null) {
            aVar.f297720a = m;
            return aVar;
        }
        throw new NullPointerException("Null smartspaceCards");
    }

    /* renamed from: e */
    public static C107017f m177727e(C50738bc bcVar) {
        C107016e d = m177726d();
        d.mo95686b(Optional.m71637of(bcVar));
        return d.mo95685a();
    }

    /* renamed from: a */
    public abstract C58485gu mo95689a();

    /* renamed from: b */
    public abstract Optional mo95690b();

    /* renamed from: c */
    public abstract Optional mo95691c();
}
