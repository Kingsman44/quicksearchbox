package com.google.android.apps.gsa.search.shared.actions;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.i */
/* compiled from: PG */
public final class C87421i {

    /* renamed from: a */
    public static final C87421i f236079a = new C87421i(1, 0);

    /* renamed from: b */
    public static final C87421i f236080b = new C87421i(2, 0);

    /* renamed from: c */
    public static final C87421i f236081c = new C87421i(3, 1);

    /* renamed from: d */
    public final int f236082d;

    /* renamed from: e */
    public final int f236083e;

    private C87421i(int i, int i2) {
        this.f236082d = i;
        this.f236083e = i2;
    }

    /* renamed from: a */
    public static C87421i m141588a(int i) {
        return new C87421i(3, i);
    }

    /* renamed from: b */
    public final boolean mo81197b() {
        return this.f236082d == 3;
    }

    /* renamed from: c */
    public final boolean mo81198c() {
        return this.f236082d == 1;
    }

    /* renamed from: d */
    public final boolean mo81199d() {
        return this.f236082d == 2;
    }

    public final String toString() {
        int i = this.f236082d;
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "uncertain";
        }
        int i2 = this.f236083e;
        return "error(" + i2 + ")";
    }
}
