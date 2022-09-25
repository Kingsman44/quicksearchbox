package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6519al.p6528ad.C84639a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.u */
/* compiled from: PG */
public final class C86969u extends C86898ct {

    /* renamed from: a */
    private boolean f234904a;

    /* renamed from: b */
    private final C84639a f234905b;

    /* renamed from: c */
    private final C86124t f234906c;

    /* renamed from: d */
    private final SharedPreferences f234907d;

    /* renamed from: e */
    private final C68214a f234908e;

    public C86969u(C68214a aVar, C84639a aVar2, SharedPreferences sharedPreferences, C68214a aVar3, C86124t tVar) {
        super(aVar, 22);
        this.f234908e = aVar3;
        this.f234905b = aVar2;
        this.f234907d = sharedPreferences;
        this.f234906c = tVar;
    }

    /* renamed from: e */
    public final void mo80614e() {
        boolean z = false;
        if (this.f234906c.mo79746e(C90120fr.f250795aH) && this.f234907d.getBoolean("shake_to_send_feedback_enabled", false) && (((SharedPreferences) this.f234908e.mo27525b()).getBoolean(C90507o.f253013c, false) || this.f234907d.getBoolean("force_feedback_consent_form", false))) {
            z = true;
        }
        if (this.f234904a != z) {
            this.f234904a = z;
            this.f234905b.mo78397c(z);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("DebugState");
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        mo80614e();
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"shake_to_send_feedback_enabled", C90507o.f253013c};
    }
}
