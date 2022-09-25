package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9128b;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120508e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47628a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.b.g */
/* compiled from: PG */
public final class C120826g extends C68247h {

    /* renamed from: a */
    private final C68283d f335993a;

    /* renamed from: c */
    private final C68283d f335994c;

    /* renamed from: d */
    private final C68283d f335995d;

    public C120826g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C120826g.class), aVar);
        this.f335993a = C68236af.m98549d(dVar);
        this.f335994c = C68236af.m98549d(dVar2);
        this.f335995d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Executor executor = (Executor) list.get(0);
        C58976aa aaVar = C58975e.f156826a;
        C47630c a = ((C120508e) list.get(1)).mo104774a();
        C47630c a2 = C47630c.m84724a(new C120821b((C120825f) list.get(2), executor), executor);
        C47630c[] cVarArr = {a2, a};
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < 2; i++) {
            e.mo55395g(cVarArr[i].f123559a);
        }
        return new C47630c(C60817ay.m92815b(e.mo55394f()).mo57266a(C47810es.m84972l(new C47628a(new C120822c(a2, a))), executor)).mo51506d(C120823d.f335989a, executor).mo51507e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335993a.mo60297gq(), this.f335994c.mo60297gq(), this.f335995d.mo60297gq());
    }
}
