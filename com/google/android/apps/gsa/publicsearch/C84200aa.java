package com.google.android.apps.gsa.publicsearch;

import android.os.IBinder;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88184sg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88186si;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88187sj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88189sl;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.apps.gsa.publicsearch.aa */
/* compiled from: PG */
public final class C84200aa extends C84208h implements IBinder.DeathRecipient {

    /* renamed from: a */
    public static final C59071e f229194a = C59071e.m91332i("com.google.android.apps.gsa.publicsearch.aa");

    /* renamed from: b */
    public final C87673aa f229195b;

    /* renamed from: c */
    public final C84212l f229196c;

    /* renamed from: d */
    public final C22871g f229197d;

    /* renamed from: e */
    private final C84226y f229198e;

    public C84200aa(C87677ae aeVar, C84212l lVar, ClientConfig clientConfig, C22871g gVar) {
        C84226y yVar = new C84226y();
        this.f229198e = yVar;
        this.f229195b = aeVar.mo81958a(new C84227z(lVar), yVar, clientConfig);
        this.f229196c = lVar;
        this.f229197d = gVar;
    }

    /* renamed from: b */
    private static C87741bw m134241b(byte[] bArr) {
        try {
            return (C87741bw) C62942bv.parseFrom((C62942bv) C87741bw.f237477c, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            C59104x d = f229194a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PublicSession");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7111)).mo56386p("Invalid ClientEventProto received.");
            return null;
        }
    }

    /* renamed from: c */
    private final void m134242c(String str, C22869e eVar) {
        if (C22872h.m42744d(C0826b.class)) {
            eVar.run();
        } else {
            this.f229197d.mo28212l(str, eVar);
        }
    }

    /* renamed from: a */
    public final void mo77669a() {
        this.f229195b.mo81934f();
        try {
            this.f229196c.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException unused) {
        }
    }

    public final void binderDied() {
        this.f229197d.mo28212l("Dispose searchServiceClient", new C84217p(this));
    }

    /* renamed from: e */
    public final void mo77671e(byte[] bArr) {
        Object obj;
        Object obj2;
        C87741bw b = m134241b(bArr);
        if (b != null) {
            C87739bu buVar = C87739bu.UNKNOWN;
            C87739bu a = C87739bu.m142761a(b.f237480b);
            if (a == null) {
                a = C87739bu.UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 59) {
                C62940bt r0 = C62942bv.checkIsLite(C88184sg.f238391a);
                b.mo58887l(r0);
                Object l = b.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                C88186si siVar = (C88186si) obj;
                int i = siVar.f238394a;
                if (i != 1 && i != 2) {
                    m134242c("PublicSessionSSC#startNewSession", new C84219r(this));
                } else if (i == 2) {
                    m134242c("PublicSessionSSC#startWithSessionContext", new C84220s(this, siVar));
                } else {
                    m134242c("PublicSessionSSC#startWithHandoverId", new C84221t(this, siVar));
                }
            } else if (ordinal == 60) {
                C62940bt r02 = C62942bv.checkIsLite(C88187sj.f238397a);
                b.mo58887l(r02);
                Object l2 = b.f169962ag.mo58854l(r02.f169971d);
                if (l2 == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l2);
                }
                if (!((C88189sl) obj2).f238401b) {
                    m134242c("PublicSessionSSC#stop", new C84222u(this));
                } else {
                    m134242c("PublicSessionSSC#stopAndHandover", new C84223v(this));
                }
            } else if (ordinal != 158) {
                m134242c("PublicSessionSSC#onGenericClientEvent", new C84218q(this, b));
            } else {
                this.f229197d.mo28212l("Dispose searchServiceClient", new C84217p(this));
            }
        }
    }

    /* renamed from: f */
    public final void mo77672f(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        C87741bw b = m134241b(bArr);
        if (b != null) {
            C87739bu a = C87739bu.m142761a(b.f237480b);
            if (a == null) {
                a = C87739bu.UNKNOWN;
            }
            if (a != C87739bu.END_SESSION) {
                m134242c("PublicSessionSSC#onGenericClientEventParcelable", new C84225x(this, b, systemParcelableWrapper));
                return;
            }
            throw new IllegalArgumentException("Use onGenericClientEvent(byte[] proto) for the END_SESSION event.");
        }
    }

    /* renamed from: g */
    public final void mo77673g(C84206f fVar) {
        this.f229198e.f229226a = fVar;
    }
}
