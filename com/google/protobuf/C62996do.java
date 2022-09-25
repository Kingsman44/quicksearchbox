package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.do */
/* compiled from: PG */
final class C62996do {
    /* renamed from: a */
    public static final int m95604a(int i, Object obj, Object obj2) {
        C62995dn dnVar = (C62995dn) obj;
        C62994dm dmVar = (C62994dm) obj2;
        int i2 = 0;
        if (!dnVar.isEmpty()) {
            for (Map.Entry entry : dnVar.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                int M = C62906an.m95320M(i);
                int a = C62994dm.m95599a(dmVar.f170056a, key, value);
                i2 += M + C62906an.m95321N(a) + a;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final boolean m95605b(Object obj) {
        return !((C62995dn) obj).f170058b;
    }

    /* renamed from: c */
    public static final Object m95606c(Object obj, Object obj2) {
        C62995dn dnVar = (C62995dn) obj;
        C62995dn dnVar2 = (C62995dn) obj2;
        if (!dnVar2.isEmpty()) {
            if (!dnVar.f170058b) {
                dnVar = dnVar.mo58980a();
            }
            dnVar.mo58981b();
            if (!dnVar2.isEmpty()) {
                dnVar.putAll(dnVar2);
            }
        }
        return dnVar;
    }
}
