package com.google.android.libraries.search.assistant.proactive;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g */
/* compiled from: PG */
final class C36270g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C51805du f94745a;

    public C36270g(C51805du duVar) {
        this.f94745a = duVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C36306h.f94805a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(52212)).mo56386p("Failed to get WholeHomeConversationManager");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x b = C36306h.f94805a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
            ((C59052c) ((C59052c) b).mo56372aa(52214)).mo56386p("WholeHomeConversationManager is not supported in this AGSA build.");
            return;
        }
        C59104x b2 = C36306h.f94805a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
        ((C59052c) ((C59052c) b2).mo56372aa(52213)).mo56386p("WholeHomeConversationManager is ready");
        ((C36228ax) optional.get()).mo40043a(this.f94745a);
    }
}
