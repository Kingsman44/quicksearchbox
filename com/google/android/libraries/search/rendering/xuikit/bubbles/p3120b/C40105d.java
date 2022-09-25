package com.google.android.libraries.search.rendering.xuikit.bubbles.p3120b;

import com.google.android.apps.gsa.p8867w.p8876f.C118790c;
import com.google.android.apps.gsa.p8867w.p8876f.C118791d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.C64177b;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.p4920a.C64176d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.bubbles.agsaclassic.UpdateAutobubbleSubscriptionXUiKitCommandHandler$invoke$1", mo61344c = "UpdateAutobubbleSubscriptionXUiKitCommandHandler.kt", mo61345d = "invokeSuspend", mo61346e = {42, 43})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.b.d */
/* compiled from: PG */
final class C40105d extends C69572j implements C69630p {

    /* renamed from: a */
    int f105338a;

    /* renamed from: b */
    final /* synthetic */ C64176d f105339b;

    /* renamed from: c */
    final /* synthetic */ C40106e f105340c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40105d(C64176d dVar, C40106e eVar, C69577g gVar) {
        super(2, gVar);
        this.f105339b = dVar;
        this.f105340c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40105d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C60870cx cxVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f105338a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C64177b bVar = this.f105339b.f173517a;
            if (bVar == null) {
                bVar = C64177b.f173519d;
            }
            if ((bVar.f173521a & 1) != 0) {
                C40106e eVar = this.f105340c;
                C60870cx b = eVar.f105343c.mo50215b(eVar.f105342b);
                this.f105338a = 1;
                obj = C71663i.m104690c(b, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("Entity id is not set in UpdateAutobubbleSubscriptionCommand");
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        String str = (String) obj;
        C40102a aVar2 = this.f105340c.f105341a;
        C64177b bVar2 = this.f105339b.f173517a;
        if (bVar2 == null) {
            bVar2 = C64177b.f173519d;
        }
        C69664n.m101061g(bVar2, "subscription");
        C118791d dVar = (C118791d) aVar2;
        if (!dVar.mo103968b(str)) {
            C59052c cVar = (C59052c) C118791d.f331350a.mo56225c();
            cVar.mo56379ah(new C59094n(11494));
            cVar.mo56386p("writeAutobubbleSubscription failed due to account mismatch");
            cxVar = C60856cj.m92899h(new IllegalStateException("Account name does not match current account"));
        } else {
            cxVar = C71663i.m104692e(dVar.f331352c, (C71424ay) null, new C118790c(dVar, str, bVar2, (C69577g) null), 3);
        }
        C69664n.m101060f(cxVar, "subscriptionData.writeAu…ubscription, accountName)");
        this.f105338a = 2;
        obj = C71663i.m104690c(cxVar, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40105d(this.f105339b, this.f105340c, gVar);
    }
}
