package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.apps.auto.p450a.C8963i;
import com.google.android.apps.auto.p450a.p451a.C8915h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.C69677g;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ac */
/* compiled from: PG */
final class C11481ac implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37286a;

    /* renamed from: b */
    final /* synthetic */ C8915h f37287b;

    /* renamed from: c */
    final /* synthetic */ C8963i f37288c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f37289d;

    public C11481ac(C11485ag agVar, C8915h hVar, C8963i iVar, C60870cx cxVar) {
        this.f37286a = agVar;
        this.f37287b = hVar;
        this.f37288c = iVar;
        this.f37289d = cxVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C13054p pVar = (C13054p) obj;
        if (pVar != null) {
            int ordinal = pVar.ordinal();
            if (ordinal == 0) {
                return this.f37286a.mo20016f(this.f37287b, this.f37288c, this.f37289d);
            }
            if (ordinal == 1) {
                ((C58970a) C11485ag.f37293a.mo56225c()).mo56386p("Cannot start voice session while media rec is ongoing");
                return C60866ct.f164955a;
            } else if (ordinal == 2) {
                C58974d dVar = C11485ag.f37293a;
                C11485ag agVar = this.f37286a;
                agVar.f37311e.mo20155h(agVar.mo20015e(this.f37287b, this.f37288c, this.f37289d));
                return C60866ct.f164955a;
            } else {
                throw new C69677g();
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
