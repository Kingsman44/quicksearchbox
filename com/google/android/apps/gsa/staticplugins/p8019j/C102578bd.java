package com.google.android.apps.gsa.staticplugins.p8019j;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51232ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.bd */
/* compiled from: PG */
public final class C102578bd implements C85812bd {

    /* renamed from: a */
    private final C86124t f286285a;

    public C102578bd(C86124t tVar) {
        this.f286285a = tVar;
    }

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        Bundle bundle = (Bundle) C58831av.m90830c(((Bundle) C58831av.m90830c(query.f252786y, Bundle.EMPTY)).getBundle("nga-query-extras"), Bundle.EMPTY);
        if (!this.f286285a.mo79746e(C90126fx.f251575lR) || !query.mo84364bx("nga-query-extras") || bundle.getString("nga-foreground-app") == null) {
            return C58833ax.m90834k(C52232kc.f137062d);
        }
        String g = C58837ba.m90858g(bundle.getString("nga-foreground-app"));
        long j = bundle.getLong("nga-foreground-app-version");
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
        C51232ab abVar = (C51232ab) C51233ac.f133389b.createBuilder();
        C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar2.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar2.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.params.ThirdPartyAppContextParams";
        C51577mw mwVar = (C51577mw) C51580mz.f134430h.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        evVar.f132943a |= 1;
        evVar.f132944b = g;
        esVar.copyOnWrite();
        C51058ev evVar2 = (C51058ev) esVar.instance;
        evVar2.f132943a |= 4;
        evVar2.f132946d = j;
        mwVar.copyOnWrite();
        C51580mz mzVar = (C51580mz) mwVar.instance;
        C51058ev evVar3 = (C51058ev) esVar.build();
        evVar3.getClass();
        mzVar.f134433b = evVar3;
        mzVar.f134432a = 7;
        mwVar.copyOnWrite();
        ((C51580mz) mwVar.instance).f134435d = true;
        mwVar.copyOnWrite();
        ((C51580mz) mwVar.instance).f134434c = 2;
        C63088z byteString = ((C51580mz) mwVar.build()).toByteString();
        jzVar2.copyOnWrite();
        C52230ka kaVar3 = (C52230ka) jzVar2.instance;
        byteString.getClass();
        kaVar3.f137059a |= 2;
        kaVar3.f137061c = byteString;
        zVar.mo53670b((C52230ka) jzVar2.build());
        abVar.mo53557a(zVar);
        C63088z byteString2 = ((C51233ac) abVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar4.f137059a |= 2;
        kaVar4.f137061c = byteString2;
        C52230ka kaVar5 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar5.getClass();
        kcVar2.f137066c = kaVar5;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
