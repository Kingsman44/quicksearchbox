package com.google.android.libraries.gsa.conversation.clientop.p1847g;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.g.b */
/* compiled from: PG */
public final class C22497b extends C22538o {

    /* renamed from: a */
    private final C22496a f62086a;

    public C22497b(C22496a aVar) {
        this.f62086a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("provider.OPEN")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return this.f62086a.mo27630a((ada) m41992m(dwVar, "open_provider_args", ada.f134865f.getParserForType()), eVar);
        }
        throw new C22428d(dyVar);
    }
}
