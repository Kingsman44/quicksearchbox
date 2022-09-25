package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89058n;
import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60324oh;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.net.URL;

/* renamed from: com.google.android.libraries.gsa.c.a.j */
/* compiled from: PG */
public final class C22258j implements C22244bp {

    /* renamed from: a */
    public final C89020ar f61489a;

    /* renamed from: b */
    private final C22214am f61490b;

    /* renamed from: c */
    private final C22871g f61491c;

    /* renamed from: d */
    private final C89061q f61492d;

    /* renamed from: e */
    private final C58528ij f61493e = C58528ij.m90015O(Integer.valueOf(C89885b.CRONET_NET_ERROR_INTERNET_DISCONNECTED_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_NAME_NOT_RESOLVED_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_ADDRESS_UNREACHABLE_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CONNECTION_REFUSED_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CONNECTION_TIMED_OUT_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_PROXY_CONNECTION_FAILED_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_TUNNEL_CONNECTION_FAILED_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_SSL_PROTOCOL_ERROR_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_NAME_RESOLUTION_FAILED_VALUE));

    /* renamed from: f */
    private final C58528ij f61494f = C58528ij.m90012L(Integer.valueOf(C89885b.CRONET_NET_ERROR_CERT_AUTHORITY_INVALID_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CERT_DATE_INVALID_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CERT_COMMON_NAME_INVALID_VALUE));

    /* renamed from: g */
    private C89068x f61495g;

    /* renamed from: h */
    private int f61496h;

    /* renamed from: i */
    private final boolean f61497i;

    /* renamed from: j */
    private C89058n f61498j;

    public C22258j(C89020ar arVar, C89068x xVar, C89061q qVar, C22871g gVar, C22214am amVar) {
        this.f61490b = amVar;
        this.f61491c = gVar;
        this.f61489a = arVar;
        this.f61497i = arVar.f241265n;
        this.f61495g = xVar;
        this.f61492d = qVar;
        this.f61496h = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.f241367e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m41619e(com.google.android.apps.gsa.shared.p6968aa.C89060p r2) {
        /*
            com.google.common.o.oh r0 = r2.f241367e
            com.google.common.o.oh r1 = com.google.common.p4552o.C60324oh.UNKNOWN
            if (r0 == r1) goto L_0x0013
            com.google.common.o.oh r2 = r2.f241367e
            com.google.common.o.oh r0 = com.google.common.p4552o.C60324oh.QUALITY_UNKNOWN
            if (r2 == r0) goto L_0x0013
            com.google.common.o.oh r0 = com.google.common.p4552o.C60324oh.QUALITY_MET
            if (r2 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            return r2
        L_0x0013:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1833c.p1834a.C22258j.m41619e(com.google.android.apps.gsa.shared.aa.p):boolean");
    }

    /* renamed from: a */
    public final C60870cx mo27512a(C89060p pVar) {
        C58976aa aaVar = C58975e.f156826a;
        C89020ar arVar = this.f61489a;
        URL url = arVar.f241257f;
        C89058n b = this.f61492d.mo27432b(arVar);
        C89058n nVar = this.f61498j;
        if (nVar != null) {
            b.mo82972p(nVar.mo82958a());
        }
        this.f61498j = b;
        if (m41619e(pVar)) {
            return mo27513c(b);
        }
        if (pVar.f241367e != C60324oh.QUALITY_NOT_MET) {
            return C60922j.m93045h(this.f61492d.mo27438h(b), new C22256h(this, b), C60826bg.f164896a);
        }
        C90457d dVar = pVar.f241368f;
        dVar.getClass();
        return mo27514d(b, dVar);
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C89021as asVar = (C89021as) obj;
        if (this.f61496h == 0 || !this.f61495g.mo27477f()) {
            return C60856cj.m92900i(asVar);
        }
        boolean contains = C89020ar.f241254c.contains(this.f61489a.f241258g);
        try {
            asVar.mo82997b();
        } catch (C90457d e) {
            e = e;
            while (e.getCause() instanceof C90457d) {
                e = (C90457d) e.getCause();
            }
            int i = e.f252687a;
            C58528ij ijVar = this.f61493e;
            Integer valueOf = Integer.valueOf(i);
            boolean contains2 = ijVar.contains(valueOf);
            boolean z = false;
            if (!this.f61494f.contains(valueOf)) {
                boolean z2 = i > 660000 && i < 662000;
                boolean z3 = (i > 670000 && i < 672000) || i == 656398;
                if (z2 || z3) {
                    z = true;
                }
            }
            if (contains2 || (z && contains)) {
                C58976aa aaVar = C58975e.f156826a;
                this.f61496h--;
                this.f61495g.mo27475d();
                this.f61495g = this.f61495g.mo27476e();
                return mo27512a(C89060p.f241363a);
            }
        } catch (C89013ak e2) {
            int i2 = e2.f241213a;
            if (i2 >= 500 && i2 <= 599 && contains && i2 != 503) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f61496h--;
                this.f61495g.mo27475d();
                this.f61495g = this.f61495g.mo27476e();
                return mo27512a(C89060p.f241363a);
            }
        }
        return C60856cj.m92900i(asVar);
    }

    /* renamed from: b */
    public final C60870cx mo27489b() {
        if (this.f61497i) {
            return mo27512a(C89060p.f241363a);
        }
        return C60922j.m93045h(this.f61492d.mo27435e(), new C22257i(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo27513c(C89058n nVar) {
        C22214am amVar = this.f61490b;
        return C60922j.m93045h(C60922j.m93045h(amVar.f61331i.mo27457a(), new C22211aj(amVar, this.f61489a, this.f61495g, nVar, this.f61492d), C60826bg.f164896a), this, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo27514d(C89058n nVar, C90457d dVar) {
        nVar.mo82966j(dVar);
        this.f61491c.mo28212l("Log that request finished with error.", new C22255g(nVar));
        return C60856cj.m92900i(new C89057m(dVar));
    }
}
