package com.android.p247a.p249b.p250a;

import com.android.p247a.p248a.C4981a;
import com.android.p247a.p248a.C4982b;
import com.android.p247a.p249b.p252b.C5002c;
import com.android.p247a.p249b.p252b.C5004e;
import com.android.p247a.p255d.C5013b;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.android.a.b.a.d */
/* compiled from: PG */
public final class C4993d {

    /* renamed from: a */
    public static final /* synthetic */ int f15818a = 0;

    /* renamed from: b */
    private static final char[] f15819b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static String m13775a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b : bArr) {
            char[] cArr = f15819b;
            sb.append(cArr[(b & 255) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static ByteBuffer m13776b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m13782h(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                throw new C4981a("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining);
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            throw new C4981a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining2);
        }
    }

    /* renamed from: c */
    public static void m13777c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: d */
    public static byte[] m13778d(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((byte[]) ((C5004e) it.next()).f15853b).length + 12;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C5004e eVar = (C5004e) it2.next();
            byte[] bArr = (byte[]) eVar.f15853b;
            int length = bArr.length;
            allocate.putInt(length + 8);
            allocate.putInt(((Integer) eVar.f15852a).intValue());
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: e */
    public static byte[] m13779e(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C4981a("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            throw new C4981a("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public static C4998i m13780f(C5002c cVar, C5013b bVar, int i) {
        long j;
        C5002c cVar2 = cVar;
        C5013b bVar2 = bVar;
        int i2 = i;
        try {
            long j2 = bVar2.f15880a;
            long j3 = bVar2.f15881b + j2;
            long j4 = bVar2.f15883d;
            if (j3 != j4) {
                throw new C4982b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + j3 + ", EoCD start: " + j4);
            } else if (j2 >= 32) {
                ByteBuffer a = cVar2.mo9959a(-24 + j2, 24);
                a.order(ByteOrder.LITTLE_ENDIAN);
                if (a.getLong(8) == 2334950737559900225L && a.getLong(16) == 3617552046287187010L) {
                    int i3 = 0;
                    long j5 = a.getLong(0);
                    if (j5 < ((long) a.capacity()) || j5 > 2147483639) {
                        throw new C4982b("APK Signing Block size out of range: " + j5);
                    }
                    long j6 = (long) ((int) (8 + j5));
                    long j7 = j2 - j6;
                    if (j7 >= 0) {
                        ByteBuffer a2 = cVar2.mo9959a(j7, 8);
                        a2.order(ByteOrder.LITTLE_ENDIAN);
                        long j8 = a2.getLong(0);
                        if (j8 == j5) {
                            long j9 = cVar2.f15849c;
                            long j10 = j6;
                            C5002c.m13786b(j7, j6, j9);
                            if (!(j7 == 0 && j10 == j9)) {
                                cVar2 = new C5002c(cVar2.f15847a, cVar2.f15848b + j7, j10);
                            }
                            ByteBuffer a3 = cVar2.mo9959a(0, (int) cVar2.f15849c);
                            a3.order(ByteOrder.LITTLE_ENDIAN);
                            m13777c(a3);
                            int capacity = a3.capacity() - 24;
                            if (capacity >= 8) {
                                int capacity2 = a3.capacity();
                                if (capacity <= a3.capacity()) {
                                    int limit = a3.limit();
                                    int position = a3.position();
                                    try {
                                        ByteBuffer byteBuffer = (ByteBuffer) a3.position(0);
                                        ByteBuffer byteBuffer2 = (ByteBuffer) a3.limit(capacity);
                                        ByteBuffer byteBuffer3 = (ByteBuffer) a3.position(8);
                                        ByteBuffer slice = a3.slice();
                                        slice.order(a3.order());
                                        ByteBuffer byteBuffer4 = (ByteBuffer) a3.position(0);
                                        ByteBuffer byteBuffer5 = (ByteBuffer) a3.limit(limit);
                                        Buffer position2 = a3.position(position);
                                        while (true) {
                                            ByteBuffer byteBuffer6 = (ByteBuffer) position2;
                                            if (slice.hasRemaining()) {
                                                i3++;
                                                if (slice.remaining() >= 8) {
                                                    j = slice.getLong();
                                                    if (j < 4 || j > 2147483647L) {
                                                    } else {
                                                        int i4 = (int) j;
                                                        int position3 = slice.position() + i4;
                                                        if (i4 > slice.remaining()) {
                                                            throw new C4999j("APK Signing Block entry #" + i3 + " size out of range: " + i4 + ", available: " + slice.remaining());
                                                        } else if (slice.getInt() == i2) {
                                                            return new C4998i(m13782h(slice, i4 - 4));
                                                        } else {
                                                            position2 = slice.position(position3);
                                                        }
                                                    }
                                                } else {
                                                    throw new C4999j("Insufficient data to read size of APK Signing Block entry #" + i3);
                                                }
                                            } else {
                                                throw new C4999j("No APK Signature Scheme block in APK Signing Block with ID: " + i2);
                                            }
                                        }
                                        throw new C4999j("APK Signing Block entry #" + i3 + " size out of range: " + j);
                                    } catch (Throwable th) {
                                        ByteBuffer byteBuffer7 = (ByteBuffer) a3.position(0);
                                        ByteBuffer byteBuffer8 = (ByteBuffer) a3.limit(limit);
                                        ByteBuffer byteBuffer9 = (ByteBuffer) a3.position(position);
                                        throw th;
                                    }
                                } else {
                                    throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                }
                            } else {
                                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                            }
                        } else {
                            throw new C4982b("APK Signing Block sizes in header and footer do not match: " + j8 + " vs " + j5);
                        }
                    } else {
                        throw new C4982b("APK Signing Block offset out of range: " + j7);
                    }
                } else {
                    throw new C4982b("No APK Signing Block before ZIP Central Directory");
                }
            } else {
                throw new C4982b("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
        } catch (C4982b e) {
            throw new C4999j(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public static List m13781g(List list, int i) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            C4994e eVar = (C4994e) it.next();
            C4997h hVar = eVar.f15820a;
            int i3 = hVar.f15843o;
            if (i3 < i2) {
                i2 = i3;
            }
            Integer valueOf = Integer.valueOf(i3);
            C4994e eVar2 = (C4994e) hashMap.get(valueOf);
            if (eVar2 != null) {
                C4997h hVar2 = eVar2.f15820a;
                C4995f fVar = hVar.f15841m;
                C4995f fVar2 = hVar2.f15841m;
                C4995f fVar3 = C4995f.CHUNKED_SHA256;
                int ordinal = fVar.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = fVar2.ordinal();
                    if (!(ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2)) {
                        throw new IllegalArgumentException("Unknown alg2: ".concat(String.valueOf(String.valueOf(fVar2))));
                    }
                } else if (ordinal == 1) {
                    int ordinal3 = fVar2.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 1) {
                            continue;
                        } else if (ordinal3 != 2) {
                            throw new IllegalArgumentException("Unknown alg2: ".concat(String.valueOf(String.valueOf(fVar2))));
                        }
                    }
                } else if (ordinal == 2) {
                    int ordinal4 = fVar2.ordinal();
                    if (ordinal4 != 0) {
                        if (!(ordinal4 == 1 || ordinal4 == 2)) {
                            throw new IllegalArgumentException("Unknown alg2: ".concat(String.valueOf(String.valueOf(fVar2))));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Unknown alg1: ".concat(String.valueOf(String.valueOf(fVar))));
                }
            }
            hashMap.put(valueOf, eVar);
        }
        if (i < i2) {
            throw new C4996g("Minimum provided signature version " + i2 + " > minSdkVersion " + i);
        } else if (!hashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashMap.values());
            Collections.sort(arrayList, C4992c.f15817a);
            return arrayList;
        } else {
            throw new C4996g("No supported signature");
        }
    }

    /* renamed from: h */
    private static ByteBuffer m13782h(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(i2);
            return slice;
        } finally {
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer.limit(limit);
        }
    }
}
