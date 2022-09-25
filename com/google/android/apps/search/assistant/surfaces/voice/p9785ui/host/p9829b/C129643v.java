package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129567ai;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129669g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129675m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129624h;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.v */
/* compiled from: PG */
public final class C129643v implements C129566ah {

    /* renamed from: a */
    private static final C59071e f355811a = C59071e.m91331h();

    /* renamed from: b */
    private final C129644w f355812b;

    /* renamed from: c */
    private final C129624h f355813c;

    /* renamed from: d */
    private final C129645x f355814d;

    /* renamed from: e */
    private final C129669g f355815e;

    /* renamed from: f */
    private final C47215a f355816f;

    /* renamed from: g */
    private boolean f355817g;

    public C129643v(C129644w wVar, C129624h hVar, C129645x xVar, C129669g gVar, C47215a aVar) {
        C69664n.m101061g(aVar, "fragmentHost");
        this.f355812b = wVar;
        this.f355813c = hVar;
        this.f355814d = xVar;
        this.f355815e = gVar;
        this.f355816f = aVar;
    }

    /* renamed from: c */
    private final C129636o m211688c() {
        FragmentManager q = this.f355816f.mo51122q();
        C69664n.m101060f(q, "fragmentHost.supportFragmentManager");
        C129578c a = C129647z.m211697a(q);
        if (a != null) {
            return a.mo17754z();
        }
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo109105a(C129676j jVar) {
        C129565ag.m211551a(this, jVar);
    }

    /* renamed from: b */
    public final void mo109106b(C129676j jVar, C34053bp bpVar) {
        NavigatorArgs$Transition navigatorArgs$Transition;
        C69664n.m101061g(jVar, "content");
        C129541aa b = this.f355812b.mo109156b(jVar);
        if (this.f355817g) {
            C59052c cVar = (C59052c) f355811a.mo56224b();
            String b2 = C129567ai.m211555b(this.f355815e.f355877a);
            String b3 = C129567ai.m211555b(b);
            C129662i a = C129662i.m211713a(jVar.f355893b);
            if (a == null) {
                a = C129662i.DEFAULT_NOT_VISIBLE;
            }
            String name = a.name();
            cVar.mo56379ah(new C59094n(38353));
            cVar.mo56359L("Navigation from currentHost: %s is already in progress. Ignoring Navigation to host: %s with content.type: %s", b2, b3, name);
        } else if (!C69664n.m101066l(this.f355815e.f355877a, b)) {
            this.f355817g = true;
            C129636o c = m211688c();
            if (c != null) {
                c.mo109143k();
            }
            C129668f b4 = this.f355813c.mo109135b(this.f355815e.f355878b, jVar);
            C129662i a2 = C129662i.m211713a(this.f355815e.f355878b.f355893b);
            if (a2 == null) {
                a2 = C129662i.DEFAULT_NOT_VISIBLE;
            }
            a2.name();
            C129662i a3 = C129662i.m211713a(jVar.f355893b);
            if (a3 == null) {
                a3 = C129662i.DEFAULT_NOT_VISIBLE;
            }
            a3.name();
            b4.name();
            C129636o c2 = m211688c();
            if (c2 != null) {
                C129675m mVar = new C129675m(new C129630i(c2, b4));
                C129675m d = c2.mo109138d();
                if (d != null) {
                    d.mo109187a();
                }
                c2.f355798r.mo42045b(C129636o.f355778a[3], mVar);
                navigatorArgs$Transition = new NavigatorArgs$Transition(mVar, b4);
            } else {
                navigatorArgs$Transition = null;
            }
            this.f355814d.mo109157c(new C129669g(b, jVar, navigatorArgs$Transition, (C34053bp) null));
        } else if (!C69664n.m101066l(this.f355815e.f355878b, jVar)) {
            C129636o c3 = m211688c();
            if (c3 != null) {
                C69664n.m101061g(jVar, "content");
                C129668f b5 = c3.f355785e.mo109135b(c3.mo109137c().f355878b, jVar);
                c3.mo109140f();
                C129662i a4 = C129662i.m211713a(c3.mo109137c().f355878b.f355893b);
                if (a4 == null) {
                    a4 = C129662i.DEFAULT_NOT_VISIBLE;
                }
                a4.name();
                C129662i a5 = C129662i.m211713a(jVar.f355893b);
                if (a5 == null) {
                    a5 = C129662i.DEFAULT_NOT_VISIBLE;
                }
                a5.name();
                b5.name();
                Fragment c4 = c3.f355783c.getChildFragmentManager().f634a.mo671c("ROOT_FRAGMENT");
                Fragment a6 = c3.mo109136a(jVar);
                c3.mo109146n(C129669g.m211718b(c3.mo109137c(), (C129541aa) null, jVar, 13));
                if (c4 == null) {
                    c3.mo109142h(a6, false);
                } else {
                    c3.mo109147o(C71803m.m105043d(c3.f355793m, (C69585o) null, (C71424ay) null, new C129635n(c3, c4, a6, b5, (C69577g) null), 3));
                }
            }
            this.f355817g = true;
        }
    }
}
