package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.df */
/* compiled from: PG */
public final /* synthetic */ class C108289df implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301244a;

    /* renamed from: b */
    public final /* synthetic */ int f301245b;

    /* renamed from: c */
    public final /* synthetic */ int f301246c;

    public /* synthetic */ C108289df(C108303dt dtVar, int i, int i2) {
        this.f301244a = dtVar;
        this.f301245b = i;
        this.f301246c = i2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C108303dt dtVar = this.f301244a;
        int i = this.f301245b;
        int i2 = this.f301246c;
        C59104x d = C108303dt.f301260a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HistoryManager");
        ((C59052c) ((C59052c) d).mo56372aa(23977)).mo56359L("#loadItemsToCache(%d -> %d): failed - %s", Integer.valueOf(i), Integer.valueOf(i2 - 1), ((Exception) obj).getLocalizedMessage());
        while (i < i2) {
            dtVar.f301281l.remove(Integer.valueOf(i));
            i++;
        }
    }
}
