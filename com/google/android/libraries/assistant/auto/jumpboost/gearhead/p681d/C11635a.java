package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d;

import com.google.android.libraries.assistant.auto.jumpboost.C11421a;
import com.google.android.libraries.assistant.auto.jumpboost.C11446b;
import com.google.android.libraries.storage.p3304a.p3312f.C42795s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4553a.C59473ax;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.a */
/* compiled from: PG */
public final /* synthetic */ class C11635a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C11636b f37588a;

    /* renamed from: b */
    public final /* synthetic */ C59473ax f37589b;

    /* renamed from: c */
    public final /* synthetic */ long f37590c;

    public /* synthetic */ C11635a(C11636b bVar, C59473ax axVar, long j) {
        this.f37588a = bVar;
        this.f37589b = axVar;
        this.f37590c = j;
    }

    public final void run() {
        C11636b bVar = this.f37588a;
        C59473ax axVar = this.f37589b;
        long j = this.f37590c;
        try {
            C11421a aVar = bVar.f37594d;
            aVar.copyOnWrite();
            C11446b bVar2 = (C11446b) aVar.instance;
            C11446b bVar3 = C11446b.f37230b;
            axVar.getClass();
            bVar2.mo19981a();
            bVar2.f37232a.add(axVar);
            while (((long) ((C11446b) bVar.f37594d.instance).f37232a.size()) > j) {
                C11421a aVar2 = bVar.f37594d;
                aVar2.copyOnWrite();
                C11446b bVar4 = (C11446b) aVar2.instance;
                bVar4.mo19981a();
                bVar4.f37232a.remove(0);
            }
            bVar.f37593c.mo45889c(bVar.f37592b, new C42795s(bVar.f37594d.build()));
            ((C59052c) ((C59052c) C11636b.f37591a.mo56224b()).mo56372aa(43393)).mo56386p("Successfully saved CarAssistant session info.");
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C11636b.f37591a.mo56225c()).mo56382g(e)).mo56372aa(43394)).mo56386p("Failed to save CarAssistant session info.");
        }
    }
}
