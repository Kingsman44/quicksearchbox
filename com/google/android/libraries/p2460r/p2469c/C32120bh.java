package com.google.android.libraries.p2460r.p2469c;

import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32051a;

/* renamed from: com.google.android.libraries.r.c.bh */
/* compiled from: PG */
public final class C32120bh implements C32051a {

    /* renamed from: a */
    final /* synthetic */ C32121bi f86248a;

    /* renamed from: b */
    private final TextView f86249b;

    /* renamed from: c */
    private final C32117be f86250c;

    public C32120bh(C32121bi biVar, TextView textView, C32117be beVar) {
        this.f86248a = biVar;
        this.f86249b = textView;
        this.f86250c = beVar;
    }

    /* renamed from: b */
    public final void mo37836a(Typeface typeface) {
        if (typeface == null) {
            this.f86250c.mo37919a();
            this.f86248a.mo37924q(this.f86249b, this.f86250c);
        } else if (this.f86249b.getTypeface() == null || !this.f86249b.getTypeface().equals(typeface)) {
            this.f86249b.setTypeface(typeface);
        }
    }
}
