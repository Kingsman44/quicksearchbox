package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ba */
/* compiled from: PG */
public final class C92897ba extends C22538o {

    /* renamed from: a */
    private final C22720x f259157a;

    /* renamed from: b */
    private final C68214a f259158b;

    /* renamed from: c */
    private final C68214a f259159c;

    public C92897ba(C22720x xVar, C68214a aVar, C68214a aVar2) {
        this.f259157a = xVar;
        this.f259158b = aVar;
        this.f259159c = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_DEVICE_SETTING_CARD")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52131gj gjVar = (C52131gj) m41992m(dwVar, "show_device_setting_card_args", C52131gj.f136789h.getParserForType());
            boolean z = true;
            boolean z2 = ((((C58833ax) this.f259159c.mo27525b()).mo56113h() && ((C74713bn) ((C58833ax) this.f259159c.mo27525b()).mo56107c()).mo71077b()) || ((C86124t) this.f259158b.mo27525b()).mo79746e(C90014bt.f247307eg)) && (gjVar.f136791a & 16) != 0 && !gjVar.f136796f.isEmpty();
            boolean z3 = (gjVar.f136791a & 1) != 0 && !gjVar.f136792b.isEmpty();
            if ((gjVar.f136791a & 32) == 0 || gjVar.f136797g.isEmpty()) {
                z = false;
            }
            if ((z2 || z3 || z) && (gjVar.f136791a & 2) != 0 && !gjVar.f136793c.isEmpty()) {
                this.f259157a.mo27820i(dyVar, C58833ax.m90833j(eVar));
                return f62144n;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
