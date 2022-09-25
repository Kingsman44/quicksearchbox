package com.google.android.libraries.p1703d;

import android.os.Bundle;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.d.r */
/* compiled from: PG */
final class C20662r implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C20665u f57930a;

    public C20662r(C20665u uVar) {
        this.f57930a = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        C20665u uVar = this.f57930a;
        Bundle bundle = new Bundle();
        bundle.putString("methodName", "getAccountName");
        Bundle a = uVar.f57933b.mo3580a("getSignature", bundle);
        if (a == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(a.getInt("version")));
    }
}
