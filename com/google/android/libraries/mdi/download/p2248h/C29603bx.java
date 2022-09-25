package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.mdi.download.h.bx */
/* compiled from: PG */
public final class C29603bx implements C28746bx {

    /* renamed from: a */
    public final C58881cr f80185a;

    public C29603bx(C29602bw bwVar) {
        this.f80185a = bwVar.f80183a;
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C29045l.m53930b("%s: Add file group to Mdd.", "SingleDataFileGroupPop");
        C60870cx i = C60856cj.m92900i(C58836b.f156633a);
        Object obj = ((C58885cv) this.f80185a).f156729a;
        if (obj != null && !((C28708an) obj).f77997b.isEmpty()) {
            i = C60856cj.m92900i(C58833ax.m90834k((C28708an) ((C58885cv) this.f80185a).f156729a));
        }
        C29599bt btVar = new C29599bt(fdVar);
        C60870cx h = C60922j.m93045h(i, C47810es.m84966f(btVar), C60826bg.f164896a);
        C29601bv bvVar = new C29601bv(this);
        C60856cj.m92911t(h, C47810es.m84974n(bvVar), C60826bg.f164896a);
        return C29672d.m54727b(h).mo34823a(C29600bu.f80181a, C60826bg.f164896a);
    }
}
