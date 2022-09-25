package com.google.android.apps.gsa.assist;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assist.bs */
/* compiled from: PG */
final class C9378bs extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C9397cb f32538a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9378bs(C9397cb cbVar) {
        super("WAKE_LOCK_RELEASER", 2, 0);
        this.f32538a = cbVar;
    }

    public final void run() {
        C59071e eVar = C9397cb.f32567a;
        C58976aa aaVar = C58975e.f156826a;
        this.f32538a.setKeepAwake(false);
    }
}
