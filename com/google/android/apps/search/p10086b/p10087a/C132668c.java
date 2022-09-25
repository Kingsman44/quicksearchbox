package com.google.android.apps.search.p10086b.p10087a;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.search.b.a.c */
/* compiled from: PG */
public final class C132668c {
    /* renamed from: a */
    public static Intent m215642a(Context context, C132667b bVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(context, "com.google.android.apps.search.readaloud.ReadaloudActivity");
        intent.putExtra("READALOUD_DATA", bVar.toByteArray());
        intent.addFlags(268435456);
        return intent;
    }
}
