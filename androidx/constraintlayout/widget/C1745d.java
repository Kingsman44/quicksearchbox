package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1642j;

/* renamed from: androidx.constraintlayout.widget.d */
/* compiled from: PG */
public class C1745d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public int f5232A = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: B */
    public int f5233B = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: C */
    public int f5234C = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: D */
    public int f5235D = 0;

    /* renamed from: E */
    public float f5236E = 0.5f;

    /* renamed from: F */
    public float f5237F = 0.5f;

    /* renamed from: G */
    public String f5238G = null;

    /* renamed from: H */
    public float f5239H = -1.0f;

    /* renamed from: I */
    public float f5240I = -1.0f;

    /* renamed from: J */
    public int f5241J = 0;

    /* renamed from: K */
    public int f5242K = 0;

    /* renamed from: L */
    public int f5243L = 0;

    /* renamed from: M */
    public int f5244M = 0;

    /* renamed from: N */
    public int f5245N = 0;

    /* renamed from: O */
    public int f5246O = 0;

    /* renamed from: P */
    public int f5247P = 0;

    /* renamed from: Q */
    public int f5248Q = 0;

    /* renamed from: R */
    public float f5249R = 1.0f;

    /* renamed from: S */
    public float f5250S = 1.0f;

    /* renamed from: T */
    public int f5251T = -1;

    /* renamed from: U */
    public int f5252U = -1;

    /* renamed from: V */
    public int f5253V = -1;

    /* renamed from: W */
    public boolean f5254W = false;

    /* renamed from: X */
    public boolean f5255X = false;

    /* renamed from: Y */
    public String f5256Y = null;

    /* renamed from: Z */
    public int f5257Z = 0;

    /* renamed from: a */
    public int f5258a = -1;

    /* renamed from: aa */
    boolean f5259aa = true;

    /* renamed from: ab */
    boolean f5260ab = true;

    /* renamed from: ac */
    boolean f5261ac = false;

    /* renamed from: ad */
    boolean f5262ad = false;

    /* renamed from: ae */
    boolean f5263ae = false;

    /* renamed from: af */
    boolean f5264af = false;

    /* renamed from: ag */
    boolean f5265ag = false;

    /* renamed from: ah */
    int f5266ah = -1;

    /* renamed from: ai */
    int f5267ai = -1;

    /* renamed from: aj */
    int f5268aj = -1;

    /* renamed from: ak */
    int f5269ak = -1;

    /* renamed from: al */
    int f5270al = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: am */
    int f5271am = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: an */
    float f5272an = 0.5f;

    /* renamed from: ao */
    int f5273ao;

    /* renamed from: ap */
    int f5274ap;

    /* renamed from: aq */
    float f5275aq;

    /* renamed from: ar */
    C1638f f5276ar = new C1638f();

    /* renamed from: as */
    public boolean f5277as = false;

    /* renamed from: b */
    public int f5278b = -1;

    /* renamed from: c */
    public float f5279c = -1.0f;

    /* renamed from: d */
    public boolean f5280d = true;

    /* renamed from: e */
    public int f5281e = -1;

    /* renamed from: f */
    public int f5282f = -1;

    /* renamed from: g */
    public int f5283g = -1;

    /* renamed from: h */
    public int f5284h = -1;

    /* renamed from: i */
    public int f5285i = -1;

    /* renamed from: j */
    public int f5286j = -1;

    /* renamed from: k */
    public int f5287k = -1;

    /* renamed from: l */
    public int f5288l = -1;

    /* renamed from: m */
    public int f5289m = -1;

    /* renamed from: n */
    public int f5290n = -1;

    /* renamed from: o */
    public int f5291o = -1;

    /* renamed from: p */
    public int f5292p = -1;

    /* renamed from: q */
    public int f5293q = 0;

    /* renamed from: r */
    public float f5294r = 0.0f;

    /* renamed from: s */
    public int f5295s = -1;

    /* renamed from: t */
    public int f5296t = -1;

    /* renamed from: u */
    public int f5297u = -1;

    /* renamed from: v */
    public int f5298v = -1;

    /* renamed from: w */
    public int f5299w = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: x */
    public int f5300x = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: y */
    public int f5301y = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: z */
    public int f5302z = LinearLayoutManager.INVALID_OFFSET;

    public C1745d(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public final void mo4863a() {
        this.f5262ad = false;
        this.f5259aa = true;
        this.f5260ab = true;
        if (this.width == -2 && this.f5254W) {
            this.f5259aa = false;
            if (this.f5243L == 0) {
                this.f5243L = 1;
            }
        }
        if (this.height == -2 && this.f5255X) {
            this.f5260ab = false;
            if (this.f5244M == 0) {
                this.f5244M = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.f5259aa = false;
            if (this.width == 0 && this.f5243L == 1) {
                this.width = -2;
                this.f5254W = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.f5260ab = false;
            if (this.height == 0 && this.f5244M == 1) {
                this.height = -2;
                this.f5255X = true;
            }
        }
        if (this.f5279c != -1.0f || this.f5258a != -1 || this.f5278b != -1) {
            this.f5262ad = true;
            this.f5259aa = true;
            this.f5260ab = true;
            if (!(this.f5276ar instanceof C1642j)) {
                this.f5276ar = new C1642j();
            }
            ((C1642j) this.f5276ar).mo4664d(this.f5253V);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r11) {
        /*
            r10 = this;
            int r0 = r10.leftMargin
            int r1 = r10.rightMargin
            super.resolveLayoutDirection(r11)
            int r11 = r10.getLayoutDirection()
            r2 = -1
            r10.f5268aj = r2
            r10.f5269ak = r2
            r10.f5266ah = r2
            r10.f5267ai = r2
            int r3 = r10.f5299w
            r10.f5270al = r3
            int r3 = r10.f5301y
            r10.f5271am = r3
            float r3 = r10.f5236E
            r10.f5272an = r3
            int r4 = r10.f5258a
            r10.f5273ao = r4
            int r5 = r10.f5278b
            r10.f5274ap = r5
            float r6 = r10.f5279c
            r10.f5275aq = r6
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            if (r11 != r8) goto L_0x008d
            int r11 = r10.f5295s
            if (r11 == r2) goto L_0x0039
            r10.f5268aj = r11
        L_0x0037:
            r11 = 1
            goto L_0x0041
        L_0x0039:
            int r11 = r10.f5296t
            if (r11 == r2) goto L_0x0040
            r10.f5269ak = r11
            goto L_0x0037
        L_0x0040:
            r11 = 0
        L_0x0041:
            int r9 = r10.f5297u
            if (r9 == r2) goto L_0x0048
            r10.f5267ai = r9
            r11 = 1
        L_0x0048:
            int r9 = r10.f5298v
            if (r9 == r2) goto L_0x004f
            r10.f5266ah = r9
            r11 = 1
        L_0x004f:
            int r9 = r10.f5232A
            if (r9 == r7) goto L_0x0055
            r10.f5271am = r9
        L_0x0055:
            int r9 = r10.f5233B
            if (r9 == r7) goto L_0x005b
            r10.f5270al = r9
        L_0x005b:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0063
            float r11 = r7 - r3
            r10.f5272an = r11
        L_0x0063:
            boolean r11 = r10.f5262ad
            if (r11 == 0) goto L_0x00b1
            int r11 = r10.f5253V
            if (r11 != r8) goto L_0x00b1
            boolean r11 = r10.f5280d
            if (r11 == 0) goto L_0x00b1
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x007d
            float r7 = r7 - r6
            r10.f5275aq = r7
            r10.f5273ao = r2
            r10.f5274ap = r2
            goto L_0x00b1
        L_0x007d:
            if (r4 == r2) goto L_0x0086
            r10.f5274ap = r4
            r10.f5273ao = r2
        L_0x0083:
            r10.f5275aq = r11
            goto L_0x00b1
        L_0x0086:
            if (r5 == r2) goto L_0x00b1
            r10.f5273ao = r5
            r10.f5274ap = r2
            goto L_0x0083
        L_0x008d:
            int r11 = r10.f5295s
            if (r11 == r2) goto L_0x0093
            r10.f5267ai = r11
        L_0x0093:
            int r11 = r10.f5296t
            if (r11 == r2) goto L_0x0099
            r10.f5266ah = r11
        L_0x0099:
            int r11 = r10.f5297u
            if (r11 == r2) goto L_0x009f
            r10.f5268aj = r11
        L_0x009f:
            int r11 = r10.f5298v
            if (r11 == r2) goto L_0x00a5
            r10.f5269ak = r11
        L_0x00a5:
            int r11 = r10.f5232A
            if (r11 == r7) goto L_0x00ab
            r10.f5270al = r11
        L_0x00ab:
            int r11 = r10.f5233B
            if (r11 == r7) goto L_0x00b1
            r10.f5271am = r11
        L_0x00b1:
            int r11 = r10.f5297u
            if (r11 != r2) goto L_0x00fb
            int r11 = r10.f5298v
            if (r11 != r2) goto L_0x00fb
            int r11 = r10.f5296t
            if (r11 != r2) goto L_0x00fb
            int r11 = r10.f5295s
            if (r11 != r2) goto L_0x00fb
            int r11 = r10.f5283g
            if (r11 == r2) goto L_0x00d0
            r10.f5268aj = r11
            int r11 = r10.rightMargin
            if (r11 > 0) goto L_0x00de
            if (r1 <= 0) goto L_0x00de
            r10.rightMargin = r1
            goto L_0x00de
        L_0x00d0:
            int r11 = r10.f5284h
            if (r11 == r2) goto L_0x00de
            r10.f5269ak = r11
            int r11 = r10.rightMargin
            if (r11 > 0) goto L_0x00de
            if (r1 <= 0) goto L_0x00de
            r10.rightMargin = r1
        L_0x00de:
            int r11 = r10.f5281e
            if (r11 == r2) goto L_0x00ed
            r10.f5266ah = r11
            int r11 = r10.leftMargin
            if (r11 > 0) goto L_0x00fb
            if (r0 <= 0) goto L_0x00fb
            r10.leftMargin = r0
            return
        L_0x00ed:
            int r11 = r10.f5282f
            if (r11 == r2) goto L_0x00fb
            r10.f5267ai = r11
            int r11 = r10.leftMargin
            if (r11 > 0) goto L_0x00fb
            if (r0 <= 0) goto L_0x00fb
            r10.leftMargin = r0
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1745d.resolveLayoutDirection(int):void");
    }

    public C1745d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1761t.f5460b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = C1744c.f5231a.get(index);
            switch (i2) {
                case 1:
                    this.f5253V = obtainStyledAttributes.getInt(index, this.f5253V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f5292p);
                    this.f5292p = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        this.f5292p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    this.f5293q = obtainStyledAttributes.getDimensionPixelSize(index, this.f5293q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.f5294r) % 360.0f;
                    this.f5294r = f;
                    if (f >= 0.0f) {
                        break;
                    } else {
                        this.f5294r = (360.0f - f) % 360.0f;
                        break;
                    }
                case 5:
                    this.f5258a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5258a);
                    break;
                case 6:
                    this.f5278b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5278b);
                    break;
                case 7:
                    this.f5279c = obtainStyledAttributes.getFloat(index, this.f5279c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f5281e);
                    this.f5281e = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        this.f5281e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f5282f);
                    this.f5282f = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        this.f5282f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f5283g);
                    this.f5283g = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        this.f5283g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f5284h);
                    this.f5284h = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        this.f5284h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f5285i);
                    this.f5285i = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        this.f5285i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f5286j);
                    this.f5286j = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        this.f5286j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f5287k);
                    this.f5287k = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        this.f5287k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f5288l);
                    this.f5288l = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        this.f5288l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f5289m);
                    this.f5289m = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        this.f5289m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f5295s);
                    this.f5295s = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        this.f5295s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f5296t);
                    this.f5296t = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        this.f5296t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f5297u);
                    this.f5297u = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        this.f5297u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f5298v);
                    this.f5298v = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        this.f5298v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    this.f5299w = obtainStyledAttributes.getDimensionPixelSize(index, this.f5299w);
                    break;
                case 22:
                    this.f5300x = obtainStyledAttributes.getDimensionPixelSize(index, this.f5300x);
                    break;
                case 23:
                    this.f5301y = obtainStyledAttributes.getDimensionPixelSize(index, this.f5301y);
                    break;
                case 24:
                    this.f5302z = obtainStyledAttributes.getDimensionPixelSize(index, this.f5302z);
                    break;
                case 25:
                    this.f5232A = obtainStyledAttributes.getDimensionPixelSize(index, this.f5232A);
                    break;
                case 26:
                    this.f5233B = obtainStyledAttributes.getDimensionPixelSize(index, this.f5233B);
                    break;
                case 27:
                    this.f5254W = obtainStyledAttributes.getBoolean(index, this.f5254W);
                    break;
                case 28:
                    this.f5255X = obtainStyledAttributes.getBoolean(index, this.f5255X);
                    break;
                case 29:
                    this.f5236E = obtainStyledAttributes.getFloat(index, this.f5236E);
                    break;
                case 30:
                    this.f5237F = obtainStyledAttributes.getFloat(index, this.f5237F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.f5243L = i3;
                    if (i3 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.f5244M = i4;
                    if (i4 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        this.f5245N = obtainStyledAttributes.getDimensionPixelSize(index, this.f5245N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.f5245N) != -2) {
                            break;
                        } else {
                            this.f5245N = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        this.f5247P = obtainStyledAttributes.getDimensionPixelSize(index, this.f5247P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.f5247P) != -2) {
                            break;
                        } else {
                            this.f5247P = -2;
                            break;
                        }
                    }
                case 35:
                    this.f5249R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f5249R));
                    this.f5243L = 2;
                    break;
                case 36:
                    try {
                        this.f5246O = obtainStyledAttributes.getDimensionPixelSize(index, this.f5246O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.f5246O) != -2) {
                            break;
                        } else {
                            this.f5246O = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        this.f5248Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f5248Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.f5248Q) != -2) {
                            break;
                        } else {
                            this.f5248Q = -2;
                            break;
                        }
                    }
                case 38:
                    this.f5250S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f5250S));
                    this.f5244M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C1756o.m4805s(this, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            this.f5239H = obtainStyledAttributes.getFloat(index, this.f5239H);
                            break;
                        case 46:
                            this.f5240I = obtainStyledAttributes.getFloat(index, this.f5240I);
                            break;
                        case 47:
                            this.f5241J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f5242K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f5251T = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5251T);
                            break;
                        case 50:
                            this.f5252U = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5252U);
                            break;
                        case 51:
                            this.f5256Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f5290n);
                            this.f5290n = resourceId15;
                            if (resourceId15 != -1) {
                                break;
                            } else {
                                this.f5290n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f5291o);
                            this.f5291o = resourceId16;
                            if (resourceId16 != -1) {
                                break;
                            } else {
                                this.f5291o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 54:
                            this.f5235D = obtainStyledAttributes.getDimensionPixelSize(index, this.f5235D);
                            break;
                        case 55:
                            this.f5234C = obtainStyledAttributes.getDimensionPixelSize(index, this.f5234C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C1756o.m4804r(this, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1756o.m4804r(this, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.f5257Z = obtainStyledAttributes.getInt(index, this.f5257Z);
                                    break;
                                case 67:
                                    this.f5280d = obtainStyledAttributes.getBoolean(index, this.f5280d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        mo4863a();
    }

    public C1745d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
