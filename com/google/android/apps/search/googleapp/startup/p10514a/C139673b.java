package com.google.android.apps.search.googleapp.startup.p10514a;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.startup.a.b */
/* compiled from: PG */
public final /* synthetic */ class C139673b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C139675d f379650a;

    public /* synthetic */ C139673b(C139675d dVar) {
        this.f379650a = dVar;
    }

    public final void run() {
        C139675d dVar = this.f379650a;
        Duration duration = C139676e.f379659a;
        if (dVar.f379652a.isStateSaved()) {
            ((C59052c) ((C59052c) C139676e.f379660b.mo56224b()).mo56372aa(41408)).mo56386p("Fragment state saved");
            return;
        } else if (!dVar.f379656e.getAndSet(true)) {
            dVar.f379655d.getViewTreeObserver().removeOnPreDrawListener(dVar);
            C47558bi a = C47831fm.m85006a("FirstDrawRunner: run the Runnable");
            try {
                dVar.f379653b.run();
                a.close();
                return;
            } catch (Throwable th) {
                C139672a.m227100a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
