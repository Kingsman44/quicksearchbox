package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10212r.C134530a;
import com.google.android.apps.search.googleapp.discover.p10212r.C134534b;
import com.google.android.apps.search.googleapp.discover.p10214s.C134544ai;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10214s.C134599q;
import com.google.android.apps.search.googleapp.discover.p10249z.C135319az;
import java.util.ArrayList;
import java.util.Collection;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$toRenderableStreamCacheResult$2$1", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {325})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.az */
/* compiled from: PG */
final class C135238az extends C69572j implements C69630p {

    /* renamed from: a */
    int f368387a;

    /* renamed from: b */
    final /* synthetic */ C135241bb f368388b;

    /* renamed from: c */
    final /* synthetic */ C135319az f368389c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135238az(C135241bb bbVar, C135319az azVar, C69577g gVar) {
        super(2, gVar);
        this.f368388b = bbVar;
        this.f368389c = azVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135238az) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C134544ai aiVar;
        C134544ai aiVar2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368387a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135241bb bbVar = this.f368388b;
            C135319az azVar = this.f368389c;
            this.f368387a = 1;
            Collection values = azVar.f368671b.values();
            ArrayList<C134560ay> arrayList = new ArrayList<>();
            for (Object next : values) {
                C134560ay ayVar = (C134560ay) next;
                if (ayVar.f366456b == 3) {
                    aiVar2 = (C134544ai) ayVar.f366457c;
                } else {
                    aiVar2 = C134544ai.f366393i;
                }
                if ((aiVar2.f366395a & 32) != 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
            for (C134560ay ayVar2 : arrayList) {
                if (ayVar2.f366456b == 3) {
                    aiVar = (C134544ai) ayVar2.f366457c;
                } else {
                    aiVar = C134544ai.f366393i;
                }
                C134599q qVar = aiVar.f366402h;
                if (qVar == null) {
                    qVar = C134599q.f366550b;
                }
                arrayList2.add(qVar);
            }
            C134534b bVar = bbVar.f368408k;
            Object a = C71803m.m105040a(bVar.f366369b, new C134530a(bVar, arrayList2, (C69577g) null), this);
            C69554a aVar2 = C69554a.COROUTINE_SUSPENDED;
            if (a != aVar2) {
                a = C69788q.f186170a;
            }
            if (a != aVar2) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135238az(this.f368388b, this.f368389c, gVar);
    }
}
