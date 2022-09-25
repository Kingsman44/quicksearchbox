package com.google.android.gms.car.p10760f;

import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143153ci;
import com.google.android.gms.car.C143154cj;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.p445a.C8850c;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.car.f.bo */
/* compiled from: PG */
final class C143281bo extends C143154cj {

    /* renamed from: a */
    private final WeakReference f388483a;

    public C143281bo(C143282bp bpVar) {
        this.f388483a = new WeakReference(bpVar);
    }

    /* renamed from: a */
    public final void mo118111a() {
        if (C143109au.m232164a("CAR.VENDOR", 4)) {
            C143316a.m232513c("CAR.VENDOR", (Throwable) null, "onConnected called");
        }
    }

    /* renamed from: b */
    public final void mo118112b(int i) {
        C143282bp bpVar = (C143282bp) this.f388483a.get();
        if (bpVar != null) {
            if (C143109au.m232164a("CAR.VENDOR", 3)) {
                C143316a.m232514d(3, "CAR.VENDOR", (Throwable) null, "onData. length=%d", Integer.valueOf(i));
            }
            if (bpVar.f388485b != null) {
                if (bpVar.f388486c == null) {
                    if (C143109au.m232164a("CAR.VENDOR", 3)) {
                        C143316a.m232511a("CAR.VENDOR", (Throwable) null, "No input stream. Getting an input fd from service");
                    }
                    try {
                        C143153ci ciVar = bpVar.f388488e;
                        C143281bo boVar = bpVar.f388484a;
                        Parcel gA = ciVar.mo17260gA();
                        C8850c.m23499h(gA, boVar);
                        Parcel gT = ciVar.mo17261gT(8, gA);
                        gT.recycle();
                        bpVar.f388486c = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) C8850c.m23492a(gT, ParcelFileDescriptor.CREATOR));
                    } catch (RemoteException unused) {
                        bpVar.mo118052b();
                        return;
                    }
                } else if (C143109au.m232164a("CAR.VENDOR", 3)) {
                    C143316a.m232511a("CAR.VENDOR", (Throwable) null, "Using the existing input stream");
                }
                int i2 = i;
                byte[] bArr = new byte[i2];
                int i3 = 0;
                while (i2 > 0) {
                    int min = Math.min(i2, 32768);
                    if (C143109au.m232164a("CAR.VENDOR", 3)) {
                        C143316a.m232514d(3, "CAR.VENDOR", (Throwable) null, "onData attempts to read %d bytes", Integer.valueOf(min));
                    }
                    try {
                        C143153ci ciVar2 = bpVar.f388488e;
                        C143281bo boVar2 = bpVar.f388484a;
                        Parcel gA2 = ciVar2.mo17260gA();
                        C8850c.m23499h(gA2, boVar2);
                        gA2.writeInt(min);
                        ciVar2.mo17262he(9, gA2);
                        if (C143109au.m232164a("CAR.VENDOR", 3)) {
                            C143316a.m232514d(3, "CAR.VENDOR", (Throwable) null, "readFully: offset=%d length=%d", Integer.valueOf(i3), Integer.valueOf(min));
                        }
                        int i4 = i3;
                        int i5 = min;
                        while (i5 > 0) {
                            try {
                                int read = bpVar.f388486c.read(bArr, i4, i5);
                                if (C143109au.m232164a("CAR.VENDOR", 3)) {
                                    C143316a.m232514d(3, "CAR.VENDOR", (Throwable) null, "readFully read %d bytes", Integer.valueOf(read));
                                }
                                if (read != -1) {
                                    i5 -= read;
                                    i4 += read;
                                } else {
                                    throw new IllegalStateException("Unexpected EOF");
                                }
                            } catch (IOException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                        i2 -= min;
                        i3 += min;
                    } catch (IllegalStateException e2) {
                        C143316a.m232512b("CAR.VENDOR", e2, "ERROR reading data chunk.");
                        return;
                    }
                }
                if (C143109au.m232164a("CAR.VENDOR", 3)) {
                    C143316a.m232511a("CAR.VENDOR", (Throwable) null, "onData read all the data from pipe");
                }
                Handler handler = bpVar.f388487d;
                handler.sendMessage(handler.obtainMessage(3, bArr));
            } else if (C143109au.m232164a("CAR.VENDOR", 3)) {
                C143316a.m232511a("CAR.VENDOR", (Throwable) null, "Data arrived but no listener registered");
            }
        }
    }

    /* renamed from: c */
    public final void mo118113c() {
        if (C143109au.m232164a("CAR.VENDOR", 4)) {
            C143316a.m232513c("CAR.VENDOR", (Throwable) null, "onDisconnect called");
        }
    }
}
