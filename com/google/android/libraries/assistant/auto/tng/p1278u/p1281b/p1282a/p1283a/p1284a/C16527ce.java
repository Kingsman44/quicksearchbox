package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.google.assistant.p3897e.p3917i.p3918a.C51475jb;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.ce */
/* compiled from: PG */
public final class C16527ce extends C68247h {

    /* renamed from: a */
    private final C68283d f48516a;

    public C16527ce(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16527ce.class), aVar);
        this.f48516a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "asst.morris.log.params";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.MorrisLogParams";
            C63088z byteString = ((C51475jb) axVar.mo56107c()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            kaVar3.getClass();
            kcVar2.f137066c = kaVar3;
            kcVar2.f137064a |= 2;
            obj2 = C58833ax.m90834k((C52232kc) kbVar.build());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48516a.mo60297gq();
    }
}
