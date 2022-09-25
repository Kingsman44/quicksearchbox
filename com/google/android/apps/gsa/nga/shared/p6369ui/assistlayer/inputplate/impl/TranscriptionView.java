package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81965ab;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81987ax;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81988ay;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58557jl;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.TranscriptionView */
/* compiled from: PG */
public class TranscriptionView extends AppCompatTextView {

    /* renamed from: a */
    public static final PathInterpolator f223510a = new PathInterpolator(0.17f, 0.17f, 0.67f, 1.0f);

    /* renamed from: h */
    private static final C58869cf f223511h = C58869cf.m90938d(" ").mo56151a().mo56152f(C58911u.f156751b);

    /* renamed from: b */
    public final Rect f223512b;

    /* renamed from: c */
    final float f223513c;

    /* renamed from: d */
    final float f223514d;

    /* renamed from: e */
    final float f223515e;

    /* renamed from: f */
    public final SpannableStringBuilder f223516f;

    /* renamed from: g */
    public int f223517g;

    /* renamed from: i */
    private final int f223518i;

    /* renamed from: j */
    private C81776ca f223519j;

    /* renamed from: k */
    private ValueAnimator f223520k;

    /* renamed from: l */
    private final Matrix f223521l;

    /* renamed from: m */
    private final float[] f223522m;

    /* renamed from: n */
    private String f223523n;

    public TranscriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private final void m129870e() {
        mo75256c(BuildConfig.FLAVOR);
        this.f223519j = new C81776ca(this);
    }

