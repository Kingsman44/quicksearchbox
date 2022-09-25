package com.google.android.apps.search.assistant.libraries.p8984ui.transcription;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.transcription.TranscriptionView */
/* compiled from: PG */
public final class TranscriptionView extends AppCompatTextView {

    /* renamed from: a */
    private static final C59071e f333083a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.ui.transcription.TranscriptionView");

    /* renamed from: b */
    private static final PathInterpolator f333084b = new PathInterpolator(0.17f, 0.17f, 0.67f, 1.0f);

    /* renamed from: c */
    private static final C58869cf f333085c = C58869cf.m90938d(" ").mo56151a().mo56152f(C58911u.f156751b);

    /* renamed from: d */
    private final Rect f333086d;

    /* renamed from: e */
    private final float f333087e;

    /* renamed from: f */
    private final float f333088f;

    /* renamed from: g */
    private final SpannableStringBuilder f333089g;

    /* renamed from: h */
    private ValueAnimator f333090h;

    /* renamed from: i */
    private final Matrix f333091i;

    /* renamed from: j */
    private final float[] f333092j;

    /* renamed from: k */
    private boolean f333093k;

    /* renamed from: l */
    private float f333094l;

    public TranscriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private final float m198338e(float f) {
        float f2 = (float) m198339f();
        if (m198342i(f)) {
            return (f2 - f) - this.f333088f;
        }
        if (this.f333093k) {
            return 0.0f;
        }
        return (f2 - f) / 2.0f;
    }

