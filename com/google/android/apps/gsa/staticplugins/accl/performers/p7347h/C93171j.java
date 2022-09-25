package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90882ap;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.assistant.p3897e.p3921j.aev;
import com.google.assistant.p3897e.p3921j.aex;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.j */
/* compiled from: PG */
final class C93171j extends C90882ap {

    /* renamed from: a */
    final /* synthetic */ aeu f259856a;

    /* renamed from: b */
    final /* synthetic */ C93173l f259857b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93171j(C93173l lVar, aeu aeu) {
        super("Populate active notifications into ClientOpResult", 0);
        this.f259857b = lVar;
        this.f259856a = aeu;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        if (this.f259856a.f134964d) {
            this.f259857b.f259865f.mo19974a(C37176a.f96818P.mo40805c(C62722b.OK));
            return C22402a.f61894b;
        }
        C93173l lVar = this.f259857b;
        if (list == null) {
            lVar.f259865f.mo19974a(C37176a.f96818P.mo40805c(C62722b.NOT_FOUND));
            return C93173l.m153240b("activeNotifications is null");
        }
        aev aev = (aev) aex.f134969f.createBuilder();
        aev.mo53685a(lVar.f259864e.mo77883a(list, lVar.f259863d.mo79746e(C90025cd.f248154l)));
        if (lVar.f259863d.mo79746e(C90025cd.f248167y)) {
            int e = lVar.mo87561e();
            aev.copyOnWrite();
            aex aex = (aex) aev.instance;
            aex.f134973c = e - 1;
            aex.f134971a |= 1;
            boolean d = lVar.mo87560d();
            aev.copyOnWrite();
            aex aex2 = (aex) aev.instance;
            aex2.f134971a |= 2;
            aex2.f134974d = d;
        }
        lVar.f259865f.mo19974a(C37176a.f96818P.mo40805c(C62722b.OK));
        return C22402a.m41821a("notification_fetch_result", "assistant.api.client_op.NotificationFetchResult", aev.build());
    }
}
