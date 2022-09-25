package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79879a;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79881c;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.TapasJni;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ea */
/* compiled from: PG */
public final /* synthetic */ class C112393ea implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311833a;

    /* renamed from: b */
    public final /* synthetic */ C80012i f311834b;

    public /* synthetic */ C112393ea(C112435fh fhVar, C80012i iVar) {
        this.f311833a = fhVar;
        this.f311834b = iVar;
    }

    public final Object get() {
        C112435fh fhVar = this.f311833a;
        C80012i iVar = this.f311834b;
        TapasJni tapasJni = fhVar.f311931d;
        C79882d dVar = (C79882d) C79885g.f218957h.createBuilder();
        dVar.mo58885m(C80012i.f219559j, iVar);
        C79879a aVar = (C79879a) C79881c.f218947d.createBuilder();
        aVar.copyOnWrite();
        C79881c cVar = (C79881c) aVar.instance;
        cVar.f218950b = 6;
        cVar.f218949a |= 1;
        dVar.copyOnWrite();
        C79885g gVar = (C79885g) dVar.instance;
        C79881c cVar2 = (C79881c) aVar.build();
        cVar2.getClass();
        gVar.f218963e = cVar2;
        gVar.f218959a |= 8;
        return tapasJni.mo99230a((C79885g) dVar.build());
    }
}
