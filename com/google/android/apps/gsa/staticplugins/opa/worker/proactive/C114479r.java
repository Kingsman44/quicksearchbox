package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.r */
/* compiled from: PG */
public final /* synthetic */ class C114479r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f317437a;

    public /* synthetic */ C114479r(String str) {
        this.f317437a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f317437a;
        C59104x c = C114496u.f317466a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ContextFenceReg");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(28963)).mo56389s("Register for fence key: %s failed.", str);
        return C58836b.f156633a;
    }
}
