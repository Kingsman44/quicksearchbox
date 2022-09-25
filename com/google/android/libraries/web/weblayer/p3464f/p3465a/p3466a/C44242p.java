package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import android.net.Uri;
import kotlinx.coroutines.C71423ax;
import org.chromium.weblayer.C72627p;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.cookies.internal.WLCookieManager$setCookiesInternal$2", mo61344c = "WLCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {246})
/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.p */
/* compiled from: PG */
final class C44242p extends C69572j implements C69630p {

    /* renamed from: a */
    int f115061a;

    /* renamed from: b */
    /* synthetic */ Object f115062b;

    /* renamed from: c */
    final /* synthetic */ String f115063c;

    /* renamed from: d */
    final /* synthetic */ Iterable f115064d;

    /* renamed from: e */
    final /* synthetic */ C44247u f115065e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44242p(String str, Iterable iterable, C44247u uVar, C69577g gVar) {
        super(2, gVar);
        this.f115063c = str;
        this.f115064d = iterable;
        this.f115065e = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44242p) mo5194c((C72627p) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115061a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Uri parse = Uri.parse(this.f115063c);
            C44241o oVar = new C44241o(this.f115064d, this.f115065e, (C72627p) this.f115062b, parse, (C69577g) null);
            this.f115061a = 1;
            if (C71423ax.m104196a(oVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44242p pVar = new C44242p(this.f115063c, this.f115064d, this.f115065e, gVar);
        pVar.f115062b = obj;
        return pVar;
    }
}
