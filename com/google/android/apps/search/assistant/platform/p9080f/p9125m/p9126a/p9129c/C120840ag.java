package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.search.p3055n.C39359bh;
import com.google.android.libraries.search.p3055n.C39360bi;
import com.google.android.libraries.search.p3055n.C39361bj;
import com.google.android.libraries.search.p3055n.C39669cw;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C120840ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120864d f336015a;

    public /* synthetic */ C120840ag(C120864d dVar) {
        this.f336015a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C120864d dVar = this.f336015a;
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
        C39669cw cwVar = (C39669cw) C39670cx.f104424a.createBuilder();
        C62940bt btVar = C39361bj.f103655d;
        C39360bi biVar = (C39360bi) C39361bj.f103654c.createBuilder();
        C39359bh bhVar = C39359bh.AUDIO_EVENT_END_OF_DATA;
        biVar.copyOnWrite();
        C39361bj bjVar = (C39361bj) biVar.instance;
        bjVar.f103658b = Integer.valueOf(bhVar.f103653c);
        bjVar.f103657a = 2;
        cwVar.mo58885m(btVar, (C39361bj) biVar.build());
        return dVar.mo104956a((C39670cx) cwVar.build());
    }
}
