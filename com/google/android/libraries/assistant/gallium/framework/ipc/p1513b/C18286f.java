package com.google.android.libraries.assistant.gallium.framework.ipc.p1513b;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65699y;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.b.f */
/* compiled from: PG */
public final class C18286f extends C18294n {

    /* renamed from: a */
    public C60870cx f51889a;

    /* renamed from: b */
    public Runnable f51890b;

    /* renamed from: m */
    private final AtomicBoolean f51891m = new AtomicBoolean(false);

    public C18286f(C18231d dVar, C18238f fVar, C63010eb ebVar) {
        super(dVar, "ConversationStream", fVar, "type.googleapis.com/assistant.portable.PortableAssistantRequest", ebVar);
    }

    /* renamed from: a */
    public final C60870cx mo23750a(C65699y yVar) {
        if (this.f51891m.getAndSet(true)) {
            return C60856cj.m92899h(C18218av.m35478a(9, "Finish was called already."));
        }
        mo23757g();
        return C47633f.m84733g(this.f51889a).mo51516i(new C18281a(this, yVar), this.f51908h.mo23659c());
    }

    /* renamed from: b */
    public final void mo23751b(C65699y yVar) {
        mo23760j(yVar);
    }

    public final void close() {
        this.f51890b.run();
    }
}
