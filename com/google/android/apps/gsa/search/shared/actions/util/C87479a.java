package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.a */
/* compiled from: PG */
final class C87479a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.protobuf.MessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            r26 = this;
            r0 = r27
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r22 = new com.google.android.apps.gsa.search.shared.actions.util.CardDecision
            java.lang.String r1 = r27.readString()
            java.lang.Class<com.google.android.apps.gsa.search.shared.actions.util.CardDecision> r2 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r2 = (com.google.android.apps.gsa.search.shared.actions.util.TtsRequest) r2
            java.lang.Class<com.google.android.apps.gsa.search.shared.actions.util.Suggestion> r3 = com.google.android.apps.gsa.search.shared.actions.util.Suggestion.class
            java.util.List r3 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.m141965f(r0, r3)
            byte r4 = r27.readByte()
            r6 = 1
            if (r4 != r6) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            byte r7 = r27.readByte()
            if (r7 != r6) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            byte r8 = r27.readByte()
            if (r8 != r6) goto L_0x0035
            r8 = 1
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            byte r9 = r27.readByte()
            if (r9 != r6) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            byte r10 = r27.readByte()
            if (r10 != r6) goto L_0x0047
            r10 = 1
            goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            byte r11 = r27.readByte()
            if (r11 != r6) goto L_0x0050
            r11 = 1
            goto L_0x0051
        L_0x0050:
            r11 = 0
        L_0x0051:
            long r12 = r27.readLong()
            int r14 = r27.readInt()
            com.google.bb.a.ab r14 = com.google.p4152bb.p4153a.C54944ab.m87544a(r14)
            com.google.common.base.ax r14 = com.google.common.base.C58833ax.m90833j(r14)
            com.google.bb.a.ab r15 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r14 = r14.mo56109e(r15)
            com.google.bb.a.ab r14 = (com.google.p4152bb.p4153a.C54944ab) r14
            int r15 = r27.readInt()
            com.google.bb.a.ab r15 = com.google.p4152bb.p4153a.C54944ab.m87544a(r15)
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90833j(r15)
            com.google.bb.a.ab r5 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r5 = r15.mo56109e(r5)
            r17 = r5
            com.google.bb.a.ab r17 = (com.google.p4152bb.p4153a.C54944ab) r17
            int[] r5 = r27.createIntArray()
            java.util.List r18 = com.google.common.p4575r.C60757n.m92749j(r5)
            com.google.bb.a.lx r5 = com.google.p4152bb.p4153a.C55263lx.f145542i
            com.google.protobuf.eb r5 = r5.getParserForType()
            byte[] r15 = r27.createByteArray()
            if (r15 != 0) goto L_0x0095
            r5 = 0
            goto L_0x009f
        L_0x0095:
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00f4 }
            java.lang.Object r5 = r5.mo59015n(r15, r6)     // Catch:{ ct -> 0x00f4 }
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5     // Catch:{ ct -> 0x00f4 }
        L_0x009f:
            r20 = r5
            com.google.bb.a.lx r20 = (com.google.p4152bb.p4153a.C55263lx) r20
            byte r5 = r27.readByte()
            r6 = 1
            if (r5 != r6) goto L_0x00ad
            r19 = 1
            goto L_0x00af
        L_0x00ad:
            r19 = 0
        L_0x00af:
            java.lang.Class<com.google.android.apps.gsa.search.shared.actions.util.PromptSegment> r5 = com.google.android.apps.gsa.search.shared.actions.util.PromptSegment.class
            java.util.List r21 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.m141965f(r0, r5)
            byte r5 = r27.readByte()
            if (r5 != r6) goto L_0x00be
            r23 = 1
            goto L_0x00c0
        L_0x00be:
            r23 = 0
        L_0x00c0:
            byte r5 = r27.readByte()
            if (r5 != r6) goto L_0x00c9
            r24 = 1
            goto L_0x00cb
        L_0x00c9:
            r24 = 0
        L_0x00cb:
            byte r0 = r27.readByte()
            if (r0 != r6) goto L_0x00d4
            r25 = 1
            goto L_0x00d6
        L_0x00d4:
            r25 = 0
        L_0x00d6:
            r15 = 0
            r0 = r22
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r12 = r14
            r13 = r17
            r14 = r18
            r16 = r20
            r17 = r19
            r18 = r21
            r19 = r23
            r20 = r24
            r21 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r22
        L_0x00f4:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.util.C87479a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CardDecision[i];
    }
}
