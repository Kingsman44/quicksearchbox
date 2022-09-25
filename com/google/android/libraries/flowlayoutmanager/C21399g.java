package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.C0654fp;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.flowlayoutmanager.g */
/* compiled from: PG */
public final class C21399g extends C0654fp {

    /* renamed from: a */
    public final int f59842a;

    /* renamed from: b */
    public final int f59843b;

    /* renamed from: g */
    public int f59844g;

    /* renamed from: h */
    public int f59845h;

    /* renamed from: i */
    public int f59846i;

    /* renamed from: j */
    public float f59847j;

    /* renamed from: k */
    public int f59848k;

    /* renamed from: l */
    public int f59849l;

    /* renamed from: m */
    public int f59850m;

    /* renamed from: n */
    public int f59851n;

    /* renamed from: o */
    public int f59852o;

    /* renamed from: p */
    public int f59853p;

    /* renamed from: q */
    public int f59854q;

    /* renamed from: r */
    public int f59855r;

    /* renamed from: s */
    public int f59856s;

    /* renamed from: t */
    public int f59857t;

    /* renamed from: u */
    public int f59858u;

    /* renamed from: v */
    public int f59859v;

    /* renamed from: w */
    public int f59860w;

    /* renamed from: x */
    public int f59861x;

    /* renamed from: y */
    public int f59862y;

    /* renamed from: z */
    public int f59863z;

    public C21399g() {
        super(-2, -2);
        this.f59844g = 0;
        this.f59845h = 0;
        this.f59846i = 0;
        this.f59847j = 0.0f;
        this.f59848k = 0;
        this.f59849l = Integer.MAX_VALUE;
        this.f59850m = Integer.MAX_VALUE;
        this.f59851n = Integer.MAX_VALUE;
        this.f59852o = Integer.MAX_VALUE;
        this.f59853p = Integer.MAX_VALUE;
        this.f59854q = Integer.MAX_VALUE;
        this.f59855r = 0;
        this.f59856s = 0;
        this.f59857t = 0;
        this.f59858u = 0;
        this.f59859v = 0;
        this.f59860w = 0;
        this.f59861x = -1;
        this.f59862y = -1;
        this.f59863z = 0;
        this.f59842a = -2;
        this.f59843b = -2;
    }

    /* renamed from: h */
    public static final int m40490h(String str, int i, float f, boolean z) {
        if (!C21393a.m40475b(i)) {
            return i;
        }
        if (z && i < 0) {
            return i;
        }
        if (!Float.isNaN(f)) {
            return (int) (f * Float.intBitsToFloat(i));
        }
        throw new IllegalArgumentException(str.concat(" uses grid-based measurement, which is disabled"));
    }

    /* renamed from: i */
    private static int m40491i(TypedArray typedArray, String str, int i, int i2) {
        if (typedArray.hasValue(i) || i2 == Integer.MAX_VALUE) {
            return C21393a.m40474a(typedArray, str, i, true);
        }
        if (i2 >= -2 && i2 <= 16777215) {
            return i2;
        }
        String positionDescription = typedArray.getPositionDescription();
        throw new IllegalArgumentException(positionDescription + ": out-of-range dimension length for " + str);
    }

