package com.google.android.apps.search.googleapp.googleappbrowser.p10264e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135569b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a.C135572a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139788a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.web.contrib.logging.C43709l;
import com.google.android.libraries.web.contrib.logging.C43711n;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.a */
/* compiled from: PG */
public final class C135571a implements C43713p {

    /* renamed from: a */
    private static final C139789b f369284a;

    /* renamed from: b */
    private final C43367l f369285b;

    /* renamed from: c */
    private final boolean f369286c;

    /* renamed from: d */
    private final C139787a f369287d;

    /* renamed from: e */
    private final C135572a f369288e;

    static {
        C139788a aVar = (C139788a) C139789b.f379928d.createBuilder();
        aVar.copyOnWrite();
        C139789b bVar = (C139789b) aVar.instance;
        bVar.f379930a |= 2;
        bVar.f379932c = false;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder().setIsLandingPage(false).build()");
        f369284a = (C139789b) build;
    }

    public C135571a(C43367l lVar, boolean z, C139787a aVar, C135572a aVar2) {
        this.f369285b = lVar;
        this.f369286c = z;
        this.f369287d = aVar;
        this.f369288e = aVar2;
    }

    /* renamed from: l */
    private static final C139789b m219807l(C43367l lVar) {
        Object obj;
        C139789b bVar;
        C43323b bVar2 = lVar.f113300f;
        if (bVar2 == null) {
            bVar2 = C43323b.f113174a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C135569b.f369276g);
        bVar2.mo58887l(r0);
        Object l = bVar2.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C135569b bVar3 = (C135569b) obj;
        if ((bVar3.f369278a & 4) != 0) {
            bVar = bVar3.f369281d;
            if (bVar == null) {
                bVar = C139789b.f379928d;
            }
        } else {
            bVar = f369284a;
        }
        C69664n.m101060f(bVar, "clientData.getExtension(…ngPageLoggingData\n      }");
        return bVar;
    }

    /* renamed from: a */
    public final void mo32323a(String str, C43709l lVar, C43367l lVar2) {
        C69664n.m101061g(str, "cancelledUrl");
        C69664n.m101061g(lVar2, "originRequest");
        if (m219807l(this.f369285b).f379932c) {
            this.f369288e.mo112390a(C89849ae.CCT_NAVIGATION_ABORTED);
        }
        this.f369287d.mo115240c(m219807l(this.f369285b));
    }

    /* renamed from: b */
    public final void mo32324b(String str, C43367l lVar) {
        C69664n.m101061g(str, "downloadUrl");
        C69664n.m101061g(lVar, "originRequest");
        if (this.f369286c) {
            C139787a aVar = this.f369287d;
            C139789b l = m219807l(this.f369285b);
            C69664n.m101061g(l, "loggingData");
            C37215b bVar = aVar.f379927a;
            C37252a c = C37182a.f98106gT.mo40805c(C62722b.OK);
            C139787a.m227254h(c, l);
            bVar.mo19974a(c);
            return;
        }
        this.f369287d.mo115242e(m219807l(this.f369285b));
    }

    /* renamed from: c */
    public final void mo32325c(String str, C43367l lVar) {
        C69664n.m101061g(str, "intentUrl");
        C69664n.m101061g(lVar, "originRequest");
        this.f369287d.mo115238a(m219807l(this.f369285b));
    }

    /* renamed from: d */
    public final void mo32326d(String str, C43367l lVar) {
        C69664n.m101061g(str, "completedUrl");
        C69664n.m101061g(lVar, "originRequest");
        if (this.f369286c) {
            C139787a aVar = this.f369287d;
            C139789b l = m219807l(this.f369285b);
            C69664n.m101061g(l, "loggingData");
            C37215b bVar = aVar.f379927a;
            C37252a c = C37182a.f98107gU.mo40805c(C62722b.OK);
            C139787a.m227254h(c, l);
            bVar.mo19974a(c);
            return;
        }
        this.f369287d.mo115242e(m219807l(this.f369285b));
    }

    /* renamed from: e */
    public final void mo32327e(String str, C43711n nVar, C43367l lVar) {
        C69664n.m101061g(str, "failedUrl");
        C69664n.m101061g(lVar, "originRequest");
        if (m219807l(this.f369285b).f379932c) {
            this.f369288e.mo112390a(C89849ae.CCT_NAVIGATION_FAILED);
        }
        this.f369287d.mo115241d(m219807l(this.f369285b));
    }

    /* renamed from: f */
    public final void mo32328f(String str, C43367l lVar) {
        C69664n.m101061g(str, "currentUrl");
        C69664n.m101061g(lVar, "originRequest");
        if (m219807l(this.f369285b).f379932c) {
            this.f369288e.mo112390a(C89849ae.CCT_FIRST_CONTENTFUL_PAINT);
        }
        this.f369287d.mo115239b();
        this.f369287d.mo115242e(m219807l(this.f369285b));
    }

    /* renamed from: g */
    public final void mo32329g(C43367l lVar) {
        C69664n.m101061g(lVar, "request");
        int i = lVar.f113299e;
        C43366k kVar = C43366k.UNSPECIFIED;
        if (!m219807l(this.f369285b).f379932c) {
            C43366k a = C43366k.m76517a(lVar.f113299e);
            if (a == null) {
                a = C43366k.UNSPECIFIED;
            }
            switch (a.ordinal()) {
                case 0:
                    this.f369287d.f379927a.mo19974a(C37182a.f98099gM);
                    break;
                case 1:
                    this.f369287d.f379927a.mo19974a(C37182a.f98101gO);
                    break;
                case 2:
                    this.f369287d.f379927a.mo19974a(C37182a.f98100gN);
                    break;
                case 3:
                    this.f369287d.f379927a.mo19974a(C37182a.f98103gQ);
                    break;
                case 4:
                    this.f369287d.f379927a.mo19974a(C37182a.f98104gR);
                    break;
                case 5:
                case 6:
                    this.f369287d.f379927a.mo19974a(C37182a.f98102gP);
                    break;
                case 7:
                    this.f369287d.f379927a.mo19974a(C37182a.f98105gS);
                    break;
            }
        }
        this.f369287d.mo115243f();
    }

    /* renamed from: h */
    public final void mo32330h(String str, String str2, C43367l lVar) {
        C69664n.m101061g(str, "currentUrl");
        C69664n.m101061g(str2, "currentTitle");
        C69664n.m101061g(lVar, "originRequest");
    }

    /* renamed from: i */
    public final /* synthetic */ void mo32331i(C43367l lVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo32332j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo32333k() {
    }
}
