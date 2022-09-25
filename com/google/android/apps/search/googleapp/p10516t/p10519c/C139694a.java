package com.google.android.apps.search.googleapp.p10516t.p10519c;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.t.c.a */
/* compiled from: PG */
public final class C139694a {

    /* renamed from: a */
    private final AtomicReference f379690a;

    public C139694a(AtomicReference atomicReference) {
        ((Optional) atomicReference.get()).getClass();
        this.f379690a = atomicReference;
    }

    /* renamed from: a */
    public final void mo115168a(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            String a = C39193b.m68624a(intent);
            if (!TextUtils.isEmpty(a)) {
                this.f379690a.set(Optional.m71637of(a));
                return;
            }
            Optional optional = (Optional) this.f379690a.get();
            if (optional.isPresent()) {
                intent.putExtra("source", (String) optional.get());
                activity.setIntent(intent);
            }
        }
    }
}
