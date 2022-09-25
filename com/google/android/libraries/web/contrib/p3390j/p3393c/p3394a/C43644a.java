package com.google.android.libraries.web.contrib.p3390j.p3393c.p3394a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72330az;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72606bo;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72615d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.j.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C43644a implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C43644a f113892a = new C43644a();

    private /* synthetic */ C43644a() {
    }

    public final void accept(Object obj) {
        C72606bo b = ((C72615d) obj).mo64483b();
        Bundle bundle = new Bundle();
        C72604bm.m107399a();
        if (C72611bt.m107413a() >= 95) {
            try {
                C72330az azVar = b.f193155a;
                Parcel gA = azVar.mo17260gA();
                C8850c.m23497f(gA, bundle);
                azVar.mo17262he(3, gA);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
