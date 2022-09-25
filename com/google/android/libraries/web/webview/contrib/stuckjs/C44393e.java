package com.google.android.libraries.web.webview.contrib.stuckjs;

import androidx.p201w.C4372p;
import androidx.p201w.p202a.C4325ab;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.webview.p3481f.p3482a.C44408a;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44476q;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.contrib.stuckjs.e */
/* compiled from: PG */
public final class C44393e implements C43945v {

    /* renamed from: a */
    private final C43904a f115407a;

    public C44393e(C43904a aVar, C44408a aVar2, C43269t tVar, C44392d dVar) {
        C69664n.m101061g(aVar, "window");
        C69664n.m101061g(aVar2, "webViewCompat");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(dVar, "renderProcessClientFactory");
        this.f115407a = aVar;
        if (C4325ab.m12423b("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            ((C44408a) dVar.f115405a.mo17428b()).getClass();
            Executor executor = (Executor) dVar.f115406b.mo17428b();
            executor.getClass();
            C4372p.m12524c(C44476q.m78577a(aVar).f115616a, new C44391c((StuckJsFeature) tVar.mo46384b().mo46298a(StuckJsFeature.class), executor));
        }
    }
}
