package com.google.android.libraries.gsa.monet.shared;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.monet.shared.p */
/* compiled from: PG */
public final class C23120p {

    /* renamed from: a */
    public final Bundle f63472a;

    public C23120p(Bundle bundle) {
        this.f63472a = bundle;
    }

    /* renamed from: a */
    public final C23120p mo28564a(String str) {
        Bundle bundle = this.f63472a.getBundle(str);
        if (bundle == null) {
            return null;
        }
        return new C23120p(bundle);
    }

    /* renamed from: b */
    public final int mo28565b() {
        return this.f63472a.getInt("counter", 0);
    }

    /* renamed from: c */
    public final ArrayList mo28566c() {
        return this.f63472a.getStringArrayList("child_array");
    }
}
