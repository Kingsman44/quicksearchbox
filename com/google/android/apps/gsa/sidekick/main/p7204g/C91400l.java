package com.google.android.apps.gsa.sidekick.main.p7204g;

import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.sidekick.main.g.l */
/* compiled from: PG */
public final class C91400l extends Exception {

    /* renamed from: a */
    public final int f254980a;

    public C91400l(int i) {
        super(String.format(Locale.ENGLISH, "Could not complete scheduled request to refresh entries. ClientErrorCode: %d", new Object[]{Integer.valueOf(i)}));
        this.f254980a = i;
    }
}
