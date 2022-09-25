package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52502uc;
import com.google.assistant.p3897e.p3921j.C52503ud;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bo */
/* compiled from: PG */
public final /* synthetic */ class C11382bo implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ReceiptCard f37117a;

    /* renamed from: b */
    public final /* synthetic */ C51118ha f37118b;

    public /* synthetic */ C11382bo(ReceiptCard receiptCard, C51118ha haVar) {
        this.f37117a = receiptCard;
        this.f37118b = haVar;
    }

    public final void onClick(View view) {
        ReceiptCard receiptCard = this.f37117a;
        C51118ha haVar = this.f37118b;
        if (receiptCard.f37153l != null && receiptCard.f37154m != null) {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = receiptCard.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = receiptCard.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52502uc ucVar = (C52502uc) C52503ud.f137830c.createBuilder();
            ucVar.copyOnWrite();
            C52503ud udVar = (C52503ud) ucVar.instance;
            udVar.f137832a |= 1;
            udVar.f137833b = true;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52503ud udVar2 = (C52503ud) ucVar.build();
            udVar2.getClass();
            trVar4.f137799c = udVar2;
            trVar4.f137798b = 15;
            C11295c cVar = receiptCard.f37153l;
            cVar.f36730b = (C52490tr) tpVar.build();
            C11298f a = receiptCard.f37154m.mo19691a(cVar);
            int i = haVar.f133052b;
            if (i == 4) {
                receiptCard.mo19944l((C51098gh) haVar.f133053c);
            } else if (i == 3) {
                receiptCard.mo19942i((C51016dg) haVar.f133053c, a);
            }
        }
    }
}
