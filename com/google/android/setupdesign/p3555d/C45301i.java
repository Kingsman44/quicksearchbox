package com.google.android.setupdesign.p3555d;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.C45280g;
import com.google.android.setupdesign.C45318g;

/* renamed from: com.google.android.setupdesign.d.i */
/* compiled from: PG */
public final class C45301i implements C45280g {

    /* renamed from: a */
    public final TemplateLayout f118356a;

    /* renamed from: b */
    public final boolean f118357b;

    /* renamed from: c */
    private ColorStateList f118358c;

    public C45301i(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.f118356a = templateLayout;
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, C45318g.f118395n, i, 0);
            boolean z2 = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getBoolean(0, false) : false;
            obtainStyledAttributes.recycle();
            mo49235c(false);
            z = z2;
        }
        this.f118357b = z;
    }

    /* renamed from: a */
    public final ProgressBar mo49233a() {
        return (ProgressBar) this.f118356a.mo49127h(true != this.f118357b ? R.id.sud_layout_progress : R.id.sud_glif_progress_bar);
    }

    /* renamed from: b */
    public final void mo49234b(ColorStateList colorStateList) {
        this.f118358c = colorStateList;
        ProgressBar a = mo49233a();
        if (a != null) {
            a.setIndeterminateTintList(colorStateList);
            a.setProgressBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: c */
    public final void mo49235c(boolean z) {
        if (z) {
            if (mo49233a() == null && !this.f118357b) {
                ViewStub viewStub = (ViewStub) this.f118356a.mo49127h(R.id.sud_layout_progress_stub);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                mo49234b(this.f118358c);
            }
            ProgressBar a = mo49233a();
            if (a != null) {
                a.setVisibility(0);
                return;
            }
            return;
        }
        ProgressBar a2 = mo49233a();
        if (a2 != null) {
            a2.setVisibility(true != this.f118357b ? 8 : 4);
        }
    }
}
