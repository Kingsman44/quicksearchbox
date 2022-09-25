package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.h.b.q */
/* compiled from: PG */
public final /* synthetic */ class C29570q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28708an f80118a;

    public /* synthetic */ C29570q(C28708an anVar) {
        this.f80118a = anVar;
    }

    public final C60870cx apply(Object obj) {
        C28708an anVar = this.f80118a;
        C28738bp bpVar = (C28738bp) obj;
        int i = C29576w.f80133d;
        if (!bpVar.f78134a.equals(C28737bo.GROUP_NOT_FOUND_ERROR)) {
            return C60856cj.m92899h(bpVar);
        }
        C29045l.m53931c("%s: Received current active group %s, but could not be imported (either not found or outdated).", "GddDownloadedElementsListener", anVar.f77997b);
        return C60866ct.f164955a;
    }
}
