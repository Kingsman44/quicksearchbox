package com.google.android.apps.gsa.p8889z.p8893c.p8897d;

import com.google.android.apps.gsa.speech.p7272e.p7275c.C92263a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4453d.C57960f;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.c.d.j */
/* compiled from: PG */
public final class C118886j extends C68247h {

    /* renamed from: a */
    private final C68283d f331577a;

    /* renamed from: c */
    private final C68283d f331578c;

    /* renamed from: d */
    private final C68283d f331579d;

    /* renamed from: e */
    private final C68283d f331580e;

    /* renamed from: f */
    private final C68283d f331581f;

    public C118886j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C118886j.class), aVar);
        this.f331577a = C68236af.m98549d(dVar);
        this.f331578c = C68236af.m98549d(dVar2);
        this.f331579d = C68236af.m98549d(dVar3);
        this.f331580e = C68236af.m98549d(dVar4);
        this.f331581f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118889m mVar = (C118889m) list.get(1);
        Executor executor = (Executor) list.get(3);
        C68283d dVar = this.f331581f;
        Objects.requireNonNull(mVar);
        ((C57960f) list.get(2)).mo54567b(new C118878b(mVar));
        C57987f fVar = mVar.f331584a;
        fVar.f155055e.mo20440jJ(new C118881e(executor, (C92263a) list.get(0)));
        dVar.mo60297gq();
        return C60856cj.m92900i(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331577a.mo60297gq(), this.f331578c.mo60297gq(), this.f331579d.mo60297gq(), this.f331580e.mo60297gq());
    }
}
