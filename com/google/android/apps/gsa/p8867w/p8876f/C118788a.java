package com.google.android.apps.gsa.p8867w.p8876f;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96979b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96980c;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.C64172a;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.C64177b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.gsa.shareddata.bubbles.AgsaClassicAutobubbleSubscriptionDataImpl$getAutobubbleSubscription$1", mo61344c = "AgsaClassicAutobubbleSubscriptionDataImpl.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.gsa.w.f.a */
/* compiled from: PG */
public final class C118788a extends C69572j implements C69630p {

    /* renamed from: a */
    int f331337a;

    /* renamed from: b */
    final /* synthetic */ C118791d f331338b;

    /* renamed from: c */
    final /* synthetic */ String f331339c;

    /* renamed from: d */
    final /* synthetic */ C63088z f331340d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118788a(C118791d dVar, String str, C63088z zVar, C69577g gVar) {
        super(2, gVar);
        this.f331338b = dVar;
        this.f331339c = str;
        this.f331340d = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C118788a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f331337a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C118791d dVar = this.f331338b;
            String str = this.f331339c;
            this.f331337a = 1;
            obj = dVar.mo103967a(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C63088z zVar = this.f331340d;
        C64172a aVar2 = (C64172a) C64177b.f173519d.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C69664n.m101061g(aVar2, "builder");
        C69664n.m101061g(zVar, "value");
        aVar2.copyOnWrite();
        C64177b bVar = (C64177b) aVar2.instance;
        zVar.getClass();
        bVar.f173521a = 1 | bVar.f173521a;
        bVar.f173522b = zVar;
        C96980c cVar = (C96980c) C96981d.f271030c.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C96979b a = C69664n.m101061g(cVar, "builder");
        a.mo90390b(zVar);
        boolean contains = ((C58528ij) obj).contains(a.mo90389a());
        aVar2.copyOnWrite();
        C64177b bVar2 = (C64177b) aVar2.instance;
        bVar2.f173521a |= 2;
        bVar2.f173523c = contains;
        C62942bv build = aVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C64177b) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C118788a(this.f331338b, this.f331339c, this.f331340d, gVar);
    }
}
