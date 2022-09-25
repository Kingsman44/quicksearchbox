package com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.a.n */
/* compiled from: PG */
public final /* synthetic */ class C108149n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28292j f300791a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f300792b;

    public /* synthetic */ C108149n(C28292j jVar, Runnable runnable) {
        this.f300791a = jVar;
        this.f300792b = runnable;
    }

    public final void onClick(View view) {
        C28292j jVar = this.f300791a;
        Runnable runnable = this.f300792b;
        C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
        runnable.run();
    }
}
