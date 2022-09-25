package com.google.android.gms.maps;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.maps.model.C145016a;
import com.google.android.gms.maps.model.C145023g;
import com.google.android.gms.maps.model.p10846a.C145017a;
import com.google.android.gms.maps.p10845a.C144997b;
import com.google.android.gms.maps.p10845a.C144998c;
import com.google.android.gms.maps.p10845a.C145004i;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.maps.h */
/* compiled from: PG */
public final class C145011h {

    /* renamed from: a */
    private static final String f392003a = "h";

    /* renamed from: b */
    private static boolean f392004b = false;

    /* renamed from: c */
    private static int f392005c = 1;

    private C145011h() {
    }

    /* renamed from: a */
    public static synchronized void m235672a(Context context) {
        synchronized (C145011h.class) {
            m235673b(context, 0, (C145013j) null);
        }
    }

    /* renamed from: b */
    public static synchronized void m235673b(Context context, int i, C145013j jVar) {
        C144997b bVar;
        synchronized (C145011h.class) {
            C143919bh.m233971n(context, "Context is null");
            Log.d(f392003a, "preferredRenderer: ".concat(C145010g.m235671a(i)));
            if (!f392004b) {
                try {
                    C144998c a = C145004i.m235663a(context, i);
                    try {
                        Parcel gT = a.mo17261gT(4, a.mo17260gA());
                        IBinder readStrongBinder = gT.readStrongBinder();
                        C145017a aVar = null;
                        if (readStrongBinder == null) {
                            bVar = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                            bVar = queryLocalInterface instanceof C144997b ? (C144997b) queryLocalInterface : new C144997b(readStrongBinder);
                        }
                        gT.recycle();
                        C143919bh.m233958a(bVar);
                        C144995a.f391988a = bVar;
                        Parcel gT2 = a.mo17261gT(5, a.mo17260gA());
                        IBinder readStrongBinder2 = gT2.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                            aVar = queryLocalInterface2 instanceof C145017a ? (C145017a) queryLocalInterface2 : new C145017a(readStrongBinder2);
                        }
                        gT2.recycle();
                        if (C145016a.f392017a == null) {
                            C143919bh.m233971n(aVar, "delegate must not be null");
                            C145016a.f392017a = aVar;
                        }
                        int i2 = 1;
                        f392004b = true;
                        if (i == 0) {
                            i2 = 0;
                        } else if (i - 1 != 0) {
                            i2 = 2;
                        }
                        Parcel gT3 = a.mo17261gT(9, a.mo17260gA());
                        int readInt = gT3.readInt();
                        gT3.recycle();
                        if (readInt == 2) {
                            f392005c = 2;
                        }
                        C144166k kVar = new C144166k(context);
                        Parcel gA = a.mo17260gA();
                        C8850c.m23499h(gA, kVar);
                        gA.writeInt(i2);
                        a.mo17262he(10, gA);
                    } catch (RemoteException e) {
                        throw new C145023g(e);
                    } catch (RemoteException e2) {
                        Log.e(f392003a, "Failed to retrieve renderer type or log initialization.", e2);
                    }
                    Log.d(f392003a, "loadedRenderer: ".concat(C145010g.m235671a(f392005c)));
                    if (jVar != null) {
                        jVar.mo97870v(f392005c);
                    }
                } catch (C144022y unused) {
                }
            } else if (jVar != null) {
                jVar.mo97870v(f392005c);
            }
        }
    }
}
