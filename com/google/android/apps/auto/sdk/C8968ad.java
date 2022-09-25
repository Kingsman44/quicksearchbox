package com.google.android.apps.auto.sdk;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.p10760f.C143275bi;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.auto.sdk.ad */
/* compiled from: PG */
public final class C8968ad {

    /* renamed from: a */
    public final C8986r f31064a;

    /* renamed from: b */
    private final boolean f31065b;

    /* renamed from: c */
    private final boolean f31066c;

    public C8968ad(C8986r rVar, C143275bi biVar) {
        this.f31064a = rVar;
        if (biVar != null) {
            CarInfo carInfo = biVar.f388480a;
            boolean z = carInfo.f387965g;
            boolean z2 = carInfo.f387973o;
            this.f31065b = z2;
            boolean z3 = carInfo.f387972n;
            this.f31066c = z3;
            if (z) {
                try {
                    rVar.mo17300f();
                } catch (RemoteException e) {
                    Log.e("CSL.StatusBarController", "error setting initial status bar state: ".concat(e.toString()));
                    return;
                }
            }
            if (z2) {
                rVar.mo17299e();
            }
            if (z3) {
                rVar.mo17301g();
                return;
            }
            return;
        }
        this.f31065b = false;
        this.f31066c = false;
    }

    /* renamed from: a */
    public final void mo17277a() {
        Log.d("CSL.StatusBarController", "hideAppHeader");
        Log.d("CSL.StatusBarController", "hideTitle");
        try {
            C8986r rVar = this.f31064a;
            rVar.mo17262he(4, rVar.mo17260gA());
        } catch (RemoteException e) {
            Log.e("CSL.StatusBarController", "Error hiding title", e);
        }
        Log.d("CSL.StatusBarController", "setSystemStatusUiVisibility: false");
        try {
            C8986r rVar2 = this.f31064a;
            Parcel gA = rVar2.mo17260gA();
            C8850c.m23495d(gA, false);
            rVar2.mo17262he(18, gA);
        } catch (RemoteException e2) {
            Log.e("CSL.StatusBarController", "error setting system status ui visibility: ".concat(e2.toString()));
        }
        try {
            this.f31064a.mo17301g();
            this.f31064a.mo17299e();
            this.f31064a.mo17300f();
        } catch (RemoteException e3) {
            Log.e("CSL.StatusBarController", "error setting system status ui visibility compat: ".concat(e3.toString()));
        }
        Log.d("CSL.StatusBarController", "hideMicButton");
        try {
            C8986r rVar3 = this.f31064a;
            rVar3.mo17262he(12, rVar3.mo17260gA());
        } catch (RemoteException e4) {
            Log.e("CSL.StatusBarController", "Error hiding mic button", e4);
        }
    }
}
