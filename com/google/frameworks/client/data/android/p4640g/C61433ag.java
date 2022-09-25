package com.google.frameworks.client.data.android.p4640g;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.frameworks.client.data.android.C61373ao;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61512j;
import com.google.frameworks.client.data.android.p4641h.C61488i;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;

/* renamed from: com.google.frameworks.client.data.android.g.ag */
/* compiled from: PG */
public final class C61433ag extends C61512j {

    /* renamed from: a */
    public final C61466h f166106a;

    /* renamed from: b */
    public final List f166107b;

    /* renamed from: c */
    private final ConcurrentHashMap f166108c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentHashMap f166109d = new ConcurrentHashMap();

    public C61433ag(C61466h hVar, List list) {
        this.f166106a = hVar;
        this.f166107b = list;
    }

    /* renamed from: a */
    public final C70888j mo58044a(C61373ao aoVar) {
        String str = aoVar.mo17202a().f84029a;
        C70888j jVar = (C70888j) this.f166108c.get(aoVar);
        if (jVar != null) {
            return jVar;
        }
        C70888j jVar2 = (C70888j) this.f166109d.get(str);
        if (jVar2 == null) {
            C58480gp e = C58485gu.m89837e();
            e.mo55395g(C61488i.m94204b(new C61428ab(this)));
            e.mo55395g(C61488i.m94204b(new C61430ad(this)));
            if (this.f166106a.mo57988i() != null) {
                e.mo55395g(new C61436aj());
            }
            if (this.f166106a.mo57991l() == null) {
                e.mo55395g(new C61437ak());
            } else {
                e.mo55395g(new C61449j());
                e.mo55395g(C61488i.m94204b(C61427aa.f166100a));
            }
            e.mo55395g(new C61454o());
            if (this.f166106a.mo57992m() != null) {
                e.mo55395g(C61488i.m94204b(new C61431ae(this)));
            }
            e.mo55395g(C61488i.m94204b(C61429ac.f166102a));
            jVar2 = C70903r.m103830b(new C61439am(str, this.f166106a), e.mo55394f());
            C70888j jVar3 = (C70888j) this.f166109d.putIfAbsent(str, jVar2);
            if (jVar3 != null) {
                jVar2 = jVar3;
            }
        }
        C70888j b = C70903r.m103830b(jVar2, Arrays.asList(new C70899n[]{C61488i.m94204b(new C61432af(aoVar))}));
        C70888j jVar4 = (C70888j) this.f166108c.putIfAbsent(aoVar, b);
        return jVar4 != null ? jVar4 : b;
    }
}
