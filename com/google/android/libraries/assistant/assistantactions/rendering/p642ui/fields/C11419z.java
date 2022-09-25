package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52478tf;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.z */
/* compiled from: PG */
final class C11419z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ContactSelectionField f37178a;

    public C11419z(ContactSelectionField contactSelectionField) {
        this.f37178a = contactSelectionField;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ContactSelectionField.f36949a.mo56225c()).mo56372aa(43227)).mo56386p("Personal contact data couldn't be fetched");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C50969bn bnVar;
        C51016dg dgVar;
        C51016dg dgVar2;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) ContactSelectionField.f36949a.mo56225c()).mo56372aa(43228)).mo56386p("Personal contact data not present");
            return;
        }
        ContactSelectionField contactSelectionField = this.f37178a;
        adm adm = (adm) axVar.mo56107c();
        if (contactSelectionField.f37154m != null && contactSelectionField.f37153l != null) {
            contactSelectionField.mo19835s(5);
            C51941eu euVar = contactSelectionField.f37153l.f36729a;
            if (euVar.f136277e == 16) {
                bnVar = (C50969bn) euVar.f136278f;
            } else {
                bnVar = C50969bn.f132678i;
            }
            C50936ah ahVar = bnVar.f132684e;
            if (ahVar == null) {
                ahVar = C50936ah.f132593m;
            }
            if (ahVar.f132598d == 3) {
                dgVar = (C51016dg) ahVar.f132599e;
            } else {
                dgVar = C51016dg.f132827g;
            }
            if ((dgVar.f132829a & 8) != 0) {
                C50936ah ahVar2 = bnVar.f132684e;
                if (ahVar2 == null) {
                    ahVar2 = C50936ah.f132593m;
                }
                if (ahVar2.f132598d == 3) {
                    dgVar2 = (C51016dg) ahVar2.f132599e;
                } else {
                    dgVar2 = C51016dg.f132827g;
                }
                C51805du duVar = dgVar2.f132833e;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                contactSelectionField.mo19943j(C11278h.m26773c(duVar, adm));
                return;
            }
            C52478tf tfVar = (C52478tf) C52479tg.f137757d.createBuilder();
            tfVar.copyOnWrite();
            C52479tg tgVar = (C52479tg) tfVar.instance;
            adm.getClass();
            tgVar.f137760b = adm;
            tgVar.f137759a |= 1;
            contactSelectionField.mo19834r((C52479tg) tfVar.build());
            contactSelectionField.mo19941h(contactSelectionField.f37154m.mo19691a(contactSelectionField.f37153l));
        }
    }
}
