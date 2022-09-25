package com.p307c;

import android.graphics.Bitmap;
import android.graphics.Color;

/* renamed from: com.c.b */
/* compiled from: PG */
public final class C6009b {

    /* renamed from: a */
    private static final int[] f17712a = {1, 171, 205, 293, 57, 373, 79, 137, 241, 27, 391, 357, 41, 19, 283, 265, 497, 469, 443, 421, 25, 191, 365, 349, 335, 161, 155, 149, 9, 278, 269, 261, 505, 245, 475, 231, 449, 437, 213, 415, 405, 395, 193, 377, 369, 361, 353, 345, 169, 331, 325, 319, 313, 307, 301, 37, 145, 285, 281, 69, 271, 267, 263, 259, 509, 501, 493, 243, 479, 118, 465, 459, 113, 446, 55, 435, 429, 423, 209, 413, 51, 403, 199, 393, 97, 3, 379, 375, 371, 367, 363, 359, 355, 351, 347, 43, 85, 337, 333, 165, 327, 323, 5, 317, 157, 311, 77, 305, 303, 75, 297, 294, 73, 289, 287, 71, 141, 279, 277, 275, 68, 135, 67, 133, 33, 262, 260, 129, 511, 507, 503, 499, 495, 491, 61, 121, 481, 477, 237, 235, 467, 232, 115, 457, 227, 451, 7, 445, 221, 439, 218, 433, 215, 427, 425, 211, 419, 417, 207, 411, 409, 203, 202, 401, 399, 396, 197, 49, 389, 387, 385, 383, 95, 189, 47, 187, 93, 185, 23, 183, 91, 181, 45, 179, 89, 177, 11, 175, 87, 173, 345, 343, 341, 339, 337, 21, 167, 83, 331, 329, 327, 163, 81, 323, 321, 319, 159, 79, 315, 313, 39, 155, 309, 307, 153, 305, 303, 151, 75, 299, 149, 37, 295, 147, 73, 291, 145, 289, 287, 143, 285, 71, 141, 281, 35, 279, 139, 69, 275, 137, 273, 17, 271, 135, 269, 267, 133, 265, 33, 263, 131, 261, 130, 259, 129, 257, 1};

    /* renamed from: b */
    private static final int[] f17713b = {0, 9, 10, 11, 9, 12, 10, 11, 12, 9, 13, 13, 10, 9, 13, 13, 14, 14, 14, 14, 10, 13, 14, 14, 14, 13, 13, 13, 9, 14, 14, 14, 15, 14, 15, 14, 15, 15, 14, 15, 15, 15, 14, 15, 15, 15, 15, 15, 14, 15, 15, 15, 15, 15, 15, 12, 14, 15, 15, 13, 15, 15, 15, 15, 16, 16, 16, 15, 16, 14, 16, 16, 14, 16, 13, 16, 16, 16, 15, 16, 13, 16, 15, 16, 14, 9, 16, 16, 16, 16, 16, 16, 16, 16, 16, 13, 14, 16, 16, 15, 16, 16, 10, 16, 15, 16, 14, 16, 16, 14, 16, 16, 14, 16, 16, 14, 15, 16, 16, 16, 14, 15, 14, 15, 13, 16, 16, 15, 17, 17, 17, 17, 17, 17, 14, 15, 17, 17, 16, 16, 17, 16, 15, 17, 16, 17, 11, 17, 16, 17, 16, 17, 16, 17, 17, 16, 17, 17, 16, 17, 17, 16, 16, 17, 17, 17, 16, 14, 17, 17, 17, 17, 15, 16, 14, 16, 15, 16, 13, 16, 15, 16, 14, 16, 15, 16, 12, 16, 15, 16, 17, 17, 17, 17, 17, 13, 16, 15, 17, 17, 17, 16, 15, 17, 17, 17, 16, 15, 17, 17, 14, 16, 17, 17, 16, 17, 17, 16, 15, 17, 16, 14, 17, 16, 15, 17, 16, 17, 17, 16, 17, 15, 16, 17, 14, 17, 16, 15, 17, 16, 17, 13, 17, 16, 17, 17, 16, 17, 14, 17, 16, 17, 16, 17, 16, 17, 9};

