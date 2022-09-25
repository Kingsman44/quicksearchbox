package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C12205b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12213j f38922a;

    public /* synthetic */ C12205b(C12213j jVar) {
        this.f38922a = jVar;
    }

    public final Object apply(Object obj) {
        C12213j jVar = this.f38922a;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            jVar.f38934d.mo22352b(C37179a.f97489bH.mo40815i(C62722b.CANCELLED));
        } else {
            ((C59052c) ((C59052c) ((C59052c) C12213j.f38931a.mo56226d()).mo56382g(th)).mo56372aa(44105)).mo56386p("Error using Fluid Actions");
            jVar.f38934d.mo22352b(C37179a.f97489bH.mo40815i(C62722b.INTERNAL));
        }
        return C58836b.f156633a;
    }
}
