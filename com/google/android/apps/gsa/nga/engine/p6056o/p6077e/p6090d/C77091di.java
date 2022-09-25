package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.C18095i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.di */
/* compiled from: PG */
public final /* synthetic */ class C77091di implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212757a;

    /* renamed from: b */
    public final /* synthetic */ C77088df f212758b;

    public /* synthetic */ C77091di(C77123en enVar, C77088df dfVar) {
        this.f212757a = enVar;
        this.f212758b = dfVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212757a;
        C77088df dfVar = this.f212758b;
        C18095i iVar = (C18095i) obj;
        if (iVar.mo23509a() == null || !C77123en.m123790j(iVar.mo23510b()) || !enVar.f212856m.mo71212a(iVar.mo23509a())) {
            return C60856cj.m92900i(Optional.empty());
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(76319);
        return enVar.mo72430g(dfVar, iVar.mo23509a(), iVar.mo23510b(), lVar);
    }
}
