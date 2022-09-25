package com.google.android.apps.gsa.now.shared.p6421ui;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.j */
/* compiled from: PG */
public final class C83421j {

    /* renamed from: a */
    private final Map f227393a = new HashMap();

    /* renamed from: a */
    public final C83420i mo76756a(Class cls) {
        C83420i iVar = (C83420i) this.f227393a.get(cls);
        if (iVar != null) {
            return iVar;
        }
        C83420i iVar2 = new C83420i();
        this.f227393a.put(cls, iVar2);
        return iVar2;
    }
}
