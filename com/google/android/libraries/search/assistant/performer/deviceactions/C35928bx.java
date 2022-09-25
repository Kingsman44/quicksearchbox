package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.p9649a.C127825a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52437rs;
import com.google.assistant.p3897e.p3921j.C52438rt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4194a.C55912b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bx */
/* compiled from: PG */
public final class C35928bx implements C35472h {

    /* renamed from: a */
    public static final C59071e f94084a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.bx");

    /* renamed from: b */
    private final C35470f f94085b;

    /* renamed from: c */
    private final Context f94086c;

    public C35928bx(Context context, C35470f fVar) {
        this.f94086c = context;
        this.f94085b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        int i;
        int a;
        int a2;
        int a3;
        C59104x b = f94084a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RequestPermissionPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(51858)).mo56386p("TNG RequestPermissionPerformer");
        char c = 0;
        if (dyVar.f135936b.equals("device.REQUEST_PERMISSION")) {
            C52438rt rtVar = (C52438rt) C36183e.m64584b(dyVar, "device_request_permission_args", C52438rt.f137645h.getParserForType());
            int i2 = rtVar.f137647a;
            if ((i2 & 1) != 0) {
                String str = rtVar.f137648b;
                if (TextUtils.isEmpty(str)) {
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Android permission is empty"));
                }
                if (str.hashCode() != -2003032073 || !str.equals("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")) {
                    c = 65535;
                }
                if (c != 0) {
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Unsupported Android permission: ".concat(String.valueOf(str))));
                }
                C36619a.m65147c(this.f94086c);
                Intent b2 = C36619a.m65146b(this.f94086c);
                if (b2 == null) {
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Error getting the notification listener setting intent"));
                }
                return C47633f.m84733g(this.f94085b.mo20101f(b2)).mo51515h(C35926bv.f94082a, C60826bg.f164896a).mo51513e(Exception.class, new C35927bw(b2), C60826bg.f164896a);
            }
            int i3 = i2 & 4;
            if (i3 == 0) {
                throw new C35471g("ClientOp args are incorrect. Cannot request permission.");
            } else if (i3 == 0 || ((i2 & 8) != 0 && (((a = C52437rs.m86632a((i = rtVar.f137650d))) == 0 || a != 2) && (a2 = C52437rs.m86632a(i)) != 0 && a2 != 1 && ((a3 = C52437rs.m86632a(i)) == 0 || a3 != 3)))) {
                C52235kf kfVar = C52235kf.INVALID_ARGUMENT;
                int a4 = C52437rs.m86632a(rtVar.f137650d);
                return C60856cj.m92900i(C36180b.m64579c(kfVar, "Unsupported udc permission method: ".concat((a4 == 0 || a4 == 1) ? "UDC_PERMISSION_METHOD_UNSPECIFIED" : a4 != 2 ? "SET_DEVICE_LEVEL_COMPANION_AND_REFRESH" : "BOTTOM_SHEET")));
            } else {
                int a5 = C52437rs.m86632a(rtVar.f137650d);
                if (a5 != 0 && a5 == 3) {
                    return C60856cj.m92900i(C36180b.f94544a);
                }
                Bundle bundle = new Bundle();
                bundle.putByteArray("CLIENT_INPUT", rtVar.f137652f.mo59174N());
                bundle.putString("REJECT_TEXT", rtVar.f137653g);
                C55912b a6 = C55912b.m87801a(rtVar.f137649c);
                if (a6 == null) {
                    a6 = C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;
                }
                bundle.putInt("ACTIVITY_CONTROLS_SETTING", a6.f148826V);
                return C47633f.m84733g(this.f94085b.mo20101f(C127825a.m208848a(bundle))).mo51515h(C35924bt.f94080a, C60826bg.f164896a).mo51513e(Exception.class, C35925bu.f94081a, C60826bg.f164896a);
            }
        } else {
            throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.REQUEST_PERMISSION", dyVar.f135936b}));
        }
    }
}
