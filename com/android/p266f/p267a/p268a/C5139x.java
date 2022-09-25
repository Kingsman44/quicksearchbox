package com.android.p266f.p267a.p268a;

import android.util.Log;
import com.android.p266f.p267a.C5140b;
import java.util.ArrayList;

/* renamed from: com.android.f.a.a.x */
/* compiled from: PG */
public final class C5139x extends C5122g {
    public C5139x() {
        try {
            mo10149b();
            this.f16312a.mo10173f(18, 141);
            this.f16312a.mo10174g("application/vnd.wap.multipart.related".getBytes(), 132);
            mo10148a(new C5120e(106, "insert-address-token".getBytes()));
            this.f16312a.mo10174g("T".concat(String.valueOf(Long.toHexString(System.currentTimeMillis()))).getBytes(), 152);
        } catch (C5140b e) {
            Log.e("SendReq", "Unexpected InvalidHeaderValueException.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final void mo10190c(byte[] bArr) {
        this.f16312a.mo10174g(bArr, 138);
    }

    /* renamed from: d */
    public final void mo10191d(long j) {
        this.f16312a.mo10172e(j, 142);
    }

    /* renamed from: e */
    public final void mo10192e(C5120e[] eVarArr) {
        C5131p pVar = this.f16312a;
        ArrayList arrayList = new ArrayList();
        for (C5120e add : eVarArr) {
            arrayList.add(add);
        }
        pVar.f16334a.put(151, arrayList);
    }

    /* renamed from: f */
    public final void mo10193f() {
        this.f16312a.mo10173f(129, 134);
    }

    /* renamed from: g */
    public final void mo10194g() {
        this.f16312a.mo10173f(129, 144);
    }

    public C5139x(C5131p pVar, C5125j jVar) {
        super(pVar, jVar);
    }
}
