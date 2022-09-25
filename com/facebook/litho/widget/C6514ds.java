package com.facebook.litho.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.litho.C6353gf;
import com.facebook.litho.TextContent;
import com.google.android.libraries.elements.p1714d.C20905da;
import com.google.android.libraries.elements.p1714d.C20906db;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.litho.widget.ds */
/* compiled from: PG */
public final class C6514ds extends Drawable implements TextContent, Drawable.Callback, C6353gf {

    /* renamed from: p */
    private static final Point[] f19337p = {new Point(0, 0), new Point(0, -12), new Point(-12, -12), new Point(-12, 0), new Point(-12, 12), new Point(0, 12), new Point(12, 12), new Point(12, 0), new Point(12, -12), new Point(0, -24), new Point(-24, -24), new Point(-24, 0), new Point(-24, 24), new Point(0, 24), new Point(24, 24), new Point(24, 0), new Point(24, -24)};

    /* renamed from: a */
    public Layout f19338a;

    /* renamed from: c */
    public float f19339c;

    /* renamed from: d */
    public boolean f19340d;

    /* renamed from: e */
    public boolean f19341e;

    /* renamed from: f */
    public CharSequence f19342f;

    /* renamed from: g */
    public ColorStateList f19343g;

    /* renamed from: h */
    public int f19344h;

    /* renamed from: i */
    public int f19345i;

    /* renamed from: j */
    public ImageSpan[] f19346j;

    /* renamed from: k */
    public C6513dr f19347k;

    /* renamed from: l */
    public boolean f19348l;

    /* renamed from: m */
    public Handler f19349m;

    /* renamed from: n */
    public String f19350n;

    /* renamed from: o */
    public C20906db f19351o;

    /* renamed from: q */
    private int f19352q;

    /* renamed from: r */
    private int f19353r;

    /* renamed from: s */
    private Path f19354s;

    /* renamed from: t */
    private boolean f19355t;

    /* renamed from: u */
    private Paint f19356u;

    /* renamed from: v */
    private C6512dq f19357v;

