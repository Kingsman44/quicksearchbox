package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bd */
/* compiled from: PG */
public abstract class C108233bd extends C108232bc {

    /* renamed from: a */
    public String f301045a;

    /* renamed from: b */
    public C91189au f301046b;

    /* renamed from: c */
    public int f301047c = 1;

    public C108233bd() {
        super((byte[]) null);
    }

    /* renamed from: e */
    private static final float m179817e(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 1) {
            return i2 != 2 ? 0.5f : 0.0f;
        } else {
            return 1.0f;
        }
    }

    /* renamed from: b */
    public final void mo96611b(boolean z) {
        mo96612c(true != z ? 3 : 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo96612c(int i) {
        if (this.f301047c != i) {
            this.f301047c = i;
            C108241bl m = mo96603m();
            if (m != null) {
                m.mo96689e(m179817e(this.f301047c));
            }
        }
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return null;
    }

    /* renamed from: j */
    public void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (blVar.f301086m != null) {
            LogoView logoView = blVar.f301075b;
            if (!(logoView == null || logoView.f63000g.f63060j == 10)) {
                logoView.mo28225e(10, false);
            }
            blVar.mo96689e(m179817e(this.f301047c));
            if (!TextUtils.isEmpty(this.f301045a)) {
                blVar.f301086m.mo76738i(this.f301045a, this.f301046b);
                blVar.f301086m.setVisibility(0);
                blVar.f301075b.setVisibility(8);
                return;
            }
            blVar.f301086m.mo76738i(BuildConfig.FLAVOR, this.f301046b);
            blVar.f301086m.setVisibility(8);
            blVar.f301075b.setVisibility(0);
        }
    }
}
