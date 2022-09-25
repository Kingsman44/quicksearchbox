package com.google.p386ak;

import com.google.p386ak.p388b.C8269a;
import com.google.p386ak.p388b.C8327aa;
import com.google.p386ak.p388b.p389a.C8286ao;
import com.google.p386ak.p388b.p389a.C8318r;
import com.google.p386ak.p388b.p392c.C8358g;
import com.google.p386ak.p393c.C8383a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.j */
/* compiled from: PG */
public final class C8394j {
    /* renamed from: a */
    public static final C8393i m23231a(C8327aa aaVar, C8382c cVar, Map map, List list, List list2, C8409y yVar, C8409y yVar2, LinkedList linkedList) {
        List list3 = list;
        List list4 = list2;
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + 3);
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(list2);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        boolean z = C8358g.f29187a;
        Map map2 = map;
        HashMap hashMap = new HashMap(map);
        new ArrayList(list);
        new ArrayList(list2);
        return new C8393i(aaVar, cVar, hashMap, arrayList, yVar, yVar2, new ArrayList(linkedList));
    }

    /* renamed from: b */
    public static final void m23232b(Type type, Object obj, Map map, List list) {
        Objects.requireNonNull(type);
        boolean z = obj instanceof C8405u;
        boolean z2 = false;
        C8269a.m22981a(z || (obj instanceof C8397m) || (obj instanceof C8395k) || (obj instanceof C8266aa));
        if (obj instanceof C8395k) {
            map.put(type, (C8395k) obj);
        }
        if (z || (obj instanceof C8397m)) {
            C8383a aVar = new C8383a(type);
            if (aVar.f29214b == aVar.f29213a) {
                z2 = true;
            }
            list.add(new C8318r(obj, aVar, z2));
        }
        if (obj instanceof C8266aa) {
            list.add(new C8286ao(new C8383a(type), (C8266aa) obj));
        }
    }
}
