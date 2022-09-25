package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.state.y */
/* compiled from: PG */
final class C87170y implements C91007g {

    /* renamed from: a */
    public final Map f235528a = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo80767a(VoiceAction voiceAction, int i) {
        Map map = this.f235528a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) && voiceAction != null) {
            this.f235528a.put(valueOf, voiceAction);
            return true;
        } else if (!this.f235528a.containsKey(valueOf) || voiceAction != null) {
            return false;
        } else {
            this.f235528a.remove(valueOf);
            return true;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ExtraCardsState");
        fVar.mo85288o("escape hatch card", (C90964a) this.f235528a.get(1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f235528a.containsKey(1)) {
            sb.append(" + ButtonCard");
        }
        return sb.toString();
    }
}
