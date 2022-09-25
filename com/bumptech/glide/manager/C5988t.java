package com.bumptech.glide.manager;

import com.bumptech.glide.p287f.C5588e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.t */
/* compiled from: PG */
public final class C5988t {

    /* renamed from: a */
    public final Set f17658a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f17659b = new HashSet();

    /* renamed from: c */
    public boolean f17660c;

    /* renamed from: a */
    public final boolean mo12430a(C5588e eVar) {
        boolean z = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.f17658a.remove(eVar);
        if (!this.f17659b.remove(eVar) && !remove) {
            z = false;
        }
        if (z) {
            eVar.mo12015c();
        }
        return z;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.f17658a.size();
        boolean z = this.f17660c;
        return obj + "{numRequests=" + size + ", isPaused=" + z + "}";
    }
}
