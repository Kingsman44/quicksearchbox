package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.at */
/* compiled from: PG */
public final /* synthetic */ class C25214at implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ C25980d f68654a;

    public /* synthetic */ C25214at(C25980d dVar) {
        this.f68654a = dVar;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        C25980d dVar = this.f68654a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25271j jVar = aeVar.f68640m;
        if (jVar == null) {
            jVar = C25271j.f68747b;
        }
        C25270i iVar = (C25270i) jVar.toBuilder();
        int i = dVar.mo31199b().f150068m;
        iVar.copyOnWrite();
        ((C25271j) iVar.instance).f68749a = i;
        adVar.copyOnWrite();
        C25271j jVar2 = (C25271j) iVar.build();
        jVar2.getClass();
        ((C25199ae) adVar.instance).f68640m = jVar2;
        return (C25199ae) adVar.build();
    }
}
