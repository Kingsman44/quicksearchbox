package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.speech.p7270c.C92221d;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92450g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import com.google.speech.p5224k.p5225a.C67244v;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.aj */
/* compiled from: PG */
public final class C103533aj extends C68247h {

    /* renamed from: a */
    private final C68283d f288454a;

    /* renamed from: c */
    private final C68283d f288455c;

    /* renamed from: d */
    private final C68283d f288456d;

    /* renamed from: e */
    private final C68283d f288457e;

    /* renamed from: f */
    private final C68283d f288458f;

    /* renamed from: g */
    private final C68283d f288459g;

    /* renamed from: h */
    private final C68283d f288460h;

    public C103533aj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C103533aj.class), aVar);
        this.f288454a = C68236af.m98549d(dVar);
        this.f288455c = C68236af.m98549d(dVar2);
        this.f288456d = C68236af.m98549d(dVar3);
        this.f288457e = C68236af.m98549d(dVar4);
        this.f288458f = C68236af.m98549d(dVar5);
        this.f288459g = C68236af.m98549d(dVar6);
        this.f288460h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C92221d dVar = (C92221d) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C90021c cVar = (C90021c) list.get(2);
        C58009ae aeVar = (C58009ae) list.get(3);
        C22871g gVar = (C22871g) list.get(4);
        C58833ax axVar2 = (C58833ax) list.get(5);
        C58833ax axVar3 = (C58833ax) list.get(6);
        if (!axVar.mo56113h() || !axVar2.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C90918bo.m148514a(C90877ak.m148471e(aeVar.mo54597a(new C103527ad(new C92450g((C67244v) axVar.mo56107c(), dVar, (String) axVar2.mo56107c(), (List) axVar3.mo56109e(C58485gu.m89845m()), cVar))), cVar.mo79743a(C90114fl.f250731e), TimeUnit.MILLISECONDS, gVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288454a.mo60297gq(), this.f288455c.mo60297gq(), this.f288456d.mo60297gq(), this.f288457e.mo60297gq(), this.f288458f.mo60297gq(), this.f288459g.mo60297gq(), this.f288460h.mo60297gq());
    }
}
