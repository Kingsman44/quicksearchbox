package com.google.android.apps.gsa.nga.engine.p6044n.p6054f.p6055a;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80147by;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88051ni;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88053nk;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.f.a.g */
/* compiled from: PG */
public final /* synthetic */ class C76462g implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C76462g f211634a = new C76462g();

    private /* synthetic */ C76462g() {
    }

    public final C60870cx apply(Object obj) {
        C80275dd ddVar;
        C80147by byVar;
        ServiceEventData serviceEventData = (ServiceEventData) obj;
        ((C58970a) ((C58970a) C76463h.f211635a.mo56224b()).mo56372aa(3563)).mo56389s("eventData = %s", serviceEventData.f236959a);
        C88053nk nkVar = (C88053nk) serviceEventData.mo81918e(C88051ni.f238089a);
        if (nkVar.f238092a == 1) {
            ddVar = (C80275dd) nkVar.f238093b;
        } else {
            ddVar = C80275dd.f220288c;
        }
        if (ddVar.f220290a != 1) {
            return C60856cj.m92900i(ddVar);
        }
        if (ddVar.f220290a == 1) {
            byVar = (C80147by) ddVar.f220291b;
        } else {
            byVar = C80147by.f219936c;
        }
        throw new RemoteException(byVar.f219939b);
    }
}
