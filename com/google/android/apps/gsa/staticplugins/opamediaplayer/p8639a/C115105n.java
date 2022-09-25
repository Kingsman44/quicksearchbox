package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85348q;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85329g;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5285d.p5290b.p5291a.p5292a.C68182br;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68184bt;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5285d.p5290b.p5291a.p5292a.C68186bv;
import p5285d.p5290b.p5291a.p5292a.C68187bw;
import p5285d.p5290b.p5291a.p5292a.C68188bx;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.a.n */
/* compiled from: PG */
public final /* synthetic */ class C115105n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f319503a;

    /* renamed from: b */
    public final /* synthetic */ C52582xb f319504b;

    public /* synthetic */ C115105n(C86124t tVar, C52582xb xbVar) {
        this.f319503a = tVar;
        this.f319504b = xbVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C86124t tVar = this.f319503a;
        C85348q qVar = (C85348q) obj;
        Map c = C85329g.m136795c(tVar, C58833ax.m90834k(this.f319504b));
        C68189by byVar = qVar.f231144c;
        if (byVar == null) {
            byVar = C68189by.f184505b;
        }
        C68188bx bxVar = (C68188bx) byVar.toBuilder();
        for (Map.Entry entry : c.entrySet()) {
            String str = (String) entry.getKey();
            C58485gu guVar = (C58485gu) entry.getValue();
            C68189by byVar2 = qVar.f231144c;
            if (byVar2 == null) {
                byVar2 = C68189by.f184505b;
            }
            C58833ax j = C58833ax.m90833j((C68185bu) Collection.EL.stream(byVar2.f184507a).filter(new C115107p(str)).map(C115108q.f319507a).findFirst().orElse(null));
            if (j.mo56113h()) {
                if (!Collection.EL.stream(guVar).anyMatch(new C115109r(j))) {
                    C58485gu j2 = C58485gu.m89842j((java.util.Collection) Collection.EL.stream(Collections.unmodifiableList(((C68189by) bxVar.instance).f184507a)).filter(new C115110s(str)).collect(Collectors.toList()));
                    bxVar.copyOnWrite();
                    ((C68189by) bxVar.instance).f184507a = C68189by.emptyProtobufList();
                    bxVar.mo60283a(j2);
                }
            }
            boolean e = tVar.mo79746e(C90125fw.f250946y);
            if (guVar.isEmpty()) {
                axVar = C58836b.f156633a;
            } else {
                C68184bt btVar = (C68184bt) C68185bu.f184497d.createBuilder();
                String str2 = ((C85333k) guVar.get(0)).f231107b;
                btVar.copyOnWrite();
                str2.getClass();
                ((C68185bu) btVar.instance).f184499a = str2;
                C68185bu buVar = (C68185bu) btVar.build();
                if (e) {
                    axVar = C58833ax.m90834k((C68185bu) Collection.EL.stream(guVar).filter(C115111t.f319510a).map(C115112u.f319511a).findFirst().orElse(buVar));
                } else {
                    axVar = C58833ax.m90834k(buVar);
                }
            }
            if (axVar.mo56113h()) {
                C68182br brVar = (C68182br) C68183bs.f184493c.createBuilder();
                C68186bv bvVar = (C68186bv) C68187bw.f184502b.createBuilder();
                bvVar.copyOnWrite();
                str.getClass();
                ((C68187bw) bvVar.instance).f184504a = str;
                brVar.copyOnWrite();
                C68187bw bwVar = (C68187bw) bvVar.build();
                bwVar.getClass();
                ((C68183bs) brVar.instance).f184495a = bwVar;
                C68185bu buVar2 = (C68185bu) axVar.mo56107c();
                brVar.copyOnWrite();
                buVar2.getClass();
                ((C68183bs) brVar.instance).f184496b = buVar2;
                bxVar.mo60284b((C68183bs) brVar.build());
            }
        }
        return (C68189by) bxVar.build();
    }
}
