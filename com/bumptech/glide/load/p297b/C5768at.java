package com.bumptech.glide.load.p297b;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.C6000s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.at */
/* compiled from: PG */
public final class C5768at {

    /* renamed from: a */
    private final C5773ay f17351a;

    /* renamed from: b */
    private final C5767as f17352b = new C5767as();

    public C5768at(C1971f fVar) {
        C5773ay ayVar = new C5773ay(fVar);
        this.f17351a = ayVar;
    }

    /* renamed from: f */
    private final synchronized List m14912f(Class cls) {
        List list;
        C5766ar arVar = (C5766ar) this.f17352b.f17350a.get(cls);
        if (arVar == null) {
            list = null;
        } else {
            list = arVar.f17349a;
        }
        if (list != null) {
            return list;
        }
        List unmodifiableList = Collections.unmodifiableList(this.f17351a.mo12279b(cls));
        if (((C5766ar) this.f17352b.f17350a.put(cls, new C5766ar(unmodifiableList))) == null) {
            return unmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    /* renamed from: a */
    public final synchronized List mo12271a(Class cls) {
        return this.f17351a.mo12280c(cls);
    }

    /* renamed from: b */
    public final List mo12272b(Object obj) {
        List f = m14912f(obj.getClass());
        if (!f.isEmpty()) {
            int size = f.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C5764ap apVar = (C5764ap) f.get(i);
                if (apVar.mo11929b(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                    }
                    emptyList.add(apVar);
                    z = false;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C6000s(obj, f);
        }
        throw new C6000s(obj);
    }

    /* renamed from: c */
    public final synchronized void mo12273c(Class cls, Class cls2, C5765aq aqVar) {
        this.f17351a.mo12283f(cls, cls2, aqVar);
        this.f17352b.mo12270a();
    }

    /* renamed from: d */
    public final synchronized void mo12274d(Class cls, Class cls2, C5765aq aqVar) {
        this.f17351a.mo12284g(cls, cls2, aqVar);
        this.f17352b.mo12270a();
    }

    /* renamed from: e */
    public final synchronized void mo12275e(Class cls, Class cls2, C5765aq aqVar) {
        for (C5765aq f : this.f17351a.mo12282e(cls, cls2, aqVar)) {
            f.mo11927f();
        }
        this.f17352b.mo12270a();
    }
}
