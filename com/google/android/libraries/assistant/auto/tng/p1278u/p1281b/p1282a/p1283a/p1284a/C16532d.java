package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.d */
/* compiled from: PG */
public final class C16532d extends C68247h {

    /* renamed from: a */
    private final C68283d f48521a;

    /* renamed from: c */
    private final C69464a f48522c;

    public C16532d(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3) {
        super(aVar2, new C68277d(C16532d.class), aVar);
        this.f48521a = C68236af.m98549d(dVar);
        this.f48522c = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar = (C58833ax) obj;
        C69464a aVar = this.f48522c;
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            if (((Boolean) aVar.mo17428b()).booleanValue()) {
                axVar.mo56107c();
            } else {
                ((C59052c) ((C59052c) C16493b.f48456a.mo56224b()).mo56372aa(46315)).mo56389s("AppContextParams presents: %s", axVar.mo56107c());
            }
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "app_context_params";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.AppContextParams";
            C63088z byteString = ((C51233ac) axVar.mo56107c()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
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
        return this.f48521a.mo60297gq();
    }
}
