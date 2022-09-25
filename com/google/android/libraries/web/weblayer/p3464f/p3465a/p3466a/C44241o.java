package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71760h;
import kotlinx.coroutines.C71803m;
import org.chromium.weblayer.C72627p;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.cookies.internal.WLCookieManager$setCookiesInternal$2$1", mo61344c = "WLCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {253})
/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.o */
/* compiled from: PG */
final class C44241o extends C69572j implements C69630p {

    /* renamed from: a */
    int f115055a;

    /* renamed from: b */
    final /* synthetic */ Iterable f115056b;

    /* renamed from: c */
    final /* synthetic */ C44247u f115057c;

    /* renamed from: d */
    final /* synthetic */ C72627p f115058d;

    /* renamed from: e */
    final /* synthetic */ Uri f115059e;

    /* renamed from: f */
    private /* synthetic */ Object f115060f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44241o(Iterable iterable, C44247u uVar, C72627p pVar, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f115056b = iterable;
        this.f115057c = uVar;
        this.f115058d = pVar;
        this.f115059e = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44241o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115055a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f115060f;
            Iterable iterable = this.f115056b;
            C44247u uVar = this.f115057c;
            C72627p pVar = this.f115058d;
            Uri uri = this.f115059e;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C69585o oVar = uVar.f115079b;
                C71424ay ayVar = C71424ay.UNDISPATCHED;
                Iterator it2 = it;
                C44240n nVar = r4;
                C44240n nVar2 = new C44240n(uVar, pVar, uri, (String) it.next(), (C69577g) null);
                arrayList.add(C71803m.m105041b(awVar, oVar, ayVar, nVar));
                it = it2;
            }
            this.f115055a = 1;
            if (C71760h.m104950b(arrayList, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44241o oVar = new C44241o(this.f115056b, this.f115057c, this.f115058d, this.f115059e, gVar);
        oVar.f115060f = obj;
        return oVar;
    }
}
