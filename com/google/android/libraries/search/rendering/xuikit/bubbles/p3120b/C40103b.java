package com.google.android.libraries.search.rendering.xuikit.bubbles.p3120b;

import com.google.android.apps.gsa.p8867w.p8876f.C118788a;
import com.google.android.apps.gsa.p8867w.p8876f.C118791d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.C64177b;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.p4920a.C64174b;
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

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.bubbles.agsaclassic.ReadAutobubbleSubscriptionXUiKitCommandHandler$invoke$1", mo61344c = "ReadAutobubbleSubscriptionXUiKitCommandHandler.kt", mo61345d = "invokeSuspend", mo61346e = {46, 48})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.b.b */
/* compiled from: PG */
final class C40103b extends C69572j implements C69630p {

    /* renamed from: a */
    int f105330a;

    /* renamed from: b */
    final /* synthetic */ C64174b f105331b;

    /* renamed from: c */
    final /* synthetic */ C40104c f105332c;

    /* renamed from: d */
    final /* synthetic */ C40335z f105333d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40103b(C64174b bVar, C40104c cVar, C40335z zVar, C69577g gVar) {
        super(2, gVar);
        this.f105331b = bVar;
        this.f105332c = cVar;
        this.f105333d = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40103b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C60870cx cxVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f105330a;
        if (i == 0) {
            C69714l.m101134b(obj);
            String str = this.f105331b.f173513c;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("DataStore output path is not set in ReadAutobubbleSubscriptionCommand");
            } else if ((this.f105331b.f173511a & 1) != 0) {
                C40104c cVar = this.f105332c;
                C60870cx b = cVar.f105336c.mo50215b(cVar.f105335b);
                this.f105330a = 1;
                obj = C71663i.m104690c(b, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("Entity id is not set in ReadAutobubbleSubscriptionCommand");
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            this.f105333d.mo42397b().mo26140c(this.f105331b.f173513c, ((C64177b) obj).toByteArray());
            return null;
        } else {
            C69714l.m101134b(obj);
        }
        String str2 = (String) obj;
        C40102a aVar2 = this.f105332c.f105334a;
        C63088z zVar = this.f105331b.f173512b;
        C69664n.m101061g(zVar, "entityId");
        C118791d dVar = (C118791d) aVar2;
        if (!dVar.mo103968b(str2)) {
            C59052c cVar2 = (C59052c) C118791d.f331350a.mo56225c();
            cVar2.mo56379ah(new C59094n(11493));
            cVar2.mo56386p("getAutobubbleSubscription failed due to account mismatch");
            cxVar = C60856cj.m92899h(new IllegalStateException("Account name does not match current account"));
        } else {
            cxVar = C71663i.m104692e(dVar.f331352c, (C71424ay) null, new C118788a(dVar, str2, zVar, (C69577g) null), 3);
        }
        C69664n.m101060f(cxVar, "subscriptionData.getAuto…nd.entityId, accountName)");
        this.f105330a = 2;
        obj = C71663i.m104690c(cxVar, this);
        if (obj == aVar) {
            return aVar;
        }
        this.f105333d.mo42397b().mo26140c(this.f105331b.f173513c, ((C64177b) obj).toByteArray());
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40103b(this.f105331b, this.f105332c, this.f105333d, gVar);
    }
}
