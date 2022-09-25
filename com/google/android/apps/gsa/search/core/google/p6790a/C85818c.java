package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.c */
/* compiled from: PG */
public final /* synthetic */ class C85818c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C85822g f232053a;

    public /* synthetic */ C85818c(C85822g gVar) {
        this.f232053a = gVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C51636z zVar;
        C85822g gVar = this.f232053a;
        String str = (String) obj;
        C58833ax[] axVarArr = new C58833ax[1];
        synchronized (gVar.f232057a) {
            C58833ax a = gVar.mo79464a();
            if (a.mo56113h() || !C58837ba.m90859h(str)) {
                if (a.mo56113h()) {
                    zVar = (C51636z) a.mo56107c();
                } else {
                    zVar = (C51636z) C51231aa.f133382f.createBuilder();
                }
                if (!C58837ba.m90859h(str)) {
                    C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                    jzVar.copyOnWrite();
                    C52230ka kaVar = (C52230ka) jzVar.instance;
                    kaVar.f137059a |= 1;
                    kaVar.f137060b = "assistant.api.params.ThirdPartyAppContextParams";
                    C51577mw mwVar = (C51577mw) C51580mz.f134430h.createBuilder();
                    mwVar.copyOnWrite();
                    C51580mz mzVar = (C51580mz) mwVar.instance;
                    str.getClass();
                    mzVar.f134432a = 5;
                    mzVar.f134433b = str;
                    mwVar.copyOnWrite();
                    ((C51580mz) mwVar.instance).f134435d = true;
                    mwVar.copyOnWrite();
                    ((C51580mz) mwVar.instance).f134434c = 1;
                    C63088z byteString = ((C51580mz) mwVar.build()).toByteString();
                    jzVar.copyOnWrite();
                    C52230ka kaVar2 = (C52230ka) jzVar.instance;
                    byteString.getClass();
                    kaVar2.f137059a |= 2;
                    kaVar2.f137061c = byteString;
                    zVar.mo53670b((C52230ka) jzVar.build());
                }
                axVar = C58833ax.m90834k((C51231aa) zVar.build());
            } else {
                axVar = C58836b.f156633a;
            }
        }
        axVarArr[0] = axVar;
        return C85822g.m137894b(axVarArr);
    }
}
