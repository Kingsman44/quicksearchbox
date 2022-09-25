package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7148ui.C90706r;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.z */
/* compiled from: PG */
final class C87652z extends C90706r {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236912a;

    public C87652z(C87625ad adVar) {
        this.f236912a = adVar;
    }

    /* renamed from: a */
    public final void mo81846a() {
        this.f236912a.mo81820p(false);
    }

    /* renamed from: b */
    public final void mo81847b(int i, int i2) {
        C87625ad adVar = this.f236912a;
        if (adVar.mo81806am() && TextUtils.isEmpty(adVar.f236844au.mo84352bk())) {
            if (i > 0) {
                adVar.f236786P.mo82423h();
            }
            if (i2 > 0 && i >= i2) {
                adVar.f236786P.mo82424i();
            }
        }
        int i3 = this.f253738b;
        if (i > i3 || (i3 != 0 && i < i3)) {
            mo81846a();
        }
        this.f253738b = i;
    }

    /* renamed from: c */
    public final void mo81848c() {
        this.f236912a.mo81820p(true);
    }
}
