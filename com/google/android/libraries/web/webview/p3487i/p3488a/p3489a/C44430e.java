package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71760h;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.cookies.internal.CookieManagerImpl$setCookies$2$1", mo61344c = "CookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.libraries.web.webview.i.a.a.e */
/* compiled from: PG */
final class C44430e extends C69572j implements C69630p {

    /* renamed from: a */
    int f115493a;

    /* renamed from: b */
    final /* synthetic */ Iterable f115494b;

    /* renamed from: c */
    final /* synthetic */ C44434i f115495c;

    /* renamed from: d */
    final /* synthetic */ String f115496d;

    /* renamed from: e */
    private /* synthetic */ Object f115497e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44430e(Iterable iterable, C44434i iVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f115494b = iterable;
        this.f115495c = iVar;
        this.f115496d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44430e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115493a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f115497e;
            Iterable<String> iterable = this.f115494b;
            C44434i iVar = this.f115495c;
            String str = this.f115496d;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
            for (String dVar : iterable) {
                arrayList.add(C71803m.m105041b(awVar, iVar.f115507a, C71424ay.UNDISPATCHED, new C44429d(iVar, str, dVar, (C69577g) null)));
            }
            this.f115493a = 1;
            if (C71760h.m104950b(arrayList, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44430e eVar = new C44430e(this.f115494b, this.f115495c, this.f115496d, gVar);
        eVar.f115497e = obj;
        return eVar;
    }
}
