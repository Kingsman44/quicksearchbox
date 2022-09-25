package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.ab.bf */
/* compiled from: PG */
public final /* synthetic */ class C32391bf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32393bh f86822a;

    public /* synthetic */ C32391bf(C32393bh bhVar) {
        this.f86822a = bhVar;
    }

    public final C60870cx apply(Object obj) {
        C32393bh bhVar = this.f86822a;
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) obj).booleanValue()) {
            return bhVar.f86825b.mo38054a();
        }
        C59104x d = C32393bh.f86824a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TopContactSynclet");
        ((C59052c) ((C59052c) d).mo56372aa(52631)).mo56386p("Writing Top Contacts to TNG corpus failed.");
        return C60856cj.m92900i(false);
    }
}
