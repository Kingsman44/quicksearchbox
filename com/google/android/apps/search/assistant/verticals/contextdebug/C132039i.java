package com.google.android.apps.search.assistant.verticals.contextdebug;

import com.google.android.libraries.search.assistant.p2566g.C33417l;
import com.google.android.libraries.search.assistant.p2566g.C33420o;
import com.google.android.libraries.search.assistant.p2566g.C33429x;
import com.google.android.libraries.search.assistant.p2566g.C33430y;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50544l;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.i */
/* compiled from: PG */
public final /* synthetic */ class C132039i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132040j f360399a;

    /* renamed from: b */
    public final /* synthetic */ C50544l f360400b;

    public /* synthetic */ C132039i(C132040j jVar, C50544l lVar) {
        this.f360399a = jVar;
        this.f360400b = lVar;
    }

    public final C60870cx apply(Object obj) {
        C132040j jVar = this.f360399a;
        C50544l lVar = this.f360400b;
        C33429x xVar = (C33429x) C33430y.f89529d.createBuilder();
        String str = ((C46108a) obj).mo50210b().f121161f;
        xVar.copyOnWrite();
        C33430y yVar = (C33430y) xVar.instance;
        str.getClass();
        yVar.f89531a |= 1;
        yVar.f89532b = str;
        xVar.copyOnWrite();
        C33430y yVar2 = (C33430y) xVar.instance;
        lVar.getClass();
        yVar2.f89533c = lVar;
        yVar2.f89531a |= 2;
        C33417l lVar2 = jVar.f360403c;
        return C70876o.m103760a(lVar2.f189039a.mo39510a(C33420o.m62006b(), lVar2.f189040b), (C33430y) xVar.build());
    }
}
