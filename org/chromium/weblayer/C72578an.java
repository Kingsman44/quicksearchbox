package org.chromium.weblayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72312ah;

/* renamed from: org.chromium.weblayer.an */
/* compiled from: PG */
public final class C72578an {

    /* renamed from: a */
    public final C72581aq f193106a = new C72581aq();

    /* renamed from: b */
    public C72312ah f193107b;

    protected C72578an() {
    }

    /* renamed from: a */
    public final int mo64447a() {
        C72604bm.m107399a();
        try {
            C72312ah ahVar = this.f193107b;
            Parcel gT = ahVar.mo17261gT(7, ahVar.mo17260gA());
            int readInt = gT.readInt();
            gT.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: b */
    public final int mo64448b() {
        C72604bm.m107399a();
        try {
            C72312ah ahVar = this.f193107b;
            Parcel gT = ahVar.mo17261gT(6, ahVar.mo17260gA());
            int readInt = gT.readInt();
            gT.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: c */
    public final Uri mo64449c(int i) {
        C72604bm.m107399a();
        mo64450d(i);
        try {
            C72312ah ahVar = this.f193107b;
            Parcel gA = ahVar.mo17260gA();
            gA.writeInt(i);
            Parcel gT = ahVar.mo17261gT(8, gA);
            String readString = gT.readString();
            gT.recycle();
            return Uri.parse(readString);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: d */
    public final void mo64450d(int i) {
        if (i < 0 || i >= mo64448b()) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: e */
    public final boolean mo64451e() {
        C72604bm.m107399a();
        try {
            C72312ah ahVar = this.f193107b;
            Parcel gT = ahVar.mo17261gT(9, ahVar.mo17260gA());
            boolean i = C8850c.m23500i(gT);
            gT.recycle();
            return i;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: f */
    public final boolean mo64452f(int i) {
        C72604bm.m107399a();
        mo64450d(i);
        try {
            C72312ah ahVar = this.f193107b;
            Parcel gA = ahVar.mo17260gA();
            gA.writeInt(i);
            Parcel gT = ahVar.mo17261gT(14, gA);
            boolean i2 = C8850c.m23500i(gT);
            gT.recycle();
            return i2;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
