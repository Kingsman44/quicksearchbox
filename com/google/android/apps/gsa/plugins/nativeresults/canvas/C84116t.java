package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84122ab;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84141p;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.t */
/* compiled from: PG */
public final class C84116t implements C68220f {

    /* renamed from: a */
    private final C69464a f229043a;

    public C84116t(C69464a aVar) {
        this.f229043a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        try {
            C84122ab c = ((C84141p) ((C68221g) this.f229043a).f184583a).mo77561c();
            C68225k.m98532d(c);
            return c;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
