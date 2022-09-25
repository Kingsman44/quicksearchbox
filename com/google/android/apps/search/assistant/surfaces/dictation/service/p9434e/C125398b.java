package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126277u;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.b */
/* compiled from: PG */
public final /* synthetic */ class C125398b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C125411o f345844a;

    /* renamed from: b */
    public final /* synthetic */ C37819l f345845b;

    public /* synthetic */ C125398b(C125411o oVar, C37819l lVar) {
        this.f345844a = oVar;
        this.f345845b = lVar;
    }

    public final void run() {
        C37680i iVar;
        C125411o oVar = this.f345844a;
        C37819l lVar = this.f345845b;
        if (lVar.f100343b == 1) {
            iVar = (C37680i) lVar.f100344c;
        } else {
            iVar = C37680i.f100071c;
        }
        oVar.f345873m.add(iVar);
        C126277u uVar = (C126277u) oVar.f345876p.get();
        if (uVar != null) {
            oVar.mo106962a(uVar);
        }
    }
}
