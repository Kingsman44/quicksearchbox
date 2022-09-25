package androidx.constraintlayout.widget;

import android.util.Log;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.widget.i */
/* compiled from: PG */
public final class C1750i {

    /* renamed from: a */
    int[] f5326a = new int[10];

    /* renamed from: b */
    int[] f5327b = new int[10];

    /* renamed from: c */
    int f5328c = 0;

    /* renamed from: d */
    int[] f5329d = new int[10];

    /* renamed from: e */
    float[] f5330e = new float[10];

    /* renamed from: f */
    int f5331f = 0;

    /* renamed from: g */
    int[] f5332g = new int[5];

    /* renamed from: h */
    String[] f5333h = new String[5];

    /* renamed from: i */
    int f5334i = 0;

    /* renamed from: j */
    int[] f5335j = new int[4];

    /* renamed from: k */
    boolean[] f5336k = new boolean[4];

    /* renamed from: l */
    int f5337l = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4868a(int i, float f) {
        int i2 = this.f5331f;
        int[] iArr = this.f5329d;
        int length = iArr.length;
        if (i2 >= length) {
            this.f5329d = Arrays.copyOf(iArr, length + length);
            float[] fArr = this.f5330e;
            int length2 = fArr.length;
            this.f5330e = Arrays.copyOf(fArr, length2 + length2);
        }
        int[] iArr2 = this.f5329d;
        int i3 = this.f5331f;
        iArr2[i3] = i;
        float[] fArr2 = this.f5330e;
        this.f5331f = i3 + 1;
        fArr2[i3] = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4869b(int i, int i2) {
        int i3 = this.f5328c;
        int[] iArr = this.f5326a;
        int length = iArr.length;
        if (i3 >= length) {
            this.f5326a = Arrays.copyOf(iArr, length + length);
            int[] iArr2 = this.f5327b;
            int length2 = iArr2.length;
            this.f5327b = Arrays.copyOf(iArr2, length2 + length2);
        }
        int[] iArr3 = this.f5326a;
        int i4 = this.f5328c;
        iArr3[i4] = i;
        int[] iArr4 = this.f5327b;
        this.f5328c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4870c(int i, String str) {
        int i2 = this.f5334i;
        int[] iArr = this.f5332g;
        int length = iArr.length;
        if (i2 >= length) {
            this.f5332g = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.f5333h;
            int length2 = strArr.length;
            this.f5333h = (String[]) Arrays.copyOf(strArr, length2 + length2);
        }
        int[] iArr2 = this.f5332g;
        int i3 = this.f5334i;
        iArr2[i3] = i;
        String[] strArr2 = this.f5333h;
        this.f5334i = i3 + 1;
        strArr2[i3] = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4871d(int i, boolean z) {
        int i2 = this.f5337l;
        int[] iArr = this.f5335j;
        int length = iArr.length;
        if (i2 >= length) {
            this.f5335j = Arrays.copyOf(iArr, length + length);
            boolean[] zArr = this.f5336k;
            int length2 = zArr.length;
            this.f5336k = Arrays.copyOf(zArr, length2 + length2);
        }
        int[] iArr2 = this.f5335j;
        int i3 = this.f5337l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f5336k;
        this.f5337l = i3 + 1;
        zArr2[i3] = z;
    }

    /* renamed from: e */
    public final void mo4872e(C1751j jVar) {
        for (int i = 0; i < this.f5328c; i++) {
            int i2 = this.f5326a[i];
            int i3 = this.f5327b[i];
            int[] iArr = C1756o.f5450a;
            if (i2 == 6) {
                jVar.f5342e.f5351E = i3;
            } else if (i2 == 7) {
                jVar.f5342e.f5352F = i3;
            } else if (i2 == 8) {
                jVar.f5342e.f5358L = i3;
            } else if (i2 == 27) {
                jVar.f5342e.f5353G = i3;
            } else if (i2 == 28) {
                jVar.f5342e.f5355I = i3;
            } else if (i2 == 41) {
                jVar.f5342e.f5370X = i3;
            } else if (i2 == 42) {
                jVar.f5342e.f5371Y = i3;
            } else if (i2 == 61) {
                jVar.f5342e.f5348B = i3;
            } else if (i2 == 62) {
                jVar.f5342e.f5349C = i3;
            } else if (i2 == 72) {
                jVar.f5342e.f5380ah = i3;
            } else if (i2 != 73) {
                switch (i2) {
                    case 2:
                        jVar.f5342e.f5357K = i3;
                        break;
                    case 11:
                        jVar.f5342e.f5364R = i3;
                        break;
                    case 12:
                        jVar.f5342e.f5365S = i3;
                        break;
                    case 13:
                        jVar.f5342e.f5361O = i3;
                        break;
                    case 14:
                        jVar.f5342e.f5363Q = i3;
                        break;
                    case 15:
                        jVar.f5342e.f5366T = i3;
                        break;
                    case 16:
                        jVar.f5342e.f5362P = i3;
                        break;
                    case 17:
                        jVar.f5342e.f5394f = i3;
                        break;
                    case 18:
                        jVar.f5342e.f5395g = i3;
                        break;
                    case 31:
                        jVar.f5342e.f5359M = i3;
                        break;
                    case 34:
                        jVar.f5342e.f5356J = i3;
                        break;
                    case 38:
                        jVar.f5338a = i3;
                        break;
                    case 64:
                        jVar.f5341d.f5417c = i3;
                        break;
                    case 66:
                        jVar.f5341d.f5421g = i3;
                        break;
                    case 76:
                        jVar.f5341d.f5420f = i3;
                        break;
                    case 78:
                        jVar.f5340c.f5432c = i3;
                        break;
                    case 93:
                        jVar.f5342e.f5360N = i3;
                        break;
                    case 94:
                        jVar.f5342e.f5367U = i3;
                        break;
                    case 97:
                        jVar.f5342e.f5389aq = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                jVar.f5342e.f5393e = i3;
                                break;
                            case 22:
                                jVar.f5340c.f5431b = i3;
                                break;
                            case 23:
                                jVar.f5342e.f5392d = i3;
                                break;
                            case 24:
                                jVar.f5342e.f5354H = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        jVar.f5342e.f5372Z = i3;
                                        break;
                                    case 55:
                                        jVar.f5342e.f5373aa = i3;
                                        break;
                                    case 56:
                                        jVar.f5342e.f5374ab = i3;
                                        break;
                                    case 57:
                                        jVar.f5342e.f5375ac = i3;
                                        break;
                                    case 58:
                                        jVar.f5342e.f5376ad = i3;
                                        break;
                                    case 59:
                                        jVar.f5342e.f5377ae = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                jVar.f5341d.f5418d = i3;
                                                break;
                                            case 83:
                                                jVar.f5343f.f5444j = i3;
                                                break;
                                            case 84:
                                                jVar.f5341d.f5426l = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        jVar.f5341d.f5428n = i3;
                                                        break;
                                                    case 89:
                                                        jVar.f5341d.f5429o = i3;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                        }
                                }
                        }
                }
            } else {
                jVar.f5342e.f5381ai = i3;
            }
        }
        for (int i4 = 0; i4 < this.f5331f; i4++) {
            int i5 = this.f5329d[i4];
            float f = this.f5330e[i4];
            int[] iArr2 = C1756o.f5450a;
            if (i5 == 19) {
                jVar.f5342e.f5396h = f;
            } else if (i5 == 20) {
                jVar.f5342e.f5413y = f;
            } else if (i5 == 37) {
                jVar.f5342e.f5414z = f;
            } else if (i5 == 60) {
                jVar.f5343f.f5437c = f;
            } else if (i5 == 63) {
                jVar.f5342e.f5350D = f;
            } else if (i5 == 79) {
                jVar.f5341d.f5422h = f;
            } else if (i5 == 85) {
                jVar.f5341d.f5425k = f;
            } else if (i5 != 87) {
                if (i5 == 39) {
                    jVar.f5342e.f5369W = f;
                } else if (i5 != 40) {
                    switch (i5) {
                        case 43:
                            jVar.f5340c.f5433d = f;
                            break;
                        case 44:
                            C1755n nVar = jVar.f5343f;
                            nVar.f5449o = f;
                            nVar.f5448n = true;
                            break;
                        case 45:
                            jVar.f5343f.f5438d = f;
                            break;
                        case 46:
                            jVar.f5343f.f5439e = f;
                            break;
                        case 47:
                            jVar.f5343f.f5440f = f;
                            break;
                        case 48:
                            jVar.f5343f.f5441g = f;
                            break;
                        case 49:
                            jVar.f5343f.f5442h = f;
                            break;
                        case 50:
                            jVar.f5343f.f5443i = f;
                            break;
                        case 51:
                            jVar.f5343f.f5445k = f;
                            break;
                        case 52:
                            jVar.f5343f.f5446l = f;
                            break;
                        case 53:
                            jVar.f5343f.f5447m = f;
                            break;
                        default:
                            switch (i5) {
                                case 67:
                                    jVar.f5341d.f5424j = f;
                                    break;
                                case 68:
                                    jVar.f5340c.f5434e = f;
                                    break;
                                case 69:
                                    jVar.f5342e.f5378af = f;
                                    break;
                                case 70:
                                    jVar.f5342e.f5379ag = f;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                    }
                } else {
                    jVar.f5342e.f5368V = f;
                }
            }
        }
        for (int i6 = 0; i6 < this.f5334i; i6++) {
            int i7 = this.f5332g[i6];
            String str = this.f5333h[i6];
            int[] iArr3 = C1756o.f5450a;
            if (i7 == 5) {
                jVar.f5342e.f5347A = str;
            } else if (i7 == 65) {
                jVar.f5341d.f5419e = str;
            } else if (i7 == 74) {
                C1752k kVar = jVar.f5342e;
                kVar.f5384al = str;
                kVar.f5383ak = null;
            } else if (i7 == 77) {
                jVar.f5342e.f5385am = str;
            } else if (i7 != 87) {
                if (i7 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    jVar.f5341d.f5427m = str;
                }
            }
        }
        for (int i8 = 0; i8 < this.f5337l; i8++) {
            int i9 = this.f5335j[i8];
            boolean z = this.f5336k[i8];
            int[] iArr4 = C1756o.f5450a;
            if (i9 == 44) {
                jVar.f5343f.f5448n = z;
            } else if (i9 == 75) {
                jVar.f5342e.f5388ap = z;
            } else if (i9 != 87) {
                if (i9 == 80) {
                    jVar.f5342e.f5386an = z;
                } else if (i9 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    jVar.f5342e.f5387ao = z;
                }
            }
        }
    }
}
