package com.google.protobuf;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.fq */
/* compiled from: PG */
final class C63052fq extends C63053fr {
    public C63052fq(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo59123a(long j) {
        return Memory.peekByte(j);
    }

    /* renamed from: b */
    public final double mo59124b(Object obj, long j) {
        return Double.longBitsToDouble(mo59136n(obj, j));
    }

    /* renamed from: c */
    public final float mo59125c(Object obj, long j) {
        return Float.intBitsToFloat(mo59135m(obj, j));
    }

    /* renamed from: d */
    public final void mo59126d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public final void mo59127e(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }

    /* renamed from: f */
    public final void mo59128f(Object obj, long j, boolean z) {
        if (C63054fs.f170173e) {
            C63054fs.m95968g(obj, j, z);
        } else {
            C63054fs.m95969h(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: g */
    public final void mo59129g(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    /* renamed from: h */
    public final void mo59130h(Object obj, long j, byte b) {
        if (C63054fs.f170173e) {
            C63054fs.m95968g(obj, j, b);
        } else {
            C63054fs.m95969h(obj, j, b);
        }
    }

    /* renamed from: i */
    public final void mo59131i(Object obj, long j, double d) {
        mo59140r(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: j */
    public final void mo59132j(Object obj, long j, float f) {
        mo59139q(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: k */
    public final boolean mo59133k(Object obj, long j) {
        if (C63054fs.f170173e) {
            return C63054fs.m95971j(obj, j);
        }
        return C63054fs.m95972k(obj, j);
    }
}
