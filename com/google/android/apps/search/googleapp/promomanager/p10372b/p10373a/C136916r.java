package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63886r;
import com.google.protos.p5145v.C65904h;
import com.google.protos.p5145v.C65913q;
import com.google.protos.p5145v.C65914r;
import com.google.protos.p5145v.C65915s;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p5451f.p5452a.p5453a.p5454a.C69447l;
import p5451f.p5452a.p5453a.p5454a.C69452q;
import p5451f.p5452a.p5453a.p5454a.C69453r;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.r */
/* compiled from: PG */
public final class C136916r implements C136903e {

    /* renamed from: a */
    private static final C58974d f372640a = C58974d.m91135i("UserEngagedPE");

    /* renamed from: b */
    private final boolean f372641b;

    /* renamed from: c */
    private final C42876ab f372642c;

    /* renamed from: d */
    private final C42876ab f372643d;

    /* renamed from: e */
    private final Executor f372644e;

    /* renamed from: f */
    private final C58495hd f372645f;

    public C136916r(boolean z, C42876ab abVar, C42876ab abVar2, Executor executor) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C65904h.APP_OPEN, C69447l.APP_OPEN);
        gzVar.mo55429h(C65904h.SEARCH, C69447l.SEARCH);
        this.f372645f = gzVar.mo55427f(false);
        this.f372641b = z;
        this.f372642c = abVar;
        this.f372643d = abVar2;
        this.f372644e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        Object obj;
        C58970a aVar = (C58970a) ((C58970a) f372640a.mo56224b()).mo56372aa(40888);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63886r.f172741f);
        sVar.mo58887l(r0);
        if (!sVar.f169962ag.mo58857o(r0.f169971d)) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
        }
        C62940bt r02 = C62942bv.checkIsLite(C63886r.f172741f);
        sVar.mo58887l(r02);
        Object l = sVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C63886r rVar = (C63886r) obj;
        if (this.f372641b) {
            C65904h a2 = C65904h.m96824a(rVar.f172743a);
            a2.getClass();
            C65913q a3 = C65913q.m96825a(rVar.f172746d);
            a3.getClass();
            int a4 = C65915s.m96828a(rVar.f172744b);
            if (a4 != 0) {
                int a5 = C65914r.m96827a(rVar.f172745c);
                if (a5 == 0) {
                    throw null;
                } else if (a2.equals(C65904h.UNKNOWN_FEATURE_TYPE) || a3.equals(C65913q.UNKNOWN_ACTIVITY) || a4 == 1 || a5 == 1) {
                    return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
                } else {
                    C63042fg fgVar = djVar.f372883c;
                    if (fgVar == null) {
                        fgVar = C63042fg.f170152c;
                    }
                    long epochMilli = C62950b.m95474e(fgVar).truncatedTo(ChronoUnit.DAYS).minus(Duration.ofDays(1)).toEpochMilli();
                    C60870cx d = this.f372642c.mo46042d();
                    C136914p pVar = new C136914p(epochMilli, a2, a5, a4, a3);
                    return C60922j.m93044g(d, C47810es.m84963c(pVar), this.f372644e);
                }
            } else {
                throw null;
            }
        } else {
            C65904h a6 = C65904h.m96824a(rVar.f172743a);
            a6.getClass();
            C69447l lVar = (C69447l) this.f372645f.getOrDefault(a6, C69447l.UNKNOWN);
            C65913q a7 = C65913q.m96825a(rVar.f172746d);
            a7.getClass();
            int a8 = C69453r.m100764a(rVar.f172744b);
            if (a8 != 0) {
                int a9 = C69452q.m100763a(rVar.f172745c);
                if (a9 == 0) {
                    throw null;
                } else if (lVar.equals(C69447l.UNKNOWN) || a7.equals(C65913q.UNKNOWN_ACTIVITY) || a8 == 1 || a9 == 1) {
                    return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
                } else {
                    C63042fg fgVar2 = djVar.f372883c;
                    if (fgVar2 == null) {
                        fgVar2 = C63042fg.f170152c;
                    }
                    long epochMilli2 = C62950b.m95474e(fgVar2).truncatedTo(ChronoUnit.DAYS).minus(Duration.ofDays(1)).toEpochMilli();
                    C60870cx d2 = this.f372643d.mo46042d();
                    C136915q qVar = new C136915q(epochMilli2, lVar, a9, a8, a7);
                    return C60922j.m93044g(d2, C47810es.m84963c(qVar), this.f372644e);
                }
            } else {
                throw null;
            }
        }
    }
}
