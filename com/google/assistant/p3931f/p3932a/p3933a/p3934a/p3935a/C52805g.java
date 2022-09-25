package com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a;

import android.os.Bundle;

/* renamed from: com.google.assistant.f.a.a.a.a.g */
/* compiled from: PG */
public abstract class C52805g {
    /* renamed from: b */
    public static C52805g m86712b(Bundle bundle) {
        boolean z;
        boolean z2 = false;
        if (bundle != null) {
            z = bundle.getBoolean("loading", false);
            z2 = true;
        } else {
            z = false;
        }
        if (z2) {
            return new C52800b(z);
        }
        throw new IllegalStateException("Missing required properties: loading");
    }

    /* renamed from: a */
    public abstract boolean mo53915a();
}
