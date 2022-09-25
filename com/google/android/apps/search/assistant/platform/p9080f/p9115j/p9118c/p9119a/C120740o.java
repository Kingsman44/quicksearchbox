package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.libraries.search.p3055n.C39359bh;
import com.google.android.libraries.search.p3055n.C39360bi;
import com.google.android.libraries.search.p3055n.C39361bj;
import com.google.android.libraries.search.p3055n.C39363bl;
import com.google.android.libraries.search.p3055n.C39669cw;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.android.libraries.search.p3055n.C39672cz;
import com.google.protobuf.C62940bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.o */
/* compiled from: PG */
public final class C120740o {
    /* renamed from: a */
    public static final C39670cx m199911a() {
        C39669cw cwVar = (C39669cw) C39670cx.f104424a.createBuilder();
        C69664n.m101060f(cwVar, "newBuilder()");
        C39672cz a = C69664n.m101061g(cwVar, "builder");
        C62940bt btVar = C39361bj.f103655d;
        C69664n.m101060f(btVar, "requestId");
        C39360bi biVar = (C39360bi) C39361bj.f103654c.createBuilder();
        C69664n.m101060f(biVar, "newBuilder()");
        C39363bl a2 = C69664n.m101061g(biVar, "builder");
        C39359bh bhVar = C39359bh.AUDIO_EVENT_END_OF_DATA;
        C69664n.m101061g(bhVar, "value");
        C39360bi biVar2 = a2.f103659a;
        biVar2.copyOnWrite();
        C39361bj bjVar = (C39361bj) biVar2.instance;
        bjVar.f103658b = Integer.valueOf(bhVar.f103653c);
        bjVar.f103657a = 2;
        a.mo41983b(btVar, a2.mo41785a());
        return a.mo41982a();
    }
}
