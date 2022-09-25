package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133199i;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133202l;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60872cz;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.x */
/* compiled from: PG */
public final /* synthetic */ class C133367x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DeleteHistoryCallbacks f363405a;

    public /* synthetic */ C133367x(DeleteHistoryCallbacks deleteHistoryCallbacks) {
        this.f363405a = deleteHistoryCallbacks;
    }

    public final void onClick(View view) {
        C133202l lVar = this.f363405a.f362989c;
        C60872cz czVar = lVar.f363070e;
        if (czVar == null) {
            ((C59052c) ((C59052c) C133202l.f363067b.mo56226d()).mo56372aa(40024)).mo56386p("Search history deletion may have already been completed or cancelled.");
        } else if (czVar.cancel(true)) {
            lVar.f363070e = null;
        } else {
            C46459k.m82829b(C47633f.m84733g(lVar.f363072g.mo46039a(C133199i.f363063a, C60826bg.f164896a)), "Failed to set cancel marker.", new Object[0]);
        }
    }
}
