package com.bumptech.glide.load.p297b;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.C6000s;
import com.bumptech.glide.p291h.C5630q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.ay */
/* compiled from: PG */
public final class C5773ay {

    /* renamed from: a */
    private static final C5764ap f17365a = new C5771aw();

    /* renamed from: b */
    private final List f17366b = new ArrayList();

    /* renamed from: c */
    private final Set f17367c = new HashSet();

    /* renamed from: d */
    private final C1971f f17368d;

    public C5773ay(C1971f fVar) {
        this.f17368d = fVar;
    }

    /* renamed from: h */
    private final C5764ap m14931h(C5772ax axVar) {
        C5764ap c = axVar.f17364c.mo11926c(this);
        C5630q.m14607d(c, "Argument must not be null");
        return c;
    }

    /* renamed from: i */
    private final void m14932i(Class cls, Class cls2, C5765aq aqVar, boolean z) {
        C5772ax axVar = new C5772ax(cls, cls2, aqVar);
        List list = this.f17366b;
        list.add(z ? list.size() : 0, axVar);
    }

    /* renamed from: a */
    public final synchronized C5764ap mo12278a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C5772ax axVar : this.f17366b) {
                if (this.f17367c.contains(axVar)) {
                    z = true;
                } else if (axVar.mo12277a(cls, cls2)) {
                    this.f17367c.add(axVar);
                    arrayList.add(m14931h(axVar));
                    this.f17367c.remove(axVar);
                }
            }
            if (arrayList.size() > 1) {
                return new C5770av(arrayList, this.f17368d);
            } else if (arrayList.size() == 1) {
                return (C5764ap) arrayList.get(0);
            } else if (z) {
                return f17365a;
            } else {
                throw new C6000s(cls, cls2);
            }
        } catch (Throwable th) {
            this.f17367c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized List mo12279b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C5772ax axVar : this.f17366b) {
                if (!this.f17367c.contains(axVar) && axVar.f17362a.isAssignableFrom(cls)) {
                    this.f17367c.add(axVar);
                    arrayList.add(m14931h(axVar));
                    this.f17367c.remove(axVar);
                }
            }
        } catch (Throwable th) {
            this.f17367c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized List mo12280c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C5772ax axVar : this.f17366b) {
            if (!arrayList.contains(axVar.f17363b) && axVar.f17362a.isAssignableFrom(cls)) {
                arrayList.add(axVar.f17363b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized List mo12281d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f17366b.iterator();
        while (it.hasNext()) {
            C5772ax axVar = (C5772ax) it.next();
            if (axVar.mo12277a(cls, cls2)) {
                it.remove();
                arrayList.add(axVar.f17364c);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized List mo12282e(Class cls, Class cls2, C5765aq aqVar) {
        List d;
        d = mo12281d(cls, cls2);
        mo12283f(cls, cls2, aqVar);
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo12283f(Class cls, Class cls2, C5765aq aqVar) {
        m14932i(cls, cls2, aqVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo12284g(Class cls, Class cls2, C5765aq aqVar) {
        m14932i(cls, cls2, aqVar, false);
    }
}
