package com.google.frameworks.client.data.android.p4640g;

import com.google.common.base.C58833ax;
import com.google.frameworks.client.data.android.C61371am;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61374ap;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61506i;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4635c.C61397c;
import com.google.frameworks.client.data.android.p4635c.C61398d;
import com.google.frameworks.client.data.android.p4635c.C61400f;
import com.google.frameworks.client.data.android.p4641h.C61488i;
import java.util.HashMap;
import java.util.Map;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70899n;

/* renamed from: com.google.frameworks.client.data.android.g.aj */
/* compiled from: PG */
public final class C61436aj implements C70899n {

    /* renamed from: a */
    private final Map f166111a = new HashMap();

    /* renamed from: a */
    public final C70898m mo27479a(C70338di diVar, C70851i iVar, C70888j jVar) {
        C58833ax axVar;
        C61466h hVar = (C61466h) iVar.mo62571g(C61506i.f166279a);
        C61371am i = hVar.mo57988i();
        int e = ((C61372an) iVar.mo62571g(C61372an.f165953a)).mo17188e();
        if (e != 0) {
            if (e == 2) {
                String str = (String) iVar.mo62571g(C61374ap.f165954a);
                if (str == null) {
                    str = ((C61372an) iVar.mo62571g(C61372an.f165953a)).mo17185b().mo17202a().f84029a;
                }
                C61450k kVar = new C61450k(str, (C61333a) iVar.mo62571g(C61333a.f165865a), diVar.f187497b);
                synchronized (this.f166111a) {
                    axVar = (C58833ax) this.f166111a.get(kVar);
                    if (axVar == null) {
                        axVar = C58833ax.m90833j(i.mo57937a());
                        this.f166111a.put(kVar, axVar);
                    }
                }
                if (axVar.mo56113h()) {
                    C61397c h = C61398d.m93953h();
                    h.f166025a = (C61400f) axVar.mo56107c();
                    h.f166026b = hVar.mo57994o();
                    h.f166025a.getClass();
                    h.f166026b.getClass();
                    return C61488i.m94204b(new C61434ah(new C61398d(h))).mo27479a(diVar, iVar, jVar);
                }
            }
            return jVar.mo39510a(diVar, iVar);
        }
        throw null;
    }
}
