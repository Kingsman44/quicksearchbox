package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.componentview.components.base.a.ar */
/* compiled from: PG */
public final class C19917ar extends C62934bn implements C63001dt {
    public C19917ar() {
        super(C19920au.f55724b);
    }

    /* renamed from: a */
    public final void mo25183a(int i) {
        copyOnWrite();
        C19920au auVar = (C19920au) this.instance;
        C19920au auVar2 = C19920au.f55724b;
        C62961ch chVar = auVar.f55726a;
        if (!chVar.mo58948c()) {
            auVar.f55726a = C62942bv.mutableCopy(chVar);
        }
        auVar.f55726a.mo58916g(i - 1);
    }
}
