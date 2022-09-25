package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6928f.C87552h;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114778ab;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114800ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114820bq;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114840cj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114867dj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114964f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114965g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53265hm;
import com.google.assistant.p3994s.p3995a.C53282ic;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.assistant.p3994s.p3995a.C53426nl;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.C63194b;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf */
/* compiled from: PG */
public final class C114676cf implements C114778ab, C114750d {

    /* renamed from: a */
    public static final C59071e f318125a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf");

    /* renamed from: b */
    public static final C58485gu f318126b = C58485gu.m89853v("ZeroStateAction", "HideCardAction", "DismissCardAction", "HomescreenShortcutCardAction", "DisclosuresCardAction", "UpdateAssistantSettingsAction", "OptInReorderSuggestionAction", "OptOutReorderSuggestionAction");

    /* renamed from: c */
    public static final int f318127c = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: A */
    private final C53420nf f318128A;

    /* renamed from: B */
    private boolean f318129B;

    /* renamed from: d */
    public final C114628am f318130d;

    /* renamed from: e */
    public final C91097g f318131e;

    /* renamed from: f */
    public final C114742l f318132f;

    /* renamed from: g */
    public final C86054o f318133g;

    /* renamed from: h */
    public final C109790aj f318134h;

    /* renamed from: i */
    public final C86124t f318135i;

    /* renamed from: j */
    public final l f318136j;

    /* renamed from: k */
    public final C22871g f318137k;

    /* renamed from: l */
    public final C22871g f318138l;

    /* renamed from: m */
    public final C114839ci f318139m;

    /* renamed from: n */
    public final C68214a f318140n;

    /* renamed from: o */
    public final C68214a f318141o;

    /* renamed from: p */
    public View f318142p;

    /* renamed from: q */
    public C28293k f318143q;

    /* renamed from: r */
    public C114675ce f318144r;

    /* renamed from: s */
    public final C114867dj f318145s;

    /* renamed from: t */
    public final C114867dj f318146t;

    /* renamed from: u */
    boolean f318147u;

    /* renamed from: v */
    Timer f318148v;

    /* renamed from: w */
    private final LayoutInflater f318149w;

    /* renamed from: x */
    private final C114964f f318150x;

    /* renamed from: y */
    private final C114796at f318151y;

    /* renamed from: z */
    private final C114757k f318152z;

