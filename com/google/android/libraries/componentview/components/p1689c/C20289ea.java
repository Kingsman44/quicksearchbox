package com.google.android.libraries.componentview.components.p1689c;

import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.componentview.components.c.ea */
/* compiled from: PG */
public final class C20289ea implements C20228bu {

    /* renamed from: a */
    private final boolean f56996a;

    /* renamed from: b */
    private final ImageView f56997b;

    /* renamed from: c */
    private final TextView f56998c;

    /* renamed from: d */
    private final String f56999d;

    /* renamed from: e */
    private final String f57000e;

    /* renamed from: f */
    private boolean f57001f = false;

    public C20289ea(boolean z, ImageView imageView, TextView textView, String str, String str2) {
        this.f56996a = z;
        this.f56997b = imageView;
        this.f56998c = textView;
        this.f56999d = str;
        this.f57000e = str2;
    }

    /* renamed from: a */
    public final void mo25304a() {
    }

    /* renamed from: b */
    public final void mo25305b() {
        this.f57001f = !this.f56996a;
    }

    /* renamed from: c */
    public final void mo25306c(float f) {
        if (!this.f56996a) {
            f = 1.0f - f;
        }
        this.f56997b.setRotation(-180.0f * f);
        if (this.f56998c != null && !this.f56999d.equals(this.f57000e)) {
            if (this.f57001f) {
                if (f < 0.5f) {
                    this.f56998c.setText(this.f56999d);
                }
            } else if (f > 0.5f) {
                this.f56998c.setText(this.f57000e);
            }
            TextView textView = this.f56998c;
            float abs = Math.abs(0.5f - f);
            textView.setAlpha(abs + abs);
        }
    }

    /* renamed from: d */
    public final void mo25307d() {
    }
}
