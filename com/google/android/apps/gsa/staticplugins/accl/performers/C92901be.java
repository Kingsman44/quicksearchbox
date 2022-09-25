package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60527te;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.grammar.pumpkin.C66520l;
import com.google.speech.grammar.pumpkin.C66521m;
import com.google.speech.grammar.pumpkin.C66524p;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.be */
/* compiled from: PG */
public final class C92901be extends C22538o {

    /* renamed from: a */
    private final C22720x f259173a;

    /* renamed from: b */
    private final b f259174b;

    public C92901be(C22720x xVar, b bVar) {
        this.f259173a = xVar;
        this.f259174b = bVar;
    }

    /* renamed from: b */
    private static C66521m m152952b(String str, String str2) {
        C66520l lVar = (C66520l) C66521m.f180919g.createBuilder();
        lVar.copyOnWrite();
        C66521m mVar = (C66521m) lVar.instance;
        mVar.f180921a |= 1;
        mVar.f180922b = str;
        lVar.copyOnWrite();
        C66521m mVar2 = (C66521m) lVar.instance;
        str2.getClass();
        mVar2.f180921a |= 16;
        mVar2.f180925e = str2;
        return (C66521m) lVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C51910dq dqVar = (C51910dq) m41992m(dwVar, "show_interpreter_args", C51910dq.f136159t.getParserForType());
        if (dqVar != null && dqVar.f136176p) {
            int i = dqVar.f136161a;
            if (!((i & 2) == 0 || (i & 4) == 0)) {
                String str = dqVar.f136163c;
                String str2 = dqVar.f136164d;
                C66524p pVar = (C66524p) C66525q.f180929f.createBuilder();
                pVar.copyOnWrite();
                C66525q qVar = (C66525q) pVar.instance;
                qVar.f180931a |= 2;
                qVar.f180932b = "ActivateInterpreter";
                pVar.mo59668a(m152952b("source_locale", str));
                pVar.mo59668a(m152952b("target_locale", str2));
                this.f259174b.e(new TaggerResult((C66525q) pVar.build(), C60527te.f163903c));
            }
        }
        return this.f259173a.mo27814b(dyVar, C58833ax.m90833j(eVar));
    }
}