    /* renamed from: f */
    private final int m198339f() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    /* renamed from: g */
    private final void m198340g() {
        float f;
        float f2;
        int currentTextColor = getCurrentTextColor();
        float f3 = (float) m198339f();
        if (!this.f333093k || m198342i(this.f333094l)) {
            f = mo104404d() ? this.f333088f : this.f333087e;
        } else {
            f = 0.0f;
        }
        if (mo104404d()) {
            f2 = this.f333087e;
        } else {
            f2 = this.f333088f;
        }
        float[] fArr = this.f333092j;
        fArr[0] = 0.0f;
        fArr[1] = f / f3;
        fArr[2] = (f3 - f2) / f3;
        fArr[3] = 1.0f;
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{0, currentTextColor, currentTextColor, 0}, fArr, Shader.TileMode.CLAMP));
        invalidate();
    }

    /* renamed from: h */
    private final void m198341h(int i, C119498f fVar) {
        C119498f fVar2;
        String spannableStringBuilder = this.f333089g.toString();
        String substring = spannableStringBuilder.substring(i);
        if (substring.length() > 0) {
            int indexOf = spannableStringBuilder.indexOf(substring, i);
            int length = substring.length() + indexOf;
            if (fVar == null) {
                fVar2 = new C119498f(this);
            } else {
                fVar2 = new C119498f(this, fVar);
            }
            this.f333089g.setSpan(fVar2, indexOf, length, 33);
        }
        setText(this.f333089g, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: i */
    private final boolean m198342i(float f) {
        return f >= ((float) m198339f());
    }

    /* renamed from: a */
    public final List mo104401a() {
        if (!(getText() instanceof Spannable)) {
            return C58485gu.m89845m();
        }
        return Arrays.asList((C119498f[]) ((Spannable) getText()).getSpans(0, getText().length(), C119498f.class));
    }

    /* renamed from: b */
    public final void mo104402b(float f) {
        if (f >= 0.0f) {
            setGravity(8388611);
            mo104404d();
            if (mo104404d()) {
                f = -f;
            }
            setTranslationX(f);
            return;
        }
        setTranslationX(0.0f);
        if (!mo104404d()) {
            setGravity(8388611);
            float f2 = -f;
            Math.round(f2);
            setScrollX(Math.round(f2));
            return;
        }
        setGravity(8388613);
        float width = (float) ((getWidth() - getPaddingStart()) - getPaddingEnd());
        Math.round((this.f333094l - width) + f);
        setScrollX(Math.round((this.f333094l - width) + f));
    }

    /* renamed from: c */
    public final void mo104403c(String str) {
        int i;
        ValueAnimator valueAnimator;
        if (!this.f333089g.toString().equals(str)) {
            int layoutDirection = getLayoutDirection();
            if (str.trim().isEmpty()) {
                i = layoutDirection;
            } else {
                try {
                    i = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length()) ? 1 : 0;
                } catch (RuntimeException e) {
                    ((C59052c) ((C59052c) ((C59052c) f333083a.mo56226d()).mo56382g(e)).mo56372aa(34413)).mo56386p("Failed to fetch Transcription Directionality. Falling back to default locale");
                    i = getLayoutDirection();
                }
            }
            if (layoutDirection != i) {
                C2043bi.m5554ah(this, i);
                m198340g();
            }
            ValueAnimator valueAnimator2 = this.f333090h;
            boolean z = valueAnimator2 != null && valueAnimator2.isRunning();
            if (z && (valueAnimator = this.f333090h) != null) {
                valueAnimator.cancel();
            }
            int length = this.f333089g.length();
            C119494b a = C119495c.m198347a(this.f333089g.toString(), str);
            this.f333089g.clear();
            this.f333089g.append(a.f333096a);
            this.f333089g.append(a.f333097b);
            boolean i2 = m198342i(this.f333094l);
            float ceil = (float) Math.ceil((double) getPaint().measureText(this.f333089g.toString()));
            this.f333094l = ceil;
            if (i2 != m198342i(ceil)) {
                m198340g();
            }
            C119498f fVar = null;
            if (length == 0 || a.f333096a.isEmpty()) {
                m198341h(a.f333096a.length() + a.f333097b.length(), (C119498f) null);
                mo104402b(m198338e(this.f333094l));
                return;
            }
            int length2 = a.f333096a.length();
            if (z && !a.f333096a.endsWith(" ") && !a.f333097b.startsWith(" ")) {
                List i3 = f333085c.mo56155i(a.f333096a);
                if (i3.size() > 0) {
                    length2 -= ((String) C58557jl.m90131l(i3)).length();
                }
                List a2 = mo104401a();
                if (!a2.isEmpty()) {
                    fVar = (C119498f) C58557jl.m90131l(a2);
                }
            }
            m198341h(length2, fVar);
            float translationX = getTranslationX();
            if (translationX == 0.0f) {
                translationX = mo104404d() ? ((float) (getScrollX() + m198339f())) - this.f333094l : (float) (-getScrollX());
            } else if (mo104404d()) {
                translationX = -translationX;
            }
            float e2 = m198338e(this.f333094l);
            float abs = Math.abs(e2 - translationX);
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{translationX, e2}).setDuration(Math.min(400, Math.max(20, (long) (abs * ((-(abs / ((float) getWidth()))) + 4.0f)))));
            duration.setInterpolator(f333084b);
            duration.addUpdateListener(new C119497e(this));
            this.f333090h = duration;
            duration.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo104404d() {
        return C2043bi.m5577f(this) == 1;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.getClipBounds(this.f333086d);
        this.f333091i.setTranslate(((float) getScrollX()) - getTranslationX(), 0.0f);
        Shader shader = getPaint().getShader();
        if (shader != null) {
            shader.setLocalMatrix(this.f333091i);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m198340g();
        mo104402b(m198338e(this.f333094l));
    }

    public final void setTextColor(int i) {
        super.setTextColor(i);
        m198340g();
    }

    public TranscriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f333086d = new Rect(0, 0, 0, 0);
        this.f333089g = new SpannableStringBuilder();
        this.f333091i = new Matrix();
        this.f333092j = new float[4];
        this.f333093k = false;
        this.f333094l = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C119493a.f333095a);
        this.f333093k = obtainStyledAttributes.getBoolean(0, this.f333093k);
        obtainStyledAttributes.recycle();
        this.f333087e = (float) context.getResources().getDimensionPixelOffset(R.dimen.assistant_transcription_fade_distance_start);
        this.f333088f = (float) context.getResources().getDimensionPixelOffset(R.dimen.assistant_transcription_fade_distance_end);
        setEllipsize((TextUtils.TruncateAt) null);
        setSingleLine(true);
    }
}
