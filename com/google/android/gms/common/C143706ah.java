package com.google.android.gms.common;

import android.content.Intent;

/* renamed from: com.google.android.gms.common.ah */
/* compiled from: PG */
public class C143706ah extends Exception {

    /* renamed from: a */
    private final Intent f389611a;

    public C143706ah(String str, Intent intent) {
        super(str);
        this.f389611a = intent;
    }

    /* renamed from: a */
    public final Intent mo119087a() {
        return new Intent(this.f389611a);
    }
}
