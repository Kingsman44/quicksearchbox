package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$faultObserver$1$storeDidFault$1$1", mo61344c = "PersistentByteStoreInstaller.kt", mo61345d = "invokeSuspend", mo61346e = {157})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.l */
/* compiled from: PG */
final class C40426l extends C69572j implements C69630p {

    /* renamed from: a */
    int f106112a;

    /* renamed from: b */
    final /* synthetic */ C40432r f106113b;

    /* renamed from: c */
    final /* synthetic */ String f106114c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40426l(C40432r rVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f106113b = rVar;
        this.f106114c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40426l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f106112a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C40432r rVar = this.f106113b;
            String str = this.f106114c;
            this.f106112a = 1;
            if (rVar.mo42432a(str, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40426l(this.f106113b, this.f106114c, gVar);
    }
}
