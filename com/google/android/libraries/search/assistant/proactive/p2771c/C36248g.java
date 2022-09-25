package com.google.android.libraries.search.assistant.proactive.p2771c;

import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36982a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.g */
/* compiled from: PG */
public final /* synthetic */ class C36248g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36250i f94688a;

    public /* synthetic */ C36248g(C36250i iVar) {
        this.f94688a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C51300cp cpVar;
        C121053d dVar = (C121053d) obj;
        C36991j jVar = this.f94688a.f94693c;
        C36982a aVar = new C36982a();
        aVar.mo40512d(C51313db.OPA);
        aVar.mo40516h(C51333dv.UNKNOWN_USER_CREDENTIAL_STATUS);
        ((C59052c) ((C59052c) C36250i.f94690a.mo56224b()).mo56372aa(52275)).mo56389s("AssistantOnLockscreen: %s", dVar);
        C121053d dVar2 = C121053d.STANDBY_UNSPECIFIED;
        int ordinal = dVar.ordinal();
        if (ordinal == 1) {
            cpVar = C51300cp.ASSISTANT_ON_LOCKSCREEN_DISALLOWED;
        } else if (ordinal != 2) {
            cpVar = C51300cp.UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN;
        } else {
            cpVar = C51300cp.ASSISTANT_ON_LOCKSCREEN_ALLOWED;
        }
        aVar.mo40510b(cpVar);
        aVar.mo40513e(C51319dh.DEFAULT);
        aVar.mo40515g(C51331dt.TRUSTED);
        aVar.mo40514f();
        aVar.mo40511c(C39226b.TAG_ASSISTANT_AMBIENT);
        return jVar.mo40520a(aVar.mo40509a());
    }
}
