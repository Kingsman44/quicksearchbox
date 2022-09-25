package android.support.p033v7.widget;

import android.content.Context;
import android.support.p033v7.app.C0339a;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.iy */
/* compiled from: PG */
public final class C0744iy extends C0339a {

    /* renamed from: b */
    int f2607b = 0;

    public C0744iy() {
        this.f1134a = 8388627;
    }

    public C0744iy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0744iy(C0339a aVar) {
        super(aVar);
    }

    public C0744iy(C0744iy iyVar) {
        super((C0339a) iyVar);
        this.f2607b = iyVar.f2607b;
    }

    public C0744iy(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0744iy(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
