package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10010d;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.p9914b.C130602a;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131687a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17684y;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17687a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.trigger.headset.HeadsetStateContextTriggerListener$onContextTrigger$1", mo61344c = "HeadsetStateContextTriggerListener.kt", mo61345d = "invokeSuspend", mo61346e = {48, 63})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.d.e */
/* compiled from: PG */
final class C131718e extends C69572j implements C69630p {

    /* renamed from: a */
    int f359843a;

    /* renamed from: b */
    final /* synthetic */ C131719f f359844b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131718e(C131719f fVar, C69577g gVar) {
        super(2, gVar);
        this.f359844b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131718e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C60870cx cxVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f359843a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C17684y yVar = this.f359844b.f359846b;
            if (yVar.mo23430i((Intent) null)) {
                ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46970)).mo56386p("getHeadsetState(): is wired.");
                C17687a a = yVar.mo23427a();
                C17689c cVar = C17689c.CONNECTED;
                a.copyOnWrite();
                C17692f fVar = (C17692f) a.instance;
                C17692f fVar2 = C17692f.f50858f;
                fVar.f50861b = cVar.f50850d;
                fVar.f50860a |= 1;
                C17691e eVar = C17691e.WIRED;
                a.copyOnWrite();
                C17692f fVar3 = (C17692f) a.instance;
                fVar3.f50862c = eVar.f50857e;
                fVar3.f50860a |= 4;
                cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a.build()));
            } else {
                cxVar = yVar.mo23428b();
            }
            this.f359843a = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                ((C58970a) ((C58970a) this.f359844b.f359847c.mo56225c()).mo56382g(th)).mo56386p("#onContextTrigger: Failed");
            }
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C58970a) this.f359844b.f359847c.mo56226d()).mo56386p("#onContextTrigger: Headset triggered but could not get current headset state.");
        }
        C131701c c = C131701c.m214153c((MessageLite) optional.get());
        C131101a aVar2 = this.f359844b.f359845a;
        C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
        C106532f a2 = C130602a.m212959a((C17692f) ((C131687a) c).f359794a);
        bkVar.copyOnWrite();
        C53715bm bmVar = (C53715bm) bkVar.instance;
        a2.getClass();
        bmVar.f141024b = a2;
        bmVar.f141023a = 4;
        C60870cx b = aVar2.mo110074b((C53715bm) bkVar.build(), ((C131687a) c).f359795b);
        C69664n.m101060f(b, "orchestrator\n          .…Event.runId()\n          )");
        this.f359843a = 2;
        if (C71663i.m104690c(b, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131718e(this.f359844b, gVar);
    }
}
