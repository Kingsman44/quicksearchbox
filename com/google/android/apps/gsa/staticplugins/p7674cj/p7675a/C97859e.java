package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.p453b.p454a.p455a.p456a.C8997c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.p445a.C8850c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.e */
/* compiled from: PG */
public final /* synthetic */ class C97859e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C97862h f273263a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f273264b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f273265c;

    public /* synthetic */ C97859e(C97862h hVar, IBinder iBinder, SettableFuture settableFuture) {
        this.f273263a = hVar;
        this.f273264b = iBinder;
        this.f273265c = settableFuture;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C8997c cVar;
        C97862h hVar = this.f273263a;
        IBinder iBinder = this.f273264b;
        SettableFuture settableFuture = this.f273265c;
        C97855a aVar = hVar.f273269b.f273271b;
        C97860f fVar = new C97860f(settableFuture);
        String str = aVar.f273256a;
        long j = aVar.f273257b;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gmm.gsashared.api.timeline.IPostVisitBadgeService");
            cVar = queryLocalInterface instanceof C8997c ? (C8997c) queryLocalInterface : new C8997c(iBinder);
        }
        Parcel gA = cVar.mo17260gA();
        gA.writeString(str);
        gA.writeLong(j);
        C8850c.m23499h(gA, fVar);
        cVar.mo17263hf(1, gA);
        return null;
    }
}
