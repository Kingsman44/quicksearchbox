package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C143902ar;
import com.google.android.gms.common.internal.C143903as;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.n */
/* compiled from: PG */
abstract class C143989n extends C143902ar {

    /* renamed from: a */
    private final int f390225a;

    protected C143989n(byte[] bArr) {
        C143919bh.m233959b(bArr.length == 25);
        this.f390225a = Arrays.hashCode(bArr);
    }

    /* renamed from: d */
    protected static byte[] m234166d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final int mo119417b() {
        return this.f390225a;
    }

    /* renamed from: c */
    public final C144165j mo119418c() {
        return new C144166k(mo119514e());
    }

    /* renamed from: e */
    public abstract byte[] mo119514e();

    public final boolean equals(Object obj) {
        C144165j c;
        if (obj != null && (obj instanceof C143903as)) {
            try {
                C143903as asVar = (C143903as) obj;
                if (asVar.mo119417b() != this.f390225a || (c = asVar.mo119418c()) == null) {
                    return false;
                }
                return Arrays.equals(mo119514e(), (byte[]) C144166k.m234388a(c));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f390225a;
    }
}
