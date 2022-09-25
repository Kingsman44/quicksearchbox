package com.google.android.apps.search.googleapp.search.srp.p10438h.p10439a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10412h.C137469b;
import com.google.android.apps.search.googleapp.search.p10412h.C137473d;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.contrib.logging.C43708k;
import com.google.android.libraries.web.contrib.logging.C43709l;
import com.google.android.libraries.web.contrib.logging.C43710m;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60537to;
import p5535j.p5536a.p5545c.p5548c.C71153g;
import p5535j.p5536a.p5545c.p5548c.C71159m;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.h.a.c */
/* compiled from: PG */
public final class C137858c implements C43713p {

    /* renamed from: a */
    private final C89859i f375075a;

    /* renamed from: b */
    private final C137473d f375076b;

    /* renamed from: c */
    private final C137469b f375077c;

    /* renamed from: d */
    private final boolean f375078d;

    /* renamed from: e */
    private final C139708c f375079e;

    /* renamed from: f */
    private final C137542d f375080f;

    /* renamed from: g */
    private final C137852a f375081g;

    /* renamed from: h */
    private boolean f375082h;

    public C137858c(C137542d dVar, C89859i iVar, C137473d dVar2, C137469b bVar, boolean z, C139708c cVar, C137852a aVar) {
        this.f375080f = dVar;
        this.f375075a = iVar;
        this.f375076b = dVar2;
        this.f375077c = bVar;
        this.f375078d = z;
        this.f375079e = cVar;
        this.f375081g = aVar;
    }

    /* renamed from: l */
    private final String m224131l() {
        C137418g gVar = this.f375080f.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        if ((gVar.f373769a & 8192) != 0) {
            return gVar.f373783o;
        }
        return null;
    }

    /* renamed from: m */
    private static boolean m224132m(C137542d dVar) {
        int a = C137540b.m223424a(dVar.f374088b);
        return a != 0 && a == 8;
    }

