package android.support.p033v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.a */
/* compiled from: PG */
public class C0339a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f1134a = 8388627;

    public C0339a() {
        super(-2, -2);
    }

    public C0339a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338a.f1066b);
        this.f1134a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0339a(C0339a aVar) {
        super(aVar);
        this.f1134a = aVar.f1134a;
    }

    public C0339a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
