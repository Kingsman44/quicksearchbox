package com.google.android.libraries.assistant.p1484g.p1502d;

import android.util.SparseArray;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.libraries.assistant.g.d.v */
/* compiled from: PG */
public final class C18185v {

    /* renamed from: a */
    public final SparseArray f51680a = new SparseArray();

    /* renamed from: b */
    public C18155ag f51681b = null;

    /* renamed from: a */
    public final C18164ap mo23651a(int i) {
        WeakReference weakReference = (WeakReference) this.f51680a.get(i);
        if (weakReference == null) {
            return null;
        }
        C18164ap apVar = (C18164ap) weakReference.get();
        if (apVar == null) {
            this.f51680a.remove(i);
        }
        return apVar;
    }
}
