package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bl */
/* compiled from: PG */
public final /* synthetic */ class C39574bl implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39575bm f104157a;

    /* renamed from: b */
    public final /* synthetic */ C19243af f104158b;

    public /* synthetic */ C39574bl(C39575bm bmVar, C19243af afVar) {
        this.f104157a = bmVar;
        this.f104158b = afVar;
    }

    public final Object call() {
        C39575bm bmVar = this.f104157a;
        C19243af afVar = this.f104158b;
        if (bmVar.f104159a.f104177j.get() != C39579bq.UNINITIALIZED) {
            C59104x b = C39580br.f104168a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b).mo56372aa(53729)).mo56386p("#onStop SodaState reset to INITIALIZED");
            bmVar.f104159a.f104177j.set(C39579bq.INITIALIZED);
        } else {
            C59104x c = C39580br.f104168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) c).mo56372aa(53727)).mo56386p("#onStop SodaState should have been UNINITIALIZED!");
        }
        if (bmVar.f104159a.f104183p.mo56113h()) {
            ((C2164c) bmVar.f104159a.f104183p.mo56107c()).mo5437b((Object) null);
            bmVar.f104159a.f104183p = C58836b.f156633a;
            C59104x b2 = C39580br.f104168a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b2).mo56372aa(53728)).mo56386p("After reset sodaStopCompleter.");
        }
        C39390af afVar2 = bmVar.f104159a.f104189v;
        afVar2.getClass();
        afVar2.mo41805e(afVar);
        return null;
    }
}
