package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p033v7.p034a.C0338a;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.p091b.C1874w;
import androidx.core.p097i.C1974i;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p101c.C2062a;
import androidx.core.widget.C2133t;
import androidx.core.widget.C2135v;
import androidx.core.widget.C2137x;
import androidx.core.widget.C2139z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.bm */
/* compiled from: PG */
final class C0543bm {

    /* renamed from: a */
    public C0733in f2113a;

    /* renamed from: b */
    public int f2114b = 0;

    /* renamed from: c */
    public Typeface f2115c;

    /* renamed from: d */
    public boolean f2116d;

    /* renamed from: e */
    private final TextView f2117e;

    /* renamed from: f */
    private C0733in f2118f;

    /* renamed from: g */
    private C0733in f2119g;

    /* renamed from: h */
    private C0733in f2120h;

    /* renamed from: i */
    private C0733in f2121i;

    /* renamed from: j */
    private C0733in f2122j;

    /* renamed from: k */
    private C0733in f2123k;

    /* renamed from: l */
    private final C0547bq f2124l;

    /* renamed from: m */
    private int f2125m = -1;

    public C0543bm(TextView textView) {
        this.f2117e = textView;
        this.f2124l = new C0547bq(textView);
    }

    /* renamed from: e */
    static final void m1987e(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (Build.VERSION.SDK_INT < 30) {
                text.getClass();
                if (Build.VERSION.SDK_INT >= 30) {
                    editorInfo.setInitialSurroundingSubText(text, 0);
                    return;
                }
                if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                    i = editorInfo.initialSelEnd;
                } else {
                    i = editorInfo.initialSelStart;
                }
                if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                    i2 = editorInfo.initialSelStart;
                } else {
                    i2 = editorInfo.initialSelEnd;
                }
                int length = text.length();
                if (i < 0 || i2 > length) {
                    C2062a.m5646a(editorInfo, (CharSequence) null, 0, 0);
                    return;
                }
                int i3 = editorInfo.inputType & 4095;
                if (i3 == 129 || i3 == 225 || i3 == 18) {
                    C2062a.m5646a(editorInfo, (CharSequence) null, 0, 0);
                } else if (length > 2048) {
                    int i4 = i2 - i;
                    int i5 = i4 > 1024 ? 0 : i4;
                    int i6 = 2048 - i5;
                    double d = (double) i6;
                    Double.isNaN(d);
                    int min = Math.min(text.length() - i2, i6 - Math.min(i, (int) (d * 0.8d)));
                    int min2 = Math.min(i, i6 - min);
                    int i7 = i - min2;
                    if (C2062a.m5647b(text, i7, 0)) {
                        i7++;
                        min2--;
                    }
                    if (C2062a.m5647b(text, (i2 + min) - 1, 1)) {
                        min--;
                    }
                    int i8 = min2 + i5;
                    int i9 = i8 + min;
                    if (i5 != i4) {
                        charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2)});
                    } else {
                        charSequence = text.subSequence(i7, i9 + i7);
                    }
                    C2062a.m5646a(editorInfo, charSequence, min2, i8);
                } else {
                    C2062a.m5646a(editorInfo, text, i, i2);
                }
            } else {
                editorInfo.setInitialSurroundingSubText(text, 0);
            }
        }
    }

    /* renamed from: f */
    private static C0733in m1988f(Context context, C0506ad adVar, int i) {
        ColorStateList a = adVar.mo2476a(context, i);
        if (a == null) {
            return null;
        }
        C0733in inVar = new C0733in();
        inVar.f2594d = true;
        inVar.f2591a = a;
        return inVar;
    }

    /* renamed from: g */
    private final void m1989g(Drawable drawable, C0733in inVar) {
        if (drawable != null && inVar != null) {
            C0678gm.m2376h(drawable, inVar, this.f2117e.getDrawableState());
        }
    }

    /* renamed from: h */
    private final void m1990h(Context context, C0735ip ipVar) {
        String string;
        int[] iArr = C0338a.f1065a;
        this.f2114b = ipVar.f2596b.getInt(2, this.f2114b);
        int i = ipVar.f2596b.getInt(11, -1);
        this.f2125m = i;
        if (i != -1) {
            this.f2114b &= 2;
        }
        int i2 = 10;
        boolean z = false;
        if (ipVar.f2596b.hasValue(10) || ipVar.f2596b.hasValue(12)) {
            Typeface typeface = null;
            this.f2115c = null;
            if (true == ipVar.f2596b.hasValue(12)) {
                i2 = 12;
            }
            int i3 = this.f2125m;
            int i4 = this.f2114b;
            if (!context.isRestricted()) {
                C0537bg bgVar = new C0537bg(this, i3, i4, new WeakReference(this.f2117e));
                try {
                    int i5 = this.f2114b;
                    int resourceId = ipVar.f2596b.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (ipVar.f2597c == null) {
                            ipVar.f2597c = new TypedValue();
                        }
                        typeface = C1874w.m5108e(ipVar.f2595a, resourceId, ipVar.f2597c, i5, bgVar);
                    }
                    if (typeface != null) {
                        if (this.f2125m != -1) {
                            this.f2115c = C0542bl.m1986a(Typeface.create(typeface, 0), this.f2125m, (this.f2114b & 2) != 0);
                        } else {
                            this.f2115c = typeface;
                        }
                    }
                    this.f2116d = this.f2115c == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2115c == null && (string = ipVar.f2596b.getString(i2)) != null) {
                if (this.f2125m != -1) {
                    Typeface create = Typeface.create(string, 0);
                    int i6 = this.f2125m;
                    if ((this.f2114b & 2) != 0) {
                        z = true;
                    }
                    this.f2115c = C0542bl.m1986a(create, i6, z);
                    return;
                }
                this.f2115c = Typeface.create(string, this.f2114b);
            }
        } else if (ipVar.f2596b.hasValue(1)) {
            this.f2116d = false;
            int i7 = ipVar.f2596b.getInt(1, 1);
            if (i7 == 1) {
                this.f2115c = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.f2115c = Typeface.SERIF;
            } else if (i7 == 3) {
                this.f2115c = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2569a() {
        if (!(this.f2118f == null && this.f2119g == null && this.f2120h == null && this.f2121i == null)) {
            Drawable[] compoundDrawables = this.f2117e.getCompoundDrawables();
            m1989g(compoundDrawables[0], this.f2118f);
            m1989g(compoundDrawables[1], this.f2119g);
            m1989g(compoundDrawables[2], this.f2120h);
            m1989g(compoundDrawables[3], this.f2121i);
        }
        if (this.f2122j != null || this.f2123k != null) {
            Drawable[] c = C0539bi.m1979c(this.f2117e);
            m1989g(c[0], this.f2122j);
            m1989g(c[2], this.f2123k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2570b(AttributeSet attributeSet, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i;
        Context context = this.f2117e.getContext();
        C0506ad d = C0506ad.m1895d();
        C0735ip f = C0735ip.m2473f(context, attributeSet2, C0338a.f1072h, i5, 0);
        TextView textView = this.f2117e;
        C2043bi.m5525S(textView, textView.getContext(), C0338a.f1072h, attributeSet, f.f2596b, i, 0);
        int resourceId2 = f.f2596b.getResourceId(0, -1);
        if (f.f2596b.hasValue(3)) {
            this.f2118f = m1988f(context, d, f.f2596b.getResourceId(3, 0));
        }
        if (f.f2596b.hasValue(1)) {
            this.f2119g = m1988f(context, d, f.f2596b.getResourceId(1, 0));
        }
        if (f.f2596b.hasValue(4)) {
            this.f2120h = m1988f(context, d, f.f2596b.getResourceId(4, 0));
        }
        if (f.f2596b.hasValue(2)) {
            this.f2121i = m1988f(context, d, f.f2596b.getResourceId(2, 0));
        }
        if (f.f2596b.hasValue(5)) {
            this.f2122j = m1988f(context, d, f.f2596b.getResourceId(5, 0));
        }
        if (f.f2596b.hasValue(6)) {
            this.f2123k = m1988f(context, d, f.f2596b.getResourceId(6, 0));
        }
        f.f2596b.recycle();
        boolean z3 = this.f2117e.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId2 != -1) {
            C0735ip d2 = C0735ip.m2471d(context, resourceId2, C0338a.f1089y);
            if (z3 || !d2.f2596b.hasValue(14)) {
                z2 = false;
                z = false;
            } else {
                z2 = d2.f2596b.getBoolean(14, false);
                z = true;
            }
            m1990h(context, d2);
            str2 = d2.f2596b.hasValue(15) ? d2.f2596b.getString(15) : null;
            str = d2.f2596b.hasValue(13) ? d2.f2596b.getString(13) : null;
            d2.f2596b.recycle();
        } else {
            z2 = false;
            str2 = null;
            str = null;
            z = false;
        }
        C0735ip f2 = C0735ip.m2473f(context, attributeSet2, C0338a.f1089y, i5, 0);
        if (!z3 && f2.f2596b.hasValue(14)) {
            z2 = f2.f2596b.getBoolean(14, false);
            z = true;
        }
        if (f2.f2596b.hasValue(15)) {
            str2 = f2.f2596b.getString(15);
        }
        if (f2.f2596b.hasValue(13)) {
            str = f2.f2596b.getString(13);
        }
        if (f2.f2596b.hasValue(0) && f2.f2596b.getDimensionPixelSize(0, -1) == 0) {
            this.f2117e.setTextSize(0, 0.0f);
        }
        m1990h(context, f2);
        f2.f2596b.recycle();
        if (!z3 && z) {
            this.f2117e.setAllCaps(z2);
        }
        Typeface typeface = this.f2115c;
        if (typeface != null) {
            if (this.f2125m == -1) {
                this.f2117e.setTypeface(typeface, this.f2114b);
            } else {
                this.f2117e.setTypeface(typeface);
            }
        }
        if (str != null) {
            C0541bk.m1985d(this.f2117e, str);
        }
        if (str2 != null) {
            C0540bj.m1981b(this.f2117e, C0540bj.m1980a(str2));
        }
        C0547bq bqVar = this.f2124l;
        TypedArray obtainStyledAttributes = bqVar.f2135h.obtainStyledAttributes(attributeSet2, C0338a.f1073i, i5, 0);
        TextView textView2 = bqVar.f2134g;
        C0547bq bqVar2 = bqVar;
        C2043bi.m5525S(textView2, textView2.getContext(), C0338a.f1073i, attributeSet, obtainStyledAttributes, i, 0);
        TypedArray typedArray = obtainStyledAttributes;
        if (typedArray.hasValue(5)) {
            bqVar2.f2128a = typedArray.getInt(5, 0);
        }
        float dimension = typedArray.hasValue(4) ? typedArray.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArray.hasValue(2) ? typedArray.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArray.hasValue(1) ? typedArray.getDimension(1, -1.0f) : -1.0f;
        if (typedArray.hasValue(3) && (resourceId = typedArray.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                bqVar2.f2132e = C0547bq.m2021b(iArr);
                int[] iArr2 = bqVar2.f2132e;
                int length2 = iArr2.length;
                boolean z4 = length2 > 0;
                bqVar2.f2133f = z4;
                if (z4) {
                    bqVar2.f2128a = 1;
                    bqVar2.f2130c = (float) iArr2[0];
                    bqVar2.f2131d = (float) iArr2[length2 - 1];
                    bqVar2.f2129b = -1.0f;
                }
            }
            obtainTypedArray.recycle();
        }
        typedArray.recycle();
        if (!bqVar2.mo2585a()) {
            bqVar2.f2128a = 0;
        } else if (bqVar2.f2128a == 1) {
            if (!bqVar2.f2133f) {
                DisplayMetrics displayMetrics = bqVar2.f2135h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                } else if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                } else if (dimension > 0.0f) {
                    bqVar2.f2128a = 1;
                    bqVar2.f2130c = dimension2;
                    bqVar2.f2131d = dimension3;
                    bqVar2.f2129b = dimension;
                    bqVar2.f2133f = false;
                } else {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
            }
            if (bqVar2.mo2585a() && bqVar2.f2128a == 1 && (!bqVar2.f2133f || bqVar2.f2132e.length == 0)) {
                int floor = ((int) Math.floor((double) ((bqVar2.f2131d - bqVar2.f2130c) / bqVar2.f2129b))) + 1;
                int[] iArr3 = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr3[i7] = Math.round(bqVar2.f2130c + (((float) i7) * bqVar2.f2129b));
                }
                bqVar2.f2132e = C0547bq.m2021b(iArr3);
            }
        }
        Method method = C0763jq.f2653a;
        C0547bq bqVar3 = this.f2124l;
        if (bqVar3.f2128a != 0) {
            int[] iArr4 = bqVar3.f2132e;
            if (iArr4.length > 0) {
                if (((float) C0541bk.m1982a(this.f2117e)) != -1.0f) {
                    C0541bk.m1983b(this.f2117e, Math.round(this.f2124l.f2130c), Math.round(this.f2124l.f2131d), Math.round(this.f2124l.f2129b), 0);
                } else {
                    C0541bk.m1984c(this.f2117e, iArr4, 0);
                }
            }
        }
        C0735ip e = C0735ip.m2472e(context, attributeSet2, C0338a.f1073i);
        int resourceId3 = e.f2596b.getResourceId(8, -1);
        Drawable c = resourceId3 != -1 ? d.mo2477c(context, resourceId3) : null;
        int resourceId4 = e.f2596b.getResourceId(13, -1);
        Drawable c2 = resourceId4 != -1 ? d.mo2477c(context, resourceId4) : null;
        int resourceId5 = e.f2596b.getResourceId(9, -1);
        Drawable c3 = resourceId5 != -1 ? d.mo2477c(context, resourceId5) : null;
        int resourceId6 = e.f2596b.getResourceId(6, -1);
        Drawable c4 = resourceId6 != -1 ? d.mo2477c(context, resourceId6) : null;
        int resourceId7 = e.f2596b.getResourceId(10, -1);
        Drawable c5 = resourceId7 != -1 ? d.mo2477c(context, resourceId7) : null;
        int resourceId8 = e.f2596b.getResourceId(7, -1);
        Drawable c6 = resourceId8 != -1 ? d.mo2477c(context, resourceId8) : null;
        if (c5 != null || c6 != null) {
            Drawable[] c7 = C0539bi.m1979c(this.f2117e);
            TextView textView3 = this.f2117e;
            if (c5 == null) {
                c5 = c7[0];
            }
            if (c2 == null) {
                c2 = c7[1];
            }
            if (c6 == null) {
                c6 = c7[2];
            }
            if (c4 == null) {
                c4 = c7[3];
            }
            C0539bi.m1977a(textView3, c5, c2, c6, c4);
        } else if (!(c == null && c2 == null && c3 == null && c4 == null)) {
            Drawable[] c8 = C0539bi.m1979c(this.f2117e);
            Drawable drawable = c8[0];
            if (drawable == null && c8[2] == null) {
                Drawable[] compoundDrawables = this.f2117e.getCompoundDrawables();
                TextView textView4 = this.f2117e;
                if (c == null) {
                    c = compoundDrawables[0];
                }
                if (c2 == null) {
                    c2 = compoundDrawables[1];
                }
                if (c3 == null) {
                    c3 = compoundDrawables[2];
                }
                if (c4 == null) {
                    c4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, c4);
            } else {
                TextView textView5 = this.f2117e;
                if (c2 == null) {
                    c2 = c8[1];
                }
                Drawable drawable2 = c8[2];
                if (c4 == null) {
                    c4 = c8[3];
                }
                C0539bi.m1977a(textView5, drawable, c2, drawable2, c4);
            }
        }
        if (e.f2596b.hasValue(11)) {
            C2135v.m5922f(this.f2117e, e.mo3245a(11));
        }
        if (e.f2596b.hasValue(12)) {
            i2 = -1;
            C2135v.m5923g(this.f2117e, C0571cn.m2114a(e.f2596b.getInt(12, -1), (PorterDuff.Mode) null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize = e.f2596b.getDimensionPixelSize(15, i2);
        int dimensionPixelSize2 = e.f2596b.getDimensionPixelSize(18, i2);
        int dimensionPixelSize3 = e.f2596b.getDimensionPixelSize(19, i2);
        e.f2596b.recycle();
        if (dimensionPixelSize != i2) {
            TextView textView6 = this.f2117e;
            C1974i.m5317e(dimensionPixelSize);
            C2137x.m5934b(textView6, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i2) {
            TextView textView7 = this.f2117e;
            C1974i.m5317e(dimensionPixelSize2);
            Paint.FontMetricsInt fontMetricsInt = textView7.getPaint().getFontMetricsInt();
            if (C2133t.m5908c(textView7)) {
                i3 = fontMetricsInt.bottom;
            } else {
                i3 = fontMetricsInt.descent;
            }
            if (dimensionPixelSize2 > Math.abs(i3)) {
                textView7.setPadding(textView7.getPaddingLeft(), textView7.getPaddingTop(), textView7.getPaddingRight(), dimensionPixelSize2 - i3);
            }
        }
        if (dimensionPixelSize3 != -1) {
            C2139z.m5936a(this.f2117e, dimensionPixelSize3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2571c(Context context, int i) {
        String string;
        C0735ip d = C0735ip.m2471d(context, i, C0338a.f1089y);
        if (d.f2596b.hasValue(14)) {
            this.f2117e.setAllCaps(d.f2596b.getBoolean(14, false));
        }
        if (d.f2596b.hasValue(0) && d.f2596b.getDimensionPixelSize(0, -1) == 0) {
            this.f2117e.setTextSize(0, 0.0f);
        }
        m1990h(context, d);
        if (d.f2596b.hasValue(13) && (string = d.f2596b.getString(13)) != null) {
            C0541bk.m1985d(this.f2117e, string);
        }
        d.f2596b.recycle();
        Typeface typeface = this.f2115c;
        if (typeface != null) {
            this.f2117e.setTypeface(typeface, this.f2114b);
        }
    }

    /* renamed from: d */
    public final void mo2572d() {
        C0733in inVar = this.f2113a;
        this.f2118f = inVar;
        this.f2119g = inVar;
        this.f2120h = inVar;
        this.f2121i = inVar;
        this.f2122j = inVar;
        this.f2123k = inVar;
    }
}
