package com.bumptech.glide.p286e;

import com.bumptech.glide.load.C5962u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.e.g */
/* compiled from: PG */
public final class C5554g {

    /* renamed from: a */
    private final List f16808a = new ArrayList();

    /* renamed from: b */
    private final Map f16809b = new HashMap();

    /* renamed from: f */
    private final synchronized List m14340f(String str) {
        if (!this.f16808a.contains(str)) {
            this.f16808a.add(str);
        }
        List list = (List) this.f16809b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f16809b.put(str, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized List mo11941a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f16808a) {
            List<C5553f> list = (List) this.f16809b.get(str);
            if (list != null) {
                for (C5553f fVar : list) {
                    if (fVar.mo11940a(cls, cls2)) {
                        arrayList.add(fVar.f16806b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized List mo11942b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f16808a) {
            List<C5553f> list = (List) this.f16809b.get(str);
            if (list != null) {
                for (C5553f fVar : list) {
                    if (fVar.mo11940a(cls, cls2) && !arrayList.contains(fVar.f16805a)) {
                        arrayList.add(fVar.f16805a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized void mo11943c(String str, C5962u uVar, Class cls, Class cls2) {
        m14340f(str).add(new C5553f(cls, cls2, uVar));
    }

    /* renamed from: d */
    public final synchronized void mo11944d(List list) {
        ArrayList arrayList = new ArrayList(this.f16808a);
        this.f16808a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f16808a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.f16808a.add(str);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo11945e(C5962u uVar, Class cls, Class cls2) {
        m14340f("legacy_prepend_all").add(0, new C5553f(cls, cls2, uVar));
    }
}
