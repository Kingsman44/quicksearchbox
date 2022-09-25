package org.chromium.weblayer;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72311ag;
import org.chromium.p5643b.p5644a.C72349h;
import org.chromium.p5643b.p5644a.C72351j;
import org.chromium.p5643b.p5644a.C72353l;

/* renamed from: org.chromium.weblayer.ak */
/* compiled from: PG */
public final class C72575ak extends C72349h {

    /* renamed from: a */
    public final C72311ag f193104a;

    protected C72575ak() {
        this.f193104a = null;
    }

    /* renamed from: a */
    public final int mo64439a() {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gT = agVar.mo17261gT(4, agVar.mo17260gA());
            int readInt = gT.readInt();
            gT.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: b */
    public final int mo64440b() {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gT = agVar.mo17261gT(7, agVar.mo17260gA());
            int readInt = gT.readInt();
            gT.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: c */
    public final Uri mo64441c() {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gT = agVar.mo17261gT(2, agVar.mo17260gA());
            String readString = gT.readString();
            gT.recycle();
            return Uri.parse(readString);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: d */
    public final C72582ar mo64442d() {
        C72353l lVar;
        C72604bm.m107399a();
        if (C72611bt.m107413a() >= 90) {
            try {
                C72311ag agVar = this.f193104a;
                Parcel gT = agVar.mo17261gT(19, agVar.mo17260gA());
                IBinder readStrongBinder = gT.readStrongBinder();
                if (readStrongBinder == null) {
                    lVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.IClientPage");
                    if (queryLocalInterface instanceof C72353l) {
                        lVar = (C72353l) queryLocalInterface;
                    } else {
                        lVar = new C72351j(readStrongBinder);
                    }
                }
                gT.recycle();
                return (C72582ar) lVar;
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final void mo64443e(String str, String str2) {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gA = agVar.mo17260gA();
            gA.writeString(str);
            gA.writeString(str2);
            agVar.mo17262he(8, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: f */
    public final boolean mo64444f() {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gT = agVar.mo17261gT(12, agVar.mo17260gA());
            boolean i = C8850c.m23500i(gT);
            gT.recycle();
            return i;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: g */
    public final boolean mo64445g() {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gT = agVar.mo17261gT(13, agVar.mo17260gA());
            boolean i = C8850c.m23500i(gT);
            gT.recycle();
            return i;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: h */
    public final boolean mo64446h() {
        C72604bm.m107399a();
        try {
            C72311ag agVar = this.f193104a;
            Parcel gT = agVar.mo17261gT(5, agVar.mo17260gA());
            boolean i = C8850c.m23500i(gT);
            gT.recycle();
            return i;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public C72575ak(C72311ag agVar) {
        this.f193104a = agVar;
    }
}
