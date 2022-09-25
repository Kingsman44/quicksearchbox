package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.graphics.drawable.C1930c;
import androidx.core.graphics.drawable.C1931d;
import com.evernote.android.state.BuildConfig;
import com.google.android.material.internal.C44727az;
import com.google.android.material.internal.C44729ba;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3507d.C44603a;
import com.google.android.material.p3512i.C44698h;
import com.google.android.material.p3513j.C44767a;
import com.google.android.material.p3515l.C44779j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.chip.f */
/* compiled from: PG */
public final class C44596f extends C44779j implements Drawable.Callback, C44727az {

    /* renamed from: I */
    private static final int[] f116122I = {16842910};

    /* renamed from: J */
    private static final ShapeDrawable f116123J = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public int f116124A;

    /* renamed from: B */
    public boolean f116125B;

    /* renamed from: K */
    private float f116126K;

    /* renamed from: L */
    private boolean f116127L;

    /* renamed from: M */
    private Drawable f116128M;

    /* renamed from: N */
    private ColorStateList f116129N;

    /* renamed from: O */
    private float f116130O;

    /* renamed from: P */
    private boolean f116131P;

    /* renamed from: Q */
    private Drawable f116132Q;

    /* renamed from: R */
    private boolean f116133R;

    /* renamed from: S */
    private float f116134S;

    /* renamed from: T */
    private float f116135T;

    /* renamed from: U */
    private final Paint f116136U = new Paint(1);

    /* renamed from: V */
    private final Paint.FontMetrics f116137V = new Paint.FontMetrics();

    /* renamed from: W */
    private final RectF f116138W = new RectF();

    /* renamed from: X */
    private final PointF f116139X = new PointF();

    /* renamed from: Y */
    private final Path f116140Y = new Path();

    /* renamed from: Z */
    private int f116141Z;

    /* renamed from: a */
    public ColorStateList f116142a;

    /* renamed from: aa */
    private int f116143aa;

    /* renamed from: ab */
    private int f116144ab;

    /* renamed from: ac */
    private int f116145ac;

    /* renamed from: ad */
    private int f116146ad;

    /* renamed from: ae */
    private boolean f116147ae;

    /* renamed from: af */
    private int f116148af;

    /* renamed from: ag */
    private int f116149ag = PrivateKeyType.INVALID;

    /* renamed from: ah */
    private ColorFilter f116150ah;

    /* renamed from: ai */
    private PorterDuffColorFilter f116151ai;

    /* renamed from: aj */
    private ColorStateList f116152aj;

    /* renamed from: ak */
    private PorterDuff.Mode f116153ak = PorterDuff.Mode.SRC_IN;

    /* renamed from: al */
    private int[] f116154al;

    /* renamed from: am */
    private WeakReference f116155am = new WeakReference((Object) null);

    /* renamed from: b */
    public ColorStateList f116156b;

    /* renamed from: c */
    public float f116157c;

    /* renamed from: d */
    public float f116158d = -1.0f;

    /* renamed from: e */
    public ColorStateList f116159e;

    /* renamed from: f */
    public ColorStateList f116160f;

    /* renamed from: g */
    public CharSequence f116161g;

    /* renamed from: h */
    public boolean f116162h;

    /* renamed from: i */
    public Drawable f116163i;

    /* renamed from: j */
    public ColorStateList f116164j;

    /* renamed from: k */
    public float f116165k;

    /* renamed from: l */
    public CharSequence f116166l;

    /* renamed from: m */
    public boolean f116167m;

    /* renamed from: n */
    public Drawable f116168n;

    /* renamed from: o */
    public ColorStateList f116169o;

    /* renamed from: p */
    public float f116170p;

    /* renamed from: q */
    public float f116171q;

    /* renamed from: r */
    public float f116172r;

    /* renamed from: s */
    public float f116173s;

    /* renamed from: t */
    public float f116174t;

    /* renamed from: u */
    public float f116175u;

    /* renamed from: v */
    public final Context f116176v;

    /* renamed from: w */
    public final C44729ba f116177w;

