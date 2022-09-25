package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.ap */
/* compiled from: PG */
public abstract class C78533ap {

    /* renamed from: a */
    public static final C78533ap f216277a = new C78520ac(false, 1);

    /* renamed from: b */
    public static final C78533ap f216278b = new C78520ac(false, 3);

    /* renamed from: c */
    public static final C78533ap f216279c = new C78520ac(true, 3);

    /* renamed from: d */
    public static final C78533ap f216280d = new C78520ac(false, 2);

    /* renamed from: e */
    public static final C78533ap f216281e = new C78520ac(true, 2);

    /* renamed from: a */
    public abstract boolean mo73441a();

    /* renamed from: b */
    public abstract int mo73442b();

    /* renamed from: c */
    public final boolean mo73470c() {
        int b = mo73442b();
        if (b != 0) {
            return b != 1;
        }
        throw null;
    }

    /* renamed from: d */
    public final int mo73471d() {
        int b = mo73442b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i != 1) {
            return i != 2 ? 1 : 3;
        } else {
            return 2;
        }
    }
}
