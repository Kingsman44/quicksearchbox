package com.google.android.material.snackbar;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.z */
/* compiled from: PG */
final class C44895z {

    /* renamed from: a */
    final WeakReference f117152a;

    /* renamed from: b */
    int f117153b;

    /* renamed from: c */
    boolean f117154c;

    public C44895z(int i, C44881l lVar) {
        this.f117152a = new WeakReference(lVar);
        this.f117153b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo48395a(C44881l lVar) {
        return lVar != null && this.f117152a.get() == lVar;
    }
}
