package com.google.android.material.p3515l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.core.p097i.C1968c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3508e.C44654a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3514k.C44768a;
import java.util.BitSet;

/* renamed from: com.google.android.material.l.j */
/* compiled from: PG */
public class C44779j extends Drawable implements C44770aa {

    /* renamed from: a */
    private static final Paint f116740a;

    /* renamed from: C */
    public C44778i f116741C;

    /* renamed from: D */
    public final C44794y[] f116742D;

    /* renamed from: E */
    public final C44794y[] f116743E;

    /* renamed from: F */
    public final BitSet f116744F;

    /* renamed from: G */
    public boolean f116745G;

    /* renamed from: H */
    public int f116746H;

    /* renamed from: b */
    private final Matrix f116747b;

    /* renamed from: c */
    private final Path f116748c;

    /* renamed from: d */
    private final Path f116749d;

    /* renamed from: e */
    private final RectF f116750e;

    /* renamed from: f */
    private final RectF f116751f;

    /* renamed from: g */
    private final Region f116752g;

    /* renamed from: h */
    private final Region f116753h;

    /* renamed from: i */
    private C44785p f116754i;

    /* renamed from: j */
    private final Paint f116755j;

    /* renamed from: k */
    private final Paint f116756k;

    /* renamed from: l */
    private final C44768a f116757l;

    /* renamed from: m */
    private final C44787r f116758m;

    /* renamed from: n */
    private PorterDuffColorFilter f116759n;

    /* renamed from: o */
    private PorterDuffColorFilter f116760o;

    /* renamed from: p */
    private final RectF f116761p;

    /* renamed from: q */
    private final C44776g f116762q;

