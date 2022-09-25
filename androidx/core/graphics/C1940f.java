package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import com.google.common.p4535g.C59203do;

/* renamed from: androidx.core.graphics.f */
/* compiled from: PG */
public final class C1940f {

    /* renamed from: a */
    public char f5849a;

    /* renamed from: b */
    public final float[] f5850b;

    public C1940f(char c, float[] fArr) {
        this.f5849a = c;
        this.f5850b = fArr;
    }

    public C1940f(C1940f fVar) {
        this.f5849a = fVar.f5849a;
        float[] fArr = fVar.f5850b;
        this.f5850b = C1941g.m5257c(fArr, fArr.length);
    }

    /* renamed from: a */
    public static void m5253a(C1940f[] fVarArr, Path path) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        char c;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        int i5;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        C1940f[] fVarArr2 = fVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        char c2 = 'm';
        char c3 = 0;
        char c4 = 'm';
        int i6 = 0;
        while (i6 < fVarArr2.length) {
            C1940f fVar = fVarArr2[i6];
            char c5 = fVar.f5849a;
            float[] fArr3 = fVar.f5850b;
            float f15 = fArr2[c3];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            float f20 = fArr2[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    break;
            }
            i = 2;
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i7 = 0;
            while (i7 < fArr3.length) {
                if (c5 != 'A') {
                    if (c5 == 'C') {
                        i2 = i7;
                        fArr = fArr3;
                        c = c5;
                        i3 = i6;
                        int i8 = i2 + 2;
                        int i9 = i2 + 3;
                        int i10 = i2 + 4;
                        int i11 = i2 + 5;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                        f23 = fArr[i10];
                        f24 = fArr[i11];
                        f17 = fArr[i8];
                        f18 = fArr[i9];
                    } else if (c5 == 'H') {
                        i2 = i7;
                        fArr = fArr3;
                        c = c5;
                        i3 = i6;
                        path2.lineTo(fArr[i2], f24);
                        f23 = fArr[i2];
                    } else if (c5 == 'Q') {
                        i2 = i7;
                        fArr = fArr3;
                        c = c5;
                        i3 = i6;
                        int i12 = i2 + 1;
                        int i13 = i2 + 2;
                        int i14 = i2 + 3;
                        path2.quadTo(fArr[i2], fArr[i12], fArr[i13], fArr[i14]);
                        float f25 = fArr[i2];
                        float f26 = fArr[i12];
                        f23 = fArr[i13];
                        f24 = fArr[i14];
                        f17 = f25;
                        f18 = f26;
                    } else if (c5 == 'V') {
                        i2 = i7;
                        fArr = fArr3;
                        c = c5;
                        i3 = i6;
                        path2.lineTo(f23, fArr[i2]);
                        f24 = fArr[i2];
                    } else if (c5 != 'a') {
                        if (c5 != 'c') {
                            if (c5 == 'h') {
                                i2 = i7;
                                float f27 = f24;
                                path2.rLineTo(fArr3[i2], 0.0f);
                                f23 += fArr3[i2];
                            } else if (c5 == 'q') {
                                i5 = i7;
                                f5 = f24;
                                float f28 = f23;
                                int i15 = i5 + 1;
                                int i16 = i5 + 2;
                                int i17 = i5 + 3;
                                path2.rQuadTo(fArr3[i5], fArr3[i15], fArr3[i16], fArr3[i17]);
                                f7 = f28 + fArr3[i5];
                                f8 = f5 + fArr3[i15];
                                f4 = f28 + fArr3[i16];
                                f6 = fArr3[i17];
                            } else if (c5 == 'v') {
                                i2 = i7;
                                float f29 = f23;
                                path2.rLineTo(0.0f, fArr3[i2]);
                                f24 += fArr3[i2];
                            } else if (c5 != 'L') {
                                if (c5 == 'M') {
                                    i2 = i7;
                                    f23 = fArr3[i2];
                                    f24 = fArr3[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f23, f24);
                                    } else {
                                        path2.moveTo(f23, f24);
                                    }
                                } else if (c5 == 'S') {
                                    i2 = i7;
                                    float f30 = f24;
                                    float f31 = f23;
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f9 = (f30 + f30) - f18;
                                        f10 = (f31 + f31) - f17;
                                    } else {
                                        f10 = f31;
                                        f9 = f30;
                                    }
                                    int i18 = i2 + 1;
                                    int i19 = i2 + 2;
                                    int i20 = i2 + 3;
                                    path.cubicTo(f10, f9, fArr3[i2], fArr3[i18], fArr3[i19], fArr3[i20]);
                                    float f32 = fArr3[i2];
                                    float f33 = fArr3[i18];
                                    f23 = fArr3[i19];
                                    f24 = fArr3[i20];
                                    f18 = f33;
                                    f17 = f32;
                                } else if (c5 == 'T') {
                                    i5 = i7;
                                    float f34 = f24;
                                    float f35 = f23;
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f = (f35 + f35) - f17;
                                        f2 = (f34 + f34) - f18;
                                    } else {
                                        f = f35;
                                        f2 = f34;
                                    }
                                    int i21 = i5 + 1;
                                    path2.quadTo(f, f2, fArr3[i5], fArr3[i21]);
                                    f4 = fArr3[i5];
                                    f3 = fArr3[i21];
                                    f18 = f2;
                                    f17 = f;
                                    fArr = fArr3;
                                    c = c5;
                                    i3 = i6;
                                    f23 = f4;
                                    f24 = f3;
                                } else if (c5 == 'l') {
                                    i2 = i7;
                                    int i22 = i2 + 1;
                                    path2.rLineTo(fArr3[i2], fArr3[i22]);
                                    f23 += fArr3[i2];
                                    f24 += fArr3[i22];
                                } else if (c5 == c2) {
                                    i2 = i7;
                                    float f36 = fArr3[i2];
                                    f23 += f36;
                                    float f37 = fArr3[i2 + 1];
                                    f24 += f37;
                                    if (i2 > 0) {
                                        path2.rLineTo(f36, f37);
                                    } else {
                                        path2.rMoveTo(f36, f37);
                                    }
                                } else if (c5 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i23 = i7 + 1;
                                    int i24 = i7 + 2;
                                    int i25 = i7 + 3;
                                    i5 = i7;
                                    f5 = f24;
                                    float f38 = f23;
                                    path.rCubicTo(f12, f11, fArr3[i7], fArr3[i23], fArr3[i24], fArr3[i25]);
                                    f7 = f38 + fArr3[i5];
                                    f8 = f5 + fArr3[i23];
                                    f4 = f38 + fArr3[i24];
                                    f6 = fArr3[i25];
                                } else if (c5 != 't') {
                                    i2 = i7;
                                } else {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f13 = f23 - f17;
                                        f14 = f24 - f18;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0;
                                    }
                                    int i26 = i7 + 1;
                                    path2.rQuadTo(f13, f14, fArr3[i7], fArr3[i26]);
                                    float f39 = f13 + f23;
                                    float f40 = f14 + f24;
                                    f23 += fArr3[i7];
                                    f24 += fArr3[i26];
                                    f18 = f40;
                                    i2 = i7;
                                    fArr = fArr3;
                                    c = c5;
                                    i3 = i6;
                                    f17 = f39;
                                }
                                f22 = f24;
                                f21 = f23;
                            } else {
                                i2 = i7;
                                int i27 = i2 + 1;
                                path2.lineTo(fArr3[i2], fArr3[i27]);
                                f23 = fArr3[i2];
                                f24 = fArr3[i27];
                            }
                            fArr = fArr3;
                            c = c5;
                            i3 = i6;
                        } else {
                            i5 = i7;
                            f5 = f24;
                            float f41 = f23;
                            int i28 = i5 + 2;
                            int i29 = i5 + 3;
                            int i30 = i5 + 4;
                            int i31 = i5 + 5;
                            path.rCubicTo(fArr3[i5], fArr3[i5 + 1], fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                            f7 = f41 + fArr3[i28];
                            f8 = f5 + fArr3[i29];
                            f4 = f41 + fArr3[i30];
                            f6 = fArr3[i31];
                        }
                        f3 = f6 + f5;
                        f18 = f2;
                        f17 = f;
                        fArr = fArr3;
                        c = c5;
                        i3 = i6;
                        f23 = f4;
                        f24 = f3;
                    } else {
                        i4 = i7;
                        float f42 = f24;
                        float f43 = f23;
                        int i32 = i4 + 5;
                        float f44 = fArr3[i32] + f43;
                        int i33 = i4 + 6;
                        float f45 = fArr3[i33] + f42;
                        float f46 = fArr3[i4];
                        float f47 = fArr3[i4 + 1];
                        float f48 = fArr3[i4 + 2];
                        boolean z = fArr3[i4 + 3] != 0.0f;
                        boolean z2 = fArr3[i4 + 4] != 0.0f;
                        fArr = fArr3;
                        float f49 = f48;
                        c = c5;
                        i3 = i6;
                        m5254b(path, f43, f42, f44, f45, f46, f47, f49, z, z2);
                        f23 = f43 + fArr[i32];
                        f24 = f42 + fArr[i33];
                    }
                    i7 = i2 + i;
                    c4 = c;
                    c5 = c4;
                    fArr3 = fArr;
                    i6 = i3;
                    c2 = 'm';
                    C1940f[] fVarArr3 = fVarArr;
                } else {
                    i4 = i7;
                    fArr = fArr3;
                    c = c5;
                    i3 = i6;
                    int i34 = i4 + 5;
                    int i35 = i4 + 6;
                    m5254b(path, f23, f24, fArr[i34], fArr[i35], fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3] != 0.0f, fArr[i4 + 4] != 0.0f);
                    f23 = fArr[i34];
                    f24 = fArr[i35];
                }
                f18 = f24;
                f17 = f23;
                i7 = i2 + i;
                c4 = c;
                c5 = c4;
                fArr3 = fArr;
                i6 = i3;
                c2 = 'm';
                C1940f[] fVarArr32 = fVarArr;
            }
            int i36 = i6;
            fArr2[0] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            i6 = i36 + 1;
            c4 = fVarArr[i36].f5849a;
            c2 = 'm';
            c3 = 0;
            fVarArr2 = fVarArr;
        }
    }

    /* renamed from: b */
    private static void m5254b(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f;
        float f9 = f3;
        boolean z3 = z2;
        double radians = Math.toRadians((double) f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f8;
        double d4 = (double) f2;
        double d5 = radians;
        double d6 = (double) f5;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d6);
        double d7 = ((d3 * cos) + (d4 * sin)) / d6;
        double d8 = d3;
        double d9 = (double) f6;
        double d10 = (double) (-f8);
        Double.isNaN(d10);
        Double.isNaN(d4);
        Double.isNaN(d9);
        double d11 = d4;
        double d12 = (double) f4;
        double d13 = ((d10 * sin) + (d4 * cos)) / d9;
        double d14 = (double) f9;
        Double.isNaN(d14);
        Double.isNaN(d12);
        Double.isNaN(d6);
        double d15 = ((d14 * cos) + (d12 * sin)) / d6;
        double d16 = (double) (-f9);
        Double.isNaN(d16);
        Double.isNaN(d12);
        Double.isNaN(d9);
        double d17 = ((d16 * sin) + (d12 * cos)) / d9;
        double d18 = d7 - d15;
        double d19 = d13 - d17;
        double d20 = (d7 + d15) / 2.0d;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = sin;
        double d23 = (d18 * d18) + (d19 * d19);
        if (d23 == C59203do.f157270a) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 16.0d;
        if (d24 < C59203do.f157270a) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
            m5254b(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d24);
        double d25 = d18 * sqrt2;
        double d26 = sqrt2 * d19;
        if (z == z3) {
            d2 = d20 - d26;
            d = d21 + d25;
        } else {
            d2 = d20 + d26;
            d = d21 - d25;
        }
        double atan2 = Math.atan2(d13 - d, d7 - d2);
        double atan22 = Math.atan2(d17 - d, d15 - d2) - atan2;
        int i = 0;
        if (z3 != (atan22 >= C59203do.f157270a)) {
            atan22 += atan22 > C59203do.f157270a ? -6.283185307179586d : 6.283185307179586d;
        }
        Double.isNaN(d6);
        double d27 = d2 * d6;
        Double.isNaN(d9);
        double d28 = d * d9;
        double d29 = (d27 * cos) - (d28 * d22);
        double d30 = (d27 * d22) + (d28 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d5);
        double sin2 = Math.sin(d5);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(d6);
        double d31 = -d6;
        double d32 = d31 * cos2;
        Double.isNaN(d9);
        double d33 = d9 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        Double.isNaN(d9);
        double d36 = d9 * cos2;
        double d37 = (sin3 * d35) + (cos3 * d36);
        double d38 = atan2;
        double d39 = (double) ceil;
        Double.isNaN(d39);
        double d40 = atan22 / d39;
        double d41 = d38;
        while (i < ceil) {
            double d42 = d41 + d40;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            Double.isNaN(d6);
            double d43 = d40;
            double d44 = (d29 + ((d6 * cos2) * cos4)) - (d33 * sin4);
            Double.isNaN(d6);
            int i2 = ceil;
            double d45 = d30 + (d6 * sin2 * cos4) + (d36 * sin4);
            double d46 = (d32 * sin4) - (d33 * cos4);
            double d47 = (sin4 * d35) + (cos4 * d36);
            double d48 = d42 - d41;
            double tan = Math.tan(d48 / 2.0d);
            double sin5 = (Math.sin(d48) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 4.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d8 + (d34 * sin5)), (float) (d11 + (d37 * sin5)), (float) (d44 - (sin5 * d46)), (float) (d45 - (sin5 * d47)), (float) d44, (float) d45);
            i++;
            d29 = d29;
            d35 = d35;
            d8 = d44;
            d11 = d45;
            d41 = d42;
            d37 = d47;
            d34 = d46;
            d6 = d6;
            ceil = i2;
            d40 = d43;
        }
    }
}
