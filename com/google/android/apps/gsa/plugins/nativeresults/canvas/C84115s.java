package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84141p;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84150y;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.s */
/* compiled from: PG */
public final class C84115s implements C68220f {

    /* renamed from: a */
    private final C69464a f229042a;

    public C84115s(C69464a aVar) {
        this.f229042a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        try {
            C84150y b = ((C84141p) ((C68221g) this.f229042a).f184583a).mo77560b();
            C68225k.m98532d(b);
            return b;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
