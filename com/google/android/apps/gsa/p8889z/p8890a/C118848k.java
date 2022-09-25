package com.google.android.apps.gsa.p8889z.p8890a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;

/* renamed from: com.google.android.apps.gsa.z.a.k */
/* compiled from: PG */
final class C118848k extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C90908be f331480a;

    /* renamed from: b */
    final /* synthetic */ C118849l f331481b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118848k(C118849l lVar, C90908be beVar) {
        super("TtsAudioPlayer done", 1, 0);
        this.f331481b = lVar;
        this.f331480a = beVar;
    }

    public final void run() {
        synchronized (this.f331481b) {
            C118849l lVar = this.f331481b;
            if (lVar.f331487f == 1) {
                lVar.f331482a = null;
                lVar.f331483b = false;
            }
            lVar.f331487f = 1;
        }
        this.f331480a.run();
    }
}
