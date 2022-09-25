package com.google.android.gearhead.sdk.assistant;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gearhead.sdk.assistant.c */
/* compiled from: PG */
public abstract class C142657c extends C8849b implements C142658d {
    public C142657c() {
        super("com.google.android.gearhead.sdk.assistant.ICarAssistant");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            switch(r4) {
                case 1: goto L_0x0047;
                case 2: goto L_0x0040;
                case 3: goto L_0x002e;
                case 4: goto L_0x001c;
                case 5: goto L_0x0014;
                case 6: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r4 = 0
            return r4
        L_0x0005:
            byte[] r4 = r5.createByteArray()
            r3.enforceNoDataAvail(r5)
            r3.mo92229c(r4)
            r6.writeNoException()
            goto L_0x008f
        L_0x0014:
            r3.mo92228b()
            r6.writeNoException()
            goto L_0x008f
        L_0x001c:
            android.os.Parcelable$Creator r4 = com.google.android.gearhead.sdk.assistant.CarAssistantSetting.CREATOR
            android.os.Parcelable r4 = com.google.android.p445a.C8850c.m23492a(r5, r4)
            com.google.android.gearhead.sdk.assistant.CarAssistantSetting r4 = (com.google.android.gearhead.sdk.assistant.CarAssistantSetting) r4
            r3.enforceNoDataAvail(r5)
            r3.mo92231e()
            r6.writeNoException()
            goto L_0x008f
        L_0x002e:
            int r4 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            com.google.android.gearhead.sdk.assistant.CarAssistantSetting r4 = r3.mo92227a(r4)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23498g(r6, r4)
            goto L_0x008f
        L_0x0040:
            r3.mo92230d()
            r6.writeNoException()
            goto L_0x008f
        L_0x0047:
            android.os.Parcelable$Creator r4 = com.google.android.gearhead.sdk.assistant.VoiceSessionConfig.CREATOR
            android.os.Parcelable r4 = com.google.android.p445a.C8850c.m23492a(r5, r4)
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r4 = (com.google.android.gearhead.sdk.assistant.VoiceSessionConfig) r4
            android.os.Parcelable$Creator r7 = com.google.android.gearhead.sdk.assistant.ClientStateSnapshot.CREATOR
            android.os.Parcelable r7 = com.google.android.p445a.C8850c.m23492a(r5, r7)
            com.google.android.gearhead.sdk.assistant.ClientStateSnapshot r7 = (com.google.android.gearhead.sdk.assistant.ClientStateSnapshot) r7
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x005f
            r0 = 0
            goto L_0x0073
        L_0x005f:
            java.lang.String r1 = "com.google.android.gearhead.sdk.assistant.IVoicePlate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gearhead.sdk.assistant.C142664j
            if (r2 == 0) goto L_0x006d
            r0 = r1
            com.google.android.gearhead.sdk.assistant.j r0 = (com.google.android.gearhead.sdk.assistant.C142664j) r0
            goto L_0x0073
        L_0x006d:
            com.google.android.gearhead.sdk.assistant.j r1 = new com.google.android.gearhead.sdk.assistant.j
            r1.<init>(r0)
            r0 = r1
        L_0x0073:
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L_0x007a
            goto L_0x0086
        L_0x007a:
            java.lang.String r2 = "com.google.android.gearhead.sdk.assistant.IActionPlate"
            android.os.IInterface r1 = r1.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gearhead.sdk.assistant.C142656b
            if (r2 == 0) goto L_0x0086
            com.google.android.gearhead.sdk.assistant.b r1 = (com.google.android.gearhead.sdk.assistant.C142656b) r1
        L_0x0086:
            r3.enforceNoDataAvail(r5)
            r3.mo92232f(r4, r7, r0)
            r6.writeNoException()
        L_0x008f:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gearhead.sdk.assistant.C142657c.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
