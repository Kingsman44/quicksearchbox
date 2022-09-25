package com.google.android.apps.search.podcasts.widgets.p10620b;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.podcasts.widgets.b.c */
/* compiled from: PG */
public final /* synthetic */ class C141197c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141198d f383342a;

    /* renamed from: b */
    public final /* synthetic */ C141195a f383343b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f383344c;

    public /* synthetic */ C141197c(C141198d dVar, C141195a aVar, Runnable runnable) {
        this.f383342a = dVar;
        this.f383343b = aVar;
        this.f383344c = runnable;
    }

    public final void onClick(View view) {
        C141198d dVar = this.f383342a;
        C141195a aVar = this.f383343b;
        Runnable runnable = this.f383344c;
        if (aVar.f383340f != null) {
            dVar.f383348d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        }
        aVar.f383339e.onClick(view);
        runnable.run();
    }
}
