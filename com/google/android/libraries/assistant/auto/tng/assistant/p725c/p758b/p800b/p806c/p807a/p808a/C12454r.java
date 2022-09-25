package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a.p808a;

import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import com.google.p4449cd.p4456g.p4458b.C57986e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.a.r */
/* compiled from: PG */
public final class C12454r extends C68247h {

    /* renamed from: a */
    private final C68283d f39332a;

    /* renamed from: c */
    private final C68283d f39333c;

    /* renamed from: d */
    private final C68283d f39334d;

    public C12454r(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12454r.class), aVar);
        this.f39332a = C68236af.m98549d(dVar);
        this.f39333c = C68236af.m98549d(dVar2);
        this.f39334d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39333c;
        C58976aa aaVar = C58975e.f156826a;
        C58485gu o = C58485gu.m89847o((C57981b) list.get(0), C13314n.m29569a(dVar.mo60297gq(), (Executor) list.get(1)));
        C57978d dVar2 = new C57978d();
        C46459k.m82829b(new C57986e(o).mo20440jJ(dVar2), "Failed to stream combined sources", new Object[0]);
        return C60856cj.m92900i(dVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39332a.mo60297gq(), this.f39334d.mo60297gq());
    }
}
