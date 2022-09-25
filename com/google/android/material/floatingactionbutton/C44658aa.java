package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.p097i.C1974i;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44724aw;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3504a.C44498c;
import com.google.android.material.p3504a.C44500e;
import com.google.android.material.p3504a.C44502g;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;
import java.util.ArrayList;

/* renamed from: com.google.android.material.floatingactionbutton.aa */
/* compiled from: PG */
class C44658aa {

    /* renamed from: a */
    static final TimeInterpolator f116383a = C44497b.f115652c;

    /* renamed from: b */
    public static final int f116384b = R.attr.motionDurationLong2;

    /* renamed from: c */
    public static final int f116385c = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: d */
    public static final int f116386d = R.attr.motionDurationMedium1;

    /* renamed from: e */
    public static final int f116387e = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: f */
    static final int[] f116388f = {16842919, 16842910};

    /* renamed from: g */
    static final int[] f116389g = {16843623, 16842908, 16842910};

    /* renamed from: h */
    static final int[] f116390h = {16842908, 16842910};

    /* renamed from: i */
    static final int[] f116391i = {16843623, 16842910};

    /* renamed from: j */
    static final int[] f116392j = {16842910};

    /* renamed from: k */
    static final int[] f116393k = new int[0];

    /* renamed from: A */
    public int f116394A;

    /* renamed from: B */
    public int f116395B = 0;

    /* renamed from: C */
    final FloatingActionButton f116396C;

    /* renamed from: D */
    public ViewTreeObserver.OnPreDrawListener f116397D;

    /* renamed from: E */
    final C44678q f116398E;

    /* renamed from: F */
    private final C44724aw f116399F;

    /* renamed from: G */
    private final Rect f116400G = new Rect();

    /* renamed from: H */
    private final RectF f116401H = new RectF();

    /* renamed from: I */
    private final RectF f116402I = new RectF();

    /* renamed from: J */
    private final Matrix f116403J = new Matrix();

    /* renamed from: l */
    C44785p f116404l;

    /* renamed from: m */
    C44779j f116405m;

    /* renamed from: n */
    Drawable f116406n;

    /* renamed from: o */
    C44666e f116407o;

    /* renamed from: p */
    Drawable f116408p;

    /* renamed from: q */
    boolean f116409q;

    /* renamed from: r */
    float f116410r;

    /* renamed from: s */
    float f116411s;

    /* renamed from: t */
    float f116412t;

    /* renamed from: u */
    int f116413u;

    /* renamed from: v */
    public Animator f116414v;

    /* renamed from: w */
    public C44502g f116415w;

    /* renamed from: x */
    public C44502g f116416x;

    /* renamed from: y */
    public float f116417y;

    /* renamed from: z */
    public float f116418z = 1.0f;

    public C44658aa(FloatingActionButton floatingActionButton, C44678q qVar) {
        this.f116396C = floatingActionButton;
        this.f116398E = qVar;
        C44724aw awVar = new C44724aw();
        this.f116399F = awVar;
        awVar.mo48034a(f116388f, m79138n(new C44685x(this)));
        awVar.mo48034a(f116389g, m79138n(new C44684w(this)));
        awVar.mo48034a(f116390h, m79138n(new C44684w(this)));
        awVar.mo48034a(f116391i, m79138n(new C44684w(this)));
        awVar.mo48034a(f116392j, m79138n(new C44686y(this)));
        awVar.mo48034a(f116393k, m79138n(new C44683v(this)));
        this.f116417y = floatingActionButton.getRotation();
    }

    /* renamed from: n */
    private static final ValueAnimator m79138n(C44687z zVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f116383a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(zVar);
        valueAnimator.addUpdateListener(zVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    public float mo47924a() {
        return this.f116410r;
    }

    /* renamed from: b */
    public final AnimatorSet mo47925b(C44502g gVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f116396C, View.ALPHA, new float[]{f});
        gVar.mo47379d("opacity").mo47386b(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f116396C, View.SCALE_X, new float[]{f2});
        gVar.mo47379d("scale").mo47386b(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f116396C, View.SCALE_Y, new float[]{f2});
        gVar.mo47379d("scale").mo47386b(ofFloat3);
        arrayList.add(ofFloat3);
        mo47927d(f3, this.f116403J);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f116396C, new C44500e(), new C44681t(this), new Matrix[]{new Matrix(this.f116403J)});
        gVar.mo47379d("iconScale").mo47386b(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C44498c.m78600a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet mo47926c(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C44682u(this, this.f116396C.getAlpha(), f, this.f116396C.getScaleX(), f2, this.f116396C.getScaleY(), this.f116418z, f3, new Matrix(this.f116403J)));
        arrayList.add(ofFloat);
        C44498c.m78600a(animatorSet, arrayList);
        animatorSet.setDuration((long) C44693c.m79225a(this.f116396C.getContext(), i, this.f116396C.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C44688a.m79217a(this.f116396C.getContext(), i2, C44497b.f115651b));
        return animatorSet;
    }

    /* renamed from: d */
    public final void mo47927d(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f116396C.getDrawable();
        if (drawable != null && this.f116394A != 0) {
            RectF rectF = this.f116401H;
            RectF rectF2 = this.f116402I;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.f116394A;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) this.f116394A) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }

    /* renamed from: e */
    public void mo47928e(Rect rect) {
        int i;
        if (this.f116409q) {
            int i2 = this.f116413u;
            FloatingActionButton floatingActionButton = this.f116396C;
            i = (i2 - floatingActionButton.mo47897c(floatingActionButton.f116367b)) / 2;
        } else {
            i = 0;
        }
        float a = mo47924a() + this.f116412t;
        int max = Math.max(i, (int) Math.ceil((double) a));
        int max2 = Math.max(i, (int) Math.ceil((double) (a * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: f */
    public void mo47929f(float f, float f2, float f3) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo47930g(float f) {
        this.f116418z = f;
        Matrix matrix = this.f116403J;
        mo47927d(f, matrix);
        this.f116396C.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo47931h(C44785p pVar) {
        this.f116404l = pVar;
        C44779j jVar = this.f116405m;
        if (jVar != null) {
            jVar.mo47555l(pVar);
        }
        C44666e eVar = this.f116407o;
        if (eVar != null) {
            eVar.f116439h = pVar;
            eVar.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo47932i() {
        Rect rect = this.f116400G;
        mo47928e(rect);
        C1974i.m5319g(this.f116408p, "Didn't initialize content background");
        if (mo47934k()) {
            this.f116398E.mo47980a(new InsetDrawable(this.f116408p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f116398E.mo47980a(this.f116408p);
        }
        C44678q qVar = this.f116398E;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        qVar.f116458a.f116370e.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = qVar.f116458a;
        int i5 = floatingActionButton.f116368c;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo47933j(float f) {
        C44779j jVar = this.f116405m;
        if (jVar != null) {
            jVar.mo48123U(f);
        }
    }

    /* renamed from: k */
    public boolean mo47934k() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo47935l() {
        return C2043bi.m5570ax(this.f116396C) && !this.f116396C.isInEditMode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo47936m() {
        if (!this.f116409q) {
            return true;
        }
        FloatingActionButton floatingActionButton = this.f116396C;
        return floatingActionButton.mo47897c(floatingActionButton.f116367b) >= this.f116413u;
    }
}
