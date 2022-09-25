package com.google.android.libraries.gsa.conversation.clientop.p1848h;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.h.j */
/* compiled from: PG */
public final class C22520j extends C22538o {

    /* renamed from: a */
    private final C22519i f62120a;

    public C22520j(C22519i iVar) {
        this.f62120a = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_TEXT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C22519i iVar = this.f62120a;
            if ((((C52003hb) m41992m(dwVar, "show_text_args", C52003hb.f136476i.getParserForType())).f136478a & 1) != 0) {
                iVar.f62119a.mo27827s();
                return C22538o.f62144n;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
