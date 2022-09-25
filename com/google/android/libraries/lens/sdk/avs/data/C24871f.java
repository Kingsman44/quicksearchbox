package com.google.android.libraries.lens.sdk.avs.data;

import android.graphics.Bitmap;
import android.os.Bundle;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.f */
/* compiled from: PG */
public final class C24871f {

    /* renamed from: a */
    public final Bundle f67931a;

    public C24871f() {
        this.f67931a = new Bundle();
    }

    public C24871f(Bundle bundle) {
        this.f67931a = bundle;
    }

    /* renamed from: a */
    public final Bitmap mo30075a() {
        return (Bitmap) this.f67931a.getParcelable("bitmap");
    }

    /* renamed from: b */
    public final boolean mo30076b() {
        return this.f67931a.containsKey("bitmap");
    }

    /* renamed from: c */
    public final void mo30077c(Bitmap bitmap) {
        this.f67931a.putParcelable("bitmap", bitmap);
    }
}
