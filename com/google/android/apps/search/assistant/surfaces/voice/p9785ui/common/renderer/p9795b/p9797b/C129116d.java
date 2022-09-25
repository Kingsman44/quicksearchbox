package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.assistant.p3897e.p3902c.p3907c.C51038eb;
import com.google.assistant.p3897e.p3902c.p3907c.C51039ec;
import com.google.assistant.p3897e.p3902c.p3907c.C51040ed;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51046ej;
import com.google.assistant.p3897e.p3902c.p3907c.C51048el;
import com.google.assistant.p3897e.p3902c.p3907c.C51049em;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C129116d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C129123k f354705a;

    /* renamed from: b */
    public final /* synthetic */ C129124l f354706b;

    public /* synthetic */ C129116d(C129123k kVar, C129124l lVar) {
        this.f354705a = kVar;
        this.f354706b = lVar;
    }

    public final Object apply(Object obj) {
        C129123k kVar = this.f354705a;
        C129124l lVar = this.f354706b;
        Integer num = (Integer) obj;
        if (num.intValue() == -1) {
            return false;
        }
        C51045ei a = kVar.f354718e.mo53508a(num.intValue());
        if (a.f132915b == 6) {
            return false;
        }
        C59104x b = C129123k.f354714a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FAReadNotiAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(38215)).mo56389s("Updating MessageCard#%d to confirmation card", num);
        C51046ej ejVar = kVar.f354718e;
        int intValue = num.intValue();
        aco aco = a.f132918e;
        if (aco == null) {
            aco = aco.f134821t;
        }
        String str = lVar.f354723c;
        C51038eb ebVar = (C51038eb) C51045ei.f132912g.createBuilder();
        int i = aco.f134824b;
        ebVar.copyOnWrite();
        C51045ei eiVar = (C51045ei) ebVar.instance;
        eiVar.f132914a |= 1;
        eiVar.f132917d = i;
        ebVar.copyOnWrite();
        C51045ei eiVar2 = (C51045ei) ebVar.instance;
        aco.getClass();
        eiVar2.f132918e = aco;
        eiVar2.f132914a |= 2;
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String str2 = aco.f134828f;
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str2.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str2;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        ebVar.copyOnWrite();
        C51045ei eiVar3 = (C51045ei) ebVar.instance;
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        eiVar3.f132919f = ghVar2;
        eiVar3.f132914a |= 4;
        C51039ec ecVar = (C51039ec) C51040ed.f132896c.createBuilder();
        C51048el elVar = (C51048el) C51049em.f132927d.createBuilder();
        elVar.copyOnWrite();
        C51049em emVar = (C51049em) elVar.instance;
        emVar.f132929a |= 2;
        emVar.f132931c = "text/plain";
        elVar.copyOnWrite();
        C51049em emVar2 = (C51049em) elVar.instance;
        emVar2.f132929a |= 1;
        emVar2.f132930b = str;
        ecVar.copyOnWrite();
        C51040ed edVar = (C51040ed) ecVar.instance;
        C51049em emVar3 = (C51049em) elVar.build();
        emVar3.getClass();
        edVar.f132899b = emVar3;
        edVar.f132898a |= 1;
        ebVar.copyOnWrite();
        C51045ei eiVar4 = (C51045ei) ebVar.instance;
        C51040ed edVar2 = (C51040ed) ecVar.build();
        edVar2.getClass();
        eiVar4.f132916c = edVar2;
        eiVar4.f132915b = 6;
        ejVar.mo53509b(intValue, (C51045ei) ebVar.build());
        return true;
    }
}
