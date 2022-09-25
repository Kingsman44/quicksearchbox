package com.google.common.p4523c;

import com.google.common.base.C58817ah;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.common.c.ab */
/* compiled from: PG */
final class C58919ab extends C58951z {

    /* renamed from: b */
    final int[] f156758b;

    public C58919ab(int[] iArr, C58817ah ahVar) {
        super(ahVar);
        this.f156758b = iArr;
    }

    /* renamed from: a */
    public final int mo56199a() {
        return 257;
    }

    /* renamed from: c */
    public final int mo56200c(int i) {
        int i2 = i & PrivateKeyType.INVALID;
        if (i == this.f156758b[i2]) {
            return i2;
        }
        return 256;
    }
}
