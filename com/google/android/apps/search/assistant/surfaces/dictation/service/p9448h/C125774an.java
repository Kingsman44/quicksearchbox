package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.gsa.binaries.satin.app.C74271sa;
import com.google.android.apps.gsa.binaries.satin.app.C74272sb;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125100ca;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125290t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125375ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125901h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.p9458a.C125904a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125912ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126294ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126310as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126338o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.an */
/* compiled from: PG */
public final class C125774an {

    /* renamed from: a */
    public static final C59071e f346613a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.h.an");

    /* renamed from: o */
    private static final Duration f346614o = Duration.ofSeconds(5);

    /* renamed from: b */
    public final C126310as f346615b;

    /* renamed from: c */
    public final C125937z f346616c;

    /* renamed from: d */
    public final C125912ab f346617d;

    /* renamed from: e */
    public final C125795s f346618e;

    /* renamed from: f */
    public final C125759a f346619f;

    /* renamed from: g */
    public final C126057bv f346620g;

    /* renamed from: h */
    public final C125901h f346621h;

    /* renamed from: i */
    public final C125904a f346622i;

    /* renamed from: j */
    public final C126174c f346623j;

    /* renamed from: k */
    public final boolean f346624k;

    /* renamed from: l */
    public final C60888db f346625l;

    /* renamed from: m */
    public final C125773am f346626m;

    /* renamed from: n */
    public C125290t f346627n = mo107109a();

    /* renamed from: p */
    private final C125777aq f346628p;

    /* renamed from: q */
    private final C74272sb f346629q;

    public C125774an(C126294ac acVar, C126310as asVar, C125937z zVar, C125912ab abVar, C126057bv bvVar, C125795s sVar, C125759a aVar, C74271sa saVar, C125901h hVar, C125904a aVar2, C126174c cVar, C74272sb sbVar, boolean z, C62910ar arVar, C60888db dbVar) {
        C74271sa saVar2 = saVar;
        this.f346628p = new C125777aq(zVar, acVar, (C71422aw) saVar2.f207985a.a.H.mo17428b(), ((C46897i) saVar2.f207985a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45371528").mo50907f(), (C125375ac) saVar2.f207985a.a.d.f201570bc.mo17428b(), (C126338o) saVar2.f207985a.b.f198027a.f199372dl.mo17428b(), (C126174c) saVar2.f207985a.b.f198027a.f199305cX.mo17428b());
        this.f346615b = asVar;
        this.f346616c = zVar;
        this.f346617d = abVar;
        this.f346620g = bvVar;
        this.f346618e = sVar;
        this.f346619f = aVar;
        this.f346621h = hVar;
        this.f346622i = aVar2;
        this.f346623j = cVar;
        this.f346629q = sbVar;
        this.f346624k = z;
        this.f346625l = dbVar;
        this.f346626m = new C125773am(this, C62950b.m95473d(arVar), new C125799w(this));
    }

    /* renamed from: a */
    public final C125290t mo107109a() {
        return new C125290t(this.f346625l, f346614o, new C125761aa(this), (C60950i) this.f346629q.f207986a.a.bC.mo17428b());
    }

    /* renamed from: b */
    public final C60870cx mo107110b(C63122a aVar) {
        return mo107113e(new C125762ab(aVar), new C125763ac(this, aVar));
    }

    /* renamed from: c */
    public final C60870cx mo107111c(C125100ca caVar, C119297s sVar, Duration duration) {
        ((C59052c) ((C59052c) f346613a.mo56224b()).mo56372aa(36668)).mo56389s("Handling DictationStartRequest: sticky=%s [SD]", C126290c.m206496a(Boolean.valueOf(caVar.f345101a)));
        C125777aq aqVar = this.f346628p;
        C69664n.m101061g(caVar, "request");
        C69664n.m101061g(sVar, "requester");
        C69664n.m101061g(duration, "requestedAtElapsedRealtime");
        return C71663i.m104692e(aqVar.f346642a, C71424ay.UNDISPATCHED, new C125775ao(aqVar, caVar, sVar, duration, (C69577g) null), 1);
    }

    /* renamed from: d */
    public final C60870cx mo107112d() {
        ((C59052c) ((C59052c) f346613a.mo56224b()).mo56372aa(36673)).mo56386p("Keyboard closed, ending dictation. [SD]");
        this.f346623j.mo107418q();
        this.f346616c.mo107204c();
        C60870cx e = mo107113e(new C125768ah(C63122a.SUCCESS_KEYBOARD_HIDDEN), C125769ai.f346602a);
        C125765ae aeVar = new C125765ae(this);
        return C60922j.m93045h(e, C47810es.m84966f(aeVar), this.f346625l);
    }

    /* renamed from: e */
    public final C60870cx mo107113e(C60931s sVar, Runnable runnable) {
        C60870cx c = this.f346615b.mo106951c();
        C125801y yVar = new C125801y(sVar, runnable);
        return C60922j.m93045h(c, C47810es.m84966f(yVar), this.f346625l);
    }
}
