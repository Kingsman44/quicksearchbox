package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52415qx;
import com.google.assistant.p3897e.p3921j.C52416qy;
import com.google.assistant.p3897e.p3921j.C52421rc;
import com.google.assistant.p3897e.p3921j.C52422rd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.b */
/* compiled from: PG */
public final class C92892b extends C22538o {

    /* renamed from: a */
    private final C92862a f259151a;

    public C92892b(C92862a aVar) {
        this.f259151a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52421rc rcVar;
        if (dyVar.f135936b.equals("device.CHECK_PERMISSION")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C92862a aVar = this.f259151a;
            C62971cq<String> cqVar = ((C52415qx) m41992m(dwVar, "device_check_permission_args", C52415qx.f137537b.getParserForType())).f137539a;
            if (!cqVar.isEmpty()) {
                C52416qy qyVar = (C52416qy) C52422rd.f137548b.createBuilder();
                for (String str : cqVar) {
                    if (((str.hashCode() == -2003032073 && str.equals("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")) ? (char) 0 : 65535) != 0) {
                        qyVar.mo53864a(str, C52421rc.UNKNOWN);
                    } else {
                        if (C36619a.m65148d(aVar.f259082a)) {
                            rcVar = C52421rc.GRANTED;
                        } else {
                            rcVar = C52421rc.NOT_GRANTED;
                        }
                        qyVar.mo53864a(str, rcVar);
                    }
                }
                return C60856cj.m92900i(C22402a.m41821a("device_check_permission_result", "assistant.api.client_op.DeviceCheckPermissionResult", qyVar.build()));
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
