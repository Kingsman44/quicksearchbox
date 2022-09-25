package com.google.android.libraries.mdi.download.p2230c.p2234c;

import com.google.android.libraries.mdi.download.p2230c.C28758c;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.c.c.d */
/* compiled from: PG */
public final /* synthetic */ class C28764d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f78193a;

    public /* synthetic */ C28764d(C58833ax axVar) {
        this.f78193a = axVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar = this.f78193a;
        C58833ax axVar2 = (C58833ax) obj;
        boolean z = true;
        if (axVar2.mo56113h() && axVar.equals(axVar2)) {
            z = false;
        }
        if (axVar2 != null) {
            return new C28758c(z, axVar2);
        }
        throw new NullPointerException("Null freshETagOptional");
    }
}
