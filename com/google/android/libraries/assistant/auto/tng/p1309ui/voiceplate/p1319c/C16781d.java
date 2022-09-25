package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1319c;

import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.gearhead.p7964a.C101288a;
import com.google.android.apps.gsa.staticplugins.gearhead.p7964a.C101289b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p724d.C11983a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12999q;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13101e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16666a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16711b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16828f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16719ag;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16720ah;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16726an;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16728ap;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16732at;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16742bc;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16746bg;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16749bj;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16751bl;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16772v;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16776z;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16785c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16787e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16789g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16795ad;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16796ae;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16803b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16814m;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16815n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16816o;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16817p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16818q;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16819r;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16820s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e.C16821t;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.C16830b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.CarLogoView;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets.StreamingTextView;
import com.google.android.libraries.gsa.logoview.C22885a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p6glow.C39872c;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47599b;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47600c;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3931f.p3940d.p3941a.C52856af;
import com.google.assistant.p3931f.p3940d.p3941a.C52857ag;
import com.google.assistant.p3931f.p3940d.p3941a.C52858ah;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4750c.C62948a;
import dagger.C68214a;
import dagger.p5294a.C68221g;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c.d */
/* compiled from: PG */
public final class C16781d implements C16711b {

    /* renamed from: a */
    public final C60887da f49096a;

    /* renamed from: b */
    public final C37215b f49097b;

    /* renamed from: c */
    public C60870cx f49098c;

    /* renamed from: d */
    public C16752bm f49099d;

    /* renamed from: e */
    public boolean f49100e;

    /* renamed from: f */
    private final C16796ae f49101f;

    /* renamed from: g */
    private final C68214a f49102g;

    /* renamed from: h */
    private final C47600c f49103h;

    /* renamed from: i */
    private final C69464a f49104i;

    /* renamed from: j */
    private final C69464a f49105j;

    /* renamed from: k */
    private final C69464a f49106k;

    /* renamed from: l */
    private final C69464a f49107l;

    /* renamed from: m */
    private final C28310af f49108m;

    /* renamed from: n */
    private final C28306ab f49109n;

    /* renamed from: o */
    private final C28443m f49110o;

    /* renamed from: p */
    private final C11983a f49111p;

    /* renamed from: q */
    private C16795ad f49112q;

    /* renamed from: r */
    private C16752bm f49113r;

    /* renamed from: s */
    private boolean f49114s;

    /* renamed from: t */
    private boolean f49115t;

    public C16781d(C16796ae aeVar, C68214a aVar, C16752bm bmVar, C60887da daVar, C47600c cVar, C37215b bVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C28310af afVar, C28306ab abVar, C28443m mVar, C11983a aVar6) {
        this.f49101f = aeVar;
        this.f49102g = aVar;
        this.f49099d = bmVar;
        this.f49113r = bmVar;
        this.f49096a = daVar;
        this.f49103h = cVar;
        this.f49097b = bVar;
        this.f49105j = aVar3;
        this.f49106k = aVar4;
        this.f49104i = aVar2;
        this.f49107l = aVar5;
        this.f49108m = afVar;
        this.f49109n = abVar;
        this.f49110o = mVar;
        this.f49111p = aVar6;
    }

    /* renamed from: a */
    public final C52858ah mo22989a(ady ady) {
        C16795ad adVar = this.f49112q;
        if (adVar == null) {
            return C52858ah.f138677h;
        }
        C16821t tVar = adVar.f49148e;
        ViewGroup b = adVar.mo23020b();
        C16782d dVar = (C16782d) tVar.f49259a.mo17428b();
        dVar.getClass();
        b.getClass();
        ady.getClass();
        adVar.f49155l = new C16820s(dVar, b, ady);
        C16789g gVar = adVar.f49155l.f49256e;
        gVar.mo23015d(gVar.mo23013b());
        gVar.mo23015d(gVar.mo23012a());
        C52856af afVar = (C52856af) C52858ah.f138677h.createBuilder();
        int d = gVar.mo23015d(gVar.mo23013b());
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138679a = (float) d;
        int d2 = gVar.mo23015d(gVar.mo23012a());
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138680b = (float) d2;
        int b2 = gVar.mo23013b();
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138681c = (float) b2;
        int a = gVar.mo23012a();
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138682d = (float) a;
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138683e = 1;
        C52857ag agVar = C52857ag.ANDROID_AUTO;
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138684f = agVar.getNumber();
        return (C52858ah) afVar.build();
    }

