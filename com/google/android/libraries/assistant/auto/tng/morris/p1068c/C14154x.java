package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.x */
/* compiled from: PG */
public final /* synthetic */ class C14154x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14102ac f42900a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f42901b;

    public /* synthetic */ C14154x(C14102ac acVar, C37252a aVar) {
        this.f42900a = acVar;
        this.f42901b = aVar;
    }

    public final void run() {
        C14102ac acVar = this.f42900a;
        C37252a aVar = this.f42901b;
        if (acVar.f42779e) {
            C59104x c = C14102ac.f42775a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MessageAppFlow");
            ((C59052c) ((C59052c) c).mo56372aa(45794)).mo56387q("Attempting to log start event %s while flow is already in progress.", ((C37253b) aVar).f98999a.f98876a.f98906a);
            acVar.f42778d.ifPresent(C14155y.f42902a);
        }
        acVar.f42776b.mo19974a(aVar);
        acVar.f42779e = true;
        C14156z zVar = new C14156z(acVar, aVar);
        acVar.f42778d = Optional.m71637of(C60856cj.m92902k(C47810es.m84965e(zVar), 30000, TimeUnit.MILLISECONDS, acVar.f42777c));
    }
}
