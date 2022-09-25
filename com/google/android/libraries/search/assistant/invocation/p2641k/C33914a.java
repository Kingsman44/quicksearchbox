package com.google.android.libraries.search.assistant.invocation.p2641k;

import java.util.ArrayList;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.a */
/* compiled from: PG */
public final class C33914a {
    /* renamed from: a */
    public static final String m62566a(Object obj) {
        String hexString = Integer.toHexString(obj != null ? obj.hashCode() : 0);
        C69664n.m101060f(hexString, "toHexString(hashCode())");
        return hexString;
    }

    /* renamed from: b */
    public static final String m62567b(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
        for (Object c : iterable) {
            arrayList.add(m62568c(c));
        }
        return arrayList.toString();
    }

    /* renamed from: c */
    public static final String m62568c(Object obj) {
        C69664n.m101061g(obj, "<this>");
        C69664n.m101061g(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        C69664n.m101060f(simpleName, "javaClass.simpleName");
        String a = m62566a(obj);
        return simpleName + "@" + a;
    }
}
