package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.pcp.p1573k.C18929i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.c */
/* compiled from: PG */
public final /* synthetic */ class C97813c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97846r f273145a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f273146b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f273147c;

    /* renamed from: d */
    public final /* synthetic */ boolean f273148d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f273149e;

    /* renamed from: f */
    public final /* synthetic */ Optional f273150f;

    public /* synthetic */ C97813c(C97846r rVar, C60870cx cxVar, C60870cx cxVar2, boolean z, C60870cx cxVar3, Optional optional) {
        this.f273145a = rVar;
        this.f273146b = cxVar;
        this.f273147c = cxVar2;
        this.f273148d = z;
        this.f273149e = cxVar3;
        this.f273150f = optional;
    }

    public final C60870cx apply(Object obj) {
        List list;
        C97846r rVar = this.f273145a;
        C60870cx cxVar = this.f273146b;
        C60870cx cxVar2 = this.f273147c;
        boolean z = this.f273148d;
        C60870cx cxVar3 = this.f273149e;
        Optional optional = this.f273150f;
        List list2 = (List) obj;
        try {
            if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
                C59104x b = C97846r.f273217a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b).mo56372aa(30231)).mo56386p("#perform(): Smartspace media feature is not enabled.");
                return C118826c.f331423b;
            }
            Instant ofEpochMilli = Instant.ofEpochMilli(((Long) C60856cj.m92909r(cxVar2)).longValue());
            rVar.f273230m = ofEpochMilli;
            Instant a = rVar.f273226i.mo57444a();
            if (rVar.mo90835d(ofEpochMilli, a)) {
                C59104x b2 = C97846r.f273217a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b2).mo56372aa(30230)).mo56389s("#perform(): Smartspace media prefetch task is throttled; isOneOffTask %s.", Boolean.valueOf(z));
                return C118826c.f331423b;
            }
            long longValue = ((Long) C60856cj.m92909r(cxVar3)).longValue();
            if (z || !rVar.mo90834c(longValue, ofEpochMilli, a)) {
                C59104x b3 = C97846r.f273217a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b3).mo56372aa(30228)).mo56386p("#perform(): Smartspace media prefetch task is scheduled.");
                List b4 = rVar.f273223f.mo24191b(rVar.f273222e.mo24219c(C18929i.MOSTLY_USED, Duration.ofSeconds(rVar.f273224g.mo79743a(C90017bw.f247951bM))), new LinkedHashSet(), C53306j.AMBIENT_ASSISTANT, C123777f.f341922a, false, BuildConfig.FLAVOR, true);
                if (optional.isPresent()) {
                    list = (List) Collection.EL.stream(b4).filter(new C97839k((String) optional.get())).collect(Collectors.toList());
                } else {
                    list = (List) Collection.EL.stream(b4).filter(new C97840l(C58758qx.m90648f(rVar.f273224g.mo79745c(C90069du.f249742t)))).collect(Collectors.toList());
                }
                C59104x b5 = C97846r.f273217a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b5).mo56372aa(30235)).mo56389s("#perform() Media apps {%s}.", list);
                List f = C58597ky.m90215f(list, rVar.f273227j);
                Collection.EL.stream(list).map(C97841m.f273208a).distinct().forEach(new C97842n(rVar));
                return C60922j.m93044g(C60856cj.m92907p(rVar.mo90833b(C53306j.AMBIENT_ASSISTANT, z ? OptionalLong.empty() : OptionalLong.m71641of(longValue)), C47633f.m84733g(C60856cj.m92906o((C58485gu) Collection.EL.stream(f).map(new C97843o(rVar, new AtomicInteger())).collect(C58370cn.f155946a))).mo51515h(C97844p.f273212a, rVar.f273225h)), C47810es.m84963c(C97787b.f273031a), rVar.f273219b);
            }
            C59104x b6 = C97846r.f273217a.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
            ((C59052c) ((C59052c) b6).mo56372aa(30229)).mo56386p("#perform(): Smartspace media prefetch task is degradated.");
            return C118826c.f331423b;
        } catch (ExecutionException e) {
            throw c$$ExternalSyntheticBackport0.m162101m("Unhandled exception", e);
        }
    }
}
