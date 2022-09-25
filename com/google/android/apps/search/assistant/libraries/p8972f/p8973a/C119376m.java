package com.google.android.apps.search.assistant.libraries.p8972f.p8973a;

import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.knowledge.p4671b.C61826s;

/* renamed from: com.google.android.apps.search.assistant.libraries.f.a.m */
/* compiled from: PG */
public final /* synthetic */ class C119376m implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C119376m f332811a = new C119376m();

    private /* synthetic */ C119376m() {
    }

    public final Object apply(Object obj) {
        C121053d dVar = (C121053d) obj;
        C61826s sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        if (dVar.equals(C121053d.ENABLED)) {
            sVar = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        } else if (dVar.equals(C121053d.DISABLED)) {
            sVar = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        ((C59052c) ((C59052c) C119380q.f332830a.mo56224b()).mo56372aa(34405)).mo56389s("Log AOL opt in status: %s.", sVar);
        return sVar;
    }
}
