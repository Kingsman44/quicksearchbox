package com.google.android.apps.gsa.p8867w.p8876f;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96979b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96980c;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.common.p4522b.C58479go;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.C64177b;
import java.util.Set;
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

@C69567e(mo61343b = "com.google.android.apps.gsa.shareddata.bubbles.AgsaClassicAutobubbleSubscriptionDataImpl$writeAutobubbleSubscription$1", mo61344c = "AgsaClassicAutobubbleSubscriptionDataImpl.kt", mo61345d = "invokeSuspend", mo61346e = {66, 80})
/* renamed from: com.google.android.apps.gsa.w.f.c */
/* compiled from: PG */
public final class C118790c extends C69572j implements C69630p {

    /* renamed from: a */
    int f331346a;

    /* renamed from: b */
    final /* synthetic */ C118791d f331347b;

    /* renamed from: c */
    final /* synthetic */ String f331348c;

    /* renamed from: d */
    final /* synthetic */ C64177b f331349d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118790c(C118791d dVar, String str, C64177b bVar, C69577g gVar) {
        super(2, gVar);
        this.f331347b = dVar;
        this.f331348c = str;
        this.f331349d = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C118790c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f331346a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C118791d dVar = this.f331347b;
            String str = this.f331348c;
            this.f331346a = 1;
            obj = dVar.mo103967a(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return null;
        } else {
            C69714l.m101134b(obj);
        }
        Set aa = C69540x.m100845aa((Iterable) obj);
        C64177b bVar = this.f331349d;
        C96980c cVar = (C96980c) C96981d.f271030c.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C96979b a = C69664n.m101061g(cVar, "builder");
        C63088z zVar = bVar.f173522b;
        C69664n.m101060f(zVar, "subscription.entityId");
        a.mo90390b(zVar);
        C96981d a2 = a.mo90389a();
        if (this.f331349d.f173523c) {
            if (!aa.add(a2)) {
                C59052c cVar2 = (C59052c) C118791d.f331350a.mo56226d();
                cVar2.mo56379ah(new C59094n(11492));
                cVar2.mo56386p("Cannot add autobubble subscription; subscription already exists");
            }
        } else if (!aa.remove(a2)) {
            C59052c cVar3 = (C59052c) C118791d.f331350a.mo56226d();
            cVar3.mo56379ah(new C59094n(11491));
            cVar3.mo56386p("Cannot remove autobubble subscription; subscription does not exist");
        }
        C60870cx b = this.f331347b.f331351b.mo90375b(C58479go.m89814f(aa));
        C69664n.m101060f(b, "dataStore.updateSubscrip…iptions.toImmutableSet())");
        this.f331346a = 2;
        if (C71663i.m104690c(b, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C118790c(this.f331347b, this.f331348c, this.f331349d, gVar);
    }
}
