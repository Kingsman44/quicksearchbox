package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.libraries.assistant.gallium.framework.C18217au;
import com.google.android.libraries.assistant.portable.C19053ab;
import com.google.android.libraries.assistant.portable.C19055b;
import com.google.android.libraries.assistant.portable.C19107o;
import com.google.android.libraries.assistant.portable.C19108p;
import com.google.android.libraries.assistant.portable.C19109q;
import com.google.android.libraries.assistant.portable.PopBaseCppRegistry;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.w */
/* compiled from: PG */
public final /* synthetic */ class C123133w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PortableAssistant f340799a;

    public /* synthetic */ C123133w(PortableAssistant portableAssistant) {
        this.f340799a = portableAssistant;
    }

    public final void run() {
        long j;
        PortableAssistant portableAssistant = this.f340799a;
        C19053ab abVar = new C19053ab(portableAssistant.f53432b.writeLock());
        try {
            if (!portableAssistant.f53434d) {
                portableAssistant.f53440j.ifPresent(C19109q.f53572a);
                portableAssistant.f53440j = Optional.empty();
                long j2 = portableAssistant.f53433c;
                if (j2 != 0) {
                    PortableAssistant.nativeDestroy(j2);
                    portableAssistant.f53433c = 0;
                }
                j = 0;
            } else {
                C18217au auVar = portableAssistant.f53435e;
                if (auVar != null) {
                    auVar.close();
                    portableAssistant.f53435e = null;
                }
                long j3 = portableAssistant.f53436f;
                if (j3 != 0) {
                    PopBaseCppRegistry.nativeDestroyInterfaceRegistry(j3);
                    portableAssistant.f53436f = 0;
                }
                j = portableAssistant.f53433c;
                portableAssistant.f53433c = 0;
            }
            abVar.close();
            if (portableAssistant.f53434d && j != 0) {
                try {
                    C58528ij F = C58528ij.m90006F(portableAssistant.f53438h.values());
                    C47638k.m84750a((Iterable) Collection.EL.stream(F).map(C19107o.f53570a).collect(C58370cn.f155947b)).mo51522c(new C19108p(F), portableAssistant.f53437g).get();
                    synchronized (portableAssistant.f53439i) {
                        while (portableAssistant.f53439i.get() > 0) {
                            portableAssistant.f53439i.wait();
                        }
                    }
                    PortableAssistant.nativeDestroy(j);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    C59104x c = PortableAssistant.f53431a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "POP");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(47529)).mo56386p("Exception while waiting for streams to close and all requests to complete. Not shutting down POP.");
                    return;
                }
            } else {
                return;
            }
        } catch (Throwable th) {
            C19055b.m36519a(th, th);
        }
        throw th;
    }
}
