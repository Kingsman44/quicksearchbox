package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.content.C1882h;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3512i.C44694d;
import java.util.Arrays;

/* compiled from: PG */
class ClockFaceView extends C44993q implements C44984h {

    /* renamed from: a */
    public final ClockHandView f117475a;

    /* renamed from: b */
    public final Rect f117476b;

    /* renamed from: c */
    public final SparseArray f117477c;

    /* renamed from: d */
    public final int f117478d;

    /* renamed from: e */
    public String[] f117479e;

    /* renamed from: g */
    private final RectF f117480g;

    /* renamed from: h */
    private final Rect f117481h;

    /* renamed from: i */
    private final C2061c f117482i;

    /* renamed from: j */
    private final int[] f117483j;

    /* renamed from: k */
    private final float[] f117484k;

    /* renamed from: l */
    private final int f117485l;

    /* renamed from: m */
    private final int f117486m;

    /* renamed from: n */
    private final int f117487n;

    /* renamed from: o */
    private float f117488o;

    /* renamed from: p */
    private final ColorStateList f117489p;

    public ClockFaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private final void m79940d() {
        RadialGradient radialGradient;
        RectF rectF = this.f117475a.f117493d;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.f117477c.size(); i++) {
            TextView textView2 = (TextView) this.f117477c.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.f117476b);
                this.f117480g.set(this.f117476b);
                this.f117480g.union(rectF);
                float width = this.f117480g.width() * this.f117480g.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        for (int i2 = 0; i2 < this.f117477c.size(); i2++) {
            TextView textView3 = (TextView) this.f117477c.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(this.f117476b);
                this.f117480g.set(this.f117476b);
                textView3.getLineBounds(0, this.f117481h);
                this.f117480g.inset((float) this.f117481h.left, (float) this.f117481h.top);
                if (!RectF.intersects(rectF, this.f117480g)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.f117480g.left, rectF.centerY() - this.f117480g.top, 0.5f * rectF.width(), this.f117483j, this.f117484k, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo48619a(float f, boolean z) {
        if (Math.abs(this.f117488o - f) > 0.001f) {
            this.f117488o = f;
            m79940d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33195b() {
        super.mo33195b();
        for (int i = 0; i < this.f117477c.size(); i++) {
            ((TextView) this.f117477c.get(i)).setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo48620c(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f117477c.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f117479e.length, size); i2++) {
            TextView textView = (TextView) this.f117477c.get(i2);
            if (i2 >= this.f117479e.length) {
                removeView(textView);
                this.f117477c.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.f117477c.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f117479e[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z |= !(i3 <= 1);
                C2043bi.m5526T(textView, this.f117482i);
                textView.setTextColor(this.f117489p);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f117479e[i2]}));
                }
            }
        }
        ClockHandView clockHandView = this.f117475a;
        if (clockHandView.f117491b && !z) {
            clockHandView.f117496g = 1;
        }
        clockHandView.f117491b = z;
        clockHandView.invalidate();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C1991k(accessibilityNodeInfo).mo5154c(C1989i.m5331a(1, this.f117479e.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m79940d();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f117487n) / Math.max(Math.max(((float) this.f117485l) / ((float) displayMetrics.heightPixels), ((float) this.f117486m) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117476b = new Rect();
        this.f117480g = new RectF();
        this.f117481h = new Rect();
        this.f117477c = new SparseArray();
        this.f117484k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44991o.f117577a, i, 2132151831);
        Resources resources = getResources();
        ColorStateList b = C44694d.m79230b(context, obtainStyledAttributes, 1);
        this.f117489p = b;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f117475a = clockHandView;
        this.f117478d = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = b.getColorForState(new int[]{16842913}, b.getDefaultColor());
        this.f117483j = new int[]{colorForState, colorForState, b.getDefaultColor()};
        clockHandView.mo48622a(this);
        int defaultColor = C1882h.m5138d(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList b2 = C44694d.m79230b(context, obtainStyledAttributes, 0);
        setBackgroundColor(b2 != null ? b2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C44979c(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f117482i = new C44980d(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        this.f117479e = strArr;
        mo48620c(0);
        this.f117485l = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f117486m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f117487n = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
