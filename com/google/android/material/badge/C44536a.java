package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.C44727az;
import com.google.android.material.internal.C44729ba;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3512i.C44698h;
import com.google.android.material.p3515l.C44779j;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* renamed from: com.google.android.material.badge.a */
/* compiled from: PG */
public final class C44536a extends Drawable implements C44727az {

    /* renamed from: a */
    public final WeakReference f115813a;

    /* renamed from: b */
    public final BadgeState f115814b;

    /* renamed from: c */
    public final int f115815c;

    /* renamed from: d */
    private final C44779j f115816d;

    /* renamed from: e */
    private final C44729ba f115817e;

    /* renamed from: f */
    private final Rect f115818f = new Rect();

    /* renamed from: g */
    private float f115819g;

    /* renamed from: h */
    private float f115820h;

    /* renamed from: i */
    private float f115821i;

    /* renamed from: j */
    private float f115822j;

    /* renamed from: k */
    private float f115823k;

    /* renamed from: l */
    private WeakReference f115824l;

    /* renamed from: m */
    private WeakReference f115825m;

    public C44536a(Context context, BadgeState.State state) {
        C44698h hVar;
        Context context2;
        WeakReference weakReference = new WeakReference(context);
        this.f115813a = weakReference;
        C44733be.m79298d(context);
        C44779j jVar = new C44779j();
        this.f115816d = jVar;
        C44729ba baVar = new C44729ba(this);
        this.f115817e = baVar;
        baVar.f116589a.setTextAlign(Paint.Align.CENTER);
        Context context3 = (Context) weakReference.get();
        if (!(context3 == null || baVar.f116593e == (hVar = new C44698h(context3, 2132150530)) || (context2 = (Context) weakReference.get()) == null)) {
            baVar.mo48042b(hVar, context2);
            m78729g();
        }
        BadgeState badgeState = new BadgeState(context, state);
        this.f115814b = badgeState;
        double d = (double) badgeState.f115791b.f115800f;
        Double.isNaN(d);
        this.f115815c = ((int) Math.pow(10.0d, d - 4.0d)) - 1;
        baVar.f116591c = true;
        m78729g();
        invalidateSelf();
        baVar.f116591c = true;
        m78729g();
        invalidateSelf();
        m78728f();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState.f115791b.f115796b.intValue());
        if (jVar.f116741C.f116721d != valueOf) {
            jVar.mo48124V(valueOf);
            invalidateSelf();
        }
        baVar.f116589a.setColor(badgeState.f115791b.f115797c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f115824l;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = (View) this.f115824l.get();
            WeakReference weakReference3 = this.f115825m;
            mo47479d(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m78729g();
        setVisible(badgeState.f115791b.f115806l.booleanValue(), false);
    }

    /* renamed from: e */
    private final String m78727e() {
        if (mo47476a() <= this.f115815c) {
            return NumberFormat.getInstance(this.f115814b.f115791b.f115801g).format((long) mo47476a());
        }
        Context context = (Context) this.f115813a.get();
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        return String.format(this.f115814b.f115791b.f115801g, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f115815c), "+"});
    }

    /* renamed from: f */
    private final void m78728f() {
        this.f115817e.f116589a.setAlpha(this.f115814b.f115791b.f115798d);
        invalidateSelf();
    }

    /* renamed from: g */
    private final void m78729g() {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        Context context = (Context) this.f115813a.get();
        WeakReference weakReference = this.f115824l;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f115818f);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.f115825m;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            if (this.f115814b.mo47473c()) {
                i = this.f115814b.f115791b.f115810p.intValue();
            } else {
                i = this.f115814b.f115791b.f115808n.intValue();
            }
            int intValue = i + this.f115814b.f115791b.f115812r.intValue();
            int a = this.f115814b.mo47471a();
            if (a == 8388691 || a == 8388693) {
                this.f115820h = (float) (rect2.bottom - intValue);
            } else {
                this.f115820h = (float) (rect2.top + intValue);
            }
            if (mo47476a() <= 9) {
                float f5 = !this.f115814b.mo47473c() ? this.f115814b.f115792c : this.f115814b.f115793d;
                this.f115821i = f5;
                this.f115823k = f5;
                this.f115822j = f5;
            } else {
                float f6 = this.f115814b.f115793d;
                this.f115821i = f6;
                this.f115823k = f6;
                this.f115822j = (this.f115817e.mo48041a(m78727e()) / 2.0f) + this.f115814b.f115794e;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(true != this.f115814b.mo47473c() ? R.dimen.mtrl_badge_horizontal_edge_offset : R.dimen.mtrl_badge_text_horizontal_edge_offset);
            if (this.f115814b.mo47473c()) {
                i2 = this.f115814b.f115791b.f115809o.intValue();
            } else {
                i2 = this.f115814b.mo47472b();
            }
            int intValue2 = i2 + this.f115814b.f115791b.f115811q.intValue();
            int a2 = this.f115814b.mo47471a();
            if (a2 == 8388659 || a2 == 8388691) {
                if (C2043bi.m5577f(view) == 0) {
                    int i3 = rect2.left;
                    f3 = this.f115822j;
                    f4 = (((float) i3) - f3) + ((float) dimensionPixelSize) + ((float) intValue2);
                } else {
                    int i4 = rect2.right;
                    f3 = this.f115822j;
                    f4 = ((((float) i4) + f3) - ((float) dimensionPixelSize)) - ((float) intValue2);
                }
                this.f115819g = f2;
            } else {
                if (C2043bi.m5577f(view) == 0) {
                    int i5 = rect2.right;
                    f = this.f115822j;
                    f2 = ((((float) i5) + f) - ((float) dimensionPixelSize)) - ((float) intValue2);
                } else {
                    int i6 = rect2.left;
                    f = this.f115822j;
                    f2 = (((float) i6) - f) + ((float) dimensionPixelSize) + ((float) intValue2);
                }
                this.f115819g = f2;
            }
            Rect rect3 = this.f115818f;
            float f7 = this.f115820h;
            float f8 = this.f115823k;
            rect3.set((int) (f2 - f), (int) (f7 - f8), (int) (f2 + f), (int) (f7 + f8));
            this.f115816d.mo48122T(this.f115821i);
            if (!rect.equals(this.f115818f)) {
                this.f115816d.setBounds(this.f115818f);
            }
        }
    }

    /* renamed from: a */
    public final int mo47476a() {
        if (this.f115814b.mo47473c()) {
            return this.f115814b.f115791b.f115799e;
        }
        return 0;
    }

    /* renamed from: b */
    public final FrameLayout mo47477b() {
        WeakReference weakReference = this.f115825m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo47478c() {
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo47479d(View view, FrameLayout frameLayout) {
        this.f115824l = new WeakReference(view);
        this.f115825m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m78729g();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.f115814b.f115791b.f115798d != 0 && isVisible()) {
            this.f115816d.draw(canvas);
            if (this.f115814b.mo47473c()) {
                Rect rect = new Rect();
                String e = m78727e();
                this.f115817e.f116589a.getTextBounds(e, 0, e.length(), rect);
                canvas.drawText(e, this.f115819g, this.f115820h + ((float) (rect.height() / 2)), this.f115817e.f116589a);
            }
        }
    }

    public final int getAlpha() {
        return this.f115814b.f115791b.f115798d;
    }

    public final int getIntrinsicHeight() {
        return this.f115818f.height();
    }

    public final int getIntrinsicWidth() {
        return this.f115818f.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        BadgeState badgeState = this.f115814b;
        badgeState.f115790a.f115798d = i;
        badgeState.f115791b.f115798d = i;
        m78728f();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
