package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8397m;
import com.google.p386ak.C8405u;
import com.google.p386ak.p388b.C8269a;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.r */
/* compiled from: PG */
public final class C8318r implements C8267ab {

    /* renamed from: a */
    private final C8383a f29124a;

    /* renamed from: b */
    private final boolean f29125b;

    /* renamed from: c */
    private final C8405u f29126c;

    /* renamed from: d */
    private final C8397m f29127d;

    public C8318r(Object obj, C8383a aVar, boolean z) {
        C8397m mVar = null;
        C8405u uVar = obj instanceof C8405u ? (C8405u) obj : null;
        this.f29126c = uVar;
        mVar = obj instanceof C8397m ? (C8397m) obj : mVar;
        this.f29127d = mVar;
        boolean z2 = true;
        if (uVar == null && mVar == null) {
            z2 = false;
        }
        C8269a.m22981a(z2);
        this.f29124a = aVar;
        this.f29125b = z;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        if (this.f29124a.equals(aVar) || (this.f29125b && this.f29124a.f29214b == aVar.f29213a)) {
            return new C8319s(this.f29126c, this.f29127d, iVar, aVar, this, true);
        }
        return null;
    }
}
