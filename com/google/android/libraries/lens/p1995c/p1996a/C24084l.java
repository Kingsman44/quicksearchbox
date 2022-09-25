package com.google.android.libraries.lens.p1995c.p1996a;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.C84209i;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87740bv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87932iy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87933iz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87935ja;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.lens.c.a.l */
/* compiled from: PG */
public final /* synthetic */ class C24084l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24091s f65781a;

    /* renamed from: b */
    public final /* synthetic */ C84209i f65782b;

    public /* synthetic */ C24084l(C24091s sVar, C84209i iVar) {
        this.f65781a = sVar;
        this.f65782b = iVar;
    }

    public final void run() {
        C24091s sVar = this.f65781a;
        C84209i iVar = this.f65782b;
        C24092t.m44741a();
        if (sVar.f65799h == null) {
            Log.w("LensServiceConnImpl", "The service is no longer bound.");
            sVar.mo29492h();
            return;
        }
        try {
            sVar.f65800i = iVar;
            if (sVar.f65800i == null) {
                Log.e("LensServiceConnImpl", "Failed to create a Lens service session.");
                sVar.f65801j = 11;
                sVar.mo29493i(7);
                return;
            }
            sVar.mo29493i(4);
            C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
            C87739bu buVar = C87739bu.START_CLIENT;
            bvVar.copyOnWrite();
            C87741bw bwVar = (C87741bw) bvVar.instance;
            bwVar.f237480b = buVar.f237476dL;
            bwVar.f237479a |= 1;
            C87740bv bvVar2 = (C87740bv) C87741bw.f237477c.createBuilder();
            C87739bu buVar2 = C87739bu.LENS_SERVICE_TARGET_API_VERSION;
            bvVar2.copyOnWrite();
            C87741bw bwVar2 = (C87741bw) bvVar2.instance;
            bwVar2.f237480b = buVar2.f237476dL;
            bwVar2.f237479a |= 1;
            C62940bt btVar = C87932iy.f237848a;
            C87933iz izVar = (C87933iz) C87935ja.f237850c.createBuilder();
            izVar.copyOnWrite();
            C87935ja jaVar = (C87935ja) izVar.instance;
            jaVar.f237852a |= 1;
            jaVar.f237853b = 2;
            bvVar2.mo58885m(btVar, (C87935ja) izVar.build());
            C84209i iVar2 = sVar.f65800i;
            C24092t.m44743c(iVar2);
            iVar2.mo77671e(((C87741bw) bvVar.build()).toByteArray());
            C84209i iVar3 = sVar.f65800i;
            C24092t.m44743c(iVar3);
            iVar3.mo77671e(((C87741bw) bvVar2.build()).toByteArray());
        } catch (RemoteException e) {
            Log.w("LensServiceConnImpl", "Failed to call client event callbacks.", e);
            sVar.mo29492h();
        }
    }
}