    public C114676cf(Context context, Activity activity, C114628am amVar, C86054o oVar, C114742l lVar, C109790aj ajVar, C114965g gVar, C114796at atVar, C86124t tVar, l lVar2, C22871g gVar2, C22871g gVar3, C114839ci ciVar, C114840cj cjVar, C68214a aVar, C114820bq bqVar, C68214a aVar2, C114800ax axVar, C114757k kVar, C53420nf nfVar, C87546b bVar, C91097g gVar4, int i, C53306j jVar) {
        C53426nl nlVar;
        Activity activity2 = activity;
        C86124t tVar2 = tVar;
        C114839ci ciVar2 = ciVar;
        C53420nf nfVar2 = nfVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.f318149w = from;
        this.f318130d = amVar;
        this.f318133g = oVar;
        this.f318132f = lVar;
        this.f318134h = ajVar;
        this.f318131e = gVar4;
        this.f318152z = kVar;
        this.f318128A = nfVar2;
        this.f318151y = atVar;
        this.f318135i = tVar2;
        this.f318136j = lVar2;
        this.f318137k = gVar2;
        this.f318138l = gVar3;
        this.f318139m = ciVar2;
        this.f318140n = aVar;
        C114964f a = gVar.mo101755a(nfVar2.f140172f);
        this.f318150x = a;
        this.f318145s = axVar.mo101603a(activity);
        C53265hm hmVar = nfVar2.f140170d;
        if (((hmVar == null ? C53265hm.f139631f : hmVar).f139633a & 2) != 0) {
            C53265hm hmVar2 = nfVar2.f140170d;
            String str = (hmVar2 == null ? C53265hm.f139631f : hmVar2).f139635c;
        }
        this.f318146t = bqVar.mo101626a(activity, this);
        this.f318141o = aVar2;
        this.f318129B = false;
        this.f318147u = false;
        try {
            if (nfVar2.f140168b == 1) {
                nlVar = (C53426nl) nfVar2.f140169c;
            } else {
                nlVar = C53426nl.f140205h;
            }
            C87545a a2 = bVar.mo77519a(nlVar.f140208b.mo59174N());
            if (a2 != null) {
                ViewGroup viewGroup = (ViewGroup) from.inflate(i, (ViewGroup) null);
                ((ViewGroup) viewGroup.findViewById(R.id.touch_intercepting_container)).addView(a2.mo25098kH());
                if (a.mo101754c()) {
                    viewGroup.addView(a.mo101752a());
                }
                this.f318142p = viewGroup;
                if (jVar == C53306j.MAIN_APP && tVar2.mo79746e(C90014bt.f247289eO)) {
                    ciVar2.mo101653f(this.f318142p.findViewById(R.id.touch_intercepting_container));
                }
                C114675ce ceVar = new C114675ce(this);
                this.f318144r = ceVar;
                a2.mo77517d(ceVar);
            }
            if ((nlVar.f140207a & 2) != 0) {
                C28292j jVar2 = new C28292j(nlVar.f140209c);
                jVar2.f76976d = true;
                if ((nlVar.f140207a & 4) != 0) {
                    C63204j jVar3 = nlVar.f140210d;
                    jVar2.mo33792f(jVar3 == null ? C63204j.f170749e : jVar3);
                }
                if ((nlVar.f140207a & 32) != 0) {
                    C62940bt btVar = C63194b.f170729e;
                    C53424nj njVar = nlVar.f140212f;
                    jVar2.f76974b.mo58885m(btVar, cjVar.mo101654a(njVar == null ? C53424nj.f140199d : njVar));
                }
                C28295m.m52919e(this.f318142p, jVar2);
                ArrayList arrayList = new ArrayList();
                if (a.mo101754c()) {
                    arrayList.add(a.mo101753b());
                }
                this.f318143q = C28293k.m52907d(jVar2, arrayList);
            }
        } catch (C87552h e) {
            ((C59052c) ((C59052c) ((C59052c) f318125a.mo56225c()).mo56382g(e)).mo56372aa(29342)).mo56386p("Failed to create view with the renderedCard");
            Context context2 = context;
            this.f318142p = new FrameLayout(context);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return this.f318142p;
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        return this.f318143q;
    }

    /* renamed from: d */
    public final /* synthetic */ C53420nf mo101466d() {
        return null;
    }

    /* renamed from: e */
    public final void mo101467e() {
    }

    /* renamed from: f */
    public final void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        int a;
        C53250gy gyVar = this.f318128A.f140176j;
        if (gyVar == null) {
            gyVar = C53250gy.f139586c;
        }
        if (gyVar.f139588a != 2 || (((a = C53282ic.m86805a(ihVar.f139702h)) != 0 && a == 5) || !this.f318135i.mo79746e(C90014bt.f247602kJ))) {
            animatorSet.start();
        } else {
            new Handler().postDelayed(new C114661br(this), this.f318135i.mo79743a(C90014bt.f247833ot));
        }
    }

    /* renamed from: g */
    public final void mo101487g(Intent intent) {
        this.f318151y.mo101594a(this.f318128A, intent);
    }

    /* renamed from: h */
    public final void mo101488h() {
        this.f318151y.mo101598e(this.f318128A);
    }

    /* renamed from: i */
    public final void mo101489i() {
        this.f318129B = true;
        this.f318139m.mo101650c(this.f318142p).start();
        this.f318152z.mo101582f();
    }

    /* renamed from: j */
    public final void mo101490j() {
        this.f318129B = false;
        this.f318139m.mo101649b(this.f318142p).start();
        this.f318152z.mo101581e();
    }

    /* renamed from: k */
    public final void mo101516k(String str, C22869e eVar) {
        if (!C22872h.m42744d(C0826b.class)) {
            this.f318137k.mo28212l(str, eVar);
        } else {
            eVar.run();
        }
    }

    /* renamed from: l */
    public final void mo101517l() {
        try {
            this.f318147u = true;
            ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) this.f318142p.findViewById(R.id.touch_intercepting_container)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0).callOnClick();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            ((C59052c) ((C59052c) ((C59052c) f318125a.mo56226d()).mo56382g(e)).mo56372aa(29345)).mo56386p("#toggleFlightCardExpandState(): Exception");
            this.f318147u = false;
        }
    }

    /* renamed from: m */
    public final boolean mo101493m() {
        return this.f318129B;
    }
}
