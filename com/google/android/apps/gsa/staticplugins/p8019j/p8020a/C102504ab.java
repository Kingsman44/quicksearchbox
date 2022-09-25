package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85806ay;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.assistant.p3897e.p3917i.p3918a.C51478je;
import com.google.assistant.p3897e.p3917i.p3918a.C51479jf;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.protobuf.C63088z;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.ab */
/* compiled from: PG */
public final class C102504ab extends C68247h {

    /* renamed from: a */
    private final C68283d f286092a;

    /* renamed from: c */
    private final C69464a f286093c;

    public C102504ab(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3) {
        super(aVar2, new C68277d(C102504ab.class), aVar);
        this.f286092a = C68236af.m98549d(dVar);
        this.f286093c = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C86124t tVar = (C86124t) obj;
        C55876h b = ((C85806ay) C68219e.m98518a(this.f286093c).mo27525b()).mo79451b();
        C58976aa aaVar = C58975e.f156826a;
        if (b == null) {
            obj2 = C58836b.f156633a;
        } else {
            C51478je jeVar = (C51478je) C51479jf.f134133c.createBuilder();
            C63088z byteString = b.toByteString();
            jeVar.copyOnWrite();
            C51479jf jfVar = (C51479jf) jeVar.instance;
            byteString.getClass();
            jfVar.f134135a |= 1;
            jfVar.f134136b = byteString;
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "navigation_state";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.NavigationStateParams";
            C63088z byteString2 = ((C51479jf) jeVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString2.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString2;
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
        return this.f286092a.mo60297gq();
    }
}
