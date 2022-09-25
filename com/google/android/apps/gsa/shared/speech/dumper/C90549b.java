package com.google.android.apps.gsa.shared.speech.dumper;

import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.b */
/* compiled from: PG */
final class C90549b implements Parcelable.Creator {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            java.lang.String r0 = r25.readString()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 7
            r4 = 23
            r5 = 29
            r6 = 17
            r7 = 3
            r8 = 11
            r9 = 26
            r10 = 21
            r11 = 18
            r12 = 6
            r13 = 27
            r14 = 28
            r15 = 13
            r16 = 2
            r17 = 5
            r18 = 8
            r19 = 14
            r20 = 25
            r21 = 10
            r22 = 12
            r23 = 16
            switch(r1) {
                case -2137067054: goto L_0x0181;
                case -1863822260: goto L_0x0176;
                case -1843093289: goto L_0x016b;
                case -1736802499: goto L_0x0160;
                case -1712514175: goto L_0x0155;
                case -1663081147: goto L_0x014a;
                case -1635777234: goto L_0x013f;
                case -1578100939: goto L_0x0135;
                case -1238220627: goto L_0x012b;
                case -1079476663: goto L_0x011f;
                case -1070737757: goto L_0x0113;
                case -1064106344: goto L_0x0107;
                case -1010277027: goto L_0x00fc;
                case -842265051: goto L_0x00f0;
                case -743338584: goto L_0x00e4;
                case -669964327: goto L_0x00d8;
                case -468225765: goto L_0x00cc;
                case -324399280: goto L_0x00c1;
                case -43048051: goto L_0x00b5;
                case 133921994: goto L_0x00a9;
                case 188456535: goto L_0x009d;
                case 571035234: goto L_0x0092;
                case 601181956: goto L_0x0087;
                case 923927566: goto L_0x007c;
                case 1009917416: goto L_0x0070;
                case 1431005605: goto L_0x0064;
                case 1458140989: goto L_0x0058;
                case 1859491155: goto L_0x004d;
                case 1859592832: goto L_0x0041;
                case 1937631518: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x018c
        L_0x0035:
            java.lang.String r1 = "MISSING_SPEAKER_ID_MODEL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 19
            goto L_0x018d
        L_0x0041:
            java.lang.String r1 = "INCORRECT_STATE_BEFORE_ONBOARDING_UI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 24
            goto L_0x018d
        L_0x004d:
            java.lang.String r1 = "HW_SETTINGS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 4
            goto L_0x018d
        L_0x0058:
            java.lang.String r1 = "HW_INCOMPLETE_MIGRATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 20
            goto L_0x018d
        L_0x0064:
            java.lang.String r1 = "OUT_OF_SYNC_SETTING_UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 22
            goto L_0x018d
        L_0x0070:
            java.lang.String r1 = "UPGRADE_TASK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 9
            goto L_0x018d
        L_0x007c:
            java.lang.String r1 = "ACCOUNT_REMOVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 1
            goto L_0x018d
        L_0x0087:
            java.lang.String r1 = "ENROLLMENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 7
            goto L_0x018d
        L_0x0092:
            java.lang.String r1 = "ACCOUNT_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 0
            goto L_0x018d
        L_0x009d:
            java.lang.String r1 = "SPEAKER_ID_ADAPTATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 23
            goto L_0x018d
        L_0x00a9:
            java.lang.String r1 = "HW_CONSENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 29
            goto L_0x018d
        L_0x00b5:
            java.lang.String r1 = "HW_UNDECIDED_TO_DECLINE_MIGRATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 17
            goto L_0x018d
        L_0x00c1:
            java.lang.String r1 = "AUDIO_HISTORY_DISABLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 3
            goto L_0x018d
        L_0x00cc:
            java.lang.String r1 = "OPA_USER_SETTING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 11
            goto L_0x018d
        L_0x00d8:
            java.lang.String r1 = "HW_MODEL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 26
            goto L_0x018d
        L_0x00e4:
            java.lang.String r1 = "ENROLLMENT_SKIP_COUNT_EXCEEDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 21
            goto L_0x018d
        L_0x00f0:
            java.lang.String r1 = "ENROLLMENT_STATE_MIGRATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 18
            goto L_0x018d
        L_0x00fc:
            java.lang.String r1 = "DSP_UNENROLL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 6
            goto L_0x018d
        L_0x0107:
            java.lang.String r1 = "RESTORE_SPEAKER_MODEL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 27
            goto L_0x018d
        L_0x0113:
            java.lang.String r1 = "OPA_HOTWORD_INELIGIBLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 28
            goto L_0x018d
        L_0x011f:
            java.lang.String r1 = "MANUAL_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 13
            goto L_0x018d
        L_0x012b:
            java.lang.String r1 = "LANGUAGE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 2
            goto L_0x018d
        L_0x0135:
            java.lang.String r1 = "HW_DETECTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 5
            goto L_0x018d
        L_0x013f:
            java.lang.String r1 = "SILENT_ENROLLMENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 8
            goto L_0x018d
        L_0x014a:
            java.lang.String r1 = "SERVER_UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 14
            goto L_0x018d
        L_0x0155:
            java.lang.String r1 = "LSPR_MIGRATION_TO_AOL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 25
            goto L_0x018d
        L_0x0160:
            java.lang.String r1 = "OPA_UPGRADE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 10
            goto L_0x018d
        L_0x016b:
            java.lang.String r1 = "NONDSP_TO_DSP_MIGRATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 12
            goto L_0x018d
        L_0x0176:
            java.lang.String r1 = "OPA_TURN_OFF_HOTWORD_SUGGESTION_CHIP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 16
            goto L_0x018d
        L_0x0181:
            java.lang.String r1 = "IGNORE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 15
            goto L_0x018d
        L_0x018c:
            r0 = -1
        L_0x018d:
            switch(r0) {
                case 0: goto L_0x01e8;
                case 1: goto L_0x01e7;
                case 2: goto L_0x01e5;
                case 3: goto L_0x01e3;
                case 4: goto L_0x01e1;
                case 5: goto L_0x01df;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01da;
                case 8: goto L_0x01d7;
                case 9: goto L_0x01d4;
                case 10: goto L_0x01d1;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01cb;
                case 13: goto L_0x01c8;
                case 14: goto L_0x01c5;
                case 15: goto L_0x01c2;
                case 16: goto L_0x01bf;
                case 17: goto L_0x01bc;
                case 18: goto L_0x01b9;
                case 19: goto L_0x01b6;
                case 20: goto L_0x01b3;
                case 21: goto L_0x01b0;
                case 22: goto L_0x01ad;
                case 23: goto L_0x01aa;
                case 24: goto L_0x01a7;
                case 25: goto L_0x01a4;
                case 26: goto L_0x01a1;
                case 27: goto L_0x019e;
                case 28: goto L_0x019a;
                case 29: goto L_0x0196;
                default: goto L_0x0190;
            }
        L_0x0190:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0196:
            r2 = 30
            goto L_0x01e8
        L_0x019a:
            r2 = 29
            goto L_0x01e8
        L_0x019e:
            r2 = 28
            goto L_0x01e8
        L_0x01a1:
            r2 = 27
            goto L_0x01e8
        L_0x01a4:
            r2 = 26
            goto L_0x01e8
        L_0x01a7:
            r2 = 25
            goto L_0x01e8
        L_0x01aa:
            r2 = 24
            goto L_0x01e8
        L_0x01ad:
            r2 = 23
            goto L_0x01e8
        L_0x01b0:
            r2 = 22
            goto L_0x01e8
        L_0x01b3:
            r2 = 21
            goto L_0x01e8
        L_0x01b6:
            r2 = 20
            goto L_0x01e8
        L_0x01b9:
            r2 = 19
            goto L_0x01e8
        L_0x01bc:
            r2 = 18
            goto L_0x01e8
        L_0x01bf:
            r2 = 17
            goto L_0x01e8
        L_0x01c2:
            r2 = 16
            goto L_0x01e8
        L_0x01c5:
            r2 = 15
            goto L_0x01e8
        L_0x01c8:
            r2 = 14
            goto L_0x01e8
        L_0x01cb:
            r2 = 13
            goto L_0x01e8
        L_0x01ce:
            r2 = 12
            goto L_0x01e8
        L_0x01d1:
            r2 = 11
            goto L_0x01e8
        L_0x01d4:
            r2 = 10
            goto L_0x01e8
        L_0x01d7:
            r2 = 9
            goto L_0x01e8
        L_0x01da:
            r2 = 8
            goto L_0x01e8
        L_0x01dd:
            r2 = 7
            goto L_0x01e8
        L_0x01df:
            r2 = 6
            goto L_0x01e8
        L_0x01e1:
            r2 = 5
            goto L_0x01e8
        L_0x01e3:
            r2 = 4
            goto L_0x01e8
        L_0x01e5:
            r2 = 3
            goto L_0x01e8
        L_0x01e7:
            r2 = 2
        L_0x01e8:
            java.lang.String r0 = r25.readString()
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r0 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.speech.dumper.C90549b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EventForDump[i];
    }
}
