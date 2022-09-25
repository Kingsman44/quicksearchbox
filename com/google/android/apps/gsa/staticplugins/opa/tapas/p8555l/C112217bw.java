package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113385dz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54917h;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54918i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bw */
/* compiled from: PG */
public final class C112217bw extends C112221c {

    /* renamed from: a */
    private final C113425ff f311518a;

    public C112217bw(C113425ff ffVar) {
        this.f311518a = ffVar;
    }

    /* renamed from: a */
    public final C54918i mo99473a(C113385dz dzVar) {
        if (!this.f311518a.mo100142h()) {
            return C54918i.f144358h;
        }
        C54917h hVar = (C54917h) C54918i.f144358h.createBuilder();
        if ((dzVar.f313934a & 32) != 0) {
            float f = dzVar.f313935b;
            hVar.copyOnWrite();
            C54918i iVar = (C54918i) hVar.instance;
            iVar.f144360a |= 1;
            iVar.f144361b = f;
        }
        if ((dzVar.f313934a & 64) != 0) {
            float f2 = dzVar.f313936c;
            hVar.copyOnWrite();
            C54918i iVar2 = (C54918i) hVar.instance;
            iVar2.f144360a |= 2;
            iVar2.f144362c = f2;
        }
        if ((dzVar.f313934a & 128) != 0) {
            float f3 = dzVar.f313937d;
            hVar.copyOnWrite();
            C54918i iVar3 = (C54918i) hVar.instance;
            iVar3.f144360a |= 4;
            iVar3.f144363d = f3;
        }
        if ((dzVar.f313934a & 256) != 0) {
            float f4 = dzVar.f313938e;
            hVar.copyOnWrite();
            C54918i iVar4 = (C54918i) hVar.instance;
            iVar4.f144360a |= 8;
            iVar4.f144364e = f4;
        }
        if ((dzVar.f313934a & 512) != 0) {
            float f5 = dzVar.f313939f;
            hVar.copyOnWrite();
            C54918i iVar5 = (C54918i) hVar.instance;
            iVar5.f144360a |= 16;
            iVar5.f144365f = f5;
        }
        if ((dzVar.f313934a & 1024) != 0) {
            float f6 = dzVar.f313940g;
            hVar.copyOnWrite();
            C54918i iVar6 = (C54918i) hVar.instance;
            iVar6.f144360a |= 32;
            iVar6.f144366g = f6;
        }
        return (C54918i) hVar.build();
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((C113385dz) obj);
    }
}
