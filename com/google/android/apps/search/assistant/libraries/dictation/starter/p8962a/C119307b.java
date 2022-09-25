package com.google.android.apps.search.assistant.libraries.dictation.starter.p8962a;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119267ac;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119269ae;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119291m;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119295q;
import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70876o;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.dictation.starter.impl.DictationDataDownloadTargeter$generate$1", mo61344c = "DataDownloadTargetersImpl.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.a.b */
/* compiled from: PG */
final class C119307b extends C69572j implements C69630p {

    /* renamed from: a */
    int f332689a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f332690b;

    /* renamed from: c */
    final /* synthetic */ C119308c f332691c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119307b(C58833ax axVar, C119308c cVar, C69577g gVar) {
        super(2, gVar);
        this.f332690b = axVar;
        this.f332691c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119307b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f332689a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f332690b.mo56113h()) {
                C58485gu m = C58485gu.m89845m();
                C69664n.m101060f(m, "of()");
                return m;
            }
            C119291m mVar = this.f332691c.f332694c;
            C60870cx a = C70876o.m103760a(mVar.f189039a.mo39510a(C119295q.m197988d(), mVar.f189040b), C119267ac.f332608a);
            this.f332689a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq<String> cqVar = ((C119269ae) obj).f332612a;
        C69664n.m101060f(cqVar, "invocationService\n      …        .languageTagsList");
        C119308c cVar = this.f332691c;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (String str : cqVar) {
            C28798cm cmVar = (C28798cm) C28803cr.f78265n.createBuilder();
            C69664n.m101060f(cmVar, "newBuilder()");
            C69664n.m101061g(cmVar, "builder");
            String str2 = cVar.f332692a;
            cmVar.copyOnWrite();
            C28803cr crVar = (C28803cr) cmVar.instance;
            crVar.f78267a |= 16;
            crVar.f78271e = str2;
            String str3 = cVar.f332693b;
            cmVar.copyOnWrite();
            C28803cr crVar2 = (C28803cr) cmVar.instance;
            crVar2.f78267a |= 8;
            crVar2.f78270d = str3;
            C69664n.m101060f(str, "it");
            C69664n.m101061g(str, "value");
            cmVar.copyOnWrite();
            C28803cr crVar3 = (C28803cr) cmVar.instance;
            str.getClass();
            crVar3.f78267a |= 32;
            crVar3.f78272f = str;
            C62942bv build = cmVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C28803cr) build);
        }
        return C58479go.m89810b(arrayList);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119307b(this.f332690b, this.f332691c, gVar);
    }
}
