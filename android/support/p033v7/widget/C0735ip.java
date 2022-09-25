package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.C1882h;

/* renamed from: android.support.v7.widget.ip */
/* compiled from: PG */
public final class C0735ip {

    /* renamed from: a */
    public final Context f2595a;

    /* renamed from: b */
    public final TypedArray f2596b;

    /* renamed from: c */
    public TypedValue f2597c;

    private C0735ip(Context context, TypedArray typedArray) {
        this.f2595a = context;
        this.f2596b = typedArray;
    }

    /* renamed from: d */
    public static C0735ip m2471d(Context context, int i, int[] iArr) {
        return new C0735ip(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: e */
    public static C0735ip m2472e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0735ip(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: f */
    public static C0735ip m2473f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0735ip(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public final ColorStateList mo3245a(int i) {
        int resourceId;
        ColorStateList d;
        if (!this.f2596b.hasValue(i) || (resourceId = this.f2596b.getResourceId(i, 0)) == 0 || (d = C1882h.m5138d(this.f2595a, resourceId)) == null) {
            return this.f2596b.getColorStateList(i);
        }
        return d;
    }

    /* renamed from: b */
    public final Drawable mo3246b(int i) {
        int resourceId;
        if (!this.f2596b.hasValue(i) || (resourceId = this.f2596b.getResourceId(i, 0)) == 0) {
            return this.f2596b.getDrawable(i);
        }
        return C0678gm.m2375e().mo3100c(this.f2595a, resourceId);
    }

    /* renamed from: c */
    public final Drawable mo3247c(int i) {
        int resourceId;
        if (!this.f2596b.hasValue(i) || (resourceId = this.f2596b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0506ad.m1895d().mo2479g(this.f2595a, resourceId);
    }

    /* renamed from: g */
    public final float mo3248g(int i) {
        return this.f2596b.getDimension(i, -1.0f);
    }
}
