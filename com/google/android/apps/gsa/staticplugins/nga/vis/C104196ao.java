package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.app.DirectAction;
import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.service.voice.VoiceInteractionSession;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gsa.nga.api.C74721by;
import com.google.android.apps.gsa.nga.api.C74722bz;
import com.google.android.apps.gsa.nga.api.C74742z;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80970b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80991k;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80992l;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80996p;
import com.google.android.apps.gsa.nga.shared.p6334b.C81015a;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81558a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81559b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81566i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.vis.p8097a.C104171c;
import com.google.android.apps.gsa.staticplugins.nga.vis.p8097a.C104176h;
import com.google.android.apps.gsa.staticplugins.opa.C109714ms;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120032q;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120035t;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121663t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33500a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33507a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33510d;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.ao */
/* compiled from: PG */
public final class C104196ao extends VoiceInteractionSession implements C81566i, C81559b, C104205e, C33504b {

    /* renamed from: f */
    public static final /* synthetic */ int f289808f = 0;

    /* renamed from: g */
    private static final C58974d f289809g = C58974d.m91134h("NgaVisSearch");

    /* renamed from: h */
    private static final C58528ij f289810h = C58528ij.m90011K("and.opa.shellapp", "and.gsa.launcher.shortcut.voice");

    /* renamed from: A */
    private C33510d f289811A;

    /* renamed from: B */
    private C80991k f289812B;

    /* renamed from: C */
    private C74721by f289813C;

    /* renamed from: D */
    private boolean f289814D = true;

    /* renamed from: E */
    private boolean f289815E = true;

    /* renamed from: F */
    private final C109714ms f289816F;

    /* renamed from: G */
    private final C81016b f289817G;

    /* renamed from: a */
    public final C120124o f289818a;

    /* renamed from: b */
    public final C104203c f289819b;

    /* renamed from: c */
    public final C104176h f289820c;

    /* renamed from: d */
    public final Set f289821d;

    /* renamed from: e */
    public final C121663t f289822e;

    /* renamed from: i */
    private final C22871g f289823i;

    /* renamed from: j */
    private final C80992l f289824j;

    /* renamed from: k */
    private final C74722bz f289825k;

    /* renamed from: l */
    private final C91142g f289826l;

    /* renamed from: m */
    private final C104171c f289827m;

    /* renamed from: n */
    private final Context f289828n;

    /* renamed from: o */
    private final C74742z f289829o;

    /* renamed from: p */
    private final C103335ap f289830p;

    /* renamed from: q */
    private final C80970b f289831q;

    /* renamed from: r */
    private final boolean f289832r;

    /* renamed from: s */
    private final C22871g f289833s;

    /* renamed from: t */
    private final Optional f289834t;

    /* renamed from: u */
    private final C80996p f289835u;

    /* renamed from: v */
    private final C22871g f289836v;

    /* renamed from: w */
    private final C83314ii f289837w;

    /* renamed from: x */
    private final C22871g f289838x;

    /* renamed from: y */
    private final C47770dh f289839y;

