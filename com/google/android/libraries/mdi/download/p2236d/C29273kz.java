package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.kz */
/* compiled from: PG */
public final /* synthetic */ class C29273kz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79325a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79326b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f79327c;

    public /* synthetic */ C29273kz(C29290lp lpVar, C29398ev evVar, C29328dl dlVar) {
        this.f79325a = lpVar;
        this.f79326b = evVar;
        this.f79327c = dlVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79325a;
        C29398ev evVar = this.f79326b;
        C29328dl dlVar = this.f79327c;
        C29402ez ezVar = (C29402ez) obj;
        C29390en a = C29390en.m54308a(ezVar.f79715c);
        if (a == null) {
            a = C29390en.NONE;
        }
        if (a != C29390en.DOWNLOAD_COMPLETE) {
            return C60866ct.f164955a;
        }
        return C29670b.m54719g(lpVar.mo34641e(evVar)).mo34822i(new C29289lo(lpVar, ezVar, dlVar), lpVar.f79395k).mo34820f(C28738bp.class, new C29261kn(lpVar, ezVar, evVar), lpVar.f79395k);
    }
}
