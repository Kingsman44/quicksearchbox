package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86789d;
import com.google.android.apps.gsa.search.core.state.p6864a.C86801p;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98635r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.s */
/* compiled from: PG */
public final class C86967s extends C86898ct implements C86789d {

    /* renamed from: a */
    private final SharedPreferences f234901a;

    /* renamed from: b */
    private final C84624a f234902b;

    /* renamed from: c */
    private final C86801p f234903c;

    public C86967s(C68214a aVar, SharedPreferences sharedPreferences, C84624a aVar2, C86801p pVar) {
        super(aVar, 16);
        this.f234901a = sharedPreferences;
        this.f234902b = aVar2;
        this.f234903c = pVar;
    }

    /* renamed from: a */
    public final void mo80441a(C98635r rVar) {
        this.f234903c.mo80496c(C58833ax.m90833j(rVar));
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT};
    }

    /* renamed from: b */
    public final boolean mo80442b() {
        return this.f234901a.getBoolean("use_custom_tabs", true);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT) {
            C58838bb.m90884s(clientEventData.mo81913d(Intent.class), "BROWSABLE_INTENT_LAUNCHED_IN_CLIENT should have an intent parcelable.");
            Intent intent = (Intent) clientEventData.mo81912b(Intent.class);
            if (intent != null) {
                this.f234902b.mo78393m(intent);
            }
        }
    }
}
