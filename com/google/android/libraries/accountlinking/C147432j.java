package com.google.android.libraries.accountlinking;

import com.google.android.libraries.accountlinking.p10981d.C147422b;

/* renamed from: com.google.android.libraries.accountlinking.j */
/* compiled from: PG */
public final class C147432j extends Exception {

    /* renamed from: a */
    public final int f397975a;

    public C147432j(int i, String str, Throwable th) {
        super(str, th);
        this.f397975a = i;
    }

    /* renamed from: a */
    public static C147432j m240358a(Throwable th) {
        Throwable a = C147422b.m240341a(th);
        if (a instanceof C147432j) {
            return (C147432j) a;
        }
        return new C147432j(1, "Unknown error", a);
    }
}
