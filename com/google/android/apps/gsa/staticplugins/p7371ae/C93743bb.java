package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bb */
/* compiled from: PG */
public final class C93743bb {

    /* renamed from: a */
    public final SharedPreferences f261618a;

    /* renamed from: b */
    public final C21370a f261619b;

    /* renamed from: c */
    public final C85881bd f261620c;

    public C93743bb(Context context, C21370a aVar, C85881bd bdVar) {
        this.f261618a = context.getSharedPreferences("location_settings", 0);
        this.f261619b = aVar;
        this.f261620c = bdVar;
    }
}
