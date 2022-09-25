package com.google.android.apps.search.googleapp.discover.p10238u;

import android.net.Uri;
import com.google.android.apps.search.googleapp.discover.p10181d.C134216e;
import com.google.android.apps.search.googleapp.discover.p10238u.p10241b.C134968b;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61361ac;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.frameworks.client.data.android.C61367ai;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import com.google.net.p4726a.p4727a.C62722b;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ClientRequestHandler$sendRequest$2", mo61344c = "ClientRequestHandler.kt", mo61345d = "invokeSuspend", mo61346e = {106})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.aa */
/* compiled from: PG */
final class C134940aa extends C69572j implements C69630p {

    /* renamed from: a */
    int f367390a;

    /* renamed from: b */
    final /* synthetic */ C134941ab f367391b;

    /* renamed from: c */
    final /* synthetic */ C61365ag f367392c;

    /* renamed from: d */
    final /* synthetic */ C134970bb f367393d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134940aa(C134941ab abVar, C61365ag agVar, C134970bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f367391b = abVar;
        this.f367392c = agVar;
        this.f367393d = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134940aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C62722b bVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367390a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C134970bb bbVar = this.f367393d;
                boolean z = th instanceof C134968b;
                Integer num = null;
                if (z) {
                    bVar = C61367ai.m93875a(th.f367493a);
                } else if (th instanceof C61361ac) {
                    bVar = th.f165929a;
                } else {
                    bVar = th instanceof C61346g ? C62722b.UNAUTHENTICATED : null;
                }
                C134216e eVar = bbVar.f367497a;
                if (bVar != null) {
                    eVar.f365593a.mo111616b(eVar.f365594b, bVar);
                } else {
                    eVar.f365593a.mo111621g(eVar.f365594b);
                }
                if (z) {
                    num = Integer.valueOf(th.f367493a);
                }
                bbVar.f367500d.f367551c.mo112104b(bbVar.f367498b, bbVar.f367499c, bVar, num);
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f367391b.f367396c.mo42484a(this.f367392c);
            C69664n.m101060f(a, "httpClient.makeRequest(httpRequest)");
            this.f367390a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C61366ah ahVar = (C61366ah) obj;
        int i = ahVar.f165947c;
        if (i == 200) {
            return ahVar;
        }
        throw new C134968b(i, Uri.parse(this.f367392c.f165938a));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134940aa(this.f367391b, this.f367392c, this.f367393d, gVar);
    }
}
