package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dm */
/* compiled from: PG */
final class C108640dm implements C83992d {

    /* renamed from: a */
    public final String f302177a;

    /* renamed from: b */
    final /* synthetic */ C108641dn f302178b;

    /* renamed from: c */
    private boolean f302179c;

    public C108640dm(C108641dn dnVar, String str) {
        this.f302178b = dnVar;
        this.f302177a = str;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo77436a() {
        return 1;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo77437b() {
        return 0;
    }

    /* renamed from: c */
    public final /* synthetic */ Drawable mo77438c() {
        return null;
    }

    /* renamed from: d */
    public final CharSequence mo77439d() {
        Locale u = C90772bp.m148313u(this.f302177a);
        u.getClass();
        String displayLanguage = u.getDisplayLanguage();
        String displayCountry = u.getDisplayCountry();
        return displayLanguage + " (" + displayCountry + ")";
    }

    /* renamed from: e */
    public final /* synthetic */ CharSequence mo77440e() {
        return null;
    }

    /* renamed from: f */
    public final void mo77441f(boolean z) {
        this.f302179c = z;
        this.f302178b.f302185g.setVisibility(0);
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo77442g() {
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo77443h() {
        return true;
    }

    /* renamed from: i */
    public final boolean mo77444i() {
        return this.f302179c;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo77445j() {
        return false;
    }
}
