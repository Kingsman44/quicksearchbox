package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.protos.youtube.elements.C66192df;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.o */
/* compiled from: PG */
public final /* synthetic */ class C40050o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105225a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f105226b;

    public /* synthetic */ C40050o(C40058w wVar, C58485gu guVar) {
        this.f105225a = wVar;
        this.f105226b = guVar;
    }

    public final void run() {
        C40058w wVar = this.f105225a;
        C58485gu guVar = this.f105226b;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C66192df dfVar = (C66192df) guVar.get(i2);
            if (C40030ak.m69542a(dfVar) instanceof C40029aj) {
                synchronized (wVar.f105251h) {
                    C28439i iVar = (C28439i) wVar.f105254k.get(Integer.valueOf(dfVar.f180000c));
                    iVar.getClass();
                    iVar.mo33892i(1);
                }
            }
        }
        if (!wVar.f105250g) {
            wVar.f105246c.mo33922f();
        }
    }
}
