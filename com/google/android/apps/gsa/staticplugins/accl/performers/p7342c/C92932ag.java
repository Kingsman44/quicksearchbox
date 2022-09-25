package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.os.Bundle;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ag */
/* compiled from: PG */
final class C92932ag {

    /* renamed from: a */
    final /* synthetic */ Bundle f259260a;

    /* renamed from: b */
    final /* synthetic */ Consumer f259261b;

    /* renamed from: c */
    final /* synthetic */ C92934ai f259262c;

    public C92932ag(C92934ai aiVar, Bundle bundle, Consumer consumer) {
        this.f259262c = aiVar;
        this.f259260a = bundle;
        this.f259261b = consumer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[SYNTHETIC, Splitter:B:14:0x003c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87485a(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x001e
            com.google.android.apps.gsa.staticplugins.accl.performers.c.ai r6 = r5.f259262c
            com.google.android.voiceinteraction.as r6 = r6.f259267d
            if (r6 == 0) goto L_0x001e
            android.os.Bundle r1 = r5.f259260a     // Catch:{ RemoteException -> 0x0010 }
            r6.mo49500k(r1)     // Catch:{ RemoteException -> 0x0010 }
            r6 = 1
            goto L_0x001f
        L_0x0010:
            r6 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.accl.performers.p7342c.C92934ai.f259264a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Failed to call IGsaVoiceInteractionService's setUiHints."
            r3 = 13263(0x33cf, float:1.8585E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r6)).mo56372aa(r3)).mo56386p(r2)
        L_0x001e:
            r6 = 0
        L_0x001f:
            j$.util.function.Consumer r1 = r5.f259261b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r1.accept(r6)
            com.google.android.apps.gsa.staticplugins.accl.performers.c.ai r6 = r5.f259262c
            boolean r1 = r6.f259268e
            if (r1 != 0) goto L_0x003c
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.accl.performers.p7342c.C92934ai.f259264a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r0 = "Service is not bound, unable to do unbinding."
            r1 = 13268(0x33d4, float:1.8592E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x003c:
            android.content.Context r1 = r6.f259266c     // Catch:{ IllegalArgumentException -> 0x0044 }
            android.content.ServiceConnection r2 = r6.f259271h     // Catch:{ IllegalArgumentException -> 0x0044 }
            r1.unbindService(r2)     // Catch:{ IllegalArgumentException -> 0x0044 }
            goto L_0x0052
        L_0x0044:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.accl.performers.p7342c.C92934ai.f259264a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "invalid serviceConnection when unbinding."
            r4 = 13267(0x33d3, float:1.8591E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x0052:
            r1 = 0
            r6.f259267d = r1
            r6.f259268e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7342c.C92932ag.mo87485a(boolean):void");
    }
}
