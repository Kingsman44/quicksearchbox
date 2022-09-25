package com.google.android.libraries.componentview.components.base.p1688b;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.view.Gravity;
import android.widget.TextView;
import com.google.common.p4522b.C58485gu;
import java.text.BreakIterator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.componentview.components.base.b.e */
/* compiled from: PG */
public class C20035e extends TextView {

    /* renamed from: g */
    private static final Set f56159g = new HashSet(C58485gu.m89849q(8230, '.', 183, 8250));

    /* renamed from: h */
    private static BreakIterator f56160h;

    /* renamed from: a */
    public final SpannableStringBuilder f56161a = new SpannableStringBuilder();

    /* renamed from: b */
    public boolean f56162b = false;

    /* renamed from: c */
    public boolean f56163c = false;

    /* renamed from: d */
    public final SpannableStringBuilder f56164d = new SpannableStringBuilder();

    /* renamed from: e */
    public Spannable f56165e = null;

    /* renamed from: f */
    public boolean f56166f = false;

    /* renamed from: i */
    private boolean f56167i = false;

    /* renamed from: j */
    private boolean f56168j = false;

    /* renamed from: k */
    private SpannableStringBuilder f56169k = null;

    /* renamed from: l */
    private Map f56170l;

    /* renamed from: m */
    private int f56171m = Integer.MAX_VALUE;

    /* renamed from: n */
    private int f56172n;

    public C20035e(Context context) {
        super(context);
        if (f56160h == null) {
            f56160h = BreakIterator.getCharacterInstance();
        }
    }

