package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.f */
/* compiled from: PG */
public final class C143972f extends C8848a implements IInterface {
    public C143972f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    /* renamed from: e */
    public final void mo119512e(C143971e eVar, ApiFeatureRequest apiFeatureRequest, C143974h hVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, eVar);
        C8850c.m23497f(gA, apiFeatureRequest);
        C8850c.m23499h(gA, hVar);
        mo17262he(2, gA);
    }
}
