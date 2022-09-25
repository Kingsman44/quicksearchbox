package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133198h;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133202l;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.y */
/* compiled from: PG */
public final /* synthetic */ class C133368y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DeleteHistoryCallbacks f363406a;

    public /* synthetic */ C133368y(DeleteHistoryCallbacks deleteHistoryCallbacks) {
        this.f363406a = deleteHistoryCallbacks;
    }

    public final void onClick(View view) {
        DeleteHistoryCallbacks deleteHistoryCallbacks = this.f363406a;
        Snackbar d = deleteHistoryCallbacks.mo111004d();
        C133202l lVar = deleteHistoryCallbacks.f362989c;
        long c = DeleteHistoryCallbacks.m216123c(d);
        C46459k.m82829b(C47633f.m84733g(lVar.f363072g.mo46039a(C133198h.f363062a, C60826bg.f164896a)), "Failed to increase Delete History retries.", new Object[0]);
        lVar.mo111022b(c);
    }
}
