package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84141p;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84144s;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.r */
/* compiled from: PG */
public final class C84114r implements C68220f {

    /* renamed from: a */
    private final C69464a f229041a;

    public C84114r(C69464a aVar) {
        this.f229041a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        try {
            C84144s a = ((C84141p) ((C68221g) this.f229041a).f184583a).mo77559a();
            C68225k.m98532d(a);
            return a;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