    /* renamed from: a */
    public final void mo32323a(String str, C43709l lVar, C43367l lVar2) {
        boolean z;
        C71153g gVar;
        C43708k kVar = C43708k.CANCELLING_REQUEST;
        C43362g gVar2 = C43362g.UNSPECIFIED;
        C43710m mVar = C43710m.PAGE_LOAD_ERROR;
        int ordinal = lVar.mo46714a().ordinal();
        if (ordinal != 0) {
            z = ordinal == 1;
        } else {
            C43366k a = C43366k.m76517a(lVar.mo46718b().f113299e);
            if (a == null) {
                a = C43366k.UNSPECIFIED;
            }
            z = a.equals(C43366k.GO_BACK);
        }
        C60537to toVar = z ? C60537to.BACK_PRESSED : C60537to.NEW_QUERY;
        C137473d dVar = this.f375076b;
        C137542d dVar2 = this.f375080f;
        if (C137473d.m223355g(dVar2)) {
            dVar.mo113761b(dVar2, C89849ae.VBUS_ENDSTATE_CANCEL, toVar);
        } else {
            dVar.mo113763d(dVar2, C89849ae.VBUS_ENDSTATE_CANCEL, toVar);
        }
        if (z) {
            gVar = (C71153g) C71159m.f189831i.createBuilder();
            gVar.copyOnWrite();
            C71159m mVar2 = (C71159m) gVar.instance;
            mVar2.f189835b = 2;
            mVar2.f189834a |= 1;
        } else {
            gVar = (C71153g) C71159m.f189831i.createBuilder();
            gVar.copyOnWrite();
            C71159m mVar3 = (C71159m) gVar.instance;
            mVar3.f189835b = 1;
            mVar3.f189834a |= 1;
        }
        this.f375077c.mo113758i(this.f375080f, true != this.f375082h ? 3 : 5, gVar);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo32324b(String str, C43367l lVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo32325c(String str, C43367l lVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo32326d(String str, C43367l lVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32327e(java.lang.String r5, com.google.android.libraries.web.contrib.logging.C43711n r6, com.google.android.libraries.web.p3353c.C43367l r7) {
        /*
            r4 = this;
            com.google.android.libraries.web.contrib.logging.k r5 = com.google.android.libraries.web.contrib.logging.C43708k.CANCELLING_REQUEST
            com.google.android.libraries.web.c.g r5 = com.google.android.libraries.web.p3353c.C43362g.UNSPECIFIED
            com.google.android.libraries.web.contrib.logging.m r5 = com.google.android.libraries.web.contrib.logging.C43710m.PAGE_LOAD_ERROR
            com.google.android.libraries.web.contrib.logging.m r5 = r6.mo46731a()
            int r5 = r5.ordinal()
            r7 = 1
            if (r5 == 0) goto L_0x0030
            if (r5 == r7) goto L_0x0015
            goto L_0x00af
        L_0x0015:
            com.google.android.apps.search.googleapp.search.h.d r5 = r4.f375076b
            com.google.android.apps.search.googleapp.search.k.a.d r6 = r4.f375080f
            com.google.common.o.to r7 = com.google.common.p4552o.C60537to.GENERIC_ERROR
            r5.mo113764e(r6, r7)
            com.google.android.apps.search.googleapp.search.h.b r5 = r4.f375077c
            com.google.android.apps.search.googleapp.search.k.a.d r6 = r4.f375080f
            j.a.c.c.m r7 = p5535j.p5536a.p5545c.p5548c.C71159m.f189831i
            com.google.protobuf.bn r7 = r7.createBuilder()
            j.a.c.c.g r7 = (p5535j.p5536a.p5545c.p5548c.C71153g) r7
            r0 = 12
            r5.mo113758i(r6, r0, r7)
            return
        L_0x0030:
            com.google.android.libraries.web.c.h r5 = r6.mo46732b()
            int r6 = r5.f113278b
            com.google.android.libraries.web.c.g r6 = com.google.android.libraries.web.p3353c.C43362g.m76515a(r6)
            if (r6 != 0) goto L_0x003e
            com.google.android.libraries.web.c.g r6 = com.google.android.libraries.web.p3353c.C43362g.UNSPECIFIED
        L_0x003e:
            int r6 = r6.ordinal()
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r7) goto L_0x0059
            if (r6 == r2) goto L_0x0060
            if (r6 == r1) goto L_0x0056
            if (r6 == r0) goto L_0x0053
            r7 = 6
            if (r6 == r7) goto L_0x0060
            com.google.common.o.to r6 = com.google.common.p4552o.C60537to.UNKNOWN_STATE
            goto L_0x0062
        L_0x0053:
            com.google.common.o.to r6 = com.google.common.p4552o.C60537to.NO_CONNECTIVITY
            goto L_0x0062
        L_0x0056:
            com.google.common.o.to r6 = com.google.common.p4552o.C60537to.WEBVIEW_ERROR
            goto L_0x0062
        L_0x0059:
            boolean r6 = r4.f375078d
            if (r6 != 0) goto L_0x0060
            com.google.common.o.to r6 = com.google.common.p4552o.C60537to.WEBVIEW_ERROR
            goto L_0x0062
        L_0x0060:
            com.google.common.o.to r6 = com.google.common.p4552o.C60537to.SERVER_ERROR
        L_0x0062:
            com.google.android.apps.search.googleapp.search.h.d r7 = r4.f375076b
            com.google.android.apps.search.googleapp.search.k.a.d r3 = r4.f375080f
            r7.mo113764e(r3, r6)
            com.google.android.apps.search.googleapp.search.h.b r6 = r4.f375077c
            com.google.android.apps.search.googleapp.search.k.a.d r7 = r4.f375080f
            r6.mo113754e(r7, r5)
            com.google.android.apps.search.googleapp.search.k.a.d r6 = r4.f375080f
            boolean r6 = m224132m(r6)
            if (r6 == 0) goto L_0x00af
            com.google.android.apps.search.googleapp.t.f.c r6 = r4.f375079e
            java.lang.String r7 = r4.m224131l()
            java.lang.String r3 = "loadError"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r3)
            int r5 = r5.f113278b
            com.google.android.libraries.web.c.g r5 = com.google.android.libraries.web.p3353c.C43362g.m76515a(r5)
            if (r5 != 0) goto L_0x008d
            com.google.android.libraries.web.c.g r5 = com.google.android.libraries.web.p3353c.C43362g.UNSPECIFIED
        L_0x008d:
            int r5 = r5.ordinal()
            r3 = 0
            if (r5 == r2) goto L_0x00aa
            if (r5 == r1) goto L_0x00a4
            if (r5 == r0) goto L_0x009e
            com.google.android.apps.search.googleapp.t.f.b r5 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.SRP_UNKNOWN_FAILURE
            r6.mo115180g(r5, r7, r3)
            return
        L_0x009e:
            com.google.android.apps.search.googleapp.t.f.b r5 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.NETWORK_FAILURE
            r6.mo115180g(r5, r7, r3)
            return
        L_0x00a4:
            com.google.android.apps.search.googleapp.t.f.b r5 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.SRP_SSL_FAILURE
            r6.mo115180g(r5, r7, r3)
            return
        L_0x00aa:
            com.google.android.apps.search.googleapp.t.f.b r5 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.SRP_SERVER_ERROR
            r6.mo115180g(r5, r7, r3)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10438h.p10439a.C137858c.mo32327e(java.lang.String, com.google.android.libraries.web.contrib.logging.n, com.google.android.libraries.web.c.l):void");
    }

    /* renamed from: f */
    public final void mo32328f(String str, C43367l lVar) {
        this.f375077c.mo113751b(m224132m(this.f375080f));
    }

    /* renamed from: g */
    public final void mo32329g(C43367l lVar) {
        C137469b bVar = this.f375077c;
        if (!m224132m(this.f375080f)) {
            bVar.mo113750a(C37182a.f98187hv.mo40779c());
        }
    }

    /* renamed from: h */
    public final void mo32330h(String str, String str2, C43367l lVar) {
        if (this.f375081g.mo114009c(Uri.parse(str))) {
            this.f375076b.mo113764e(this.f375080f, C60537to.CAPTCHA_SHOWN);
            this.f375077c.mo113758i(this.f375080f, 11, (C71153g) C71159m.f189831i.createBuilder());
            return;
        }
        this.f375076b.mo113765f(this.f375080f, C60537to.WEBVIEW_RENDERED);
        this.f375077c.mo113758i(this.f375080f, 1, (C71153g) C71159m.f189831i.createBuilder());
        if (m224132m(this.f375080f)) {
            this.f375079e.mo115179f(C139707b.SRP_SUCCESS, m224131l());
        }
    }

    /* renamed from: i */
    public final void mo32331i(C43367l lVar) {
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        if (a.equals(C43366k.GO_BACK)) {
            this.f375076b.mo113762c(this.f375080f, true);
            this.f375077c.mo113755f(this.f375080f, true);
        } else if (!m224132m(this.f375080f)) {
            this.f375075a.mo83702b(C89849ae.SEARCH_NETWORK_REQUEST_SENT);
            this.f375077c.mo113757h();
        }
    }

    /* renamed from: j */
    public final void mo32332j() {
        this.f375082h = true;
        this.f375077c.mo113753d(m224132m(this.f375080f));
    }

    /* renamed from: k */
    public final void mo32333k() {
        C137542d dVar = this.f375080f;
        int a = C137540b.m223424a(dVar.f374088b);
        if (a == 0 || a != 5) {
            C137473d dVar2 = this.f375076b;
            C89849ae aeVar = C89849ae.FIRST_BYTE_RECEIVED;
            if (!C137473d.m223355g(dVar)) {
                dVar2.mo113760a(dVar, aeVar, (C59687cb) null);
            }
        }
        this.f375077c.mo113752c(m224132m(this.f375080f));
    }
}
