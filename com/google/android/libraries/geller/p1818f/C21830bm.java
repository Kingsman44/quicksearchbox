package com.google.android.libraries.geller.p1818f;

import android.content.Context;
import com.google.android.libraries.geller.C21756b;
import com.google.android.libraries.geller.C21879h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4651h.p4652a.C61644a;
import com.google.p4651h.p4652a.C61647d;
import com.google.protobuf.p4750c.C62948a;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65810cn;
import com.google.protos.p5129p.p5131b.C65811co;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5520a.C70136d;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5527g.C70835p;

@Deprecated
/* renamed from: com.google.android.libraries.geller.f.bm */
/* compiled from: PG */
public final class C21830bm implements C21879h {

    /* renamed from: a */
    final C21796af f60239a;

    /* renamed from: b */
    private final Context f60240b;

    public C21830bm(Context context, C21370a aVar, Executor executor, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f60240b = context;
        C62948a.m95462m(60, 0);
        this.f60239a = new C21796af(aVar, executor, (String) ((C58847bk) axVar).f156646a, axVar2, axVar3);
    }

    @Deprecated
    /* renamed from: a */
    public final C60870cx mo27138a(C21756b bVar, String str, String str2, String str3, C58833ax axVar) {
        C65753ak a = bVar.mo27091a();
        C65810cn cnVar = (C65810cn) C65811co.f178905g.createBuilder();
        cnVar.copyOnWrite();
        C65811co coVar = (C65811co) cnVar.instance;
        coVar.f178909c = a.f178757bE;
        coVar.f178907a |= 2;
        cnVar.copyOnWrite();
        C65811co coVar2 = (C65811co) cnVar.instance;
        str3.getClass();
        coVar2.f178907a |= 1;
        coVar2.f178908b = str3;
        if (axVar.mo56113h()) {
            C65808cl clVar = (C65808cl) axVar.mo56107c();
            cnVar.copyOnWrite();
            C65811co coVar3 = (C65811co) cnVar.instance;
            clVar.getClass();
            coVar3.f178911e = clVar;
            coVar3.f178907a |= 8;
        }
        C58833ax k = C58833ax.m90834k(bVar);
        C65811co coVar4 = (C65811co) cnVar.build();
        try {
            C21796af afVar = this.f60239a;
            Context context = this.f60240b;
            if (C58837ba.m90859h(str2)) {
                throw new IllegalArgumentException("Missing auth token");
            } else if ((coVar4.f178907a & 2) != 0) {
                C70835p pVar = new C70835p(C70460dv.m102876d(afVar.f60124e, 443));
                pVar.mo62544d(new C21853ci(afVar.f60123d, afVar.f60125f, afVar.f60126g));
                C70286co c = pVar.f188921c.mo57963c();
                C60870cx g = C60922j.m93044g(C60838bs.m92859i(afVar.mo27120a(c, new C70136d(new C61647d(new C61644a(str2, new Date(afVar.f60122c.mo26870b() + C21796af.f60120a))), C70136d.f186958b), coVar4, new ArrayList())), new C21792ab(k, context, str), afVar.f60123d);
                C60870cx b = C60856cj.m92895d(g).mo57335b(C47810es.m84965e(new C21793ac(coVar4, (C60838bs) g)), afVar.f60123d);
                return C60856cj.m92893b(b).mo57335b(C47810es.m84965e(new C21794ad(c, b)), C60826bg.f164896a);
            } else {
                throw new IllegalArgumentException("The request does not have the corpus specified to sync.");
            }
        } catch (IllegalArgumentException e) {
            return C60856cj.m92899h(e);
        }
    }
}
