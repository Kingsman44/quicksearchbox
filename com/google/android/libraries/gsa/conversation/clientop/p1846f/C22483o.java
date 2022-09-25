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
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.o */
/* compiled from: PG */
public final class C22483o extends C22538o {

    /* renamed from: a */
    private final C22482n f62057a;

    public C22483o(C22482n nVar) {
        this.f62057a = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Uri.Builder builder;
        if (dyVar.f135936b.equals("alarm.REMOVE_ALARM")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51527l lVar = (C51527l) m41992m(dwVar, "alarm_params", C51527l.f134273f.getParserForType());
            C22482n nVar = this.f62057a;
            boolean z = false;
            C22482n.m41937a(lVar.f134276b.size() > 0);
            if (lVar.f134276b.size() == 1) {
                C51473j jVar = (C51473j) lVar.f134276b.get(0);
                if (1 == (jVar.f134092a & 1)) {
                    z = true;
                }
                C22482n.m41937a(z);
                builder = Uri.parse(jVar.f134095d).buildUpon().appendPath("delete");
            } else {
                Uri.Builder appendPath = C22482n.f62055a.buildUpon().appendPath("multi");
                for (C51473j jVar2 : lVar.f134276b) {
                    C22482n.m41937a(1 == (jVar2.f134092a & 1));
                    List<String> pathSegments = Uri.parse(jVar2.f134095d).getPathSegments();
                    if (pathSegments.size() > 1) {
                        appendPath.appendQueryParameter("action", Uri.parse("/alarm").buildUpon().appendPath(pathSegments.get(1)).appendPath("delete").build().toString());
                    }
                }
                builder = appendPath;
            }
            Uri build = builder.build();
            if (!nVar.f62056b.mo27807a(new Intent().setAction("android.intent.action.VIEW").setData(build).setPackage(build.getHost()))) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "fails to start activity"));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        throw new C22428d(dyVar);
    }
}
