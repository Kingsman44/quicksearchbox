package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aaa;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C13396h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13397i f41168a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f41169b;

    public /* synthetic */ C13396h(C13397i iVar, C51809dy dyVar) {
        this.f41168a = iVar;
        this.f41169b = dyVar;
    }

    public final C60870cx apply(Object obj) {
        C13397i iVar = this.f41168a;
        C51809dy dyVar = this.f41169b;
        String str = (String) obj;
        C13395g gVar = iVar.f41170a;
        C35606g gVar2 = iVar.f41172c;
        if (dyVar == null) {
            throw new NullPointerException("Null clientOp");
        } else if (str != null) {
            C13375a aVar = new C13375a(gVar2, dyVar, str, iVar.f41173d, iVar.f41171b);
            C15481g gVar3 = aVar.f41135e;
            gVar3.mo22352b(C37179a.f97684ez);
            C51809dy dyVar2 = aVar.f41132b;
            if (!dyVar2.f135936b.equals("notification.ANNOUNCE")) {
                C13395g.m29663a(C62722b.INVALID_ARGUMENT, gVar3);
                return C60856cj.m92899h(new C35469e(dyVar2.f135936b));
            }
            try {
                Optional c = C36183e.m64585c(dyVar2, "notification_announce_args", aaa.f134621c.getParserForType());
                if (c.isEmpty()) {
                    C13395g.m29663a(C62722b.INVALID_ARGUMENT, gVar3);
                    return C60856cj.m92899h(new C35471g("Failed to parse NotificationAnnounceArgs"));
                }
                aaa aaa = (aaa) c.get();
                C15481g gVar4 = aVar.f41135e;
                if ((aaa.f134623a & 1) != 0) {
                    C60870cx a = aVar.f41131a.mo39738a();
                    C13392d dVar = new C13392d(gVar, gVar4, aaa, aVar);
                    return C60922j.m93045h(a, C47810es.m84966f(dVar), gVar.f41167b);
                }
                C13395g.m29663a(C62722b.INVALID_ARGUMENT, gVar4);
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "NotificationAnnounceArgs has no index."));
            } catch (C62974ct e) {
                C13395g.m29663a(C62722b.INVALID_ARGUMENT, gVar3);
                return C60856cj.m92899h(new C35471g((Throwable) e));
            }
        } else {
            throw new NullPointerException("Null locale");
        }
    }
}
