package com.google.android.libraries.gsa.p1859d;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.libraries.gsa.d.p */
/* compiled from: PG */
public final class C22794p extends C22782d {
    public C22794p(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo28141a(C22781c cVar) {
        Intent h = C22791m.m42603h(this.f62715a);
        h.setPackage("com.google.android.googlequicksearchbox");
        if (!this.f62715a.bindService(h, new C22748b(this, cVar), 1)) {
            new Handler(Looper.getMainLooper()).post(new C22729a(cVar));
        }
    }
}
