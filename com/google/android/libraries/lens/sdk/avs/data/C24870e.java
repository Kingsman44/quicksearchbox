package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.e */
/* compiled from: PG */
public final class C24870e {

    /* renamed from: a */
    public final Bundle f67930a;

    public C24870e() {
        this.f67930a = new Bundle();
    }

    public C24870e(Bundle bundle) {
        this.f67930a = bundle;
    }

    /* renamed from: a */
    public final int mo30073a() {
        return this.f67930a.getInt("error_code");
    }

    /* renamed from: b */
    public final void mo30074b(int i) {
        this.f67930a.putInt("error_code", i);
    }
}
