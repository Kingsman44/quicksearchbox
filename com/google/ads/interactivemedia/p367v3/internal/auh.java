package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auh */
/* compiled from: PG */
public final class auh {

    /* renamed from: a */
    private final ByteBuffer f21560a;

    private auh(ByteBuffer byteBuffer) {
        this.f21560a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static auh m19651a(byte[] bArr) {
        return new auh(ByteBuffer.wrap(bArr, 0, bArr.length));
    }

    /* renamed from: g */
    public static int m19652g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: i */
    private static void m19653i(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i3 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4 || (charAt = charSequence.charAt(i3)) >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || charAt2 > 57343) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 12) | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i3 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || charAt4 > 57343) {
                        byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i13 = i3 + 1;
                        if (i13 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i3 = i13;
                            } else {
                                i3 = i13;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("Unpaired surrogate at index ");
                        sb3.append(i3 - 1);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: b */
    public final void mo15446b(String str) {
        try {
            int g = m19652g(str.length());
            if (g == m19652g(str.length() * 3)) {
                int position = this.f21560a.position();
                if (this.f21560a.remaining() >= g) {
                    this.f21560a.position(position + g);
                    m19653i(str, this.f21560a);
                    int position2 = this.f21560a.position();
                    this.f21560a.position(position);
                    mo15450f((position2 - position) - g);
                    this.f21560a.position(position2);
                    return;
                }
                throw new aug(position + g, this.f21560a.limit());
            }
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i2 < length && str.charAt(i2) < 128) {
                i2++;
            }
            int i3 = length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt < 2048) {
                    i3 += (127 - charAt) >>> 31;
                    i2++;
                } else {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) >= 65536) {
                                    i2++;
                                } else {
                                    StringBuilder sb = new StringBuilder(39);
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i2);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                }
            }
            if (i3 >= length) {
                mo15450f(i3);
                m19653i(str, this.f21560a);
                return;
            }
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("UTF-8 length does not fit in int: ");
            sb2.append(((long) i3) + 4294967296L);
            throw new IllegalArgumentException(sb2.toString());
        } catch (BufferOverflowException e) {
            aug aug = new aug(this.f21560a.position(), this.f21560a.limit());
            aug.initCause(e);
            throw aug;
        }
    }

    /* renamed from: c */
    public final int mo15447c() {
        return this.f21560a.remaining();
    }

    /* renamed from: d */
    public final void mo15448d(int i) {
        byte b = (byte) i;
        if (this.f21560a.hasRemaining()) {
            this.f21560a.put(b);
            return;
        }
        throw new aug(this.f21560a.position(), this.f21560a.limit());
    }

    /* renamed from: e */
    public final void mo15449e(int i, int i2) {
        mo15450f(aty.m19638b(i, i2));
    }

    /* renamed from: f */
    public final void mo15450f(int i) {
        while ((i & -128) != 0) {
            mo15448d((i & 127) | 128);
            i >>>= 7;
        }
        mo15448d(i);
    }

    /* renamed from: h */
    public final void mo15451h(long j) {
        while ((-128 & j) != 0) {
            mo15448d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo15448d((int) j);
    }
}
