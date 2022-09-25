package com.google.android.libraries.componentview.components.p1689c;

import android.widget.ImageView;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.componentview.components.c.dp */
/* compiled from: PG */
public final class C20277dp implements C20220bm {

    /* renamed from: a */
    public final ImageView f56914a;

    /* renamed from: b */
    private final String f56915b;

    /* renamed from: c */
    private final String f56916c;

    public C20277dp(ImageView imageView, String str, String str2) {
        this.f56914a = imageView;
        this.f56915b = str;
        this.f56916c = str2;
    }

    /* renamed from: b */
    public final int mo25296b() {
        if (this.f56914a.getVisibility() == 0) {
            return this.f56914a.getHeight();
        }
        return 0;
    }

    /* renamed from: c */
    public final C20219bl mo25297c(boolean z) {
        if (z) {
            this.f56914a.setContentDescription(this.f56915b);
        } else {
            this.f56914a.setContentDescription(this.f56916c);
        }
        this.f56914a.setRotation(true != z ? 0.0f : 180.0f);
        return new C20219bl(true, C58485gu.m89845m());
    }

    /* renamed from: d */
    public final C20228bu mo25298d(boolean z) {
        return new C20276do(this, z);
    }
}
