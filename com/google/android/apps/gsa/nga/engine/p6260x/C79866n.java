package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82803b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82830c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.n */
/* compiled from: PG */
public final /* synthetic */ class C79866n implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f218931a;

    public /* synthetic */ C79866n(int i) {
        this.f218931a = i;
    }

    public final Object get() {
        int i = this.f218931a;
        C79877y yVar = C79878z.f218943a;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82803b bVar = (C82803b) C82830c.f225706c.createBuilder();
        bVar.copyOnWrite();
        C82830c cVar = (C82830c) bVar.instance;
        cVar.f225709b = i - 1;
        cVar.f225708a |= 1;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82830c cVar2 = (C82830c) bVar.build();
        cVar2.getClass();
        eaVar.f225980b = cVar2;
        eaVar.f225979a = 32;
        return (C82885ea) dzVar.build();
    }
}
