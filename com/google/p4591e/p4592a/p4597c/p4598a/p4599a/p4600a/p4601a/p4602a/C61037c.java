package com.google.p4591e.p4592a.p4597c.p4598a.p4599a.p4600a.p4601a.p4602a;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.p4591e.p4592a.p4597c.p4598a.p4599a.p4600a.p4601a.C61034a;
import p3186j$.util.Objects;

/* renamed from: com.google.e.a.c.a.a.a.a.a.c */
/* compiled from: PG */
public abstract class C61037c {

    /* renamed from: a */
    protected static final C61034a f165271a = C61034a.LENIENT;

    /* renamed from: b */
    static final byte[] f165272b = {13, 10};

    /* renamed from: c */
    private final C61034a f165273c;

    protected C61037c(C61034a aVar) {
        this.f165273c = (C61034a) Objects.requireNonNull(aVar, "codecPolicy");
    }

    /* renamed from: a */
    private static int m93376a(int i, int i2) {
        int i3 = i + LinearLayoutManager.INVALID_OFFSET;
        int i4 = i2 + LinearLayoutManager.INVALID_OFFSET;
        if (i3 == i4) {
            return 0;
        }
        return i3 >= i4 ? 1 : -1;
    }

    /* renamed from: d */
    protected static final byte[] m93377d(C61036b bVar) {
        byte[] bArr = bVar.f165266b;
        if (bArr == null) {
            bVar.f165266b = new byte[Math.max(3, 8192)];
            bVar.f165267c = 0;
            bVar.f165268d = 0;
        } else {
            int i = bVar.f165267c + 3;
            int length = bArr.length;
            if (i - length > 0) {
                int i2 = length + length;
                if (m93376a(i2, i) < 0) {
                    i2 = i;
                }
                if (m93376a(i2, 2147483639) <= 0) {
                    i = i2;
                } else if (i < 0) {
                    throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i) & 4294967295L));
                } else if (i <= 2147483639) {
                    i = 2147483639;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                bVar.f165266b = bArr2;
                return bArr2;
            }
        }
        return bVar.f165266b;
    }

    /* renamed from: b */
    public abstract void mo57583b(byte[] bArr, int i, C61036b bVar);

    /* renamed from: c */
    public final boolean mo57585c() {
        return this.f165273c == C61034a.STRICT;
    }
}
