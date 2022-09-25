package com.google.frameworks.client.data.android.p4643j;

import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61506i;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70851i;

/* renamed from: com.google.frameworks.client.data.android.j.b */
/* compiled from: PG */
public final class C61514b implements C61485f {

    /* renamed from: a */
    private static final C58974d f166291a = C58974d.m91134h("xRPC");

    /* renamed from: b */
    private C61516d f166292b;

    /* renamed from: c */
    private C70337dh f166293c;

    /* renamed from: d */
    private C61515c f166294d;

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        this.f166293c = bVar.f166237c.f187496a;
        C70851i iVar = bVar.f166236b;
        C61466h hVar = (C61466h) iVar.mo62571g(C61506i.f166279a);
        this.f166294d = new C61515c(hVar.mo57984f(), hVar.mo57989j());
        boolean z = true;
        C58838bb.m90873h(iVar.mo62571g(C61516d.f166297b) == null, "Unexpected option %s already set.", C61516d.f166297b);
        if (iVar.mo62571g(C61513a.f166290a) != null) {
            z = false;
        }
        C58838bb.m90873h(z, "Unexpected option %s already set.", C61513a.f166290a);
        this.f166292b = new C61516d((C61372an) iVar.mo62571g(C61372an.f165953a));
        return C61479al.m94191d(iVar.mo62569e(C61516d.f166297b, this.f166292b).mo62569e(C61513a.f166290a, this.f166292b));
    }

    /* renamed from: c */
    public final C61480am mo39485c(C61467a aVar) {
        try {
            C58838bb.m90884s(this.f166292b.f166308m.getAndSet(aVar.f166174a.getCode()) == null, "Already recorded result.");
            C61515c cVar = this.f166294d;
            C61516d dVar = this.f166292b;
            if (((Boolean) cVar.f166295a.mo6453a()).booleanValue() && dVar.f166300e.get()) {
                C31167ax a = C31167ax.m58112a();
                C31447f a2 = C31447f.m58634a((String) null, dVar.f166298c.mo17184a());
                boolean z = dVar.f166299d.get();
                a2.f84681q = 1;
                a2.f84682r = z ? 1 : 0;
                a.mo36913d(a2);
            }
            if (cVar.f166296b == null) {
                return C61480am.f166232a;
            }
            throw null;
        } catch (Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) f166291a.mo56225c()).mo56382g(th)).mo56372aa(54887)).mo56386p("Failed to record RPC metrics");
        }
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final C61479al mo39488f() {
        if (this.f166293c.equals(C70337dh.CLIENT_STREAMING) || this.f166293c.equals(C70337dh.BIDI_STREAMING)) {
            this.f166292b.f166303h.incrementAndGet();
        }
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final C61480am mo39489g() {
        if (this.f166293c.equals(C70337dh.SERVER_STREAMING) || this.f166293c.equals(C70337dh.BIDI_STREAMING)) {
            this.f166292b.f166302g.incrementAndGet();
        }
        return C61480am.f166232a;
    }
}
