package android.support.constraint.p029a;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a */
/* compiled from: PG */
public final class C0130a {

    /* renamed from: a */
    int f394a = 0;

    /* renamed from: b */
    public final C0140c f395b;

    /* renamed from: c */
    public int[] f396c = new int[8];

    /* renamed from: d */
    public int[] f397d = new int[8];

    /* renamed from: e */
    public float[] f398e = new float[8];

    /* renamed from: f */
    public int f399f = -1;

    /* renamed from: g */
    public int f400g = -1;

    /* renamed from: h */
    public boolean f401h = false;

    /* renamed from: i */
    private final C0139b f402i;

    /* renamed from: j */
    private int f403j = 8;

    public C0130a(C0139b bVar, C0140c cVar) {
        this.f402i = bVar;
        this.f395b = cVar;
    }

    /* renamed from: a */
    public final float mo114a(C0144g gVar) {
        int i = this.f399f;
        int i2 = 0;
        while (i != -1 && i2 < this.f394a) {
            if (this.f396c[i] == gVar.f527a) {
                return this.f398e[i];
            }
            i = this.f397d[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo116c(C0144g gVar) {
        int i = this.f399f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f394a) {
                int i4 = this.f396c[i];
                if (i4 == gVar.f527a) {
                    if (i == this.f399f) {
                        this.f399f = this.f397d[i];
                    } else {
                        int[] iArr = this.f397d;
                        iArr[i3] = iArr[i];
                    }
                    this.f395b.f507a[i4].mo184a(this.f402i);
                    this.f394a--;
                    this.f396c[i] = -1;
                    if (this.f401h) {
                        this.f400g = i;
                    }
                    return this.f398e[i];
                }
                i2++;
                i3 = i;
                i = this.f397d[i];
            }
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final void mo119f(C0144g gVar, float f) {
        if (f == 0.0f) {
            mo116c(gVar);
            return;
        }
        int i = this.f399f;
        if (i == -1) {
            this.f399f = 0;
            this.f398e[0] = f;
            this.f396c[0] = gVar.f527a;
            this.f397d[0] = -1;
            this.f394a++;
            if (!this.f401h) {
                this.f400g++;
                return;
            }
            return;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f394a) {
            int i4 = this.f396c[i];
            int i5 = gVar.f527a;
            if (i4 == i5) {
                this.f398e[i] = f;
                return;
            }
            if (i4 < i5) {
                i3 = i;
            }
            i = this.f397d[i];
            i2++;
        }
        int i6 = this.f400g;
        int i7 = i6 + 1;
        if (this.f401h) {
            int[] iArr = this.f396c;
            if (iArr[i6] != -1) {
                i6 = iArr.length;
            }
        } else {
            i6 = i7;
        }
        int length = this.f396c.length;
        if (i6 >= length && this.f394a < length) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.f396c;
                if (i8 >= iArr2.length) {
                    break;
                } else if (iArr2[i8] == -1) {
                    i6 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int length2 = this.f396c.length;
        if (i6 >= length2) {
            int i9 = this.f403j;
            int i10 = i9 + i9;
            this.f403j = i10;
            this.f401h = false;
            this.f400g = length2 - 1;
            this.f398e = Arrays.copyOf(this.f398e, i10);
            this.f396c = Arrays.copyOf(this.f396c, this.f403j);
            this.f397d = Arrays.copyOf(this.f397d, this.f403j);
            i6 = length2;
        }
        int[] iArr3 = this.f396c;
        iArr3[i6] = gVar.f527a;
        this.f398e[i6] = f;
        if (i3 != -1) {
            int[] iArr4 = this.f397d;
            iArr4[i6] = iArr4[i3];
            iArr4[i3] = i6;
        } else {
            this.f397d[i6] = this.f399f;
            this.f399f = i6;
        }
        int i11 = this.f394a + 1;
        this.f394a = i11;
        if (!this.f401h) {
            this.f400g++;
        }
        if (i11 >= iArr3.length) {
            this.f401h = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo120g(C0139b bVar) {
        int i = this.f399f;
        int i2 = 0;
        while (i != -1 && i2 < this.f394a) {
            C0144g gVar = this.f395b.f507a[this.f396c[i]];
            int i3 = 0;
            while (true) {
                int i4 = gVar.f533g;
                if (i3 >= i4) {
                    C0139b[] bVarArr = gVar.f532f;
                    int length = bVarArr.length;
                    if (i4 >= length) {
                        gVar.f532f = (C0139b[]) Arrays.copyOf(bVarArr, length + length);
                    }
                    C0139b[] bVarArr2 = gVar.f532f;
                    int i5 = gVar.f533g;
                    bVarArr2[i5] = bVar;
                    gVar.f533g = i5 + 1;
                } else if (gVar.f532f[i3] == bVar) {
                    break;
                } else {
                    i3++;
                }
            }
            i = this.f397d[i];
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo121h(C0139b bVar, C0139b bVar2) {
        int i = this.f399f;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f394a) {
                int i3 = this.f396c[i];
                C0144g gVar = bVar2.f502a;
                if (i3 == gVar.f527a) {
                    float f = this.f398e[i];
                    mo116c(gVar);
                    C0130a aVar = bVar2.f505d;
                    int i4 = aVar.f399f;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f394a) {
                        mo118e(this.f395b.f507a[aVar.f396c[i4]], aVar.f398e[i4] * f);
                        i4 = aVar.f397d[i4];
                        i5++;
                    }
                    bVar.f503b += bVar2.f503b * f;
                    bVar2.f502a.mo184a(bVar);
                    i = this.f399f;
                } else {
                    i = this.f397d[i];
                    i2++;
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.f399f;
        String str = BuildConfig.FLAVOR;
        int i2 = 0;
        while (i != -1 && i2 < this.f394a) {
            String str2 = str.concat(" -> ") + this.f398e[i] + " : ";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            C0144g gVar = this.f395b.f507a[this.f396c[i]];
            sb.append(gVar);
            str = str2.concat(String.valueOf(gVar));
            i = this.f397d[i];
            i2++;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo115b(int i) {
        int i2 = this.f399f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f394a) {
            if (i3 == i) {
                return this.f398e[i2];
            }
            i2 = this.f397d[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0144g mo117d(int i) {
        int i2 = this.f399f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f394a) {
            if (i3 == i) {
                return this.f395b.f507a[this.f396c[i2]];
            }
            i2 = this.f397d[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo118e(C0144g gVar, float f) {
        if (f != 0.0f) {
            int i = this.f399f;
            if (i == -1) {
                this.f399f = 0;
                this.f398e[0] = f;
                this.f396c[0] = gVar.f527a;
                this.f397d[0] = -1;
                this.f394a++;
                if (!this.f401h) {
                    this.f400g++;
                    return;
                }
                return;
            }
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f394a) {
                int i4 = this.f396c[i];
                int i5 = gVar.f527a;
                if (i4 == i5) {
                    float[] fArr = this.f398e;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f399f) {
                            this.f399f = this.f397d[i];
                        } else {
                            int[] iArr = this.f397d;
                            iArr[i3] = iArr[i];
                        }
                        this.f395b.f507a[i4].mo184a(this.f402i);
                        if (this.f401h) {
                            this.f400g = i;
                        }
                        this.f394a--;
                        return;
                    }
                    return;
                }
                if (i4 < i5) {
                    i3 = i;
                }
                i = this.f397d[i];
                i2++;
            }
            int i6 = this.f400g;
            int i7 = i6 + 1;
            if (this.f401h) {
                int[] iArr2 = this.f396c;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.f396c.length;
            if (i6 >= length && this.f394a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.f396c;
                    if (i8 >= iArr3.length) {
                        break;
                    } else if (iArr3[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int length2 = this.f396c.length;
            if (i6 >= length2) {
                int i9 = this.f403j;
                int i10 = i9 + i9;
                this.f403j = i10;
                this.f401h = false;
                this.f400g = length2 - 1;
                this.f398e = Arrays.copyOf(this.f398e, i10);
                this.f396c = Arrays.copyOf(this.f396c, this.f403j);
                this.f397d = Arrays.copyOf(this.f397d, this.f403j);
                i6 = length2;
            }
            int[] iArr4 = this.f396c;
            iArr4[i6] = gVar.f527a;
            this.f398e[i6] = f;
            if (i3 != -1) {
                int[] iArr5 = this.f397d;
                iArr5[i6] = iArr5[i3];
                iArr5[i3] = i6;
            } else {
                this.f397d[i6] = this.f399f;
                this.f399f = i6;
            }
            this.f394a++;
            if (!this.f401h) {
                this.f400g++;
            }
            int i11 = this.f400g;
            int length3 = iArr4.length;
            if (i11 >= length3) {
                this.f401h = true;
                this.f400g = length3 - 1;
            }
        }
    }
}
