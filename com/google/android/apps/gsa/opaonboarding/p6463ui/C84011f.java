package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.View;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.f */
/* compiled from: PG */
public abstract class C84011f {

    /* renamed from: a */
    public static final C84011f f228856a;

    static {
        C84010e e = m133882e();
        e.mo77376d(false);
        ((C83958a) e).f228734b = C83987c.f228786a;
        e.mo77374b(false);
        f228856a = e.mo77373a();
    }

    /* renamed from: e */
    public static C84010e m133882e() {
        C83958a aVar = new C83958a();
        aVar.mo77376d(true);
        aVar.f228733a = BuildConfig.FLAVOR;
        aVar.f228734b = C84009d.f228855a;
        aVar.mo77374b(false);
        return aVar;
    }

    /* renamed from: a */
    public abstract View.OnClickListener mo77415a();

    /* renamed from: b */
    public abstract CharSequence mo77416b();

    /* renamed from: c */
    public abstract boolean mo77417c();

    /* renamed from: d */
    public abstract boolean mo77418d();
}
