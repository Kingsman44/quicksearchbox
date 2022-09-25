package com.google.android.setupdesign.p3555d;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.C45280g;
import com.google.android.setupdesign.C45318g;

/* renamed from: com.google.android.setupdesign.d.a */
/* compiled from: PG */
public final class C45293a implements C45280g {

    /* renamed from: a */
    public final TemplateLayout f118337a;

    public C45293a(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        this.f118337a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, C45318g.f118385d, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            mo49221b(text);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (!(colorStateList == null || (a = mo49220a()) == null)) {
            a.setTextColor(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final TextView mo49220a() {
        return (TextView) this.f118337a.mo49127h(R.id.sud_layout_subtitle);
    }

    /* renamed from: b */
    public final void mo49221b(CharSequence charSequence) {
        TextView a = mo49220a();
        if (a != null) {
            a.setText(charSequence);
            mo49222c();
        }
    }

    /* renamed from: c */
    public final void mo49222c() {
        TextView a = mo49220a();
        if (a != null) {
            a.setVisibility(0);
        }
    }
}
