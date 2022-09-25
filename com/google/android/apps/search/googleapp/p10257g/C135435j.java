package com.google.android.apps.search.googleapp.p10257g;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135396m;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135401r;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135408y;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.lifecycle.flow.C47421a;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p337aa.C6617d;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5472e.C69598b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.j */
/* compiled from: PG */
public final class C135435j {

    /* renamed from: a */
    public static final Set f368973a = C69531o.m100939p(new C135430e[]{C135430e.PIXEL_SPLUS_MINUS_ONE, C135430e.SAMSUNG_MINUS_ONE_POST_MVP});

    /* renamed from: b */
    public static final C59071e f368974b = C59071e.m91331h();

    /* renamed from: c */
    public final C135401r f368975c;

    /* renamed from: d */
    public final C135396m f368976d;

    /* renamed from: e */
    public final C135431f f368977e;

    /* renamed from: f */
    public final C135449v f368978f;

    /* renamed from: g */
    public final C135425b f368979g;

    /* renamed from: h */
    public final C46801dp f368980h;

    /* renamed from: i */
    public final C28306ab f368981i;

    /* renamed from: j */
    public final C28443m f368982j;

    /* renamed from: k */
    public final C139684f f368983k;

    /* renamed from: l */
    public final C135408y f368984l;

    /* renamed from: m */
    public final C47770dh f368985m;

    /* renamed from: n */
    public final boolean f368986n;

    /* renamed from: o */
    public final boolean f368987o;

    /* renamed from: p */
    public final boolean f368988p;

