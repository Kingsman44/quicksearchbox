package com.google.android.gms.libs.p10830b.p10834c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58913w;
import com.google.common.p4575r.C60761r;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.libs.b.c.a */
/* compiled from: PG */
public final class C144852a {

    /* renamed from: a */
    private static final long f391704a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    public static C58833ax m235440a(String str, String str2) {
        byte[] bytes = String.valueOf(str).concat(String.valueOf(str2)).getBytes(C58913w.f156754c);
        try {
            long j = f391704a;
            return C58833ax.m90834k(m235441b(bytes, (System.currentTimeMillis() + ((long) ((int) ((ByteBuffer.wrap(m235441b(bytes, 0)).getLong() >>> 1) % j)))) / j));
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    private static byte[] m235441b(byte[] bArr, long j) {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return instance.doFinal(C60761r.m92760f(j));
    }
}
