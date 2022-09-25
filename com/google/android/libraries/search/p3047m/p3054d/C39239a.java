package com.google.android.libraries.search.p3047m.p3054d;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;

/* renamed from: com.google.android.libraries.search.m.d.a */
/* compiled from: PG */
public final class C39239a {
    /* renamed from: a */
    public static Context m68666a(Context context, C39226b bVar) {
        return Build.VERSION.SDK_INT >= 30 ? context.createAttributionContext(C39227c.m68658b(bVar)) : context;
    }
}
