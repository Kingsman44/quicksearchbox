package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80904as;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dy */
/* compiled from: PG */
public final /* synthetic */ class C77107dy implements C80904as {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212804a;

    /* renamed from: b */
    public final /* synthetic */ C77088df f212805b;

    public /* synthetic */ C77107dy(C77123en enVar, C77088df dfVar) {
        this.f212804a = enVar;
        this.f212805b = dfVar;
    }

    /* renamed from: a */
    public final C60870cx mo71517a() {
        C77123en enVar = this.f212804a;
        C77088df dfVar = this.f212805b;
        Optional b = enVar.f212849f.mo71237b();
        if (!b.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return enVar.mo72430g(dfVar, (Uri) b.get(), "image/png", (C80399l) C80401n.f220656k.createBuilder());
    }
}
