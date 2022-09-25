package com.google.android.apps.gsa.sidekick.shared.util;

import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.an */
/* compiled from: PG */
public final class C91963an extends Exception {
    public C91963an() {
        super("A value for an enum type was expected but not provided");
    }

    public C91963an(int i) {
        super(String.format(Locale.US, "An unknown value for an enum type was encountered: %d", new Object[]{Integer.valueOf(i)}));
    }
}
