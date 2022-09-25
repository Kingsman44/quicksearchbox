package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.h */
/* compiled from: PG */
public final class C4275h extends ViewGroup.LayoutParams {

    /* renamed from: a */
    public boolean f13853a;

    /* renamed from: b */
    public int f13854b;

    /* renamed from: c */
    float f13855c = 0.0f;

    /* renamed from: d */
    boolean f13856d;

    /* renamed from: e */
    int f13857e;

    /* renamed from: f */
    int f13858f;

    public C4275h() {
        super(-1, -1);
    }

    public C4275h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f13784a);
        this.f13854b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
