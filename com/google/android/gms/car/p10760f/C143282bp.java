package com.google.android.gms.car.p10760f;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143117ba;
import com.google.android.gms.car.C143118bb;
import com.google.android.gms.car.C143153ci;
import com.google.android.gms.car.p10750a.p10751a.C143060e;
import com.google.android.gms.car.p10760f.p10761a.C143236b;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.p445a.C8850c;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.car.f.bp */
/* compiled from: PG */
public final class C143282bp implements C143118bb {

    /* renamed from: a */
    public final C143281bo f388484a;

    /* renamed from: b */
    public volatile C143117ba f388485b;

    /* renamed from: c */
    public InputStream f388486c;

    /* renamed from: d */
    public final Handler f388487d;

    /* renamed from: e */
    public final C143153ci f388488e;

    /* renamed from: f */
    private OutputStream f388489f;

    /* renamed from: g */
    private final C143060e f388490g;

    public C143282bp(C143153ci ciVar, C143060e eVar, Looper looper) {
        C143281bo boVar = new C143281bo(this);
        this.f388484a = boVar;
        this.f388487d = new C143280bn(this, looper);
        if (C143109au.m232164a("CAR.VENDOR", 3)) {
            C143316a.m232511a("CAR.VENDOR", (Throwable) null, "CarVendorExtensionManager");
        }
        this.f388488e = ciVar;
        this.f388490g = eVar;
        Parcel gA = ciVar.mo17260gA();
        C8850c.m23499h(gA, boVar);
        Parcel gT = ciVar.mo17261gT(1, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        if (!i) {
            throw new IllegalStateException("Service is already being used");
        }
    }

    /* renamed from: a */
    public final void mo118051a(C143117ba baVar) {
        this.f388485b = baVar;
    }

    /* renamed from: b */
    public final void mo118052b() {
        if (C143109au.m232164a("CAR.VENDOR", 3)) {
            C143316a.m232511a("CAR.VENDOR", (Throwable) null, BuildConfig.BUILD_TYPE);
        }
        try {
            C143153ci ciVar = this.f388488e;
            C143281bo boVar = this.f388484a;
            Parcel gA = ciVar.mo17260gA();
            C8850c.m23499h(gA, boVar);
            ciVar.mo17262he(2, gA);
        } catch (RemoteException | IllegalStateException unused) {
        }
        this.f388490g.f388139a.f388029d.mo117949h(C143282bp.class, this);
    }

    /* renamed from: c */
    public final void mo118053c(byte[] bArr) {
        int length = bArr.length;
        if (C143109au.m232164a("CAR.VENDOR", 3)) {
            C143316a.m232514d(3, "CAR.VENDOR", (Throwable) null, "sendData. length=%d", Integer.valueOf(length));
        }
        if (this.f388489f == null) {
            if (C143109au.m232164a("CAR.VENDOR", 3)) {
                C143316a.m232511a("CAR.VENDOR", (Throwable) null, "No output stream. Getting an output fd from service");
            }
            try {
                C143153ci ciVar = this.f388488e;
                C143281bo boVar = this.f388484a;
                Parcel gA = ciVar.mo17260gA();
                C8850c.m23499h(gA, boVar);
                Parcel gT = ciVar.mo17261gT(5, gA);
                gT.recycle();
                this.f388489f = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) C8850c.m23492a(gT, ParcelFileDescriptor.CREATOR));
            } catch (IllegalStateException e) {
                C143236b.m232383a(e);
            } catch (RemoteException e2) {
                mo118052b();
                C143236b.m232385c(e2);
            }
        } else if (C143109au.m232164a("CAR.VENDOR", 3)) {
            C143316a.m232511a("CAR.VENDOR", (Throwable) null, "Using the existing output stream");
        }
        try {
            C143153ci ciVar2 = this.f388488e;
            C143281bo boVar2 = this.f388484a;
            Parcel gA2 = ciVar2.mo17260gA();
            C8850c.m23499h(gA2, boVar2);
            gA2.writeInt(length);
            ciVar2.mo17262he(6, gA2);
        } catch (IllegalStateException e3) {
            C143236b.m232383a(e3);
        } catch (RemoteException e4) {
            mo118052b();
            C143236b.m232385c(e4);
        }
        int i = 0;
        while (length > 0) {
            int min = Math.min(length, 32768);
            if (C143109au.m232164a("CAR.VENDOR", 3)) {
                C143316a.m232514d(3, "CAR.VENDOR", (Throwable) null, "sendData writing %d bytes", Integer.valueOf(min));
            }
            this.f388489f.write(bArr, i, min);
            try {
                C143153ci ciVar3 = this.f388488e;
                C143281bo boVar3 = this.f388484a;
                Parcel gA3 = ciVar3.mo17260gA();
                C8850c.m23499h(gA3, boVar3);
                gA3.writeInt(min);
                ciVar3.mo17262he(7, gA3);
            } catch (IllegalStateException e5) {
                C143236b.m232383a(e5);
            } catch (RemoteException e6) {
                mo118052b();
                C143236b.m232385c(e6);
            }
            length -= min;
            i += min;
        }
        if (C143109au.m232164a("CAR.VENDOR", 3)) {
            C143316a.m232511a("CAR.VENDOR", (Throwable) null, "sendData done");
        }
    }

    /* renamed from: d */
    public final void mo118054d() {
        this.f388485b = null;
    }
}
