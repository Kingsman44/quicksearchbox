package com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.logging.statedump.ContextDebugDataProvider$getDebugData$1$1", mo61344c = "ContextDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.f.b.a.b */
/* compiled from: PG */
final class C32907b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32914i f88202a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32907b(C32914i iVar, C69577g gVar) {
        super(2, gVar);
        this.f88202a = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32907b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C32914i iVar = this.f88202a;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : iVar.f88225d) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            C32906a aVar2 = (C32906a) next;
            Instant instant = aVar2.f88200a;
            sb.append("Snapshot #" + i + ". Time: " + instant);
            sb.append(10);
            sb.append(aVar2.f88201b);
            sb.append(10);
            i = i2;
        }
        String sb2 = sb.toString();
        C46663a aVar3 = new C46663a();
        aVar3.mo50684b(false);
        aVar3.mo50686d(C46667e.TEXT);
        aVar3.f121916a = C63088z.m96143E(sb2);
        return aVar3.mo50683a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32907b(this.f88202a, gVar);
    }
}
