package com.google.android.libraries.web.webview.p3487i.p3490b;

import com.google.android.libraries.web.profile.C44069d;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.internal.ProfileManagerImpl$clearBrowsingData$2", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.web.webview.i.b.d */
/* compiled from: PG */
final class C44438d extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ Set f115514a;

    /* renamed from: b */
    final /* synthetic */ C44447m f115515b;

    /* renamed from: c */
    private /* synthetic */ Object f115516c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44438d(Set set, C44447m mVar, C69577g gVar) {
        super(2, gVar);
        this.f115514a = set;
        this.f115515b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44438d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f115516c;
        if (this.f115514a.contains(C44069d.COOKIES_AND_SITE_DATA)) {
            C44447m mVar = this.f115515b;
            C71803m.m105043d(awVar, mVar.f115535c, (C71424ay) null, new C44436b(mVar, (C69577g) null), 2);
        }
        if (this.f115514a.contains(C44069d.CACHE)) {
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C44437c(this.f115515b, (C69577g) null), 3);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44438d dVar = new C44438d(this.f115514a, this.f115515b, gVar);
        dVar.f115516c = obj;
        return dVar;
    }
}