    /* renamed from: c */
    private final int m37858c(float f, int i, int i2) {
        int i3 = i;
        while (i3 < i2) {
            int i4 = ((i2 + i3) + 1) / 2;
            if (getPaint().measureText(getText(), i, i4) <= f) {
                i3 = i4;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (!Character.isWhitespace(getText().charAt(i5)) && !f56159g.contains(Character.valueOf(getText().charAt(i5)))) {
                break;
            }
            i3 = i5;
        }
        f56160h.setText(getText().toString());
        if (f56160h.isBoundary(i3) || (i3 = f56160h.preceding(i3)) != -1) {
            return i3;
        }
        return 0;
    }

    /* renamed from: d */
    private final void m37859d() {
        setVisibility(8);
        this.f56168j = true;
        setMeasuredDimension(0, 0);
    }

    /* renamed from: e */
    private final void m37860e() {
        if (this.f56161a.length() == 0 && this.f56164d.length() == 0) {
            this.f56161a.append(getText());
            this.f56162b = true;
        } else if (this.f56164d.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = this.f56169k;
            if (spannableStringBuilder == null) {
                this.f56169k = new SpannableStringBuilder(this.f56161a);
            } else {
                spannableStringBuilder.clear();
                this.f56169k.append(this.f56161a);
            }
            this.f56169k.append(this.f56164d);
            setText(this.f56169k, TextView.BufferType.SPANNABLE);
        } else if (!this.f56162b) {
            m37862g();
        }
        this.f56167i = false;
    }

    /* renamed from: f */
    private final void m37861f(CharSequence charSequence, TextView.BufferType bufferType) {
        setText(charSequence, bufferType);
        this.f56167i = true;
    }

    /* renamed from: g */
    private final void m37862g() {
        setText(this.f56161a, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: a */
    public final void mo25208a(Spannable spannable, boolean z, boolean z2) {
        if (z) {
            this.f56164d.append(spannable);
            return;
        }
        if (this.f56164d.length() > 0) {
            this.f56161a.append(this.f56164d);
            this.f56164d.clear();
        }
        if (z2) {
            if (this.f56161a.length() > 0) {
                this.f56161a.append("\n");
            }
            if (this.f56170l == null) {
                this.f56170l = new TreeMap();
            }
            this.f56170l.put(Integer.valueOf(this.f56161a.length()), spannable);
        }
        this.f56161a.append(spannable);
    }

    /* renamed from: b */
    public final void mo25209b() {
        m37860e();
        setMaxLines(this.f56171m);
        this.f56167i = false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        Object[] spans;
        if (this.f56167i) {
            m37860e();
        }
        if (this.f56168j) {
            setVisibility(0);
        }
        super.onMeasure(i, i2);
        if (getLayout().getLineCount() <= this.f56171m) {
            if (this.f56170l != null) {
                float width = (((float) getLayout().getWidth()) * 0.95f) - getPaint().measureText("…\n");
                int i3 = 0;
                for (Map.Entry entry : this.f56170l.entrySet()) {
                    int intValue = ((Integer) entry.getKey()).intValue();
                    Spannable spannable = (Spannable) entry.getValue();
                    int i4 = intValue - i3;
                    int length = spannable.length() + i4;
                    if (getPaint().measureText(getText(), i4, length) > width) {
                        if (this.f56163c) {
                            m37859d();
                            return;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable.subSequence(0, m37858c(width, i4, length) - i4));
                        spannableStringBuilder.append("…");
                        this.f56161a.replace(i4, length, spannableStringBuilder);
                        i3 = (i3 + spannable.length()) - spannableStringBuilder.length();
                        m37862g();
                    }
                }
                this.f56170l.clear();
            }
        } else if (getLayout().getWidth() != 0) {
            if (this.f56163c) {
                m37859d();
            } else if (this.f56166f) {
                m37861f(getText().subSequence(0, getLayout().getLineVisibleEnd(this.f56171m - 1)), TextView.BufferType.SPANNABLE);
                this.f56162b = false;
                super.onMeasure(i, i2);
            } else {
                TextPaint paint = getPaint();
                SpannableStringBuilder spannableStringBuilder2 = this.f56164d;
                float measureText = paint.measureText(spannableStringBuilder2, 0, spannableStringBuilder2.length());
                Spannable spannable2 = this.f56165e;
                float measureText2 = spannable2 != null ? getPaint().measureText(spannable2, 0, spannable2.length()) : 0.0f;
                int width2 = getLayout().getWidth();
                float measureText3 = getPaint().measureText("…");
                int i5 = this.f56171m - 1;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getText().subSequence(0, m37858c(((((float) width2) * 0.95f) - (measureText2 + measureText)) - measureText3, Math.min(getLayout().getLineStart(i5), this.f56161a.length()), Math.min(getLayout().getLineVisibleEnd(i5), this.f56161a.length()))));
                int length2 = spannableStringBuilder3.length();
                spannableStringBuilder3.append("…");
                if (length2 > 0 && (spans = spannableStringBuilder3.getSpans(length2 - 1, length2, Object.class)) != null && (r3 = spans.length) > 0) {
                    for (Object obj : spans) {
                        if (!(obj instanceof SuperscriptSpan) && !(obj instanceof SubscriptSpan) && !(obj instanceof RelativeSizeSpan)) {
                            spannableStringBuilder3.setSpan(obj, spannableStringBuilder3.getSpanStart(obj), spannableStringBuilder3.length(), spannableStringBuilder3.getSpanFlags(obj));
                        }
                    }
                }
                m37861f(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                if (this.f56165e != null) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(getText());
                    spannableStringBuilder4.append(this.f56165e);
                    m37861f(spannableStringBuilder4, TextView.BufferType.SPANNABLE);
                }
                if (this.f56164d.length() != 0) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(getText());
                    spannableStringBuilder5.append(this.f56164d);
                    m37861f(spannableStringBuilder5, TextView.BufferType.SPANNABLE);
                }
                super.onMeasure(i, i2);
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.setGravity(Gravity.getAbsoluteGravity(this.f56172n, i));
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public final void setGravity(int i) {
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        this.f56172n = i;
        onRtlPropertiesChanged(getLayoutDirection());
    }

    public final void setMaxLines(int i) {
        this.f56171m = i;
        super.setMaxLines(Integer.MAX_VALUE);
        this.f56167i = true;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f56162b = false;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f56168j = false;
    }
}
