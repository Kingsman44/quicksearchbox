package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.q */
/* compiled from: PG */
public final class C24882q {

    /* renamed from: a */
    public final Bundle f67963a;

    public C24882q() {
        this.f67963a = new Bundle();
    }

    public C24882q(Bundle bundle) {
        this.f67963a = bundle;
    }

    /* renamed from: a */
    public final String mo30109a() {
        return this.f67963a.getString("session_id");
    }

    /* renamed from: b */
    public final void mo30110b(String str) {
        this.f67963a.putString("session_id", str);
    }
}
