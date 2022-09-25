package com.google.android.apps.gsa.shared.p7037e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;
import p5535j.p5536a.p5556d.p5557a.C71170c;

/* renamed from: com.google.android.apps.gsa.shared.e.e */
/* compiled from: PG */
final class C89719e extends BroadcastReceiver {

    /* renamed from: a */
    private final SettableFuture f242871a;

    /* renamed from: b */
    private final Context f242872b;

    /* renamed from: c */
    private final C37215b f242873c;

    /* renamed from: d */
    private final int f242874d;

    /* renamed from: e */
    private final Integer f242875e;

    public C89719e(SettableFuture settableFuture, Context context, C37215b bVar, int i, Integer num) {
        this.f242871a = settableFuture;
        this.f242872b = context;
        this.f242874d = i;
        this.f242873c = bVar;
        this.f242875e = num;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo83609a(boolean z) {
        if (!this.f242871a.isDone()) {
            if (!z) {
                try {
                    ((C59052c) ((C59052c) C89720f.f242876a.mo56224b()).mo56372aa(10189)).mo56388r("Installing shortcut timed out after %dms", C89720f.f242878c);
                    C89720f.m146112b(this.f242873c, C62722b.CANCELLED, (C71170c) null, this.f242875e);
                } catch (Throwable th) {
                    this.f242872b.unregisterReceiver(this);
                    throw th;
                }
            }
            this.f242871a.mo57356n(Boolean.valueOf(z));
            this.f242872b.unregisterReceiver(this);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getIntExtra("com.google.android.apps.gsa.shared.api.RESULT_CODE_EXTRA", -1) == this.f242874d) {
            ((C59052c) ((C59052c) C89720f.f242876a.mo56224b()).mo56372aa(10190)).mo56386p("Shortcut installed successfully");
            C89949q.m146523g(578);
            C89720f.m146112b(this.f242873c, C62722b.OK, (C71170c) null, this.f242875e);
            mo83609a(true);
        }
    }
}
