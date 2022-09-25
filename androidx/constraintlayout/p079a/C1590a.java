package androidx.constraintlayout.p079a;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a */
/* compiled from: PG */
public final class C1590a {

    /* renamed from: a */
    int f4360a = 0;

    /* renamed from: b */
    protected final C1648c f4361b;

    /* renamed from: c */
    public int[] f4362c = new int[8];

    /* renamed from: d */
    public int[] f4363d = new int[8];

    /* renamed from: e */
    public float[] f4364e = new float[8];

    /* renamed from: f */
    public int f4365f = -1;

    /* renamed from: g */
    private final C1614b f4366g;

    /* renamed from: h */
    private int f4367h = 8;

    /* renamed from: i */
    private int f4368i = -1;

    /* renamed from: j */
    private boolean f4369j = false;

    public C1590a(C1614b bVar, C1648c cVar) {
        this.f4366g = bVar;
        this.f4361b = cVar;
    }

    /* renamed from: a */
    public final float mo4501a(C1654i iVar) {
        int i = this.f4365f;
        int i2 = 0;
        while (i != -1 && i2 < this.f4360a) {
            if (this.f4362c[i] == iVar.f4789c) {
                return this.f4364e[i];
            }
            i = this.f4363d[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo4503c(C1654i iVar, boolean z) {
        int i = this.f4365f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f4360a) {
                if (this.f4362c[i] == iVar.f4789c) {
                    if (i == this.f4365f) {
                        this.f4365f = this.f4363d[i];
                    } else {
                        int[] iArr = this.f4363d;
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        iVar.mo4694b(this.f4366g);
                    }
                    iVar.f4798l--;
                    this.f4360a--;
                    this.f4362c[i] = -1;
                    if (this.f4369j) {
                        this.f4368i = i;
                    }
                    return this.f4364e[i];
                }
                i2++;
                i3 = i;
                i = this.f4363d[i];
            }
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final void mo4506f() {
        int i = this.f4365f;
        int i2 = 0;
        while (i != -1 && i2 < this.f4360a) {
            C1654i iVar = this.f4361b.f4757a[this.f4362c[i]];
            if (iVar != null) {
                iVar.mo4694b(this.f4366g);
            }
            i = this.f4363d[i];
            i2++;
        }
        this.f4365f = -1;
        this.f4368i = -1;
        this.f4369j = false;
        this.f4360a = 0;
    }

    /* renamed from: g */
    public final void mo4507g(C1654i iVar, float f) {
        if (f == 0.0f) {
            mo4503c(iVar, true);
            return;
        }
        int i = this.f4365f;
        if (i == -1) {
            this.f4365f = 0;
            this.f4364e[0] = f;
            this.f4362c[0] = iVar.f4789c;
            this.f4363d[0] = -1;
            iVar.f4798l++;
            iVar.mo4693a(this.f4366g);
            this.f4360a++;
            if (!this.f4369j) {
                int i2 = this.f4368i + 1;
                this.f4368i = i2;
                int length = this.f4362c.length;
                if (i2 >= length) {
                    this.f4369j = true;
                    this.f4368i = length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f4360a) {
            int i5 = this.f4362c[i];
            int i6 = iVar.f4789c;
            if (i5 == i6) {
                this.f4364e[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f4363d[i];
            i3++;
        }
        int i7 = this.f4368i;
        int i8 = i7 + 1;
        if (this.f4369j) {
            int[] iArr = this.f4362c;
            if (iArr[i7] != -1) {
                i7 = iArr.length;
            }
        } else {
            i7 = i8;
        }
        int length2 = this.f4362c.length;
        if (i7 >= length2 && this.f4360a < length2) {
            int i9 = 0;
            while (true) {
                int[] iArr2 = this.f4362c;
                if (i9 >= iArr2.length) {
                    break;
                } else if (iArr2[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int length3 = this.f4362c.length;
        if (i7 >= length3) {
            int i10 = this.f4367h;
            int i11 = i10 + i10;
            this.f4367h = i11;
            this.f4369j = false;
            this.f4368i = length3 - 1;
            this.f4364e = Arrays.copyOf(this.f4364e, i11);
            this.f4362c = Arrays.copyOf(this.f4362c, this.f4367h);
            this.f4363d = Arrays.copyOf(this.f4363d, this.f4367h);
            i7 = length3;
        }
        this.f4362c[i7] = iVar.f4789c;
        this.f4364e[i7] = f;
        if (i4 != -1) {
            int[] iArr3 = this.f4363d;
            iArr3[i7] = iArr3[i4];
            iArr3[i4] = i7;
        } else {
            this.f4363d[i7] = this.f4365f;
            this.f4365f = i7;
        }
        iVar.f4798l++;
        iVar.mo4693a(this.f4366g);
        int i12 = this.f4360a + 1;
        this.f4360a = i12;
        if (!this.f4369j) {
            this.f4368i++;
        }
        int length4 = this.f4362c.length;
        if (i12 >= length4) {
            this.f4369j = true;
        }
        if (this.f4368i >= length4) {
            this.f4369j = true;
            this.f4368i = length4 - 1;
        }
    }

    public final String toString() {
        int i = this.f4365f;
        String str = BuildConfig.FLAVOR;
        int i2 = 0;
        while (i != -1 && i2 < this.f4360a) {
            float f = this.f4364e[i];
            str = (str.concat(" -> ") + f + " : ").concat(String.valueOf(String.valueOf(this.f4361b.f4757a[this.f4362c[i]])));
            i = this.f4363d[i];
            i2++;
        }
        return str;
    }

    /* renamed from: b */
    public final float mo4502b(int i) {
        int i2 = this.f4365f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4360a) {
            if (i3 == i) {
                return this.f4364e[i2];
            }
            i2 = this.f4363d[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final C1654i mo4504d(int i) {
        int i2 = this.f4365f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4360a) {
            if (i3 == i) {
                return this.f4361b.f4757a[this.f4362c[i2]];
            }
            i2 = this.f4363d[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo4505e(C1654i iVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f4365f;
            if (i == -1) {
                this.f4365f = 0;
                this.f4364e[0] = f;
                this.f4362c[0] = iVar.f4789c;
                this.f4363d[0] = -1;
                iVar.f4798l++;
                iVar.mo4693a(this.f4366g);
                this.f4360a++;
                if (!this.f4369j) {
                    int i2 = this.f4368i + 1;
                    this.f4368i = i2;
                    int length = this.f4362c.length;
                    if (i2 >= length) {
                        this.f4369j = true;
                        this.f4368i = length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f4360a) {
                int i5 = this.f4362c[i];
                int i6 = iVar.f4789c;
                if (i5 == i6) {
                    float[] fArr = this.f4364e;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f4365f) {
                            this.f4365f = this.f4363d[i];
                        } else {
                            int[] iArr = this.f4363d;
                            iArr[i4] = iArr[i];
                        }
                        if (z) {
                            iVar.mo4694b(this.f4366g);
                        }
                        if (this.f4369j) {
                            this.f4368i = i;
                        }
                        iVar.f4798l--;
                        this.f4360a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f4363d[i];
                i3++;
            }
            int i7 = this.f4368i;
            int i8 = i7 + 1;
            if (this.f4369j) {
                int[] iArr2 = this.f4362c;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int length2 = this.f4362c.length;
            if (i7 >= length2 && this.f4360a < length2) {
                int i9 = 0;
                while (true) {
                    int[] iArr3 = this.f4362c;
                    if (i9 >= iArr3.length) {
                        break;
                    } else if (iArr3[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int length3 = this.f4362c.length;
            if (i7 >= length3) {
                int i10 = this.f4367h;
                int i11 = i10 + i10;
                this.f4367h = i11;
                this.f4369j = false;
                this.f4368i = length3 - 1;
                this.f4364e = Arrays.copyOf(this.f4364e, i11);
                this.f4362c = Arrays.copyOf(this.f4362c, this.f4367h);
                this.f4363d = Arrays.copyOf(this.f4363d, this.f4367h);
                i7 = length3;
            }
            this.f4362c[i7] = iVar.f4789c;
            this.f4364e[i7] = f;
            if (i4 != -1) {
                int[] iArr4 = this.f4363d;
                iArr4[i7] = iArr4[i4];
                iArr4[i4] = i7;
            } else {
                this.f4363d[i7] = this.f4365f;
                this.f4365f = i7;
            }
            iVar.f4798l++;
            iVar.mo4693a(this.f4366g);
            this.f4360a++;
            if (!this.f4369j) {
                this.f4368i++;
            }
            int i12 = this.f4368i;
            int length4 = this.f4362c.length;
            if (i12 >= length4) {
                this.f4369j = true;
                this.f4368i = length4 - 1;
            }
        }
    }
}
