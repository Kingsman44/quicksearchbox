package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.p */
/* compiled from: PG */
public final class C91940p {

    /* renamed from: a */
    public final ContextThemeWrapper f256405a;

    /* renamed from: b */
    public final LayoutInflater f256406b;

    /* renamed from: c */
    public int f256407c;

    /* renamed from: d */
    private final boolean f256408d;

    /* renamed from: e */
    private boolean f256409e = false;

    /* renamed from: f */
    private final boolean f256410f;

    public C91940p(Context context, boolean z, boolean z2) {
        this.f256410f = z;
        this.f256408d = z2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m150862b());
        this.f256405a = contextThemeWrapper;
        this.f256406b = LayoutInflater.from(contextThemeWrapper);
    }

    /* renamed from: b */
    private final int m150862b() {
        int i = this.f256409e ? true != this.f256408d ? 2132150854 : 2132150735 : this.f256410f ? true != this.f256408d ? 2132150857 : 2132150737 : true != this.f256408d ? 2132150856 : 2132150736;
        this.f256407c = i;
        return i;
    }

    /* renamed from: a */
    public final void mo86640a(boolean z) {
        this.f256409e = z;
        this.f256405a.setTheme(m150862b());
    }
}