    /* renamed from: x */
    public boolean f116178x;

    /* renamed from: y */
    public TextUtils.TruncateAt f116179y;

    /* renamed from: z */
    public boolean f116180z;

    public C44596f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo48121S(context);
        this.f116176v = context;
        C44729ba baVar = new C44729ba(this);
        this.f116177w = baVar;
        this.f116161g = BuildConfig.FLAVOR;
        baVar.f116589a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f116122I;
        setState(iArr);
        mo47747I(iArr);
        this.f116180z = true;
        int i3 = C44767a.f116704a;
        f116123J.setTint(-1);
    }

    /* renamed from: H */
    public static boolean m78972H(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: K */
    public static final void m78973K(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: ae */
    private final float m78974ae() {
        Drawable drawable = this.f116147ae ? this.f116168n : this.f116128M;
        float f = this.f116130O;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: af */
    private final ColorFilter m78975af() {
        ColorFilter colorFilter = this.f116150ah;
        return colorFilter != null ? colorFilter : this.f116151ai;
    }

    /* renamed from: ag */
    private final void m78976ag(Rect rect, RectF rectF) {
        Drawable drawable;
        rectF.setEmpty();
        if (m78980ak() || m78979aj()) {
            float f = this.f116170p + this.f116134S;
            float ae = m78974ae();
            if (C1930c.m5229a(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + ae;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - ae;
            }
            if (this.f116147ae) {
                drawable = this.f116168n;
            } else {
                drawable = this.f116128M;
            }
            float f2 = this.f116130O;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) Math.ceil((double) C44741bm.m79308a(this.f116176v, 24));
                if (((float) drawable.getIntrinsicHeight()) <= f2) {
                    f2 = (float) drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* renamed from: ah */
    private static boolean m78977ah(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0127  */
    /* renamed from: ai */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m78978ai(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.f116142a
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.f116141Z
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r8.mo48116M(r1)
            int r3 = r8.f116141Z
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r8.f116141Z = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r8.f116156b
            if (r3 == 0) goto L_0x0028
            int r5 = r8.f116143aa
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r8.mo48116M(r3)
            int r5 = r8.f116143aa
            if (r5 == r3) goto L_0x0034
            r8.f116143aa = r3
            r0 = 1
        L_0x0034:
            int r1 = androidx.core.graphics.C1924a.m5188g(r3, r1)
            int r3 = r8.f116144ab
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            com.google.android.material.l.i r5 = r8.f116741C
            android.content.res.ColorStateList r5 = r5.f116721d
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r8.f116144ab = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.mo48124V(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r8.f116159e
            if (r1 == 0) goto L_0x0060
            int r3 = r8.f116145ac
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r8.f116145ac
            if (r3 == r1) goto L_0x0068
            r8.f116145ac = r1
            r0 = 1
        L_0x0068:
            com.google.android.material.internal.ba r1 = r8.f116177w
            com.google.android.material.i.h r1 = r1.f116593e
            if (r1 == 0) goto L_0x0079
            android.content.res.ColorStateList r1 = r1.f116503j
            if (r1 == 0) goto L_0x0079
            int r3 = r8.f116146ad
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            int r3 = r8.f116146ad
            if (r3 == r1) goto L_0x0081
            r8.f116146ad = r1
            r0 = 1
        L_0x0081:
            int[] r1 = r8.getState()
            if (r1 != 0) goto L_0x0089
        L_0x0087:
            r1 = 0
            goto L_0x009d
        L_0x0089:
            int r3 = r1.length
            r5 = 0
        L_0x008b:
            if (r5 >= r3) goto L_0x0087
            r6 = r1[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto L_0x009a
            boolean r1 = r8.f116167m
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x009d
        L_0x009a:
            int r5 = r5 + 1
            goto L_0x008b
        L_0x009d:
            boolean r3 = r8.f116147ae
            if (r3 == r1) goto L_0x00b7
            android.graphics.drawable.Drawable r3 = r8.f116168n
            if (r3 == 0) goto L_0x00b7
            float r0 = r8.mo47749a()
            r8.f116147ae = r1
            float r1 = r8.mo47749a()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            r0 = 1
            r1 = 1
            goto L_0x00b8
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            r1 = 0
        L_0x00b8:
            android.content.res.ColorStateList r3 = r8.f116152aj
            if (r3 == 0) goto L_0x00c3
            int r5 = r8.f116148af
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00c4
        L_0x00c3:
            r3 = 0
        L_0x00c4:
            int r5 = r8.f116148af
            if (r5 == r3) goto L_0x00d5
            r8.f116148af = r3
            android.content.res.ColorStateList r0 = r8.f116152aj
            android.graphics.PorterDuff$Mode r3 = r8.f116153ak
            android.graphics.PorterDuffColorFilter r0 = com.google.android.material.p3507d.C44603a.m79017a(r8, r0, r3)
            r8.f116151ai = r0
            goto L_0x00d6
        L_0x00d5:
            r4 = r0
        L_0x00d6:
            android.graphics.drawable.Drawable r0 = r8.f116128M
            boolean r0 = m78972H(r0)
            if (r0 == 0) goto L_0x00e5
            android.graphics.drawable.Drawable r0 = r8.f116128M
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x00e5:
            android.graphics.drawable.Drawable r0 = r8.f116168n
            boolean r0 = m78972H(r0)
            if (r0 == 0) goto L_0x00f4
            android.graphics.drawable.Drawable r0 = r8.f116168n
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x00f4:
            android.graphics.drawable.Drawable r0 = r8.f116163i
            boolean r0 = m78972H(r0)
            if (r0 == 0) goto L_0x010f
            int r0 = r9.length
            int r3 = r10.length
            int r5 = r0 + r3
            int[] r5 = new int[r5]
            java.lang.System.arraycopy(r9, r2, r5, r2, r0)
            java.lang.System.arraycopy(r10, r2, r5, r0, r3)
            android.graphics.drawable.Drawable r9 = r8.f116163i
            boolean r9 = r9.setState(r5)
            r4 = r4 | r9
        L_0x010f:
            int r9 = com.google.android.material.p3513j.C44767a.f116704a
            android.graphics.drawable.Drawable r9 = r8.f116132Q
            boolean r9 = m78972H(r9)
            if (r9 == 0) goto L_0x0120
            android.graphics.drawable.Drawable r9 = r8.f116132Q
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0120:
            if (r4 == 0) goto L_0x0125
            r8.invalidateSelf()
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r8.mo47755g()
        L_0x012a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C44596f.m78978ai(int[], int[]):boolean");
    }

    /* renamed from: aj */
    private final boolean m78979aj() {
        return this.f116133R && this.f116168n != null && this.f116147ae;
    }

    /* renamed from: ak */
    private final boolean m78980ak() {
        return this.f116127L && this.f116128M != null;
    }

    /* renamed from: A */
    public final void mo47740A(float f) {
        if (this.f116134S != f) {
            float a = mo47749a();
            this.f116134S = f;
            float a2 = mo47749a();
            invalidateSelf();
            if (a != a2) {
                mo47755g();
            }
        }
    }

    /* renamed from: B */
    public final void mo47741B(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.f116161g, charSequence)) {
            this.f116161g = charSequence;
            this.f116177w.f116591c = true;
            invalidateSelf();
            mo47755g();
        }
    }

    /* renamed from: C */
    public final void mo47742C(C44698h hVar) {
        this.f116177w.mo48042b(hVar, this.f116176v);
    }

    /* renamed from: D */
    public final void mo47743D(int i) {
        mo47742C(new C44698h(this.f116176v, i));
    }

    /* renamed from: E */
    public final void mo47744E(float f) {
        if (this.f116172r != f) {
            this.f116172r = f;
            invalidateSelf();
            mo47755g();
        }
    }

    /* renamed from: F */
    public final void mo47745F(float f) {
        if (this.f116171q != f) {
            this.f116171q = f;
            invalidateSelf();
            mo47755g();
        }
    }

    /* renamed from: G */
    public final boolean mo47746G() {
        return this.f116133R && this.f116168n != null && this.f116167m;
    }

    /* renamed from: I */
    public final boolean mo47747I(int[] iArr) {
        if (Arrays.equals(this.f116154al, iArr)) {
            return false;
        }
        this.f116154al = iArr;
        if (mo47748J()) {
            return m78978ai(getState(), iArr);
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo47748J() {
        return this.f116162h && this.f116163i != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo47749a() {
        if (m78980ak() || m78979aj()) {
            return this.f116134S + m78974ae() + this.f116135T;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo47750b() {
        if (mo47748J()) {
            return this.f116173s + this.f116165k + this.f116174t;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final void mo47478c() {
        mo47755g();
        invalidateSelf();
    }

    /* renamed from: d */
    public final float mo47751d() {
        return this.f116125B ? mo48115L() : this.f116158d;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f116149ag) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f116149ag) : 0;
            if (!this.f116125B) {
                this.f116136U.setColor(this.f116141Z);
                this.f116136U.setStyle(Paint.Style.FILL);
                this.f116138W.set(bounds);
                canvas2.drawRoundRect(this.f116138W, mo47751d(), mo47751d(), this.f116136U);
            }
            if (!this.f116125B) {
                this.f116136U.setColor(this.f116143aa);
                this.f116136U.setStyle(Paint.Style.FILL);
                this.f116136U.setColorFilter(m78975af());
                this.f116138W.set(bounds);
                canvas2.drawRoundRect(this.f116138W, mo47751d(), mo47751d(), this.f116136U);
            }
            if (this.f116125B) {
                super.draw(canvas);
            }
            if (this.f116126K > 0.0f && !this.f116125B) {
                this.f116136U.setColor(this.f116145ac);
                this.f116136U.setStyle(Paint.Style.STROKE);
                if (!this.f116125B) {
                    this.f116136U.setColorFilter(m78975af());
                }
                this.f116138W.set(((float) bounds.left) + (this.f116126K / 2.0f), ((float) bounds.top) + (this.f116126K / 2.0f), ((float) bounds.right) - (this.f116126K / 2.0f), ((float) bounds.bottom) - (this.f116126K / 2.0f));
                float f = this.f116158d - (this.f116126K / 2.0f);
                canvas2.drawRoundRect(this.f116138W, f, f, this.f116136U);
            }
            this.f116136U.setColor(0);
            this.f116136U.setStyle(Paint.Style.FILL);
            this.f116138W.set(bounds);
            if (!this.f116125B) {
                canvas2.drawRoundRect(this.f116138W, mo47751d(), mo47751d(), this.f116136U);
            } else {
                mo48118P(new RectF(bounds), this.f116140Y);
                super.mo48119Q(canvas, this.f116136U, this.f116140Y, this.f116741C.f116718a, mo48117N());
            }
            if (m78980ak()) {
                m78976ag(bounds, this.f116138W);
                float f2 = this.f116138W.left;
                float f3 = this.f116138W.top;
                canvas2.translate(f2, f3);
                this.f116128M.setBounds(0, 0, (int) this.f116138W.width(), (int) this.f116138W.height());
                this.f116128M.draw(canvas2);
                canvas2.translate(-f2, -f3);
            }
            if (m78979aj()) {
                m78976ag(bounds, this.f116138W);
                float f4 = this.f116138W.left;
                float f5 = this.f116138W.top;
                canvas2.translate(f4, f5);
                this.f116168n.setBounds(0, 0, (int) this.f116138W.width(), (int) this.f116138W.height());
                this.f116168n.draw(canvas2);
                canvas2.translate(-f4, -f5);
            }
            if (!this.f116180z || this.f116161g == null) {
                i2 = saveLayerAlpha;
                i4 = 0;
                i3 = PrivateKeyType.INVALID;
            } else {
                PointF pointF = this.f116139X;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f116161g != null) {
                    float a = this.f116170p + mo47749a() + this.f116171q;
                    if (C1930c.m5229a(this) == 0) {
                        pointF.x = ((float) bounds.left) + a;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - a;
                        align = Paint.Align.RIGHT;
                    }
                    int centerY = bounds.centerY();
                    this.f116177w.f116589a.getFontMetrics(this.f116137V);
                    pointF.y = ((float) centerY) - ((this.f116137V.descent + this.f116137V.ascent) / 2.0f);
                }
                RectF rectF = this.f116138W;
                rectF.setEmpty();
                if (this.f116161g != null) {
                    float a2 = this.f116170p + mo47749a() + this.f116171q;
                    float b = this.f116175u + mo47750b() + this.f116172r;
                    if (C1930c.m5229a(this) == 0) {
                        rectF.left = ((float) bounds.left) + a2;
                        rectF.right = ((float) bounds.right) - b;
                    } else {
                        rectF.left = ((float) bounds.left) + b;
                        rectF.right = ((float) bounds.right) - a2;
                    }
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                C44729ba baVar = this.f116177w;
                if (baVar.f116593e != null) {
                    baVar.f116589a.drawableState = getState();
                    C44729ba baVar2 = this.f116177w;
                    baVar2.f116593e.mo47995d(this.f116176v, baVar2.f116589a, baVar2.f116590b);
                }
                this.f116177w.f116589a.setTextAlign(align);
                boolean z = Math.round(this.f116177w.mo48041a(this.f116161g.toString())) > Math.round(this.f116138W.width());
                if (z) {
                    i5 = canvas.save();
                    canvas2.clipRect(this.f116138W);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence = this.f116161g;
                if (z && this.f116179y != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f116177w.f116589a, this.f116138W.width(), this.f116179y);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                float f6 = this.f116139X.x;
                float f7 = this.f116139X.y;
                TextPaint textPaint = this.f116177w.f116589a;
                i2 = saveLayerAlpha;
                float f8 = f6;
                i4 = 0;
                float f9 = f7;
                i3 = PrivateKeyType.INVALID;
                canvas.drawText(charSequence2, 0, length, f8, f9, textPaint);
                if (z) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (mo47748J()) {
                RectF rectF2 = this.f116138W;
                rectF2.setEmpty();
                if (mo47748J()) {
                    float f10 = this.f116175u + this.f116174t;
                    if (C1930c.m5229a(this) == 0) {
                        rectF2.right = ((float) bounds.right) - f10;
                        rectF2.left = rectF2.right - this.f116165k;
                    } else {
                        rectF2.left = ((float) bounds.left) + f10;
                        rectF2.right = rectF2.left + this.f116165k;
                    }
                    rectF2.top = bounds.exactCenterY() - (this.f116165k / 2.0f);
                    rectF2.bottom = rectF2.top + this.f116165k;
                }
                float f11 = this.f116138W.left;
                float f12 = this.f116138W.top;
                canvas2.translate(f11, f12);
                this.f116163i.setBounds(i4, i4, (int) this.f116138W.width(), (int) this.f116138W.height());
                int i6 = C44767a.f116704a;
                this.f116132Q.setBounds(this.f116163i.getBounds());
                this.f116132Q.jumpToCurrentState();
                this.f116132Q.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (this.f116149ag < i3) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    /* renamed from: e */
    public final Drawable mo47753e() {
        Drawable drawable = this.f116163i;
        if (drawable != null) {
            return C1931d.m5231a(drawable);
        }
        return null;
    }

    /* renamed from: f */
    public final void mo47754f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C1930c.m5230b(drawable, C1930c.m5229a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f116163i) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f116154al);
                }
                C1929b.m5226g(drawable, this.f116164j);
                return;
            }
            Drawable drawable2 = this.f116128M;
            if (drawable == drawable2 && this.f116131P) {
                C1929b.m5226g(drawable2, this.f116129N);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo47755g() {
        C44595e eVar = (C44595e) this.f116155am.get();
        if (eVar != null) {
            eVar.mo47682m();
        }
    }

    public final int getAlpha() {
        return this.f116149ag;
    }

    public final ColorFilter getColorFilter() {
        return this.f116150ah;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f116157c;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.f116170p + mo47749a() + this.f116171q + this.f116177w.mo48041a(this.f116161g.toString()) + this.f116172r + mo47750b() + this.f116175u), this.f116124A);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.f116125B) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f116158d);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f116157c, this.f116158d);
        }
        outline.setAlpha(((float) this.f116149ag) / 255.0f);
    }

    /* renamed from: h */
    public final void mo47762h(boolean z) {
        if (this.f116167m != z) {
            this.f116167m = z;
            float a = mo47749a();
            if (!z && this.f116147ae) {
                this.f116147ae = false;
            }
            float a2 = mo47749a();
            invalidateSelf();
            if (a != a2) {
                mo47755g();
            }
        }
    }

    /* renamed from: i */
    public final void mo47763i(boolean z) {
        if (this.f116133R != z) {
            boolean aj = m78979aj();
            this.f116133R = z;
            boolean aj2 = m78979aj();
            if (aj != aj2) {
                if (aj2) {
                    mo47754f(this.f116168n);
                } else {
                    m78973K(this.f116168n);
                }
                invalidateSelf();
                mo47755g();
            }
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = r0.f116503j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f116142a
            boolean r0 = m78977ah(r0)
            if (r0 != 0) goto L_0x0049
            android.content.res.ColorStateList r0 = r1.f116156b
            boolean r0 = m78977ah(r0)
            if (r0 != 0) goto L_0x0049
            android.content.res.ColorStateList r0 = r1.f116159e
            boolean r0 = m78977ah(r0)
            if (r0 != 0) goto L_0x0049
            com.google.android.material.internal.ba r0 = r1.f116177w
            com.google.android.material.i.h r0 = r0.f116593e
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r0 = r0.f116503j
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0049
        L_0x0028:
            boolean r0 = r1.mo47746G()
            if (r0 != 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r1.f116128M
            boolean r0 = m78972H(r0)
            if (r0 != 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r1.f116168n
            boolean r0 = m78972H(r0)
            if (r0 != 0) goto L_0x0049
            android.content.res.ColorStateList r0 = r1.f116152aj
            boolean r0 = m78977ah(r0)
            if (r0 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r0 = 0
            return r0
        L_0x0049:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C44596f.isStateful():boolean");
    }

    /* renamed from: j */
    public final void mo47766j(ColorStateList colorStateList) {
        if (this.f116156b != colorStateList) {
            this.f116156b = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public final void mo47767k(float f) {
        if (this.f116175u != f) {
            this.f116175u = f;
            invalidateSelf();
            mo47755g();
        }
    }

    /* renamed from: m */
    public final void mo47768m(Drawable drawable) {
        Drawable drawable2 = this.f116128M;
        Drawable drawable3 = null;
        Drawable a = drawable2 != null ? C1931d.m5231a(drawable2) : null;
        if (a != drawable) {
            float a2 = mo47749a();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f116128M = drawable3;
            float a3 = mo47749a();
            m78973K(a);
            if (m78980ak()) {
                mo47754f(this.f116128M);
            }
            invalidateSelf();
            if (a2 != a3) {
                mo47755g();
            }
        }
    }

    /* renamed from: n */
    public final void mo47769n(float f) {
        if (this.f116130O != f) {
            float a = mo47749a();
            this.f116130O = f;
            float a2 = mo47749a();
            invalidateSelf();
            if (a != a2) {
                mo47755g();
            }
        }
    }

    /* renamed from: o */
    public final void mo47770o(ColorStateList colorStateList) {
        this.f116131P = true;
        if (this.f116129N != colorStateList) {
            this.f116129N = colorStateList;
            if (m78980ak()) {
                C1929b.m5226g(this.f116128M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m78980ak()) {
            onLayoutDirectionChanged |= C1930c.m5230b(this.f116128M, i);
        }
        if (m78979aj()) {
            onLayoutDirectionChanged |= C1930c.m5230b(this.f116168n, i);
        }
        if (mo47748J()) {
            onLayoutDirectionChanged |= C1930c.m5230b(this.f116163i, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m78980ak()) {
            onLevelChange |= this.f116128M.setLevel(i);
        }
        if (m78979aj()) {
            onLevelChange |= this.f116168n.setLevel(i);
        }
        if (mo47748J()) {
            onLevelChange |= this.f116163i.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f116125B) {
            super.onStateChange(iArr);
        }
        return m78978ai(iArr, this.f116154al);
    }

    /* renamed from: p */
    public final void mo47773p(boolean z) {
        if (this.f116127L != z) {
            boolean ak = m78980ak();
            this.f116127L = z;
            boolean ak2 = m78980ak();
            if (ak != ak2) {
                if (ak2) {
                    mo47754f(this.f116128M);
                } else {
                    m78973K(this.f116128M);
                }
                invalidateSelf();
                mo47755g();
            }
        }
    }

    /* renamed from: q */
    public final void mo47774q(float f) {
        if (this.f116170p != f) {
            this.f116170p = f;
            invalidateSelf();
            mo47755g();
        }
    }

    /* renamed from: r */
    public final void mo47775r(ColorStateList colorStateList) {
        if (this.f116159e != colorStateList) {
            this.f116159e = colorStateList;
            if (this.f116125B) {
                mo48128Z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: s */
    public final void mo47776s(float f) {
        if (this.f116126K != f) {
            this.f116126K = f;
            this.f116136U.setStrokeWidth(f);
            if (this.f116125B) {
                super.mo48129aa(f);
            }
            invalidateSelf();
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f116149ag != i) {
            this.f116149ag = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f116150ah != colorFilter) {
            this.f116150ah = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f116152aj != colorStateList) {
            this.f116152aj = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f116153ak != mode) {
            this.f116153ak = mode;
            this.f116151ai = C44603a.m79017a(this, this.f116152aj, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m78980ak()) {
            visible |= this.f116128M.setVisible(z, z2);
        }
        if (m78979aj()) {
            visible |= this.f116168n.setVisible(z, z2);
        }
        if (mo47748J()) {
            visible |= this.f116163i.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public final void mo47783t(Drawable drawable) {
        Drawable e = mo47753e();
        if (e != drawable) {
            float b = mo47750b();
            this.f116163i = drawable != null ? drawable.mutate() : null;
            int i = C44767a.f116704a;
            this.f116132Q = new RippleDrawable(C44767a.m79372b(this.f116160f), this.f116163i, f116123J);
            float b2 = mo47750b();
            m78973K(e);
            if (mo47748J()) {
                mo47754f(this.f116163i);
            }
            invalidateSelf();
            if (b != b2) {
                mo47755g();
            }
        }
    }

    /* renamed from: u */
    public final void mo47784u(float f) {
        if (this.f116174t != f) {
            this.f116174t = f;
            invalidateSelf();
            if (mo47748J()) {
                mo47755g();
            }
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final void mo47786v(float f) {
        if (this.f116165k != f) {
            this.f116165k = f;
            invalidateSelf();
            if (mo47748J()) {
                mo47755g();
            }
        }
    }

    /* renamed from: w */
    public final void mo47787w(float f) {
        if (this.f116173s != f) {
            this.f116173s = f;
            invalidateSelf();
            if (mo47748J()) {
                mo47755g();
            }
        }
    }

    /* renamed from: x */
    public final void mo47788x(boolean z) {
        if (this.f116162h != z) {
            boolean J = mo47748J();
            this.f116162h = z;
            boolean J2 = mo47748J();
            if (J != J2) {
                if (J2) {
                    mo47754f(this.f116163i);
                } else {
                    m78973K(this.f116163i);
                }
                invalidateSelf();
                mo47755g();
            }
        }
    }

    /* renamed from: y */
    public final void mo47789y(C44595e eVar) {
        this.f116155am = new WeakReference(eVar);
    }

    /* renamed from: z */
    public final void mo47790z(float f) {
        if (this.f116135T != f) {
            float a = mo47749a();
            this.f116135T = f;
            float a2 = mo47749a();
            invalidateSelf();
            if (a != a2) {
                mo47755g();
            }
        }
    }
}
