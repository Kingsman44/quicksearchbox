package com.google.android.apps.gsa.proactive;

import com.google.android.apps.gsa.shared.util.C90736at;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.proactive.f */
/* compiled from: PG */
public final class C84170f {

    /* renamed from: a */
    private final ConcurrentHashMap f229118a = new ConcurrentHashMap();

    /* renamed from: a */
    public final Set mo77631a() {
        HashSet hashSet = new HashSet(this.f229118a.size());
        Iterator it = this.f229118a.keySet().iterator();
        while (it.hasNext()) {
            Object obj = ((WeakReference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo77632b(Object obj) {
        this.f229118a.put(new WeakReference(obj), Boolean.TRUE);
    }

    /* renamed from: c */
    public final void mo77633c(C90736at atVar) {
        for (Object a : mo77631a()) {
            atVar.mo17700a(a);
        }
    }

    /* renamed from: d */
    public final void mo77634d(Object obj) {
        Iterator it = this.f229118a.keySet().iterator();
        while (it.hasNext()) {
            Object obj2 = ((WeakReference) it.next()).get();
            if (obj2 == null || obj.equals(obj2)) {
                it.remove();
            }
        }
    }
}
