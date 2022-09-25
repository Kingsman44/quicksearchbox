package com.google.android.apps.gsa.staticplugins.opa.errorui;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.n */
/* compiled from: PG */
public final class C108993n {

    /* renamed from: a */
    private final bm f303075a;

    public C108993n(bm bmVar) {
        this.f303075a = bmVar;
    }

    /* renamed from: a */
    public final C59567w mo97354a(e eVar) {
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        C9439b bVar = C9439b.OPA_LAUNCH;
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158062c = bVar.f32835aq;
        int i = 2;
        wVar.f158060a |= 2;
        vVar.copyOnWrite();
        C59567w wVar2 = (C59567w) vVar.instance;
        wVar2.f158064e = eVar.ca;
        wVar2.f158060a |= 16;
        if (this.f303075a.u()) {
            if (this.f303075a.r()) {
                i = 3;
            } else if (this.f303075a.n()) {
                i = 4;
            } else {
                i = this.f303075a.l() ? 5 : 1;
            }
        }
        vVar.copyOnWrite();
        C59567w wVar3 = (C59567w) vVar.instance;
        wVar3.f158063d = i - 1;
        wVar3.f158060a = 4 | wVar3.f158060a;
        return (C59567w) vVar.build();
    }
}
