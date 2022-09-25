package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52192iq;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.r */
/* compiled from: PG */
public final class C93111r extends C22538o {

    /* renamed from: a */
    private final C93110q f259738a;

    public C93111r(C93110q qVar) {
        this.f259738a = qVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str = dyVar.f135936b;
        if (str.equals("media.SET_FOCUS")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52192iq iqVar = (C52192iq) m41992m(dwVar, "media_set_focus_args", C52192iq.f136983d.getParserForType());
            C93110q qVar = this.f259738a;
            int i = iqVar.f136985a;
            if ((i & 4) == 0) {
                ((C59052c) ((C59052c) C93110q.f259736a.mo56225c()).mo56372aa(13311)).mo56386p("Fail to store media focus info because focus_duration_ms is not set.");
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, "Can't find focus_duration_ms in set_focus_args"));
            } else if ((i & 1) != 0) {
                SharedPreferences.Editor edit = qVar.f259737b.edit();
                C52428rj rjVar = iqVar.f136986b;
                if (rjVar == null) {
                    rjVar = C52428rj.f137558m;
                }
                edit.putString("opa_android_media_focus_device_id", Base64.encodeToString(rjVar.toByteArray(), 0)).putLong("opa_android_media_focus_expiration_timestamp_ms", System.currentTimeMillis() + iqVar.f136987c).apply();
                return C60856cj.m92900i(C93110q.m153193a());
            } else {
                ((C59052c) ((C59052c) C93110q.f259736a.mo56225c()).mo56372aa(13310)).mo56386p("Fail to store media focus info because device_id is not set.");
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, "Can't find device_id in set_focus_args"));
            }
        } else if (str.equals("media.CLEAR_FOCUS")) {
            this.f259738a.f259737b.edit().remove("opa_android_media_focus_device_id").remove("opa_android_media_focus_expiration_timestamp_ms").apply();
            return C60856cj.m92900i(C93110q.m153193a());
        } else {
            throw new C22428d(dyVar);
        }
    }
}
