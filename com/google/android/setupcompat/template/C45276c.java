package com.google.android.setupcompat.template;

import android.content.Context;
import android.view.View;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.setupcompat.template.c */
/* compiled from: PG */
public final class C45276c {

    /* renamed from: a */
    public String f118280a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public View.OnClickListener f118281b = null;

    /* renamed from: c */
    public int f118282c = 0;

    /* renamed from: d */
    public int f118283d = 0;

    /* renamed from: e */
    private final Context f118284e;

    public C45276c(Context context) {
        this.f118284e = context;
    }

    /* renamed from: a */
    public final C45277d mo49180a() {
        return new C45277d(this.f118280a, this.f118281b, this.f118282c, this.f118283d);
    }

    /* renamed from: b */
    public final void mo49181b(int i) {
        this.f118280a = this.f118284e.getString(i);
    }
}