    /* renamed from: j */
    private static int m40492j(TypedArray typedArray, String str, int i, int i2) {
        return typedArray.hasValue(i) ? C21393a.m40474a(typedArray, str, i, false) : i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo26901a(float f) {
        int i = this.f59852o;
        if (i == Integer.MAX_VALUE) {
            return this.bottomMargin;
        }
        return m40490h("layout_flmMarginBottom", i, f, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo26902b() {
        if (this.f59842a == -1 || this.f59856s != 0) {
            return 2;
        }
        return this.f59863z & 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo26903c(float f) {
        return m40490h("layout_flmFlowHeight", this.f59862y, f, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo26904d(float f) {
        return m40490h("layout_flmFlowInsetBottom", this.f59860w, f, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo26905e(float f) {
        return m40490h("layout_flmFlowInsetTop", this.f59857t, f, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo26906f(float f) {
        int i = this.f59849l;
        if (i == Integer.MAX_VALUE) {
            return this.topMargin;
        }
        return m40490h("layout_flmMarginTop", i, f, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo26907g() {
        return mo26902b() == 2 && (this.f59863z & 12) == 8;
    }

    /* access modifiers changed from: protected */
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, Integer.MAX_VALUE);
        this.height = typedArray.getLayoutDimension(i2, Integer.MAX_VALUE);
    }

    public C21399g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59844g = 0;
        this.f59845h = 0;
        this.f59846i = 0;
        this.f59847j = 0.0f;
        this.f59848k = 0;
        this.f59849l = Integer.MAX_VALUE;
        this.f59850m = Integer.MAX_VALUE;
        this.f59851n = Integer.MAX_VALUE;
        this.f59852o = Integer.MAX_VALUE;
        this.f59853p = Integer.MAX_VALUE;
        this.f59854q = Integer.MAX_VALUE;
        this.f59855r = 0;
        this.f59856s = 0;
        this.f59857t = 0;
        this.f59858u = 0;
        this.f59859v = 0;
        this.f59860w = 0;
        this.f59861x = -1;
        this.f59862y = -1;
        this.f59863z = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21406n.f59881b);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.style.FlowLayoutManager_Layout_Default);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C21406n.f59880a, 0, resourceId);
        this.f59842a = m40491i(obtainStyledAttributes2, "layout_flmWidth", 22, this.width);
        this.f59843b = m40491i(obtainStyledAttributes2, "layout_flmHeight", 11, this.height);
        this.f59844g = obtainStyledAttributes2.getDimensionPixelOffset(9, 0);
        this.f59845h = obtainStyledAttributes2.getDimensionPixelOffset(8, 0);
        this.f59846i = obtainStyledAttributes2.getDimensionPixelSize(20, 0);
        this.f59847j = obtainStyledAttributes2.getFloat(7, 0.0f);
        this.f59848k = obtainStyledAttributes2.getDimensionPixelSize(10, 0);
        int a = C21393a.m40474a(obtainStyledAttributes2, "layout_flmMargin", 13, false);
        this.f59849l = m40492j(obtainStyledAttributes2, "layout_flmMarginTop", 18, a);
        this.f59850m = m40492j(obtainStyledAttributes2, "layout_flmMarginStart", 17, a);
        this.f59851n = m40492j(obtainStyledAttributes2, "layout_flmMarginEnd", 16, a);
        this.f59852o = m40492j(obtainStyledAttributes2, "layout_flmMarginBottom", 14, a);
        this.f59853p = C21393a.m40474a(obtainStyledAttributes2, "layout_flmMarginTopForFirstLine", 19, false);
        this.f59854q = C21393a.m40474a(obtainStyledAttributes2, "layout_flmMarginBottomForLastLine", 15, false);
        this.f59855r = obtainStyledAttributes2.getInteger(21, 0);
        this.f59856s = obtainStyledAttributes2.getInteger(0, 0);
        this.f59857t = C21393a.m40474a(obtainStyledAttributes2, "layout_flmFlowInsetTop", 5, false);
        this.f59858u = C21393a.m40474a(obtainStyledAttributes2, "layout_flmFlowInsetStart", 4, false);
        this.f59859v = C21393a.m40474a(obtainStyledAttributes2, "layout_flmFlowInsetEnd", 3, false);
        this.f59860w = C21393a.m40474a(obtainStyledAttributes2, "layout_flmFlowInsetBottom", 2, false);
        this.f59861x = C21393a.m40474a(obtainStyledAttributes2, "layout_flmFlowWidth", 6, true);
        this.f59862y = C21393a.m40474a(obtainStyledAttributes2, "layout_flmFlowHeight", 1, true);
        this.f59863z = obtainStyledAttributes2.getInteger(12, 0);
        obtainStyledAttributes2.recycle();
    }

    public C21399g(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f59844g = 0;
        this.f59845h = 0;
        this.f59846i = 0;
        this.f59847j = 0.0f;
        this.f59848k = 0;
        this.f59849l = Integer.MAX_VALUE;
        this.f59850m = Integer.MAX_VALUE;
        this.f59851n = Integer.MAX_VALUE;
        this.f59852o = Integer.MAX_VALUE;
        this.f59853p = Integer.MAX_VALUE;
        this.f59854q = Integer.MAX_VALUE;
        this.f59855r = 0;
        this.f59856s = 0;
        this.f59857t = 0;
        this.f59858u = 0;
        this.f59859v = 0;
        this.f59860w = 0;
        this.f59861x = -1;
        this.f59862y = -1;
        this.f59863z = 0;
        this.f59842a = this.width;
        this.f59843b = this.height;
    }

    public C21399g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f59844g = 0;
        this.f59845h = 0;
        this.f59846i = 0;
        this.f59847j = 0.0f;
        this.f59848k = 0;
        this.f59849l = Integer.MAX_VALUE;
        this.f59850m = Integer.MAX_VALUE;
        this.f59851n = Integer.MAX_VALUE;
        this.f59852o = Integer.MAX_VALUE;
        this.f59853p = Integer.MAX_VALUE;
        this.f59854q = Integer.MAX_VALUE;
        this.f59855r = 0;
        this.f59856s = 0;
        this.f59857t = 0;
        this.f59858u = 0;
        this.f59859v = 0;
        this.f59860w = 0;
        this.f59861x = -1;
        this.f59862y = -1;
        this.f59863z = 0;
        this.f59842a = this.width;
        this.f59843b = this.height;
    }

    public C21399g(C21399g gVar) {
        super((ViewGroup.MarginLayoutParams) gVar);
        this.f59844g = 0;
        this.f59845h = 0;
        this.f59846i = 0;
        this.f59847j = 0.0f;
        this.f59848k = 0;
        this.f59849l = Integer.MAX_VALUE;
        this.f59850m = Integer.MAX_VALUE;
        this.f59851n = Integer.MAX_VALUE;
        this.f59852o = Integer.MAX_VALUE;
        this.f59853p = Integer.MAX_VALUE;
        this.f59854q = Integer.MAX_VALUE;
        this.f59855r = 0;
        this.f59856s = 0;
        this.f59857t = 0;
        this.f59858u = 0;
        this.f59859v = 0;
        this.f59860w = 0;
        this.f59861x = -1;
        this.f59862y = -1;
        this.f59863z = 0;
        this.f59842a = gVar.f59842a;
        this.f59843b = gVar.f59843b;
        this.f59846i = gVar.f59846i;
        this.f59844g = gVar.f59844g;
        this.f59845h = gVar.f59845h;
        this.f59847j = gVar.f59847j;
        this.f59848k = gVar.f59848k;
        this.f59849l = gVar.f59849l;
        this.f59850m = gVar.f59850m;
        this.f59851n = gVar.f59851n;
        this.f59852o = gVar.f59852o;
        this.f59853p = gVar.f59853p;
        this.f59854q = gVar.f59854q;
        this.f59855r = gVar.f59855r;
        this.f59856s = gVar.f59856s;
        this.f59857t = gVar.f59857t;
        this.f59858u = gVar.f59858u;
        this.f59859v = gVar.f59859v;
        this.f59860w = gVar.f59860w;
        this.f59861x = gVar.f59861x;
        this.f59862y = gVar.f59862y;
        this.f59863z = gVar.f59863z;
    }
}
