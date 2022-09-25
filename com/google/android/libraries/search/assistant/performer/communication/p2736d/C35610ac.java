package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C35610ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35617aj f93455a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93456b;

    public /* synthetic */ C35610ac(C35617aj ajVar, boolean z) {
        this.f93455a = ajVar;
        this.f93456b = z;
    }

    public final Object apply(Object obj) {
        C35617aj ajVar = this.f93455a;
        boolean z = this.f93456b;
        Void voidR = (Void) obj;
        C59104x b = C35616ai.f93468a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ReadExecutor");
        ((C59052c) ((C59052c) b).mo56372aa(51751)).mo56386p("#getResultFor, read succeeded");
        ajVar.mo21078c(C62722b.OK);
        return z ? C36180b.f94545b : C36180b.f94544a;
    }
}
