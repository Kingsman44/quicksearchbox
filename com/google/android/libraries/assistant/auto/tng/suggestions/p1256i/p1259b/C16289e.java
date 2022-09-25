package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.e */
/* compiled from: PG */
public final /* synthetic */ class C16289e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47946a;

    /* renamed from: b */
    public final /* synthetic */ C16090ap f47947b;

    /* renamed from: c */
    public final /* synthetic */ C15938h f47948c;

    public /* synthetic */ C16289e(C16300p pVar, C16090ap apVar, C15938h hVar) {
        this.f47946a = pVar;
        this.f47947b = apVar;
        this.f47948c = hVar;
    }

    public final Object apply(Object obj) {
        C16300p pVar = this.f47946a;
        C16090ap apVar = this.f47947b;
        C15938h hVar = this.f47948c;
        C59104x c = C16300p.f47967a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SuggestionProcessor");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(46689)).mo56386p("Failure in running generation process.");
        C37252a c2 = C37179a.f97407F.mo40805c(C62722b.ABORTED);
        ((C37253b) c2).mo40795s("displayTypeWithTrigger", C16300p.m33314c(apVar, hVar));
        ((C37215b) pVar.f47970d.mo17428b()).mo19974a(c2);
        return null;
    }
}
