package com.google.android.apps.search.googleapp.search.srp.p10433c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.p10257g.C135414ae;
import com.google.android.apps.search.googleapp.p10257g.C135419aj;
import com.google.android.apps.search.googleapp.p10257g.C135420ak;
import com.google.android.apps.search.googleapp.p10257g.C135422am;
import com.google.android.apps.search.googleapp.p10257g.C135423an;
import com.google.android.apps.search.googleapp.p10257g.C135431f;
import com.google.android.apps.search.googleapp.p10257g.C135449v;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135396m;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135401r;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139764e;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.srp.C137878j;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.lifecycle.flow.C47421a;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p337aa.C6617d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c.d */
/* compiled from: PG */
public final class C137737d {

    /* renamed from: a */
    public static final C59071e f374672a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f374673b;

    /* renamed from: c */
    public final boolean f374674c;

    /* renamed from: d */
    public final C139684f f374675d;

    /* renamed from: e */
    public final C135401r f374676e;

    /* renamed from: f */
    public final C47770dh f374677f;

    /* renamed from: g */
    public final C137735b f374678g;

    /* renamed from: h */
    public final C28443m f374679h;

    /* renamed from: i */
    public final C46801dp f374680i;

    /* renamed from: j */
    public final C135449v f374681j;

    /* renamed from: k */
    public final C28306ab f374682k;

    /* renamed from: l */
    public final C28310af f374683l;

    /* renamed from: m */
    public final boolean f374684m;

    /* renamed from: n */
    public final C135396m f374685n;

    /* renamed from: o */
    public final C137738a f374686o = new C137738a();

    /* renamed from: p */
    public final C38553h f374687p;

    /* renamed from: q */
    public C137878j f374688q;

    /* renamed from: r */
    private final C47449e f374689r;

    /* renamed from: com.google.android.apps.search.googleapp.search.srp.c.d$a */
    /* compiled from: PG */
    final class C137738a implements C46792di {
        public C137738a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "e");
            C59052c cVar = (C59052c) ((C59052c) C137737d.f374672a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41038));
            cVar.mo56386p("Failed to load doodle metadata.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C135422am amVar;
            C6617d dVar = (C6617d) obj;
            C69664n.m101061g(dVar, "doodle");
            C137737d dVar2 = C137737d.this;
            if (dVar2.f374687p.f101930a || C69664n.m101066l(dVar, C6617d.f19649y)) {
                amVar = C135423an.f368947a;
            } else {
                amVar = C135420ak.m219576a(dVar, C133933a.m217248a(C137737d.this.f374673b), C135419aj.MEDIUM, (C135431f) null);
            }
            dVar2.mo113936a(amVar);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C137737d(Context context, boolean z, C47449e eVar, C139684f fVar, C135401r rVar, C47770dh dhVar, C137735b bVar, C38553h hVar, C28443m mVar, C46801dp dpVar, C135449v vVar, C28306ab abVar, C28310af afVar, boolean z2, C135396m mVar2, C47429i iVar) {
        C47770dh dhVar2 = dhVar;
        C38553h hVar2 = hVar;
        C28443m mVar3 = mVar;
        C46801dp dpVar2 = dpVar;
        C28306ab abVar2 = abVar;
        C28310af afVar2 = afVar;
        boolean z3 = z2;
        C135396m mVar4 = mVar2;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(dhVar2, "traceCreation");
        C69664n.m101061g(hVar2, "fragmentIncognitoChecker");
        C69664n.m101061g(mVar3, "interactionLogger");
        C69664n.m101061g(dpVar2, "subscriptionMixin");
        C69664n.m101061g(abVar2, "viewVisualElements");
        C69664n.m101061g(afVar2, "visualElements");
        C69664n.m101061g(mVar4, "doodleDataService");
        this.f374673b = context;
        this.f374674c = z;
        this.f374689r = eVar;
        this.f374675d = fVar;
        this.f374676e = rVar;
        this.f374677f = dhVar2;
        this.f374678g = bVar;
        this.f374687p = hVar2;
        this.f374679h = mVar3;
        this.f374680i = dpVar2;
        this.f374681j = vVar;
        this.f374682k = abVar2;
        this.f374683l = afVar2;
        this.f374684m = z3;
        this.f374685n = mVar4;
        if (z3) {
            C47426f.m84293a(new C47421a(new C137743i(iVar.mo51262a(mVar2.mo112306a()), this)), new C137736c(this));
        }
    }

    /* renamed from: b */
    public static final void m223896b(View view) {
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C139764e a = C69664n.m101061g(fVar, "builder");
        a.mo115227c(C139779t.HOME_SCREEN);
        a.mo115228d();
        C47393f.m84237h(new C139760a(a.mo115225a()), view);
    }

    /* renamed from: a */
    public final void mo113936a(C135422am amVar) {
        C69664n.m101061g(amVar, "state");
        if (amVar instanceof C135423an) {
            View requireView = this.f374678g.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            View findViewById = requireView.findViewById(R.id.googleapp_logo);
            C69664n.m101060f(findViewById, "view.findViewById(R.id.googleapp_logo)");
            View findViewById2 = requireView.findViewById(R.id.googleapp_doodle);
            C69664n.m101060f(findViewById2, "view.findViewById(R.id.googleapp_doodle)");
            findViewById.setVisibility(0);
            ((ImageView) findViewById2).setVisibility(4);
        } else if (amVar instanceof C135414ae) {
            C135414ae aeVar = (C135414ae) amVar;
            C69664n.m101061g(aeVar, "doodle");
            View requireView2 = this.f374678g.requireView();
            C69664n.m101060f(requireView2, "fragment.requireView()");
            View findViewById3 = requireView2.findViewById(R.id.googleapp_logo);
            C69664n.m101060f(findViewById3, "view.findViewById(R.id.googleapp_logo)");
            View findViewById4 = requireView2.findViewById(R.id.googleapp_doodle);
            C69664n.m101060f(findViewById4, "view.findViewById(R.id.googleapp_doodle)");
            ImageView imageView = (ImageView) findViewById4;
            C47449e eVar = this.f374689r;
            eVar.mo51286a().mo11870h(aeVar.f368930b).mo11982o(C5593j.m14522f()).mo12439a(new C137741g(findViewById3, imageView, this, aeVar)).mo12454r(imageView);
        }
    }
}
