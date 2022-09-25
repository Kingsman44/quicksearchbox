package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.ai */
/* compiled from: PG */
public abstract class C75650ai {
    /* renamed from: l */
    public static C75644ac m121912l() {
        C75654e eVar = new C75654e();
        eVar.mo71789f(C58733pz.f156496a);
        eVar.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint);
        eVar.mo71785b(C75646ae.m121905c().mo71791a());
        return eVar;
    }

    /* renamed from: a */
    public abstract C75646ae mo71797a();

    /* renamed from: b */
    public abstract C75649ah mo71798b();

    /* renamed from: c */
    public abstract C75649ah mo71799c();

    /* renamed from: d */
    public abstract C58528ij mo71800d();

    /* renamed from: e */
    public abstract C58528ij mo71801e();

    /* renamed from: f */
    public abstract Optional mo71802f();

    /* renamed from: g */
    public abstract Optional mo71803g();

    /* renamed from: h */
    public abstract Optional mo71804h();

    /* renamed from: i */
    public abstract String mo71805i();

    /* renamed from: j */
    public abstract String mo71806j();

    /* renamed from: k */
    public abstract Locale mo71807k();

    /* renamed from: m */
    public final Optional mo71808m(Locale locale) {
        return mo71804h().map(new C75643ab(locale));
    }
}
