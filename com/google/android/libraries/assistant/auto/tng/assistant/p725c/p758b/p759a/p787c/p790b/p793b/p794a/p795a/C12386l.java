package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.libraries.assistant.auto.tng.common.p931p.C13308h;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13309i;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.l */
/* compiled from: PG */
public final class C12386l extends C68247h {

    /* renamed from: a */
    private final C68283d f39223a;

    /* renamed from: c */
    private final C68283d f39224c;

    /* renamed from: d */
    private final C68283d f39225d;

    public C12386l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12386l.class), aVar);
        this.f39223a = C68236af.m98549d(dVar);
        this.f39224c = C68236af.m98549d(dVar2);
        this.f39225d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58485gu o = C58485gu.m89847o((C57981b) list.get(0), (C57981b) list.get(1));
        o.getClass();
        Executor executor = (Executor) ((C13309i) list.get(2)).f41029a.mo17428b();
        executor.getClass();
        return C60856cj.m92900i(new C13308h(o, executor));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39223a.mo60297gq(), this.f39224c.mo60297gq(), this.f39225d.mo60297gq());
    }
}
