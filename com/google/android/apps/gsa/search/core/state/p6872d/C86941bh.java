package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86800o;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bh */
/* compiled from: PG */
public final class C86941bh extends C86898ct implements C86800o {

    /* renamed from: a */
    public final C68214a f234816a;

    /* renamed from: b */
    public final C84885a f234817b;

    /* renamed from: c */
    public final C85005h f234818c;

    /* renamed from: d */
    public C60870cx f234819d;

    /* renamed from: e */
    public C60870cx f234820e;

    /* renamed from: f */
    public C60870cx f234821f;

    /* renamed from: g */
    public C60870cx f234822g;

    /* renamed from: h */
    private final C86124t f234823h;

    /* renamed from: i */
    private final SharedPreferences f234824i;

    /* renamed from: j */
    private final C85232a f234825j;

    /* renamed from: k */
    private final C86127w f234826k;

    /* renamed from: l */
    private int f234827l = 0;

    public C86941bh(C68214a aVar, C68214a aVar2, C86124t tVar, SharedPreferences sharedPreferences, C86127w wVar, C84885a aVar3, C85005h hVar, C85232a aVar4) {
        super(aVar, 20);
        this.f234816a = aVar2;
        this.f234823h = tVar;
        this.f234824i = sharedPreferences;
        this.f234826k = wVar;
        this.f234817b = aVar3;
        this.f234818c = hVar;
        this.f234825j = aVar4;
    }

    /* renamed from: a */
    public final boolean mo80494a() {
        int i = this.f234824i.getInt("hands_free_hotword_retraining_notification_state", 1);
        int i2 = this.f234824i.getInt("trusted_voice_paused_notification_state", 1);
        int i3 = this.f234824i.getInt("opa_upgrade_promo_notification_state", 1);
        int i4 = this.f234824i.getInt("assistant_language_reconfiguring_notification_state", 1);
        C87739bu buVar = C87739bu.UNKNOWN;
        if (i == 2 || i2 == 2 || i3 == 2 || i4 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS};
    }

    /* renamed from: e */
    public final void mo80596e(C86948bo boVar) {
        int i = 1;
        if (!boVar.mo80603v()) {
            int i2 = this.f234826k.f232790a.mo79722a().getInt("trusted_voice_paused_notification_state", 1) != 2 ? 0 : 16;
            if (this.f234826k.f232790a.mo79722a().getInt("hands_free_hotword_retraining_notification_state", 1) == 2) {
                i2 |= 2;
            }
            if (this.f234826k.f232790a.mo79722a().getInt("opa_upgrade_promo_notification_state", 1) == 2) {
                i2 |= 32;
            }
            i = this.f234826k.f232790a.mo79722a().getInt("assistant_language_reconfiguring_notification_state", 1) == 2 ? i2 | 128 : i2;
        }
        if (i != this.f234827l) {
            this.f234827l = i;
            if (!boVar.f234850h) {
                this.f234825j.mo78819n(this.f234827l);
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NotificationState");
        fVar.mo85279c("mNotificationFlags").mo85276a(C90752i.m148233g(String.valueOf(Long.toHexString((long) this.f234827l))));
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        mo80596e((C86948bo) this.f234816a.mo27525b());
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"hands_free_hotword_retraining_notification_state", "trusted_voice_paused_notification_state", "opa_upgrade_promo_notification_state", "assistant_language_reconfiguring_notification_state"};
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 112 && this.f234823h.mo79746e(C90014bt.f247325ey)) {
            this.f234817b.mo78572p();
            mo80591ar();
        }
    }
}
