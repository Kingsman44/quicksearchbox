package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88895e;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class RecognizerView extends FrameLayout implements C88895e {

    /* renamed from: a */
    public static final Interpolator f241016a = C91107f.m148858a(0.4f, 0.33f);

    /* renamed from: b */
    public static final Interpolator f241017b = C91107f.m148858a(0.33f, 0.4f);

    /* renamed from: A */
    private final int f241018A;

    /* renamed from: B */
    private final boolean f241019B;

    /* renamed from: C */
    private int f241020C;

    /* renamed from: c */
    public C88893c f241021c;

    /* renamed from: d */
    protected int f241022d;

    /* renamed from: e */
    private int f241023e;

    /* renamed from: f */
    private final boolean f241024f;

    /* renamed from: g */
    private boolean f241025g;

    /* renamed from: h */
    private boolean f241026h;

    /* renamed from: i */
    private ImageView f241027i;

    /* renamed from: j */
    private C88961f f241028j;

    /* renamed from: k */
    private C88970o f241029k;

    /* renamed from: l */
    private float f241030l;

    /* renamed from: m */
    private float f241031m;

    /* renamed from: n */
    private float f241032n;

    /* renamed from: o */
    private float f241033o;

    /* renamed from: p */
    private ValueAnimator f241034p;

    /* renamed from: q */
    private ValueAnimator f241035q;

    /* renamed from: r */
    private ValueAnimator f241036r;

    /* renamed from: s */
    private AnimatorSet f241037s;

    /* renamed from: t */
    private ProgressBar f241038t;

    /* renamed from: u */
    private boolean f241039u;

    /* renamed from: v */
    private boolean f241040v;

    /* renamed from: w */
    private ViewPropertyAnimator f241041w;

    /* renamed from: x */
    private int f241042x;

    /* renamed from: y */
    private final int f241043y;

    /* renamed from: z */
    private final int f241044z;

    public RecognizerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: o */
    private final void m144593o(float f, float f2) {
        if (!this.f241019B && this.f241024f) {
            if (this.f241037s.isStarted()) {
                this.f241037s.cancel();
            }
            this.f241037s = new AnimatorSet();
            this.f241035q.setFloatValues(new float[]{this.f241033o, f});
            this.f241036r.setFloatValues(new float[]{f, f2});
            this.f241037s.play(this.f241036r).after(this.f241035q);
            this.f241037s.start();
            this.f241033o = f2;
        }
    }

    /* renamed from: p */
    private final void m144594p(float f, long j) {
        if (!this.f241019B && this.f241024f && this.f241033o != f) {
            C88939k.m144548d(this.f241034p, j, C91107f.f254408d, this.f241033o, f);
            this.f241033o = f;
        }
    }

    /* renamed from: b */
    public final void mo81838b() {
    }

    /* renamed from: c */
    public final void mo82744c(C88893c cVar) {
        this.f241021c = cVar;
    }

    /* renamed from: d */
    public final void mo82745d(int i, String str, String str2) {
        boolean z = true;
        mo82866l((i & 16) != 0);
        if ((i & 8192) == 0) {
            z = false;
        }
        mo82867m(z);
    }

    /* renamed from: e */
    public final void mo82746e(double d) {
    }

    /* renamed from: f */
    public final void mo82747f(boolean z) {
        if (z && this.f241023e != 5) {
            z = false;
        }
        if (z != this.f241039u) {
            this.f241039u = z;
            m144595q();
            if (z) {
                this.f241041w = C88939k.m144547c(this.f241038t).setDuration(100).setStartDelay(100);
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f241041w;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                this.f241041w = null;
            }
            C88939k.m144556l(this.f241038t).setDuration(100);
        }
    }

    /* renamed from: g */
    public final void mo82748g(int i) {
        if (i == 2) {
            if (this.f241023e == 3) {
                setContentDescription(getResources().getString(R.string.vs_hint_tap_to_finish));
                i = 4;
            } else {
                i = 2;
            }
        }
        this.f241022d = i;
        mo82865i();
    }

    /* renamed from: h */
    public final void mo82749h(C90740ax axVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo82865i() {
        m144595q();
        String string = getResources().getString(R.string.content_description_none);
        Resources resources = getResources();
        boolean z = false;
        switch (this.f241022d) {
            case 0:
                break;
            case 2:
                string = resources.getString(R.string.vs_hint_tap_to_cancel);
                break;
            case 3:
                m144594p(this.f241030l, 167);
                string = resources.getString(R.string.vs_hint_tap_to_finish);
                break;
            case 4:
                string = resources.getString(R.string.vs_hint_tap_to_cancel);
                break;
            case 5:
            case 6:
                m144594p(0.0f, 500);
                string = resources.getString(R.string.vs_hint_tap_to_speak);
                break;
        }
        z = true;
        setKeepScreenOn(z);
        setContentDescription(string);
        invalidate();
    }

    /* renamed from: j */
    public final void mo82750j(Bundle bundle) {
    }

    /* renamed from: k */
    public final void mo82751k(Bundle bundle) {
    }

    /* renamed from: l */
    public final void mo82866l(boolean z) {
        if (z != this.f241025g) {
            setKeepScreenOn(z);
            this.f241025g = z;
            if (z) {
                mo82747f(false);
            } else {
                m144594p(0.0f, 500);
            }
            m144595q();
        }
    }

    /* renamed from: m */
    public final void mo82867m(boolean z) {
        if (z != this.f241026h) {
            this.f241026h = z;
            m144595q();
        }
    }

    /* renamed from: n */
    public final void mo82752n() {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo82865i();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int height = getHeight() - getMeasuredHeight();
        int width = getWidth() - getMeasuredWidth();
        if ((height | width) == 0) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        canvas.translate((float) (width / 2), (float) (height / 2));
        super.onDraw(canvas);
        canvas.restore();
    }

    public final void onFinishInflate() {
        setOnClickListener(new C88972q(this));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.voice_progress);
        progressBar.getClass();
        this.f241038t = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(getResources().getColor(R.color.spinner_color)));
        this.f241038t.setIndeterminateTintMode(PorterDuff.Mode.SRC_ATOP);
        C88973r rVar = new C88973r(this);
        this.f241033o = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f241034p = ofFloat;
        ofFloat.addUpdateListener(rVar);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f241035q = ofFloat2;
        ofFloat2.addUpdateListener(rVar);
        this.f241035q.setDuration(250);
        this.f241035q.setInterpolator(f241016a);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f241036r = ofFloat3;
        ofFloat3.addUpdateListener(rVar);
        this.f241036r.setDuration(167);
        this.f241036r.setInterpolator(f241017b);
        ImageView imageView = (ImageView) findViewById(R.id.recognizer_image);
        imageView.getClass();
        this.f241027i = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Resources resources = getResources();
        this.f241028j = new C88961f(this.f241027i, resources, this.f241042x, this.f241019B, this.f241024f, this.f241044z, this.f241043y, this.f241018A);
        ImageView imageView2 = (ImageView) findViewById(R.id.recognizer_icon);
        imageView2.getClass();
        this.f241029k = new C88970o(imageView2, resources, this.f241019B, this.f241024f);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RecognizerView.class.getCanonicalName());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f241022d = savedState.f241045a;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f241045a = this.f241022d;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo82747f(false);
            mo82866l(false);
        }
        C88961f fVar = this.f241028j;
        if (!(fVar == null || i == 0)) {
            fVar.mo82888g(0);
        }
        C88970o oVar = this.f241029k;
        if (oVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (i != 0 && oVar.f241098k.isStarted()) {
                oVar.mo82901c(0);
            }
        }
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C88974s();

        /* renamed from: a */
        int f241045a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f241045a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f241045a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecognizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecognizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C88971p.f241108a, i, 0);
        this.f241044z = obtainStyledAttributes.getColor(2, -1);
        this.f241043y = obtainStyledAttributes.getColor(1, -1);
        this.f241018A = obtainStyledAttributes.getColor(5, -1);
        this.f241042x = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.f241019B = obtainStyledAttributes.getBoolean(0, false);
        this.f241024f = !C90772bp.m148283J(context);
        obtainStyledAttributes.recycle();
        Resources resources = getResources();
        if (this.f241042x == -1) {
            this.f241042x = resources.getDimensionPixelSize(R.dimen.orb_max_radius);
        }
        this.f241030l = (float) resources.getDimensionPixelSize(R.dimen.recognizer_translation_y_when_recording_or_ttsing);
        this.f241031m = (float) resources.getDimensionPixelOffset(R.dimen.recognizer_translation_y_when_bounce_to_tts);
        this.f241032n = (float) resources.getDimensionPixelOffset(R.dimen.recognizer_translation_y_when_bounce_to_listen);
        this.f241037s = new AnimatorSet();
        this.f241040v = true;
        this.f241020C = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r3 != 8) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81837a(int r3, int r4, boolean r5) {
        /*
            r2 = this;
            r2.f241023e = r3
            r5 = 2
            r0 = 2131232770(0x7f080802, float:1.8081659E38)
            if (r3 == r5) goto L_0x0030
            r1 = 3
            if (r3 == r1) goto L_0x002d
            r1 = 5
            if (r3 == r1) goto L_0x0021
            r4 = 6
            if (r3 == r4) goto L_0x001d
            r4 = 7
            if (r3 == r4) goto L_0x0019
            r4 = 8
            if (r3 == r4) goto L_0x001d
            goto L_0x0030
        L_0x0019:
            r2.mo82748g(r1)
            goto L_0x0030
        L_0x001d:
            r2.mo82748g(r5)
            goto L_0x0030
        L_0x0021:
            r3 = r4 & 4
            if (r3 == 0) goto L_0x0029
            r3 = 1
            r2.mo82867m(r3)
        L_0x0029:
            r2.mo82748g(r1)
            goto L_0x0030
        L_0x002d:
            r0 = 2131234936(0x7f081078, float:1.8086052E38)
        L_0x0030:
            com.google.android.apps.gsa.searchplate.recognizer.o r3 = r2.f241029k
            r3.mo82900b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.recognizer.RecognizerView.mo81837a(int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0283  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m144595q() {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r0.f241025g
            r3 = 3
            r4 = 4
            r5 = 5
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x000d
            r1 = 5
            goto L_0x002f
        L_0x000d:
            boolean r1 = r0.f241039u
            if (r1 != 0) goto L_0x002e
            boolean r1 = r0.f241026h
            if (r1 == 0) goto L_0x0016
            goto L_0x002e
        L_0x0016:
            int r1 = r0.f241022d
            if (r1 == r7) goto L_0x002c
            if (r1 == r6) goto L_0x002c
            if (r1 == r3) goto L_0x002a
            if (r1 == r4) goto L_0x002e
            if (r1 == r5) goto L_0x0028
            r8 = 10
            if (r1 == r8) goto L_0x002a
            r1 = 0
            goto L_0x002f
        L_0x0028:
            r1 = 1
            goto L_0x002f
        L_0x002a:
            r1 = 3
            goto L_0x002f
        L_0x002c:
            r1 = 2
            goto L_0x002f
        L_0x002e:
            r1 = 4
        L_0x002f:
            if (r1 == 0) goto L_0x02a5
            int r8 = r0.f241020C
            if (r1 == r8) goto L_0x02a5
            com.google.android.apps.gsa.searchplate.recognizer.f r8 = r0.f241028j
            int r9 = r8.f241056d
            r14 = 333(0x14d, float:4.67E-43)
            if (r9 != r1) goto L_0x003f
            goto L_0x012a
        L_0x003f:
            r12 = 500(0x1f4, double:2.47E-321)
            if (r1 == r7) goto L_0x00dc
            if (r1 == r6) goto L_0x00d1
            r15 = 1016028201(0x3c8f5c29, float:0.0175)
            r11 = 1034147594(0x3da3d70a, float:0.08)
            if (r1 == r3) goto L_0x00b7
            if (r1 == r4) goto L_0x0084
            int r10 = r8.f241071s
            r12 = 0
            r13 = 0
            android.view.animation.Interpolator r16 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            r17 = 333(0x14d, double:1.645E-321)
            r9 = r8
            r7 = 1034147594(0x3da3d70a, float:0.08)
            r11 = r12
            r12 = r13
            r13 = r16
            r2 = 1016028201(0x3c8f5c29, float:0.0175)
            r4 = 333(0x14d, float:4.67E-43)
            r14 = r17
            r9.mo82886e(r10, r11, r12, r13, r14)
            float r9 = r8.f241057e
            android.view.animation.Interpolator r10 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            r11 = 333(0x14d, double:1.645E-321)
            r8.mo82883b(r9, r11, r10)
            float r9 = r8.f241063k
            r8.mo82885d(r9, r11)
            int r9 = r8.f241064l
            r8.mo82884c(r9, r11)
            r8.mo82882a(r7, r2, r4)
            r8.mo82887f()
            goto L_0x0128
        L_0x0084:
            r4 = 333(0x14d, float:4.67E-43)
            if (r9 == r6) goto L_0x0096
            if (r9 != r3) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            if (r9 != r5) goto L_0x0094
            int r2 = r8.f241070r
            android.view.animation.Interpolator r7 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            r8.mo82890i(r2, r7)
        L_0x0094:
            r3 = r12
            goto L_0x00a6
        L_0x0096:
            int r10 = r8.f241070r
            r11 = 0
            r2 = 255(0xff, float:3.57E-43)
            android.view.animation.Interpolator r7 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            r14 = 500(0x1f4, double:2.47E-321)
            r9 = r8
            r3 = r12
            r12 = r2
            r13 = r7
            r9.mo82886e(r10, r11, r12, r13, r14)
        L_0x00a6:
            r8.mo82888g(r3)
            float r2 = r8.f241058f
            android.view.animation.Interpolator r7 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            r8.mo82883b(r2, r3, r7)
            float r2 = r8.f241061i
            r8.mo82885d(r2, r3)
            r2 = 0
            goto L_0x0125
        L_0x00b7:
            r2 = 1016028201(0x3c8f5c29, float:0.0175)
            r7 = 1034147594(0x3da3d70a, float:0.08)
            if (r9 == r6) goto L_0x00c4
            android.view.animation.Interpolator r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254406b
            r8.mo82889h(r3)
        L_0x00c4:
            r3 = 167(0xa7, float:2.34E-43)
            r8.mo82882a(r7, r2, r3)
            float r2 = r8.f241062j
            r3 = 167(0xa7, double:8.25E-322)
            r8.mo82885d(r2, r3)
            goto L_0x0128
        L_0x00d1:
            if (r9 != r5) goto L_0x00d6
            android.view.animation.Interpolator r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            goto L_0x00d8
        L_0x00d6:
            android.view.animation.Interpolator r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254406b
        L_0x00d8:
            r8.mo82889h(r2)
            goto L_0x0128
        L_0x00dc:
            r3 = r12
            if (r9 != 0) goto L_0x010d
            com.google.android.apps.gsa.searchplate.recognizer.OrbDrawable r2 = r8.f241054b
            int r3 = r8.f241070r
            r2.setColorWithoutAnimation(r3)
            float r2 = r8.f241058f
            r8.f241059g = r2
            com.google.android.apps.gsa.searchplate.recognizer.OrbDrawable r3 = r8.f241054b
            r3.setRadius(r2)
            float r2 = r8.f241060h
            r8.f241069q = r2
            int r2 = r8.f241064l
            r8.f241068p = r2
            com.google.android.apps.gsa.searchplate.recognizer.CircleShadowDrawable r2 = r8.f241055c
            float r3 = r8.f241059g
            r2.setBaseRadius(r3)
            com.google.android.apps.gsa.searchplate.recognizer.CircleShadowDrawable r2 = r8.f241055c
            float r3 = r8.f241069q
            r2.setZ(r3)
            com.google.android.apps.gsa.searchplate.recognizer.CircleShadowDrawable r2 = r8.f241055c
            int r3 = r8.f241068p
            r2.setAlpha(r3)
            goto L_0x0128
        L_0x010d:
            r8.mo82888g(r3)
            int r2 = r8.f241070r
            android.view.animation.Interpolator r7 = com.google.android.apps.gsa.searchplate.recognizer.C88961f.f241051a
            r8.mo82890i(r2, r7)
            float r2 = r8.f241058f
            android.view.animation.Interpolator r7 = com.google.android.apps.gsa.searchplate.recognizer.C88961f.f241051a
            r8.mo82883b(r2, r3, r7)
            float r2 = r8.f241060h
            r8.mo82885d(r2, r3)
            int r2 = r8.f241064l
        L_0x0125:
            r8.mo82884c(r2, r3)
        L_0x0128:
            r8.f241056d = r1
        L_0x012a:
            com.google.android.apps.gsa.searchplate.recognizer.o r2 = r0.f241029k
            if (r1 == r5) goto L_0x013c
            r3 = 4
            if (r1 == r3) goto L_0x013c
            if (r1 == r6) goto L_0x013c
            r3 = 3
            if (r1 != r3) goto L_0x0139
            r4 = 1
            r7 = 3
            goto L_0x013f
        L_0x0139:
            r7 = r1
            r4 = 0
            goto L_0x013f
        L_0x013c:
            r3 = 3
            r7 = r1
            r4 = 1
        L_0x013f:
            r2.f241095h = r4
            r14 = 500(0x1f4, float:7.0E-43)
            if (r7 == r6) goto L_0x015a
            if (r7 == r3) goto L_0x0157
            r3 = 4
            if (r7 == r3) goto L_0x0154
            if (r7 == r5) goto L_0x014f
            android.view.animation.Interpolator r3 = com.google.android.apps.gsa.searchplate.recognizer.C88970o.f241088a
            goto L_0x015c
        L_0x014f:
            android.view.animation.Interpolator r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            r14 = 333(0x14d, float:4.67E-43)
            goto L_0x015c
        L_0x0154:
            android.view.animation.Interpolator r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            goto L_0x015c
        L_0x0157:
            android.view.animation.Interpolator r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254408d
            goto L_0x015c
        L_0x015a:
            android.view.animation.Interpolator r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254406b
        L_0x015c:
            boolean r4 = r2.f241104q
            if (r4 != 0) goto L_0x0170
            android.widget.ImageView r4 = r2.f241090c
            boolean r9 = r2.f241095h
            if (r9 == 0) goto L_0x0169
            android.graphics.drawable.Drawable r9 = r2.f241091d
            goto L_0x016b
        L_0x0169:
            android.graphics.drawable.Drawable r9 = r2.f241092e
        L_0x016b:
            r4.setImageDrawable(r9)
            goto L_0x0225
        L_0x0170:
            boolean r4 = r2.f241095h
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.animation.AnimatorSet r9 = r2.f241103p
            r9.cancel()
            android.widget.ImageView r9 = r2.f241090c
            android.graphics.drawable.Drawable r9 = r9.getDrawable()
            if (r4 == 0) goto L_0x0184
            android.graphics.drawable.Drawable r4 = r2.f241091d
            goto L_0x0186
        L_0x0184:
            android.graphics.drawable.Drawable r4 = r2.f241092e
        L_0x0186:
            boolean r10 = r4.equals(r9)
            r11 = 1
            r10 = r10 ^ r11
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 != 0) goto L_0x019a
            android.widget.ImageView r12 = r2.f241090c
            float r12 = r12.getAlpha()
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x0206
        L_0x019a:
            if (r10 == 0) goto L_0x019e
            r12 = 0
            goto L_0x01a4
        L_0x019e:
            android.widget.ImageView r12 = r2.f241090c
            float r12 = r12.getAlpha()
        L_0x01a4:
            if (r9 != 0) goto L_0x01a8
            r13 = r14
            goto L_0x01aa
        L_0x01a8:
            int r13 = r14 >> 1
        L_0x01aa:
            android.animation.ObjectAnimator r15 = r2.f241096i
            r20 = r9
            long r8 = (long) r13
            android.view.animation.Interpolator r13 = com.google.android.apps.gsa.shared.util.p7187ui.C91107f.f254406b
            float[] r5 = new float[r6]
            r19 = 0
            r5[r19] = r12
            r12 = 1
            r5[r12] = r11
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144550f(r15, r8, r13, r5)
            android.animation.ObjectAnimator r5 = r2.f241096i
            r5.removeAllListeners()
            android.animation.ObjectAnimator r5 = r2.f241096i
            com.google.android.apps.gsa.searchplate.recognizer.n r11 = new com.google.android.apps.gsa.searchplate.recognizer.n
            r11.<init>(r2, r4)
            r5.addListener(r11)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r2.f241103p = r4
            android.animation.AnimatorSet r4 = r2.f241103p
            android.animation.ObjectAnimator r5 = r2.f241096i
            r4.play(r5)
            if (r10 == 0) goto L_0x0201
            if (r20 == 0) goto L_0x0201
            android.animation.ObjectAnimator r4 = r2.f241097j
            android.view.animation.Interpolator r5 = com.google.android.apps.gsa.searchplate.recognizer.C88970o.f241088a
            float[] r10 = new float[r6]
            android.widget.ImageView r11 = r2.f241090c
            float r11 = r11.getAlpha()
            r12 = 0
            r10[r12] = r11
            r11 = 0
            r12 = 1
            r10[r12] = r11
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144550f(r4, r8, r5, r10)
            android.animation.AnimatorSet r4 = r2.f241103p
            android.animation.ObjectAnimator r5 = r2.f241097j
            android.animation.AnimatorSet$Builder r4 = r4.play(r5)
            android.animation.ObjectAnimator r5 = r2.f241096i
            r4.before(r5)
        L_0x0201:
            android.animation.AnimatorSet r4 = r2.f241103p
            r4.start()
        L_0x0206:
            boolean r4 = r2.f241094g
            if (r4 != 0) goto L_0x0221
            if (r7 == r6) goto L_0x021a
            r4 = 5
            if (r7 != r4) goto L_0x0210
            goto L_0x021a
        L_0x0210:
            r4 = 3
            if (r7 != r4) goto L_0x0221
            long r7 = (long) r14
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mo82899a(r7, r5, r3)
            goto L_0x0226
        L_0x021a:
            long r4 = (long) r14
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r2.mo82899a(r4, r8, r3)
            goto L_0x0225
        L_0x0221:
            long r4 = (long) r14
            r2.mo82901c(r4)
        L_0x0225:
            r4 = r7
        L_0x0226:
            android.animation.ValueAnimator r5 = r2.f241099l
            r5.cancel()
            r5 = 4
            if (r4 != r5) goto L_0x0231
            int r7 = r2.f241093f
            goto L_0x0232
        L_0x0231:
            r7 = -1
        L_0x0232:
            int r8 = r2.f241100m
            if (r8 == r7) goto L_0x0257
            boolean r9 = r2.f241104q
            if (r9 == 0) goto L_0x024e
            if (r4 == r5) goto L_0x023f
            r5 = 5
            if (r4 != r5) goto L_0x024e
        L_0x023f:
            android.animation.ValueAnimator r5 = r2.f241099l
            int[] r9 = new int[r6]
            r10 = 0
            r9[r10] = r8
            r8 = 1
            r9[r8] = r7
            long r7 = (long) r14
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144549e(r5, r7, r3, r9)
            goto L_0x0257
        L_0x024e:
            android.graphics.drawable.Drawable r5 = r2.f241091d
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r5.setColorFilter(r7, r8)
            r2.f241100m = r7
        L_0x0257:
            android.animation.ValueAnimator r5 = r2.f241101n
            r5.cancel()
            int r5 = r2.f241093f
            int r7 = r2.f241102o
            if (r7 == r5) goto L_0x0280
            boolean r8 = r2.f241104q
            if (r8 == 0) goto L_0x0277
            r8 = 1
            if (r4 != r8) goto L_0x0277
            android.animation.ValueAnimator r2 = r2.f241101n
            int[] r4 = new int[r6]
            r9 = 0
            r4[r9] = r7
            r4[r8] = r5
            long r7 = (long) r14
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144549e(r2, r7, r3, r4)
            goto L_0x0280
        L_0x0277:
            android.graphics.drawable.Drawable r3 = r2.f241092e
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.setColorFilter(r5, r4)
            r2.f241102o = r5
        L_0x0280:
            r2 = 1
            if (r1 == r2) goto L_0x02a3
            if (r1 == r6) goto L_0x0294
            r2 = 5
            if (r1 == r2) goto L_0x0289
            goto L_0x02a5
        L_0x0289:
            float r2 = r0.f241031m
            float r3 = r0.f241030l
            r0.m144593o(r2, r3)
            r2 = 0
            r0.f241040v = r2
            goto L_0x02a5
        L_0x0294:
            r2 = 0
            boolean r3 = r0.f241040v
            if (r3 == 0) goto L_0x02a3
            boolean r3 = r0.f241025g
            if (r3 != 0) goto L_0x02a3
            float r3 = r0.f241032n
            r4 = 0
            r0.m144593o(r3, r4)
        L_0x02a3:
            r0.f241040v = r2
        L_0x02a5:
            r0.f241020C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.recognizer.RecognizerView.m144595q():void");
    }
}
