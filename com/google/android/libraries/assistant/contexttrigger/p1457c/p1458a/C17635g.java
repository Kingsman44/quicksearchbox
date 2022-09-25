package com.google.android.libraries.assistant.contexttrigger.p1457c.p1458a;

import com.google.android.libraries.assistant.contexttrigger.p1457c.C17639c;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17652p;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17653q;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17655s;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17661b;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17662c;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17666g;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17667h;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17668i;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17672m;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.a.g */
/* compiled from: PG */
public final class C17635g extends C17639c {

    /* renamed from: a */
    public static final C59071e f50754a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.c.a.g");

    /* renamed from: b */
    private final C17672m f50755b;

    /* renamed from: c */
    private final C17666g f50756c;

    /* renamed from: d */
    private final Executor f50757d;

    public C17635g(C17672m mVar, C17666g gVar, Executor executor) {
        this.f50755b = mVar;
        this.f50756c = gVar;
        this.f50757d = executor;
    }

    /* renamed from: b */
    public final void mo23418b(C17655s sVar, C70862aj ajVar) {
        C60870cx cxVar;
        C17692f fVar;
        C17692f fVar2;
        C17692f fVar3;
        C17653q qVar = sVar.f50785b;
        if (qVar == null) {
            qVar = C17653q.f50778c;
        }
        int b = C17652p.m34945b(qVar.f50780a);
        int i = b - 1;
        if (b != 0) {
            if (i != 0) {
                ((C59052c) ((C59052c) f50754a.mo56226d()).mo56372aa(46941)).mo56386p("Received unknown triggering event");
                cxVar = C60866ct.f164955a;
            } else {
                C59052c cVar = (C59052c) ((C59052c) f50754a.mo56224b()).mo56372aa(46942);
                if (qVar.f50780a == 1) {
                    fVar = (C17692f) qVar.f50781b;
                } else {
                    fVar = C17692f.f50858f;
                }
                C17689c a = C17689c.m34968a(fVar.f50861b);
                if (a == null) {
                    a = C17689c.UNSPECIFIED;
                }
                if (qVar.f50780a == 1) {
                    fVar2 = (C17692f) qVar.f50781b;
                } else {
                    fVar2 = C17692f.f50858f;
                }
                C17691e a2 = C17691e.m34970a(fVar2.f50862c);
                if (a2 == null) {
                    a2 = C17691e.UNKNOWN;
                }
                cVar.mo56354G("Headset event, headset state: %s, type: %s", a, a2);
                C17672m mVar = this.f50755b;
                C58838bb.m90869d(qVar.f50780a == 1, "Should have HeadsetState");
                if (qVar.f50780a == 1) {
                    fVar3 = (C17692f) qVar.f50781b;
                } else {
                    fVar3 = C17692f.f50858f;
                }
                C59052c cVar2 = (C59052c) ((C59052c) C17672m.f50819a.mo56224b()).mo56372aa(46947);
                C17691e a3 = C17691e.m34970a(fVar3.f50862c);
                if (a3 == null) {
                    a3 = C17691e.UNKNOWN;
                }
                C17689c a4 = C17689c.m34968a(fVar3.f50861b);
                if (a4 == null) {
                    a4 = C17689c.UNSPECIFIED;
                }
                cVar2.mo56354G("onTrigger headset type: %s, headset state: %s", a3, a4);
                cxVar = C47633f.m84733g(mVar.f50822d.mo50247d()).mo51516i(new C17667h(mVar, fVar3), mVar.f50820b).mo51515h(C17668i.f50813a, mVar.f50820b);
            }
            C60856cj.m92911t(cxVar, C47810es.m84974n(new C17634f("forwardTriggeringEvent", ajVar, C17631c.f50748a)), this.f50757d);
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo23419c(C70862aj ajVar) {
        C17666g gVar = this.f50756c;
        C47633f h = C47633f.m84733g(C60856cj.m92896e(C58485gu.m89846n(C47633f.m84733g(gVar.f50809d.mo50247d()).mo51516i(new C17661b(gVar), gVar.f50807b).mo51515h(C17662c.f50802a, gVar.f50807b)))).mo51515h(C17632d.f50749a, this.f50757d);
        C17634f fVar = new C17634f("getSignalsToRegister", ajVar, C17633e.f50750a);
        C60856cj.m92911t(h, C47810es.m84974n(fVar), this.f50757d);
    }
}
