package com.android.p275j.p276a;

import android.content.Context;
import java.io.File;

/* renamed from: com.android.j.a.o */
/* compiled from: PG */
final class C5185o {

    /* renamed from: a */
    final /* synthetic */ Context f16462a;

    /* renamed from: b */
    private File f16463b = null;

    public C5185o(Context context) {
        this.f16462a = context;
    }

    /* renamed from: a */
    public final File mo10273a() {
        if (this.f16463b == null) {
            this.f16463b = new File(this.f16462a.getCacheDir(), "volley");
        }
        return this.f16463b;
    }
}
