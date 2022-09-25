package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13032at;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.di */
/* compiled from: PG */
final class C13857di implements C58839bc {

    /* renamed from: a */
    boolean f42190a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        boolean z;
        C13032at atVar;
        C13033au auVar = (C13033au) obj;
        boolean z2 = false;
        if (auVar.f40464a == 1 && ((C13032at) auVar.f40465b).f40460b.isEmpty()) {
            if (auVar.f40464a == 1) {
                atVar = (C13032at) auVar.f40465b;
            } else {
                atVar = C13032at.f40457d;
            }
            if (atVar.f40461c.isEmpty()) {
                z = true;
                if (!this.f42190a || !z) {
                    z2 = true;
                }
                this.f42190a = true;
                return z2;
            }
        }
        z = false;
        z2 = true;
        this.f42190a = true;
        return z2;
    }
}
