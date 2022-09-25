package com.facebook.p313c;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.c.v */
/* compiled from: PG */
public abstract class C6063v implements Cloneable {

    /* renamed from: b */
    public Map f17837b;

    /* renamed from: c */
    public List f17838c;

    /* renamed from: d */
    public Map f17839d;

    /* renamed from: e */
    public List f17840e;

    public C6063v() {
        List<C6062u> emptyList = Collections.emptyList();
        List<C6062u> emptyList2 = Collections.emptyList();
        for (C6062u e : emptyList) {
            mo12659e(e);
        }
        for (C6062u d : emptyList2) {
            mo12658d(d);
        }
    }

    /* renamed from: c */
    public static int m15630c(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    /* renamed from: f */
    public static void m15631f(List list, List list2, Map map, Object obj, Object obj2, List list3, List list4) {
        if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 == null || list2.isEmpty()) {
            list4.addAll(list);
        } else {
            HashMap hashMap = new HashMap(list2.size());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C6062u uVar = (C6062u) it.next();
                Class<?> cls = uVar.f17836b.getClass();
                C6062u uVar2 = (C6062u) map.get(cls);
                if (uVar2 == null) {
                    list3.add(uVar);
                } else {
                    boolean a = uVar.f17836b.mo12653a(uVar2.f17835a, uVar.f17835a, obj, obj2);
                    hashMap.put(cls, Boolean.valueOf(a));
                    if (a) {
                        list3.add(uVar);
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C6062u uVar3 = (C6062u) it2.next();
                Class<?> cls2 = uVar3.f17836b.getClass();
                if (!hashMap.containsKey(cls2) || ((Boolean) hashMap.get(cls2)).booleanValue()) {
                    list4.add(uVar3);
                }
            }
        }
    }

    /* renamed from: g */
    public static void m15632g(List list, Object obj) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6062u uVar = (C6062u) it.next();
                uVar.f17836b.mo12654b(obj, uVar.f17835a);
            }
        }
    }

    /* renamed from: h */
    public static void m15633h(List list, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C6062u uVar = (C6062u) list.get(size);
                    uVar.f17836b.mo12655c(obj, uVar.f17835a);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private static void m15634i(Map map, List list, C6062u uVar) {
        if (((C6062u) map.put(uVar.f17836b.getClass(), uVar)) != null) {
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    throw new IllegalStateException("Extension Map and Extension List out of sync!");
                }
            } while (((C6062u) list.get(size)).f17836b.getClass() != uVar.f17836b.getClass());
            list.remove(size);
        }
        list.add(uVar);
    }

    /* renamed from: a */
    public abstract Object mo12656a(Context context);

    /* renamed from: b */
    public Object mo12657b() {
        throw null;
    }

    /* renamed from: d */
    public final void mo12658d(C6062u uVar) {
        if (this.f17840e == null) {
            this.f17840e = new ArrayList();
            if (this.f17839d == null) {
                this.f17839d = new HashMap();
            } else {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
        }
        m15634i(this.f17839d, this.f17840e, uVar);
    }

    /* renamed from: e */
    public final void mo12659e(C6062u uVar) {
        if (this.f17838c == null) {
            this.f17838c = new ArrayList();
            if (this.f17837b == null) {
                this.f17837b = new HashMap();
            } else {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
        }
        m15634i(this.f17837b, this.f17838c, uVar);
    }
}
