package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.android.libraries.mdi.download.C29678r;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ak */
/* compiled from: PG */
public final /* synthetic */ class C103911ak implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103923aw f289232a;

    /* renamed from: b */
    public final /* synthetic */ C29690f f289233b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f289234c;

    public /* synthetic */ C103911ak(C103923aw awVar, C29690f fVar, C58833ax axVar) {
        this.f289232a = awVar;
        this.f289233b = fVar;
        this.f289234c = axVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103923aw awVar = this.f289232a;
        C29690f fVar = this.f289233b;
        C58833ax axVar = this.f289234c;
        if (!((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        String str = fVar.f80411b;
        int i = fVar.f80414e;
        String str2 = fVar.f80413d;
        C22871g gVar = awVar.f289255g;
        C29409fd fdVar = awVar.f289250b;
        C29651hv e = C29652hw.m54673e();
        e.mo34790b(fVar.f80411b);
        ((C29678r) e).f80364b = axVar;
        return gVar.mo28209i(fdVar.mo34722k(e.mo34789a()), "[NGA] handle delete result", new C103913am(fVar));
    }
}
