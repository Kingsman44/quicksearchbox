package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.internal.C143919bh;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.cast.framework.media.r */
/* compiled from: PG */
final class C143531r extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C143535v f389210a;

    public C143531r(C143535v vVar) {
        this.f389210a = vVar;
    }

    public final void run() {
        C143854z zVar;
        C143535v vVar = this.f389210a;
        if (!vVar.f389220h.isEmpty() && vVar.f389221i == null && vVar.f389214b != 0) {
            C143500bf bfVar = vVar.f389215c;
            int[] l = C143596v.m233279l(vVar.f389220h);
            C143919bh.m233964g("Must be called from the main thread.");
            if (!bfVar.mo118792t()) {
                zVar = C143500bf.m232974D();
            } else {
                C143478ak akVar = new C143478ak(bfVar, l);
                bfVar.mo118765E(akVar);
                zVar = akVar;
            }
            vVar.f389221i = zVar;
            vVar.f389221i.mo117321f(new C143530q(vVar));
            vVar.f389220h.clear();
        }
    }
}
