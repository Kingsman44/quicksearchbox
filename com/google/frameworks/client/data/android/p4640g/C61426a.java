package com.google.frameworks.client.data.android.p4640g;

import com.google.common.base.C58838bb;
import com.google.frameworks.client.data.android.C61332a;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70851i;

/* renamed from: com.google.frameworks.client.data.android.g.a */
/* compiled from: PG */
public final class C61426a implements C61485f {

    /* renamed from: a */
    static final C70297cz f166099a = new C70290cs("X-Goog-Api-Key", C70334de.f187481c);

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C70851i iVar = bVar.f166236b;
        if (iVar.mo62571g(C61409d.f166071a) != null) {
            return C61479al.f166225a;
        }
        C61332a aVar = (C61332a) iVar.mo62571g(C61332a.f165864a);
        boolean z = false;
        if (aVar != null) {
            C58838bb.m90884s(iVar.mo62571g(C61333a.f165865a) == null, "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
        }
        C61372an anVar = (C61372an) iVar.mo62571g(C61372an.f165953a);
        String c = anVar.mo17185b().mo17204c();
        String a = aVar != null ? aVar.mo57902a() : null;
        if (aVar != null && aVar.mo57902a() == null) {
            if (c != null) {
                z = true;
            }
            C58838bb.m90884s(z, "ApiKeyOption defaultApiKey was used, but no default exists");
        }
        if (a != null) {
            c = a;
        }
        if (anVar.mo17187d() && c != null) {
            C70334de deVar = bVar.f166235a;
            C70297cz czVar = f166099a;
            C58838bb.m90884s(!deVar.mo62035j(czVar), "API key was already attached to the request");
            bVar.f166235a.mo62033h(czVar, c);
        }
        return C61479al.f166225a;
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
