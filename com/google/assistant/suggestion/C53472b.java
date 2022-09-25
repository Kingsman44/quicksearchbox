package com.google.assistant.suggestion;

import android.os.Parcelable;

/* renamed from: com.google.assistant.suggestion.b */
/* compiled from: PG */
final class C53472b implements Parcelable.Creator {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.readString()
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 3
            r4 = 7
            r5 = 6
            r6 = 0
            r7 = 5
            r8 = 4
            r9 = 1
            switch(r1) {
                case -1734717884: goto L_0x005a;
                case -1291728606: goto L_0x0050;
                case 183335063: goto L_0x0046;
                case 237069458: goto L_0x003c;
                case 237722572: goto L_0x0032;
                case 508276856: goto L_0x0028;
                case 689270080: goto L_0x001e;
                case 967185656: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0064
        L_0x0014:
            java.lang.String r1 = "SIDE_CARD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 3
            goto L_0x0065
        L_0x001e:
            java.lang.String r1 = "VOICEPLATE_IMMERSIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 7
            goto L_0x0065
        L_0x0028:
            java.lang.String r1 = "COOLWALK_MEDIA_CARD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 6
            goto L_0x0065
        L_0x0032:
            java.lang.String r1 = "HOME_SCREEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 0
            goto L_0x0065
        L_0x003c:
            java.lang.String r1 = "COOLWALK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 5
            goto L_0x0065
        L_0x0046:
            java.lang.String r1 = "MORRIS_DRIVING_SCREEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 4
            goto L_0x0065
        L_0x0050:
            java.lang.String r1 = "SMART_CHIP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x005a:
            java.lang.String r1 = "WIDGET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 2
            goto L_0x0065
        L_0x0064:
            r0 = -1
        L_0x0065:
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x007c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0077;
                case 4: goto L_0x0075;
                case 5: goto L_0x0073;
                case 6: goto L_0x0071;
                case 7: goto L_0x006e;
                default: goto L_0x0068;
            }
        L_0x0068:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L_0x006e:
            r2 = 8
            goto L_0x007c
        L_0x0071:
            r2 = 7
            goto L_0x007c
        L_0x0073:
            r2 = 6
            goto L_0x007c
        L_0x0075:
            r2 = 5
            goto L_0x007c
        L_0x0077:
            r2 = 4
            goto L_0x007c
        L_0x0079:
            r2 = 3
            goto L_0x007c
        L_0x007b:
            r2 = 1
        L_0x007c:
            int r0 = r11.readInt()
            int r1 = r11.readInt()
            byte r11 = r11.readByte()
            if (r11 == 0) goto L_0x008b
            r6 = 1
        L_0x008b:
            com.google.assistant.suggestion.c r11 = com.google.assistant.suggestion.C53473c.m86820a()
            r11.f140342d = r2
            r11.f140339a = r0
            r11.f140340b = r1
            r11.f140341c = r6
            com.google.assistant.suggestion.RegisterDisplayParams r0 = new com.google.assistant.suggestion.RegisterDisplayParams
            r0.<init>(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.assistant.suggestion.C53472b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterDisplayParams[i];
    }
}
