package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8536ap;
import com.google.p395al.p417d.p418a.C8537aq;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57248bc;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57249bd;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57250be;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57264bs;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57266bu;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57267bv;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57293cu;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57294cv;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57296cx;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57298cz;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57300da;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestBuilder$buildDebugRequest$2", mo61344c = "RequestBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {212})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ds */
/* compiled from: PG */
final class C135045ds extends C69572j implements C69630p {

    /* renamed from: a */
    Object f367740a;

    /* renamed from: b */
    int f367741b;

    /* renamed from: c */
    final /* synthetic */ C57303dd f367742c;

    /* renamed from: d */
    final /* synthetic */ C135049dw f367743d;

    /* renamed from: e */
    final /* synthetic */ C58485gu f367744e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135045ds(C57303dd ddVar, C135049dw dwVar, C58485gu guVar, C69577g gVar) {
        super(2, gVar);
        this.f367742c = ddVar;
        this.f367743d = dwVar;
        this.f367744e = guVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135045ds) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C8537aq aqVar;
        Object obj3;
        Object obj4;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367741b != 0) {
            obj3 = this.f367740a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C57303dd ddVar = this.f367742c;
            C62940bt r1 = C62942bv.checkIsLite(C57267bv.f152871k);
            ddVar.mo58887l(r1);
            Object l = ddVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj4 = r1.f169969b;
            } else {
                obj4 = r1.mo58889c(l);
            }
            C69664n.m101060f(obj4, "request.getExtension(FeedRequest.feedRequest)");
            C57267bv bvVar = (C57267bv) obj4;
            C58485gu guVar = this.f367744e;
            C62934bn builder = bvVar.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C57264bs a = C69664n.m101061g((C57266bu) builder, "builder");
            List unmodifiableList = Collections.unmodifiableList(((C57267bv) a.f152868a.instance).f152878g);
            C69664n.m101060f(unmodifiableList, "_builder.getFeedIdsToPreserveList()");
            new C62883b(unmodifiableList);
            C69664n.m101061g(guVar, "values");
            C57266bu buVar = a.f152868a;
            buVar.copyOnWrite();
            C57267bv bvVar2 = (C57267bv) buVar.instance;
            C62971cq cqVar = bvVar2.f152878g;
            if (!cqVar.mo58948c()) {
                bvVar2.f152878g = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) guVar, (List) bvVar2.f152878g);
            C57250be beVar = bvVar.f152879h;
            if (beVar == null) {
                beVar = C57250be.f152826d;
            }
            C69664n.m101060f(beVar, "feedRequest.feedDebugParams");
            C62934bn builder2 = beVar.toBuilder();
            C69664n.m101060f(builder2, "this.toBuilder()");
            C57248bc a2 = C69664n.m101061g((C57249bd) builder2, "builder");
            C57249bd bdVar = a2.f152825a;
            bdVar.copyOnWrite();
            C57250be beVar2 = (C57250be) bdVar.instance;
            beVar2.f152828a |= 4;
            beVar2.f152829b = true;
            a.mo54460b(a2.mo54455a());
            obj2 = a.mo54459a();
            C57294cv cvVar = this.f367742c.f152961c;
            if (cvVar == null) {
                cvVar = C57294cv.f152940d;
            }
            if ((cvVar.f152942a & 8) != 0) {
                C57294cv cvVar2 = this.f367742c.f152961c;
                if (cvVar2 == null) {
                    cvVar2 = C57294cv.f152940d;
                }
                aqVar = cvVar2.f152944c;
                if (aqVar == null) {
                    aqVar = C8537aq.f29619c;
                }
                C69664n.m101060f(aqVar, "if (request.requestConte…serAgent).build()\n      }");
                C62934bn builder3 = this.f367742c.toBuilder();
                C69664n.m101060f(builder3, "this.toBuilder()");
                C57298cz a3 = C69664n.m101061g((C57300da) builder3, "builder");
                C62934bn builder4 = a3.mo54464a().toBuilder();
                C69664n.m101060f(builder4, "this.toBuilder()");
                C57296cx a4 = C69664n.m101061g((C57293cu) builder4, "builder");
                a4.mo54463b(aqVar);
                a3.mo54467d(a4.mo54462a());
                C62940bt btVar = C57267bv.f152871k;
                C69664n.m101060f(btVar, "feedRequest");
                a3.mo54466c(btVar, obj2);
                return a3.mo54465b();
            }
            C60870cx a5 = this.f367743d.f367763d.mo111320a();
            C69664n.m101060f(a5, "userAgentHelper.userAgent");
            this.f367740a = obj2;
            this.f367741b = 1;
            Object c = C71663i.m104690c(a5, this);
            if (c == aVar) {
                return aVar;
            }
            obj3 = obj2;
            obj = c;
        }
        String str = (String) obj;
        C8536ap apVar = (C8536ap) C8537aq.f29619c.createBuilder();
        apVar.copyOnWrite();
        C8537aq aqVar2 = (C8537aq) apVar.instance;
        str.getClass();
        aqVar2.f29621a = 1 | aqVar2.f29621a;
        aqVar2.f29622b = str;
        Object obj5 = obj3;
        aqVar = (C8537aq) apVar.build();
        obj2 = obj5;
        C69664n.m101060f(aqVar, "if (request.requestConte…serAgent).build()\n      }");
        C62934bn builder32 = this.f367742c.toBuilder();
        C69664n.m101060f(builder32, "this.toBuilder()");
        C57298cz a32 = C69664n.m101061g((C57300da) builder32, "builder");
        C62934bn builder42 = a32.mo54464a().toBuilder();
        C69664n.m101060f(builder42, "this.toBuilder()");
        C57296cx a42 = C69664n.m101061g((C57293cu) builder42, "builder");
        a42.mo54463b(aqVar);
        a32.mo54467d(a42.mo54462a());
        C62940bt btVar2 = C57267bv.f152871k;
        C69664n.m101060f(btVar2, "feedRequest");
        a32.mo54466c(btVar2, obj2);
        return a32.mo54465b();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135045ds(this.f367742c, this.f367743d, this.f367744e, gVar);
    }
}
