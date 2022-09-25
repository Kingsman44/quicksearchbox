package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.gms.learning.C144827n;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.training.util.C29758c;
import com.google.android.libraries.micore.learning.training.util.C29761f;
import com.google.fcp.client.C61090c;
import java.util.Set;

/* renamed from: com.google.android.libraries.micore.learning.training.nflrunner.j */
/* compiled from: PG */
public final /* synthetic */ class C29752j implements C61090c {

    /* renamed from: a */
    public final /* synthetic */ C29755m f80597a;

    public /* synthetic */ C29752j(C29755m mVar) {
        this.f80597a = mVar;
    }

    public final Object call() {
        Set set;
        C29755m mVar = this.f80597a;
        C29758c cVar = mVar.f80599b;
        C144827n nVar = mVar.f80603f;
        C29761f fVar = mVar.f80604g;
        C29719k kVar = mVar.f80598a;
        String str = mVar.f80600c;
        String str2 = mVar.f80601d;
        C29700j jVar = mVar.f80602e;
        boolean z = false;
        if (!Thread.interrupted()) {
            if (((Boolean) cVar.mo6453a()).booleanValue()) {
                nVar.mo120058j(68, str);
            } else {
                if (mVar.f80608k) {
                    set = fVar.mo34930a(jVar, str2);
                } else {
                    set = fVar.mo34931b(jVar, str2);
                }
                fVar.mo34932c(set, str);
                if (!set.isEmpty()) {
                    kVar.mo34865g("Interrupting training due to %s", set);
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
