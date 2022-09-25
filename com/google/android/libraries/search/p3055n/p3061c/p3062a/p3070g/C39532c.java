package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3070g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.c.a.g.c */
/* compiled from: PG */
final class C39532c extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C39533d f104091a;

    public C39532c(C39533d dVar) {
        this.f104091a = dVar;
    }

    public final void onReceive(Context context, Intent intent) {
        ((C59052c) ((C59052c) C39533d.f104092a.mo56224b()).mo56372aa(53693)).mo56389s("received broadcast: %s", intent);
        C47770dh dhVar = this.f104091a.f104095d;
        dhVar.getClass();
        C47538ax c = dhVar.mo51613c("HotwordScreenStatusReceiver");
        try {
            C39531b bVar = new C39531b(this, intent);
            Executor executor = this.f104091a.f104093b;
            executor.getClass();
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(bVar), executor), "Failed creating BroadcastReceiver for screen on / off broadcasts.", new Object[0]);
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
