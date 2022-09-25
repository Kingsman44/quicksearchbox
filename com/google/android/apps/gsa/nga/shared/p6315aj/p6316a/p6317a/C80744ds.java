package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ds */
/* compiled from: PG */
public abstract class C80744ds {

    /* renamed from: a */
    public static final C80744ds f221642a = m128602d().mo74546a();

    /* renamed from: d */
    public static C80737dl m128602d() {
        C80676be beVar = new C80676be();
        beVar.f221504a = C80740do.f221632a;
        beVar.f221505b = C80738dm.f221625a;
        beVar.f221506c = C80742dq.f221641a;
        return beVar;
    }

    /* renamed from: a */
    public abstract C80738dm mo74547a();

    /* renamed from: b */
    public abstract C80740do mo74548b();

    /* renamed from: c */
    public abstract C80742dq mo74549c();

    /* renamed from: e */
    public final boolean mo74651e() {
        if (!mo74547a().mo74638b().equals(C80739dn.EMPTY)) {
            return true;
        }
        return mo74547a().mo74640d().mo74632e();
    }

    /* renamed from: f */
    public final boolean mo74652f() {
        return mo74653g() || mo74651e() || mo74654h();
    }

    /* renamed from: g */
    public final boolean mo74653g() {
        if (!mo74548b().mo74643a().equals(C80741dp.EMPTY)) {
            return true;
        }
        return mo74548b().mo74645c().mo74632e();
    }

    /* renamed from: h */
    public final boolean mo74654h() {
        int b = mo74549c().mo74394b();
        if (b == 0) {
            throw null;
        } else if (b != 1) {
            return true;
        } else {
            return mo74549c().mo74399a().mo74632e();
        }
    }
}
