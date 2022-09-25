package com.google.protobuf;

import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.fu */
/* compiled from: PG */
abstract class C63056fu {
    /* renamed from: i */
    static final String m95983i(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r11 < i3) {
                byte b = byteBuffer.get(r11);
                if (!C63055ft.m95979d(b)) {
                    break;
                }
                i = r11 + 1;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (r11 < i3) {
                int i6 = r11 + 1;
                byte b2 = byteBuffer.get(r11);
                if (C63055ft.m95979d(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    r11 = i6;
                    while (true) {
                        i5 = i7;
                        if (r11 >= i3) {
                            break;
                        }
                        byte b3 = byteBuffer.get(r11);
                        if (!C63055ft.m95979d(b3)) {
                            break;
                        }
                        r11++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b3;
                    }
                } else if (C63055ft.m95981f(b2)) {
                    if (i6 < i3) {
                        C63055ft.m95978c(b2, byteBuffer.get(i6), cArr, i5);
                        r11 = i6 + 1;
                        i5++;
                    } else {
                        throw C62974ct.m95553c();
                    }
                } else if (C63055ft.m95980e(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        C63055ft.m95977b(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                        r11 = i8 + 1;
                        i5++;
                    } else {
                        throw C62974ct.m95553c();
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    C63055ft.m95976a(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                    r11 = i10 + 1;
                } else {
                    throw C62974ct.m95553c();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: j */
    static final void m95984j(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                throw new C63058fw(i2, length);
            }
            i2++;
            position++;
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
    }

    /* renamed from: a */
    public abstract int mo59143a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* renamed from: b */
    public abstract int mo59144b(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo59145c(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer.hasArray()) {
            return mo59146d(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (byteBuffer.isDirect()) {
            return mo59147e(byteBuffer, i, i2);
        } else {
            return m95983i(byteBuffer, i, i2);
        }
    }

    /* renamed from: d */
    public abstract String mo59146d(byte[] bArr, int i, int i2);

    /* renamed from: e */
    public abstract String mo59147e(ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo59148f(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position();
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(C63059fx.f170178a.mo59143a(charSequence, array, position + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            mo59149g(charSequence, byteBuffer);
        } else {
            m95984j(charSequence, byteBuffer);
        }
    }

    /* renamed from: g */
    public abstract void mo59149g(CharSequence charSequence, ByteBuffer byteBuffer);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo59150h(byte[] bArr, int i, int i2) {
        return mo59144b(0, bArr, i, i2) == 0;
    }
}
