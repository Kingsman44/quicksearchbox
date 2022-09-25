package com.google.android.libraries.search.silk.p3162a.p3164b;

import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.silk.a.b.j */
/* compiled from: PG */
public final /* synthetic */ class C40560j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40562l f106443a;

    public /* synthetic */ C40560j(C40562l lVar) {
        this.f106443a = lVar;
    }

    public final void run() {
        C60870cx cxVar;
        C40562l lVar = this.f106443a;
        int i = lVar.f106462r;
        if (i == 0) {
            throw null;
        } else if (i == 3 && (cxVar = lVar.f106458n) != null && !cxVar.isDone()) {
            C60870cx cxVar2 = lVar.f106457m;
            if (cxVar2 != null && !cxVar2.isCancelled()) {
                lVar.f106457m.cancel(false);
            }
            C2164c cVar = lVar.f106459o;
            cVar.getClass();
            cVar.mo5437b((Object) null);
        }
    }
}
