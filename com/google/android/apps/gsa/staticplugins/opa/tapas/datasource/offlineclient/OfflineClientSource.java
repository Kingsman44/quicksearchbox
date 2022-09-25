package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.offlineclient;

import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j.C112106d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j.C112110h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;

/* compiled from: PG */
public final class OfflineClientSource extends C113409et {

    /* renamed from: c */
    public static final /* synthetic */ int f310625c = 0;

    /* renamed from: a */
    public final C68214a f310626a;

    /* renamed from: b */
    public final C86124t f310627b;

    /* renamed from: d */
    private final C22871g f310628d;

    /* renamed from: e */
    private final C68214a f310629e;

    public OfflineClientSource(C22871g gVar, C22871g gVar2, C2391v vVar, C68214a aVar, C68214a aVar2, C86124t tVar) {
        this.f310628d = gVar2;
        this.f310626a = aVar;
        this.f310629e = aVar2;
        this.f310627b = tVar;
        gVar.mo28212l("clean up onDestroy", new C111747a(this, vVar));
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.OFFLINE_CLIENT;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C60870cx cxVar;
        C22871g gVar = this.f310628d;
        if (this.f310627b.mo79746e(C90063do.f249402cp)) {
            cxVar = ((C112110h) this.f310629e.mo27525b()).mo99398a(epVar.mo100033p());
        } else {
            cxVar = ((C112106d) this.f310626a.mo27525b()).mo99397a(epVar.mo100033p());
        }
        return gVar.mo28209i(cxVar, "fetch fallback from offline", C111748b.f310633a);
    }
}
