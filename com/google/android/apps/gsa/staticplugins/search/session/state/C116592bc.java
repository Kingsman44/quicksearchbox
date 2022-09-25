package com.google.android.apps.gsa.staticplugins.search.session.state;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bc */
/* compiled from: PG */
final class C116592bc implements C91007g {

    /* renamed from: a */
    public final Query f323337a;

    /* renamed from: b */
    public C58170d f323338b;

    /* renamed from: c */
    public C58170d f323339c;

    /* renamed from: d */
    public VoiceAction f323340d;

    /* renamed from: e */
    public boolean f323341e;

    public C116592bc(Query query) {
        this.f323337a = query;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo102785a() {
        if (!this.f323341e) {
            C59071e eVar = C116593bd.f323342a;
            C58976aa aaVar = C58975e.f156826a;
            this.f323341e = true;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ClockworkSearch");
        String str = "null";
        fVar.mo85279c("server clockwork result").mo85276a(C90752i.m148229c(this.f323338b == null ? str : "non-null"));
        fVar.mo85288o("current action", this.f323340d);
        C91005e c = fVar.mo85279c("action clockwork result");
        if (this.f323339c != null) {
            str = "non-null";
        }
        c.mo85276a(C90752i.m148229c(str));
    }

    public final String toString() {
        return String.format("ClockworkSearch{query=%s, serverResponse=%s, actionResponse=%s, actionForResponse=%s, isComplete=%b}", new Object[]{this.f323337a, this.f323338b, this.f323339c, this.f323340d, Boolean.valueOf(this.f323341e)});
    }
}
