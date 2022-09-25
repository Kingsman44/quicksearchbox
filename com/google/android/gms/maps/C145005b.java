package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.maps.model.C145023g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.p10845a.C144999d;
import com.google.android.p445a.C8850c;
import java.util.HashMap;

/* renamed from: com.google.android.gms.maps.b */
/* compiled from: PG */
public final class C145005b {

    /* renamed from: a */
    public C145015l f391992a;

    /* renamed from: b */
    public final C144999d f391993b;

    public C145005b(C144999d dVar) {
        new HashMap();
        C143919bh.m233958a(dVar);
        this.f391993b = dVar;
    }

    /* renamed from: a */
    public final CameraPosition mo120496a() {
        try {
            C144999d dVar = this.f391993b;
            Parcel gT = dVar.mo17261gT(1, dVar.mo17260gA());
            CameraPosition cameraPosition = (CameraPosition) C8850c.m23492a(gT, CameraPosition.CREATOR);
            gT.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw new C145023g(e);
        }
    }
}
