package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.k */
/* compiled from: PG */
public final class C24876k {

    /* renamed from: a */
    public final Bundle f67959a;

    public C24876k() {
        this.f67959a = new Bundle();
    }

    public C24876k(Bundle bundle) {
        this.f67959a = bundle;
    }

    /* renamed from: a */
    public final int mo30087a() {
        return this.f67959a.getInt("query_id");
    }

    /* renamed from: b */
    public final C24875j mo30088b() {
        Bundle bundle = (Bundle) this.f67959a.getParcelable("payload");
        if (bundle == null) {
            return null;
        }
        return new C24875j(bundle);
    }

    /* renamed from: c */
    public final String mo30089c() {
        return this.f67959a.getString("session_id");
    }

    /* renamed from: d */
    public final void mo30090d(C24875j jVar) {
        this.f67959a.putBundle("payload", jVar.f67958a);
    }

    /* renamed from: e */
    public final void mo30091e(String str) {
        this.f67959a.putString("session_id", str);
    }
}
