package com.google.p370af;

import java.nio.ByteBuffer;

/* renamed from: com.google.af.i */
/* compiled from: PG */
public final class C7496i extends C7494g {
    /* renamed from: e */
    public static int m22764e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C7495h(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    /* renamed from: f */
    private static void m22765f(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i2, (byte) charAt);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position();
                int max = Math.max(i2, (position - byteBuffer.position()) + 1);
                char charAt2 = charSequence.charAt(i2);
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + (position2 + max));
            }
        }
        if (i2 == length) {
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position + i2);
            return;
        }
        position += i2;
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i, (byte) ((charAt3 & '?') | 128));
                    position = i;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i;
                    int position22 = byteBuffer.position();
                    int max2 = Math.max(i2, (position - byteBuffer.position()) + 1);
                    char charAt22 = charSequence.charAt(i2);
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt22 + " at index " + (position22 + max2));
                }
            } else if (charAt3 < 55296 || charAt3 > 57343) {
                i = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                position = i + 1;
                byteBuffer.put(i, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i3 = i2 + 1;
                if (i3 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                position = i4 + 1;
                                byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                i4 = position + 1;
                                byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                position = i4;
                                i2 = i3;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i4;
                                i2 = i3;
                                int position222 = byteBuffer.position();
                                int max22 = Math.max(i2, (position - byteBuffer.position()) + 1);
                                char charAt222 = charSequence.charAt(i2);
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt222 + " at index " + (position222 + max22));
                            }
                        } else {
                            i2 = i3;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                        i2 = i3;
                        int position2222 = byteBuffer.position();
                        int max222 = Math.max(i2, (position - byteBuffer.position()) + 1);
                        char charAt2222 = charSequence.charAt(i2);
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2222 + " at index " + (position2222 + max222));
                    }
                }
                throw new C7495h(i2, length);
            }
            i2++;
            position++;
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
    }

    /* renamed from: a */
    public final int mo16919a(CharSequence charSequence) {
        return m22764e(charSequence);
    }

    /* renamed from: b */
    public final String mo16920b(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + i;
            int length = array.length;
            if ((arrayOffset | i2 | ((length - arrayOffset) - i2)) >= 0) {
                int i6 = arrayOffset + i2;
                char[] cArr = new char[i2];
                int i7 = 0;
                while (i4 < i6) {
                    byte b = array[i4];
                    if (!C7493f.m22756d(b)) {
                        break;
                    }
                    arrayOffset = i4 + 1;
                    cArr[i5] = (char) b;
                    i7 = i5 + 1;
                }
                while (i4 < i6) {
                    int i8 = i4 + 1;
                    byte b2 = array[i4];
                    if (C7493f.m22756d(b2)) {
                        cArr[i5] = (char) b2;
                        i5++;
                        i4 = i8;
                        while (i4 < i6) {
                            byte b3 = array[i4];
                            if (!C7493f.m22756d(b3)) {
                                break;
                            }
                            i4++;
                            cArr[i5] = (char) b3;
                            i5++;
                        }
                    } else if (C7493f.m22758f(b2)) {
                        if (i8 < i6) {
                            i4 = i8 + 1;
                            C7493f.m22755c(b2, array[i8], cArr, i5);
                            i5++;
                        } else {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                    } else if (C7493f.m22757e(b2)) {
                        if (i8 < i6 - 1) {
                            int i9 = i8 + 1;
                            C7493f.m22754b(b2, array[i8], array[i9], cArr, i5);
                            i4 = i9 + 1;
                            i5++;
                        } else {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                    } else if (i8 < i6 - 2) {
                        int i10 = i8 + 1;
                        int i11 = i10 + 1;
                        C7493f.m22753a(b2, array[i8], array[i10], array[i11], cArr, i5);
                        i5 += 2;
                        i4 = i11 + 1;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i2)}));
        } else if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i12 = i + i2;
            char[] cArr2 = new char[i2];
            int i13 = 0;
            while (r14 < i12) {
                byte b4 = byteBuffer.get(r14);
                if (!C7493f.m22756d(b4)) {
                    break;
                }
                i = r14 + 1;
                cArr2[i3] = (char) b4;
                i13 = i3 + 1;
            }
            while (r14 < i12) {
                int i14 = r14 + 1;
                byte b5 = byteBuffer.get(r14);
                if (C7493f.m22756d(b5)) {
                    cArr2[i3] = (char) b5;
                    i3++;
                    r14 = i14;
                    while (r14 < i12) {
                        byte b6 = byteBuffer.get(r14);
                        if (!C7493f.m22756d(b6)) {
                            break;
                        }
                        r14++;
                        cArr2[i3] = (char) b6;
                        i3++;
                    }
                } else if (C7493f.m22758f(b5)) {
                    if (i14 < i12) {
                        r14 = i14 + 1;
                        C7493f.m22755c(b5, byteBuffer.get(i14), cArr2, i3);
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (C7493f.m22757e(b5)) {
                    if (i14 < i12 - 1) {
                        int i15 = i14 + 1;
                        C7493f.m22754b(b5, byteBuffer.get(i14), byteBuffer.get(i15), cArr2, i3);
                        r14 = i15 + 1;
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i14 < i12 - 2) {
                    int i16 = i14 + 1;
                    int i17 = i16 + 1;
                    C7493f.m22753a(b5, byteBuffer.get(i14), byteBuffer.get(i16), byteBuffer.get(i17), cArr2, i3);
                    i3 += 2;
                    r14 = i17 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr2, 0, i3);
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    /* renamed from: c */
    public final void mo16921c(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        char charAt;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position() + arrayOffset;
            int remaining = byteBuffer.remaining();
            int length = charSequence.length();
            int i5 = remaining + position;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + position) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
                array[i4] = (byte) charAt;
                i6++;
            }
            if (i6 == length) {
                i = position + length;
            } else {
                i = position + i6;
                while (i6 < length) {
                    char charAt2 = charSequence.charAt(i6);
                    if (charAt2 < 128 && i < i5) {
                        i3 = i + 1;
                        array[i] = (byte) charAt2;
                    } else if (charAt2 < 2048 && i <= i5 - 2) {
                        int i7 = i + 1;
                        array[i] = (byte) ((charAt2 >>> 6) | 960);
                        i = i7 + 1;
                        array[i7] = (byte) ((charAt2 & '?') | 128);
                        i6++;
                    } else if ((charAt2 < 55296 || charAt2 > 57343) && i <= i5 - 3) {
                        int i8 = i + 1;
                        array[i] = (byte) ((charAt2 >>> 12) | 480);
                        int i9 = i8 + 1;
                        array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i3 = i9 + 1;
                        array[i9] = (byte) ((charAt2 & '?') | 128);
                    } else if (i <= i5 - 4) {
                        int i10 = i6 + 1;
                        if (i10 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i11 = i + 1;
                                array[i] = (byte) ((codePoint >>> 18) | 240);
                                int i12 = i11 + 1;
                                array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i13 = i12 + 1;
                                array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i = i13 + 1;
                                array[i13] = (byte) ((codePoint & 63) | 128);
                                i6 = i10;
                                i6++;
                            } else {
                                i6 = i10;
                            }
                        }
                        throw new C7495h(i6 - 1, length);
                    } else if (charAt2 < 55296 || charAt2 > 57343 || ((i2 = i6 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i2)))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i);
                    } else {
                        throw new C7495h(i6, length);
                    }
                    i = i3;
                    i6++;
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i - arrayOffset);
            return;
        }
        m22765f(charSequence, byteBuffer);
    }
}
