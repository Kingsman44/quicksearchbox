package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.Uri;
import android.webkit.WebSettings;
import androidx.p201w.C4364h;
import androidx.p201w.C4365i;
import androidx.p201w.C4366j;
import androidx.p201w.C4370n;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4348q;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.C85676c;
import com.google.android.apps.gsa.search.core.C85759d;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.service.C86776s;
import com.google.android.apps.gsa.search.core.webview.C87275u;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.android.apps.gsa.shared.p6968aa.C89017ao;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.C90776bt;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21603c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59336s;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.u */
/* compiled from: PG */
final class C102495u extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C102464ah f286068a;

    /* renamed from: b */
    private final C60870cx f286069b;

    /* renamed from: c */
    private final Request f286070c;

    /* renamed from: d */
    private boolean f286071d = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102495u(C102464ah ahVar, Request request, C60870cx cxVar) {
        super("ContentListener");
        this.f286068a = ahVar;
        this.f286070c = request;
        this.f286069b = cxVar;
        ahVar.f285956i.mo85147l(cxVar, this);
    }

    /* renamed from: c */
    public final void mo93313c() {
        this.f286071d = true;
        this.f286069b.cancel(true);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f286071d || (th instanceof CancellationException)) {
            return;
        }
        if (th instanceof C89017ao) {
            String str = ((C89017ao) th).f241232b;
            if (this.f286068a.f285951d.mo79575p(str).mo56113h()) {
                ((C59052c) ((C59052c) ((C59052c) C102464ah.f285948a.mo56226d()).mo56382g(th)).mo56372aa(20805)).mo56386p("Passing Velvet-compatible redirect url to Velvet");
                this.f286068a.mo93271b(str, this.f286070c.f236602c);
                this.f286068a.f285949b.f54539k.mo24855e();
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C102464ah.f285948a.mo56226d()).mo56382g(th)).mo56372aa(20804)).mo56386p("Unexpected exception from UriRequestMaker");
        this.f286068a.mo93274e();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Uri data;
        C102456a aVar = (C102456a) obj;
        if (!this.f286071d) {
            C102464ah ahVar = this.f286068a;
            Request request = this.f286070c;
            boolean z = true;
            C58838bb.m90883r(ahVar.f285959l.mo93254a() == request);
            C102488n nVar = ahVar.f285949b;
            C90476a aVar2 = C91018d.f254254a;
            C102483i iVar = new C102483i(nVar.f54539k);
            iVar.setFocusable(true);
            iVar.setFocusableInTouchMode(true);
            WebSettings settings = iVar.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccess(false);
            Intent b = nVar.f54539k.mo24853b();
            if (b != null && b.getBooleanExtra("WEBVIEW_DISABLE_HARDWARE_ACCELERATION", false)) {
                settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
                iVar.setLayerType(1, new Paint());
            }
            Intent b2 = nVar.f54539k.mo24853b();
            C4370n nVar2 = null;
            if (b2 != null && (data = b2.getData()) != null && C90772bp.m148276C(data) && b2.getBooleanExtra("WEBVIEW_ALLOW_FILE_URL_ACCESS", false)) {
                ArrayList arrayList = new ArrayList();
                C4366j.m12516a("/assets/", new C4365i(iVar.getContext()), arrayList);
                nVar2 = C4366j.m12517b(arrayList);
            }
            Intent b3 = nVar.f54539k.mo24853b();
            boolean z2 = b3 != null && b3.getBooleanExtra("inappwebpage-dark-mode-allowed", false);
            int i = nVar.f54539k.getResources().getConfiguration().uiMode & 48;
            if (z2 && i == 32 && C4325ab.m12423b("FORCE_DARK") && C4325ab.m12423b("FORCE_DARK_STRATEGY")) {
                C4348q.m12489d(settings, 2);
                C4364h.m12514a(settings, 2);
            }
            nVar.f286044d.mo79412c(iVar);
            C90776bt.m148327a();
            iVar.setVisibility(8);
            nVar.f286043c.addView(iVar);
            C87278x xVar = new C87278x(iVar, nVar2);
            C102469am amVar = ahVar.f285952e;
            C102475as asVar = new C102475as(amVar.f285978b, amVar.f285979c, xVar, request, aVar, amVar.f285980d);
            C85759d dVar = amVar.f285982f;
            C91097g gVar = amVar.f285977a;
            C86776s sVar = amVar.f285981e;
            asVar.f285991c.f235736a.setWebViewClient(new C102471ao(asVar));
            asVar.f285991c.f235736a.setWebChromeClient(new C102470an(asVar));
            C102466aj ajVar = new C102466aj(asVar, gVar, sVar);
            C118575h hVar = C118575h.JS_EXTENSIONS_INAPPWEBPAGE;
            hVar.getClass();
            Context context = (Context) dVar.f231889a.mo17428b();
            context.getClass();
            PackageManager packageManager = (PackageManager) dVar.f231890b.mo17428b();
            packageManager.getClass();
            ((C85929cw) dVar.f231891c.mo17428b()).getClass();
            C85923cq cqVar = (C85923cq) dVar.f231892d.mo17428b();
            cqVar.getClass();
            C68214a a = C68219e.m98518a(((C68226l) dVar.f231893e).f184585a);
            a.getClass();
            C68214a a2 = C68219e.m98518a(((C68226l) dVar.f231894f).f184585a);
            a2.getClass();
            C68214a a3 = C68219e.m98518a(((C68226l) dVar.f231895g).f184585a);
            a3.getClass();
            C68214a a4 = C68219e.m98518a(((C68226l) dVar.f231896h).f184585a);
            a4.getClass();
            ((C21601a) dVar.f231897i.mo17428b()).getClass();
            ((C21603c) dVar.f231898j.mo17428b()).getClass();
            ((C90476a) dVar.f231899k.mo17428b()).getClass();
            C21370a aVar3 = (C21370a) dVar.f231900l.mo17428b();
            aVar3.getClass();
            C118827a aVar4 = (C118827a) dVar.f231901m.mo17428b();
            aVar4.getClass();
            asVar.f285991c.f235736a.addJavascriptInterface(new C85676c(hVar, C87275u.f235733a, ajVar, context, packageManager, cqVar, a, a2, a3, a4, aVar3, aVar4, ajVar.f285967a, new C102472ap(ajVar.f285969c)), "agsa_ext");
            C102462af afVar = new C102462af(ahVar, new C102497w(ahVar, ahVar.f285960m, asVar));
            C58838bb.m90883r(asVar.f285996h == null);
            asVar.f285996h = afVar;
            C102481g gVar2 = ahVar.f285953f;
            if (gVar2.f286031c != null) {
                z = false;
            }
            C58838bb.m90883r(z);
            gVar2.f286031c = asVar;
            asVar.f285996h.getClass();
            try {
                if (asVar.f285991c.f235739d != null) {
                    if (C90772bp.m148276C(asVar.f285998j.f236600a)) {
                        asVar.f285991c.mo80925d(C90772bp.m148309q(asVar.f285994f));
                        return;
                    }
                }
                if (C90772bp.m148278E(asVar.f285998j.f236600a)) {
                    C87278x xVar2 = asVar.f285991c;
                    xVar2.f235737b.incrementAndGet();
                    xVar2.f235738c.incrementAndGet();
                    xVar2.f235736a.loadDataWithBaseURL(asVar.f285994f, C59336s.m92218a(new InputStreamReader(asVar.f285993e.f285933a.mo81512b())).toString(), (String) C58833ax.m90833j(asVar.f285993e.f285933a.f236338c.f241307b).mo56109e("text/html"), (String) null, (String) null);
                    return;
                }
                asVar.f285991c.mo80925d(asVar.f285994f);
            } catch (Exception unused) {
            }
        }
    }
}
