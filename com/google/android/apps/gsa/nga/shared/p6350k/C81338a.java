package com.google.android.apps.gsa.nga.shared.p6350k;

/* renamed from: com.google.android.apps.gsa.nga.shared.k.a */
/* compiled from: PG */
public final class C81338a extends Exception {

    /* renamed from: a */
    public final int f222622a;

    private C81338a(int i, String str) {
        super(str, (Throwable) null);
        this.f222622a = i;
    }

    /* renamed from: a */
    public static C81338a m129378a(int i) {
        return new C81338a(i, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "ONBOARDING_UNSUCCESSFUL" : "NO_INFORMATION_ABOUT_SUPPORTED_ACTIONS" : "FETCHING_ACTIONS_FAILED" : "APP_NOT_SUPPORTED" : "ACTION_NOT_SUPPORTED" : "UNKNOWN");
    }
}
