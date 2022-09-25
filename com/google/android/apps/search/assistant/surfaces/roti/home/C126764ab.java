package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ab */
/* compiled from: PG */
final class C126764ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37325aa f349100a;

    /* renamed from: b */
    final /* synthetic */ C126780ar f349101b;

    public C126764ab(C126780ar arVar, C37325aa aaVar) {
        this.f349101b = arVar;
        this.f349100a = aaVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f349101b.f349137p = this.f349100a;
        C59104x c = C126780ar.f349122a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConversationController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37144)).mo56386p("Can't release audio focus!");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C59071e eVar = C126780ar.f349122a;
        C58976aa aaVar = C58975e.f156826a;
        C37344ai a = C37344ai.m66353a(((C37348am) obj).f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        a.name();
    }
}
