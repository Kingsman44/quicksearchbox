package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aju;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bu */
/* compiled from: PG */
public final class C92918bu extends C22538o {

    /* renamed from: a */
    private final C22720x f259232a;

    public C92918bu(C22720x xVar) {
        this.f259232a = xVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_SLICE_CARD")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            aju aju = (aju) m41992m(dwVar, "show_slice_card_args", aju.f135238i.getParserForType());
            if (aju.f135241b.isEmpty() || aju.f135242c.isEmpty()) {
                throw new C22534k();
            }
            this.f259232a.mo27820i(dyVar, C58833ax.m90833j(eVar));
            return f62144n;
        }
        throw new C22428d(dyVar);
    }
}
