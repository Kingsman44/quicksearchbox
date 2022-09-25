package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p1635au.C19566c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60888db;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.i */
/* compiled from: PG */
public final class C40356i {

    /* renamed from: a */
    public final C40351d f105993a;

    /* renamed from: b */
    public final String f105994b;

    /* renamed from: c */
    public final C57695ab f105995c;

    /* renamed from: d */
    public final C40363p f105996d;

    /* renamed from: e */
    public final C40354g f105997e;

    public C40356i(Context context, C60888db dbVar, C57695ab abVar, C40363p pVar, C58833ax axVar) {
        Context applicationContext = context.getApplicationContext();
        this.f105993a = new C40351d(dbVar, new C19566c(context, "STREAMZ_XUIKIT_CLIENT_ERRORS", (String) null), applicationContext instanceof Application ? (Application) applicationContext : null);
        this.f105994b = context.getPackageName();
        this.f105995c = abVar;
        this.f105996d = pVar;
        this.f105997e = (C40354g) axVar.mo56109e(new C40354g((byte[]) null));
    }
}
