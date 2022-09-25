package com.google.android.libraries.search.p3055n.p3087j;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39709l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.n.j.a */
/* compiled from: PG */
final class C39797a implements C37362b {

    /* renamed from: a */
    private static final C59071e f104657a = C59071e.m91332i("com.google.android.libraries.search.n.j.a");

    /* renamed from: b */
    private final Executor f104658b;

    /* renamed from: c */
    private final C39709l f104659c;

    public C39797a(C39709l lVar, Executor executor) {
        this.f104659c = lVar;
        this.f104658b = executor;
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f104658b;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        if (lVar.f100343b == 1) {
            C59052c cVar = (C59052c) f104657a.mo56224b();
            cVar.mo56374ac(1, TimeUnit.SECONDS);
            ((C59052c) cVar.mo56372aa(53859)).mo56386p("#onNext Got audio. (heartbeat log)");
            C39709l lVar2 = this.f104659c;
            if (lVar.f100343b == 1) {
                iVar = (C37680i) lVar.f100344c;
            } else {
                iVar = C37680i.f100071c;
            }
            lVar2.mo41996a(iVar.f100074b);
            return;
        }
        ((C59052c) ((C59052c) f104657a.mo56224b()).mo56372aa(53858)).mo56386p("#onNext Audio ended.");
        this.f104659c.mo41996a(C63088z.f170246b);
    }
}
