package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import android.view.View;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.o */
/* compiled from: PG */
public final /* synthetic */ class C89311o implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C89315s f242132a;

    public /* synthetic */ C89311o(C89315s sVar) {
        this.f242132a = sVar;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        C89315s sVar = this.f242132a;
        long c = sVar.f242138b.mo26871c();
        if (!sVar.f242139c.mo56113h() || c - ((Long) sVar.f242139c.mo56107c()).longValue() > 100) {
            sVar.f242140d = C58833ax.m90834k(Long.valueOf(c));
        } else {
            sVar.f242139c = C58833ax.m90834k(Long.valueOf(c));
        }
    }
}
