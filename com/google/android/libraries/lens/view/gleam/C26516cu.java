package com.google.android.libraries.lens.view.gleam;

import android.os.Trace;
import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.cu */
/* compiled from: PG */
public final /* synthetic */ class C26516cu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72259a;

    /* renamed from: b */
    public final /* synthetic */ C25312at f72260b;

    /* renamed from: c */
    public final /* synthetic */ C28097c f72261c;

    public /* synthetic */ C26516cu(C26526dd ddVar, C25312at atVar, C28097c cVar) {
        this.f72259a = ddVar;
        this.f72260b = atVar;
        this.f72261c = cVar;
    }

    public final void run() {
        C26526dd ddVar = this.f72259a;
        C25312at atVar = this.f72260b;
        C28097c cVar = this.f72261c;
        ddVar.mo31797q(atVar);
        Trace.beginSection("send frame to GleamFragment");
        ddVar.f72307q.mo5708l(C58833ax.m90834k(cVar));
        Trace.endSection();
    }
}
