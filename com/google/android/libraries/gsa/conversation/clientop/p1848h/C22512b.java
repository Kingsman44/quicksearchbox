package com.google.android.libraries.gsa.conversation.clientop.p1848h;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.h.b */
/* compiled from: PG */
public final class C22512b extends C22538o {

    /* renamed from: a */
    private final C22511a f62112a;

    public C22512b(C22511a aVar) {
        this.f62112a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_RENDERED_CARD")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C22511a aVar = this.f62112a;
            if ((((C51965fr) m41992m(dwVar, "show_rendered_card_args", C51965fr.f136369d.getParserForType())).f136371a & 1) != 0) {
                aVar.f62111a.mo27825q();
                return C22538o.f62144n;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