    /* renamed from: f */
    private final void m129871f(int i, C81777cb cbVar) {
        C81777cb cbVar2;
        this.f223519j.f223700a.clear();
        String spannableStringBuilder = this.f223516f.toString();
        String substring = spannableStringBuilder.substring(i);
        if (substring.length() > 0) {
            int indexOf = spannableStringBuilder.indexOf(substring, i);
            int length = substring.length() + indexOf;
            if (cbVar == null) {
                cbVar2 = new C81777cb(this);
            } else {
                cbVar2 = new C81777cb(this, cbVar);
            }
            this.f223516f.setSpan(cbVar2, indexOf, length, 33);
            this.f223519j.f223700a.add(cbVar2);
        }
        setText(this.f223516f, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: g */
    private final void m129872g() {
        float[] fArr = this.f223522m;
        float f = this.f223513c;
        float f2 = (float) this.f223517g;
        fArr[0] = f / f2;
        fArr[1] = (this.f223514d + f) / f2;
        fArr[2] = ((f2 - this.f223515e) - f) / f2;
        fArr[3] = 1.0f;
        mo75257d();
    }

    /* renamed from: b */
    public final void mo75255b(int i) {
        if (this.f223517g != i) {
            if (i == 0) {
                m129870e();
                i = 0;
            }
            this.f223517g = i;
            m129872g();
            if (!this.f223523n.isEmpty()) {
                mo75256c(this.f223523n);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo75256c(String str) {
        boolean z;
        C81987ax axVar;
        String str2 = str;
        if (this.f223517g == 0) {
            this.f223523n = str2;
            return;
        }
        this.f223523n = BuildConfig.FLAVOR;
        if (!this.f223516f.toString().equals(str2)) {
            m129872g();
            ValueAnimator valueAnimator = this.f223520k;
            if (valueAnimator != null) {
                boolean isRunning = valueAnimator.isRunning();
                if (isRunning) {
                    this.f223520k.cancel();
                }
                z = isRunning;
            } else {
                z = false;
            }
            boolean isEmpty = this.f223516f.toString().isEmpty();
            String spannableStringBuilder = this.f223516f.toString();
            if (C58837ba.m90859h(spannableStringBuilder) || C58837ba.m90859h(str)) {
                axVar = new C81987ax(str2);
            } else {
                String lowerCase = spannableStringBuilder.toLowerCase(Locale.US);
                String lowerCase2 = str2.toLowerCase(Locale.US);
                int length = lowerCase.length();
                int[] iArr = new int[2];
                iArr[1] = lowerCase2.length();
                iArr[0] = length;
                int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
                int i = 0;
                while (i < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i);
                    int i2 = 0;
                    while (i2 < lowerCase2.length()) {
                        if (charAt == lowerCase2.charAt(i2)) {
                            iArr2[i][i2] = ((i == 0 || i2 == 0) ? 0 : iArr2[i - 1][i2 - 1]) + (charAt == ' ' ? 0 : 1);
                        }
                        i2++;
                    }
                    i++;
                }
                axVar = C81988ay.m130232a(str, 0, spannableStringBuilder.length(), 0, str.length(), iArr2);
            }
            this.f223516f.clear();
            this.f223516f.append(axVar.f224142a);
            this.f223516f.append(axVar.f224143b);
            int ceil = (int) Math.ceil((double) getPaint().measureText(this.f223516f.toString()));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (!(layoutParams == null || ceil == layoutParams.width)) {
                layoutParams.width = ceil;
                setLayoutParams(layoutParams);
            }
            C81777cb cbVar = null;
            if (isEmpty || axVar.f224142a.isEmpty()) {
                m129871f(axVar.f224142a.length() + axVar.f224143b.length(), (C81777cb) null);
                setTranslationX(mo75254a((float) ceil));
            } else {
                int length2 = axVar.f224142a.length();
                if (z && !axVar.f224142a.endsWith(" ") && !axVar.f224143b.startsWith(" ")) {
                    List i3 = f223511h.mo56155i(axVar.f224142a);
                    if (i3.size() > 0) {
                        length2 -= ((String) C58557jl.m90131l(i3)).length();
                    }
                    List list = this.f223519j.f223700a;
                    if (!list.isEmpty()) {
                        cbVar = (C81777cb) C58557jl.m90131l(list);
                    }
                }
                m129871f(length2, cbVar);
                C81776ca caVar = this.f223519j;
                int i4 = C81776ca.f223699c;
                float measureText = caVar.f223701b.getPaint().measureText(caVar.f223701b.f223516f.toString());
                float translationX = caVar.f223701b.getTranslationX();
                float a = caVar.f223701b.mo75254a(measureText) - translationX;
                float abs = Math.abs(a);
                long min = Math.min(400, Math.max(20, (long) (abs * ((-(abs / ((float) caVar.f223701b.f223517g))) + 4.0f))));
                TranscriptionView transcriptionView = caVar.f223701b;
                long j = measureText > ((float) transcriptionView.f223517g) - transcriptionView.getX() ? 50 + min : min;
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{translationX, translationX + (a * (((float) j) / ((float) min)))}).setDuration(j);
                duration.setInterpolator(f223510a);
                duration.addUpdateListener(caVar);
                this.f223520k = duration;
                duration.start();
            }
            mo75257d();
        }
    }

    /* renamed from: d */
    public final void mo75257d() {
        int i = this.f223518i;
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, (float) this.f223517g, 0.0f, new int[]{0, i, i, 0}, this.f223522m, Shader.TileMode.CLAMP));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String spannableStringBuilder = this.f223516f.toString();
        m129870e();
        mo75256c(spannableStringBuilder);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.getClipBounds(this.f223512b);
        if (C81965ab.m130205a(this)) {
            this.f223521l.setTranslate(((float) (this.f223512b.right - this.f223517g)) - getTranslationX(), 0.0f);
        } else {
            this.f223521l.setTranslate(((float) this.f223512b.left) - getTranslationX(), 0.0f);
        }
        Shader shader = getPaint().getShader();
        if (shader != null) {
            shader.setLocalMatrix(this.f223521l);
        }
        super.onDraw(canvas);
    }

    public final void setVisibility(int i) {
        if (i != 4) {
            if (i == 8) {
                i = 8;
            }
            super.setVisibility(i);
        }
        m129870e();
        super.setVisibility(i);
    }

    public TranscriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f223512b = new Rect(0, 0, 0, 0);
        this.f223516f = new SpannableStringBuilder();
        this.f223521l = new Matrix();
        this.f223522m = new float[4];
        this.f223517g = 0;
        this.f223523n = BuildConfig.FLAVOR;
        this.f223519j = new C81776ca(this);
        this.f223513c = (float) context.getResources().getDimensionPixelOffset(R.dimen.nga_transcription_bumper_distance);
        float dimensionPixelOffset = ((float) context.getResources().getDimensionPixelOffset(R.dimen.nga_fade_distance_start)) / 2.0f;
        this.f223514d = dimensionPixelOffset;
        this.f223515e = dimensionPixelOffset / 2.0f;
        this.f223518i = C19391a.m36980a(context, R.attr.assistantOnBackground);
    }

    /* renamed from: a */
    public final float mo75254a(float f) {
        int i = this.f223517g;
        float f2 = this.f223513c;
        return f < ((float) i) - (((f2 + f2) + this.f223515e) + this.f223514d) ? C81965ab.m130205a(this) ? (-(((float) this.f223517g) - f)) / 2.0f : (((float) this.f223517g) - f) / 2.0f : C81965ab.m130205a(this) ? (f - ((float) this.f223517g)) + this.f223514d + this.f223513c : ((((float) this.f223517g) - f) - this.f223515e) - this.f223513c;
    }
}
