package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o */
/* compiled from: PG */
public abstract class C101775o {
    /* renamed from: e */
    public static C101774n m168403e() {
        C101761a aVar = new C101761a();
        aVar.f283854a = true;
        aVar.mo92547b(C101773m.NO_SCREEN);
        aVar.f283855b = 0;
        aVar.f283856c = null;
        return aVar;
    }

    /* renamed from: f */
    public static C101775o m168404f(C101773m mVar) {
        C101774n e = m168403e();
        ((C101761a) e).f283854a = false;
        e.mo92547b(mVar);
        return e.mo92546a();
    }

    /* renamed from: g */
    public static C101775o m168405g() {
        C101774n e = m168403e();
        ((C101761a) e).f283855b = -1;
        return e.mo92546a();
    }

    /* renamed from: h */
    public static C101775o m168406h(Intent intent) {
        C101774n e = m168403e();
        C101761a aVar = (C101761a) e;
        aVar.f283855b = 2;
        aVar.f283856c = intent;
        return e.mo92546a();
    }

    /* renamed from: i */
    public static C101775o m168407i(C101773m mVar) {
        C101774n e = m168403e();
        e.mo92547b(mVar);
        return e.mo92546a();
    }

    /* renamed from: a */
    public abstract Intent mo92548a();

    /* renamed from: b */
    public abstract C101773m mo92549b();

    /* renamed from: c */
    public abstract Boolean mo92550c();

    /* renamed from: d */
    public abstract Integer mo92551d();
}
