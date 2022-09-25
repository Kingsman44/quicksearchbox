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

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.s */
/* compiled from: PG */
public final class C22487s extends C22538o {

    /* renamed from: a */
    private final C22486r f62063a;

    public C22487s(C22486r rVar) {
        this.f62063a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Intent intent;
        if (dyVar.f135936b.equals("timer.REMOVE_TIMER")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51594nm nmVar = (C51594nm) m41992m(dwVar, "timer_params", C51594nm.f134474f.getParserForType());
            C22486r rVar = this.f62063a;
            ((C59052c) ((C59052c) C22486r.f62060a.mo56224b()).mo56372aa(48301)).mo56386p("RemoveTimerPerformer");
            if (nmVar.f134477b.size() <= 0) {
                throw new C22534k();
            } else if (nmVar.f134477b.size() <= 1 || C22481m.m41934c(nmVar.f134477b)) {
                if (nmVar.f134477b.size() <= 1) {
                    ((C59052c) ((C59052c) C22486r.f62060a.mo56224b()).mo56372aa(48300)).mo56386p("Removing the timer using public Clock API.");
                    String str = ((C51592nk) nmVar.f134477b.get(0)).f134467d;
                    Uri parse = Uri.parse(str);
                    if (C22481m.m41936e(parse)) {
                        Uri build = parse.buildUpon().appendPath("delete").build();
                        intent = new Intent().setData(build).setPackage(build.getHost());
                    } else {
                        throw new IllegalArgumentException("Invalid timer id ".concat(String.valueOf(str)));
                    }
                } else if (C22481m.m41935d((PackageManager) rVar.f62062c.mo27525b())) {
                    ((C59052c) ((C59052c) C22486r.f62060a.mo56224b()).mo56372aa(48299)).mo56386p("Removing the timer using Google Clock app.");
                    Uri.Builder appendPath = C22481m.f62054a.buildUpon().appendPath("multi");
                    for (C51592nk nkVar : nmVar.f134477b) {
                        C22481m.m41933b(1 == (nkVar.f134464a & 1));
                        appendPath.appendQueryParameter("action", Uri.parse("/timer").buildUpon().appendPath(Integer.toString(C22481m.m41932a(nkVar.f134467d))).appendPath("delete").build().toString());
                    }
                    Uri build2 = appendPath.build();
                    intent = new Intent().setData(build2).setPackage(build2.getHost());
                } else {
                    throw new C22534k();
                }
                if (!rVar.f62061b.mo27807a(intent)) {
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
