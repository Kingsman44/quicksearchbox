package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32461t;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.apw;
import com.google.assistant.p3897e.p3921j.apx;
import com.google.assistant.p3897e.p3921j.apy;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.protobuf.C62940bt;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.ActionsServiceCoroutineService$bindActionsService$1$appExecutionResponsesJob$1$1$1", mo61344c = "ActionsServiceCoroutineService.kt", mo61345d = "invokeSuspend", mo61346e = {79})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.a */
/* compiled from: PG */
final class C129068a extends C69572j implements C69630p {

    /* renamed from: a */
    int f354562a;

    /* renamed from: b */
    final /* synthetic */ C129076i f354563b;

    /* renamed from: c */
    final /* synthetic */ C32461t f354564c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129068a(C129076i iVar, C32461t tVar, C69577g gVar) {
        super(2, gVar);
        this.f354563b = iVar;
        this.f354564c = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129068a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354562a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C129076i iVar = this.f354563b;
            C32461t tVar = this.f354564c;
            apx apx = (apx) apy.f135589f.createBuilder();
            C69664n.m101060f(apx, "newBuilder()");
            apw a = C69664n.m101061g(apx, "builder");
            boolean z = tVar.f86998b;
            apx apx2 = a.f135588a;
            apx2.copyOnWrite();
            apy apy = (apy) apx2.instance;
            apy.f135591a |= 8;
            apy.f135595e = z;
            C52813ac acVar = tVar.f86997a;
            C62940bt btVar = C48775a.f126210b;
            C69664n.m101060f(btVar, "appActionsFulfillmentResponse");
            a.mo53713b(btVar, acVar);
            apy a2 = a.mo53712a();
            this.f354562a = 1;
            if (iVar.mo108835b(a2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129068a(this.f354563b, this.f354564c, gVar);
    }
}
