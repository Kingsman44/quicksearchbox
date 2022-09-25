package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.proactive.ay */
/* compiled from: PG */
public final /* synthetic */ class C36229ay implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36240bh f94639a;

    public /* synthetic */ C36229ay(C36240bh bhVar) {
        this.f94639a = bhVar;
    }

    public final C60870cx apply(Object obj) {
        C36240bh bhVar = this.f94639a;
        C119834cb cbVar = (C119834cb) obj;
        if (cbVar.f333767a.isEmpty()) {
            return C60856cj.m92899h(new InternalError("Interaction Id from Conversation API is empty."));
        }
        bhVar.f94657g.add(cbVar);
        C59104x b = C36240bh.f94651a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52259)).mo56389s("Current interaction id = %s", cbVar.f333767a);
        return C60866ct.f164955a;
    }
}
