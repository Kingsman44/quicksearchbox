package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84125ae;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84141p;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.u */
/* compiled from: PG */
public final class C84117u implements C68220f {

    /* renamed from: a */
    private final C69464a f229044a;

    public C84117u(C69464a aVar) {
        this.f229044a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        try {
            C84125ae d = ((C84141p) ((C68221g) this.f229044a).f184583a).mo77562d();
            C68225k.m98532d(d);
            return d;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
