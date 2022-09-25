package com.google.android.apps.search.googleapp.p10356m;

import com.google.android.apps.search.googleapp.p10356m.C136687c;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65829df;
import com.google.protos.p5129p.p5131b.C65830dg;
import com.google.protos.p5129p.p5131b.C65831dh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.geller.GoogleAppSyncContextGenerator$getVersionInfo$2", mo61344c = "GoogleAppSyncContextGenerator.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.apps.search.googleapp.m.g */
/* compiled from: PG */
final class C136692g extends C69572j implements C69630p {

    /* renamed from: a */
    Object f372079a;

    /* renamed from: b */
    Object f372080b;

    /* renamed from: c */
    int f372081c;

    /* renamed from: d */
    final /* synthetic */ C136687c f372082d;

    /* renamed from: e */
    final /* synthetic */ AccountId f372083e;

    /* renamed from: f */
    final /* synthetic */ Iterable f372084f;

    /* renamed from: g */
    private /* synthetic */ Object f372085g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136692g(C136687c cVar, AccountId accountId, Iterable iterable, C69577g gVar) {
        super(2, gVar);
        this.f372082d = cVar;
        this.f372083e = accountId;
        this.f372084f = iterable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136692g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C65831dh dhVar;
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f372081c != 0) {
            obj3 = this.f372080b;
            Object obj4 = this.f372079a;
            dhVar = (C65831dh) this.f372085g;
            C69714l.m101134b(obj);
            obj2 = obj4;
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f372085g;
            C38469m fN = ((C136687c.C136688a) C47245e.m84045a(this.f372082d.f372063a, C136687c.C136688a.class, this.f372083e)).mo113329fN();
            Iterable<C65753ak> iterable = this.f372084f;
            C65829df dfVar = (C65829df) C65830dg.f178957b.createBuilder();
            C69664n.m101060f(dfVar, "newBuilder()");
            C69664n.m101061g(dfVar, "builder");
            C65831dh dhVar2 = new C65831dh(dfVar);
            List unmodifiableList = Collections.unmodifiableList(((C65830dg) dhVar2.f178961a.instance).f178960a);
            C69664n.m101060f(unmodifiableList, "_builder.getVersionInfosList()");
            C62883b bVar = new C62883b(unmodifiableList);
            ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
            for (C65753ak f : iterable) {
                C60870cx f2 = fN.mo41435f(f);
                C69664n.m101060f(f2, "gellerAccessor.readMetadata(it, VERSION_INFO_KEY)");
                C71604be c = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C136690e(f2, (C69577g) null), 3);
                c.mo62873s(new C136691f(f2));
                arrayList.add(c);
            }
            this.f372085g = dhVar2;
            this.f372079a = dhVar2;
            this.f372080b = bVar;
            this.f372081c = 1;
            obj = C71760h.m104949a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
            obj3 = bVar;
            Object obj5 = dhVar2;
            dhVar = obj5;
            obj2 = obj5;
        }
        List l = C69540x.m100805l((Iterable) obj);
        C69664n.m101061g(obj3, "<this>");
        C69664n.m101061g(l, "values");
        ((C65831dh) obj2).f178961a.mo59431a(l);
        C62942bv build = dhVar.f178961a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C65830dg) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C136692g gVar2 = new C136692g(this.f372082d, this.f372083e, this.f372084f, gVar);
        gVar2.f372085g = obj;
        return gVar2;
    }
}
