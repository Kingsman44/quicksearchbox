package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3921j.acr;
import com.google.assistant.p3897e.p3921j.acs;
import com.google.assistant.p3897e.p3921j.aev;
import com.google.assistant.p3897e.p3921j.aex;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.i */
/* compiled from: PG */
public final /* synthetic */ class C93170i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C93173l f259854a;

    /* renamed from: b */
    public final /* synthetic */ List f259855b;

    public /* synthetic */ C93170i(C93173l lVar, List list) {
        this.f259854a = lVar;
        this.f259855b = list;
    }

    public final Object apply(Object obj) {
        acs acs;
        C93173l lVar = this.f259854a;
        List list = this.f259855b;
        List list2 = (List) obj;
        if (list == null || list2 == null) {
            lVar.f259865f.mo19974a(C37176a.f96818P.mo40805c(C62722b.NOT_FOUND));
            return C93173l.m153240b("messageNotifications or standardNotifications is null");
        }
        aev aev = (aev) aex.f134969f.createBuilder();
        aev.mo53685a(lVar.f259864e.mo77883a(list, lVar.f259863d.mo79746e(C90025cd.f248154l)));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            StandardNotification standardNotification = (StandardNotification) list2.get(i);
            if (standardNotification == null) {
                acs = null;
            } else {
                acr acr = (acr) acs.f134843f.createBuilder();
                acr.copyOnWrite();
                acs acs2 = (acs) acr.instance;
                acs2.f134845a |= 1;
                acs2.f134846b = i;
                String str = standardNotification.f252581b;
                acr.copyOnWrite();
                acs acs3 = (acs) acr.instance;
                acs3.f134845a |= 8;
                acs3.f134849e = str;
                String str2 = standardNotification.f252591l;
                acr.copyOnWrite();
                acs acs4 = (acs) acr.instance;
                acs4.f134845a |= 4;
                acs4.f134848d = str2;
                C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
                long j = standardNotification.f252592m;
                ffVar.copyOnWrite();
                ((C63042fg) ffVar.instance).f170154a = j;
                acr.copyOnWrite();
                acs acs5 = (acs) acr.instance;
                C63042fg fgVar = (C63042fg) ffVar.build();
                fgVar.getClass();
                acs5.f134847c = fgVar;
                acs5.f134845a |= 2;
                acs = (acs) acr.build();
            }
            if (acs != null) {
                arrayList.add(acs);
            }
        }
        aev.copyOnWrite();
        aex aex = (aex) aev.instance;
        C62971cq cqVar = aex.f134975e;
        if (!cqVar.mo58948c()) {
            aex.f134975e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) aex.f134975e);
        if (lVar.f259863d.mo79746e(C90025cd.f248167y)) {
            int e = lVar.mo87561e();
            aev.copyOnWrite();
            aex aex2 = (aex) aev.instance;
            aex2.f134973c = e - 1;
            aex2.f134971a |= 1;
            boolean d = lVar.mo87560d();
            aev.copyOnWrite();
            aex aex3 = (aex) aev.instance;
            aex3.f134971a |= 2;
            aex3.f134974d = d;
        }
        lVar.f259865f.mo19974a(C37176a.f96818P.mo40805c(C62722b.OK));
        return C22402a.m41821a("notification_fetch_result", "assistant.api.client_op.NotificationFetchResult", aev.build());
    }
}