    /* renamed from: b */
    private final int m17669b(int i, int i2) {
        float f;
        float f2;
        int lineForVertical = this.f19338a.getLineForVertical(i2);
        if (this.f19338a.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            f2 = this.f19338a.getLineLeft(lineForVertical);
            f = this.f19338a.getLineRight(lineForVertical);
        } else {
            boolean z = this.f19338a.getParagraphDirection(lineForVertical) == -1;
            float width = z ? ((float) this.f19338a.getWidth()) - this.f19338a.getLineMax(lineForVertical) : (float) this.f19338a.getParagraphLeft(lineForVertical);
            f = z ? (float) this.f19338a.getParagraphRight(lineForVertical) : this.f19338a.getLineMax(lineForVertical);
            f2 = width;
        }
        float f3 = (float) i;
        if (f3 >= f2 && f3 <= f) {
            try {
                return this.f19338a.getOffsetForHorizontal(lineForVertical, f3);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    /* renamed from: e */
    private final ClickableSpan m17670e(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        int b = m17669b(i, i2);
        if (b >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.f19342f).getSpans(b, b, ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
            return clickableSpanArr[0];
        }
        return null;
    }

    /* renamed from: f */
    private final void m17671f() {
        Handler handler = this.f19349m;
        if (handler != null) {
            handler.removeCallbacks(this.f19357v);
            this.f19357v = null;
        }
        this.f19348l = false;
    }

    /* renamed from: g */
    private static boolean m17672g(Rect rect, MotionEvent motionEvent) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* renamed from: h */
    private final boolean m17673h(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 0) {
                actionMasked = 0;
            } else {
                z = false;
                return (!this.f19341e && !m17672g(getBounds(), motionEvent) && z) || actionMasked == 3;
            }
        }
        z = true;
        if (!this.f19341e && !m17672g(getBounds(), motionEvent)) {
        }
    }

    /* renamed from: i */
    private final boolean m17674i(MotionEvent motionEvent) {
        return (!this.f19341e || this.f19349m == null || motionEvent.getAction() == 0) ? false : true;
    }

    /* renamed from: a */
    public final void mo13591a(int i, int i2) {
        if (Color.alpha(this.f19345i) == 0) {
            return;
        }
        if (this.f19352q != i || this.f19353r != i2) {
            this.f19352q = i;
            this.f19353r = i2;
            Paint paint = this.f19356u;
            if (paint == null) {
                Paint paint2 = new Paint();
                this.f19356u = paint2;
                paint2.setColor(this.f19345i);
            } else {
                paint.setColor(this.f19345i);
            }
            this.f19355t = true;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public final boolean mo13194c(MotionEvent motionEvent, View view) {
        ClickableSpan clickableSpan;
        C20905da[] daVarArr;
        MotionEvent motionEvent2 = motionEvent;
        View view2 = view;
        if (m17673h(motionEvent) || m17674i(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3) {
                mo13591a(0, 0);
                m17671f();
            } else {
                if (actionMasked == 2) {
                    if (!this.f19348l && this.f19357v != null) {
                        Rect bounds = getBounds();
                        if (!m17672g(bounds, motionEvent2)) {
                            m17671f();
                        } else {
                            float x = motionEvent.getX();
                            if (this.f19357v.f19334a != m17670e(((int) x) - bounds.left, ((int) motionEvent.getY()) - bounds.top)) {
                                m17671f();
                            }
                        }
                    }
                    actionMasked = 2;
                }
                boolean z = !this.f19348l;
                if (actionMasked == 1) {
                    m17671f();
                    actionMasked = 1;
                }
                Rect bounds2 = getBounds();
                if (m17672g(bounds2, motionEvent2)) {
                    int x2 = ((int) motionEvent.getX()) - bounds2.left;
                    int y = ((int) motionEvent.getY()) - bounds2.top;
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
                        Point[] pointArr = f19337p;
                        int length = pointArr.length;
                        ClickableSpan clickableSpan2 = null;
                        int i = 0;
                        loop0:
                        while (true) {
                            if (i >= 17) {
                                break;
                            }
                            Point point = pointArr[i];
                            C20906db dbVar = this.f19351o;
                            if (dbVar != null && (daVarArr = dbVar.f58613a) != null) {
                                int length2 = daVarArr.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length2) {
                                        if (daVarArr[i2].mo26045e(x2, y)) {
                                            break loop0;
                                        }
                                        i2++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                            clickableSpan2 = m17670e(point.x + x2, point.y + y);
                            if (clickableSpan2 != null) {
                                break;
                            }
                            int b = m17669b(point.x + x2, point.y + y);
                            if (((C6528ef[]) ((Spanned) this.f19342f).getSpans(b, b, C6528ef.class)).length > 0) {
                                clickableSpan = null;
                                break;
                            }
                            i++;
                        }
                        clickableSpan = clickableSpan2;
                    } else {
                        clickableSpan = m17670e(x2, y);
                    }
                    if (clickableSpan == null) {
                        mo13591a(0, 0);
                    } else {
                        if (actionMasked == 1) {
                            mo13591a(0, 0);
                            if (z) {
                                clickableSpan.onClick(view2);
                            }
                        } else if (actionMasked == 0) {
                            if (clickableSpan instanceof C6434at) {
                                C6512dq dqVar = new C6512dq(this, (C6434at) clickableSpan, view2);
                                this.f19357v = dqVar;
                                this.f19349m.postDelayed(dqVar, (long) ViewConfiguration.getLongPressTimeout());
                            }
                            Spanned spanned = (Spanned) this.f19342f;
                            mo13591a(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo13195d(MotionEvent motionEvent) {
        return m17673h(motionEvent) || m17674i(motionEvent);
    }

    public final void draw(Canvas canvas) {
        int i;
        if (this.f19338a != null) {
            int save = canvas.save();
            Rect bounds = getBounds();
            if (this.f19340d) {
                canvas.clipRect(bounds);
            }
            canvas.translate((float) bounds.left, ((float) bounds.top) + this.f19339c);
            C20906db dbVar = this.f19351o;
            Path path = null;
            int i2 = 0;
            if (dbVar != null) {
                i = dbVar.mo26048a() ? canvas.saveLayer(new RectF(0.0f, 0.0f, (float) getBounds().width(), (float) getBounds().height()), (Paint) null) : 0;
                C20905da[] daVarArr = this.f19351o.f58613a;
                if (daVarArr != null) {
                    for (C20905da b : daVarArr) {
                        b.mo26042b(canvas);
                    }
                }
            } else {
                i = 0;
            }
            try {
                Layout layout = this.f19338a;
                if (this.f19352q != this.f19353r) {
                    if (Color.alpha(this.f19345i) != 0) {
                        if (this.f19355t) {
                            if (this.f19354s == null) {
                                this.f19354s = new Path();
                            }
                            this.f19338a.getSelectionPath(this.f19352q, this.f19353r, this.f19354s);
                            this.f19355t = false;
                        }
                        path = this.f19354s;
                    }
                }
                layout.draw(canvas, path, this.f19356u, 0);
                C20906db dbVar2 = this.f19351o;
                if (dbVar2 != null) {
                    C20905da[] daVarArr2 = dbVar2.f58613a;
                    if (daVarArr2 != null) {
                        int length = daVarArr2.length;
                        while (i2 < length) {
                            daVarArr2[i2].mo26041a(canvas);
                            i2++;
                        }
                    }
                    if (this.f19351o.mo26048a()) {
                        canvas.restoreToCount(i);
                    }
                }
                canvas.restoreToCount(save);
            } catch (IndexOutOfBoundsException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(" [");
                sb.append(this.f19350n);
                sb.append("] ");
                CharSequence charSequence = this.f19342f;
                if (charSequence instanceof SpannableStringBuilder) {
                    Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                    sb.append("spans: ");
                    int length2 = spans.length;
                    while (i2 < length2) {
                        sb.append(spans[i2].getClass().getSimpleName());
                        sb.append(", ");
                        i2++;
                    }
                }
                sb.append("ellipsizedWidth: ");
                sb.append(this.f19338a.getEllipsizedWidth());
                sb.append(", lineCount: ");
                sb.append(this.f19338a.getLineCount());
                throw new IndexOutOfBoundsException(String.valueOf(message).concat(sb.toString()));
            }
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final List getTextItems() {
        CharSequence charSequence = this.f19342f;
        return charSequence != null ? Collections.singletonList(charSequence) : Collections.emptyList();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isStateful() {
        return this.f19343g != null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r0.getPaint().getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r4) {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f19343g
            if (r0 == 0) goto L_0x0026
            android.text.Layout r0 = r3.f19338a
            if (r0 == 0) goto L_0x0026
            android.text.TextPaint r0 = r0.getPaint()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r1 = r3.f19343g
            int r2 = r3.f19344h
            int r1 = r1.getColorForState(r4, r2)
            if (r1 == r0) goto L_0x0026
            android.text.Layout r0 = r3.f19338a
            android.text.TextPaint r0 = r0.getPaint()
            r0.setColor(r1)
            r3.invalidateSelf()
        L_0x0026:
            boolean r4 = super.onStateChange(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6514ds.onStateChange(int[]):boolean");
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
