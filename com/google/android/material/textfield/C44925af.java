package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.graphics.C1924a;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.textfield.af */
/* compiled from: PG */
final class C44925af extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ C44926ag f117367a;

    /* renamed from: b */
    private final ColorStateList f117368b;

    /* renamed from: c */
    private final ColorStateList f117369c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44925af(C44926ag agVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        ColorStateList colorStateList;
        this.f117367a = agVar;
        ColorStateList colorStateList2 = null;
        if (!m79824b()) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{agVar.f117373d.getColorForState(iArr, 0), 0});
        }
        this.f117369c = colorStateList;
        if (m79823a() && m79824b()) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C1924a.m5188g(agVar.f117373d.getColorForState(iArr3, 0), agVar.f117372c), C1924a.m5188g(agVar.f117373d.getColorForState(iArr2, 0), agVar.f117372c), agVar.f117372c});
        }
        this.f117368b = colorStateList2;
    }

    /* renamed from: a */
    private final boolean m79823a() {
        return this.f117367a.f117372c != 0;
    }

    /* renamed from: b */
    private final boolean m79824b() {
        return this.f117367a.f117373d != null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            RippleDrawable rippleDrawable = null;
            if (this.f117367a.getText().toString().contentEquals(textView.getText()) && m79823a()) {
                ColorDrawable colorDrawable = new ColorDrawable(this.f117367a.f117372c);
                if (this.f117369c != null) {
                    C1929b.m5226g(colorDrawable, this.f117368b);
                    rippleDrawable = new RippleDrawable(this.f117369c, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            C2043bi.m5530X(textView, rippleDrawable);
        }
        return view2;
    }
}
