package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.d */
/* compiled from: PG */
final class C13828d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f42125a;

    /* renamed from: b */
    final /* synthetic */ C13874e f42126b;

    public C13828d(C13874e eVar, boolean z) {
        this.f42126b = eVar;
        this.f42125a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C13874e.f42278a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChosenHandler");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44969)).mo56386p("Logging query processing info failed.");
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C51209d dVar;
        if (this.f42126b.f42279b.mo56113h()) {
            C13876g gVar = (C13876g) this.f42126b.f42279b.mo56107c();
            if (this.f42125a) {
                dVar = C51209d.SPOKEN;
            } else {
                dVar = C51209d.CLICKED_SUGGESTION;
            }
            gVar.mo20346b(obj, dVar);
        }
    }
}
