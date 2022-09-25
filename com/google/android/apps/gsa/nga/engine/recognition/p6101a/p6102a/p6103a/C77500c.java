package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6102a.p6103a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C77500c implements C90919bp {

    /* renamed from: a */
    public static final /* synthetic */ C77500c f213554a = new C77500c();

    private /* synthetic */ C77500c() {
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58974d dVar = C77502e.f213556a;
        C37344ai a = C37344ai.m66353a(((C37348am) obj).f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        if (a == C37344ai.RELEASED) {
            ((C58970a) ((C58970a) C77502e.f213556a.mo56224b()).mo56372aa(4271)).mo56386p("Audio focus abandoned");
        } else {
            ((C58970a) ((C58970a) C77502e.f213556a.mo56224b()).mo56372aa(4270)).mo56389s("Failed abandoning audio focus. Status: %s", a.name());
        }
    }
}
