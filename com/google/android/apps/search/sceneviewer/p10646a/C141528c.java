package com.google.android.apps.search.sceneviewer.p10646a;

import com.google.android.apps.search.sceneviewer.C141525a;
import com.google.android.apps.search.sceneviewer.C141532b;
import com.google.android.apps.search.sceneviewer.C141535c;
import com.google.android.apps.search.sceneviewer.C141540d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.sceneviewer.a.c */
/* compiled from: PG */
public final /* synthetic */ class C141528c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f384152a;

    public /* synthetic */ C141528c(boolean z) {
        this.f384152a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f384152a;
        C141540d dVar = (C141540d) obj;
        C141535c cVar = (C141535c) dVar.toBuilder();
        C141532b bVar = dVar.f384178b;
        if (bVar == null) {
            bVar = C141532b.f384155d;
        }
        C141525a aVar = (C141525a) bVar.toBuilder();
        aVar.copyOnWrite();
        C141532b bVar2 = (C141532b) aVar.instance;
        bVar2.f384157a |= 1;
        bVar2.f384158b = z;
        cVar.copyOnWrite();
        C141540d dVar2 = (C141540d) cVar.instance;
        C141532b bVar3 = (C141532b) aVar.build();
        bVar3.getClass();
        dVar2.f384178b = bVar3;
        dVar2.f384177a |= 1;
        return (C141540d) cVar.build();
    }
}
