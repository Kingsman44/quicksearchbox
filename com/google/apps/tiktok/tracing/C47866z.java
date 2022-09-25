package com.google.apps.tiktok.tracing;

import com.google.common.base.C58838bb;
import java.util.UUID;

/* renamed from: com.google.apps.tiktok.tracing.z */
/* compiled from: PG */
abstract class C47866z extends C47510a {

    /* renamed from: a */
    private final C47563bn f123935a;

    public C47866z(String str, C47572bw bwVar, C47563bn bnVar) {
        super(str, bwVar);
        C58838bb.m90868c(bnVar.f123429c);
        this.f123935a = bnVar;
    }

    /* renamed from: g */
    public C47559bj mo51394g(C47560bk bkVar) {
        return C47563bn.m84655i(bkVar, this.f123935a);
    }

    public C47866z(String str, UUID uuid, C47563bn bnVar) {
        super(str, uuid);
        C58838bb.m90868c(bnVar.f123429c);
        this.f123935a = bnVar;
    }
}
