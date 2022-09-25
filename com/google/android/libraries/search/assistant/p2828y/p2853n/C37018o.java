package com.google.android.libraries.search.assistant.p2828y.p2853n;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.mediaparams.MediaStickyAppHelper$fetchMediaStickyApp$1$accountInfoDeferred$1", mo61344c = "MediaStickyAppHelper.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.libraries.search.assistant.y.n.o */
/* compiled from: PG */
final class C37018o extends C69572j implements C69630p {

    /* renamed from: a */
    int f96411a;

    /* renamed from: b */
    final /* synthetic */ C37021r f96412b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37018o(C37021r rVar, C69577g gVar) {
        super(2, gVar);
        this.f96412b = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37018o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96411a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C37021r rVar = this.f96412b;
            C60870cx c = rVar.f96423b.mo50246c((AccountId) rVar.f96422a.mo17428b());
            C69664n.m101060f(c, "accountDataService.getAc…(accountIdProvider.get())");
            this.f96411a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C37018o(this.f96412b, gVar);
    }
}
