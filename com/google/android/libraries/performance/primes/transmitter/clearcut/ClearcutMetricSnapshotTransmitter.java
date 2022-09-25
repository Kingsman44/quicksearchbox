package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.usagereporting.C146091c;
import com.google.android.gms.usagereporting.C146092d;
import com.google.android.gms.usagereporting.C146093e;
import com.google.android.gms.usagereporting.C146098j;
import com.google.android.gms.usagereporting.C146103o;
import com.google.android.gms.usagereporting.C146104p;
import com.google.android.gms.usagereporting.C146105q;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.performance.primes.transmitter.C31617i;
import com.google.android.libraries.performance.primes.transmitter.C31618j;
import com.google.android.libraries.performance.primes.transmitter.p2417a.C31592f;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5446y.p5447a.C69325ad;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* compiled from: PG */
class ClearcutMetricSnapshotTransmitter implements C31618j {

    /* renamed from: a */
    public static final C58881cr f85034a = C58886cw.m90973a(C31599e.f85063a);

    /* renamed from: b */
    public volatile C143658k f85035b;

    /* renamed from: c */
    public volatile C143658k f85036c;

    /* renamed from: d */
    public final AtomicReference f85037d = new AtomicReference();

    /* renamed from: e */
    private final AtomicBoolean f85038e = new AtomicBoolean(false);

    /* renamed from: f */
    private final C58881cr f85039f = C58886cw.m90973a(C31600f.f85064a);

    /* renamed from: g */
    private volatile C146098j f85040g;

    /* renamed from: a */
    public final C60870cx mo37272a(Context context, C31617i iVar) {
        Object obj;
        C60870cx cxVar;
        C62940bt r0 = C62942bv.checkIsLite(C31596b.f85042j);
        iVar.mo58887l(r0);
        C58838bb.m90869d(iVar.f169962ag.mo58857o(r0.f169971d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        C71308ej ejVar = iVar.f85089b;
        if (ejVar == null) {
            ejVar = C71308ej.f190415x;
        }
        C71308ej a = C31592f.m58916a(ejVar);
        if (((Boolean) this.f85039f.mo6453a()).booleanValue()) {
            return C60866ct.f164955a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C31596b.f85042j);
        iVar.mo58887l(r1);
        Object l = iVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C31596b bVar = (C31596b) obj;
        boolean z = bVar.f85051h;
        int i = a.f190416a & 64;
        if (!z || !C69325ad.f185485a.mo6453a().mo61009b(context)) {
            cxVar = C60856cj.m92900i(true);
        } else {
            Boolean bool = (Boolean) this.f85037d.get();
            if (bool != null) {
                cxVar = C60856cj.m92900i(bool);
            } else {
                C146098j jVar = this.f85040g;
                if (jVar == null) {
                    synchronized (this) {
                        jVar = this.f85040g;
                        if (jVar == null && C146104p.m237970a(context)) {
                            jVar = C146104p.m237971b(context);
                            this.f85040g = jVar;
                        }
                    }
                }
                if (jVar == null) {
                    cxVar = C60856cj.m92900i(true);
                } else {
                    if (i == 0 && !this.f85038e.getAndSet(true)) {
                        C143784ce b = C143785cf.m233680b(new C31602h(this), jVar.f389927B, C146105q.class.getSimpleName());
                        C146092d dVar = new C146092d(jVar, b, ((C146103o) jVar.f389934z).f394825a);
                        C146093e eVar = new C146093e(jVar);
                        C143796cq cqVar = new C143796cq();
                        cqVar.f389831a = dVar;
                        cqVar.f389832b = eVar;
                        cqVar.f389833c = b;
                        cqVar.f389834d = new Feature[]{C146091c.f394813a};
                        cqVar.f389836f = 4507;
                        jVar.mo119291v(cqVar.mo119255a());
                    }
                    cxVar = C60846c.m92879h(C60922j.m93044g(C43205e.m76192b(jVar.mo122609a()), new C31603i(this), C60826bg.f164896a), Throwable.class, C31604j.f85071a, C60826bg.f164896a);
                }
            }
        }
        return C60922j.m93045h(cxVar, new C31601g(this, context, a, bVar), C60826bg.f164896a);
    }
}
