package com.google.android.apps.gsa.store;

import android.util.SparseArray;
import com.google.common.base.C58838bb;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.store.a */
/* compiled from: PG */
public final class C118302a {

    /* renamed from: b */
    private static final Object f328379b = new Object();

    /* renamed from: c */
    private static final SparseArray f328380c = new SparseArray();

    /* renamed from: a */
    public final int f328381a;

    private C118302a(int i) {
        this.f328381a = i;
    }

    /* renamed from: a */
    public static C118302a m196461a(int i) {
        C118302a aVar;
        C58838bb.m90868c(i >= 0);
        synchronized (f328379b) {
            SparseArray sparseArray = f328380c;
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference == null || (aVar = (C118302a) weakReference.get()) == null || aVar.f328381a != i) {
                aVar = new C118302a(i);
                sparseArray.put(i, new WeakReference(aVar));
            }
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C118302a) && this.f328381a == ((C118302a) obj).f328381a;
    }

    public final int hashCode() {
        return this.f328381a;
    }
}
