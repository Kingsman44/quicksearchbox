package com.google.android.apps.gsa.search.shared.actions.errors;

import com.google.common.base.C58838bb;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.errors.a */
/* compiled from: PG */
public final class C87413a {

    /* renamed from: a */
    public final int f236072a;

    /* renamed from: b */
    public final int f236073b;

    /* renamed from: c */
    public final int f236074c;

    public C87413a(int i, int i2, int i3) {
        boolean z = false;
        if (i != 0) {
            if (i2 != 0) {
                z = true;
            } else {
                i2 = 0;
            }
        }
        C58838bb.m90868c(z);
        this.f236072a = i;
        this.f236073b = i2;
        this.f236074c = i3;
    }

    /* renamed from: a */
    public final boolean mo81179a() {
        return this.f236072a == 1114114;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "[errorCode: %d, errorCount: %d]", new Object[]{Integer.valueOf(this.f236072a), Integer.valueOf(this.f236073b)});
    }
}
