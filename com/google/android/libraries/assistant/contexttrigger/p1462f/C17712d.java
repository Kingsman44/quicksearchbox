package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.d */
/* compiled from: PG */
public final class C17712d {

    /* renamed from: a */
    public final C48892ag f50910a;

    public C17712d(C48892ag agVar) {
        this.f50910a = agVar;
    }

    /* renamed from: b */
    private final C48922x m34992b(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Collection.EL.stream(list).forEach(new C17710b(this, arrayList));
        if (z) {
            if (arrayList.contains(C48922x.UNKNOWN)) {
                return C48922x.UNKNOWN;
            }
            return Collection.EL.stream(arrayList).allMatch(C17711c.f50909a) ? C48922x.ACTIVE : C48922x.NOT_ACTIVE;
        } else if (arrayList.contains(C48922x.ACTIVE)) {
            return C48922x.ACTIVE;
        } else {
            return arrayList.contains(C48922x.UNKNOWN) ? C48922x.UNKNOWN : C48922x.NOT_ACTIVE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3803ag.p3807b.p3808a.C48922x mo23445a(com.google.assistant.p3803ag.p3807b.p3808a.C48897al r5) {
        /*
            r4 = this;
            int r0 = r5.f126529b
            int r1 = com.google.assistant.p3803ag.p3807b.p3808a.C48894ai.m85298a(r0)
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x00a0
            r1 = 1
            if (r2 == 0) goto L_0x0090
            r3 = 2
            if (r2 == r1) goto L_0x007f
            r1 = 3
            if (r2 == r3) goto L_0x005b
            if (r2 == r1) goto L_0x0018
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.UNKNOWN
            return r5
        L_0x0018:
            com.google.assistant.ag.b.a.ag r1 = r4.f50910a
            java.lang.String r2 = ""
            r3 = 4
            if (r0 != r3) goto L_0x0024
            java.lang.Object r0 = r5.f126530c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            boolean r0 = r1.mo53191d(r0)
            java.lang.String r1 = "Invalid sub trigger id."
            com.google.common.base.C58838bb.m90869d(r0, r1)
            com.google.assistant.ag.b.a.ag r0 = r4.f50910a
            int r1 = r5.f126529b
            if (r1 != r3) goto L_0x0039
            java.lang.Object r5 = r5.f126530c
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
        L_0x0039:
            r2.getClass()
            com.google.protobuf.dn r5 = r0.f126521b
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0055
            java.lang.Object r5 = r5.get(r2)
            com.google.assistant.ag.b.a.ac r5 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r5
            int r5 = r5.f126513e
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.m85306a(r5)
            if (r5 != 0) goto L_0x0054
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.UNKNOWN
        L_0x0054:
            return r5
        L_0x0055:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L_0x005b:
            if (r0 != r1) goto L_0x0062
            java.lang.Object r5 = r5.f126530c
            com.google.assistant.ag.b.a.al r5 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r5
            goto L_0x0064
        L_0x0062:
            com.google.assistant.ag.b.a.al r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
        L_0x0064:
            com.google.assistant.ag.b.a.x r5 = r4.mo23445a(r5)
            com.google.assistant.ag.b.a.x r0 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.UNKNOWN
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0071
            return r5
        L_0x0071:
            com.google.assistant.ag.b.a.x r0 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.ACTIVE
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x007c
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.NOT_ACTIVE
            goto L_0x007e
        L_0x007c:
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.ACTIVE
        L_0x007e:
            return r5
        L_0x007f:
            if (r0 != r3) goto L_0x0086
            java.lang.Object r5 = r5.f126530c
            com.google.assistant.ag.b.a.ak r5 = (com.google.assistant.p3803ag.p3807b.p3808a.C48896ak) r5
            goto L_0x0088
        L_0x0086:
            com.google.assistant.ag.b.a.ak r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48896ak.f126523b
        L_0x0088:
            com.google.protobuf.cq r5 = r5.f126525a
            r0 = 0
            com.google.assistant.ag.b.a.x r5 = r4.m34992b(r5, r0)
            return r5
        L_0x0090:
            if (r0 != r1) goto L_0x0097
            java.lang.Object r5 = r5.f126530c
            com.google.assistant.ag.b.a.ak r5 = (com.google.assistant.p3803ag.p3807b.p3808a.C48896ak) r5
            goto L_0x0099
        L_0x0097:
            com.google.assistant.ag.b.a.ak r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48896ak.f126523b
        L_0x0099:
            com.google.protobuf.cq r5 = r5.f126525a
            com.google.assistant.ag.b.a.x r5 = r4.m34992b(r5, r1)
            return r5
        L_0x00a0:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1462f.C17712d.mo23445a(com.google.assistant.ag.b.a.al):com.google.assistant.ag.b.a.x");
    }
}
