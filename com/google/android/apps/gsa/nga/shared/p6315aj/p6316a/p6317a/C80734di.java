package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.di */
/* compiled from: PG */
public abstract class C80734di {

    /* renamed from: a */
    public static final C80734di f221620a = m128574f().mo74535a();

    /* renamed from: f */
    public static C80732dg m128574f() {
        C80674bc bcVar = new C80674bc();
        bcVar.f221494a = BuildConfig.FLAVOR;
        bcVar.f221495b = BuildConfig.FLAVOR;
        bcVar.f221497d = 8;
        bcVar.mo74536b(C80831aj.f221751c);
        bcVar.f221496c = BuildConfig.FLAVOR;
        return bcVar;
    }

    /* renamed from: a */
    public abstract C80831aj mo74538a();

    /* renamed from: b */
    public abstract String mo74539b();

    /* renamed from: c */
    public abstract String mo74540c();

    /* renamed from: d */
    public abstract String mo74541d();

    /* renamed from: e */
    public abstract int mo74542e();

    /* renamed from: g */
    public final boolean mo74636g() {
        return !C80831aj.f221751c.equals(mo74538a());
    }
}
