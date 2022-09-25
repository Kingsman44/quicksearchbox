package com.google.android.nowdev;

import android.content.pm.Signature;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.nowdev.d */
/* compiled from: PG */
public final class C45008d {

    /* renamed from: a */
    public final String f117611a;

    /* renamed from: b */
    public final Signature f117612b;

    /* renamed from: c */
    public final boolean f117613c;

    /* renamed from: d */
    public final C58528ij f117614d;

    private C45008d(String str, byte[] bArr, byte[] bArr2, boolean z, Integer... numArr) {
        this.f117611a = str;
        this.f117612b = new Signature(bArr);
        this.f117613c = z;
        if (bArr2 != null) {
            new Signature(bArr2);
        }
        this.f117614d = C58528ij.m90008H(numArr);
    }

    /* renamed from: a */
    public static C45008d m80160a(String str, byte[] bArr, byte[] bArr2, boolean z, Integer... numArr) {
        C45008d dVar = new C45008d(str, bArr, bArr2, z, numArr);
        C45009e.f117615a.mo55429h(str, dVar);
        return dVar;
    }
}
