package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.j */
/* compiled from: PG */
public final class C24875j {

    /* renamed from: a */
    public final Bundle f67958a;

    public C24875j() {
        this.f67958a = new Bundle();
    }

    public C24875j(Bundle bundle) {
        this.f67958a = bundle;
    }

    /* renamed from: a */
    public final C24871f mo30085a() {
        Bundle bundle = (Bundle) this.f67958a.getParcelable("image");
        if (bundle == null) {
            return null;
        }
        return new C24871f(bundle);
    }

    /* renamed from: b */
    public final void mo30086b(C24871f fVar) {
        this.f67958a.putBundle("image", fVar.f67931a);
    }
}