    /* renamed from: z */
    private C81558a f289840z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104196ao(Context context, Bundle bundle, C74742z zVar, C22871g gVar, C109714ms msVar, C74722bz bzVar, C80992l lVar, C91142g gVar2, C104171c cVar, C103335ap apVar, C80970b bVar, C104176h hVar, C104203c cVar2, C22871g gVar3, Optional optional, C80996p pVar, Set set, C22871g gVar4, C83314ii iiVar, C121663t tVar, C81016b bVar2, C90821bm bmVar, C47770dh dhVar) {
        super(context);
        Bundle bundle2 = bundle;
        this.f289828n = context;
        this.f289823i = gVar;
        this.f289816F = msVar;
        this.f289825k = bzVar;
        this.f289824j = lVar;
        this.f289826l = gVar2;
        this.f289827m = cVar;
        this.f289829o = zVar;
        this.f289830p = apVar;
        this.f289831q = bVar;
        this.f289820c = hVar;
        this.f289832r = bundle.getBoolean("vis_events_callback_first_show_handled", false);
        this.f289818a = C120032q.m198936a(bundle, C120124o.CLASSIC);
        this.f289819b = cVar2;
        this.f289833s = gVar3;
        this.f289834t = optional;
        this.f289835u = pVar;
        this.f289821d = set;
        this.f289836v = gVar4;
        this.f289837w = iiVar;
        this.f289822e = tVar;
        this.f289817G = bVar2;
        this.f289838x = bmVar.mo85163a(C104195an.class);
        this.f289839y = dhVar;
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21852)).mo56386p("constructor");
    }

    /* renamed from: m */
    private final Optional m172164m(Bundle bundle, String str) {
        if (bundle == null || !m172170s(bundle, str)) {
            return Optional.empty();
        }
        Intent intent = (Intent) bundle.getParcelable(str);
        if (intent == null) {
            return Optional.empty();
        }
        intent.setExtrasClassLoader(getClass().getClassLoader());
        return Optional.m71637of(intent);
    }

    /* renamed from: n */
    private final void m172165n() {
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21855)).mo56386p("disableUi");
        this.f289814D = false;
        setUiEnabled(false);
        m172167p(false);
    }

    /* renamed from: o */
    private final void m172166o(C90919bp bpVar) {
        C81558a aVar = this.f289840z;
        if (aVar != null) {
            bpVar.mo17870a(aVar);
        }
    }

    /* renamed from: p */
    private final void m172167p(boolean z) {
        this.f289836v.mo28212l("[NGA] AssistUI Visible", new C104191aj(this, z));
    }

    /* renamed from: q */
    private final void m172168q(Bundle bundle, int i) {
        Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
        if (!C120035t.m198938a(bundle2, this.f289818a).f334197b) {
            mo93988j(new C104192ak(bundle, i));
            return;
        }
        ((C58970a) ((C58970a) f289809g.mo56226d()).mo56372aa(21884)).mo56389s("Unexpected invocation at classic session (%s), doing re-issue.", bundle);
        finish();
        C81015a aVar = new C81015a();
        aVar.mo74794b(bundle2, i);
        this.f289817G.mo74800a(aVar.mo74793a());
    }

    /* renamed from: r */
    private final void m172169r(Intent intent) {
        try {
            startAssistantActivity(intent);
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f289809g.mo56226d()).mo56382g(e)).mo56372aa(21888)).mo56386p("Unable to start assistant activity.");
        }
    }

    /* renamed from: s */
    private static boolean m172170s(Bundle bundle, String str) {
        return bundle != null && bundle.containsKey(str);
    }

    /* renamed from: a */
    public final void mo75146a(Intent intent) {
        m172169r(intent);
    }

    /* renamed from: b */
    public final Window mo75174b() {
        return getWindow().getWindow();
    }

    /* renamed from: c */
    public final void mo75175c() {
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21854)).mo56386p("disableAssistUiWindow");
        m172165n();
    }

    /* renamed from: d */
    public final void mo75176d() {
        C58974d dVar = f289809g;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21856)).mo56386p("enableAssistUiWindow");
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21857)).mo56386p("enableUi");
        this.f289814D = true;
        setUiEnabled(true);
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_ARG_ENABLE_UI_ONLY", true);
        show(bundle, 0);
        m172167p(true);
    }

    /* renamed from: e */
    public final void mo75177e() {
        finish();
    }

    /* renamed from: f */
    public final void mo75178f(View view) {
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21886)).mo56386p("setAssistUiView");
        setContentView(view);
    }

    /* renamed from: g */
    public final void mo93986g() {
        this.f289823i.mo28212l("[NGA] finishSession", new C104221u(this));
    }

    /* renamed from: h */
    public final void mo38925h(DirectAction directAction, Bundle bundle, CancellationSignal cancellationSignal, Executor executor, C33500a aVar) {
        Objects.requireNonNull(aVar);
        performDirectAction(directAction, bundle, cancellationSignal, executor, Consumer.Wrapper.convert(new C104215o(aVar)));
    }

    public final void hide() {
        C58974d dVar = f289809g;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21859)).mo56386p("hide");
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21860)).mo56386p("hideInternal");
        this.f289815E = false;
        if (this.f289814D) {
            m172166o(C104211k.f289882a);
            m172165n();
        }
        super.hide();
        this.f289822e.mo74758o();
    }

    /* renamed from: i */
    public final void mo38926i(VoiceInteractionSession.ActivityId activityId, CancellationSignal cancellationSignal, Executor executor, C33500a aVar) {
        Objects.requireNonNull(aVar);
        requestDirectActions(activityId, cancellationSignal, executor, Consumer.Wrapper.convert(new C104220t(aVar)));
    }

    /* renamed from: j */
    public final void mo93988j(C104194am amVar) {
        if (this.f289826l.mo85405j(C90126fx.f251502jy)) {
            this.f289838x.mo28212l("[NGA] sendVisEventOrFinish", new C104226z(this, amVar));
        } else {
            mo93989k(amVar);
        }
    }

    /* renamed from: k */
    public final void mo93989k(C104194am amVar) {
        try {
            this.f289837w.mo75556c(2, 0, 2);
            amVar.mo93985a(this.f289829o);
        } catch (RemoteException e) {
            this.f289837w.mo75557d(2, 0, String.format("Failed to send message to remote callback: %s, %s.", new Object[]{e.getMessage(), e.getCause()}));
            ((C58970a) ((C58970a) ((C58970a) f289809g.mo56225c()).mo56382g(e)).mo56372aa(21885)).mo56386p("Failed to send message to remote callback. Finishing.");
            finish();
        }
    }

    /* renamed from: l */
    public final void mo38927l(VoiceInteractionSession.Insets insets) {
        ((C58970a) ((C58970a) f289809g.mo56226d()).mo56372aa(21887)).mo56386p("APA setInsets is not expected to be used in NgaVis");
    }

    public final void onBackPressed() {
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21864)).mo56386p("onBackPressed");
        C81558a aVar = this.f289840z;
        if (aVar != null && !aVar.mo75145h()) {
            super.onBackPressed();
        }
        mo93988j(C104185ad.f289793a);
    }

    public final void onCloseSystemDialogs() {
        mo93988j(C104218r.f289889a);
    }

    public final void onComputeInsets(VoiceInteractionSession.Insets insets) {
        m172166o(new C104212l(insets));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21865)).mo56386p("onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        C81558a aVar = this.f289840z;
        if (aVar != null) {
            aVar.mo75139b(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0138 A[SYNTHETIC, Splitter:B:20:0x0138] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r27 = this;
            r15 = r27
            com.google.apps.tiktok.tracing.dh r0 = r15.f289839y
            java.lang.String r1 = "onCreate"
            com.google.apps.tiktok.tracing.ax r25 = r0.mo51613c(r1)
            com.google.common.f.a.d r0 = f289809g     // Catch:{ all -> 0x0133 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0133 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0133 }
            r2 = 21866(0x556a, float:3.0641E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0133 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0133 }
            r0.mo56386p(r1)     // Catch:{ all -> 0x0133 }
            super.onCreate()     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.v.ii r0 = r15.f289837w     // Catch:{ all -> 0x0133 }
            r1 = 4
            r0.mo75554a(r1)     // Catch:{ all -> 0x0133 }
            j$.util.Optional r0 = r15.f289834t     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.vis.af r1 = com.google.android.apps.gsa.staticplugins.nga.vis.C104187af.f289795a     // Catch:{ all -> 0x0133 }
            r0.ifPresent(r1)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.search.assistant.platform.j.a.t r0 = r15.f289822e     // Catch:{ all -> 0x0133 }
            r0.mo74754k(r15)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.vis.ag r0 = new com.google.android.apps.gsa.staticplugins.nga.vis.ag     // Catch:{ all -> 0x0133 }
            r0.<init>(r15)     // Catch:{ all -> 0x0133 }
            r15.mo93988j(r0)     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d r0 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.vis.ah r1 = new com.google.android.apps.gsa.staticplugins.nga.vis.ah     // Catch:{ all -> 0x0133 }
            r1.<init>(r15)     // Catch:{ all -> 0x0133 }
            r0.<init>(r1)     // Catch:{ all -> 0x0133 }
            r15.f289811A = r0     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ap.l r0 = r15.f289824j     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ap.k r1 = new com.google.android.apps.gsa.nga.shared.ap.k     // Catch:{ all -> 0x0133 }
            g.a.a r0 = r0.f222011a     // Catch:{ all -> 0x0133 }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.gsa.k.g r0 = (com.google.android.libraries.gsa.p1876k.C22871g) r0     // Catch:{ all -> 0x0133 }
            r0.getClass()     // Catch:{ all -> 0x0133 }
            r1.<init>(r15, r0)     // Catch:{ all -> 0x0133 }
            r15.f289812B = r1     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ao.b r0 = r15.f289831q     // Catch:{ all -> 0x0133 }
            r0.mo74748i(r1)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.j.ap r0 = r15.f289830p     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ap.i r1 = new com.google.android.apps.gsa.nga.shared.ap.i     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ap.k r2 = r15.f289812B     // Catch:{ all -> 0x0133 }
            r1.<init>(r2)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.j.ba r0 = r0.f288119a     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.j.v r2 = new com.google.android.apps.gsa.staticplugins.nga.j.v     // Catch:{ all -> 0x0133 }
            r2.<init>(r1)     // Catch:{ all -> 0x0133 }
            r0.mo93770d(r2)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.vis.a.c r0 = r15.f289827m     // Catch:{ all -> 0x0133 }
            android.content.Context r1 = r15.f289828n     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.o.a r2 = r0.f289768o     // Catch:{ all -> 0x0133 }
            android.content.Context r2 = r2.mo75409a(r1)     // Catch:{ all -> 0x0133 }
            android.content.Context r3 = r0.f289754a     // Catch:{ all -> 0x0133 }
            j$.util.Optional r6 = r0.f289767n     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.gsa.k.g r7 = r0.f289756c     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.gsa.k.g r8 = r0.f289759f     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.gsa.k.g r9 = r0.f289758e     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.gsa.k.g r10 = r0.f289757d     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.gsa.k.g r11 = r0.f289760g     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.shared.util.v.g r12 = r0.f289755b     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.i.g r4 = r0.f289770q     // Catch:{ all -> 0x0133 }
            com.google.android.libraries.animation.impl.f r13 = r0.f289771r     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.h r14 = r0.f289762i     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.vis.a.h r5 = r0.f289766m     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.staticplugins.nga.vis.a.m r4 = r0.f289763j     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.shared.u.c r15 = r0.f289764k     // Catch:{ all -> 0x012f }
            r16 = r4
            com.google.android.apps.gsa.nga.shared.v.w r4 = r0.f289765l     // Catch:{ all -> 0x012f }
            r17 = r4
            com.google.android.apps.gsa.staticplugins.nga.vis.a.a r4 = r0.f289761h     // Catch:{ all -> 0x012f }
            r18 = r4
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r4 = r0.f289773t     // Catch:{ all -> 0x012f }
            r19 = r4
            com.google.android.apps.gsa.shared.y.ao r4 = r0.f289772s     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.shared.y.at r1 = r4.mo85410a(r1)     // Catch:{ all -> 0x012f }
            j$.util.Optional r22 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ all -> 0x012f }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.g.a.c r4 = r0.f289774u     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.nga.shared.v.i r0 = r0.f289769p     // Catch:{ all -> 0x012f }
            j$.util.Optional r24 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x012f }
            r2.getClass()
            r3.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r5.getClass()
            r15.getClass()
            r17.getClass()
            r18.getClass()
            r19.getClass()
            r22.getClass()
            r24.getClass()
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.c.a r0 = new com.google.android.apps.gsa.nga.shared.ui.assistlayer.c.a     // Catch:{ all -> 0x012f }
            r1 = r0
            r23 = r4
            r20 = r18
            r21 = r19
            r19 = r17
            r17 = r16
            r4 = r27
            r16 = r5
            r5 = r27
            r18 = r14
            r26 = r15
            r15 = r18
            r18 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x012f }
            g.a.a r0 = r0.f223030a     // Catch:{ all -> 0x012f }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.a r0 = (com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81558a) r0     // Catch:{ all -> 0x012f }
            r1 = r27
            r1.f289840z = r0     // Catch:{ all -> 0x012d }
            r0.mo75140c()     // Catch:{ all -> 0x012d }
            com.google.android.libraries.gsa.k.g r0 = r1.f289838x     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.staticplugins.nga.vis.w r2 = new com.google.android.apps.gsa.staticplugins.nga.vis.w     // Catch:{ all -> 0x012d }
            r2.<init>(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r3 = "[NGA] checkEligibilityInBackground"
            r0.mo28212l(r3, r2)     // Catch:{ all -> 0x012d }
            if (r25 == 0) goto L_0x012c
            r25.close()
        L_0x012c:
            return
        L_0x012d:
            r0 = move-exception
            goto L_0x0135
        L_0x012f:
            r0 = move-exception
            r1 = r27
            goto L_0x0135
        L_0x0133:
            r0 = move-exception
            r1 = r15
        L_0x0135:
            r2 = r0
            if (r25 == 0) goto L_0x0141
            r25.close()     // Catch:{ all -> 0x013c }
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.gsa.staticplugins.nga.vis.C104206f.m172192a(r2, r3)
        L_0x0141:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.vis.C104196ao.onCreate():void");
    }

    public final void onDestroy() {
        C47538ax c = this.f289839y.mo51613c("onDestroy");
        try {
            ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21867)).mo56386p("onDestroy");
            C22871g gVar = this.f289838x;
            C104203c cVar = this.f289819b;
            Objects.requireNonNull(cVar);
            gVar.mo28212l("[NGA] clearEligibilityListener", new C104182aa(cVar));
            this.f289822e.mo74755l();
            C80991k kVar = this.f289812B;
            if (kVar != null) {
                this.f289831q.mo74744e(kVar);
            }
            this.f289831q.mo74745f();
            m172166o(C104183ab.f289791a);
            mo93988j(C104184ac.f289792a);
            super.onDestroy();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C104206f.m172192a(th, th);
        }
        throw th;
    }

    public final void onDirectActionsInvalidated(VoiceInteractionSession.ActivityId activityId) {
        super.onDirectActionsInvalidated(activityId);
        mo93988j(new C104224x(activityId));
        this.f289822e.mo74756m(activityId);
    }

    public final void onHandleAssist(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent) {
        C33510d dVar = this.f289811A;
        if (dVar != null) {
            dVar.mo38940b(new C33507a(bundle, assistStructure, assistContent, (VoiceInteractionSession.ActivityId) null, (String) null, 0, (Integer) null));
        }
    }

    public final void onHandleAssistSecondary(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, int i2) {
        C33510d dVar = this.f289811A;
        if (dVar == null) {
            return;
        }
        if (i <= 0 || i2 < i + 1) {
            ((C58970a) C33510d.f89661a.mo56226d()).mo56393w("onHandleAssistSecondary called with index = %s, count=%s, ignoring.", i, i2);
            return;
        }
        dVar.mo38940b(new C33507a(bundle, assistStructure, assistContent, (VoiceInteractionSession.ActivityId) null, (String) null, i, Integer.valueOf(i2)));
    }

    public final void onHandleScreenshot(Bitmap bitmap) {
        this.f289833s.mo28212l("[NGA] onHandleScreenshot", new C104219s(this, bitmap));
    }

    public final void onHide() {
        C47538ax c = this.f289839y.mo51613c("onHide");
        try {
            super.onHide();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C104206f.m172192a(th, th);
        }
        throw th;
    }

    public final void onLockscreenShown() {
        ((C58970a) ((C58970a) f289809g.mo56224b()).mo56372aa(21869)).mo56386p("onLockscreenShown");
        C81558a aVar = this.f289840z;
        if (aVar != null && !aVar.mo75145h()) {
            super.onLockscreenShown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        if (((java.lang.Boolean) m172164m(r9, "com.google.voicesearch.VI_INTENT").flatMap(com.google.android.apps.gsa.staticplugins.nga.vis.C104216p.f289887a).map(com.google.android.apps.gsa.staticplugins.nga.vis.C104217q.f289888a).orElse(true)).booleanValue() != false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0143 A[Catch:{ SecurityException -> 0x01a5, Exception -> 0x0187, all -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014d A[Catch:{ SecurityException -> 0x01a5, Exception -> 0x0187, all -> 0x0291 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onShow(android.os.Bundle r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "invocation_type"
            java.lang.String r1 = "START_VOICE_ACTIVITY_INTENT"
            com.google.apps.tiktok.tracing.dh r2 = r8.f289839y
            java.lang.String r3 = "onShow"
            com.google.apps.tiktok.tracing.ax r2 = r2.mo51613c(r3)
            super.onShow(r9, r10)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.d r3 = f289809g     // Catch:{ all -> 0x0291 }
            com.google.common.f.x r4 = r3.mo56224b()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4     // Catch:{ all -> 0x0291 }
            r5 = 21871(0x556f, float:3.0648E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4     // Catch:{ all -> 0x0291 }
            java.lang.String r5 = "onShow called"
            r4.mo56386p(r5)     // Catch:{ all -> 0x0291 }
            boolean r4 = m172170s(r9, r0)     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x0041
            com.google.common.f.x r4 = r3.mo56224b()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4     // Catch:{ all -> 0x0291 }
            r5 = 21881(0x5579, float:3.0662E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4     // Catch:{ all -> 0x0291 }
            java.lang.String r5 = "invocation_type: %s"
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0291 }
            r4.mo56387q(r5, r0)     // Catch:{ all -> 0x0291 }
        L_0x0041:
            j$.util.Optional r0 = r8.f289834t     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.staticplugins.nga.vis.al r4 = com.google.android.apps.gsa.staticplugins.nga.vis.C104193al.f289807a     // Catch:{ all -> 0x0291 }
            r0.ifPresent(r4)     // Catch:{ all -> 0x0291 }
            r0 = 0
            if (r9 == 0) goto L_0x0059
            java.lang.String r4 = "nga_only_create_session"
            boolean r4 = r9.getBoolean(r4, r0)     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x0059
            if (r2 == 0) goto L_0x0058
            r2.close()
        L_0x0058:
            return
        L_0x0059:
            com.google.android.apps.gsa.staticplugins.nga.vis.g r4 = com.google.android.apps.gsa.staticplugins.nga.vis.C104207g.f289878a     // Catch:{ all -> 0x0291 }
            r8.m172166o(r4)     // Catch:{ all -> 0x0291 }
            if (r9 != 0) goto L_0x0065
            j$.util.Optional r4 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0291 }
            goto L_0x0075
        L_0x0065:
            java.lang.String r4 = "nga_assist_ui_client"
            android.os.Bundle r4 = r9.getBundle(r4)     // Catch:{ all -> 0x0291 }
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.staticplugins.nga.vis.v r5 = com.google.android.apps.gsa.staticplugins.nga.vis.C104222v.f289894a     // Catch:{ all -> 0x0291 }
            j$.util.Optional r4 = r4.map(r5)     // Catch:{ all -> 0x0291 }
        L_0x0075:
            boolean r5 = r4.isPresent()     // Catch:{ all -> 0x0291 }
            if (r5 == 0) goto L_0x008c
            r4.get()     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.staticplugins.nga.vis.h r9 = new com.google.android.apps.gsa.staticplugins.nga.vis.h     // Catch:{ all -> 0x0291 }
            r9.<init>(r4)     // Catch:{ all -> 0x0291 }
            r8.m172166o(r9)     // Catch:{ all -> 0x0291 }
            if (r2 == 0) goto L_0x008b
            r2.close()
        L_0x008b:
            return
        L_0x008c:
            com.google.android.apps.gsa.nga.shared.v.ii r4 = r8.f289837w     // Catch:{ all -> 0x0291 }
            r5 = 3
            r4.mo75554a(r5)     // Catch:{ all -> 0x0291 }
            java.lang.String r4 = "SHOW_ARG_ENABLE_UI_ONLY"
            boolean r4 = m172170s(r9, r4)     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x00b3
            com.google.common.f.x r9 = r3.mo56224b()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9     // Catch:{ all -> 0x0291 }
            r10 = 21878(0x5576, float:3.0658E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = "SHOW_ARG_ENABLE_UI_ONLY - returning"
            r9.mo56386p(r10)     // Catch:{ all -> 0x0291 }
            if (r2 == 0) goto L_0x00b2
            r2.close()
        L_0x00b2:
            return
        L_0x00b3:
            com.google.android.apps.gsa.nga.shared.ap.k r4 = r8.f289812B     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.shared.util.v.g r5 = r8.f289826l     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251500jw     // Catch:{ all -> 0x0291 }
            boolean r5 = r5.mo85405j(r6)     // Catch:{ all -> 0x0291 }
            java.lang.String r6 = "com.google.voicesearch.VI_INTENT"
            if (r5 != 0) goto L_0x00c2
            goto L_0x00e3
        L_0x00c2:
            j$.util.Optional r5 = r8.m172164m(r9, r6)     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.staticplugins.nga.vis.p r7 = com.google.android.apps.gsa.staticplugins.nga.vis.C104216p.f289887a     // Catch:{ all -> 0x0291 }
            j$.util.Optional r5 = r5.flatMap(r7)     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.staticplugins.nga.vis.q r7 = com.google.android.apps.gsa.staticplugins.nga.vis.C104217q.f289888a     // Catch:{ all -> 0x0291 }
            j$.util.Optional r5 = r5.map(r7)     // Catch:{ all -> 0x0291 }
            r7 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0291 }
            java.lang.Object r5 = r5.orElse(r7)     // Catch:{ all -> 0x0291 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0291 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0291 }
            if (r5 == 0) goto L_0x00f4
        L_0x00e3:
            if (r4 == 0) goto L_0x00f4
            com.google.android.libraries.gsa.k.g r5 = r8.f289836v     // Catch:{ all -> 0x0291 }
            p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.staticplugins.nga.vis.i r7 = new com.google.android.apps.gsa.staticplugins.nga.vis.i     // Catch:{ all -> 0x0291 }
            r7.<init>(r4)     // Catch:{ all -> 0x0291 }
            java.lang.String r4 = "[NGA] closeSystemDialogs"
            r5.mo28212l(r4, r7)     // Catch:{ all -> 0x0291 }
        L_0x00f4:
            com.google.android.apps.gsa.nga.shared.ap.p r4 = r8.f289835u     // Catch:{ all -> 0x0291 }
            boolean r4 = r4.mo74774a(r9, r10)     // Catch:{ all -> 0x0291 }
            if (r4 != 0) goto L_0x025d
            boolean r4 = m172170s(r9, r1)     // Catch:{ all -> 0x0291 }
            java.lang.String r5 = "START_ASSISTANT_ACTIVITY_INTENT"
            if (r4 != 0) goto L_0x0173
            boolean r4 = m172170s(r9, r5)     // Catch:{ all -> 0x0291 }
            if (r4 != 0) goto L_0x0173
            boolean r4 = r8.f289832r     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x0129
            boolean r4 = r8.f289815E     // Catch:{ all -> 0x0291 }
            if (r4 != 0) goto L_0x0113
            goto L_0x0129
        L_0x0113:
            r8.f289815E = r0     // Catch:{ all -> 0x0291 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x0291 }
            r4 = 21876(0x5574, float:3.0655E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x0291 }
            java.lang.String r4 = "First invocation of onShow(). Ignoring"
            r3.mo56386p(r4)     // Catch:{ all -> 0x0291 }
            goto L_0x013f
        L_0x0129:
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x0291 }
            r4 = 21875(0x5573, float:3.0653E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x0291 }
            java.lang.String r4 = "Not first invocation of onShow(). Forwarding"
            r3.mo56386p(r4)     // Catch:{ all -> 0x0291 }
            r8.m172168q(r9, r10)     // Catch:{ all -> 0x0291 }
        L_0x013f:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d r3 = r8.f289811A     // Catch:{ all -> 0x0291 }
            if (r3 == 0) goto L_0x0146
            r3.mo38941c()     // Catch:{ all -> 0x0291 }
        L_0x0146:
            com.google.android.apps.search.assistant.platform.j.a.t r3 = r8.f289822e     // Catch:{ all -> 0x0291 }
            r3.mo74753f(r10)     // Catch:{ all -> 0x0291 }
            if (r9 == 0) goto L_0x0173
            j$.util.Optional r3 = r8.m172164m(r9, r6)     // Catch:{ all -> 0x0291 }
            r4 = 8
            if (r10 != r4) goto L_0x0173
            com.google.android.apps.gsa.staticplugins.nga.vis.j r10 = com.google.android.apps.gsa.staticplugins.nga.vis.C104210j.f289881a     // Catch:{ all -> 0x0291 }
            j$.util.Optional r10 = r3.map(r10)     // Catch:{ all -> 0x0291 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0291 }
            java.lang.Object r10 = r10.orElse(r0)     // Catch:{ all -> 0x0291 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0291 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0291 }
            if (r10 == 0) goto L_0x0171
            if (r2 == 0) goto L_0x0170
            r2.close()
        L_0x0170:
            return
        L_0x0171:
            r10 = 8
        L_0x0173:
            boolean r0 = m172170s(r9, r1)     // Catch:{ all -> 0x0291 }
            if (r0 == 0) goto L_0x01c8
            android.os.Parcelable r9 = r9.getParcelable(r1)     // Catch:{ all -> 0x0291 }
            android.content.Intent r9 = (android.content.Intent) r9     // Catch:{ all -> 0x0291 }
            r9.getClass()
            r8.startVoiceActivity(r9)     // Catch:{ SecurityException -> 0x01a5, Exception -> 0x0187 }
            goto L_0x0257
        L_0x0187:
            r9 = move-exception
            com.google.common.f.a.d r10 = f289809g     // Catch:{ all -> 0x0291 }
            com.google.common.f.x r10 = r10.mo56226d()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10     // Catch:{ all -> 0x0291 }
            com.google.common.f.x r9 = r10.mo56382g(r9)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9     // Catch:{ all -> 0x0291 }
            r10 = 21874(0x5572, float:3.0652E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = "Unable to start voice activity."
            r9.mo56386p(r10)     // Catch:{ all -> 0x0291 }
            goto L_0x0257
        L_0x01a5:
            r10 = move-exception
            com.google.common.f.a.d r0 = f289809g     // Catch:{ all -> 0x0291 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0291 }
            com.google.common.f.x r10 = r0.mo56382g(r10)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10     // Catch:{ all -> 0x0291 }
            r0 = 21873(0x5571, float:3.065E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r0)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Unable to start as voice activity. Starting intent as normal activity"
            r10.mo56386p(r0)     // Catch:{ all -> 0x0291 }
            android.content.Context r10 = r8.f289828n     // Catch:{ all -> 0x0291 }
            r10.startActivity(r9)     // Catch:{ all -> 0x0291 }
            goto L_0x0257
        L_0x01c8:
            boolean r0 = m172170s(r9, r5)     // Catch:{ all -> 0x0291 }
            if (r0 == 0) goto L_0x0257
            j$.util.Optional r0 = r8.m172164m(r9, r5)     // Catch:{ all -> 0x0291 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0291 }
            if (r1 == 0) goto L_0x01d9
            goto L_0x0230
        L_0x01d9:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0291 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0291 }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ all -> 0x0291 }
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142283ag(r1)     // Catch:{ all -> 0x0291 }
            if (r1 != 0) goto L_0x0230
            com.google.android.apps.gsa.shared.util.v.g r1 = r8.f289826l     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248234aU     // Catch:{ all -> 0x0291 }
            boolean r1 = r1.mo85405j(r3)     // Catch:{ all -> 0x0291 }
            if (r1 == 0) goto L_0x0207
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0291 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0291 }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ all -> 0x0291 }
            java.lang.String r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142240O(r1)     // Catch:{ all -> 0x0291 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0291 }
            if (r1 == 0) goto L_0x0230
        L_0x0207:
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0291 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x0291 }
            java.lang.String r1 = "source"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ all -> 0x0291 }
            com.google.common.b.ij r1 = f289810h     // Catch:{ all -> 0x0291 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0291 }
            if (r0 == 0) goto L_0x0230
            r8.m172168q(r9, r10)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d r9 = r8.f289811A     // Catch:{ all -> 0x0291 }
            if (r9 == 0) goto L_0x0225
            r9.mo38941c()     // Catch:{ all -> 0x0291 }
        L_0x0225:
            com.google.android.apps.search.assistant.platform.j.a.t r9 = r8.f289822e     // Catch:{ all -> 0x0291 }
            r9.mo74753f(r10)     // Catch:{ all -> 0x0291 }
            if (r2 == 0) goto L_0x022f
            r2.close()
        L_0x022f:
            return
        L_0x0230:
            android.os.Parcelable r9 = r9.getParcelable(r5)     // Catch:{ all -> 0x0291 }
            android.content.Intent r9 = (android.content.Intent) r9     // Catch:{ all -> 0x0291 }
            r9.getClass()
            android.content.ComponentName r10 = r9.getComponent()     // Catch:{ all -> 0x0291 }
            if (r10 == 0) goto L_0x024f
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.OpaActivity"
            java.lang.String r10 = r10.getClassName()     // Catch:{ all -> 0x0291 }
            boolean r10 = android.text.TextUtils.equals(r0, r10)     // Catch:{ all -> 0x0291 }
            if (r10 == 0) goto L_0x024f
            r8.m172169r(r9)     // Catch:{ all -> 0x0291 }
            goto L_0x0257
        L_0x024f:
            com.google.android.apps.gsa.staticplugins.opa.ms r10 = r8.f289816F     // Catch:{ all -> 0x0291 }
            r10.mo98044a()     // Catch:{ all -> 0x0291 }
            r8.m172169r(r9)     // Catch:{ all -> 0x0291 }
        L_0x0257:
            if (r2 == 0) goto L_0x025c
            r2.close()
        L_0x025c:
            return
        L_0x025d:
            com.google.android.apps.gsa.nga.shared.ap.k r0 = r8.f289812B     // Catch:{ all -> 0x0291 }
            if (r0 == 0) goto L_0x0278
            com.google.android.apps.gsa.nga.api.by r0 = r8.f289813C     // Catch:{ all -> 0x0291 }
            if (r0 != 0) goto L_0x0273
            com.google.android.apps.gsa.nga.api.bz r0 = r8.f289825k     // Catch:{ all -> 0x0291 }
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.nga.shared.ap.k r4 = r8.f289812B     // Catch:{ all -> 0x0291 }
            com.google.android.apps.gsa.nga.api.by r0 = r0.mo71093a(r1, r4)     // Catch:{ all -> 0x0291 }
            r8.f289813C = r0     // Catch:{ all -> 0x0291 }
        L_0x0273:
            com.google.android.apps.gsa.nga.api.by r0 = r8.f289813C     // Catch:{ all -> 0x0291 }
            r0.mo71092a(r9, r10)     // Catch:{ all -> 0x0291 }
        L_0x0278:
            com.google.common.f.x r9 = r3.mo56224b()     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9     // Catch:{ all -> 0x0291 }
            r10 = 21877(0x5575, float:3.0656E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)     // Catch:{ all -> 0x0291 }
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = "Delegate to GsaVISession"
            r9.mo56386p(r10)     // Catch:{ all -> 0x0291 }
            if (r2 == 0) goto L_0x0290
            r2.close()
        L_0x0290:
            return
        L_0x0291:
            r9 = move-exception
            if (r2 == 0) goto L_0x029c
            r2.close()     // Catch:{ all -> 0x0298 }
            goto L_0x029c
        L_0x0298:
            r10 = move-exception
            com.google.android.apps.gsa.staticplugins.nga.vis.C104206f.m172192a(r9, r10)
        L_0x029c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.vis.C104196ao.onShow(android.os.Bundle, int):void");
    }

    public final void onTaskFinished(Intent intent, int i) {
        C81558a aVar = this.f289840z;
        if (aVar != null && !aVar.mo75145h()) {
            super.onTaskFinished(intent, i);
        }
    }

    public final void onHandleAssist(VoiceInteractionSession.AssistState assistState) {
        C33510d dVar = this.f289811A;
        if (dVar != null) {
            C69664n.m101061g(assistState, "assistState");
            dVar.mo38940b(new C33507a(assistState.getAssistData(), assistState.getAssistStructure(), assistState.getAssistContent(), assistState.getActivityId(), (String) null, assistState.getIndex(), Integer.valueOf(assistState.getCount())));
        }
    }
}
