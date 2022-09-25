package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.common.i.a */
/* compiled from: PG */
abstract class C59270a extends C59278c {

    /* renamed from: a */
    private final ByteBuffer f157384a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: k */
    private final void m92018k(int i) {
        try {
            mo56747h(this.f157384a.array(), i);
        } finally {
            this.f157384a.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56740a(byte b);

    /* renamed from: b */
    public final void mo56741b(byte b) {
        mo56740a(b);
    }

    /* renamed from: c */
    public final void mo56742c(char c) {
        this.f157384a.putChar(c);
        m92018k(2);
    }

    /* renamed from: d */
    public final void mo56743d(byte[] bArr, int i) {
        C58838bb.m90882q(0, i, bArr.length);
        mo56747h(bArr, i);
    }

    /* renamed from: e */
    public final void mo56744e(int i) {
        this.f157384a.putInt(i);
        m92018k(4);
    }

    /* renamed from: f */
    public final void mo56745f(long j) {
        this.f157384a.putLong(j);
        m92018k(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo56747h(byte[] bArr, int i) {
        throw null;
    }

    /* renamed from: g */
    public final void mo56746g(byte[] bArr) {
        bArr.getClass();
        mo56747h(bArr, bArr.length);
    }
}
