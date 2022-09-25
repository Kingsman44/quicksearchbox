package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133359p;
import com.google.android.apps.search.googleapp.accounts.p10126ui.DeleteHistoryCallbacks;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60901do;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.o */
/* compiled from: PG */
public final /* synthetic */ class C133327o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363304a;

    /* renamed from: b */
    public final /* synthetic */ DeleteHistoryCallbacks f363305b;

    public /* synthetic */ C133327o(C133255c cVar, DeleteHistoryCallbacks deleteHistoryCallbacks) {
        this.f363304a = cVar;
        this.f363305b = deleteHistoryCallbacks;
    }

    public final void onClick(View view) {
        C133255c cVar = this.f363304a;
        DeleteHistoryCallbacks deleteHistoryCallbacks = this.f363305b;
        cVar.mo111050a(149948);
        C46439e eVar = deleteHistoryCallbacks.f362990d;
        C46438d b = C46438d.m82810b(deleteHistoryCallbacks.f362991e.mo29164d(C60901do.f165001a, C133359p.f363378d.toMillis(), TimeUnit.MILLISECONDS));
        eVar.mo50428h(b.f121541a, (Object) null, deleteHistoryCallbacks.f362992f);
    }
}
