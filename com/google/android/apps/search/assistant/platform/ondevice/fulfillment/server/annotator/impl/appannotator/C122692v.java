package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import com.google.android.apps.gsa.nga.engine.annotators.v;
import com.google.android.apps.gsa.nga.engine.annotators.w;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.C122701i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123066n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4242bp.p4257f.C56218b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.v */
/* compiled from: PG */
final class C122692v implements C122671a, C123066n {

    /* renamed from: a */
    final /* synthetic */ AppAnnotatorFactory f339954a;

    /* renamed from: b */
    private volatile Runnable f339955b;

    public C122692v(AppAnnotatorFactory appAnnotatorFactory, C122959k kVar) {
        this.f339954a = appAnnotatorFactory;
        appAnnotatorFactory.f339926d.mo105856b(this);
        kVar.mo105795d(new C122689s(this, kVar));
    }

    /* renamed from: a */
    public final C60870cx mo105721a() {
        this.f339954a.f339926d.mo105857d(this);
        v createBuilder = w.d.createBuilder();
        C56218b bVar = C56218b.f149746a;
        createBuilder.copyOnWrite();
        w wVar = createBuilder.instance;
        bVar.getClass();
        wVar.b = bVar;
        wVar.a |= 1;
        createBuilder.copyOnWrite();
        w wVar2 = createBuilder.instance;
        wVar2.a |= 2;
        wVar2.c = false;
        AppAnnotatorFactory.nativeUpdateAppAnnotator(createBuilder.build().toByteArray());
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final void mo105716b(Runnable runnable) {
        this.f339955b = runnable;
    }

    /* renamed from: c */
    public final void mo105724c() {
        C122686p pVar = new C122686p(this);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(pVar), this.f339954a.f339928f);
        C122687q qVar = new C122687q(this);
        C123047cn.m202382b(C60922j.m93045h(l, C47810es.m84966f(qVar), C60826bg.f164896a), C122688r.f339949a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo105725d() {
        Runnable runnable = this.f339955b;
        if (runnable != null) {
            ((C122701i) runnable).f339974a.mo105694d();
        }
    }
}
