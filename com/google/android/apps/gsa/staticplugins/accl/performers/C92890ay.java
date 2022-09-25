package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.agj;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ay */
/* compiled from: PG */
public final class C92890ay extends C22538o {

    /* renamed from: a */
    private final C22720x f259150a;

    public C92890ay(C22720x xVar) {
        this.f259150a = xVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_APP_WIDGET")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            if (!((agj) m41992m(dwVar, "show_app_widget_args", agj.f135054g.getParserForType())).f135057b.isEmpty()) {
                return this.f259150a.mo27814b(dyVar, C58833ax.m90833j(eVar));
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
