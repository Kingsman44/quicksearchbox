package com.google.android.libraries.gsa.p1876k;

import androidx.annotation.C0825a;
import androidx.annotation.C0826b;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4543n.p4547d.C59418a;
import java.util.ArrayDeque;
import java.util.HashSet;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.gsa.k.a */
/* compiled from: PG */
final class C22846a {

    /* renamed from: a */
    private static final C58528ij f62906a = C58528ij.m90011K(C0825a.class, C0826b.class);

    /* renamed from: b */
    private final ConcurrentHashMap f62907b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C58528ij mo28198a(Class cls) {
        C59418a aVar;
        if (cls == null) {
            return C58733pz.f156496a;
        }
        ConcurrentHashMap concurrentHashMap = this.f62907b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(cls);
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.remove();
                C58528ij ijVar = f62906a;
                if (!ijVar.contains(cls2)) {
                    ijVar = C58733pz.f156496a;
                }
                if (cls2.isAnnotationPresent(C59418a.class) && (aVar = (C59418a) cls2.getAnnotation(C59418a.class)) != null) {
                    Class[] a = aVar.mo56929a();
                    C58526ih ihVar = new C58526ih();
                    ihVar.mo55489i(ijVar);
                    ihVar.mo55488h(a);
                    ijVar = ihVar.mo55486f();
                }
                C58800sl lA = ijVar.iterator();
                while (lA.hasNext()) {
                    Object next = lA.next();
                    if (hashSet.add(next)) {
                        arrayDeque.add(next);
                    }
                }
            }
            obj = C58528ij.m90006F(hashSet);
            concurrentHashMap.put(cls, obj);
        }
        return (C58528ij) obj;
    }
}
