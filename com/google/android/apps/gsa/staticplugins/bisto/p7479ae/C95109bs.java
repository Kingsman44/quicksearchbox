package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89632c;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95550y;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95498a;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95499b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bs */
/* compiled from: PG */
public final class C95109bs implements C95122o, C95117j, C87682aj {

    /* renamed from: a */
    public static final C59071e f266079a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.bs");

    /* renamed from: r */
    private static final C88244um[] f266080r = {C88244um.ON_TRANSCRIPTION_UPDATE, C88244um.SHOW_RECOGNITION_STATE};

    /* renamed from: b */
    public final Context f266081b;

    /* renamed from: c */
    public final C95293ae f266082c;

    /* renamed from: d */
    public final C95295ag f266083d;

    /* renamed from: e */
    public final C95099bi f266084e;

    /* renamed from: f */
    public final C95307m f266085f;

    /* renamed from: g */
    public final C21370a f266086g;

    /* renamed from: h */
    public final C95239o f266087h;

    /* renamed from: i */
    public boolean f266088i;

    /* renamed from: j */
    public boolean f266089j;

    /* renamed from: k */
    public boolean f266090k;

    /* renamed from: l */
    public volatile boolean f266091l;

    /* renamed from: m */
    public C95119l f266092m;

    /* renamed from: n */
    public C95294af f266093n;

    /* renamed from: o */
    public String f266094o;

    /* renamed from: p */
    public C95127t f266095p;

    /* renamed from: q */
    public C95498a f266096q;

    /* renamed from: s */
    private final C22871g f266097s;

    /* renamed from: t */
    private final C95132y f266098t;

    /* renamed from: u */
    private final C95355bf f266099u;

    public C95109bs(Context context, C22871g gVar, C95132y yVar, C95293ae aeVar, C95295ag agVar, C95099bi biVar, C95307m mVar, C21370a aVar, C95239o oVar, C95355bf bfVar) {
        this.f266081b = context;
        this.f266097s = gVar;
        this.f266098t = yVar;
        this.f266082c = aeVar;
        this.f266083d = agVar;
        this.f266084e = biVar;
        this.f266085f = mVar;
        this.f266086g = aVar;
        this.f266087h = oVar;
        this.f266099u = bfVar;
    }

    /* renamed from: b */
    public final void mo89009b(int i, boolean z) {
        this.f266092m = null;
        if (z || i == 0 || i == 4) {
            C95127t tVar = this.f266095p;
            if (tVar != null) {
                tVar.mo89047a();
                this.f266095p = null;
            }
            mo89036e();
            return;
        }
        mo89039h();
    }

    /* renamed from: c */
    public final boolean mo89010c(C94648l lVar) {
        return this.f266092m == lVar;
    }

    /* renamed from: d */
    public final void mo89035d(String str) {
        C59104x b = f266079a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18087)).mo56386p("sendTranscript");
        this.f266082c.mo89219l(14);
        C95498a aVar = this.f266096q;
        this.f266096q = null;
        if (aVar != null) {
            C89632c.m145884b(aVar.f267232a, aVar.f267233b, str, aVar.f267234c);
        }
    }

    /* renamed from: e */
    public final void mo89036e() {
        C58976aa aaVar = C58975e.f156826a;
        mo89037f();
        if (this.f266088i) {
            this.f266093n = null;
            this.f266094o = null;
            this.f266089j = false;
            this.f266088i = false;
            this.f266096q = null;
            this.f266098t.f266157b.mo89057b();
            this.f266087h.f266450d.mo89149b(true);
        }
    }

    /* renamed from: f */
    public final void mo89037f() {
        C95127t tVar = this.f266095p;
        if (tVar != null && this.f266089j) {
            C58976aa aaVar = C58975e.f156826a;
            tVar.mo89047a();
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        this.f266097s.mo28212l("onServiceEvent", new C95108br(this, serviceEventData));
    }

    /* renamed from: g */
    public final void mo89038g(C95455a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f266096q == null) {
            C89655j.m145957a("No callback");
        }
        this.f266093n = null;
        this.f266094o = null;
        this.f266089j = true;
        this.f266088i = true;
        this.f266090k = true;
        this.f266091l = aVar.f267099b;
        this.f266099u.mo89277r(5);
        this.f266087h.f266450d.mo89148a(true);
        C95132y yVar = this.f266098t;
        yVar.f266156a.mo81940l(this, f266080r);
        this.f266098t.mo88916a(aVar.f267098a, C95130w.m157241b(aVar.f267099b));
        if (this.f266091l) {
            this.f266084e.mo89023b();
        }
    }

    /* renamed from: h */
    public final void mo89039h() {
        C59104x b = f266079a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18091)).mo56386p("Transcription failed.");
        C95498a aVar = this.f266096q;
        if (aVar != null) {
            try {
                C59104x c = C95499b.f267235a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ActionHandling");
                ((C59052c) ((C59052c) c).mo56372aa(15132)).mo56386p("Transcription failure");
                ((C95550y) aVar.f267234c).mo89437d();
            } catch (Exception e) {
                C59104x d = f266079a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(18092)).mo56386p("Callback exception");
            }
        }
        mo89036e();
    }

    /* renamed from: ir */
    public final void mo89013ir() {
        C59104x d = f266079a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(18079)).mo56386p("Unexpected call to onQueryAnnouncementDeliveryStop");
    }
}
