package com.google.android.libraries.lens.view.gleam;

import android.os.Trace;
import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.db */
/* compiled from: PG */
public final /* synthetic */ class C26524db implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72273a;

    /* renamed from: b */
    public final /* synthetic */ C25312at f72274b;

    public /* synthetic */ C26524db(C26526dd ddVar, C25312at atVar) {
        this.f72273a = ddVar;
        this.f72274b = atVar;
    }

    public final void run() {
        C26526dd ddVar = this.f72273a;
        C25312at atVar = this.f72274b;
        ddVar.mo31797q(atVar);
        Trace.beginSection("send gleam update to GleamFragment");
        ddVar.f72308r.mo5708l(C58833ax.m90834k(atVar));
        Trace.endSection();
    }
}
