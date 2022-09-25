package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.accl.p7338h.C92847b;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22591r;
import com.google.assistant.p3897e.p3917i.p3918a.C51567mm;
import com.google.assistant.p3897e.p3917i.p3918a.C51568mn;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.aku;
import com.google.assistant.p3897e.p3921j.akz;
import com.google.assistant.p3897e.p3921j.alb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.cb */
/* compiled from: PG */
public final class C92979cb extends C22538o {

    /* renamed from: a */
    private final C68214a f259370a;

    /* renamed from: b */
    private final C92847b f259371b;

    /* renamed from: c */
    private final C86124t f259372c;

    public C92979cb(C68214a aVar, C92847b bVar, C86124t tVar) {
        this.f259370a = aVar;
        this.f259371b = bVar;
        this.f259372c = tVar;
    }

    /* renamed from: b */
    private final void m153023b(ClientEventData clientEventData) {
        C86775r rVar = ((C86610af) this.f259370a.mo27525b()).f233977l;
        if (rVar != null) {
            rVar.mo80387i(clientEventData);
        }
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        aku aku;
        if (!this.f259372c.mo79746e(C90014bt.f247088aZ)) {
            return C60856cj.m92900i(C22402a.f61894b);
        }
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        akz akz = (akz) m41992m(dwVar, "storybooks_perform_operation_args", akz.f135298c.getParserForType());
        int i = akz.f135300a;
        if (i == 2) {
            C51567mm mmVar = (C51567mm) C51568mn.f134404c.createBuilder();
            if (akz.f135300a == 2) {
                aku = (aku) akz.f135301b;
            } else {
                aku = aku.f135290b;
            }
            alb alb = aku.f135292a;
            if (alb == null) {
                alb = alb.f135306b;
            }
            mmVar.copyOnWrite();
            C51568mn mnVar = (C51568mn) mmVar.instance;
            alb.getClass();
            mnVar.f134407b = alb;
            mnVar.f134406a |= 1;
            C90498f i2 = this.f259371b.mo87472a(C52081en.f136679i, C22591r.m42062f().mo27676a()).mo84480i();
            i2.mo84573e(0, 65536);
            i2.mo84581m("android.opa.extra.STORYBOOKS_PARAMS", ((C51568mn) mmVar.build()).toByteArray());
            Query a = i2.mo84568a();
            C88489j jVar = new C88489j(C87739bu.QUERY_COMMIT);
            jVar.mo82015c(a);
            m153023b(jVar.mo82013a());
        } else if (i != 4 && i == 3) {
            m153023b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        }
        return C60856cj.m92900i(C22402a.f61894b);
    }
}
