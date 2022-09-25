package com.google.android.libraries.lens.view.p2085ax.p2086a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.libraries.lens.view.utils.C28098a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.ax.a.a */
/* compiled from: PG */
public final /* synthetic */ class C25593a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25598f f69630a;

    public /* synthetic */ C25593a(C25598f fVar) {
        this.f69630a = fVar;
    }

    public final Object call() {
        C58833ax k;
        C25598f fVar = this.f69630a;
        if (C28098a.m52377a(fVar.f69639b)) {
            return C58836b.f156633a;
        }
        synchronized (fVar) {
            if (fVar.f69643f == null) {
                fVar.f69643f = (C119096ae) fVar.f69642e.mo17428b();
                fVar.f69643f.mo104118j("LensAndroid_Guidance");
            }
            k = C58833ax.m90834k(fVar.f69643f);
        }
        return k;
    }
}
