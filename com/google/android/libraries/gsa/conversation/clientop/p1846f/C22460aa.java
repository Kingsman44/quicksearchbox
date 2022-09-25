package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3899b.p3901b.C50883j;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.aa */
/* compiled from: PG */
public final class C22460aa extends C22538o {

    /* renamed from: a */
    private final C22494z f62023a;

    public C22460aa(C22494z zVar) {
        this.f62023a = zVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("alarm.STOP_ALARM")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C50883j jVar = (C50883j) m41992m(dwVar, "alarm_stop_alarm_args", C50883j.f132484b.getParserForType());
            C22494z zVar = this.f62023a;
            ((C59052c) ((C59052c) C22494z.f62072a.mo56224b()).mo56372aa(48303)).mo56386p("StopAlarmPerformer");
            if (jVar.f132486a.size() > 0) {
                Uri build = Uri.parse((String) jVar.f132486a.get(0)).buildUpon().appendPath("dismiss").build();
                if (!zVar.f62073b.mo27807a(new Intent().setAction("android.intent.action.VIEW").setData(build).setPackage(build.getHost()))) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "fails to start activity"));
                }
                return C60856cj.m92900i(C22402a.f61893a);
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