    /* renamed from: q */
    public final C46792di f368989q = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C135435j.f368974b.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40561));
            cVar.mo56386p("Failed to fetch enableDoodleAnimation value.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C135435j.this.mo112331b(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: r */
    public final C135437a f368990r = new C135437a();

    /* renamed from: s */
    private final C47449e f368991s;

    /* renamed from: com.google.android.apps.search.googleapp.g.j$a */
    /* compiled from: PG */
    final class C135437a implements C46792di {
        public C135437a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "e");
            C59052c cVar = (C59052c) ((C59052c) C135435j.f368974b.mo56226d()).mo56382g(th);
            cVar.mo56378ag(C38505d.f101864b, 149815953);
            cVar.mo56379ah(new C59094n(40559));
            cVar.mo56386p("Failed to load doodle metadata.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C135422am amVar;
            C6617d dVar = (C6617d) obj;
            C69664n.m101061g(dVar, "doodle");
            C135435j jVar = C135435j.this;
            if (C69664n.m101066l(C6617d.f19649y, dVar)) {
                amVar = C135423an.f368947a;
            } else {
                amVar = C135420ak.m219576a(dVar, C133933a.m217248a(C135435j.this.f368979g.getContext()), C135419aj.LARGE, C135435j.this.f368977e);
            }
            jVar.mo112330a(amVar);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C135435j(C135401r rVar, C135396m mVar, C135431f fVar, C135449v vVar, C135425b bVar, C47449e eVar, C46801dp dpVar, C28306ab abVar, C28443m mVar2, C139684f fVar2, C135408y yVar, C47770dh dhVar, boolean z, boolean z2, C47429i iVar) {
        Throwable th;
        C135431f fVar3 = fVar;
        C47449e eVar2 = eVar;
        C46801dp dpVar2 = dpVar;
        C28306ab abVar2 = abVar;
        C28443m mVar3 = mVar2;
        C135408y yVar2 = yVar;
        C47770dh dhVar2 = dhVar;
        boolean z3 = z;
        boolean z4 = z2;
        C47429i iVar2 = iVar;
        C69664n.m101061g(mVar, "doodleDataService");
        C69664n.m101061g(eVar2, "imageManager");
        C69664n.m101061g(dpVar2, "subscriptionMixin");
        C69664n.m101061g(abVar2, "viewVisualElements");
        C69664n.m101061g(mVar3, "interactionLogger");
        C69664n.m101061g(yVar2, "doodleStatusDataService");
        C69664n.m101061g(dhVar2, "traceCreation");
        this.f368975c = rVar;
        this.f368976d = mVar;
        this.f368977e = fVar3;
        this.f368978f = vVar;
        this.f368979g = bVar;
        this.f368991s = eVar2;
        this.f368980h = dpVar2;
        this.f368981i = abVar2;
        this.f368982j = mVar3;
        this.f368983k = fVar2;
        this.f368984l = yVar2;
        this.f368985m = dhVar2;
        this.f368986n = z3;
        this.f368987o = z4;
        this.f368988p = fVar3.f368970e;
        C47558bi a = C47831fm.m85006a("DoodleFragmentPeer#init");
        if (z3) {
            try {
                C47426f.m84293a(iVar2.mo51262a(yVar2.f368918b), new C135432g(this));
            } catch (Throwable th2) {
                Throwable th3 = th2;
                C69598b.m101013a(a, th);
                throw th3;
            }
        }
        if (z4) {
            C47426f.m84293a(new C47421a(new C135439l(iVar2.mo51262a(mVar.mo112306a()), this)), new C135433h(this));
        }
        C69598b.m101013a(a, (Throwable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r11 == com.google.android.apps.search.googleapp.p10257g.C135430e.PIXEL_SPLUS_MINUS_ONE) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112330a(com.google.android.apps.search.googleapp.p10257g.C135422am r11) {
        /*
            r10 = this;
            java.lang.String r0 = "state"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.p10257g.C135423an
            java.lang.String r1 = "requireViewById<ViewGrou…ogleapp_doodle_container)"
            r2 = 2131431523(0x7f0b1063, float:1.8484778E38)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            if (r0 == 0) goto L_0x00bb
            com.google.android.apps.search.googleapp.g.f r11 = r10.f368977e
            com.google.android.apps.search.googleapp.g.b r0 = r10.f368979g
            android.view.View r0 = r0.requireView()
            p5462h.p5473f.p5475b.C69664n.m101059e(r0, r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.apps.search.googleapp.g.a.y r3 = r10.f368984l
            android.view.View r2 = androidx.core.p098j.C2043bi.m5589r(r0, r2)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 2131431686(0x7f0b1106, float:1.8485108E38)
            android.view.View r0 = androidx.core.p098j.C2043bi.m5589r(r0, r1)
            java.lang.String r1 = "requireViewById<ImageVie…oot, R.id.googleapp_logo)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r1 = r11.f368968c
            if (r1 == 0) goto L_0x00ab
            r1 = 0
            r0.setVisibility(r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x00ab
            com.google.cg.b r4 = r11.f368969d
            if (r4 != 0) goto L_0x004f
            com.google.cg.b r4 = com.google.p4479cg.C58070b.f155212e
        L_0x004f:
            com.google.cg.b r5 = com.google.p4479cg.C58070b.f155212e
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0069
            com.google.cg.b r11 = r11.f368969d
            if (r11 != 0) goto L_0x005f
            com.google.cg.b r11 = com.google.p4479cg.C58070b.f155212e
        L_0x005f:
            java.lang.String r1 = "doodleFragmentParams.customLogoTint"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            int r1 = com.google.android.apps.search.googleapp.p10257g.p10259b.C135426a.m219589a(r11)
            goto L_0x00a6
        L_0x0069:
            int r4 = r11.f368967b
            com.google.android.apps.search.googleapp.g.e r4 = com.google.android.apps.search.googleapp.p10257g.C135430e.m219591a(r4)
            if (r4 != 0) goto L_0x0073
            com.google.android.apps.search.googleapp.g.e r4 = com.google.android.apps.search.googleapp.p10257g.C135430e.UNKNOWN
        L_0x0073:
            com.google.android.apps.search.googleapp.g.e r5 = com.google.android.apps.search.googleapp.p10257g.C135430e.SAMSUNG_MINUS_ONE
            if (r4 == r5) goto L_0x0091
            int r11 = r11.f368967b
            com.google.android.apps.search.googleapp.g.e r4 = com.google.android.apps.search.googleapp.p10257g.C135430e.m219591a(r11)
            if (r4 != 0) goto L_0x0081
            com.google.android.apps.search.googleapp.g.e r4 = com.google.android.apps.search.googleapp.p10257g.C135430e.UNKNOWN
        L_0x0081:
            com.google.android.apps.search.googleapp.g.e r5 = com.google.android.apps.search.googleapp.p10257g.C135430e.SAMSUNG_MINUS_ONE_POST_MVP
            if (r4 == r5) goto L_0x0091
            com.google.android.apps.search.googleapp.g.e r11 = com.google.android.apps.search.googleapp.p10257g.C135430e.m219591a(r11)
            if (r11 != 0) goto L_0x008d
            com.google.android.apps.search.googleapp.g.e r11 = com.google.android.apps.search.googleapp.p10257g.C135430e.UNKNOWN
        L_0x008d:
            com.google.android.apps.search.googleapp.g.e r4 = com.google.android.apps.search.googleapp.p10257g.C135430e.PIXEL_SPLUS_MINUS_ONE
            if (r11 != r4) goto L_0x00a6
        L_0x0091:
            android.content.Context r11 = r0.getContext()
            boolean r11 = com.google.android.apps.search.googleapp.p10165d.C133933a.m217248a(r11)
            if (r11 == 0) goto L_0x00a6
            android.content.Context r11 = r0.getContext()
            r1 = 2131102080(0x7f060980, float:1.7816588E38)
            int r1 = androidx.core.content.C1878d.m5128a(r11, r1)
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r0.setColorFilter(r1)
        L_0x00ab:
            r11 = 8
            r2.setVisibility(r11)
            com.google.aa.a.l r11 = com.google.p337aa.p338a.C6610l.f19630i
            java.lang.String r0 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            r3.mo112311b(r11)
            return
        L_0x00bb:
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.p10257g.C135414ae
            if (r0 == 0) goto L_0x0142
            r5 = r11
            com.google.android.apps.search.googleapp.g.ae r5 = (com.google.android.apps.search.googleapp.p10257g.C135414ae) r5
            com.google.android.apps.search.googleapp.g.b r11 = r10.f368979g
            android.view.View r11 = r11.requireView()
            p5462h.p5473f.p5475b.C69664n.m101059e(r11, r3)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r0 = 2131431520(0x7f0b1060, float:1.8484772E38)
            android.view.View r0 = androidx.core.p098j.C2043bi.m5589r(r11, r0)
            java.lang.String r3 = "requireViewById<ImageVie…t, R.id.googleapp_doodle)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3 = 2131431913(0x7f0b11e9, float:1.8485569E38)
            android.view.View r3 = androidx.core.p098j.C2043bi.m5589r(r11, r3)
            java.lang.String r4 = "requireViewById<ImageVie…leapp_share_doodle_image)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r8 = r3
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.view.View r11 = androidx.core.p098j.C2043bi.m5589r(r11, r2)
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            r9 = r11
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            com.google.android.libraries.logging.p2185ve.C28306ab.m52929e(r0)
            com.google.android.libraries.logging.ve.ab r11 = r10.f368981i
            com.google.android.libraries.logging.ve.af r1 = r11.f76990a
            r2 = 61
            com.google.android.libraries.logging.ve.h r2 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r2)
            com.google.android.libraries.logging.ve.c r1 = r1.mo33805a(r2)
            com.google.protobuf.bt r2 = com.google.android.libraries.search.logging.p3046g.C39198d.f103150a
            com.google.common.o.pk r3 = r5.f368934f
            com.google.android.libraries.logging.ve.e r4 = new com.google.android.libraries.logging.ve.e
            r4.<init>(r2, r3)
            r1.mo33858f(r4)
            r11.mo33801b(r0, r1)
            r11 = 4
            r9.setVisibility(r11)
            com.google.apps.tiktok.media.e r11 = r10.f368991s
            android.net.Uri r1 = r5.f368930b
            com.bumptech.glide.ad r11 = r11.mo51286a()
            com.bumptech.glide.z r11 = r11.mo11870h(r1)
            com.bumptech.glide.f.j r1 = com.bumptech.glide.p287f.C5593j.m14522f()
            com.bumptech.glide.z r11 = r11.mo11982o(r1)
            com.google.android.apps.search.googleapp.g.r r1 = new com.google.android.apps.search.googleapp.g.r
            r4 = r1
            r6 = r10
            r7 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.apps.tiktok.tracing.dh r2 = r10.f368985m
            com.google.apps.tiktok.tracing.contrib.e.b r3 = new com.google.apps.tiktok.tracing.contrib.e.b
            r3.<init>(r1, r2)
            com.bumptech.glide.z r11 = r11.mo12439a(r3)
            r11.mo12454r(r0)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10257g.C135435j.mo112330a(com.google.android.apps.search.googleapp.g.am):void");
    }

    /* renamed from: b */
    public final void mo112331b(boolean z) {
        Drawable drawable = ((ImageView) C2043bi.m5589r(this.f368979g.requireView(), R.id.googleapp_doodle)).getDrawable();
        if (!(drawable instanceof Animatable)) {
            return;
        }
        if (z) {
            Animatable animatable = (Animatable) drawable;
            if (!animatable.isRunning()) {
                animatable.start();
                return;
            }
            return;
        }
        Animatable animatable2 = (Animatable) drawable;
        if (animatable2.isRunning()) {
            animatable2.stop();
        }
    }
}
