package com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8526a.C111764a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8526a.C111765b;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.e.c.a */
/* compiled from: PG */
public final /* synthetic */ class C111767a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111771e f310662a;

    /* renamed from: b */
    public final /* synthetic */ C80008e f310663b;

    public /* synthetic */ C111767a(C111771e eVar, C80008e eVar2) {
        this.f310662a = eVar;
        this.f310663b = eVar2;
    }

    public final void run() {
        C111771e eVar = this.f310662a;
        C80008e eVar2 = this.f310663b;
        C111764a aVar = (C111764a) C111765b.f310654f.createBuilder();
        C80012i iVar = (C80012i) eVar2.build();
        aVar.copyOnWrite();
        C111765b bVar = (C111765b) aVar.instance;
        iVar.getClass();
        bVar.f310658c = iVar;
        bVar.f310657b = 2;
        eVar.mo99226a((C111765b) aVar.build(), "autocomplete_suggestions.bin").getPath();
    }
}
