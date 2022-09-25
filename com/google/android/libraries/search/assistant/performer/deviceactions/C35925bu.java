package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bu */
/* compiled from: PG */
public final /* synthetic */ class C35925bu implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35925bu f94081a = new C35925bu();

    private /* synthetic */ C35925bu() {
    }

    public final Object apply(Object obj) {
        C59104x c = C35928bx.f94084a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RequestPermissionPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(51857)).mo56386p("Failed to request permission for udc intent");
        return C36180b.m64578b(C52235kf.INTERNAL);
    }
}
