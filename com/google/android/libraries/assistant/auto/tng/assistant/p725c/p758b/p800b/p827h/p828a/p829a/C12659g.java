package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p721a.C11967c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12024b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12395b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.g */
/* compiled from: PG */
public final class C12659g extends C68247h {

    /* renamed from: a */
    private final C68283d f39687a;

    /* renamed from: c */
    private final C69464a f39688c;

    /* renamed from: d */
    private final C68283d f39689d;

    /* renamed from: e */
    private final C68283d f39690e;

    /* renamed from: f */
    private final C68283d f39691f;

    /* renamed from: g */
    private final C68283d f39692g;

    /* renamed from: h */
    private final C68283d f39693h;

    public C12659g(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C12659g.class), aVar);
        this.f39687a = C68236af.m98549d(dVar);
        this.f39688c = aVar3;
        this.f39689d = C68236af.m98549d(dVar2);
        this.f39690e = C68236af.m98549d(dVar3);
        this.f39691f = C68236af.m98549d(dVar4);
        this.f39692g = C68236af.m98549d(dVar5);
        this.f39693h = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C69464a aVar = this.f39688c;
        Executor executor = (Executor) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        C58976aa aaVar = C58975e.f156826a;
        C60870cx a = ((C12024b) list.get(0)).mo20366a();
        return C47638k.m84753d(C60856cj.m92903l(C47810es.m84977q(new C12628a(((Boolean) list.get(4)).booleanValue(), a, executor, aVar, (C12395b) list.get(5))), executor), C60856cj.m92903l(C47810es.m84977q(new C12654b(booleanValue, a, executor, (C11967c) list.get(1))), executor)).mo51521b(new C12655c(a), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39687a.mo60297gq(), this.f39689d.mo60297gq(), this.f39690e.mo60297gq(), this.f39691f.mo60297gq(), this.f39692g.mo60297gq(), this.f39693h.mo60297gq());
    }
}