    /* renamed from: a */
    public static void m15460a(Bitmap bitmap, Bitmap bitmap2, int i) {
        Bitmap bitmap3 = bitmap;
        int i2 = i;
        if (bitmap3 != null && bitmap2 != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (bitmap2.getWidth() == width && bitmap2.getHeight() == height && bitmap2.isMutable()) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                int[] iArr = new int[(width2 * height2 * 4)];
                for (int i3 = 0; i3 < height2; i3++) {
                    for (int i4 = 0; i4 < width2; i4++) {
                        int pixel = bitmap3.getPixel(i4, i3);
                        int i5 = ((i3 * width2) + i4) * 4;
                        iArr[i5] = Color.red(pixel);
                        iArr[i5 + 1] = Color.green(pixel);
                        iArr[i5 + 2] = Color.blue(pixel);
                        iArr[i5 + 3] = Color.alpha(pixel);
                    }
                }
                int i6 = i2 + i2 + 1;
                int i7 = width - 1;
                int i8 = height - 1;
                int i9 = i2 + 1;
                C6008a aVar = new C6008a();
                C6008a aVar2 = aVar;
                int i10 = 1;
                while (i10 < i6) {
                    C6008a aVar3 = new C6008a();
                    aVar2.f17711d = aVar3;
                    i10++;
                    aVar2 = aVar3;
                }
                aVar2.f17711d = aVar;
                int i11 = f17712a[i2];
                int i12 = f17713b[i2];
                int i13 = 1;
                while (true) {
                    int i14 = i13 - 1;
                    if (i13 <= 0) {
                        break;
                    }
                    int i15 = height;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        int i18 = i15 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        int i19 = iArr[i16];
                        int i20 = i9 * i19;
                        int i21 = iArr[i16 + 1];
                        int i22 = i9 * i21;
                        C6008a aVar4 = aVar;
                        int i23 = iArr[i16 + 2];
                        int i24 = i9 * i23;
                        int i25 = i9;
                        int i26 = i18;
                        C6008a aVar5 = aVar4;
                        while (true) {
                            i25--;
                            if (i25 < 0) {
                                break;
                            }
                            aVar5.f17708a = i19;
                            aVar5.f17709b = i21;
                            aVar5.f17710c = i23;
                            aVar5 = aVar5.f17711d;
                        }
                        int i27 = 1;
                        while (i27 < i9) {
                            int i28 = ((i7 < i27 ? i7 : i27) << 2) + i16;
                            int i29 = i28 + 1;
                            int i30 = iArr[i28];
                            aVar5.f17708a = i30;
                            i20 += i30;
                            int i31 = iArr[i29];
                            aVar5.f17709b = i31;
                            i22 += i31;
                            int i32 = iArr[i29 + 1];
                            aVar5.f17710c = i32;
                            i24 += i32;
                            aVar5 = aVar5.f17711d;
                            i27++;
                        }
                        C6008a aVar6 = aVar4;
                        for (int i33 = 0; i33 < width; i33++) {
                            int i34 = i16 + 1;
                            iArr[i16] = (i20 * i11) >>> i12;
                            int i35 = i34 + 1;
                            iArr[i34] = (i22 * i11) >>> i12;
                            iArr[i35] = (i24 * i11) >>> i12;
                            i16 = i35 + 2;
                            int i36 = i33 + i2 + 1;
                            if (i36 >= i7) {
                                i36 = i7;
                            }
                            int i37 = (i36 + i17) << 2;
                            int i38 = aVar6.f17708a;
                            int i39 = i37 + 1;
                            int i40 = iArr[i37];
                            aVar6.f17708a = i40;
                            i20 -= i38 - i40;
                            int i41 = aVar6.f17709b;
                            int i42 = iArr[i39];
                            aVar6.f17709b = i42;
                            i22 -= i41 - i42;
                            int i43 = aVar6.f17710c;
                            int i44 = iArr[i39 + 1];
                            aVar6.f17710c = i44;
                            i24 -= i43 - i44;
                            aVar6 = aVar6.f17711d;
                        }
                        i17 += width;
                        aVar = aVar4;
                        i15 = i26;
                    }
                    C6008a aVar7 = aVar;
                    int i45 = 0;
                    while (i45 < width) {
                        int i46 = i45 << 2;
                        int i47 = i46 + 1;
                        int i48 = iArr[i46];
                        int i49 = iArr[i47];
                        int i50 = i9 * i49;
                        int i51 = iArr[i47 + 1];
                        int i52 = i9 * i51;
                        int i53 = i7;
                        int i54 = i9 * i48;
                        C6008a aVar8 = aVar7;
                        for (int i55 = 0; i55 < i9; i55++) {
                            aVar8.f17708a = i48;
                            aVar8.f17709b = i49;
                            aVar8.f17710c = i51;
                            aVar8 = aVar8.f17711d;
                        }
                        int i56 = width;
                        C6008a aVar9 = aVar8;
                        int i57 = i54;
                        for (int i58 = 1; i58 <= i2; i58++) {
                            int i59 = (i56 + i45) << 2;
                            int i60 = i59 + 1;
                            int i61 = iArr[i59];
                            aVar9.f17708a = i61;
                            i57 += i61;
                            int i62 = iArr[i60];
                            aVar9.f17709b = i62;
                            i50 += i62;
                            int i63 = iArr[i60 + 1];
                            aVar9.f17710c = i63;
                            i52 += i63;
                            aVar9 = aVar9.f17711d;
                            if (i58 < i8) {
                                i56 += width;
                            }
                        }
                        int i64 = i45;
                        C6008a aVar10 = aVar7;
                        int i65 = 0;
                        while (i65 < height) {
                            int i66 = i64 << 2;
                            iArr[i66] = (i57 * i11) >>> i12;
                            iArr[i66 + 1] = (i50 * i11) >>> i12;
                            iArr[i66 + 2] = (i52 * i11) >>> i12;
                            int i67 = i65 + i9;
                            if (i67 >= i8) {
                                i67 = i8;
                            }
                            int i68 = ((i67 * width) + i45) << 2;
                            int i69 = i11;
                            int i70 = aVar10.f17708a;
                            int i71 = iArr[i68];
                            aVar10.f17708a = i71;
                            i57 -= i70 - i71;
                            int i72 = aVar10.f17709b;
                            int i73 = iArr[i68 + 1];
                            aVar10.f17709b = i73;
                            i50 -= i72 - i73;
                            int i74 = aVar10.f17710c;
                            int i75 = iArr[i68 + 2];
                            aVar10.f17710c = i75;
                            i52 -= i74 - i75;
                            aVar10 = aVar10.f17711d;
                            i64 += width;
                            i65++;
                            int i76 = i;
                            i11 = i69;
                        }
                        int i77 = i11;
                        i45++;
                        i2 = i;
                        i7 = i53;
                    }
                    i2 = i;
                    i13 = i14;
                    aVar = aVar7;
                }
                int[] iArr2 = new int[(width * height)];
                for (int i78 = 0; i78 < height; i78++) {
                    for (int i79 = 0; i79 < width; i79++) {
                        int i80 = (i78 * width) + i79;
                        int i81 = i80 * 4;
                        iArr2[i80] = Color.argb(iArr[i81 + 3], iArr[i81], iArr[i81 + 1], iArr[i81 + 2]);
                    }
                }
                bitmap2.setPixels(iArr2, 0, width, 0, 0, width, height);
                return;
            }
            throw new IllegalArgumentException("outBitmap must be a mutable bitmap of the same dimension");
        }
    }
}
