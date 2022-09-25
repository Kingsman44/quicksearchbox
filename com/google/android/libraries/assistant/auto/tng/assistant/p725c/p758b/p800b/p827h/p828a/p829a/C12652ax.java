package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.C12094a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.p789a.C12321e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.ax */
/* compiled from: PG */
public final class C12652ax extends C68247h {

    /* renamed from: a */
    private final C68283d f39666a;

    /* renamed from: c */
    private final C68283d f39667c;

    /* renamed from: d */
    private final C68283d f39668d;

    /* renamed from: e */
    private final C68283d f39669e;

    /* renamed from: f */
    private final C68283d f39670f;

    /* renamed from: g */
    private final C68283d f39671g;

    /* renamed from: h */
    private final C68283d f39672h;

    /* renamed from: i */
    private final C68283d f39673i;

    public C12652ax(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8) {
        super(aVar2, new C68277d(C12652ax.class), aVar);
        this.f39666a = C68236af.m98549d(dVar);
        this.f39667c = C68236af.m98549d(dVar2);
        this.f39668d = C68236af.m98549d(dVar3);
        this.f39669e = C68236af.m98549d(dVar4);
        this.f39670f = C68236af.m98549d(dVar5);
        this.f39671g = C68236af.m98549d(dVar6);
        this.f39672h = C68236af.m98549d(dVar7);
        this.f39673i = C68236af.m98549d(dVar8);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C12094a aVar = (C12094a) list.get(1);
        C12692e eVar = (C12692e) list.get(2);
        C12321e eVar2 = (C12321e) list.get(3);
        Executor executor = (Executor) list.get(4);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) list.get(5);
        boolean booleanValue = ((Boolean) list.get(6)).booleanValue();
        long longValue = ((Long) list.get(7)).longValue();
        if (!booleanValue) {
            obj2 = C58836b.f156633a;
        } else {
            C12638aj ajVar = new C12638aj(eVar2, executor, aVar, eVar);
            obj2 = C58833ax.m90834k(C60856cj.m92902k(C47810es.m84965e(ajVar), longValue, TimeUnit.MILLISECONDS, scheduledExecutorService));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f39666a.mo60297gq()), this.f39667c.mo60297gq(), this.f39668d.mo60297gq(), this.f39669e.mo60297gq(), this.f39670f.mo60297gq(), this.f39671g.mo60297gq(), this.f39672h.mo60297gq(), this.f39673i.mo60297gq());
    }
}
