package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.h */
/* compiled from: PG */
public final class C24873h {

    /* renamed from: a */
    public final Bundle f67932a;

    public C24873h() {
        this.f67932a = new Bundle();
    }

    public C24873h(Bundle bundle) {
        this.f67932a = bundle;
    }

    /* renamed from: a */
    public final boolean mo30080a() {
        return this.f67932a.containsKey("in_memory_logging_enabled");
    }

    /* renamed from: b */
    public final boolean mo30081b() {
        return this.f67932a.getBoolean("in_memory_logging_enabled");
    }

    /* renamed from: c */
    public final void mo30082c(boolean z) {
        this.f67932a.putBoolean("appflow_logging_enabled", z);
    }

    /* renamed from: d */
    public final void mo30083d() {
        this.f67932a.putBoolean("in_memory_logging_enabled", true);
    }
}
