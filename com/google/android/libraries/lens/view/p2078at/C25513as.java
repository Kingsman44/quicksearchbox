package com.google.android.libraries.lens.view.p2078at;

import android.content.Context;
import androidx.core.content.C1882h;
import androidx.p060c.C0979i;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.at.as */
/* compiled from: PG */
public final class C25513as {

    /* renamed from: a */
    public final Set f69475a = Collections.synchronizedSet(new C0979i(0));

    /* renamed from: b */
    public final Context f69476b;

    public C25513as(Context context) {
        this.f69476b = context;
    }

    /* renamed from: a */
    public final boolean mo30543a(String str) {
        boolean z = true;
        if (this.f69475a.contains(str)) {
            return true;
        }
        if (C1882h.m5137c(this.f69476b, str) != 0) {
            z = false;
        }
        if (z) {
            this.f69475a.add(str);
        }
        return z;
    }
}
