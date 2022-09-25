package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.libraries.searchbox.shared.suggestion.C41664ad;
import com.google.android.libraries.searchbox.shared.suggestion.C41667ag;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hu */
/* compiled from: PG */
public final class C112621hu extends C112145l {

    /* renamed from: b */
    public static final /* synthetic */ int f312223b = 0;

    /* renamed from: a */
    public final C112037ao f312224a;

    public C112621hu(C112037ao aoVar) {
        this.f312224a = aoVar;
    }

    /* renamed from: b */
    private final C58485gu m186410b(Map map, int i) {
        return (C58485gu) m186411c(map).filter(C112595gx.f312193a).flatMap(C112596gy.f312194a).filter(C112597gz.f312195a).map(C112601ha.f312203a).map(C112602hb.f312204a).limit((long) i).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    private final Stream m186411c(Map map) {
        return (Stream) Optional.ofNullable((C113295bt) map.get(C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY)).map(C112605he.f312207a).map(new C112607hg(this)).orElse(Stream.CC.m71936of((T[]) new C112036an[0]));
    }

    /* renamed from: d */
    private static boolean m186412d(Optional optional, String str) {
        return ((Boolean) optional.flatMap(C112593gv.f312191a).map(new C112594gw(str)).orElse(false)).booleanValue();
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.TAPAS_APP_ACTIONS_SLICE_ADJUSTER;
    }

    /* renamed from: i */
    public final C60870cx mo99416i(C113405ep epVar, Map map) {
        Optional optional;
        Optional flatMap = Optional.ofNullable((C113295bt) map.get(C48670ae.SUGGESTION_GROUP_SLICE)).map(C112605he.f312207a).flatMap(C112606hf.f312208a);
        if (flatMap.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C121438d.f337093a);
        }
        C113415ez ezVar = (C113415ez) flatMap.get();
        Optional P = ezVar.mo100057P();
        C112037ao aoVar = this.f312224a;
        Objects.requireNonNull(aoVar);
        Optional map2 = P.map(new C112604hd(aoVar));
        if (m186412d(map2, "Create_alarm")) {
            C58485gu b = m186410b(map, 3);
            C58976aa aaVar2 = C58975e.f156826a;
            if (b.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(new C112615ho(b));
            }
        } else if (m186412d(map2, "Get_alarm_info")) {
            C58485gu b2 = m186410b(map, 1);
            C58976aa aaVar3 = C58975e.f156826a;
            if (b2.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(new C112592gu(b2));
            }
        } else if (m186412d(map2, "Create_timer")) {
            C58485gu guVar = (C58485gu) m186411c(map).filter(C112616hp.f312218a).flatMap(C112617hq.f312219a).limit(3).collect(C58370cn.f155946a);
            C58976aa aaVar4 = C58975e.f156826a;
            if (guVar.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(new C112608hh(guVar));
            }
        } else {
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            C58976aa aaVar5 = C58975e.f156826a;
            return C60856cj.m92900i(C121438d.f337093a);
        }
        Function function = (Function) optional.get();
        C41667ag agVar = ezVar.mo100209i().f109016j;
        if (agVar == null) {
            agVar = C41667ag.f108943h;
        }
        Uri uri = (Uri) function.apply(Uri.parse(agVar.f108946b).buildUpon());
        C113414ey h = ezVar.mo100208h();
        C41678d dVar = (C41678d) ezVar.mo100209i().toBuilder();
        C41667ag agVar2 = ezVar.mo100209i().f109016j;
        if (agVar2 == null) {
            agVar2 = C41667ag.f108943h;
        }
        C41664ad adVar = (C41664ad) agVar2.toBuilder();
        String uri2 = uri.toString();
        adVar.copyOnWrite();
        C41667ag agVar3 = (C41667ag) adVar.instance;
        uri2.getClass();
        agVar3.f108945a |= 1;
        agVar3.f108946b = uri2;
        C41667ag agVar4 = (C41667ag) adVar.build();
        dVar.copyOnWrite();
        C41679e eVar = (C41679e) dVar.instance;
        agVar4.getClass();
        eVar.f109016j = agVar4;
        eVar.f109007a |= 512;
        h.mo100161f((C41679e) dVar.build());
        Optional of = Optional.m71637of(h.mo100156a());
        C113295bt btVar = (C113295bt) map.get(C48670ae.SUGGESTION_GROUP_SLICE);
        btVar.getClass();
        btVar.f313760a.set(0, (C113415ez) of.get());
        C121437c a = C121438d.m200684a();
        C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
        brVar.copyOnWrite();
        C59496bt btVar2 = (C59496bt) brVar.instance;
        btVar2.f157862a |= 1;
        btVar2.f157863b = 1;
        a.mo105148c(brVar);
        return C60856cj.m92900i(a.mo105146a());
    }
}
