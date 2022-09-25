package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.assistant.settings.shared.ab;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3929l.p3930a.C52684aq;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.e */
/* compiled from: PG */
public final class C93069e extends C22538o {

    /* renamed from: a */
    private final C68214a f259608a;

    /* renamed from: b */
    private final aa f259609b;

    /* renamed from: c */
    private final ae f259610c;

    /* renamed from: d */
    private final C68214a f259611d;

    /* renamed from: e */
    private final C68214a f259612e;

    /* renamed from: f */
    private final C68214a f259613f;

    public C93069e(C68214a aVar, ab abVar, ae aeVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f259608a = aVar;
        this.f259609b = abVar.a(aeVar.c(), false);
        this.f259610c = aeVar;
        this.f259611d = aVar2;
        this.f259612e = aVar3;
        this.f259613f = aVar4;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("configuration.PROCESS_SETTINGS")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            String str = ((C52684aq) m41992m(dwVar, "process_settings_args", C52684aq.f138284b.getParserForType())).f138286a;
            if (!str.isEmpty() && (!((C90021c) this.f259613f.mo27525b()).mo79746e(C90044cw.f248725D) || !((C90021c) this.f259613f.mo27525b()).mo79746e(C90014bt.f247174cF) ? this.f259609b.g(str) : aa.h(str, (C90021c) this.f259613f.mo27525b()))) {
                String g = C58837ba.m90858g(((C86054o) this.f259608a.mo27525b()).mo79659F());
                if (((C89994f) this.f259612e.mo27525b()).mo83848K() && !str.equals(this.f259610c.d(g).toLanguageTag())) {
                    ((C84559s) this.f259611d.mo27525b()).mo78312c(str, EventForDump.m147676e(3, "OPA primary assistant language change " + str + " by client op."));
                }
                this.f259610c.f(C58837ba.m90858g(((C86054o) this.f259608a.mo27525b()).mo79659F()), Locale.forLanguageTag(str));
            }
            return f62144n;
        }
        throw new C22428d(dyVar);
    }
}
