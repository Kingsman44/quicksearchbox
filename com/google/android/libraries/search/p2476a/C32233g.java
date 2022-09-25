package com.google.android.libraries.search.p2476a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.search.a.g */
/* compiled from: PG */
final class C32233g extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C32234h f86446a;

    public C32233g(C32234h hVar) {
        this.f86446a = hVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C47538ax c = this.f86446a.f86449c.mo51613c("AccountManager#onPrimaryAccountChanged");
        try {
            C32216e eVar = new C32216e(this);
            C47633f g = C47633f.m84733g(C60856cj.m92903l(C47810es.m84977q(eVar), this.f86446a.f86447a));
            C32232f fVar = new C32232f();
            C60856cj.m92911t(g.f164926b, C47810es.m84974n(fVar), this.f86446a.f86447a);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
