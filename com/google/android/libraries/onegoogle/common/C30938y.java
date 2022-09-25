package com.google.android.libraries.onegoogle.common;

import android.view.View;
import androidx.core.content.C1881g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.onegoogle.common.y */
/* compiled from: PG */
public final class C30938y implements View.OnClickListener {

    /* renamed from: a */
    public boolean f83361a;

    /* renamed from: b */
    final /* synthetic */ C30901aa f83362b;

    public C30938y(C30901aa aaVar) {
        this.f83362b = aaVar;
    }

    /* renamed from: a */
    public final void mo36614a() {
        Runnable runnable = this.f83362b.f83317e;
        if (runnable != null) {
            runnable.run();
        }
        C19559g.m37302a().post(new C30936w(this));
    }

    public final void onClick(View view) {
        if (!this.f83361a) {
            this.f83361a = true;
            Runnable runnable = this.f83362b.f83316d;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.f83362b.f83315c;
            if (runnable2 != null) {
                runnable2.run();
            }
            view.getContext();
            C60856cj.m92911t(((C30917d) this.f83362b.f83314b.mo56109e(C30935v.f83357a)).mo36602a(), new C30937x(this, view), C1881g.m5136a(view.getContext()));
        }
    }
}
