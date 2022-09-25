package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.p1254a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15968a;
import com.google.android.libraries.assistant.pcp.C18525a;
import com.google.android.libraries.assistant.pcp.C18701g;
import com.google.android.libraries.assistant.pcp.C18773h;
import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18711c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18714f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.e */
/* compiled from: PG */
public final /* synthetic */ class C16274e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C16280k f47908a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47909b;

    /* renamed from: c */
    public final /* synthetic */ List f47910c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f47911d;

    public /* synthetic */ C16274e(C16280k kVar, C60870cx cxVar, List list, C60870cx cxVar2) {
        this.f47908a = kVar;
        this.f47909b = cxVar;
        this.f47910c = list;
        this.f47911d = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C16280k kVar = this.f47908a;
        C60870cx cxVar4 = this.f47909b;
        List<Integer> list = this.f47910c;
        C60870cx cxVar5 = this.f47911d;
        C15968a aVar = kVar.f47927f;
        Objects.requireNonNull(aVar);
        ((Optional) C60856cj.m92909r(cxVar4)).ifPresent(new C16278i(aVar));
        C18718c cVar = (C18718c) C60856cj.m92909r(cxVar5);
        C60870cx a = cVar.mo24114a(C18714f.f52791a);
        if (list.contains(1) || list.contains(10)) {
            if (!((Boolean) kVar.f47931j.mo17428b()).booleanValue()) {
                C58976aa aaVar = C58975e.f156826a;
                cxVar3 = C60856cj.m92900i(kVar.f47928g.mo24049b(cVar));
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                C58526ih ihVar = new C58526ih();
                for (Integer intValue : list) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 == 1) {
                        ihVar.mo55373c(C18579g.m36038b(C49051eq.ZEROSTATE_CONTEXTUAL_SUGGESTIONS));
                        ihVar.mo55373c(C18579g.m36038b(C49051eq.PLAY_MEDIA));
                    } else if (intValue2 == 10) {
                        ihVar.mo55373c(C18579g.m36038b(C49051eq.POTTER_MEDIA));
                    }
                }
                C18701g gVar = kVar.f47928g;
                C18773h c = C18777i.m36178c();
                c.mo24040b(ihVar.mo55486f());
                ((C18525a) c).f52500a = 2;
                cxVar3 = gVar.mo24048a(cVar, c.mo24039a());
            }
            C16271b bVar = C16271b.f47903a;
            cxVar = C60922j.m93045h(cxVar3, C47810es.m84966f(bVar), kVar.f47924c);
        } else {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        }
        if (list.contains(9)) {
            cxVar2 = cVar.mo24114a(C18711c.f52782b);
        } else {
            cxVar2 = C60856cj.m92900i(Optional.empty());
        }
        return C47638k.m84751b(a, cxVar, cxVar2).mo51520a(new C16279j(a, cxVar, cxVar2), kVar.f47925d);
    }
}
