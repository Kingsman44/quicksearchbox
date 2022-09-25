package com.google.android.apps.gsa.staticplugins.accl.performers.p7343d;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52438rt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.d.k */
/* compiled from: PG */
public final class C93067k extends C22538o {

    /* renamed from: a */
    private static final C59071e f259603a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.d.k");

    /* renamed from: b */
    private final C22538o f259604b;

    /* renamed from: c */
    private final C35472h f259605c;

    public C93067k(C22538o oVar, C35472h hVar) {
        this.f259604b = oVar;
        this.f259605c = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C59104x b = f259603a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RequestPermissionPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(13288)).mo56386p("#perform");
        if (dyVar.f135936b.equals("device.REQUEST_PERMISSION")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            if (((C52438rt) m41992m(dwVar, "device_request_permission_args", C52438rt.f137645h.getParserForType())).f137648b.equals("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")) {
                return this.f259605c.mo20766a(dyVar);
            }
            return this.f259604b.mo20765a(dyVar, eVar);
        }
        throw new C22428d(dyVar);
    }
}
