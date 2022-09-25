package com.google.p3723ar.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.p445a.C8850c;
import com.google.android.play.core.install.p3544b.C45200a;
import com.google.p3723ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.q */
/* compiled from: PG */
final class C47911q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f124051a;

    /* renamed from: b */
    final /* synthetic */ ArCoreApk.ICheckAvailabilityCallback f124052b;

    /* renamed from: c */
    final /* synthetic */ C47913s f124053c;

    public C47911q(C47913s sVar, Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        this.f124053c = sVar;
        this.f124051a = context;
        this.f124052b = iCheckAvailabilityCallback;
    }

    public final void run() {
        try {
            C45200a aVar = this.f124053c.f124054a;
            String str = this.f124051a.getApplicationInfo().packageName;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("package.name", "com.google.ar.core");
            C47910p pVar = new C47910p(this);
            Parcel gA = aVar.mo17260gA();
            gA.writeString(str);
            C8850c.m23497f(gA, bundle);
            C8850c.m23499h(gA, pVar);
            aVar.mo17263hf(2, gA);
        } catch (RemoteException e) {
            Log.e("ARCore-InstallService", "requestInfo threw", e);
            this.f124052b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
