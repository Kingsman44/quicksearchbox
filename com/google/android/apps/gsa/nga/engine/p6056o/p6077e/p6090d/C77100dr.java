package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.apps.gsa.nga.engine.p6056o.C77417k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dr */
/* compiled from: PG */
public final /* synthetic */ class C77100dr implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212783a;

    /* renamed from: b */
    public final /* synthetic */ C77088df f212784b;

    public /* synthetic */ C77100dr(C77123en enVar, C77088df dfVar) {
        this.f212783a = enVar;
        this.f212784b = dfVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212783a;
        C77088df dfVar = this.f212784b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C77417k kVar = new C77417k();
        kVar.mo72224b(enVar.f212857n.mo57444a().toEpochMilli());
        kVar.f213452a = Optional.ofNullable((Bitmap) optional.get());
        C76534ab a = kVar.mo72223a();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(60742);
        C80303ay ayVar = (C80303ay) C80307bb.f220382e.createBuilder();
        C22871g gVar = enVar.f212853j;
        C77089dg dgVar = enVar.f212848e;
        C77098dp dpVar = new C77098dp(enVar, dfVar, a);
        return gVar.mo28209i(dgVar.f212752f.mo28210j(dgVar.mo72416b(dfVar, ayVar), "[NGA] SendMessageHelper.sendMessageAndShowCard", new C77041bm(dpVar, lVar, ayVar)), "[NGA] ShareFulfiller.shareImage", new C77099dq(lVar, ayVar));
    }
}
