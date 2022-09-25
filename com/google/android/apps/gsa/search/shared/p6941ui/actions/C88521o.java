package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.o */
/* compiled from: PG */
public final class C88521o {

    /* renamed from: a */
    public CharSequence f239244a;

    /* renamed from: b */
    public boolean f239245b;

    /* renamed from: c */
    public boolean f239246c;

    /* renamed from: d */
    public boolean f239247d;

    /* renamed from: e */
    public boolean f239248e;

    /* renamed from: f */
    public TextView f239249f;

    /* renamed from: a */
    public final boolean mo82137a(boolean z) {
        boolean z2 = this.f239246c != z;
        this.f239248e |= z2;
        this.f239246c = z;
        if (!z) {
            this.f239247d = false;
        }
        return z2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f239244a);
        boolean z = this.f239245b;
        boolean z2 = this.f239246c;
        boolean z3 = this.f239247d;
        boolean z4 = this.f239248e;
        return "VoiceOfGooglePresenter[text=" + valueOf + ", speaking=" + z + ", shouldShow=" + z2 + ", shouldRedeal=" + z3 + ", changed=" + z4 + "]";
    }
}
