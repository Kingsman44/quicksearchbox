package com.google.android.gearhead.sdk.assistant;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gearhead.sdk.assistant.e */
/* compiled from: PG */
public final class C142659e extends C8848a implements C142660f {
    public C142659e(IBinder iBinder) {
        super(iBinder, "com.google.android.gearhead.sdk.assistant.ICarAssistantClientCallbacks");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.p1484g.p1502d.C18155ag mo117443e() {
        /*
            r4 = this;
            r0 = 6
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.libraries.assistant.directactions.sender.ISystemDirectActionsProxy"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.libraries.assistant.p1484g.p1502d.C18155ag
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.libraries.assistant.g.d.ag r1 = (com.google.android.libraries.assistant.p1484g.p1502d.C18155ag) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.libraries.assistant.g.d.ae r2 = new com.google.android.libraries.assistant.g.d.ae
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gearhead.sdk.assistant.C142659e.mo117443e():com.google.android.libraries.assistant.g.d.ag");
    }

    /* renamed from: f */
    public final void mo117444f(CarAssistantEvent carAssistantEvent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, carAssistantEvent);
        mo17263hf(1, gA);
    }

    /* renamed from: g */
    public final void mo117445g() {
        mo17263hf(2, mo17260gA());
    }

    /* renamed from: h */
    public final boolean mo117446h(VoiceSessionResult voiceSessionResult) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, voiceSessionResult);
        Parcel gT = mo17261gT(3, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: i */
    public final byte[] mo117447i() {
        Parcel gT = mo17261gT(5, mo17260gA());
        byte[] createByteArray = gT.createByteArray();
        gT.recycle();
        return createByteArray;
    }
}
