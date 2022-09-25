package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.c */
/* compiled from: PG */
public final class C24868c {

    /* renamed from: a */
    public final Bundle f67928a = new Bundle();

    /* renamed from: a */
    public final C24867b mo30065a() {
        Bundle bundle = (Bundle) this.f67928a.getParcelable("client_capabilities");
        if (bundle == null) {
            return null;
        }
        return new C24867b(bundle);
    }

    /* renamed from: b */
    public final void mo30066b(C24867b bVar) {
        this.f67928a.putBundle("client_capabilities", bVar.f67927a);
    }

    /* renamed from: c */
    public final void mo30067c(int i) {
        this.f67928a.putInt("execution_mode", i);
    }
}
