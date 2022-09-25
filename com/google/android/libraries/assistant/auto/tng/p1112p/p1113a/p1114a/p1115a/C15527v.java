package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.C15505a;
import com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.C15532b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66607ce;
import java.util.ArrayDeque;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.v */
/* compiled from: PG */
public final class C15527v implements C15532b {

    /* renamed from: a */
    public static final C59071e f46501a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.p.a.a.a.v");

    /* renamed from: b */
    public final C60887da f46502b;

    /* renamed from: c */
    public final C69464a f46503c;

    /* renamed from: d */
    public final C15481g f46504d;

    public C15527v(C60887da daVar, C69464a aVar, C15481g gVar) {
        this.f46502b = daVar;
        this.f46503c = aVar;
        this.f46504d = gVar;
    }

    /* renamed from: b */
    public static void m32268b(C70868g gVar, ArrayDeque arrayDeque) {
        if (!((C70869h) gVar).f189042b.mo62058i() && !arrayDeque.isEmpty()) {
            C59104x d = f46501a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3ConnectionImpl");
            ((C59052c) ((C59052c) d).mo56372aa(46141)).mo56386p("Enqueuing request before stream is ready");
        }
        while (!arrayDeque.isEmpty()) {
            gVar.mo20123c((C66607ce) arrayDeque.removeFirst());
        }
    }

    /* renamed from: a */
    public final C15505a mo22392a(C57981b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        C15507b bVar2 = new C15507b(this, bVar);
        return new C15513h(this, C60856cj.m92904m(C47810es.m84978r(bVar2), this.f46502b));
    }
}
