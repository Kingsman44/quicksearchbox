package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C39626j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39633o f104308a;

    public /* synthetic */ C39626j(C39633o oVar) {
        this.f104308a = oVar;
    }

    public final Object call() {
        boolean z = this.f104308a.f104326k.get();
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        Boolean valueOf = Boolean.valueOf(z);
        ((C59052c) ((C59052c) b).mo56372aa(53506)).mo56389s("DSP hotword running %s", valueOf);
        return valueOf;
    }
}
