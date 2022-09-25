package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.b */
/* compiled from: PG */
public final /* synthetic */ class C128154b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C128158f f352556a;

    /* renamed from: b */
    public final /* synthetic */ C81237ab f352557b;

    public /* synthetic */ C128154b(C128158f fVar, C81237ab abVar) {
        this.f352556a = fVar;
        this.f352557b = abVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3 != 2) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.f r1 = r0.f352556a
            com.google.android.apps.gsa.nga.shared.h.ab r2 = r0.f352557b
            r3 = r17
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j) r3
            com.google.protobuf.bn r4 = r3.toBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.h r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128218h) r4
            int r3 = r3.f352702b
            java.lang.String r5 = ":lockscreen"
            java.lang.String r6 = ":homescreen"
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0020
            if (r3 == r8) goto L_0x0020
            if (r3 == r7) goto L_0x00b4
            goto L_0x015f
        L_0x0020:
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j.f352699e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.h r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128218h) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j) r4
            int r9 = r4.f352701a
            r9 = r9 | r8
            r4.f352701a = r9
            r4.f352702b = r7
            com.google.common.v.i r1 = r1.f352562b
            j$.time.Instant r1 = r1.mo57444a()
            com.google.android.apps.gsa.nga.shared.h.ca r4 = r2.f222383b
            if (r4 != 0) goto L_0x0042
            com.google.android.apps.gsa.nga.shared.h.ca r4 = com.google.android.apps.gsa.nga.shared.p6345h.C81297ca.f222540b
        L_0x0042:
            com.google.protobuf.cq r4 = r4.f222542a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0059
            com.google.android.apps.gsa.nga.shared.h.ca r4 = r2.f222383b
            if (r4 != 0) goto L_0x0050
            com.google.android.apps.gsa.nga.shared.h.ca r4 = com.google.android.apps.gsa.nga.shared.p6345h.C81297ca.f222540b
        L_0x0050:
            com.google.protobuf.cq r4 = r4.f222542a
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e r4 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128158f.m209256a(r4, r1)
            r3.mo108368b(r6, r4)
        L_0x0059:
            com.google.android.apps.gsa.nga.shared.h.ca r4 = r2.f222387f
            if (r4 != 0) goto L_0x005f
            com.google.android.apps.gsa.nga.shared.h.ca r4 = com.google.android.apps.gsa.nga.shared.p6345h.C81297ca.f222540b
        L_0x005f:
            com.google.protobuf.cq r4 = r4.f222542a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0076
            com.google.android.apps.gsa.nga.shared.h.ca r4 = r2.f222387f
            if (r4 != 0) goto L_0x006d
            com.google.android.apps.gsa.nga.shared.h.ca r4 = com.google.android.apps.gsa.nga.shared.p6345h.C81297ca.f222540b
        L_0x006d:
            com.google.protobuf.cq r4 = r4.f222542a
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e r4 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128158f.m209256a(r4, r1)
            r3.mo108368b(r5, r4)
        L_0x0076:
            com.google.protobuf.dn r4 = r2.f222384c
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0084:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00b3
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.apps.gsa.nga.shared.h.ca r10 = com.google.android.apps.gsa.nga.shared.p6345h.C81297ca.f222540b
            r9.getClass()
            com.google.protobuf.dn r11 = r2.f222384c
            boolean r12 = r11.containsKey(r9)
            if (r12 == 0) goto L_0x00a3
            java.lang.Object r10 = r11.get(r9)
            com.google.android.apps.gsa.nga.shared.h.ca r10 = (com.google.android.apps.gsa.nga.shared.p6345h.C81297ca) r10
        L_0x00a3:
            com.google.protobuf.cq r10 = r10.f222542a
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x0084
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e r10 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128158f.m209256a(r10, r1)
            r3.mo108368b(r9, r10)
            goto L_0x0084
        L_0x00b3:
            r4 = r3
        L_0x00b4:
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j) r1
            int r2 = r1.f352701a
            r2 = r2 | r8
            r1.f352701a = r2
            r2 = 3
            r1.f352702b = r2
            com.google.protobuf.dn r1 = r1.f352704d
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0159
            java.lang.Object r2 = r1.next()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128194e) r2
            com.google.protobuf.dn r3 = r2.f352660d
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ef:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0155
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r10 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b.f352549d
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r10 = r4.mo108367a(r9, r10)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r11 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b.f352549d
            r9.getClass()
            com.google.protobuf.dn r12 = r2.f352660d
            boolean r13 = r12.containsKey(r9)
            if (r13 == 0) goto L_0x0114
            java.lang.Object r11 = r12.get(r9)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b) r11
        L_0x0114:
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128126a) r10
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b) r12
            long r12 = r12.f352552b
            long r14 = r11.f352552b
            r10.copyOnWrite()
            com.google.protobuf.bv r7 = r10.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b) r7
            int r0 = r7.f352551a
            r0 = r0 | r8
            r7.f352551a = r0
            long r12 = r12 + r14
            r7.f352552b = r12
            long r12 = r7.f352553c
            long r14 = r11.f352553c
            long r11 = java.lang.Math.max(r12, r14)
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b) r0
            int r7 = r0.f352551a
            r13 = 2
            r7 = r7 | r13
            r0.f352551a = r7
            r0.f352553c = r11
            com.google.protobuf.bv r0 = r10.build()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b) r0
            r4.mo108369c(r9, r0)
            r0 = r16
            r7 = 2
            goto L_0x00ef
        L_0x0155:
            r0 = r16
            goto L_0x00d5
        L_0x0159:
            r4.mo108370d(r6)
            r4.mo108370d(r5)
        L_0x015f:
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128154b.apply(java.lang.Object):java.lang.Object");
    }
}
