package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9200a.p9201a;

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

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.a.a.c */
/* compiled from: PG */
public final class C121343c extends C68247h {

    /* renamed from: a */
    private final C68283d f336951a;

    /* renamed from: c */
    private final C68283d f336952c;

    /* renamed from: d */
    private final C68283d f336953d;

    /* renamed from: e */
    private final C68283d f336954e;

    public C121343c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C121343c.class), aVar);
        this.f336951a = C68236af.m98549d(dVar);
        this.f336952c = C68236af.m98549d(dVar2);
        this.f336953d = C68236af.m98549d(dVar3);
        this.f336954e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Executor executor = (Executor) list.get(2);
        C121338d dVar = (C121338d) list.get(3);
        String trim = ((C121481e) list.get(0)).mo105172d().f53694b.toLowerCase(Locale.getDefault()).trim();
        Optional b = ((C121284d) list.get(1)).mo105109b();
        if (!b.isEmpty()) {
            return C60922j.m93044g(((C121339a) b.get()).mo105113b(), C47810es.m84963c(new C121341a(dVar, trim)), executor);
        }
        ((C59052c) ((C59052c) C121342b.f336950a.mo56226d()).mo56372aa(35786)).mo56386p("#producesMatchedAppShortcuts - latest component is NOT present.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f336951a.mo60297gq(), this.f336952c.mo60297gq(), this.f336953d.mo60297gq(), this.f336954e.mo60297gq());
    }
}
