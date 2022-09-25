package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1552c.C18608c;
import com.google.android.libraries.assistant.pcp.p1544c.C18553a;
import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1555f.C18677a;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18795c;
import com.google.android.libraries.assistant.pcp.p1575l.p1577b.C18956e;
import com.google.android.libraries.assistant.pcp.p1579n.C18998a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C49018dk;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3803ag.p3809c.C49020dm;
import com.google.assistant.p3803ag.p3809c.C49021dn;
import com.google.assistant.p3803ag.p3809c.C49022do;
import com.google.assistant.p3803ag.p3809c.C49023dp;
import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.assistant.p3803ag.p3809c.C49116ha;
import com.google.assistant.p3803ag.p3809c.C49118hc;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.w */
/* compiled from: PG */
public final class C18700w implements C18677a {

    /* renamed from: g */
    private static final C59071e f52759g = C59071e.m91332i("com.google.android.libraries.assistant.pcp.f.a.w");

    /* renamed from: a */
    public final C58495hd f52760a;

    /* renamed from: b */
    public final C18795c f52761b;

    /* renamed from: c */
    public final C18553a f52762c;

    /* renamed from: d */
    public final C60950i f52763d;

    /* renamed from: e */
    public final Executor f52764e;

    /* renamed from: f */
    public final C18608c f52765f;

    /* renamed from: h */
    private final C58495hd f52766h;

    /* renamed from: i */
    private final C18956e f52767i;

    public C18700w(Map map, Map map2, C18795c cVar, C18608c cVar2, C18553a aVar, C60950i iVar, Executor executor, C18956e eVar) {
        this.f52760a = C58495hd.m89898l(map);
        this.f52766h = C58495hd.m89898l(map2);
        this.f52761b = cVar;
        this.f52765f = cVar2;
        this.f52762c = aVar;
        this.f52763d = iVar;
        this.f52764e = executor;
        this.f52767i = eVar;
    }

    /* renamed from: d */
    public static C58528ij m36127d(C58528ij ijVar, Optional optional) {
        if (optional.isEmpty() || ijVar.contains(optional.get())) {
            return ijVar;
        }
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(ijVar);
        ihVar.mo55373c(optional.get());
        return ihVar.mo55486f();
    }

    /* renamed from: a */
    public final C60870cx mo24101a() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method NOT yet implemented."));
    }

    /* renamed from: b */
    public final C60870cx mo24102b() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method NOT yet implemented."));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C49019dl mo24111c(C58485gu guVar, C58495hd hdVar, C18579g gVar, C49019dl dlVar) {
        ArrayList arrayList = new ArrayList(guVar);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C53306j jVar = (C53306j) entry.getKey();
            try {
                arrayList.addAll((List) C60856cj.m92909r((Future) entry.getValue()));
                hashSet.add(jVar);
                this.f52767i.mo24231a(1, jVar, gVar);
            } catch (CancellationException e) {
                this.f52767i.mo24231a(2, jVar, gVar);
                ((C59052c) ((C59052c) ((C59052c) f52759g.mo56226d()).mo56382g(e)).mo56372aa(47334)).mo56359L("ProactiveDataRenderer::render cancelled for ClientType [%s], FeatureType [%s], DataElement id [%s]", jVar.name(), gVar, dlVar.f126796c);
            } catch (ExecutionException e2) {
                C49020dm dmVar = (C49020dm) C49023dp.f126805e.createBuilder();
                int i = ((C18575c) gVar).f52601a;
                dmVar.copyOnWrite();
                C49023dp dpVar = (C49023dp) dmVar.instance;
                dpVar.f126807a |= 1;
                dpVar.f126808b = i;
                String str = dlVar.f126796c;
                dmVar.copyOnWrite();
                C49023dp dpVar2 = (C49023dp) dmVar.instance;
                str.getClass();
                dpVar2.f126807a = 2 | dpVar2.f126807a;
                dpVar2.f126809c = str;
                C49021dn dnVar = (C49021dn) C49022do.f126800d.createBuilder();
                dnVar.copyOnWrite();
                C49022do doVar = (C49022do) dnVar.instance;
                doVar.f126803b = jVar.f139793X;
                doVar.f126802a = 1 | doVar.f126802a;
                C49022do doVar2 = (C49022do) dnVar.build();
                dmVar.copyOnWrite();
                C49023dp dpVar3 = (C49023dp) dmVar.instance;
                doVar2.getClass();
                dpVar3.mo53211a();
                dpVar3.f126810d.add(doVar2);
                hashSet2.add((C49023dp) dmVar.build());
                this.f52767i.mo24231a(3, jVar, gVar);
                ((C59052c) ((C59052c) ((C59052c) f52759g.mo56226d()).mo56382g(e2)).mo56372aa(47335)).mo56359L("ProactiveDataRenderer::render failed for ClientType [%s], FeatureType [%s], DataElement id [%s]", jVar.name(), gVar, dlVar.f126796c);
            }
        }
        Stream filter = Collection.EL.stream(dlVar.f126798e).filter(new C18681d(hashSet));
        Objects.requireNonNull(arrayList);
        filter.forEach(new C18682e(arrayList));
        hashSet2.isEmpty();
        C49018dk dkVar = (C49018dk) dlVar.toBuilder();
        dkVar.copyOnWrite();
        ((C49019dl) dkVar.instance).f126798e = C49019dl.emptyProtobufList();
        dkVar.mo53208a(arrayList);
        return (C49019dl) dkVar.build();
    }

    /* renamed from: e */
    public final C60870cx mo24112e(C49019dl dlVar, Set set, C18718c cVar) {
        C18575c cVar2 = new C18575c(dlVar.f126795b);
        C49116ha haVar = dlVar.f126797d;
        if (haVar == null) {
            haVar = C49116ha.f127027d;
        }
        if (haVar.f127030b == null) {
            C49118hc hcVar = C49118hc.f127034a;
        }
        C58490gz gzVar = new C58490gz(4);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C53306j jVar = (C53306j) it.next();
            Optional ofNullable = Optional.ofNullable((C18998a) this.f52766h.get(new C18678a(jVar, (C49051eq) cVar2.mo24073c().orElse(C49051eq.UNDEFINED))));
            if (!ofNullable.isEmpty()) {
                gzVar.mo55429h(jVar, ((C18998a) ofNullable.get()).mo24237a(cVar2, jVar, cVar));
            }
        }
        C58495hd f = gzVar.mo55427f(false);
        return C47638k.m84750a(f.values()).mo51520a(new C18691n(this, (C58485gu) Collection.EL.stream(set).filter(new C18688k(f, dlVar)).map(C18689l.f52732a).collect(C58370cn.f155946a), f, cVar2, dlVar), this.f52764e);
    }
}
