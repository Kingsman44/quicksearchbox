package com.google.android.apps.gsa.staticplugins.accl.performers.p7340a;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.p2504b.p2505a.C32501f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51669ac;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52499u;
import com.google.assistant.p3897e.p3921j.C52634z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.a.b */
/* compiled from: PG */
public final class C92864b extends C22538o {

    /* renamed from: a */
    public static final C59071e f259084a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.a.b");

    /* renamed from: b */
    private final C32501f f259085b;

    public C92864b(C32501f fVar) {
        this.f259085b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52634z zVar;
        C59071e eVar2 = f259084a;
        C59104x b = eVar2.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ExecAppAutoPerf");
        ((C59052c) ((C59052c) b).mo56372aa(13148)).mo56386p("#perform - device.EXECUTE_APP_AUTOMATION ClientOp");
        String str = dyVar.f135936b;
        if (str.equals("device.EXECUTE_APP_AUTOMATION")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52499u uVar = (C52499u) m41992m(dwVar, "app_automation_args", C52499u.f137817b.getParserForType());
            C51669ac acVar = uVar.f137819a;
            if (acVar == null) {
                acVar = C51669ac.f134786c;
            }
            if (acVar.f134788a == 1) {
                C51669ac acVar2 = uVar.f137819a;
                if (acVar2 == null) {
                    acVar2 = C51669ac.f134786c;
                }
                if (acVar2.f134788a == 1) {
                    zVar = (C52634z) acVar2.f134789b;
                } else {
                    zVar = C52634z.f138199b;
                }
                if ((zVar.f138201a & 1) == 0) {
                    throw new C22428d(dyVar);
                }
            }
            C60870cx a = this.f259085b.mo38112a(uVar);
            C92863a aVar = C92863a.f259083a;
            return C60922j.m93044g(a, C47810es.m84963c(aVar), C60826bg.f164896a);
        }
        C59104x b2 = eVar2.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ExecAppAutoPerf");
        ((C59052c) ((C59052c) b2).mo56372aa(13149)).mo56389s("#perform - opName mismatch: %s", str);
        throw new C22428d(dyVar);
    }
}
