package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52409qr;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.d */
/* compiled from: PG */
public final class C94656d extends C22538o {

    /* renamed from: b */
    public static final /* synthetic */ int f264738b = 0;

    /* renamed from: c */
    private static final C59071e f264739c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.a.d");

    /* renamed from: a */
    public final C94785f f264740a;

    /* renamed from: d */
    private final C22871g f264741d;

    public C94656d(C94785f fVar, C22871g gVar) {
        this.f264740a = fVar;
        this.f264741d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str = dyVar.f135936b;
        if ("sdk_actions.EXECUTE".equals(str)) {
            C63010eb parserForType = C52409qr.f137528b.getParserForType();
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C58833ax c = C58557jl.m90122c(dwVar.f135932a, new C94655c());
            MessageLite messageLite = null;
            if (!c.mo56113h()) {
                C59104x d = f264739c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoActionSdkPerformer");
                ((C59052c) ((C59052c) d).mo56372aa(16822)).mo56354G("Failed to find %s argument in %s client op", "device_actions_response", dyVar.f135936b);
            } else {
                try {
                    C52230ka kaVar = ((C52232kc) c.mo56107c()).f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    messageLite = (MessageLite) parserForType.mo59008g(kaVar.f137061c);
                } catch (C62974ct unused) {
                    C59104x c2 = f264739c.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "BistoActionSdkPerformer");
                    ((C59052c) ((C59052c) c2).mo56372aa(16821)).mo56354G("Failed to parse %s argument from %s client op", "device_actions_response", dyVar.f135936b);
                }
            }
            C52409qr qrVar = (C52409qr) messageLite;
            if (qrVar != null) {
                C22871g gVar = this.f264741d;
                return gVar.mo28210j(gVar.mo28207g("Return", new C94653a(this, qrVar)), "Notify", C94654b.f264736a);
            }
            C59104x c3 = f264739c.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "BistoActionSdkPerformer");
            ((C59052c) ((C59052c) c3).mo56372aa(16820)).mo56386p("Client op does not have DeviceActionsResponseArgs");
            throw new C22428d(dyVar);
        }
        C59104x c4 = f264739c.mo56225c();
        c4.mo56378ag(C58975e.f156826a, "BistoActionSdkPerformer");
        ((C59052c) ((C59052c) c4).mo56372aa(16819)).mo56389s("Not an expected client op: %s", str);
        throw new C22428d(dyVar);
    }
}
