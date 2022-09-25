package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.p5850f.C74523c;
import com.google.assistant.p3897e.p3917i.p3918a.C51514kn;
import com.google.assistant.p3897e.p3917i.p3918a.C51515ko;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.af */
/* compiled from: PG */
public final class C102508af extends C68247h {

    /* renamed from: a */
    private final C68283d f286102a;

    public C102508af(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C102508af.class), aVar);
        this.f286102a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.query.context.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.QueryContextParams";
        C51514kn knVar = (C51514kn) C51515ko.f134212e.createBuilder();
        String b = ((C74523c) axVar.mo56107c()).mo70831b();
        knVar.copyOnWrite();
        C51515ko koVar = (C51515ko) knVar.instance;
        b.getClass();
        koVar.f134214a |= 4;
        koVar.f134217d = b;
        C63088z byteString = ((C51515ko) knVar.build()).toByteString();
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
        return C60856cj.m92900i(C58833ax.m90834k((C52232kc) kbVar.build()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f286102a.mo60297gq();
    }
}
