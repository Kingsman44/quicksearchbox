package com.google.android.apps.gsa.shared.util.permissions.p7179a;

import android.content.Context;

/* renamed from: com.google.android.apps.gsa.shared.util.permissions.a.a */
/* compiled from: PG */
public final class C91074a {

    /* renamed from: a */
    private final Context f254350a;

    public C91074a(Context context) {
        this.f254350a = context;
    }

    /* renamed from: a */
    public final boolean mo85346a(String str) {
        return this.f254350a.checkSelfPermission(str) == 0;
    }
}