    /* renamed from: b */
    public final void mo22990b(boolean z) {
        if (z) {
            this.f49115t = true;
            C16795ad adVar = this.f49112q;
            if (adVar != null) {
                TransitionManager.endTransitions(adVar.mo23020b());
                adVar.mo23020b().clearAnimation();
                StreamingTextView streamingTextView = (StreamingTextView) adVar.mo23020b().findViewById(R.id.query_transcript);
                streamingTextView.f49284e = BuildConfig.FLAVOR;
                streamingTextView.f49281b.cancel();
                streamingTextView.setText(BuildConfig.FLAVOR);
                List<C16830b> list = ((CarLogoView) adVar.mo23020b().findViewById(R.id.logo)).f49279a;
                if (list != null) {
                    for (C16830b timeListener : list) {
                        timeListener.setTimeListener((TimeAnimator.TimeListener) null);
                    }
                }
                adVar.mo23020b().removeAllViews();
                adVar.f49154k = null;
                this.f49112q = null;
            }
            C60870cx cxVar = this.f49098c;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f49098c = null;
            }
            this.f49099d.isInitialized();
            ((C16782d) this.f49102g.mo27525b()).mo20954c(true);
            this.f49115t = false;
            return;
        }
        C16750bk bkVar = this.f49099d.f49009e;
        if (bkVar == null) {
            bkVar = C16750bk.f48980u;
        }
        C16749bj bjVar = (C16749bj) bkVar.toBuilder();
        bjVar.copyOnWrite();
        C16750bk bkVar2 = (C16750bk) bjVar.instance;
        bkVar2.f48987f = null;
        bkVar2.f48982a &= -17;
        bjVar.copyOnWrite();
        C16750bk bkVar3 = (C16750bk) bjVar.instance;
        bkVar3.f48982a &= -9;
        bkVar3.f48986e = 0;
        bjVar.copyOnWrite();
        C16750bk bkVar4 = (C16750bk) bjVar.instance;
        bkVar4.f48988g = null;
        bkVar4.f48982a &= -33;
        bjVar.copyOnWrite();
        C16750bk bkVar5 = (C16750bk) bjVar.instance;
        bkVar5.f48982a |= 1;
        bkVar5.f48983b = 10;
        bjVar.copyOnWrite();
        C16750bk bkVar6 = (C16750bk) bjVar.instance;
        bkVar6.f48991j = null;
        bkVar6.f48982a &= -257;
        bjVar.copyOnWrite();
        C16750bk bkVar7 = (C16750bk) bjVar.instance;
        bkVar7.f48992k = null;
        bkVar7.f48982a &= -513;
        bjVar.copyOnWrite();
        C16750bk bkVar8 = (C16750bk) bjVar.instance;
        bkVar8.f48993l = null;
        bkVar8.f48982a &= -1025;
        bjVar.copyOnWrite();
        C16750bk bkVar9 = (C16750bk) bjVar.instance;
        bkVar9.f49001t = null;
        bkVar9.f48982a &= -262145;
        C16750bk bkVar10 = (C16750bk) bjVar.build();
        C16751bl blVar = (C16751bl) this.f49099d.toBuilder();
        blVar.copyOnWrite();
        C16752bm bmVar = (C16752bm) blVar.instance;
        bkVar10.getClass();
        bmVar.f49009e = bkVar10;
        bmVar.f49005a |= 8;
        blVar.copyOnWrite();
        C16752bm bmVar2 = (C16752bm) blVar.instance;
        bmVar2.f49005a |= 2;
        bmVar2.f49007c = false;
        C16752bm bmVar3 = (C16752bm) blVar.build();
        this.f49099d = bmVar3;
        this.f49114s = true;
        mo23009i(bmVar3);
    }

    /* renamed from: c */
    public final void mo22991c(C13101e eVar) {
        C16820s sVar;
        C16795ad adVar = this.f49112q;
        if (adVar != null && (sVar = adVar.f49155l) != null && !eVar.equals(sVar.f49257f)) {
            sVar.mo23042a().setVisibility(0);
            if (!sVar.f49257f.mo20894d().equals(eVar.mo20894d())) {
                eVar.mo20894d().ifPresentOrElse(new C16815n(sVar), new C16816o(sVar));
            }
            if (!sVar.f49257f.mo20892b().equals(eVar.mo20892b())) {
                eVar.mo20892b().ifPresentOrElse(new C16817p(sVar), new C16818q(sVar));
            }
            if (!sVar.f49257f.mo20893c().equals(eVar.mo20893c())) {
                eVar.mo20893c().ifPresent(new C16819r(sVar));
            }
            sVar.f49257f = eVar;
        }
    }

    /* renamed from: e */
    public final void mo22993e(String str) {
        C16751bl blVar = (C16751bl) this.f49099d.toBuilder();
        blVar.copyOnWrite();
        C16752bm bmVar = (C16752bm) blVar.instance;
        str.getClass();
        bmVar.f49005a |= 32;
        bmVar.f49011g = str;
        mo23009i((C16752bm) blVar.build());
    }

    /* renamed from: f */
    public final void mo22994f(C16750bk bkVar) {
        Object obj;
        C16750bk bkVar2 = this.f49099d.f49009e;
        if (bkVar2 == null) {
            bkVar2 = C16750bk.f48980u;
        }
        if (!bkVar.equals(bkVar2)) {
            C16751bl blVar = (C16751bl) this.f49099d.toBuilder();
            if ((((Boolean) this.f49105j.mo17428b()).booleanValue() || ((Boolean) this.f49106k.mo17428b()).booleanValue()) && !bkVar.equals(C16750bk.f48980u)) {
                C16719ag agVar = (C16719ag) C16720ah.f48888b.createBuilder();
                C12991i iVar = bkVar.f48996o;
                if (iVar == null) {
                    iVar = C12991i.f40380k;
                }
                C12989g a = C12989g.m29225a(iVar.f40385d);
                if (a == null) {
                    a = C12989g.UNKNOWN;
                }
                if (a.equals(C12989g.AUTO_PROJECTED)) {
                    C12991i iVar2 = bkVar.f48996o;
                    if (iVar2 == null) {
                        iVar2 = C12991i.f40380k;
                    }
                    C62940bt r3 = C62942bv.checkIsLite(C13042d.f40481n);
                    iVar2.mo58887l(r3);
                    Object l = iVar2.f169962ag.mo58854l(r3.f169971d);
                    if (l == null) {
                        obj = r3.f169969b;
                    } else {
                        obj = r3.mo58889c(l);
                    }
                    if (((C13042d) obj).f40493k) {
                        agVar.copyOnWrite();
                        C16720ah ahVar = (C16720ah) agVar.instance;
                        C62971cq cqVar = ahVar.f48890a;
                        if (!cqVar.mo58948c()) {
                            ahVar.f48890a = C62942bv.mutableCopy(cqVar);
                        }
                        ahVar.f48890a.add("D");
                    }
                }
                C16720ah ahVar2 = (C16720ah) agVar.build();
                blVar.copyOnWrite();
                C16752bm bmVar = (C16752bm) blVar.instance;
                ahVar2.getClass();
                bmVar.f49010f = ahVar2;
                bmVar.f49005a |= 16;
            }
            if (!((Boolean) this.f49104i.mo17428b()).booleanValue()) {
                C16746bg bgVar = C16746bg.f48970e;
                C16746bg bgVar2 = bkVar.f48985d;
                if (bgVar2 == null) {
                    bgVar2 = bgVar;
                }
                if (!bgVar.equals(bgVar2)) {
                    C16749bj bjVar = (C16749bj) bkVar.toBuilder();
                    C16746bg bgVar3 = C16746bg.f48970e;
                    bjVar.copyOnWrite();
                    C16750bk bkVar3 = (C16750bk) bjVar.instance;
                    bgVar3.getClass();
                    bkVar3.f48985d = bgVar3;
                    bkVar3.f48982a |= 4;
                    bkVar = (C16750bk) bjVar.build();
                }
            }
            if (((Boolean) this.f49107l.mo17428b()).booleanValue()) {
                C16730ar arVar = C16730ar.OFFLINE;
                C16730ar a2 = C16730ar.m33788a(bkVar.f48986e);
                if (a2 == null) {
                    a2 = C16730ar.ASSUMING_GOOD_NETWORK;
                }
                if (arVar.equals(a2)) {
                    C16749bj bjVar2 = (C16749bj) bkVar.toBuilder();
                    C16730ar arVar2 = C16730ar.ASSUMING_GOOD_NETWORK;
                    bjVar2.copyOnWrite();
                    C16750bk bkVar4 = (C16750bk) bjVar2.instance;
                    bkVar4.f48986e = arVar2.f48937e;
                    bkVar4.f48982a |= 8;
                    bkVar = (C16750bk) bjVar2.build();
                }
            }
            C16750bk bkVar5 = this.f49099d.f49009e;
            if (bkVar5 == null) {
                bkVar5 = C16750bk.f48980u;
            }
            C16746bg bgVar4 = bkVar5.f48985d;
            if (bgVar4 == null) {
                bgVar4 = C16746bg.f48970e;
            }
            C16746bg bgVar5 = bkVar.f48985d;
            if (bgVar5 == null) {
                bgVar5 = C16746bg.f48970e;
            }
            if (!bgVar4.equals(bgVar5)) {
                C59104x b = C16787e.f49122a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b).mo56372aa(46850)).mo56386p("Updating Transcription");
                C16746bg bgVar6 = bkVar.f48985d;
                String str = (bgVar6 == null ? C16746bg.f48970e : bgVar6).f48974c;
                String str2 = (bgVar6 == null ? C16746bg.f48970e : bgVar6).f48973b;
                if (bgVar6 == null) {
                    bgVar6 = C16746bg.f48970e;
                }
                String str3 = bgVar6.f48975d;
            }
            if (bkVar5.f48983b != bkVar.f48983b) {
                C59104x b2 = C16787e.f49122a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b2).mo56372aa(46849)).mo56387q("Updating Logo State: %s", bkVar.f48983b);
            }
            C16730ar a3 = C16730ar.m33788a(bkVar5.f48986e);
            if (a3 == null) {
                a3 = C16730ar.ASSUMING_GOOD_NETWORK;
            }
            C16730ar a4 = C16730ar.m33788a(bkVar.f48986e);
            if (a4 == null) {
                a4 = C16730ar.ASSUMING_GOOD_NETWORK;
            }
            if (!a3.equals(a4)) {
                C59104x b3 = C16787e.f49122a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                C59052c cVar = (C59052c) ((C59052c) b3).mo56372aa(46848);
                C16730ar a5 = C16730ar.m33788a(bkVar.f48986e);
                if (a5 == null) {
                    a5 = C16730ar.ASSUMING_GOOD_NETWORK;
                }
                cVar.mo56387q("Updating Network State: %s", a5.f48937e);
            }
            C16718af afVar = bkVar5.f48987f;
            if (afVar == null) {
                afVar = C16718af.f48884c;
            }
            C16718af afVar2 = bkVar.f48987f;
            if (afVar2 == null) {
                afVar2 = C16718af.f48884c;
            }
            if (!afVar.equals(afVar2)) {
                C59104x b4 = C16787e.f49122a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b4).mo56372aa(46847)).mo56386p("Updating Discoverability State");
            }
            C16736ax axVar = bkVar5.f48988g;
            if (axVar == null) {
                axVar = C16736ax.f48947d;
            }
            C16736ax axVar2 = bkVar.f48988g;
            if (axVar2 == null) {
                axVar2 = C16736ax.f48947d;
            }
            if (!axVar.equals(axVar2)) {
                C59104x b5 = C16787e.f49122a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b5).mo56372aa(46846)).mo56386p("Updating Provider State");
            }
            C16726an anVar = bkVar5.f48989h;
            if (anVar == null) {
                anVar = C16726an.f48921d;
            }
            C16726an anVar2 = bkVar.f48989h;
            if (anVar2 == null) {
                anVar2 = C16726an.f48921d;
            }
            if (!anVar.equals(anVar2)) {
                C59104x b6 = C16787e.f49122a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b6).mo56372aa(46845)).mo56386p("Updating Language State");
            }
            C16772v vVar = bkVar5.f48990i;
            if (vVar == null) {
                vVar = C16772v.f49081d;
            }
            C16772v vVar2 = bkVar.f48990i;
            if (vVar2 == null) {
                vVar2 = C16772v.f49081d;
            }
            if (!vVar.equals(vVar2)) {
                C59104x b7 = C16787e.f49122a.mo56224b();
                b7.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b7).mo56372aa(46844)).mo56386p("Updating Cold Boot State");
            }
            C16734av avVar = bkVar5.f48991j;
            if (avVar == null) {
                avVar = C16734av.f48942d;
            }
            C16734av avVar2 = bkVar.f48991j;
            if (avVar2 == null) {
                avVar2 = C16734av.f48942d;
            }
            if (!avVar.equals(avVar2)) {
                C59104x b8 = C16787e.f49122a.mo56224b();
                b8.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b8).mo56372aa(46843)).mo56386p("Updating Routine State");
            }
            C16662b bVar = bkVar5.f48992k;
            if (bVar == null) {
                bVar = C16662b.f48800l;
            }
            C16662b bVar2 = bkVar.f48992k;
            if (bVar2 == null) {
                bVar2 = C16662b.f48800l;
            }
            if (!bVar.equals(bVar2)) {
                C59104x b9 = C16787e.f49122a.mo56224b();
                b9.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b9).mo56372aa(46842)).mo56386p("Updating Immersive Args State");
            }
            C16754d dVar = bkVar5.f48993l;
            if (dVar == null) {
                dVar = C16754d.f49023f;
            }
            C16754d dVar2 = bkVar.f48993l;
            if (dVar2 == null) {
                dVar2 = C16754d.f49023f;
            }
            if (!dVar.equals(dVar2)) {
                C59104x b10 = C16787e.f49122a.mo56224b();
                b10.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b10).mo56372aa(46841)).mo56386p("Updating App Actions State");
            }
            C16776z zVar = bkVar5.f48995n;
            if (zVar == null) {
                zVar = C16776z.f49087c;
            }
            C16776z zVar2 = bkVar.f48995n;
            if (zVar2 == null) {
                zVar2 = C16776z.f49087c;
            }
            if (!zVar.equals(zVar2)) {
                C59104x b11 = C16787e.f49122a.mo56224b();
                b11.mo56378ag(C58975e.f156826a, "VoicePlateDataState");
                ((C59052c) ((C59052c) b11).mo56372aa(46840)).mo56386p("Updating Conversation State");
            }
            blVar.copyOnWrite();
            C16752bm bmVar2 = (C16752bm) blVar.instance;
            bkVar.getClass();
            bmVar2.f49009e = bkVar;
            bmVar2.f49005a |= 8;
            mo23009i((C16752bm) blVar.build());
        }
    }

    /* renamed from: g */
    public final void mo22995g(ViewStub viewStub, C12986d dVar) {
        this.f49097b.mo19974a(C37179a.f97408G);
        C16750bk bkVar = this.f49099d.f49009e;
        if (bkVar == null) {
            bkVar = C16750bk.f48980u;
        }
        C16751bl blVar = (C16751bl) this.f49099d.toBuilder();
        C16749bj bjVar = (C16749bj) bkVar.toBuilder();
        C12991i iVar = dVar.f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        bjVar.copyOnWrite();
        C16750bk bkVar2 = (C16750bk) bjVar.instance;
        iVar.getClass();
        bkVar2.f48996o = iVar;
        bkVar2.f48982a |= 8192;
        blVar.copyOnWrite();
        C16752bm bmVar = (C16752bm) blVar.instance;
        C16750bk bkVar3 = (C16750bk) bjVar.build();
        bkVar3.getClass();
        bmVar.f49009e = bkVar3;
        bmVar.f49005a |= 8;
        this.f49099d = (C16752bm) blVar.build();
        C28310af afVar = this.f49108m;
        if (afVar != null) {
            C28306ab abVar = this.f49109n;
            if (abVar != null) {
                C28443m mVar = this.f49110o;
                if (mVar != null) {
                    Optional of = Optional.m71637of(new C16666a(afVar, abVar, mVar, this.f49111p));
                    C16796ae aeVar = this.f49101f;
                    C16752bm bmVar2 = this.f49099d;
                    Optional of2 = Optional.m71637of(this.f49097b);
                    C16782d dVar2 = (C16782d) aeVar.f49170a.mo17428b();
                    C16782d dVar3 = dVar2;
                    dVar2.getClass();
                    Resources resources = (Resources) aeVar.f49171b.mo17428b();
                    Resources resources2 = resources;
                    resources.getClass();
                    C22885a aVar = (C22885a) aeVar.f49172c.mo17428b();
                    C22885a aVar2 = aVar;
                    aVar.getClass();
                    Optional optional = (Optional) aeVar.f49173d.mo17428b();
                    Optional optional2 = optional;
                    optional.getClass();
                    C21370a aVar3 = (C21370a) aeVar.f49174e.mo17428b();
                    C21370a aVar4 = aVar3;
                    aVar3.getClass();
                    C16814m mVar2 = (C16814m) aeVar.f49175f.mo17428b();
                    C16814m mVar3 = mVar2;
                    mVar2.getClass();
                    C16803b bVar = (C16803b) aeVar.f49176g.mo17428b();
                    C16803b bVar2 = bVar;
                    bVar.getClass();
                    C16821t tVar = (C16821t) aeVar.f49177h.mo17428b();
                    C16821t tVar2 = tVar;
                    tVar.getClass();
                    C47449e eVar = (C47449e) aeVar.f49178i.mo17428b();
                    C47449e eVar2 = eVar;
                    eVar.getClass();
                    C47770dh dhVar = (C47770dh) aeVar.f49179j.mo17428b();
                    C47770dh dhVar2 = dhVar;
                    dhVar.getClass();
                    C16828f fVar = (C16828f) aeVar.f49180k.mo17428b();
                    C16828f fVar2 = fVar;
                    fVar.getClass();
                    Optional optional3 = (Optional) ((C68221g) aeVar.f49181l).f184583a;
                    Optional optional4 = optional3;
                    optional3.getClass();
                    Optional optional5 = (Optional) aeVar.f49182m.mo17428b();
                    optional5.getClass();
                    C69464a aVar5 = aeVar.f49183n;
                    C69464a aVar6 = aeVar.f49184o;
                    ((C16785c) aeVar.f49185p.mo17428b()).getClass();
                    bmVar2.getClass();
                    of.getClass();
                    of2.getClass();
                    C16795ad adVar = new C16795ad(dVar3, resources2, aVar2, optional2, aVar4, mVar3, bVar2, tVar2, eVar2, dhVar2, fVar2, optional4, optional5, aVar5, aVar6, viewStub, bmVar2, of, of2);
                    this.f49112q = adVar;
                    ViewGroup b = adVar.mo23020b();
                    mo23009i(this.f49099d);
                    b.getViewTreeObserver().addOnGlobalLayoutListener(new C16779b(this, b));
                    return;
                }
                throw new NullPointerException("Null interactionLogger");
            }
            throw new NullPointerException("Null viewVisualElements");
        }
        throw new NullPointerException("Null visualElements");
    }

    /* renamed from: h */
    public final void mo23008h(C16752bm bmVar) {
        this.f49113r = bmVar;
        this.f49100e = false;
        ((C16782d) this.f49102g.mo27525b()).mo20957f(bmVar.isInitialized(), this.f49114s);
        if (!this.f49099d.equals(bmVar)) {
            mo23009i(this.f49099d);
        } else if (!this.f49099d.f49007c && this.f49114s) {
            this.f49114s = false;
            ((C16782d) this.f49102g.mo27525b()).mo20954c(this.f49115t);
            C60870cx cxVar = this.f49098c;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f49098c = null;
            }
        }
    }

    /* renamed from: i */
    public final void mo23009i(C16752bm bmVar) {
        Transition transition;
        C16732at atVar;
        C16738az azVar;
        Resources resources;
        C16752bm bmVar2 = bmVar;
        this.f49099d = bmVar2;
        C16795ad adVar = this.f49112q;
        if (adVar != null && !this.f49100e) {
            this.f49100e = true;
            C16752bm bmVar3 = this.f49113r;
            ViewGroup b = adVar.mo23020b();
            C16750bk bkVar = bmVar3.f49009e;
            if (bkVar == null) {
                bkVar = C16750bk.f48980u;
            }
            C16750bk bkVar2 = bmVar2.f49009e;
            if (bkVar2 == null) {
                bkVar2 = C16750bk.f48980u;
            }
            C16730ar a = C16730ar.m33788a(bkVar2.f48986e);
            if (a == null) {
                a = C16730ar.ASSUMING_GOOD_NETWORK;
            }
            C12991i iVar = bkVar2.f48996o;
            if (iVar == null) {
                iVar = C12991i.f40380k;
            }
            if ((iVar.f40382a & 128) != 0 && bmVar2.f49015k) {
                C12991i iVar2 = bkVar2.f48996o;
                if (iVar2 == null) {
                    iVar2 = C12991i.f40380k;
                }
                int a2 = C12999q.m29230a(iVar2.f40391j);
                if (a2 != 0 && a2 == 3) {
                    float a3 = C16795ad.m33829a(R.dimen.fusion_voiceplate_horizontal_bias_driver_side_align_enabled_right, b);
                    C1756o oVar = new C1756o();
                    ConstraintLayout constraintLayout = (ConstraintLayout) b;
                    oVar.mo4889i(constraintLayout);
                    oVar.mo4899u(R.id.voiceplate, a3);
                    oVar.mo4888h(constraintLayout);
                }
            }
            if ((bmVar2.f49005a & 32) != 0) {
                String str = bmVar2.f49011g;
                Context context = b.getContext();
                List i = C58869cf.m90936b(new C58903m('-')).mo56155i(str.replace('_', '-'));
                if (i.size() == 2) {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    configuration.setLocale(new Locale((String) i.get(0), (String) i.get(1)));
                    resources = context.createConfigurationContext(configuration).getResources();
                } else {
                    resources = context.getResources();
                }
                adVar.f49152i = resources;
            }
            TextView textView = (TextView) b.findViewById(R.id.network_state_text_limited_connectivity);
            C39872c cVar = C39872c.GONE;
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                ((TextView) b.findViewById(R.id.network_state_text_offline)).setText(adVar.f49152i.getString(R.string.aae_network_status_offline));
                adVar.mo23022d(bmVar3, bmVar2);
            } else if (ordinal == 2) {
                textView.setText(adVar.f49152i.getString(R.string.fusion_network_status_poor_signal_strength));
                adVar.mo23022d(bmVar3, bmVar2);
            } else if (ordinal == 3) {
                textView.setText(adVar.f49152i.getString(R.string.fusion_network_status_slow_connection));
                View findViewById = adVar.mo23020b().findViewById(R.id.network_state_bar_fill);
                ProgressBar progressBar = (ProgressBar) adVar.mo23020b().findViewById(R.id.network_state_progress_bar);
                C16750bk bkVar3 = bmVar3.f49009e;
                if (bkVar3 == null) {
                    bkVar3 = C16750bk.f48980u;
                }
                C16750bk bkVar4 = bmVar2.f49009e;
                if (bkVar4 == null) {
                    bkVar4 = C16750bk.f48980u;
                }
                C16728ap apVar = bmVar2.f49016l;
                if (apVar == null) {
                    apVar = C16728ap.f48926d;
                }
                if (apVar.f48929b) {
                    C16730ar a4 = C16730ar.m33788a(bkVar3.f48986e);
                    if (a4 == null) {
                        a4 = C16730ar.ASSUMING_GOOD_NETWORK;
                    }
                    C16730ar a5 = C16730ar.m33788a(bkVar4.f48986e);
                    if (a5 == null) {
                        a5 = C16730ar.ASSUMING_GOOD_NETWORK;
                    }
                    if (a4 != a5) {
                        C16728ap apVar2 = bmVar2.f49016l;
                        if (apVar2 == null) {
                            apVar2 = C16728ap.f48926d;
                        }
                        long j = apVar2.f48930c;
                        if (j <= 0) {
                            progressBar.setProgress(progressBar.getMax());
                        } else {
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, progressBar.getMax()});
                            ofInt.setDuration(j);
                            ofInt.setInterpolator(new DecelerateInterpolator());
                            ofInt.start();
                            adVar.f49153j = ofInt;
                        }
                        progressBar.setVisibility(0);
                        findViewById.setVisibility(8);
                    }
                } else {
                    adVar.mo23021c(bkVar3, findViewById);
                }
            }
            if (adVar.f49147d.isPresent() && (bkVar2.f48982a & 16) != 0) {
                C16718af afVar = bkVar2.f48987f;
                if (afVar == null) {
                    afVar = C16718af.f48884c;
                }
                if (afVar.f48886a == 3) {
                    C16718af afVar2 = bkVar.f48987f;
                    if (afVar2 == null) {
                        afVar2 = C16718af.f48884c;
                    }
                    if (!afVar.equals(afVar2)) {
                        ViewStub viewStub = (ViewStub) b.findViewById(R.id.disco_query_container_stub);
                        C101289b bVar = (C101289b) adVar.f49147d.get();
                        LayoutInflater layoutInflater = adVar.f49146c;
                        C16782d dVar = adVar.f49145b;
                        if (viewStub.getParent() != null) {
                            viewStub.setLayoutResource(R.layout.aap_voiceplate_immersive_container);
                            bVar.f282695a = (ViewGroup) viewStub.inflate();
                        }
                        ViewGroup viewGroup = bVar.f282695a;
                        if (viewGroup != null) {
                            viewGroup.removeAllViews();
                            if (afVar.f48886a == 3) {
                                azVar = (C16738az) afVar.f48887b;
                            } else {
                                azVar = C16738az.f48952d;
                            }
                            List<C16742bc> list = azVar.f48955b;
                            if (list.size() > 3) {
                                list = list.subList(0, 3);
                            }
                            for (C16742bc bcVar : list) {
                                String str2 = bcVar.f48962c;
                                View inflate = layoutInflater.inflate(R.layout.aap_voiceplate_action_button, bVar.f282695a, false);
                                ((TextView) inflate.findViewById(R.id.text)).setText(str2);
                                inflate.setOnClickListener(new C101288a(dVar, str2));
                                ViewGroup viewGroup2 = bVar.f282695a;
                                if (viewGroup2 != null) {
                                    viewGroup2.addView(inflate);
                                }
                            }
                        }
                    }
                }
            }
            C16718af afVar3 = bkVar2.f48987f;
            if (afVar3 == null) {
                afVar3 = C16718af.f48884c;
            }
            if (afVar3.f48886a == 2) {
                TextView textView2 = (TextView) b.findViewById(R.id.suggested_query_text);
                Resources resources2 = adVar.f49152i;
                Object[] objArr = new Object[1];
                C16718af afVar4 = bkVar2.f48987f;
                if (afVar4 == null) {
                    afVar4 = C16718af.f48884c;
                }
                if (afVar4.f48886a == 2) {
                    atVar = (C16732at) afVar4.f48887b;
                } else {
                    atVar = C16732at.f48938c;
                }
                objArr[0] = atVar.f48941b;
                textView2.setText(resources2.getString(R.string.suggested_query_text, objArr));
            }
            if ((bkVar2.f48982a & 32) != 0) {
                TextView textView3 = (TextView) b.findViewById(R.id.third_party_header_text);
                C16736ax axVar = bkVar2.f48988g;
                if (axVar == null) {
                    axVar = C16736ax.f48947d;
                }
                textView3.setText(axVar.f48951c);
            }
            if (!this.f49113r.equals(bmVar2)) {
                C16752bm bmVar4 = this.f49113r;
                ViewGroup b2 = adVar.mo23020b();
                C16750bk bkVar5 = bmVar4.f49009e;
                if (bkVar5 == null) {
                    bkVar5 = C16750bk.f48980u;
                }
                C16750bk bkVar6 = bmVar2.f49009e;
                if (bkVar6 == null) {
                    bkVar6 = C16750bk.f48980u;
                }
                TransitionSet addTransition = new TransitionSet().setOrdering(0).addTransition(new Fade(2));
                TransitionSet addTransition2 = new TransitionSet().setOrdering(0).addTransition(new ChangeBounds());
                TransitionSet addTransition3 = new TransitionSet().setOrdering(0).addTransition(new Fade(1));
                C16728ap apVar3 = bmVar2.f49016l;
                if (apVar3 == null) {
                    apVar3 = C16728ap.f48926d;
                }
                if (!apVar3.f48929b) {
                    View findViewById2 = b2.findViewById(R.id.network_state_bar);
                    View findViewById3 = b2.findViewById(R.id.network_state_bar_fill);
                    int i2 = bkVar6.f48986e;
                    C16730ar a6 = C16730ar.m33788a(i2);
                    if (a6 == null) {
                        a6 = C16730ar.ASSUMING_GOOD_NETWORK;
                    }
                    C16730ar arVar = a6;
                    C16730ar a7 = C16730ar.m33788a(bkVar5.f48986e);
                    if (a7 == null) {
                        a7 = C16730ar.ASSUMING_GOOD_NETWORK;
                    }
                    if (arVar != a7) {
                        C16730ar a8 = C16730ar.m33788a(i2);
                        if (a8 == null) {
                            a8 = C16730ar.ASSUMING_GOOD_NETWORK;
                        }
                        if (a8 == C16730ar.ASSUMING_GOOD_NETWORK) {
                            addTransition2.excludeTarget(findViewById2, true);
                            addTransition.addTransition(new ChangeBounds().addTarget(findViewById2));
                        } else {
                            addTransition2.excludeTarget(findViewById3, true);
                            addTransition3.addTransition(new ChangeBounds().addTarget(findViewById3));
                        }
                    }
                }
                if (!bmVar4.f49007c && bmVar2.f49007c) {
                    long d = C62948a.m95453d((C62910ar) adVar.f49150g.mo17428b());
                    if (d > 0) {
                        addTransition3.setDuration(d);
                        addTransition2.setDuration(d);
                    }
                    if (((Double) adVar.f49151h.mo17428b()).doubleValue() > C59203do.f157270a) {
                        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(((Double) adVar.f49151h.mo17428b()).floatValue());
                        addTransition3.setInterpolator(decelerateInterpolator);
                        addTransition2.setInterpolator(decelerateInterpolator);
                    }
                }
                View findViewById4 = b2.findViewById(R.id.scrim);
                addTransition.excludeTarget(findViewById4, true);
                addTransition3.excludeTarget(findViewById4, true);
                addTransition2.addTransition(new Fade(1).addTarget(findViewById4)).addTransition(new Fade(2).addTarget(findViewById4));
                transition = new TransitionSet().setOrdering(1).addTransition(addTransition).addTransition(addTransition2).addTransition(addTransition3).addListener(new C47599b(this.f49103h, new C16780c(this, bmVar2), "F1VoicePlateRenderer#TransitionListener"));
            } else {
                transition = null;
            }
            adVar.mo23023e(transition, this.f49113r, bmVar2);
            if (transition == null || (!this.f49113r.f49007c && !bmVar2.f49007c)) {
                mo23008h(bmVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo22992d(C16662b bVar) {
        if (!bVar.f48803b) {
            C16750bk bkVar = this.f49099d.f49009e;
            if (bkVar == null) {
                bkVar = C16750bk.f48980u;
            }
            C16662b bVar2 = bkVar.f48992k;
            if (bVar2 == null) {
                bVar2 = C16662b.f48800l;
            }
            if (bVar2.f48808g) {
                return;
            }
        }
        C16750bk bkVar2 = this.f49099d.f49009e;
        if (bkVar2 == null) {
            bkVar2 = C16750bk.f48980u;
        }
        C16749bj bjVar = (C16749bj) bkVar2.toBuilder();
        bjVar.copyOnWrite();
        C16750bk bkVar3 = (C16750bk) bjVar.instance;
        bVar.getClass();
        bkVar3.f48992k = bVar;
        bkVar3.f48982a |= 512;
        C16750bk bkVar4 = (C16750bk) bjVar.build();
        C16751bl blVar = (C16751bl) this.f49099d.toBuilder();
        blVar.copyOnWrite();
        C16752bm bmVar = (C16752bm) blVar.instance;
        bkVar4.getClass();
        bmVar.f49009e = bkVar4;
        bmVar.f49005a |= 8;
        mo23009i((C16752bm) blVar.build());
    }
}
