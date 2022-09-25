package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.y */
/* compiled from: PG */
final class C116835y implements C91007g {

    /* renamed from: a */
    public final Map f324216a = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo102970a(VoiceAction voiceAction, int i) {
        Map map = this.f324216a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) && voiceAction != null) {
            this.f324216a.put(valueOf, voiceAction);
            return true;
        } else if (!this.f324216a.containsKey(valueOf) || voiceAction != null) {
            return false;
        } else {
            this.f324216a.remove(valueOf);
            return true;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ExtraCardsState");
        fVar.mo85288o("escape hatch card", (C90964a) this.f324216a.get(1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f324216a.containsKey(1)) {
            sb.append(" + ButtonCard");
        }
        return sb.toString();
    }
}
