package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.z */
/* compiled from: PG */
public final /* synthetic */ class C14156z implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C14102ac f42903a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f42904b;

    public /* synthetic */ C14156z(C14102ac acVar, C37252a aVar) {
        this.f42903a = acVar;
        this.f42904b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C37252a aVar;
        C14102ac acVar = this.f42903a;
        C37253b bVar = (C37253b) this.f42904b;
        if (bVar.f98999a.f98876a.f98906a == C37182a.f98132gt.f99011a.f98876a.f98906a) {
            aVar = C37182a.f98095gI.mo40805c(C62722b.DEADLINE_EXCEEDED);
        } else if (bVar.f98999a.f98876a.f98906a == C37182a.f98108gV.f99011a.f98876a.f98906a) {
            aVar = C37182a.f98110gX.mo40805c(C62722b.DEADLINE_EXCEEDED);
        } else {
            C59104x c = C14102ac.f42775a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MessageAppFlow");
            ((C59052c) ((C59052c) c).mo56372aa(45792)).mo56387q("Unable to find matching timeout event for starting event %d", bVar.f98999a.f98876a.f98906a);
            aVar = C37182a.f97768a.mo40815i(C62722b.DEADLINE_EXCEEDED);
        }
        acVar.mo21408a(aVar);
        return C60866ct.f164955a;
    }
}
