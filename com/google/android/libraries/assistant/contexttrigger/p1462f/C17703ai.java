package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3803ag.p3807b.p3808a.C48889ad;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.ai */
/* compiled from: PG */
public final class C17703ai {

    /* renamed from: a */
    public final C42876ab f50900a;

    /* renamed from: b */
    public final Executor f50901b;

    /* renamed from: c */
    public final C17717i f50902c;

    /* renamed from: d */
    public final C21370a f50903d;

    /* renamed from: e */
    public final C17658d f50904e;

    public C17703ai(C42876ab abVar, Executor executor, C17717i iVar, C17658d dVar, C21370a aVar) {
        this.f50900a = abVar;
        this.f50901b = executor;
        this.f50902c = iVar;
        this.f50904e = dVar;
        this.f50903d = aVar;
    }

    /* renamed from: c */
    private static void m34984c(List list, C48889ad adVar, C58490gz gzVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m34983b((C48897al) it.next(), adVar, gzVar);
        }
    }

    /* renamed from: a */
    public final C60870cx mo23444a(Function function) {
        C58976aa aaVar = C58975e.f156826a;
        C42876ab abVar = this.f50900a;
        Objects.requireNonNull(function);
        return abVar.mo46039a(new C17700af(function), this.f50901b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34983b(com.google.assistant.p3803ag.p3807b.p3808a.C48897al r6, com.google.assistant.p3803ag.p3807b.p3808a.C48889ad r7, com.google.common.p4522b.C58490gz r8) {
        /*
            int r0 = r6.f126529b
            int r1 = com.google.assistant.p3803ag.p3807b.p3808a.C48894ai.m85298a(r0)
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x0093
            r1 = 1
            if (r2 == 0) goto L_0x0084
            r3 = 2
            if (r2 == r1) goto L_0x0075
            r1 = 3
            if (r2 == r3) goto L_0x0068
            if (r2 == r1) goto L_0x0016
            return
        L_0x0016:
            java.lang.String r1 = ""
            r2 = 4
            if (r0 != r2) goto L_0x0022
            java.lang.Object r0 = r6.f126530c
            java.lang.String r0 = (java.lang.String) r0
            r3 = r0
            r0 = 4
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            if (r0 != r2) goto L_0x002a
            java.lang.Object r0 = r6.f126530c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            r0.getClass()
            com.google.protobuf.bv r4 = r7.instance
            com.google.assistant.ag.b.a.ag r4 = (com.google.assistant.p3803ag.p3807b.p3808a.C48892ag) r4
            com.google.protobuf.dn r4 = r4.f126521b
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            boolean r5 = r4.containsKey(r0)
            if (r5 == 0) goto L_0x0062
            java.lang.Object r0 = r4.get(r0)
            com.google.assistant.ag.b.a.ac r0 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r0
            r8.mo55429h(r3, r0)
            int r8 = r6.f126529b
            if (r8 != r2) goto L_0x0050
            java.lang.Object r6 = r6.f126530c
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
        L_0x0050:
            r1.getClass()
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.assistant.ag.b.a.ag r6 = (com.google.assistant.p3803ag.p3807b.p3808a.C48892ag) r6
            com.google.protobuf.dn r6 = r6.mo53190c()
            r6.remove(r1)
            return
        L_0x0062:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L_0x0068:
            if (r0 != r1) goto L_0x006f
            java.lang.Object r6 = r6.f126530c
            com.google.assistant.ag.b.a.al r6 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r6
            goto L_0x0071
        L_0x006f:
            com.google.assistant.ag.b.a.al r6 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
        L_0x0071:
            m34983b(r6, r7, r8)
            return
        L_0x0075:
            if (r0 != r3) goto L_0x007c
            java.lang.Object r6 = r6.f126530c
            com.google.assistant.ag.b.a.ak r6 = (com.google.assistant.p3803ag.p3807b.p3808a.C48896ak) r6
            goto L_0x007e
        L_0x007c:
            com.google.assistant.ag.b.a.ak r6 = com.google.assistant.p3803ag.p3807b.p3808a.C48896ak.f126523b
        L_0x007e:
            com.google.protobuf.cq r6 = r6.f126525a
            m34984c(r6, r7, r8)
            return
        L_0x0084:
            if (r0 != r1) goto L_0x008b
            java.lang.Object r6 = r6.f126530c
            com.google.assistant.ag.b.a.ak r6 = (com.google.assistant.p3803ag.p3807b.p3808a.C48896ak) r6
            goto L_0x008d
        L_0x008b:
            com.google.assistant.ag.b.a.ak r6 = com.google.assistant.p3803ag.p3807b.p3808a.C48896ak.f126523b
        L_0x008d:
            com.google.protobuf.cq r6 = r6.f126525a
            m34984c(r6, r7, r8)
            return
        L_0x0093:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1462f.C17703ai.m34983b(com.google.assistant.ag.b.a.al, com.google.assistant.ag.b.a.ad, com.google.common.b.gz):void");
    }
}
