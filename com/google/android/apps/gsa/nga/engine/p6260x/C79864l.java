package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.gestureclassifier.C76118h;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82848cr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82849cs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.l */
/* compiled from: PG */
public final /* synthetic */ class C79864l implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C76118h f218928a;

    /* renamed from: b */
    public final /* synthetic */ double f218929b;

    public /* synthetic */ C79864l(C76118h hVar, double d) {
        this.f218928a = hVar;
        this.f218929b = d;
    }

    public final Object get() {
        C76118h hVar = this.f218928a;
        double d = this.f218929b;
        C79877y yVar = C79878z.f218943a;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82848cr crVar = (C82848cr) C82849cs.f225909d.createBuilder();
        crVar.copyOnWrite();
        C82849cs csVar = (C82849cs) crVar.instance;
        hVar.getClass();
        csVar.f225912b = hVar;
        csVar.f225911a |= 1;
        crVar.copyOnWrite();
        C82849cs csVar2 = (C82849cs) crVar.instance;
        csVar2.f225911a |= 2;
        csVar2.f225913c = d;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82849cs csVar3 = (C82849cs) crVar.build();
        csVar3.getClass();
        eaVar.f225980b = csVar3;
        eaVar.f225979a = 17;
        return (C82885ea) dzVar.build();
    }
}
