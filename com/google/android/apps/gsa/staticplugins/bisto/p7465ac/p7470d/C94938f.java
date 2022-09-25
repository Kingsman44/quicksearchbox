package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.d.f */
/* compiled from: PG */
public final class C94938f {

    /* renamed from: a */
    public final byte[] f265572a;

    public C94938f(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265572a = bArr;
    }

    /* renamed from: a */
    public final byte[] mo88844a() {
        byte[] bArr = this.f265572a;
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 2)];
        bArr2[0] = (byte) length;
        bArr2[1] = (byte) (length >> 8);
        System.arraycopy(bArr, 0, bArr2, 2, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C94938f) && Arrays.equals(this.f265572a, ((C94938f) obj).f265572a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f265572a);
    }
}
