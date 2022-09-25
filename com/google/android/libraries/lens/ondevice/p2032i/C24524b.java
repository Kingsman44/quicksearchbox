package com.google.android.libraries.lens.ondevice.p2032i;

import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63233f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.ondevice.i.b */
/* compiled from: PG */
public final /* synthetic */ class C24524b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C24528f f67183a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f67184b;

    public /* synthetic */ C24524b(C24528f fVar, C60870cx cxVar) {
        this.f67183a = fVar;
        this.f67184b = cxVar;
    }

    public final Object call() {
        C24528f fVar = this.f67183a;
        try {
            C63233f fVar2 = (C63233f) C60856cj.m92909r(this.f67184b);
            C24530h hVar = fVar.f67189b;
            C24805p pVar = C24805p.CASCADE_DEPENDENCIES_CHECK_SUCCESS;
            C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
            rVar.copyOnWrite();
            C24808s sVar = (C24808s) rVar.instance;
            fVar2.getClass();
            sVar.f67813h = fVar2;
            sVar.f67806a |= 64;
            hVar.mo29947f(pVar, (C24808s) rVar.build());
            return null;
        } catch (ExecutionException e) {
            fVar.f67189b.mo29947f(C24805p.CASCADE_DEPENDENCIES_CHECK_ERROR, (C24808s) null);
            throw e;
        }
    }
}
