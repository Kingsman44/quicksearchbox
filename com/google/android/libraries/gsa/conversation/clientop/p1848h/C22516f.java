package com.google.android.libraries.gsa.conversation.clientop.p1848h;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.h.f */
/* compiled from: PG */
public final class C22516f extends C22538o {

    /* renamed from: a */
    private final C22515e f62116a;

    public C22516f(C22515e eVar) {
        this.f62116a = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_SUGGESTIONS")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C22515e eVar2 = this.f62116a;
            if (!((C51986gl) m41992m(dwVar, "show_suggestions_args", C51986gl.f136421f.getParserForType())).f136424b.isEmpty()) {
                eVar2.f62115a.mo27826r();
                return C22538o.f62144n;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
