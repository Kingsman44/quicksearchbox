package com.google.android.libraries.componentview.components.p1689c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.componentview.components.c.dk */
/* compiled from: PG */
public final class C20272dk implements C20303eo {

    /* renamed from: a */
    private final View f56892a;

    /* renamed from: b */
    private final boolean f56893b;

    /* renamed from: c */
    private ViewGroup.MarginLayoutParams f56894c;

    /* renamed from: d */
    private int f56895d;

    /* renamed from: e */
    private int f56896e;

    /* renamed from: f */
    private int f56897f;

    /* renamed from: g */
    private Rect f56898g;

    public C20272dk(View view, boolean z) {
        this.f56892a = view;
        this.f56893b = z;
    }

    /* renamed from: a */
    public final void mo25304a() {
        this.f56894c.topMargin = this.f56895d;
        this.f56894c.bottomMargin = this.f56896e;
        C2043bi.m5547aa(this.f56892a, (Rect) null);
        if (!this.f56893b) {
            this.f56892a.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo25305b() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f56892a.getLayoutParams();
        this.f56894c = marginLayoutParams;
        this.f56895d = marginLayoutParams.topMargin;
        this.f56896e = this.f56894c.bottomMargin;
        this.f56897f = this.f56892a.getHeight() + this.f56895d + this.f56896e;
        this.f56898g = new Rect(0, 0, this.f56892a.getWidth(), this.f56892a.getHeight());
        if (this.f56893b) {
            mo25306c(0.0f);
        }
    }

    /* renamed from: c */
    public final void mo25306c(float f) {
        if (!this.f56893b) {
            f = 1.0f - f;
        }
        int i = (int) (((float) this.f56897f) * f);
        this.f56898g.bottom = Math.max(0, Math.min(this.f56892a.getHeight(), i - this.f56895d));
        C2043bi.m5547aa(this.f56892a, this.f56898g);
        this.f56894c.bottomMargin = i - (this.f56897f - this.f56896e);
        this.f56892a.requestLayout();
    }

    /* renamed from: d */
    public final void mo25307d() {
        if (this.f56893b) {
            this.f56892a.setVisibility(0);
        }
    }

    /* renamed from: e */
    public final float mo25317e() {
        return (float) this.f56892a.getHeight();
    }

    /* renamed from: f */
    public final boolean mo25318f() {
        return this.f56893b;
    }
}
