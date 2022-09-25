package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Context;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52415qx;
import com.google.assistant.p3897e.p3921j.C52416qy;
import com.google.assistant.p3897e.p3921j.C52421rc;
import com.google.assistant.p3897e.p3921j.C52422rd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.x */
/* compiled from: PG */
public final class C35985x implements C35472h {

    /* renamed from: a */
    private static final C59071e f94174a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.x");

    /* renamed from: b */
    private final Context f94175b;

    public C35985x(Context context) {
        this.f94175b = context;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C52421rc rcVar;
        ((C59052c) ((C59052c) f94174a.mo56224b()).mo56372aa(51807)).mo56386p("TNG RequestPermissionPerformer");
        if (dyVar.f135936b.equals("device.CHECK_PERMISSION")) {
            C62971cq<String> cqVar = ((C52415qx) C36183e.m64584b(dyVar, "device_check_permission_args", C52415qx.f137537b.getParserForType())).f137539a;
            if (!cqVar.isEmpty()) {
                C52416qy qyVar = (C52416qy) C52422rd.f137548b.createBuilder();
                for (String str : cqVar) {
                    if (((str.hashCode() == -2003032073 && str.equals("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")) ? (char) 0 : 65535) != 0) {
                        qyVar.mo53864a(str, C52421rc.UNKNOWN);
                    } else {
                        if (C36619a.m65148d(this.f94175b)) {
                            rcVar = C52421rc.GRANTED;
                        } else {
                            rcVar = C52421rc.NOT_GRANTED;
                        }
                        qyVar.mo53864a(str, rcVar);
                    }
                }
                return C60856cj.m92900i(C36180b.m64577a("device_check_permission_result", "assistant.api.client_op.DeviceCheckPermissionResult", qyVar.build()));
            }
            throw new C35471g("No permission need to be checked!");
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.CHECK_PERMISSION", dyVar.f135936b}));
    }
}
