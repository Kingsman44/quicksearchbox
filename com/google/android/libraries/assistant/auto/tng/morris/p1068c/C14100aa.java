package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.aa */
/* compiled from: PG */
public final /* synthetic */ class C14100aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14102ac f42772a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f42773b;

    public /* synthetic */ C14100aa(C14102ac acVar, C37252a aVar) {
        this.f42772a = acVar;
        this.f42773b = aVar;
    }

    public final void run() {
        C14102ac acVar = this.f42772a;
        C37252a aVar = this.f42773b;
        acVar.f42778d.ifPresent(C14101ab.f42774a);
        acVar.f42778d = Optional.empty();
        if (!acVar.f42779e) {
            C59104x c = C14102ac.f42775a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MessageAppFlow");
            ((C59052c) ((C59052c) c).mo56372aa(45793)).mo56387q("Attempting to log end event %s while flow is not in progress.", ((C37253b) aVar).f98999a.f98876a.f98906a);
            return;
        }
        acVar.f42776b.mo19974a(aVar);
        acVar.f42779e = false;
    }
}
