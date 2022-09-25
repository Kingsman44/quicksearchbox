package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58832aw;
import com.google.protobuf.C63088z;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.cu */
/* compiled from: PG */
public final class C42674cu {

    /* renamed from: a */
    public final String f111874a;

    /* renamed from: b */
    public final String f111875b;

    /* renamed from: c */
    public final long f111876c;

    /* renamed from: d */
    public final C63088z f111877d;

    public C42674cu(String str, String str2, long j, C63088z zVar) {
        str.getClass();
        this.f111874a = str;
        str2.getClass();
        this.f111875b = str2;
        this.f111876c = j;
        this.f111877d = zVar;
    }

    /* renamed from: a */
    public static C63088z m75371a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return C63088z.m96139A(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42674cu) {
            C42674cu cuVar = (C42674cu) obj;
            return C58832aw.m90831a(this.f111874a, cuVar.f111874a) && C58832aw.m90831a(this.f111875b, cuVar.f111875b) && this.f111876c == cuVar.f111876c && C58832aw.m90831a(this.f111877d, cuVar.f111877d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111874a, this.f111875b, Long.valueOf(this.f111876c), this.f111877d});
    }
}
