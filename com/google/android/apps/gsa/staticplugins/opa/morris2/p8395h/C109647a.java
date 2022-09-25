package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51471iy;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.assistant.p3897e.p3917i.p3918a.C51475jb;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.a */
/* compiled from: PG */
public final class C109647a implements C85812bd {

    /* renamed from: a */
    private final Context f305362a;

    /* renamed from: b */
    private final C58833ax f305363b;

    /* renamed from: c */
    private final C86124t f305364c;

    public C109647a(Context context, C58833ax axVar, C86124t tVar) {
        this.f305362a = context;
        this.f305363b = axVar;
        this.f305364c = tVar;
    }

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (!((az) ((C58847bk) this.f305363b).f156646a).l() || this.f305364c.mo79746e(C90051dc.f248842ax)) {
            return C58836b.f156633a;
        }
        ((az) ((C58847bk) this.f305363b).f156646a).a();
        C14160ab.m30482c(this.f305362a);
        C51471iy iyVar = (C51471iy) C51475jb.f134125d.createBuilder();
        C51474ja a = ((az) ((C58847bk) this.f305363b).f156646a).a();
        iyVar.copyOnWrite();
        C51475jb jbVar = (C51475jb) iyVar.instance;
        jbVar.f134128b = a.f134124v;
        jbVar.f134127a |= 1;
        boolean c = C14160ab.m30482c(this.f305362a);
        iyVar.copyOnWrite();
        C51475jb jbVar2 = (C51475jb) iyVar.instance;
        jbVar2.f134127a |= 4;
        jbVar2.f134129c = c;
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
        C63088z byteString = ((C51475jb) iyVar.build()).toByteString();
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
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
