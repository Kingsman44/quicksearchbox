package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.co */
/* compiled from: PG */
final class C118025co implements C22868d {

    /* renamed from: a */
    final /* synthetic */ int f327567a;

    /* renamed from: b */
    final /* synthetic */ C118026cp f327568b;

    public C118025co(C118026cp cpVar, int i) {
        this.f327568b = cpVar;
        this.f327567a = i;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f327568b.f327569a.mo56225c()).mo56382g(th)).mo56372aa(18899)).mo56386p("Failure while getting Query with recognized text.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) this.f327568b.f327569a.mo56226d()).mo56372aa(18902)).mo56386p("Query with recognized text is not populated.");
            return;
        }
        int i = this.f327567a;
        if (i == 1) {
            ((C11897m) this.f327568b.f327570b.mo56107c()).mo20284e((Query) axVar.mo56107c());
        } else if (i != 2) {
            ((C58970a) ((C58970a) this.f327568b.f327569a.mo56225c()).mo56372aa(18901)).mo56387q("Invalid recognizerId %s for auto fulfillMode logging", this.f327567a);
        } else {
            ((C11897m) this.f327568b.f327570b.mo56107c()).mo20285f((Query) axVar.mo56107c());
        }
    }
}
