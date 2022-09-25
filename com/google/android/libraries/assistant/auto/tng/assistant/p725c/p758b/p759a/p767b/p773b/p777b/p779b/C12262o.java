package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p774a.p775a.C12226a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.o */
/* compiled from: PG */
public final class C12262o extends C68247h {

    /* renamed from: a */
    private final C68283d f39027a;

    /* renamed from: c */
    private final C69464a f39028c;

    /* renamed from: d */
    private final C68283d f39029d;

    /* renamed from: e */
    private final C68283d f39030e;

    public C12262o(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12262o.class), aVar);
        this.f39027a = C68236af.m98549d(dVar);
        this.f39028c = aVar3;
        this.f39029d = C68236af.m98549d(dVar2);
        this.f39030e = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39027a;
        C69464a aVar = this.f39028c;
        Context context = (Context) list.get(0);
        Executor executor = (Executor) list.get(1);
        if (!((Boolean) aVar.mo17428b()).booleanValue()) {
            return dVar.mo60297gq();
        }
        return C47633f.m84733g(dVar.mo60297gq()).mo51515h(new C12256i(context), executor).mo51513e(C12226a.class, new C12257j(context), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39029d.mo60297gq(), this.f39030e.mo60297gq());
    }
}