    static {
        Paint paint = new Paint(1);
        f116740a = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C44779j() {
        this(new C44785p());
    }

    /* renamed from: a */
    private final float mo47749a() {
        if (m79388f()) {
            return this.f116756k.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    private static int m79384b(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: d */
    private final RectF mo47751d() {
        this.f116751f.set(mo48117N());
        float a = mo47749a();
        this.f116751f.inset(a, a);
        return this.f116751f;
    }

    /* renamed from: e */
    private final void m79387e(RectF rectF, Path path) {
        mo48118P(rectF, path);
        if (this.f116741C.f116727j != 1.0f) {
            this.f116747b.reset();
            Matrix matrix = this.f116747b;
            float f = this.f116741C.f116727j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f116747b);
        }
        path.computeBounds(this.f116761p, true);
    }

    /* renamed from: f */
    private final boolean m79388f() {
        return (this.f116741C.f116739v == Paint.Style.FILL_AND_STROKE || this.f116741C.f116739v == Paint.Style.STROKE) && this.f116756k.getStrokeWidth() > 0.0f;
    }

    /* renamed from: g */
    private final boolean m79389g(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (!(this.f116741C.f116721d == null || (color2 = this.f116755j.getColor()) == (colorForState2 = this.f116741C.f116721d.getColorForState(iArr, color2)))) {
            this.f116755j.setColor(colorForState2);
            z = true;
        }
        if (this.f116741C.f116722e == null || (color = this.f116756k.getColor()) == (colorForState = this.f116741C.f116722e.getColorForState(iArr, color))) {
            return z;
        }
        this.f116756k.setColor(colorForState);
        return true;
    }

    /* renamed from: h */
    private final boolean m79390h() {
        PorterDuffColorFilter porterDuffColorFilter = this.f116759n;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f116760o;
        C44778i iVar = this.f116741C;
        this.f116759n = m79385c(iVar.f116724g, iVar.f116725h, this.f116755j, true);
        C44778i iVar2 = this.f116741C;
        ColorStateList colorStateList = iVar2.f116723f;
        this.f116760o = m79385c((ColorStateList) null, iVar2.f116725h, this.f116756k, false);
        boolean z = this.f116741C.f116738u;
        if (!C1968c.m5305b(porterDuffColorFilter, this.f116759n) || !C1968c.m5305b(porterDuffColorFilter2, this.f116760o)) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final float mo48115L() {
        return this.f116741C.f116718a.f116784f.mo48107a(mo48117N());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final int mo48116M(int i) {
        C44778i iVar = this.f116741C;
        float f = iVar.f116732o;
        float f2 = iVar.f116733p;
        float f3 = f + 0.0f + iVar.f116731n;
        C44654a aVar = iVar.f116719b;
        return aVar != null ? aVar.mo47887b(i, f3) : i;
    }

    /* renamed from: N */
    public final RectF mo48117N() {
        this.f116750e.set(getBounds());
        return this.f116750e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo48118P(RectF rectF, Path path) {
        C44787r rVar = this.f116758m;
        C44778i iVar = this.f116741C;
        C44785p pVar = iVar.f116718a;
        float f = iVar.f116728k;
        rVar.mo48153a(pVar, f, rectF, this.f116762q, path);
    }

    /* renamed from: Q */
    public final void mo48119Q(Canvas canvas, Paint paint, Path path, C44785p pVar, RectF rectF) {
        if (pVar.mo48152c(rectF)) {
            float a = pVar.f116785g.mo48107a(rectF) * this.f116741C.f116728k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo48120R(Canvas canvas) {
        mo48119Q(canvas, this.f116756k, this.f116749d, this.f116754i, mo47751d());
    }

    /* renamed from: S */
    public final void mo48121S(Context context) {
        this.f116741C.f116719b = new C44654a(context);
        mo48130ab();
    }

    /* renamed from: T */
    public final void mo48122T(float f) {
        mo47555l(this.f116741C.f116718a.mo48151b(f));
    }

    /* renamed from: U */
    public final void mo48123U(float f) {
        C44778i iVar = this.f116741C;
        if (iVar.f116732o != f) {
            iVar.f116732o = f;
            mo48130ab();
        }
    }

    /* renamed from: V */
    public final void mo48124V(ColorStateList colorStateList) {
        C44778i iVar = this.f116741C;
        if (iVar.f116721d != colorStateList) {
            iVar.f116721d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: W */
    public final void mo48125W(float f) {
        C44778i iVar = this.f116741C;
        if (iVar.f116728k != f) {
            iVar.f116728k = f;
            this.f116745G = true;
            invalidateSelf();
        }
    }

    /* renamed from: X */
    public final void mo48126X(Paint.Style style) {
        this.f116741C.f116739v = style;
        super.invalidateSelf();
    }

    /* renamed from: Y */
    public final void mo48127Y(float f, int i) {
        mo48129aa(f);
        mo48128Z(ColorStateList.valueOf(i));
    }

    /* renamed from: Z */
    public final void mo48128Z(ColorStateList colorStateList) {
        C44778i iVar = this.f116741C;
        if (iVar.f116722e != colorStateList) {
            iVar.f116722e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: aa */
    public final void mo48129aa(float f) {
        this.f116741C.f116729l = f;
        invalidateSelf();
    }

    /* renamed from: ab */
    public final void mo48130ab() {
        C44778i iVar = this.f116741C;
        float f = iVar.f116732o;
        float f2 = iVar.f116733p;
        float f3 = f + 0.0f;
        iVar.f116735r = (int) Math.ceil((double) (0.75f * f3));
        this.f116741C.f116736s = (int) Math.ceil((double) (f3 * 0.25f));
        m79390h();
        super.invalidateSelf();
    }

    /* renamed from: ac */
    public final boolean mo48131ac() {
        return this.f116741C.f116718a.mo48152c(mo48117N());
    }

    /* renamed from: ad */
    public final void mo48132ad() {
        this.f116757l.mo48106a(-12303292);
        this.f116741C.f116738u = false;
        super.invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f116755j.setColorFilter(this.f116759n);
        int alpha = this.f116755j.getAlpha();
        this.f116755j.setAlpha(m79384b(alpha, this.f116741C.f116730m));
        this.f116756k.setColorFilter(this.f116760o);
        this.f116756k.setStrokeWidth(this.f116741C.f116729l);
        int alpha2 = this.f116756k.getAlpha();
        this.f116756k.setAlpha(m79384b(alpha2, this.f116741C.f116730m));
        if (this.f116745G) {
            float f = -mo47749a();
            C44785p pVar = this.f116741C.f116718a;
            C44784o oVar = new C44784o(pVar);
            oVar.f116771e = C44777h.m79381a(pVar.f116784f, f);
            oVar.f116772f = C44777h.m79381a(pVar.f116785g, f);
            oVar.f116774h = C44777h.m79381a(pVar.f116787i, f);
            oVar.f116773g = C44777h.m79381a(pVar.f116786h, f);
            C44785p pVar2 = new C44785p(oVar);
            this.f116754i = pVar2;
            this.f116758m.mo48153a(pVar2, this.f116741C.f116728k, mo47751d(), (C44776g) null, this.f116749d);
            m79387e(mo48117N(), this.f116748c);
            this.f116745G = false;
        }
        C44778i iVar = this.f116741C;
        int i = iVar.f116734q;
        if (iVar.f116735r > 0 && !mo48131ac()) {
            this.f116748c.isConvex();
        }
        if (this.f116741C.f116739v == Paint.Style.FILL_AND_STROKE || this.f116741C.f116739v == Paint.Style.FILL) {
            mo48119Q(canvas, this.f116755j, this.f116748c, this.f116741C.f116718a, mo48117N());
        }
        if (m79388f()) {
            mo48120R(canvas);
        }
        this.f116755j.setAlpha(alpha);
        this.f116756k.setAlpha(alpha2);
    }

    public int getAlpha() {
        return this.f116741C.f116730m;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f116741C;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        int i = this.f116741C.f116734q;
        if (mo48131ac()) {
            outline.setRoundRect(getBounds(), mo48115L() * this.f116741C.f116728k);
            return;
        }
        m79387e(mo48117N(), this.f116748c);
        this.f116748c.isConvex();
        try {
            outline.setConvexPath(this.f116748c);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f116741C.f116726i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.f116752g.set(getBounds());
        m79387e(mo48117N(), this.f116748c);
        this.f116753h.setPath(this.f116748c, this.f116752g);
        this.f116752g.op(this.f116753h, Region.Op.DIFFERENCE);
        return this.f116752g;
    }

    public final void invalidateSelf() {
        this.f116745G = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f116741C.f116724g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        C44778i iVar = this.f116741C;
        ColorStateList colorStateList2 = iVar.f116723f;
        ColorStateList colorStateList3 = iVar.f116722e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f116741C.f116721d;
        if (colorStateList4 == null || !colorStateList4.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo47555l(C44785p pVar) {
        this.f116741C.f116718a = pVar;
        invalidateSelf();
    }

    public final Drawable mutate() {
        this.f116741C = new C44778i(this.f116741C);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f116745G = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean g = m79389g(iArr);
        boolean h = m79390h();
        boolean z = true;
        if (!g && !h) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void setAlpha(int i) {
        C44778i iVar = this.f116741C;
        if (iVar.f116730m != i) {
            iVar.f116730m = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f116741C.f116720c = colorFilter;
        super.invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f116741C.f116724g = colorStateList;
        m79390h();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C44778i iVar = this.f116741C;
        if (iVar.f116725h != mode) {
            iVar.f116725h = mode;
            m79390h();
            super.invalidateSelf();
        }
    }

    public C44779j(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new C44785p(C44785p.m79428e(context, attributeSet, i, i2)));
    }

    /* renamed from: O */
    public static C44779j m79382O(Context context, float f) {
        int e = C44535e.m78722e(context, C44693c.m79227c(context, R.attr.colorSurface, "j"));
        C44779j jVar = new C44779j();
        jVar.mo48121S(context);
        jVar.mo48124V(ColorStateList.valueOf(e));
        jVar.mo48123U(f);
        return jVar;
    }

    public C44779j(C44778i iVar) {
        C44787r rVar;
        this.f116742D = new C44794y[4];
        this.f116743E = new C44794y[4];
        this.f116744F = new BitSet(8);
        this.f116747b = new Matrix();
        this.f116748c = new Path();
        this.f116749d = new Path();
        this.f116750e = new RectF();
        this.f116751f = new RectF();
        this.f116752g = new Region();
        this.f116753h = new Region();
        Paint paint = new Paint(1);
        this.f116755j = paint;
        Paint paint2 = new Paint(1);
        this.f116756k = paint2;
        this.f116757l = new C44768a((byte[]) null);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            rVar = C44786q.f116792a;
        } else {
            rVar = new C44787r();
        }
        this.f116758m = rVar;
        this.f116761p = new RectF();
        this.f116741C = iVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m79390h();
        m79389g(getState());
        this.f116762q = new C44776g(this);
    }

    /* renamed from: c */
    private final PorterDuffColorFilter m79385c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                int color = paint.getColor();
                int M = mo48116M(color);
                this.f116746H = M;
                if (M != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(M, PorterDuff.Mode.SRC_IN);
                }
            }
            return porterDuffColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo48116M(colorForState);
        }
        this.f116746H = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public C44779j(C44785p pVar) {
        this(new C44778i(pVar));
    }
}
