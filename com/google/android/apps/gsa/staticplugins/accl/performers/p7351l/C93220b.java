package com.google.android.apps.gsa.staticplugins.accl.performers.p7351l;

import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10038a.C132026a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51827ao;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.l.b */
/* compiled from: PG */
public final class C93220b extends C22538o {

    /* renamed from: a */
    public final C132026a f259967a;

    /* renamed from: b */
    private final C86034c f259968b;

    public C93220b(C132026a aVar, C86034c cVar) {
        this.f259967a = aVar;
        this.f259968b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ("ui.SHOW_DEBUG_INFO".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return C60922j.m93045h(C60838bs.m92859i(this.f259968b.mo79697b()), new C93219a(this, (C51827ao) m41992m(dwVar, "show_debug_info_args", C51827ao.f135971a.getParserForType())), C60826bg.f164896a);
        }
        throw new C22428d(dyVar);
    }
}
