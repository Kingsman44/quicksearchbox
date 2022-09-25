package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.p */
/* compiled from: PG */
public final class C24881p {

    /* renamed from: a */
    public final Bundle f67962a;

    public C24881p() {
        this.f67962a = new Bundle();
    }

    public C24881p(Bundle bundle) {
        this.f67962a = bundle;
    }

    /* renamed from: a */
    public final C24869d mo30103a() {
        Bundle bundle = (Bundle) this.f67962a.getParcelable("client_info");
        if (bundle == null) {
            return null;
        }
        return new C24869d(bundle);
    }

    /* renamed from: b */
    public final String mo30104b() {
        return this.f67962a.getString("session_id");
    }

    /* renamed from: c */
    public final boolean mo30105c() {
        return this.f67962a.containsKey("client_info");
    }

    /* renamed from: d */
    public final void mo30106d(C24869d dVar) {
        this.f67962a.putBundle("client_info", dVar.f67929a);
    }

    /* renamed from: e */
    public final void mo30107e(C24873h hVar) {
        this.f67962a.putBundle("logging_modalities", hVar.f67932a);
    }

    /* renamed from: f */
    public final void mo30108f(String str) {
        this.f67962a.putString("session_id", str);
    }
}
