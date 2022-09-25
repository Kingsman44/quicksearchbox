package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a.C107961e;
import com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a.C107962f;
import com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a.C107966j;
import com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a.C107970n;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109987a;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109989c;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109990d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114751e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114778ab;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114840cj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114885q;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114960b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114961c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114962d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114964f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114965g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.pcp.p1573k.C18929i;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53282ic;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53381lu;
import com.google.assistant.p3994s.p3995a.C53382lv;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.assistant.p3994s.p3995a.C53426nl;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60001iy;
import com.google.common.p4552o.C60052ja;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57778j;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57782n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57745i;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57747k;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.C63194b;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ax */
/* compiled from: PG */
public final class C114640ax implements C114750d, C114778ab {

    /* renamed from: a */
    public static final C59071e f318030a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ax");

    /* renamed from: b */
    public final C114839ci f318031b;

    /* renamed from: c */
    public final C114751e f318032c;

    /* renamed from: d */
    public final View f318033d;

    /* renamed from: e */
    public final C86124t f318034e;

    /* renamed from: f */
    public final C21232ab f318035f;

    /* renamed from: g */
    public final C114885q f318036g;

    /* renamed from: h */
    private final C114840cj f318037h;

    /* renamed from: i */
    private final C114796at f318038i;

    /* renamed from: j */
    private final C114757k f318039j;

    /* renamed from: k */
    private final View f318040k;

    /* renamed from: l */
    private final C107970n f318041l;

    /* renamed from: m */
    private final C22871g f318042m;

    /* renamed from: n */
    private final C28293k f318043n;

    /* renamed from: o */
    private final List f318044o;

    /* renamed from: p */
    private C109989c f318045p;

    /* renamed from: q */
    private boolean f318046q = false;

