package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.f */
/* compiled from: PG */
public final class C22474f extends C22538o {

    /* renamed from: a */
    private final C22473e f62045a;

    public C22474f(C22473e eVar) {
        this.f62045a = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        boolean z;
        Intent intent;
        long j;
        Uri.Builder builder;
        if (dyVar.f135936b.equals("timer.CREATE_TIMER")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51594nm nmVar = (C51594nm) m41992m(dwVar, "timer_params", C51594nm.f134474f.getParserForType());
            C22473e eVar2 = this.f62045a;
            if (nmVar.f134477b.size() == 1) {
                C51592nk nkVar = (C51592nk) nmVar.f134477b.get(0);
                if (nkVar.f134465b != 4 && (nkVar.f134464a & 4) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                C22481m.m41933b(z);
                if ((nkVar.f134465b == 4 ? ((Long) nkVar.f134466c).longValue() : nkVar.f134469f) <= 0) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.OUT_OF_RANGE, (String) null));
                }
                String str = nmVar.f134480e;
                if (str.equals("com.google.android.deskclock")) {
                    ((C59052c) ((C59052c) C22473e.f62041a.mo56224b()).mo56372aa(48296)).mo56386p("Setting the timer using Google Clock app.");
                    C51592nk nkVar2 = (C51592nk) nmVar.f134477b.get(0);
                    if (!nmVar.f134478c || (nkVar2.f134464a & 1) == 0) {
                        builder = C22481m.f62054a.buildUpon();
                        C22473e.m41922b(builder, nkVar2);
                    } else if (!eVar2.f62044d.mo27802c()) {
                        builder = C22473e.m41921a(nkVar2);
                    } else if (!eVar2.f62043c.isKeyguardLocked()) {
                        builder = C22473e.m41921a(nkVar2);
                    } else {
                        builder = C22481m.f62054a.buildUpon();
                        C22473e.m41922b(builder, nkVar2);
                    }
                    Uri build = builder.build();
                    intent = new Intent().setData(build).setPackage(build.getHost());
                } else {
                    ((C59052c) ((C59052c) C22473e.f62041a.mo56224b()).mo56372aa(48295)).mo56389s("Setting the timer using public Clock API on %s", str);
                    C51592nk nkVar3 = (C51592nk) nmVar.f134477b.get(0);
                    Intent intent2 = new Intent("android.intent.action.SET_TIMER");
                    if (nkVar3.f134465b == 4) {
                        j = ((Long) nkVar3.f134466c).longValue();
                    } else {
                        j = nkVar3.f134469f;
                    }
                    intent2.putExtra("android.intent.extra.alarm.LENGTH", (int) TimeUnit.MILLISECONDS.toSeconds(j));
                    if ((nkVar3.f134464a & 32) != 0) {
                        intent2.putExtra("android.intent.extra.alarm.MESSAGE", nkVar3.f134470g);
                    }
                    if (!eVar2.f62044d.mo27802c()) {
                        intent2.putExtra("android.intent.extra.alarm.SKIP_UI", !nmVar.f134478c);
                    } else if (eVar2.f62043c.isKeyguardLocked()) {
                        intent2.putExtra("android.intent.extra.alarm.SKIP_UI", true);
                    } else {
                        intent2.putExtra("android.intent.extra.alarm.SKIP_UI", !nmVar.f134478c);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        intent2.setPackage(str);
                    }
                    intent = intent2;
                }
                if (!eVar2.f62042b.mo27807a(intent)) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, (String) null));
                }
                return C60856cj.m92900i(C22402a.f61893a);
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
