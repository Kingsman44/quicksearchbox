package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.TextUtils;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hs */
/* compiled from: PG */
public final class C108411hs extends C108233bd {

    /* renamed from: d */
    public final String f301527d;

    /* renamed from: e */
    private final C91189au f301528e;

    public C108411hs(String str, C91189au auVar) {
        this.f301527d = str;
        this.f301528e = auVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 27634;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 7;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (!TextUtils.equals(this.f301527d, blVar.f301082i.mo76734e())) {
            blVar.f301083j.setVisibility(0);
            blVar.f301082i.setVisibility(8);
            WebImageView webImageView = blVar.f301082i;
            webImageView.f227358h = new C108410hr(blVar);
            webImageView.mo76738i(this.f301527d, this.f301528e);
            super.mo95832j(blVar, bhVar);
        }
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301082i.f227358h = null;
    }
}
