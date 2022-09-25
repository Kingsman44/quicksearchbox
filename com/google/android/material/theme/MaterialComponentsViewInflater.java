package com.google.android.material.theme;

import android.content.Context;
import android.support.p033v7.app.AppCompatViewInflater;
import android.support.p033v7.widget.AppCompatButton;
import android.support.p033v7.widget.AppCompatCheckBox;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.C0516an;
import android.support.p033v7.widget.C0778x;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.p3511h.C44689a;
import com.google.android.material.textfield.C44926ag;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0778x mo1111a(Context context, AttributeSet attributeSet) {
        return new C44926ag(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AppCompatButton mo1112b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AppCompatCheckBox mo1113c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C0516an mo1114d(Context context, AttributeSet attributeSet) {
        return new C44689a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AppCompatTextView mo1115e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
