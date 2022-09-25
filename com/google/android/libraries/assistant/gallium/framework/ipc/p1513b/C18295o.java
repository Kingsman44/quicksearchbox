package com.google.android.libraries.assistant.gallium.framework.ipc.p1513b;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65699y;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.b.o */
/* compiled from: PG */
public final class C18295o extends C18294n {

    /* renamed from: a */
    private final AtomicBoolean f51914a = new AtomicBoolean(false);

    /* renamed from: b */
    private C58833ax f51915b = C58836b.f156633a;

    private C18295o(C18231d dVar, String str, C18238f fVar, String str2, C63010eb ebVar) {
        super(dVar, str, fVar, str2, ebVar);
    }

    /* renamed from: k */
    public static C18295o m35609k(C18231d dVar, String str, C65682h hVar, String str2, C63010eb ebVar) {
        C18295o oVar = new C18295o(dVar, str, new C18238f(), str2, ebVar);
        oVar.f51915b = C58833ax.m90834k(hVar);
        super.mo23759i(hVar);
        return oVar;
    }

    /* renamed from: a */
    public final C60870cx mo23750a(C65699y yVar) {
        if (this.f51914a.getAndSet(true)) {
            return C60856cj.m92899h(C18218av.m35478a(9, "Finish was called already."));
        }
        mo23757g();
        mo23760j(yVar);
        if (!this.f51915b.mo56113h()) {
            return C60856cj.m92899h(C18218av.m35478a(9, "Finish called with no client handle."));
        }
        return mo23753c((C65682h) this.f51915b.mo56107c(), yVar);
    }

    /* renamed from: b */
    public final void mo23751b(C65699y yVar) {
        mo23760j(yVar);
    }

    public final /* bridge */ /* synthetic */ void close() {
    }
}
