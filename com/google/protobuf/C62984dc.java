package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.dc */
/* compiled from: PG */
final class C62984dc extends C62986de {

    /* renamed from: c */
    private static final Class f170040c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.da} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.da} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.da} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m95577d(java.lang.Object r3, long r4, int r6) {
        /*
            com.google.protobuf.fr r0 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r0 = r0.mo59138p(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0033
            boolean r1 = r0 instanceof com.google.protobuf.C62983db
            if (r1 == 0) goto L_0x0018
            com.google.protobuf.da r0 = new com.google.protobuf.da
            r0.<init>((int) r6)
            goto L_0x002d
        L_0x0018:
            boolean r1 = r0 instanceof com.google.protobuf.C63011ec
            if (r1 == 0) goto L_0x0028
            boolean r1 = r0 instanceof com.google.protobuf.C62971cq
            if (r1 == 0) goto L_0x0028
            com.google.protobuf.cq r0 = (com.google.protobuf.C62971cq) r0
            com.google.protobuf.cq r6 = r0.mo58798e(r6)
            r0 = r6
            goto L_0x002d
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002d:
            com.google.protobuf.fr r6 = com.google.protobuf.C63054fs.f170169a
            r6.mo59141s(r3, r4, r0)
            goto L_0x0091
        L_0x0033:
            java.lang.Class r1 = f170040c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0053
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.protobuf.fr r6 = com.google.protobuf.C63054fs.f170169a
            r6.mo59141s(r3, r4, r1)
        L_0x0051:
            r0 = r1
            goto L_0x0091
        L_0x0053:
            boolean r1 = r0 instanceof com.google.protobuf.C63049fn
            if (r1 == 0) goto L_0x0070
            com.google.protobuf.da r1 = new com.google.protobuf.da
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.protobuf.fn r0 = (com.google.protobuf.C63049fn) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.protobuf.fr r6 = com.google.protobuf.C63054fs.f170169a
            r6.mo59141s(r3, r4, r1)
            goto L_0x0051
        L_0x0070:
            boolean r1 = r0 instanceof com.google.protobuf.C63011ec
            if (r1 == 0) goto L_0x0091
            boolean r1 = r0 instanceof com.google.protobuf.C62971cq
            if (r1 == 0) goto L_0x0091
            r1 = r0
            com.google.protobuf.cq r1 = (com.google.protobuf.C62971cq) r1
            boolean r2 = r1.mo58948c()
            if (r2 == 0) goto L_0x0082
            goto L_0x0091
        L_0x0082:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.protobuf.cq r6 = r1.mo58798e(r0)
            com.google.protobuf.fr r0 = com.google.protobuf.C63054fs.f170169a
            r0.mo59141s(r3, r4, r6)
            return r6
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62984dc.m95577d(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: a */
    public final List mo58971a(Object obj, long j) {
        return m95577d(obj, j, 10);
    }

    /* renamed from: b */
    public final void mo58972b(Object obj, long j) {
        Object obj2;
        List list = (List) C63054fs.f170169a.mo59138p(obj, j);
        if (list instanceof C62983db) {
            obj2 = ((C62983db) list).mo58964d();
        } else if (!f170040c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C63011ec) || !(list instanceof C62971cq)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C62971cq cqVar = (C62971cq) list;
                if (cqVar.mo58948c()) {
                    cqVar.mo58947b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C63054fs.f170169a.mo59141s(obj, j, obj2);
    }

    /* renamed from: c */
    public final void mo58973c(Object obj, Object obj2, long j) {
        List list = (List) C63054fs.f170169a.mo59138p(obj2, j);
        List d = m95577d(obj, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        C63054fs.f170169a.mo59141s(obj, j, list);
    }
}
