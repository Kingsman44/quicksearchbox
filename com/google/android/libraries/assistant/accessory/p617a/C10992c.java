package com.google.android.libraries.assistant.accessory.p617a;

import com.google.common.base.C58838bb;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.assistant.accessory.a.c */
/* compiled from: PG */
public final class C10992c {

    /* renamed from: a */
    public volatile C10993d f36139a;

    /* renamed from: b */
    public volatile ArrayDeque f36140b;

    /* renamed from: c */
    private final AtomicInteger f36141c;

    /* renamed from: d */
    private final AtomicInteger f36142d;

    /* renamed from: e */
    private final AtomicInteger f36143e = new AtomicInteger(0);

    public C10992c(int i) {
        boolean z = false;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f36141c = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        this.f36142d = atomicInteger2;
        if (i >= 2 && i <= 1500) {
            z = true;
        }
        C58838bb.m90869d(z, "Invalid maxFrameSize");
        atomicInteger.set(i);
        atomicInteger2.set(i - 1);
        this.f36140b = new ArrayDeque();
    }

    /* renamed from: a */
    public final ArrayDeque mo19361a(byte[] bArr) {
        int length = bArr.length;
        C58838bb.m90869d(length != 0, "Empty record");
        int i = length % this.f36142d.get();
        int i2 = length / this.f36142d.get();
        if (i > 0) {
            i2++;
        }
        int[] iArr = new int[2];
        iArr[1] = this.f36141c.get();
        iArr[0] = i2;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        if (i > 0) {
            bArr2[bArr2.length - 1] = new byte[(i + 1)];
        }
        int i3 = this.f36143e.get();
        if (this.f36143e.incrementAndGet() > 3) {
            this.f36143e.set(0);
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int length2 = bArr2.length;
            if (i4 < length2) {
                int i6 = this.f36142d.get() * i4;
                int i7 = i5 + 1;
                bArr2[i4][0] = new C10993d(i3, i5, i4 == length2 + -1).mo19362a();
                i5 = i7 == 32 ? 0 : i7;
                byte[] bArr3 = bArr2[i4];
                System.arraycopy(bArr, i6, bArr3, 1, bArr3.length - 1);
                i4++;
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(length2);
                Collections.addAll(arrayDeque, bArr2);
                return arrayDeque;
            }
        }
    }
}
