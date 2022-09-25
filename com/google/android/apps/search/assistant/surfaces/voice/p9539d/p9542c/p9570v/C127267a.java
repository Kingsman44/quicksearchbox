package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9570v;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32813bh;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32816bk;
import com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a.p2832a.C36852b;
import com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a.p2832a.C36853c;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.ngramhistory.AssistantHistoryTypedNgramsProvider$fetchContext$1", mo61344c = "AssistantHistoryTypedNgramsProvider.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.v.a */
/* compiled from: PG */
final class C127267a extends C69572j implements C69630p {

    /* renamed from: a */
    int f350497a;

    /* renamed from: b */
    final /* synthetic */ C127269c f350498b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127267a(C127269c cVar, C69577g gVar) {
        super(2, gVar);
        this.f350498b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127267a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350497a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127269c cVar = this.f350498b;
            this.f350497a = 1;
            obj = cVar.mo108007a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C58528ij ijVar = (C58528ij) obj;
        int i = C127269c.f350502a;
        C36852b bVar = (C36852b) C36853c.f95995b.createBuilder();
        bVar.copyOnWrite();
        C36853c cVar2 = (C36853c) bVar.instance;
        C62971cq cqVar = cVar2.f95998a;
        if (!cqVar.mo58948c()) {
            cVar2.f95998a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) ijVar, (List) cVar2.f95998a);
        C62942bv build = bVar.build();
        C69664n.m101060f(build, "newBuilder().addAllTyped…rams(contextData).build()");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32813bh bhVar = (C32813bh) C32814bi.f87999a.createBuilder();
        C69664n.m101060f(bhVar, "newBuilder()");
        C32816bk a2 = C69664n.m101061g(bhVar, "builder");
        C62940bt btVar = C36853c.f95996c;
        C69664n.m101060f(btVar, "assistantHistoryContextResponseExt");
        a2.mo38310b(btVar, (C36853c) build);
        a.mo38304c(a2.mo38309a());
        return a.mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127267a(this.f350498b, gVar);
    }
}
