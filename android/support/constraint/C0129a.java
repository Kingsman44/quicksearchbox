package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.p029a.p030a.C0133c;
import android.support.constraint.p029a.p030a.C0135e;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: android.support.constraint.a */
/* compiled from: PG */
public final class C0129a extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public float f343A = 0.0f;

    /* renamed from: B */
    public float f344B = 0.0f;

    /* renamed from: C */
    public int f345C = 0;

    /* renamed from: D */
    public int f346D = 0;

    /* renamed from: E */
    public int f347E = 0;

    /* renamed from: F */
    public int f348F = 0;

    /* renamed from: G */
    public int f349G = 0;

    /* renamed from: H */
    public int f350H = 0;

    /* renamed from: I */
    public int f351I = 0;

    /* renamed from: J */
    public int f352J = 0;

    /* renamed from: K */
    public int f353K = -1;

    /* renamed from: L */
    public int f354L = -1;

    /* renamed from: M */
    public int f355M = -1;

    /* renamed from: N */
    boolean f356N = true;

    /* renamed from: O */
    boolean f357O = true;

    /* renamed from: P */
    boolean f358P = false;

    /* renamed from: Q */
    boolean f359Q = false;

    /* renamed from: R */
    int f360R = -1;

    /* renamed from: S */
    int f361S = -1;

    /* renamed from: T */
    int f362T = -1;

    /* renamed from: U */
    int f363U = -1;

    /* renamed from: V */
    int f364V = -1;

    /* renamed from: W */
    int f365W = -1;

    /* renamed from: X */
    float f366X = 0.5f;

    /* renamed from: Y */
    C0133c f367Y = new C0133c();

    /* renamed from: a */
    public int f368a = -1;

    /* renamed from: b */
    public int f369b = -1;

    /* renamed from: c */
    public float f370c = -1.0f;

    /* renamed from: d */
    public int f371d = -1;

    /* renamed from: e */
    public int f372e = -1;

    /* renamed from: f */
    public int f373f = -1;

    /* renamed from: g */
    public int f374g = -1;

    /* renamed from: h */
    public int f375h = -1;

    /* renamed from: i */
    public int f376i = -1;

    /* renamed from: j */
    public int f377j = -1;

    /* renamed from: k */
    public int f378k = -1;

    /* renamed from: l */
    public int f379l = -1;

    /* renamed from: m */
    public int f380m = -1;

    /* renamed from: n */
    public int f381n = -1;

    /* renamed from: o */
    public int f382o = -1;

    /* renamed from: p */
    public int f383p = -1;

    /* renamed from: q */
    public int f384q = -1;

    /* renamed from: r */
    public int f385r = -1;

    /* renamed from: s */
    public int f386s = -1;

    /* renamed from: t */
    public int f387t = -1;

    /* renamed from: u */
    public int f388u = -1;

    /* renamed from: v */
    public int f389v = -1;

    /* renamed from: w */
    public float f390w = 0.5f;

    /* renamed from: x */
    public float f391x = 0.5f;

    /* renamed from: y */
    public String f392y = null;

    /* renamed from: z */
    int f393z = 1;

    public C0129a(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public final void mo112a() {
        this.f359Q = false;
        this.f356N = true;
        this.f357O = true;
        if (this.width == 0 || this.width == -1) {
            this.f356N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.f357O = false;
        }
        if (this.f370c != -1.0f || this.f368a != -1 || this.f369b != -1) {
            this.f359Q = true;
            this.f356N = true;
            this.f357O = true;
            if (!(this.f367Y instanceof C0135e)) {
                this.f367Y = new C0135e();
            }
            ((C0135e) this.f367Y).mo156w(this.f355M);
        }
    }

    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.f362T = -1;
        this.f363U = -1;
        this.f360R = -1;
        this.f361S = -1;
        this.f364V = this.f384q;
        this.f365W = this.f386s;
        this.f366X = this.f390w;
        if (getLayoutDirection() == 1) {
            int i2 = this.f380m;
            if (i2 != -1) {
                this.f362T = i2;
            } else {
                int i3 = this.f381n;
                if (i3 != -1) {
                    this.f363U = i3;
                }
            }
            int i4 = this.f382o;
            if (i4 != -1) {
                this.f361S = i4;
            }
            int i5 = this.f383p;
            if (i5 != -1) {
                this.f360R = i5;
            }
            int i6 = this.f388u;
            if (i6 != -1) {
                this.f365W = i6;
            }
            int i7 = this.f389v;
            if (i7 != -1) {
                this.f364V = i7;
            }
            this.f366X = 1.0f - this.f390w;
        } else {
            int i8 = this.f380m;
            if (i8 != -1) {
                this.f361S = i8;
            }
            int i9 = this.f381n;
            if (i9 != -1) {
                this.f360R = i9;
            }
            int i10 = this.f382o;
            if (i10 != -1) {
                this.f362T = i10;
            }
            int i11 = this.f383p;
            if (i11 != -1) {
                this.f363U = i11;
            }
            int i12 = this.f388u;
            if (i12 != -1) {
                this.f364V = i12;
            }
            int i13 = this.f389v;
            if (i13 != -1) {
                this.f365W = i13;
            }
        }
        if (this.f382o == -1 && this.f383p == -1) {
            int i14 = this.f373f;
            if (i14 != -1) {
                this.f362T = i14;
            } else {
                int i15 = this.f374g;
                if (i15 != -1) {
                    this.f363U = i15;
                }
            }
        }
        if (this.f381n == -1 && this.f380m == -1) {
            int i16 = this.f371d;
            if (i16 != -1) {
                this.f360R = i16;
                return;
            }
            int i17 = this.f372e;
            if (i17 != -1) {
                this.f361S = i17;
            }
        }
    }

    public C0129a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0147d.f599a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 84) {
                int resourceId = obtainStyledAttributes.getResourceId(84, this.f371d);
                this.f371d = resourceId;
                if (resourceId == -1) {
                    this.f371d = obtainStyledAttributes.getInt(84, -1);
                }
            } else if (index == 85) {
                int resourceId2 = obtainStyledAttributes.getResourceId(85, this.f372e);
                this.f372e = resourceId2;
                if (resourceId2 == -1) {
                    this.f372e = obtainStyledAttributes.getInt(85, -1);
                }
            } else if (index == 87) {
                int resourceId3 = obtainStyledAttributes.getResourceId(87, this.f373f);
                this.f373f = resourceId3;
                if (resourceId3 == -1) {
                    this.f373f = obtainStyledAttributes.getInt(87, -1);
                }
            } else if (index == 88) {
                int resourceId4 = obtainStyledAttributes.getResourceId(88, this.f374g);
                this.f374g = resourceId4;
                if (resourceId4 == -1) {
                    this.f374g = obtainStyledAttributes.getInt(88, -1);
                }
            } else if (index == 94) {
                int resourceId5 = obtainStyledAttributes.getResourceId(94, this.f375h);
                this.f375h = resourceId5;
                if (resourceId5 == -1) {
                    this.f375h = obtainStyledAttributes.getInt(94, -1);
                }
            } else if (index == 93) {
                int resourceId6 = obtainStyledAttributes.getResourceId(93, this.f376i);
                this.f376i = resourceId6;
                if (resourceId6 == -1) {
                    this.f376i = obtainStyledAttributes.getInt(93, -1);
                }
            } else if (index == 65) {
                int resourceId7 = obtainStyledAttributes.getResourceId(65, this.f377j);
                this.f377j = resourceId7;
                if (resourceId7 == -1) {
                    this.f377j = obtainStyledAttributes.getInt(65, -1);
                }
            } else if (index == 64) {
                int resourceId8 = obtainStyledAttributes.getResourceId(64, this.f378k);
                this.f378k = resourceId8;
                if (resourceId8 == -1) {
                    this.f378k = obtainStyledAttributes.getInt(64, -1);
                }
            } else if (index == 60) {
                int resourceId9 = obtainStyledAttributes.getResourceId(60, this.f379l);
                this.f379l = resourceId9;
                if (resourceId9 == -1) {
                    this.f379l = obtainStyledAttributes.getInt(60, -1);
                }
            } else if (index == 103) {
                this.f353K = obtainStyledAttributes.getDimensionPixelOffset(103, this.f353K);
            } else if (index == 104) {
                this.f354L = obtainStyledAttributes.getDimensionPixelOffset(104, this.f354L);
            } else if (index == 72) {
                this.f368a = obtainStyledAttributes.getDimensionPixelOffset(72, this.f368a);
            } else if (index == 73) {
                this.f369b = obtainStyledAttributes.getDimensionPixelOffset(73, this.f369b);
            } else if (index == 74) {
                this.f370c = obtainStyledAttributes.getFloat(74, this.f370c);
            } else if (index == 0) {
                this.f355M = obtainStyledAttributes.getInt(0, this.f355M);
            } else if (index == 89) {
                int resourceId10 = obtainStyledAttributes.getResourceId(89, this.f380m);
                this.f380m = resourceId10;
                if (resourceId10 == -1) {
                    this.f380m = obtainStyledAttributes.getInt(89, -1);
                }
            } else if (index == 90) {
                int resourceId11 = obtainStyledAttributes.getResourceId(90, this.f381n);
                this.f381n = resourceId11;
                if (resourceId11 == -1) {
                    this.f381n = obtainStyledAttributes.getInt(90, -1);
                }
            } else if (index == 71) {
                int resourceId12 = obtainStyledAttributes.getResourceId(71, this.f382o);
                this.f382o = resourceId12;
                if (resourceId12 == -1) {
                    this.f382o = obtainStyledAttributes.getInt(71, -1);
                }
            } else if (index == 70) {
                int resourceId13 = obtainStyledAttributes.getResourceId(70, this.f383p);
                this.f383p = resourceId13;
                if (resourceId13 == -1) {
                    this.f383p = obtainStyledAttributes.getInt(70, -1);
                }
            } else if (index == 108) {
                this.f384q = obtainStyledAttributes.getDimensionPixelSize(108, this.f384q);
            } else if (index == 111) {
                this.f385r = obtainStyledAttributes.getDimensionPixelSize(111, this.f385r);
            } else if (index == 109) {
                this.f386s = obtainStyledAttributes.getDimensionPixelSize(109, this.f386s);
            } else if (index == 106) {
                this.f387t = obtainStyledAttributes.getDimensionPixelSize(106, this.f387t);
            } else if (index == 110) {
                this.f388u = obtainStyledAttributes.getDimensionPixelSize(110, this.f388u);
            } else if (index == 107) {
                this.f389v = obtainStyledAttributes.getDimensionPixelSize(107, this.f389v);
            } else if (index == 80) {
                this.f390w = obtainStyledAttributes.getFloat(80, this.f390w);
            } else if (index == 95) {
                this.f391x = obtainStyledAttributes.getFloat(95, this.f391x);
            } else if (index == 69) {
                String string = obtainStyledAttributes.getString(69);
                this.f392y = string;
                this.f393z = -1;
                if (string != null) {
                    int length = string.length();
                    int indexOf = string.indexOf(44);
                    if (indexOf <= 0 || indexOf >= length - 1) {
                        i = 0;
                    } else {
                        String substring = this.f392y.substring(0, indexOf);
                        if (substring.equalsIgnoreCase("W")) {
                            this.f393z = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.f393z = 1;
                        }
                        i = indexOf + 1;
                    }
                    int indexOf2 = this.f392y.indexOf(58);
                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                        String substring2 = this.f392y.substring(i);
                        if (substring2.length() > 0) {
                            Float.parseFloat(substring2);
                        }
                    } else {
                        String substring3 = this.f392y.substring(i, indexOf2);
                        String substring4 = this.f392y.substring(indexOf2 + 1);
                        if (substring3.length() > 0 && substring4.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(substring3);
                                float parseFloat2 = Float.parseFloat(substring4);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.f393z == 1) {
                                        Math.abs(parseFloat2 / parseFloat);
                                    } else {
                                        Math.abs(parseFloat / parseFloat2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (index == 82) {
                this.f343A = obtainStyledAttributes.getFloat(82, 0.0f);
            } else if (index == 97) {
                this.f344B = obtainStyledAttributes.getFloat(97, 0.0f);
            } else if (index == 81) {
                this.f345C = obtainStyledAttributes.getInt(81, 0);
            } else if (index == 96) {
                this.f346D = obtainStyledAttributes.getInt(96, 0);
            } else if (index == 99) {
                this.f347E = obtainStyledAttributes.getInt(99, 0);
            } else if (index == 76) {
                this.f348F = obtainStyledAttributes.getInt(76, 0);
            } else if (index == 101) {
                this.f349G = obtainStyledAttributes.getDimensionPixelSize(101, this.f349G);
            } else if (index == 100) {
                this.f351I = obtainStyledAttributes.getDimensionPixelSize(100, this.f351I);
            } else if (index == 78) {
                this.f350H = obtainStyledAttributes.getDimensionPixelSize(78, this.f350H);
            } else if (index == 77) {
                this.f352J = obtainStyledAttributes.getDimensionPixelSize(77, this.f352J);
            }
        }
        obtainStyledAttributes.recycle();
        mo112a();
    }

    public C0129a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
