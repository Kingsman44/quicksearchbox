package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.maps.model.C145023g;
import com.google.android.gms.maps.p10845a.C145000e;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.maps.e */
/* compiled from: PG */
public final class C145008e {

    /* renamed from: a */
    public final ViewGroup f391995a;

    /* renamed from: b */
    public View f391996b;

    /* renamed from: c */
    public final C145000e f391997c;

    public C145008e(ViewGroup viewGroup, C145000e eVar) {
        this.f391997c = eVar;
        C143919bh.m233958a(viewGroup);
        this.f391995a = viewGroup;
    }

    /* renamed from: a */
    public final void mo120499a(C145012i iVar) {
        try {
            C145000e eVar = this.f391997c;
            C145007d dVar = new C145007d(iVar);
            Parcel gA = eVar.mo17260gA();
            C8850c.m23499h(gA, dVar);
            eVar.mo17262he(9, gA);
        } catch (RemoteException e) {
            throw new C145023g(e);
        }
    }
}
