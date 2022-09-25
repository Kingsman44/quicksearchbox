package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ChipComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52476td;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.u */
/* compiled from: PG */
public final /* synthetic */ class C11414u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChipCarouselField f37171a;

    /* renamed from: b */
    public final /* synthetic */ ChipComponent f37172b;

    /* renamed from: c */
    public final /* synthetic */ C50954az f37173c;

    public /* synthetic */ C11414u(ChipCarouselField chipCarouselField, ChipComponent chipComponent, C50954az azVar) {
        this.f37171a = chipCarouselField;
        this.f37172b = chipComponent;
        this.f37173c = azVar;
    }

    public final void onClick(View view) {
        ChipCarouselField chipCarouselField = this.f37171a;
        ChipComponent chipComponent = this.f37172b;
        C50954az azVar = this.f37173c;
        if (chipCarouselField.f37153l != null && chipCarouselField.f37154m != null) {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = chipCarouselField.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = chipCarouselField.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52476td tdVar = (C52476td) C52477te.f137748h.createBuilder();
            int i = chipComponent.f36826a;
            tdVar.copyOnWrite();
            C52477te teVar = (C52477te) tdVar.instance;
            teVar.f137750a |= 1;
            teVar.f137753d = (long) i;
            tdVar.copyOnWrite();
            C52477te teVar2 = (C52477te) tdVar.instance;
            teVar2.f137750a |= 2;
            teVar2.f137754e = true;
            tdVar.copyOnWrite();
            C52477te teVar3 = (C52477te) tdVar.instance;
            teVar3.f137750a |= 4;
            teVar3.f137755f = true;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52477te teVar4 = (C52477te) tdVar.build();
            teVar4.getClass();
            trVar4.f137799c = teVar4;
            trVar4.f137798b = 16;
            C11295c cVar = chipCarouselField.f37153l;
            cVar.f36730b = (C52490tr) tpVar.build();
            C11298f a = chipCarouselField.f37154m.mo19691a(cVar);
            if ((azVar.f132641a & 512) != 0) {
                C51016dg dgVar = azVar.f132648h;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                chipCarouselField.mo19942i(dgVar, a);
                return;
            }
            chipCarouselField.mo19941h(a);
        }
    }
}
