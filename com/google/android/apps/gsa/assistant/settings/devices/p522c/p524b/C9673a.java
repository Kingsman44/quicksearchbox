package com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b;

import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C9673a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C9684l f33451a;

    /* renamed from: b */
    public final /* synthetic */ String f33452b;

    public /* synthetic */ C9673a(C9684l lVar, String str) {
        this.f33451a = lVar;
        this.f33452b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C9684l lVar = this.f33451a;
        String str = this.f33452b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return null;
        }
        lVar.f33473c.put(str, (Boolean) optional.get());
        return null;
    }
}
