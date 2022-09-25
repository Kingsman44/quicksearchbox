package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71760h;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.ApaS3ConnectionImpl$buildInitialRequest$2", mo61344c = "ApaS3ConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {94})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.e */
/* compiled from: PG */
final class C17240e extends C69572j implements C69630p {

    /* renamed from: a */
    int f49995a;

    /* renamed from: b */
    final /* synthetic */ C17249n f49996b;

    /* renamed from: c */
    private /* synthetic */ Object f49997c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17240e(C17249n nVar, C69577g gVar) {
        super(2, gVar);
        this.f49996b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17240e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C66606cd cdVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f49995a != 0) {
            cdVar = (C66606cd) this.f49997c;
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                C59052c cVar = (C59052c) ((C59052c) C17249n.f50012a.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(42645));
                cVar.mo56386p("Request was cancelled!");
                throw e;
            } catch (Throwable th) {
                C59052c cVar2 = (C59052c) ((C59052c) C17249n.f50012a.mo56226d()).mo56382g(th);
                cVar2.mo56379ah(new C59094n(42646));
                cVar2.mo56386p("Failed to compute initial request");
                C17249n.m34427b(new C17237b(this.f49996b, th));
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f49997c;
            List<C17266e> list = this.f49996b.f50013b;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
            for (C17266e a : list) {
                C60870cx a2 = a.mo23245a();
                C69664n.m101060f(a2, "it.createInitialRequestMutator()");
                C71604be c = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C17238c(a2, (C69577g) null), 3);
                c.mo62873s(new C17239d(a2));
                arrayList.add(c);
            }
            C66606cd cdVar2 = (C66606cd) C66607ce.f181191f.createBuilder();
            C69664n.m101060f(cdVar2, "newBuilder()");
            this.f49997c = cdVar2;
            this.f49995a = 1;
            Object a3 = C71760h.m104949a(arrayList, this);
            if (a3 == aVar) {
                return aVar;
            }
            cdVar = cdVar2;
            obj = a3;
        }
        for (C17235c a4 : (List) obj) {
            a4.mo23244a(cdVar);
        }
        C62942bv build = cdVar.build();
        C69664n.m101060f(build, "s3RequestBuilder.build()");
        C66607ce ceVar = (C66607ce) build;
        C59081b.m91349a(C58979ad.SMALL, "stack size");
        C17249n.m34427b(new C17236a(this.f49996b));
        return ceVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17240e eVar = new C17240e(this.f49996b, gVar);
        eVar.f49997c = obj;
        return eVar;
    }
}
