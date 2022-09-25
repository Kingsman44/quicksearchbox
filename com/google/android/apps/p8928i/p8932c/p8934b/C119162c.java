package com.google.android.apps.p8928i.p8932c.p8934b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.i.c.b.c */
/* compiled from: PG */
public final class C119162c implements C60930r {

    /* renamed from: a */
    public static final ComponentName f332334a;

    /* renamed from: e */
    private static final Intent f332335e;

    /* renamed from: b */
    public final Context f332336b;

    /* renamed from: c */
    public final SettableFuture f332337c = new SettableFuture();

    /* renamed from: d */
    public final ServiceConnection f332338d = new C119161b(this);

    static {
        ComponentName componentName = new ComponentName("com.google.android.apps.tachyon", "com.google.android.apps.tachyon.clientapi.ClientApiService");
        f332334a = componentName;
        Intent intent = new Intent();
        intent.setComponent(componentName);
        f332335e = intent;
    }

    public C119162c(Context context) {
        this.f332336b = context;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        try {
            if (this.f332336b.bindService(f332335e, this.f332338d, 1)) {
                return this.f332337c;
            }
            return C60856cj.m92899h(new C119160a(String.format("The Duo service [%s] is not available or not visible to this app.", new Object[]{"com.google.android.apps.tachyon.clientapi.ClientApiService"})));
        } catch (SecurityException e) {
            return C60856cj.m92899h(new C119160a((Throwable) e));
        }
    }
}
