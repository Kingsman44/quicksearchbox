package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6102a.p6103a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77498a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77502e f213552a;

    public /* synthetic */ C77498a(C77502e eVar) {
        this.f213552a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C77502e eVar = this.f213552a;
        C37341af a = C37341af.m66350a(((C37338ac) obj).f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        if (a == C37341af.ACQUIRED) {
            eVar.f213557b.mo72197h();
            ((C58970a) ((C58970a) C77502e.f213556a.mo56224b()).mo56372aa(4274)).mo56386p("Audio focus acquired");
            return;
        }
        ((C58970a) ((C58970a) C77502e.f213556a.mo56224b()).mo56372aa(4273)).mo56389s("Failed acquiring audio focus. Status: %s", a.name());
    }
}