    public C114640ax(Context context, C58833ax axVar, C114860dc dcVar, C114839ci ciVar, C114840cj cjVar, C114796at atVar, C114965g gVar, C114962d dVar, C86124t tVar, C107970n nVar, C21232ab abVar, C22871g gVar2, C68214a aVar, C114885q qVar, C114757k kVar, C114751e eVar, boolean z) {
        C53420nf nfVar;
        C53426nl nlVar;
        Object obj;
        int a;
        Object obj2;
        C58833ax axVar2;
        C114839ci ciVar2 = ciVar;
        C114962d dVar2 = dVar;
        C86124t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        this.f318044o = arrayList;
        this.f318031b = ciVar2;
        this.f318037h = cjVar;
        this.f318038i = atVar;
        this.f318034e = tVar2;
        this.f318041l = nVar;
        this.f318035f = abVar;
        this.f318042m = gVar2;
        C114964f a2 = gVar.mo101755a(z);
        this.f318039j = kVar;
        this.f318032c = eVar;
        this.f318036g = qVar;
        C28293k kVar2 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_state_eml_card_container, (ViewGroup) null);
        this.f318033d = inflate;
        View findViewById = inflate.findViewById(R.id.zero_state_eml_card_container);
        this.f318040k = findViewById;
        C53366lf a3 = eVar.mo101573a();
        if (a3.f140037b == 4) {
            nfVar = (C53420nf) a3.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        if ((nfVar.f140167a & 4194304) != 0 && nfVar.f140180n) {
            findViewById.setElevation(0.0f);
        } else if (tVar2.mo79746e(C90014bt.f247289eO)) {
            ciVar2.mo101653f(findViewById);
        }
        if ((nfVar.f140167a & 128) != 0) {
            C53382lv lvVar = nfVar.f140173g;
            C53382lv lvVar2 = lvVar == null ? C53382lv.f140078d : lvVar;
            ((Context) dVar2.f319007a.mo17428b()).getClass();
            Activity activity = (Activity) dVar2.f319008b.mo17428b();
            activity.getClass();
            C114839ci ciVar3 = (C114839ci) dVar2.f319009c.mo17428b();
            ciVar3.getClass();
            C114860dc dcVar2 = (C114860dc) dVar2.f319010d.mo17428b();
            dcVar2.getClass();
            C68214a a4 = C68219e.m98518a(((C68226l) dVar2.f319011e).f184585a);
            a4.getClass();
            lvVar2.getClass();
            C114961c cVar = new C114961c(activity, ciVar3, dcVar2, a4, lvVar2);
            ViewGroup viewGroup = (ViewGroup) inflate;
            C58976aa aaVar = C58975e.f156826a;
            View inflate2 = LayoutInflater.from(cVar.f319000a).inflate(R.layout.snapshot_card_question_view, (ViewGroup) null);
            TextView textView = (TextView) inflate2.findViewById(R.id.question);
            C53382lv lvVar3 = cVar.f319005f;
            if ((lvVar3.f140080a & 1) != 0) {
                textView.setText(lvVar3.f140081b);
            } else {
                textView.setText(((C73841bf) cVar.f319006g.mo27525b()).mo65322a().getString(R.string.feedback_survey_question));
            }
            C28295m.m52919e(inflate2, cVar.f319001b);
            ViewGroup viewGroup2 = (ViewGroup) inflate2.findViewById(R.id.buttons_frame);
            for (C53381lu luVar : cVar.f319005f.f140082c) {
                TextView textView2 = (TextView) LayoutInflater.from(cVar.f319000a).inflate(R.layout.snapshot_card_question_answer_view, viewGroup2, false);
                textView2.setText(luVar.f140075b);
                textView2.setOnClickListener(new C89943l(new C114960b(cVar, luVar.f140076c, inflate2)));
                if ((luVar.f140074a & 4) != 0) {
                    C28292j jVar = new C28292j(luVar.f140077d);
                    jVar.mo33795i(5);
                    C28295m.m52919e(textView2, jVar);
                    cVar.f319002c.add(C28293k.m52908e(jVar, new C28293k[0]));
                }
                viewGroup2.addView(textView2);
            }
            viewGroup.addView(inflate2);
            this.f318044o.add(C28293k.m52907d(cVar.f319001b, cVar.f319002c));
        } else if (a2.mo101754c()) {
            ((ViewGroup) inflate).addView(a2.mo101752a());
            arrayList.add(a2.mo101753b());
        } else {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.zero_state_card_gap_margin);
            inflate.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        }
        if (nfVar.f140168b == 1) {
            nlVar = (C53426nl) nfVar.f140169c;
        } else {
            nlVar = C53426nl.f140205h;
        }
        int i = 2;
        if ((nlVar.f140207a & 2) != 0) {
            C28292j jVar2 = new C28292j(nlVar.f140209c);
            jVar2.f76976d = true;
            C28295m.m52919e(this.f318033d, jVar2);
            if ((nlVar.f140207a & 4) != 0) {
                C63204j jVar3 = nlVar.f140210d;
                jVar2.mo33792f(jVar3 == null ? C63204j.f170749e : jVar3);
            }
            if ((nlVar.f140207a & 32) != 0) {
                C62940bt btVar = C63194b.f170729e;
                C114840cj cjVar2 = this.f318037h;
                C53424nj njVar = nlVar.f140212f;
                jVar2.f76974b.mo58885m(btVar, cjVar2.mo101654a(njVar == null ? C53424nj.f140199d : njVar));
            }
            C60001iy iyVar = (C60001iy) C60052ja.f162314c.createBuilder();
            iyVar.copyOnWrite();
            C60052ja jaVar = (C60052ja) iyVar.instance;
            jaVar.f162318b = 1;
            jaVar.f162317a |= 2;
            jVar2.f76974b.mo58885m(C60052ja.f162315d, (C60052ja) iyVar.build());
            kVar2 = C28293k.m52907d(jVar2, this.f318044o);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f318043n = kVar2;
        try {
            C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, nlVar.f140208b, C62921ba.m95368a());
            if (tVar2.mo79746e(C90080ee.f249814m)) {
                C62940bt r3 = C62942bv.checkIsLite(C54192i.f142222b);
                rVar.mo58887l(r3);
                Object l = rVar.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj = r3.f169969b;
                } else {
                    obj = r3.mo58889c(l);
                }
                C57776h hVar = ((C57784p) obj).f154387d;
                for (C57778j jVar4 : (hVar == null ? C57776h.f154365b : hVar).f154367a) {
                    String str = jVar4.f154371a;
                    C57780l lVar = jVar4.f154373c;
                    lVar = lVar == null ? C57780l.f154376c : lVar;
                    C62940bt r10 = C62942bv.checkIsLite(C57745i.f154275d);
                    lVar.mo58887l(r10);
                    if (lVar.f169962ag.mo58857o(r10.f169971d) && (a = C57782n.m88531a(jVar4.f154372b)) != 0 && a == i) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        C62940bt r5 = C62942bv.checkIsLite(C57745i.f154275d);
                        lVar.mo58887l(r5);
                        Object l2 = lVar.f169962ag.mo58854l(r5.f169971d);
                        if (l2 == null) {
                            obj2 = r5.f169969b;
                        } else {
                            obj2 = r5.mo58889c(l2);
                        }
                        C57745i iVar = (C57745i) obj2;
                        int a5 = C57747k.m88528a(iVar.f154277a);
                        if ((a5 == 0 ? 1 : a5) - 1 == 1) {
                            C62971cq cqVar = iVar.f154278b;
                            C107970n nVar2 = this.f318041l;
                            C53306j jVar5 = C53306j.MAIN_APP;
                            ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26909)).mo56389s("#getClientMediaRecommendations() %s", jVar5.name());
                            C58833ax a6 = nVar2.f300430i.mo103698a();
                            ArrayList arrayList2 = new ArrayList();
                            List list = (List) Collection.EL.stream(cqVar).filter(C107961e.f300399a).map(C107962f.f300400a).collect(C58370cn.f155946a);
                            ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26901)).mo56389s("#getPreferredComponentNames() Server preferred app {%s}", list);
                            List b = nVar2.f300428g.mo24191b(nVar2.f300426e.mo24218b(C18929i.MOSTLY_USED), new LinkedHashSet(), C53306j.MAIN_APP, C123777f.f341922a, true, (String) C58557jl.m90130k(list, BuildConfig.FLAVOR), false);
                            ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26902)).mo56389s("#getPreferredComponentNames() Client filtered app {%s}", b);
                            arrayList2.addAll(b);
                            if (b.isEmpty()) {
                                axVar2 = C58836b.f156633a;
                            } else {
                                axVar2 = C58833ax.m90834k((ComponentName) b.get(0));
                            }
                            ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26910)).mo56389s("#getClientMediaRecommendations() preferred component name {%s}", axVar2);
                            new C90873ag(C2169h.m6027a(new C107966j(nVar2, arrayList2, axVar2, jVar5, a6)), this.f318042m, "Put client media recommendation to data store", new C114633aq(this, str)).mo85223a(C114634ar.f318023a);
                            i = 2;
                        }
                    }
                }
            }
            C109989c a7 = ((C109990d) axVar.mo56107c()).mo98287a((C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, nlVar.f140208b, C62921ba.m95368a()));
            this.f318045p = a7;
            View view = this.f318040k;
            C109987a aVar2 = new C109987a();
            aVar2.f306451a = this.f318043n;
            a7.mo98285a(view, aVar2.mo98278a());
            if ((rVar.f142245a & 4) != 0) {
                String str2 = rVar.f142249e;
                C58976aa aaVar4 = C58975e.f156826a;
                dcVar.f318681n.put(str2, this);
            } else {
                C58976aa aaVar5 = C58975e.f156826a;
            }
            this.f318033d.addOnLayoutChangeListener(new C114639aw(aVar));
        } catch (C62974ct e) {
            C59104x c = f318030a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ZSElementsCard");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(29291)).mo56386p("Cannot render Elements card.");
        }
    }

    /* renamed from: n */
    private final void m190030n(Runnable runnable) {
        new Handler().postDelayed(runnable, this.f318034e.mo79743a(C90014bt.f247833ot));
    }

    /* renamed from: a */
    public final int mo101463a() {
        return this.f318032c.mo101573a().f140042g;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return this.f318033d;
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        return this.f318043n;
    }

    /* renamed from: d */
    public final C53420nf mo101466d() {
        C53366lf a = this.f318032c.mo101573a();
        if (a.f140037b == 4) {
            return (C53420nf) a.f140038c;
        }
        return C53420nf.f140165o;
    }

    /* renamed from: e */
    public final void mo101467e() {
        C58976aa aaVar = C58975e.f156826a;
        C109989c cVar = this.f318045p;
        if (cVar != null) {
            cVar.mo98286c(this.f318040k);
        }
    }

    /* renamed from: f */
    public final void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        C53420nf nfVar;
        C53420nf nfVar2;
        int a;
        int a2;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f318034e.mo79746e(C90080ee.f249806e)) {
            m190030n(new C114635as(this, ihVar));
            return;
        }
        C53366lf a3 = this.f318032c.mo101573a();
        if (a3.f140037b == 4) {
            nfVar = (C53420nf) a3.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        C53250gy gyVar = nfVar.f140176j;
        if (gyVar == null) {
            gyVar = C53250gy.f139586c;
        }
        if (gyVar.f139588a != 4 || (((a2 = C53282ic.m86805a(ihVar.f139702h)) != 0 && a2 == 5) || !this.f318034e.mo79746e(C90014bt.f247603kK))) {
            C53366lf a4 = this.f318032c.mo101573a();
            if (a4.f140037b == 4) {
                nfVar2 = (C53420nf) a4.f140038c;
            } else {
                nfVar2 = C53420nf.f140165o;
            }
            C53250gy gyVar2 = nfVar2.f140176j;
            if (gyVar2 == null) {
                gyVar2 = C53250gy.f139586c;
            }
            if (gyVar2.f139588a != 10 || (((a = C53282ic.m86805a(ihVar.f139702h)) != 0 && a == 5) || !this.f318034e.mo79746e(C90080ee.f249820s))) {
                animatorSet.start();
            } else {
                m190030n(new C114637au(this));
            }
        } else {
            m190030n(new C114636at(this));
        }
    }

    /* renamed from: g */
    public final void mo101487g(Intent intent) {
        C53420nf nfVar;
        C114796at atVar = this.f318038i;
        C53366lf a = this.f318032c.mo101573a();
        if (a.f140037b == 4) {
            nfVar = (C53420nf) a.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        atVar.mo101594a(nfVar, intent);
    }

    /* renamed from: h */
    public final void mo101488h() {
        C53420nf nfVar;
        C114796at atVar = this.f318038i;
        C53366lf a = this.f318032c.mo101573a();
        if (a.f140037b == 4) {
            nfVar = (C53420nf) a.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        atVar.mo101598e(nfVar);
    }

    /* renamed from: i */
    public final void mo101489i() {
        this.f318046q = true;
        this.f318031b.mo101650c(this.f318033d).start();
        this.f318039j.mo101582f();
    }

    /* renamed from: j */
    public final void mo101490j() {
        this.f318046q = false;
        this.f318031b.mo101649b(this.f318033d).start();
        this.f318039j.mo101581e();
    }

    /* renamed from: k */
    public final void mo101491k() {
        try {
            ((ViewGroup) this.f318040k).getChildAt(0).callOnClick();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            C59104x d = f318030a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSElementsCard");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29298)).mo56389s("#toggleBirthdayCardExpandState(): Exception: %s", e);
        }
    }

    /* renamed from: l */
    public final void mo101492l() {
        try {
            ((ViewGroup) this.f318040k).getChildAt(0).callOnClick();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            C59104x d = f318030a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSElementsCard");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29299)).mo56389s("#toggleWeatherCardExpandState(): Exception: %s", e);
        }
    }

    /* renamed from: m */
    public final boolean mo101493m() {
        return this.f318046q;
    }
}
