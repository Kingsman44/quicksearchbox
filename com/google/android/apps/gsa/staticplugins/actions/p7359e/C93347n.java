package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.res.Resources;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.n */
/* compiled from: PG */
class C93347n implements C93358y {

    /* renamed from: a */
    private final C93333aa f260340a;

    /* renamed from: b */
    private final C93333aa f260341b;

    /* renamed from: c */
    private final int[] f260342c;

    public C93347n(C93333aa aaVar, C93333aa aaVar2, int[] iArr) {
        this.f260340a = aaVar;
        this.f260341b = aaVar2;
        this.f260342c = iArr;
    }

    /* renamed from: a */
    public final int mo87641a() {
        return 0;
    }

    /* renamed from: b */
    public final C93333aa mo87642b() {
        return this.f260340a;
    }

    /* renamed from: c */
    public final C93333aa mo87643c() {
        return this.f260341b;
    }

    /* renamed from: d */
    public final Object[] mo87644d(Resources resources) {
        String[] strArr = new String[2];
        for (int i = 0; i < 2; i++) {
            strArr[i] = resources.getString(this.f260342c[i]);
        }
        return strArr;
    }
}
