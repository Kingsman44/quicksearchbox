package com.google.android.libraries.assistant.hotword;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82379d;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82406e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82514i;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.hotword.ai */
/* compiled from: PG */
final class C18336ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C18339al f51993a;

    public C18336ai(C18339al alVar) {
        this.f51993a = alVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C18339al.f51996a.mo56226d()).mo56382g(th)).mo56372aa(47240)).mo56386p("Failed to get disconnect status.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C18339al alVar = this.f51993a;
        C82379d b = C82406e.m130964b();
        C37476cy a = C37476cy.m66492a(((C37460ci) obj).f99441b);
        if (a == null) {
            a = C37476cy.UNKNOWN_DISCONNECT_REASON;
        }
        b.mo75948b(a.name());
        ((C82514i) b).f225465b = "Bisto";
        alVar.mo23803t(b.mo75947a());
    }
}
