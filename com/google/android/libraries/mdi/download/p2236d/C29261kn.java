package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.kn */
/* compiled from: PG */
public final /* synthetic */ class C29261kn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79277a;

    /* renamed from: b */
    public final /* synthetic */ C29402ez f79278b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79279c;

    public /* synthetic */ C29261kn(C29290lp lpVar, C29402ez ezVar, C29398ev evVar) {
        this.f79277a = lpVar;
        this.f79278b = ezVar;
        this.f79279c = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79277a;
        C29402ez ezVar = this.f79278b;
        C29398ev evVar = this.f79279c;
        C29045l.m53936h("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((C28738bp) obj).f78134a);
        C29401ey eyVar = (C29401ey) ezVar.toBuilder();
        C29390en enVar = C29390en.CORRUPTED;
        eyVar.copyOnWrite();
        C29402ez ezVar2 = (C29402ez) eyVar.instance;
        ezVar2.f79715c = enVar.f79678h;
        ezVar2.f79713a |= 2;
        return C29670b.m54719g(lpVar.f79387c.mo34622g(evVar, (C29402ez) eyVar.build())).mo34822i(C29282lh.f79352a, lpVar.f79395k);
    }
}
