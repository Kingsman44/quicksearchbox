package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1131g.p1132a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122444ci;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122459n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p5030q.C65189ew;
import com.google.protos.p4985f.p5030q.C65190ex;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.g.a.b */
/* compiled from: PG */
public final class C15575b extends C68247h {

    /* renamed from: a */
    private final C68283d f46592a;

    /* renamed from: c */
    private final C68283d f46593c;

    public C15575b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C15575b.class), aVar);
        this.f46592a = C68236af.m98549d(dVar);
        this.f46593c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        String str = (String) list.get(0);
        C52081en enVar = (C52081en) list.get(1);
        C122459n nVar = (C122459n) C122461p.f339487e.createBuilder();
        C58976aa aaVar = C58975e.f156826a;
        if (!str.isEmpty()) {
            C122444ci ciVar = (C122444ci) C122445cj.f339450b.createBuilder();
            ciVar.copyOnWrite();
            str.getClass();
            ((C122445cj) ciVar.instance).f339452a = str;
            nVar.copyOnWrite();
            C122461p pVar = (C122461p) nVar.instance;
            C122445cj cjVar = (C122445cj) ciVar.build();
            cjVar.getClass();
            pVar.f339491c = cjVar;
            pVar.f339490b = 1;
        } else {
            C65189ew ewVar = (C65189ew) C65190ex.f176421b.createBuilder();
            ewVar.mo59349a(enVar.f136684d);
            nVar.copyOnWrite();
            C122461p pVar2 = (C122461p) nVar.instance;
            C65190ex exVar = (C65190ex) ewVar.build();
            exVar.getClass();
            pVar2.f339491c = exVar;
            pVar2.f339490b = 2;
        }
        return C60856cj.m92900i((C122461p) nVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f46592a.mo60297gq(), this.f46593c.mo60297gq());
    }
}
