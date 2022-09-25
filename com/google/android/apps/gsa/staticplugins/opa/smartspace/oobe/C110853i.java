package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.i */
/* compiled from: PG */
public final class C110853i implements C118549h {

    /* renamed from: a */
    public final Context f308845a;

    /* renamed from: b */
    public final SharedPreferences f308846b;

    /* renamed from: c */
    public final C68214a f308847c;

    public C110853i(Context context, SharedPreferences sharedPreferences, C68214a aVar) {
        this.f308845a = context;
        this.f308846b = sharedPreferences;
        this.f308847c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C110852h hVar = new C110852h(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f308845a.registerReceiver(hVar, intentFilter);
        return C118826c.f331423b;
    }
}
