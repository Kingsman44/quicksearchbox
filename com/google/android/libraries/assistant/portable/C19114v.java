package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18217au;
import com.google.android.libraries.assistant.gallium.p1503a.p1504a.C18191b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.portable.v */
/* compiled from: PG */
public final /* synthetic */ class C19114v implements C18191b {

    /* renamed from: a */
    public final /* synthetic */ C18217au f53577a;

    public /* synthetic */ C19114v(C18217au auVar) {
        this.f53577a = auVar;
    }

    /* renamed from: a */
    public final void mo23652a(Throwable th) {
        C18217au auVar = this.f53577a;
        C59071e eVar = PortableAssistant.f53431a;
        if (th instanceof CancellationException) {
            C59104x b = PortableAssistant.f53431a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "POP");
            ((C59052c) ((C59052c) b).mo56372aa(47531)).mo56386p("PortableAssistant request cancelled.");
        } else {
            C59104x c = PortableAssistant.f53431a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "POP");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(47530)).mo56386p("PortableAssistant request fail.");
        }
        auVar.close();
    }
}
