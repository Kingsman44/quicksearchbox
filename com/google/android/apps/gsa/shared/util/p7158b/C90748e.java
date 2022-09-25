package com.google.android.apps.gsa.shared.util.p7158b;

import android.os.Looper;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.b.e */
/* compiled from: PG */
public final class C90748e {

    /* renamed from: a */
    public static final C59071e f253822a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.b.e");

    /* renamed from: a */
    public static C90747d m148223a(boolean z) {
        return z ? new C90746c() : new C90747d();
    }

    /* renamed from: b */
    public static void m148224b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("checkNotMainThread failed");
        }
    }

    /* renamed from: c */
    public static void m148225c(Iterable iterable) {
        for (Object obj : iterable) {
            obj.getClass();
        }
    }
}
