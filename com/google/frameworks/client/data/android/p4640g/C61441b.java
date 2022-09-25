package com.google.frameworks.client.data.android.p4640g;

import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.frameworks.client.data.android.C61332a;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4632a.C61342c;
import com.google.frameworks.client.data.android.p4632a.C61351l;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import p5488io.grpc.C70851i;

/* renamed from: com.google.frameworks.client.data.android.g.b */
/* compiled from: PG */
public final class C61441b implements C61485f {

    /* renamed from: a */
    private C61342c f166117a;

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        return this.f166117a.mo39483a(bVar);
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C70851i iVar = bVar.f166236b;
        if (iVar.mo62571g(C61409d.f166071a) != null) {
            return C61479al.f166225a;
        }
        if (iVar.mo62571g(C61351l.f165913a) != null) {
            return C61479al.f166225a;
        }
        if (iVar.mo62571g(C61332a.f165864a) != null) {
            C58838bb.m90884s(iVar.mo62571g(C61333a.f165865a) == null, "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
            return C61479al.f166225a;
        }
        C61342c h = C61342c.m93839h(C58836b.f156633a);
        this.f166117a = h;
        return h.mo39484b(bVar);
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
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
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
