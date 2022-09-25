package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.appactions.h.a;
import com.google.android.apps.gsa.assistant.shared.appactions.h.d;
import com.google.android.apps.gsa.assistant.shared.appactions.p5808h.C73823n;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80093ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80886aa;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p7038f.p7039a.C89740aq;
import com.google.android.apps.gsa.shared.p7038f.p7039a.C89757q;
import com.google.android.apps.gsa.shared.p7038f.p7039a.C89758r;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ar */
/* compiled from: PG */
public final class C103669ar implements C103651a {

    /* renamed from: a */
    public static final C58528ij f288754a = C58528ij.m90012L(C89126b.BISTO, C89126b.BISTO_LOW_PRIORITY, C89126b.CONVERSATION_STARTER);

    /* renamed from: b */
    public final Executor f288755b;

    /* renamed from: c */
    public final C68214a f288756c;

    /* renamed from: d */
    public final Context f288757d;

    /* renamed from: e */
    public final C91142g f288758e;

    /* renamed from: f */
    public final C22871g f288759f;

    /* renamed from: g */
    private final C68214a f288760g;

    /* renamed from: h */
    private final C68214a f288761h;

    /* renamed from: i */
    private final C73823n f288762i;

    public C103669ar(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar, C91142g gVar2, C73823n nVar) {
        this.f288757d = context;
        this.f288760g = aVar;
        this.f288761h = aVar2;
        this.f288758e = gVar2;
        this.f288755b = new C103657af(gVar);
        this.f288756c = aVar3;
        this.f288759f = gVar;
        this.f288762i = nVar;
    }

    /* renamed from: b */
    private final C80886aa m171650b(Set set, C123777f fVar) {
        return C80886aa.m128739a((C58485gu) Collection.EL.stream(set).map(new C103660ai(this, fVar)).collect(C58370cn.f155946a), this.f288755b);
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80093ah ahVar;
        C60870cx cxVar;
        if (bnVar.f219917a != 13) {
            return C60856cj.m92900i(C80275dd.f220288c);
        }
        C80093ah ahVar2 = (C80093ah) bnVar.f219918b;
        int i = (ahVar2.f219791a & 1) != 0 ? ahVar2.f219792b : Integer.MAX_VALUE;
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        C62940bt btVar = C123733b.f341777e;
        if (bnVar.f219917a == 13) {
            ahVar = (C80093ah) bnVar.f219918b;
        } else {
            ahVar = C80093ah.f219789d;
        }
        C123733b bVar = ahVar.f219793c;
        if (bVar == null) {
            bVar = C123733b.f341776d;
        }
        eVar.mo58885m(btVar, bVar);
        C123777f fVar = (C123777f) eVar.build();
        if (!this.f288758e.mo85405j(C90019by.f248081o)) {
            cxVar = C60856cj.m92900i(C58729pv.f156485a);
        } else {
            C73823n nVar = this.f288762i;
            String language = nVar.f195134f.d(C58837ba.m90858g(nVar.f195133e.mo79659F())).getLanguage();
            String language2 = Locale.forLanguageTag(Locale.getDefault().toLanguageTag()).getLanguage();
            if (!language.equals(C73823n.f195129a.getLanguage()) || !language2.equals(C73823n.f195129a.getLanguage())) {
                cxVar = C60856cj.m92900i(C58729pv.f156485a);
            } else {
                C60870cx i2 = nVar.f195136h.mo28209i(nVar.f195131c.c(C58837ba.m90858g(nVar.f195133e.mo79659F()), C65753ak.APP_ACTIONS, (String) null, C63662ac.f172144a, C49301bt.f127423f), "Create packageName to packageDisplayName map.", d.a);
                C89757q qVar = nVar.f195130b;
                HashMap hashMap = new HashMap();
                Collection.EL.stream(C89758r.f242951b.mo54948A()).forEach(new C89740aq(hashMap));
                cxVar = C80905at.m128758b(nVar.f195136h, "Add Suggestion-label to the filtered AppActionsDonatedShortcuts.", i2, qVar.mo83621a(hashMap).mo83620a(), new a(nVar));
            }
        }
        C80886aa b = m171650b((Set) this.f288760g.mo27525b(), fVar);
        return this.f288759f.mo28210j(C80886aa.m128739a(C58485gu.m89848p(m171650b((Set) this.f288761h.mo27525b(), fVar), b.mo74702b(C103663al.f288747a).mo74703c(i), b.mo74702b(C103664am.f288748a)), this.f288755b).mo74705f(Collector.CC.m71774of(C103666ao.f288751a, C103667ap.f288752a, C103668aq.f288753a, C103658ag.f288740a, new Collector.Characteristics[0])), "[NGA] Create Dynamic-Shortcut SuggestionChips and add them to the OneOffResponse", new C103665an(this, cxVar));
    }
}
