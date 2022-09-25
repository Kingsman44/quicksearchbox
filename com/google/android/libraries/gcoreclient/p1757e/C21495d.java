package com.google.android.libraries.gcoreclient.p1757e;

import android.content.Intent;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.e.d */
/* compiled from: PG */
public class C21495d extends C21489a {

    /* renamed from: a */
    private final Intent f59920a;

    public C21495d(String str, Intent intent) {
        super(str);
        this.f59920a = intent;
    }

    /* renamed from: a */
    public final Intent mo26970a() {
        Intent intent = this.f59920a;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }

    public C21495d(String str, Intent intent, Exception exc) {
        super(str, exc);
        this.f59920a = intent;
    }
}
