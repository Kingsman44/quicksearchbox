package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.opa.p6435c.C83602n;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3745ab.C48273ca;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.f */
/* compiled from: PG */
public final /* synthetic */ class C93034f implements C22411a {

    /* renamed from: a */
    public final /* synthetic */ C93038j f259516a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f259517b;

    /* renamed from: c */
    public final /* synthetic */ C22871g f259518c;

    /* renamed from: d */
    public final /* synthetic */ C68214a f259519d;

    /* renamed from: e */
    public final /* synthetic */ int f259520e;

    /* renamed from: f */
    public final /* synthetic */ Optional f259521f;

    public /* synthetic */ C93034f(C93038j jVar, C86124t tVar, C22871g gVar, C68214a aVar, int i, Optional optional) {
        this.f259516a = jVar;
        this.f259517b = tVar;
        this.f259518c = gVar;
        this.f259519d = aVar;
        this.f259520e = i;
        this.f259521f = optional;
    }

    /* renamed from: a */
    public final void mo27600a(int i, C48273ca caVar) {
        C93038j jVar = this.f259516a;
        C86124t tVar = this.f259517b;
        C22871g gVar = this.f259518c;
        C68214a aVar = this.f259519d;
        int i2 = this.f259520e;
        Optional optional = this.f259521f;
        if (tVar.mo79746e(C90014bt.f247707mI)) {
            if (caVar != null) {
                caVar.toString();
            }
            C48273ca a = C83602n.m133181a(caVar, jVar.f259529d);
            int i3 = 0;
            if (!(caVar == null || a == null)) {
                i3 = (int) (a.f124855c - caVar.f124855c);
                caVar = a;
            }
            switch (i - 1) {
                case 0:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_START, caVar, jVar.f259528c, i3);
                    return;
                case 1:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CONNECT_TIMEOUT, caVar, jVar.f259528c, i3);
                    return;
                case 2:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_DIAL_START, caVar, jVar.f259528c, i3);
                    return;
                case 3:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_TIMEOUT, caVar, jVar.f259528c, i3);
                    return;
                case 4:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_END, caVar, jVar.f259528c, i3);
                    return;
                case 5:
                    if (tVar.mo79746e(C90086ek.f250324aw) && i2 == 5 && optional.isPresent()) {
                        ((C85700a) optional.get()).mo79322d(C89849ae.ASSISTANT_AUTO_START_ACTIVITY_INTENT);
                        return;
                    }
                    return;
                case 6:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_INTENT_FAILED, caVar, jVar.f259528c, i3);
                    return;
                case 7:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_STARTCALL_PERMISSION_DENIED, caVar, jVar.f259528c, i3);
                    return;
                case 8:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_PERMISSION_DENIED, caVar, jVar.f259528c, i3);
                    return;
                case 9:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_QUERY_SUCCESS, caVar, jVar.f259528c, i3);
                    return;
                default:
                    C93038j.m153106b(gVar, aVar, C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_QUERY_FAILURE, caVar, jVar.f259528c, i3);
                    return;
            }
        }
    }
}
