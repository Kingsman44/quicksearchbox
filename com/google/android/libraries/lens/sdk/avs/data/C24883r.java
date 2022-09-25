package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.r */
/* compiled from: PG */
public final class C24883r {

    /* renamed from: a */
    public final Bundle f67964a;

    public C24883r() {
        this.f67964a = new Bundle();
    }

    public C24883r(Bundle bundle) {
        this.f67964a = bundle;
    }

    /* renamed from: a */
    public final String mo30111a() {
        return this.f67964a.getString("session_id");
    }

    /* renamed from: b */
    public final void mo30112b(String str) {
        this.f67964a.putString("session_id", str);
    }
}
