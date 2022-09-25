package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m */
/* compiled from: PG */
public final /* synthetic */ class C123895m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342216a;

    /* renamed from: b */
    public final /* synthetic */ List f342217b;

    public /* synthetic */ C123895m(C123904v vVar, List list) {
        this.f342216a = vVar;
        this.f342217b = list;
    }

    public final Object call() {
        C123904v vVar = this.f342216a;
        List list = this.f342217b;
        C59104x b = C123904v.f342237a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
        ((C59052c) ((C59052c) b).mo56372aa(35337)).mo56386p("Reminders are updated.");
        if (list.isEmpty()) {
            return null;
        }
        C59104x b2 = C123904v.f342237a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
        ((C59052c) ((C59052c) b2).mo56372aa(35338)).mo56386p("updating validity controller");
        if (!vVar.f342246j.isPresent()) {
            return null;
        }
        ((C124167p) vVar.f342246j.get()).mo106310d(C58485gu.m89842j(list));
        return null;
    }
}
