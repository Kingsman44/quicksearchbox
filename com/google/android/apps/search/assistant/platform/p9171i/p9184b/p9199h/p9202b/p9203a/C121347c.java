package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9202b.p9203a;

import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121284d;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f.C121338d;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9198g.C121339a;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.b.a.c */
/* compiled from: PG */
public final class C121347c extends C68247h {

    /* renamed from: a */
    private final C68283d f336960a;

    /* renamed from: c */
    private final C68283d f336961c;

    /* renamed from: d */
    private final C68283d f336962d;

    /* renamed from: e */
    private final C68283d f336963e;

    public C121347c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C121347c.class), aVar);
        this.f336960a = C68236af.m98549d(dVar);
        this.f336961c = C68236af.m98549d(dVar2);
        this.f336962d = C68236af.m98549d(dVar3);
        this.f336963e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Executor executor = (Executor) list.get(2);
        C121338d dVar = (C121338d) list.get(3);
        String trim = ((C121481e) list.get(0)).mo105172d().f53694b.toLowerCase(Locale.getDefault()).trim();
        Optional b = ((C121284d) list.get(1)).mo105109b();
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) C121346b.f336959a.mo56226d()).mo56372aa(35790)).mo56386p("#producesMatchedAppShortcuts - latest component is NOT present.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return C60922j.m93044g(C60856cj.m92907p(((C121339a) b.get()).mo105115d(), ((C121339a) b.get()).mo105114c()), C47810es.m84963c(new C121345a(dVar, trim)), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f336960a.mo60297gq(), this.f336961c.mo60297gq(), this.f336962d.mo60297gq(), this.f336963e.mo60297gq());
    }
}
