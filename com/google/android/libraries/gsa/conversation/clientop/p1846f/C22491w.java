package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.w */
/* compiled from: PG */
public final class C22491w extends C22538o {

    /* renamed from: a */
    private final C22490v f62069a;

    public C22491w(C22490v vVar) {
        this.f62069a = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("alarm.SNOOZE_ALARM")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51527l lVar = (C51527l) m41992m(dwVar, "alarm_params", C51527l.f134273f.getParserForType());
            C22490v vVar = this.f62069a;
            ((C59052c) ((C59052c) C22490v.f62067a.mo56224b()).mo56372aa(48302)).mo56386p("SnoozeAlarmPerformer");
            boolean z = true;
            C22490v.m41946a(lVar.f134276b.size() > 0);
            if (1 != (((C51473j) lVar.f134276b.get(0)).f134092a & 1)) {
                z = false;
            }
            C22490v.m41946a(z);
            Uri.Builder appendPath = Uri.parse(((C51473j) lVar.f134276b.get(0)).f134095d).buildUpon().appendPath("snooze");
            if ((lVar.f134275a & 2) != 0) {
                long round = (long) Math.round(((float) lVar.f134277c) / 60000.0f);
                if (round == 0) {
                    round = 1;
                }
                appendPath.appendQueryParameter("snoozeLength", Long.toString(round));
            }
            Uri build = appendPath.build();
            if (!vVar.f62068b.mo27807a(new Intent().setAction("android.intent.action.VIEW").setData(build).setPackage(build.getHost()))) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "fails to start activity"));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        throw new C22428d(dyVar);
    }
}
