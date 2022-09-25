package com.google.android.apps.search.assistant.platform.pcp.p9326c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.c.c */
/* compiled from: PG */
public final /* synthetic */ class C123652c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33426u f341604a;

    public /* synthetic */ C123652c(C33426u uVar) {
        this.f341604a = uVar;
    }

    public final Object apply(Object obj) {
        C33426u uVar = this.f341604a;
        C123746bm bmVar = (C123746bm) obj;
        C123657h hVar = (C123657h) C123658i.f341614c.createBuilder();
        hVar.copyOnWrite();
        C123658i iVar = (C123658i) hVar.instance;
        bmVar.getClass();
        iVar.f341617b = bmVar;
        iVar.f341616a |= 1;
        C63088z byteString = ((C123658i) hVar.build()).toByteString();
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        C33427v vVar2 = C33427v.f89523e;
        byteString.getClass();
        vVar.f89525a |= 2;
        vVar.f89527c = byteString;
        return C58485gu.m89846n((C33427v) uVar.build());
    }
}
