package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.b */
/* compiled from: PG */
public final class C24867b {

    /* renamed from: a */
    public final Bundle f67927a;

    public C24867b() {
        this.f67927a = new Bundle();
    }

    public C24867b(Bundle bundle) {
        this.f67927a = bundle;
    }

    /* renamed from: a */
    public final void mo30063a(boolean z) {
        this.f67927a.putBoolean("supports_ocr_result", z);
    }

    /* renamed from: b */
    public final void mo30064b() {
        this.f67927a.putBoolean("supports_shopping_result", true);
    }
}
