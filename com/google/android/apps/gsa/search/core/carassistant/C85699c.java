package com.google.android.apps.gsa.search.core.carassistant;

import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.c */
/* compiled from: PG */
final class C85699c implements Parcelable.Creator {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            com.google.android.apps.gsa.search.core.carassistant.AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest r18 = new com.google.android.apps.gsa.search.core.carassistant.AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest
            java.lang.String r1 = r23.readString()
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 5
            r5 = 8
            r6 = 3
            r7 = 7
            r8 = 4
            r9 = 6
            r10 = 10
            r11 = 9
            r12 = 0
            r13 = 1
            switch(r2) {
                case -1710991420: goto L_0x0087;
                case -1439130720: goto L_0x007d;
                case -1346940449: goto L_0x0073;
                case -359327491: goto L_0x0068;
                case -307357377: goto L_0x005d;
                case 2402146: goto L_0x0053;
                case 414367438: goto L_0x0049;
                case 477294611: goto L_0x003f;
                case 1422589497: goto L_0x0035;
                case 1425704333: goto L_0x002a;
                case 1718974183: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0091
        L_0x001f:
            java.lang.String r2 = "HOTWORD_REQUEST"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 5
            goto L_0x0092
        L_0x002a:
            java.lang.String r2 = "SEND_CLIENT_INPUT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 8
            goto L_0x0092
        L_0x0035:
            java.lang.String r2 = "NOTIFICATION_ACCESS_MISSING_FALLBACK_DISABLED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 3
            goto L_0x0092
        L_0x003f:
            java.lang.String r2 = "REPLY_NOTIFICATIONS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 7
            goto L_0x0092
        L_0x0049:
            java.lang.String r2 = "ASSISTANT_SUGGESTIONS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 4
            goto L_0x0092
        L_0x0053:
            java.lang.String r2 = "NOOP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 6
            goto L_0x0092
        L_0x005d:
            java.lang.String r2 = "MEDIA_RECOMMENDATIONS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 10
            goto L_0x0092
        L_0x0068:
            java.lang.String r2 = "SEND_DIGITAL_OBJECT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 9
            goto L_0x0092
        L_0x0073:
            java.lang.String r2 = "READ_NOTIFICATIONS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 1
            goto L_0x0092
        L_0x007d:
            java.lang.String r2 = "COMMIT_QUERY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 0
            goto L_0x0092
        L_0x0087:
            java.lang.String r2 = "NOTIFICATION_ACCESS_MISSING_FALLBACK_ENABLED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 2
            goto L_0x0092
        L_0x0091:
            r1 = -1
        L_0x0092:
            switch(r1) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00af;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00a6;
                case 8: goto L_0x00a3;
                case 9: goto L_0x00a0;
                case 10: goto L_0x009b;
                default: goto L_0x0095;
            }
        L_0x0095:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x009b:
            r1 = 11
            r2 = 11
            goto L_0x00b6
        L_0x00a0:
            r2 = 10
            goto L_0x00b6
        L_0x00a3:
            r2 = 9
            goto L_0x00b6
        L_0x00a6:
            r2 = 8
            goto L_0x00b6
        L_0x00a9:
            r2 = 7
            goto L_0x00b6
        L_0x00ab:
            r2 = 6
            goto L_0x00b6
        L_0x00ad:
            r2 = 5
            goto L_0x00b6
        L_0x00af:
            r2 = 4
            goto L_0x00b6
        L_0x00b1:
            r2 = 3
            goto L_0x00b6
        L_0x00b3:
            r2 = 2
            goto L_0x00b6
        L_0x00b5:
            r2 = 1
        L_0x00b6:
            java.lang.Class<com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest> r1 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r3 = r1
            com.google.android.apps.gsa.shared.search.Query r3 = (com.google.android.apps.gsa.shared.search.Query) r3
            java.lang.Class<com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest> r1 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r4 = r1
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r4 = (com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData) r4
            int r1 = r23.readInt()
            r5 = 0
            if (r1 != 0) goto L_0x00dd
            java.lang.String r1 = r23.readString()
            r6 = r1
            goto L_0x00de
        L_0x00dd:
            r6 = r5
        L_0x00de:
            int r1 = r23.readInt()
            if (r1 != 0) goto L_0x00ea
            java.lang.String r1 = r23.readString()
            r7 = r1
            goto L_0x00eb
        L_0x00ea:
            r7 = r5
        L_0x00eb:
            int r1 = r23.readInt()
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = r23.readString()
            r8 = r1
            goto L_0x00f8
        L_0x00f7:
            r8 = r5
        L_0x00f8:
            java.lang.String r9 = r23.readString()
            long r10 = r23.readLong()
            int r1 = r23.readInt()
            if (r1 != r13) goto L_0x0108
            r14 = 1
            goto L_0x0109
        L_0x0108:
            r14 = 0
        L_0x0109:
            int r1 = r23.readInt()
            if (r1 != r13) goto L_0x0112
            r19 = 1
            goto L_0x0114
        L_0x0112:
            r19 = 0
        L_0x0114:
            int r1 = r23.readInt()
            if (r1 != r13) goto L_0x011d
            r20 = 1
            goto L_0x011f
        L_0x011d:
            r20 = 0
        L_0x011f:
            int r1 = r23.readInt()
            if (r1 != r13) goto L_0x0128
            r21 = 1
            goto L_0x012a
        L_0x0128:
            r21 = 0
        L_0x012a:
            com.google.android.apps.gsa.search.core.carassistant.i r1 = com.google.android.apps.gsa.search.core.carassistant.AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest.f231689p
            com.google.common.b.gu r15 = r1.mo83631b(r0)
            com.google.android.apps.gsa.search.core.carassistant.j r1 = com.google.android.apps.gsa.search.core.carassistant.AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest.f231690q
            com.google.common.b.gu r16 = r1.mo83631b(r0)
            java.io.Serializable r0 = r23.readSerializable()
            r17 = r0
            com.google.protobuf.z r17 = (com.google.protobuf.C63088z) r17
            r1 = r18
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r11 = r14
            r12 = r19
            r13 = r20
            r14 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.carassistant.C85699c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest[i];
    }
}
