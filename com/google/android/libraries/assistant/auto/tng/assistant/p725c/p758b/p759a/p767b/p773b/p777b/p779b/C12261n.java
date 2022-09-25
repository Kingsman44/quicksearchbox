package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p778a.C12235f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.n */
/* compiled from: PG */
public final class C12261n extends C68247h {

    /* renamed from: a */
    private final C68283d f39022a;

    /* renamed from: c */
    private final C68283d f39023c;

    /* renamed from: d */
    private final C68283d f39024d;

    /* renamed from: e */
    private final C68283d f39025e;

    /* renamed from: f */
    private final C68283d f39026f;

    public C12261n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C12261n.class), aVar);
        this.f39022a = C68236af.m98549d(dVar);
        this.f39023c = C68236af.m98549d(dVar2);
        this.f39024d = C68236af.m98549d(dVar3);
        this.f39025e = C68236af.m98549d(dVar4);
        this.f39026f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39022a;
        C68283d dVar2 = this.f39023c;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        C12235f fVar = (C12235f) list.get(2);
        if (booleanValue) {
            C46459k.m82829b(fVar.mo20519b(), "failed #setFulfillmentModeToPortmon", new Object[0]);
            return dVar.mo60297gq();
        }
        if (booleanValue2) {
            C46459k.m82829b(fVar.mo20518a(), "failed #setFulfillmentModeToNative", new Object[0]);
        }
        return dVar2.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39024d.mo60297gq(), this.f39025e.mo60297gq(), this.f39026f.mo60297gq());
    }
}
