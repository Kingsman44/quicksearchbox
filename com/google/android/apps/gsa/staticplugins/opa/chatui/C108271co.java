package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.co */
/* compiled from: PG */
public final class C108271co extends C108232bc {

    /* renamed from: a */
    public final String f301218a;

    /* renamed from: b */
    public final String f301219b;

    /* renamed from: c */
    private final C68214a f301220c;

    public C108271co(String str, String str2, C68214a aVar) {
        super((byte[]) null);
        this.f301218a = str;
        this.f301219b = str2;
        this.f301220c = aVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 54014;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 13;
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
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        TextView textView = blVar.f301094u;
        if (textView != null && blVar.f301095v != null) {
            textView.setText(this.f301218a);
            blVar.f301095v.mo76738i(this.f301219b, (C91189au) this.f301220c.mo27525b());
        }
    }
}
