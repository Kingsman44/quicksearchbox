package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4514b.C58170d;

/* renamed from: com.google.android.apps.gsa.search.core.state.bv */
/* compiled from: PG */
final class C86853bv implements C91007g {

    /* renamed from: a */
    public final Query f234564a;

    /* renamed from: b */
    public C58170d f234565b;

    /* renamed from: c */
    public C58170d f234566c;

    /* renamed from: d */
    public VoiceAction f234567d;

    /* renamed from: e */
    public boolean f234568e;

    public C86853bv(Query query) {
        this.f234564a = query;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80536a() {
        if (!this.f234568e) {
            C59071e eVar = C86854bw.f234569a;
            C58976aa aaVar = C58975e.f156826a;
            this.f234568e = true;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ClockworkSearch");
        String str = "null";
        fVar.mo85279c("server clockwork result").mo85276a(C90752i.m148229c(this.f234565b == null ? str : "non-null"));
        fVar.mo85288o("current action", this.f234567d);
        C91005e c = fVar.mo85279c("action clockwork result");
        if (this.f234566c != null) {
            str = "non-null";
        }
        c.mo85276a(C90752i.m148229c(str));
    }

    public final String toString() {
        return String.format("ClockworkSearch{query=%s, serverResponse=%s, actionResponse=%s, actionForResponse=%s, isComplete=%b}", new Object[]{this.f234564a, this.f234565b, this.f234566c, this.f234567d, Boolean.valueOf(this.f234568e)});
    }
}
