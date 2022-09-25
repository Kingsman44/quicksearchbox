package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ah */
/* compiled from: PG */
final class C92933ah implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C92934ai f259263a;

    public C92933ah(C92934ai aiVar) {
        this.f259263a = aiVar;
    }

    public final void onNullBinding(ComponentName componentName) {
        ((C59052c) ((C59052c) C92934ai.f259264a.mo56225c()).mo56372aa(13264)).mo56386p("visServiceConnection null binding.");
        C92934ai aiVar = this.f259263a;
        aiVar.f259268e = false;
        aiVar.f259267d = null;
        List<C92932ag> list = aiVar.f259270g;
        if (list != null) {
            for (C92932ag a : list) {
                a.mo87485a(false);
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C92934ai aiVar = this.f259263a;
        aiVar.f259267d = null;
        aiVar.f259268e = false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.android.apps.gsa.staticplugins.accl.performers.c.ai r3 = r2.f259263a
            if (r4 != 0) goto L_0x0006
            r4 = 0
            goto L_0x001a
        L_0x0006:
            java.lang.String r0 = "com.google.android.voiceinteraction.IGsaVoiceInteractionService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.voiceinteraction.C45390as
            if (r1 == 0) goto L_0x0014
            r4 = r0
            com.google.android.voiceinteraction.as r4 = (com.google.android.voiceinteraction.C45390as) r4
            goto L_0x001a
        L_0x0014:
            com.google.android.voiceinteraction.aq r0 = new com.google.android.voiceinteraction.aq
            r0.<init>(r4)
            r4 = r0
        L_0x001a:
            r3.f259267d = r4
            com.google.android.apps.gsa.staticplugins.accl.performers.c.ai r3 = r2.f259263a
            r4 = 1
            r3.f259268e = r4
            r4 = 0
            r3.f259269f = r4
            java.util.List r3 = r3.f259270g
            if (r3 == 0) goto L_0x0040
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r3.next()
            com.google.android.apps.gsa.staticplugins.accl.performers.c.ag r4 = (com.google.android.apps.gsa.staticplugins.accl.performers.p7342c.C92932ag) r4
            com.google.android.apps.gsa.staticplugins.accl.performers.c.ai r0 = r2.f259263a
            boolean r0 = r0.f259268e
            r4.mo87485a(r0)
            goto L_0x002c
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7342c.C92933ah.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
