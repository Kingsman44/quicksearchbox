package com.google.android.apps.gsa.sidekick.shared.cards;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.libraries.p1730f.C21385h;
import com.google.android.libraries.p1730f.p1731a.C21378h;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.af */
/* compiled from: PG */
public final class C91677af {

    /* renamed from: a */
    private final long f255669a;

    /* renamed from: b */
    private C21385h f255670b;

    /* renamed from: c */
    private final C21378h f255671c;

    public C91677af(C21378h hVar, long j) {
        this.f255671c = hVar;
        this.f255669a = j;
    }

    /* renamed from: a */
    public final void mo86154a(TextView textView) {
        mo86155b();
        C91676ae aeVar = new C91676ae(this, textView);
        this.f255670b = aeVar;
        this.f255671c.mo26881h(aeVar);
    }

    /* renamed from: b */
    public final void mo86155b() {
        C21385h hVar = this.f255670b;
        if (hVar != null) {
            this.f255671c.mo26883j(hVar);
            this.f255670b = null;
        }
    }

    /* renamed from: c */
    public final void mo86156c(TextView textView) {
        long currentTimeMillis = System.currentTimeMillis() - this.f255669a;
        String str = null;
        if (currentTimeMillis > 180000 && currentTimeMillis < 7776000000L) {
            str = C89407a.m145425h(textView.getContext(), currentTimeMillis);
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }
}
