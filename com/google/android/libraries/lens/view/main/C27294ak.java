package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.gleam.region.C26615f;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.main.ak */
/* compiled from: PG */
public final /* synthetic */ class C27294ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27327bq f74702a;

    public /* synthetic */ C27294ak(C27327bq bqVar) {
        this.f74702a = bqVar;
    }

    public final void run() {
        C26615f fVar;
        C26526dd ddVar = (C26526dd) this.f74702a.f74767M;
        if (ddVar.f72299i.f70642a.f70649b.equals(C25980d.EDUCATION) && (fVar = ddVar.f72302l) != null) {
            fVar.mo31904b(ddVar.f72283F);
            ddVar.f72283F = C58836b.f156633a;
        }
    }
}
