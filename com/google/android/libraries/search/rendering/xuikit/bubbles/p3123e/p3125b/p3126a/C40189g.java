package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a;

import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.apps.tiktok.dataservice.C46688af;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.bubbles.ui.container.dataservice.XBubbleDataService$getDataSource$2", mo61344c = "XBubbleDataService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.g */
/* compiled from: PG */
public final class C40189g extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C40190h f105583a;

    /* renamed from: b */
    final /* synthetic */ C40111d f105584b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40189g(C40190h hVar, C40111d dVar, C69577g gVar) {
        super(1, gVar);
        this.f105583a = hVar;
        this.f105584b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C40189g(this.f105583a, this.f105584b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Optional a = this.f105583a.f105587c.mo42302a(this.f105584b);
        if (!a.isPresent()) {
            return C46688af.f121976a;
        }
        return C46688af.m83205b(a.get(), this.f105583a.f105586b.mo26870b());
    }
}
