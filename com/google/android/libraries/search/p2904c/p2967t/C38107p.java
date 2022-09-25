package com.google.android.libraries.search.p2904c.p2967t;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2942m.C37893g;
import com.google.android.libraries.search.p2904c.p2942m.C37896j;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.C37889a;
import com.google.android.libraries.search.p2904c.p2962q.p2963a.C37954h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.t.p */
/* compiled from: PG */
public final class C38107p {

    /* renamed from: b */
    private static final C59071e f100971b = C59071e.m91332i("com.google.android.libraries.search.c.t.p");

    /* renamed from: a */
    public final C37954h f100972a;

    /* renamed from: c */
    private final C37889a f100973c;

    /* renamed from: d */
    private final C60836bq f100974d;

    /* renamed from: e */
    private final Executor f100975e;

    /* renamed from: f */
    private C37896j f100976f;

    public C38107p(C37889a aVar, C60836bq bqVar, Executor executor, C37954h hVar) {
        this.f100973c = aVar;
        this.f100974d = bqVar;
        this.f100975e = executor;
        this.f100972a = hVar;
    }

    /* renamed from: e */
    private final synchronized void m67268e() {
        if (this.f100976f != null) {
            C46459k.m82829b(this.f100974d.mo57304a(C47810es.m84978r(new C38105n(this)), this.f100975e), "Failed to report mic update in resetAudioAdapter.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized C37896j mo41266a(C60870cx cxVar, C37363a aVar) {
        C37893g gVar;
        ((C59052c) ((C59052c) f100971b.mo56224b()).mo56372aa(52888)).mo56386p("#audio# notifyStartListening");
        int a = this.f100973c.mo41132a();
        C46459k.m82829b(this.f100974d.mo57304a(C47810es.m84978r(new C38104m(this)), this.f100975e), "Failed to report mic update in notifyStartListening.", new Object[0]);
        gVar = new C37893g(cxVar, aVar, a);
        this.f100976f = gVar;
        return gVar;
    }

    /* renamed from: b */
    public final synchronized C58833ax mo41267b() {
        C37896j jVar;
        jVar = this.f100976f;
        return jVar == null ? C58836b.f156633a : C58833ax.m90834k(((C37893g) jVar).f100475a);
    }

    /* renamed from: c */
    public final synchronized void mo41268c() {
        ((C59052c) ((C59052c) f100971b.mo56224b()).mo56372aa(52890)).mo56386p("#audio# notifyStopListening");
        m67268e();
        this.f100976f = null;
    }

    /* renamed from: d */
    public final synchronized void mo41269d() {
        if (this.f100976f != null) {
            ((C59052c) ((C59052c) f100971b.mo56224b()).mo56372aa(52889)).mo56386p("#audio# stopListening on external client audio adapter");
            C37896j jVar = this.f100976f;
            jVar.getClass();
            C60870cx b = this.f100974d.mo57305b(C47810es.m84965e(new C38106o(((C37893g) jVar).f100475a)), this.f100975e);
            m67268e();
            this.f100976f = null;
            C58833ax.m90834k(b);
        }
    }
}
