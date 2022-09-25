package com.google.apps.tiktok.p3644h;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.apps.tiktok.h.w */
/* compiled from: PG */
final class C47146w implements C61485f {

    /* renamed from: a */
    private static final C70297cz f122763a = new C70290cs("Authorization", C70334de.f187481c);

    /* renamed from: b */
    private static final C70297cz f122764b = new C70290cs("X-Auth-Time", C70334de.f187481c);

    /* renamed from: c */
    private final C47115aj f122765c;

    /* renamed from: d */
    private C60870cx f122766d;

    public C47146w(C47115aj ajVar) {
        this.f122765c = ajVar;
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        try {
            C47139p pVar = (C47139p) C60856cj.m92909r(this.f122766d);
            if (pVar.f122760b != null) {
                C70334de deVar = bVar.f166235a;
                C70297cz czVar = f122763a;
                C58838bb.m90884s(!deVar.mo62035j(czVar), "Already attached auth token");
                C70334de deVar2 = bVar.f166235a;
                String str = pVar.f122760b.f122701a;
                deVar2.mo62033h(czVar, "Bearer " + str);
                bVar.f166235a.mo62033h(f122764b, Long.toString(pVar.f122760b.f122702b));
            }
            return C61479al.f166225a;
        } catch (ExecutionException e) {
            return C61479al.m94189b(Status.m102099c(Status.Code.UNKNOWN).mo61678e(e.getCause()).withDescription("Could not obtain auth token"), new C70334de());
        }
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C60870cx cxVar = (C60870cx) bVar.f166236b.mo62571g(C47139p.f122759a);
        if (cxVar == null) {
            return C61479al.f166225a;
        }
        this.f122766d = cxVar;
        return C61479al.m94190c(cxVar);
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
