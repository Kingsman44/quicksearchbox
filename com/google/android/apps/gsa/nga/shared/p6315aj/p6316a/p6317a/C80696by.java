package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.by */
/* compiled from: PG */
public abstract class C80696by {

    /* renamed from: a */
    public static final C80696by f221559a = m128473d().mo74424a();

    /* renamed from: d */
    public static C80694bw m128473d() {
        C80656al alVar = new C80656al();
        alVar.f221414a = BuildConfig.FLAVOR;
        alVar.mo74425b(C80831aj.f221751c);
        alVar.f221415b = 5;
        return alVar;
    }

    /* renamed from: a */
    public abstract C80831aj mo74427a();

    /* renamed from: b */
    public abstract String mo74428b();

    /* renamed from: c */
    public abstract int mo74429c();

    /* renamed from: e */
    public final boolean mo74630e() {
        return !C80831aj.f221751c.equals(mo74427a());
    }
}
