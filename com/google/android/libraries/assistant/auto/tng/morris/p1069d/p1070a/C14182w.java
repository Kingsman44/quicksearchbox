package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36602e;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36604g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36616s;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36617t;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.w */
/* compiled from: PG */
public final /* synthetic */ class C14182w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14185z f42959a;

    /* renamed from: b */
    public final /* synthetic */ C36604g f42960b;

    public /* synthetic */ C14182w(C14185z zVar, C36604g gVar) {
        this.f42959a = zVar;
        this.f42960b = gVar;
    }

    public final Object call() {
        C14185z zVar = this.f42959a;
        C36527a aVar = (C36527a) this.f42960b;
        int a = C36602e.m65133a(aVar.f95302a.f95439b);
        if (a == 0) {
            a = 1;
        }
        if (a == 5) {
            zVar.f42965c.mo21408a(C37182a.f98133gu.mo40805c(C62722b.OK));
            a = 5;
        }
        if (a == 6 || a == 7) {
            C58976aa aaVar = C58975e.f156826a;
            C14172m mVar = zVar.f42964b;
            mVar.f42931b.set(0);
            mVar.f42932c.clear();
            zVar.f42965c.mo21408a(C37182a.f98109gW.mo40805c(C62722b.OK));
            C36616s sVar = (C36616s) C36617t.f95460c.createBuilder();
            sVar.copyOnWrite();
            C36617t tVar = (C36617t) sVar.instance;
            tVar.f95463b = 1;
            tVar.f95462a |= 1;
            return (C36617t) sVar.build();
        }
        int i = 0;
        if (a == 4) {
            C58485gu guVar = aVar.f95303b;
            int size = guVar.size();
            while (i < size) {
                C14172m mVar2 = zVar.f42964b;
                String u = ((C36476g) guVar.get(i)).mo40187d().mo39565u();
                if (mVar2.f42934e.isEmpty()) {
                    C59104x d = C14172m.f42930a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Morris.MssgStoreImpl");
                    ((C59052c) ((C59052c) d).mo56372aa(45844)).mo56386p("#removeMorrisMessageNotification(): Attempting to remove message while Morris is not running");
                } else {
                    ((C14170k) mVar2.f42934e.get()).mo21508b(u);
                }
                i++;
            }
            C36616s sVar2 = (C36616s) C36617t.f95460c.createBuilder();
            sVar2.copyOnWrite();
            C36617t tVar2 = (C36617t) sVar2.instance;
            tVar2.f95463b = 1;
            tVar2.f95462a |= 1;
            return (C36617t) sVar2.build();
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(aVar.f95303b).filter(C14183x.f42961a).map(C14184y.f42962a).collect(C58370cn.f155946a);
        C59104x b = C14185z.f42963a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.NotifEventPrcssr");
        ((C59052c) ((C59052c) b).mo56372aa(45863)).mo56387q("Update %d new messages", guVar2.size());
        C14172m mVar3 = zVar.f42964b;
        int size2 = guVar2.size();
        while (i < size2) {
            BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) guVar2.get(i);
            if (!bundledMessageNotification.mo39538a().isEmpty()) {
                long andIncrement = mVar3.f42931b.getAndIncrement();
                C14177r rVar = mVar3.f42933d;
                C34837a aVar2 = (C34837a) rVar.f42944a.mo17428b();
                aVar2.getClass();
                Executor executor = (Executor) rVar.f42945b.mo17428b();
                executor.getClass();
                bundledMessageNotification.getClass();
                C14176q qVar = r8;
                C14176q qVar2 = new C14176q(aVar2, executor, andIncrement, bundledMessageNotification);
                LinkedHashMap linkedHashMap = mVar3.f42932c;
                Long valueOf = Long.valueOf(andIncrement);
                linkedHashMap.put(valueOf, qVar);
                if (mVar3.f42934e.isEmpty()) {
                    C59104x c = C14172m.f42930a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Morris.MssgStoreImpl");
                    ((C59052c) ((C59052c) c).mo56372aa(45843)).mo56386p("MorrisNotificationCallback not set");
                } else {
                    ((C14170k) mVar3.f42934e.get()).mo21507a(valueOf);
                }
            }
            i++;
        }
        C36616s sVar3 = (C36616s) C36617t.f95460c.createBuilder();
        sVar3.copyOnWrite();
        C36617t tVar3 = (C36617t) sVar3.instance;
        tVar3.f95463b = 1;
        tVar3.f95462a |= 1;
        return (C36617t) sVar3.build();
    }
}
