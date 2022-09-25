package com.google.android.libraries.web.weblayer.p3462e.p3463a;

import android.os.Parcel;
import android.os.RemoteException;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72340bi;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72613bv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.weblayer.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C44222a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C72613bv f115013a;

    public /* synthetic */ C44222a(C72613bv bvVar) {
        this.f115013a = bvVar;
    }

    public final void accept(Object obj) {
        C72613bv bvVar = this.f115013a;
        String str = (String) obj;
        C72604bm.m107399a();
        try {
            C72340bi biVar = bvVar.f193176b;
            Parcel gA = biVar.mo17260gA();
            gA.writeString(str);
            biVar.mo17262he(1, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
