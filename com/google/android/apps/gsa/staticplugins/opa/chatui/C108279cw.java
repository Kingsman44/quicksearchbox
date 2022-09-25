package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cw */
/* compiled from: PG */
public final /* synthetic */ class C108279cw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301231a;

    /* renamed from: b */
    public final /* synthetic */ String f301232b;

    public /* synthetic */ C108279cw(C108303dt dtVar, String str) {
        this.f301231a = dtVar;
        this.f301232b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C108303dt dtVar = this.f301231a;
        String str = this.f301232b;
        C59104x c = C108303dt.f301260a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HistoryManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(23982)).mo56389s("#save: failure for eventId = %s", str);
        dtVar.mo96756s();
    }
}
