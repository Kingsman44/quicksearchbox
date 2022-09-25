package com.facebook.litho;

import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.litho.bs */
/* compiled from: PG */
public final class C6138bs {

    /* renamed from: a */
    public Object f18160a;

    /* renamed from: b */
    public final Set f18161b = new HashSet();

    public C6138bs(Object obj) {
        this.f18160a = obj;
    }

    /* renamed from: a */
    public final void mo13118a(Object obj) {
        Object obj2 = this.f18160a;
        if (obj2 == obj) {
            return;
        }
        if (obj2 == null || !obj2.equals(obj)) {
            this.f18160a = obj;
            for (C6137br brVar : this.f18161b) {
                for (C6407q qVar : (Set) brVar.f18157a.get(this)) {
                    Object obj3 = brVar.f18158b.get(qVar);
                    if (C6137br.m16186c(qVar)) {
                        SparseArray g = qVar.mo13144g();
                        for (int i = 0; i < g.size(); i++) {
                            if (g.valueAt(i) == this) {
                                C6137br.m16187d(g.keyAt(i), this, (View) obj3);
                            }
                        }
                    }
                    int length = C6407q.f18982h.length;
                }
            }
        }
    }
}
