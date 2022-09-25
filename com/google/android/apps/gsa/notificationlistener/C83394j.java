package com.google.android.apps.gsa.notificationlistener;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.notificationlistener.j */
/* compiled from: PG */
final class C83394j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f227282a;

    /* renamed from: b */
    final /* synthetic */ Runnable f227283b;

    /* renamed from: c */
    final /* synthetic */ Handler f227284c;

    /* renamed from: d */
    private int f227285d = 0;

    public C83394j(Context context, Runnable runnable, Handler handler) {
        this.f227282a = context;
        this.f227283b = runnable;
        this.f227284c = handler;
    }

    public final void run() {
        boolean d = C36619a.m65148d(this.f227282a);
        C58976aa aaVar = C58975e.f156826a;
        if (d) {
            this.f227283b.run();
            return;
        }
        int i = this.f227285d;
        if (i < 240) {
            this.f227285d = i + 1;
            this.f227284c.postDelayed(this, 250);
        }
    }
}
