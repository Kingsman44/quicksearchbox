package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.au.j;
import com.google.android.apps.gsa.nga.engine.au.k;
import com.google.android.apps.gsa.nga.engine.understanding.p6241h.C79142a;
import com.google.android.apps.gsa.nga.shared.p6274a.C80054ah;
import com.google.android.apps.gsa.nga.shared.p6274a.C80055ai;
import com.google.knowledge.p4661a.p4662a.C61761w;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62940bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.y */
/* compiled from: PG */
public final /* synthetic */ class C79327y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79142a f217837a;

    public /* synthetic */ C79327y(C79142a aVar) {
        this.f217837a = aVar;
    }

    public final void accept(Object obj) {
        C79142a aVar = this.f217837a;
        String str = (String) obj;
        C61761w wVar = (C61761w) C61762x.f166835e.createBuilder();
        C62940bt btVar = k.c;
        j createBuilder = k.b.createBuilder();
        C80054ah ahVar = (C80054ah) C80055ai.f219682c.createBuilder();
        ahVar.copyOnWrite();
        str.getClass();
        ((C80055ai) ahVar.instance).f219685b = str;
        createBuilder.copyOnWrite();
        k kVar = createBuilder.instance;
        C80055ai aiVar = (C80055ai) ahVar.build();
        aiVar.getClass();
        kVar.a();
        kVar.a.add(aiVar);
        wVar.mo58885m(btVar, createBuilder.build());
        aVar.mo73814d("webref_deeplink", str, (C61762x) wVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
