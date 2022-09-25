package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
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

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.aj */
/* compiled from: PG */
public final class C22469aj extends C22538o {

    /* renamed from: a */
    private final C22468ai f62036a;

    public C22469aj(C22468ai aiVar) {
        this.f62036a = aiVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Intent intent;
        if (dyVar.f135936b.equals("timer.UPDATE_TIMER")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51594nm nmVar = (C51594nm) m41992m(dwVar, "timer_params", C51594nm.f134474f.getParserForType());
            C22468ai aiVar = this.f62036a;
            if (nmVar.f134477b.size() == 0) {
                throw new C22534k();
            } else if (nmVar.f134477b.size() <= 1 || C22481m.m41934c(nmVar.f134477b)) {
                if (!nmVar.f134478c && nmVar.f134477b.size() <= 1) {
                    C51592nk nkVar = (C51592nk) nmVar.f134477b.get(0);
                    ((C59052c) ((C59052c) C22468ai.f62031a.mo56224b()).mo56372aa(48306)).mo56386p("Updating the timer using public Clock API.");
                    String str = nkVar.f134467d;
                    Uri parse = Uri.parse(str);
                    if (C22481m.m41936e(parse)) {
                        Uri.Builder buildUpon = parse.buildUpon();
                        C22468ai.m41914b(buildUpon, nkVar);
                        Uri build = buildUpon.build();
                        intent = new Intent().setData(build).setPackage(build.getHost());
                    } else {
                        throw new IllegalArgumentException("Invalid timer id ".concat(String.valueOf(str)));
                    }
                } else if (C22481m.m41935d((PackageManager) aiVar.f62033c.mo27525b())) {
                    ((C59052c) ((C59052c) C22468ai.f62031a.mo56224b()).mo56372aa(48305)).mo56386p("Updating the timer using Google Clock app.");
                    Uri.Builder appendPath = C22481m.f62054a.buildUpon().appendPath("multi");
                    for (C51592nk nkVar2 : nmVar.f134477b) {
                        C22481m.m41933b(1 == (nkVar2.f134464a & 1));
                        Uri.Builder appendPath2 = Uri.parse("/timer").buildUpon().appendPath(Integer.toString(C22481m.m41932a(nkVar2.f134467d)));
                        C22468ai.m41914b(appendPath2, nkVar2);
                        appendPath.appendQueryParameter("action", appendPath2.build().toString());
                    }
                    if (nmVar.f134478c) {
                        if (!aiVar.f62035e.mo27802c()) {
                            appendPath = C22468ai.m41913a(nmVar, appendPath);
                        } else if (!aiVar.f62034d.isKeyguardLocked()) {
                            appendPath = C22468ai.m41913a(nmVar, appendPath);
                        }
                    }
                    Uri build2 = appendPath.build();
                    intent = new Intent().setData(build2).setPackage(build2.getHost());
                } else {
                    throw new C22534k();
                }
                if (!aiVar.f62032b.mo27807a(intent)) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, (String) null));
                }
                return C60856cj.m92900i(C22402a.f61893a);
            } else {
                throw new C22534k();
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
