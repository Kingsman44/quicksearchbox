package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.bj */
/* compiled from: PG */
public final class C113685bj implements View.OnClickListener {

    /* renamed from: a */
    private final Runnable f314880a;

    /* renamed from: b */
    private Long f314881b;

    /* renamed from: c */
    private final C21370a f314882c;

    public C113685bj(C21370a aVar, Runnable runnable) {
        this.f314882c = aVar;
        this.f314880a = runnable;
    }

    public final void onClick(View view) {
        long j;
        Long l;
        C21370a aVar = this.f314882c;
        if (aVar == null) {
            j = 0;
        } else {
            j = aVar.mo26870b();
        }
        if (this.f314882c == null || (l = this.f314881b) == null || j - l.longValue() > 300) {
            this.f314880a.run();
            this.f314881b = Long.valueOf(j);
        }
    }
}
