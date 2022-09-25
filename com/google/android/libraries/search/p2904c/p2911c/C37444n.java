package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37648h;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37704j;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.c.n */
/* compiled from: PG */
final class C37444n implements C37362b {

    /* renamed from: a */
    int f99400a;

    /* renamed from: b */
    private final C37362b f99401b;

    public C37444n(C37362b bVar, int i) {
        this.f99401b = bVar;
        this.f99400a = i;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        int i;
        C37680i iVar;
        C37680i iVar2;
        if (this.f99400a <= 0 || (i = lVar.f100343b) == 2) {
            this.f99401b.mo39010b(lVar);
            return;
        }
        if (i == 1) {
            iVar = (C37680i) lVar.f100344c;
        } else {
            iVar = C37680i.f100071c;
        }
        int d = iVar.f100074b.mo59031d();
        if (this.f99400a < d) {
            C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
            C37648h hVar = (C37648h) C37680i.f100071c.createBuilder();
            if (lVar.f100343b == 1) {
                iVar2 = (C37680i) lVar.f100344c;
            } else {
                iVar2 = C37680i.f100071c;
            }
            C63088z zVar = iVar2.f100074b;
            C63088z k = zVar.mo59039k(this.f99400a, zVar.mo59031d());
            hVar.copyOnWrite();
            C37680i iVar3 = (C37680i) hVar.instance;
            k.getClass();
            iVar3.f100073a |= 1;
            iVar3.f100074b = k;
            C37680i iVar4 = (C37680i) hVar.build();
            jVar.copyOnWrite();
            C37819l lVar2 = (C37819l) jVar.instance;
            iVar4.getClass();
            lVar2.f100344c = iVar4;
            lVar2.f100343b = 1;
            this.f99401b.mo39010b((C37819l) jVar.build());
        }
        this.f99400a -= d;
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f99401b.mo39011k();
    }
}
