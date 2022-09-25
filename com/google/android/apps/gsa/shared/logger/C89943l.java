package com.google.android.apps.gsa.shared.logger;

import android.view.View;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.shared.logger.l */
/* compiled from: PG */
public final class C89943l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f246436a;

    public C89943l(View.OnClickListener onClickListener) {
        this.f246436a = onClickListener;
    }

    public final void onClick(View view) {
        C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
        this.f246436a.onClick(view);
    }
}
