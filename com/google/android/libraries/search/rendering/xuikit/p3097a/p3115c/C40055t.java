package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.protos.youtube.elements.C66192df;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.t */
/* compiled from: PG */
public final /* synthetic */ class C40055t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105237a;

    /* renamed from: b */
    public final /* synthetic */ C66192df f105238b;

    /* renamed from: c */
    public final /* synthetic */ C28442l f105239c;

    public /* synthetic */ C40055t(C40058w wVar, C66192df dfVar, C28442l lVar) {
        this.f105237a = wVar;
        this.f105238b = dfVar;
        this.f105239c = lVar;
    }

    public final void run() {
        C40058w wVar = this.f105237a;
        C66192df dfVar = this.f105238b;
        C28442l lVar = this.f105239c;
        if (wVar.f105250g) {
            wVar.f105246c.mo33922f();
        }
        synchronized (wVar.f105251h) {
            C28439i iVar = (C28439i) wVar.f105254k.get(Integer.valueOf(dfVar.f180000c));
            iVar.getClass();
            wVar.f105247d.mo33853c(lVar, iVar);
        }
    }
}
