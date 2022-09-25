package com.google.android.apps.gsa.searchplate;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.searchplate.q */
/* compiled from: PG */
public final class C88954q extends FrameLayout {

    /* renamed from: a */
    public final int f240987a = 150;

    /* renamed from: b */
    public final int f240988b = 300;

    /* renamed from: c */
    public final int f240989c = 300;

    /* renamed from: d */
    public final int f240990d = 300;

    /* renamed from: e */
    public String[] f240991e;

    /* renamed from: f */
    public TextPaint f240992f;

    /* renamed from: g */
    public C88913ao f240993g;

    public C88954q(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final StaticLayout mo82844a(CharSequence charSequence, boolean z) {
        return new StaticLayout(charSequence, this.f240992f, (int) this.f240992f.measureText(charSequence, 0, charSequence.length()), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, z);
    }

    /* renamed from: b */
    public final C88912an mo82845b(String str, boolean z) {
        return new C88912an(getContext(), mo82844a(str, z), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo82846c() {
        C88913ao aoVar = this.f240993g;
        if (aoVar != null) {
            aoVar.f240866b.mo82723h();
        }
    }
}
