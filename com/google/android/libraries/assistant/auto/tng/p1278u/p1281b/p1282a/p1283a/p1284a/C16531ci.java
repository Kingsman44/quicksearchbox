package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.google.assistant.p3897e.p3917i.p3918a.C51533lf;
import com.google.assistant.p3897e.p3917i.p3918a.C51535lh;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.ci */
/* compiled from: PG */
public final class C16531ci extends C68247h {

    /* renamed from: a */
    private final C68283d f48520a;

    public C16531ci(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16531ci.class), aVar);
        this.f48520a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            ((C51535lh) axVar.mo56107c()).name();
            C51533lf lfVar = (C51533lf) C51536li.f134316k.createBuilder();
            lfVar.copyOnWrite();
            C51536li liVar = (C51536li) lfVar.instance;
            liVar.f134319b = ((C51535lh) axVar.mo56107c()).f134315r;
            liVar.f134318a |= 1;
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "asst.request.logging.params";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.RequestLoggingParams";
            C63088z byteString = ((C51536li) lfVar.build()).toByteString();
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
        return this.f48520a.mo60297gq();
    }
}
