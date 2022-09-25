package com.google.android.libraries.phenotype.client.stable;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.phenotype.client.stable.at */
/* compiled from: PG */
public final /* synthetic */ class C31701at implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f85240a;

    public /* synthetic */ C31701at(C60870cx cxVar) {
        this.f85240a = cxVar;
    }

    public final void run() {
        try {
            C60856cj.m92909r(this.f85240a);
        } catch (ExecutionException e) {
            C19559g.m37302a().post(new C31702au(e));
        }
    }
}
