package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.content.Intent;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11304b;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.internal.common.C31921i;
import com.google.assistant.p3897e.p3921j.C52534vh;
import com.google.assistant.p3897e.p3921j.C52535vi;
import com.google.assistant.p3897e.p3921j.C52536vj;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52538vl;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.m */
/* compiled from: PG */
public final /* synthetic */ class C11325m implements C22694ag {

    /* renamed from: a */
    public final /* synthetic */ C11327o f36799a;

    public /* synthetic */ C11325m(C11327o oVar) {
        this.f36799a = oVar;
    }

    /* renamed from: a */
    public final boolean mo19746a(int i, Intent intent) {
        C11304b bVar;
        C11327o oVar = this.f36799a;
        if (i == -1) {
            if (intent != null) {
                Place b = C31921i.m59481b(intent);
                ((C59052c) ((C59052c) C11327o.f36800a.mo56224b()).mo56372aa(43296)).mo56389s("location place: %s", b);
                if (b.mo37503b() != null) {
                    String m = b.mo37516m();
                    String p = b.mo37519p();
                    LatLng b2 = b.mo37503b();
                    b2.getClass();
                    Double valueOf = Double.valueOf(b2.f392012a);
                    LatLng b3 = b.mo37503b();
                    b3.getClass();
                    bVar = new C11304b(m, p, valueOf, Double.valueOf(b3.f392013b));
                } else {
                    bVar = new C11304b(b.mo37516m(), b.mo37519p(), (Double) null, (Double) null);
                }
                C52538vl vlVar = (C52538vl) C52541vo.f137908f.createBuilder();
                C52536vj vjVar = (C52536vj) C52537vk.f137903c.createBuilder();
                String str = bVar.f36741b;
                vjVar.copyOnWrite();
                C52537vk vkVar = (C52537vk) vjVar.instance;
                str.getClass();
                vkVar.f137905a |= 1;
                vkVar.f137906b = str;
                C52537vk vkVar2 = (C52537vk) vjVar.build();
                vlVar.copyOnWrite();
                C52541vo voVar = (C52541vo) vlVar.instance;
                vkVar2.getClass();
                voVar.f137912c = vkVar2;
                voVar.f137910a |= 4;
                String str2 = bVar.f36740a;
                vlVar.copyOnWrite();
                C52541vo voVar2 = (C52541vo) vlVar.instance;
                str2.getClass();
                voVar2.f137910a |= 2;
                voVar2.f137911b = str2;
                vlVar.copyOnWrite();
                C52541vo voVar3 = (C52541vo) vlVar.instance;
                voVar3.f137914e = 1;
                voVar3.f137910a |= 16;
                if (!(bVar.f36742c == null || bVar.f36743d == null)) {
                    C52534vh vhVar = (C52534vh) C52535vi.f137898d.createBuilder();
                    Double d = bVar.f36742c;
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    vhVar.copyOnWrite();
                    C52535vi viVar = (C52535vi) vhVar.instance;
                    viVar.f137900a |= 1;
                    viVar.f137901b = doubleValue;
                    Double d2 = bVar.f36743d;
                    d2.getClass();
                    double doubleValue2 = d2.doubleValue();
                    vhVar.copyOnWrite();
                    C52535vi viVar2 = (C52535vi) vhVar.instance;
                    viVar2.f137900a = 2 | viVar2.f137900a;
                    viVar2.f137902c = doubleValue2;
                    vlVar.copyOnWrite();
                    C52541vo voVar4 = (C52541vo) vlVar.instance;
                    C52535vi viVar3 = (C52535vi) vhVar.build();
                    viVar3.getClass();
                    voVar4.f137913d = viVar3;
                    voVar4.f137910a |= 8;
                }
                oVar.f36802b.mo19759a((C52541vo) vlVar.build());
            }
        } else if (i == 2) {
            String str3 = C31921i.m59480a(intent).f389622h;
            if (str3 != null) {
                ((C59052c) ((C59052c) C11327o.f36800a.mo56226d()).mo56372aa(43298)).mo56389s("status message: %s", str3);
            } else {
                ((C59052c) ((C59052c) C11327o.f36800a.mo56226d()).mo56372aa(43297)).mo56386p("Fail to start autocomplete intent and status message is null.");
            }
        }
        return true;
    }
}
