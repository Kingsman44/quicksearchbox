package com.google.android.gms.cast.framework.media.internal;

import android.content.Intent;
import android.support.p031v4.media.session.C0324z;
import android.view.KeyEvent;
import com.google.android.gms.cast.C143368az;
import com.google.android.gms.cast.framework.media.C143500bf;

/* renamed from: com.google.android.gms.cast.framework.media.internal.l */
/* compiled from: PG */
public final class C143519l extends C0324z {

    /* renamed from: e */
    final /* synthetic */ C143521n f389153e;

    public C143519l(C143521n nVar) {
        this.f389153e = nVar;
    }

    /* renamed from: w */
    private final void m233040w(long j) {
        C143500bf bfVar = this.f389153e.f389165k;
        if (bfVar != null) {
            m233041x(Math.min(bfVar.mo118777e(), Math.max(0, bfVar.mo118776d() + j)));
        }
    }

    /* renamed from: x */
    private final void m233041x(long j) {
        C143500bf bfVar = this.f389153e.f389165k;
        if (bfVar != null) {
            bfVar.mo118783k(new C143368az(j));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: jU */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1064jU(java.lang.String r5, android.os.Bundle r6) {
        /*
            r4 = this;
            com.google.android.gms.cast.internal.ae r6 = com.google.android.gms.cast.framework.media.internal.C143521n.f389155a
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r3 = "onCustomAction with action = %s"
            r6.mo118884b(r3, r1)
            int r6 = r5.hashCode()
            r1 = 3
            r3 = 2
            switch(r6) {
                case -1699820260: goto L_0x0035;
                case -668151673: goto L_0x002b;
                case -124479363: goto L_0x0021;
                case 1362116196: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x003f
        L_0x0017:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x003f
            r6 = 0
            goto L_0x0040
        L_0x0021:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x003f
            r6 = 3
            goto L_0x0040
        L_0x002b:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x003f
            r6 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = -1
        L_0x0040:
            if (r6 == 0) goto L_0x007b
            if (r6 == r0) goto L_0x0070
            if (r6 == r3) goto L_0x0066
            if (r6 == r1) goto L_0x005c
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            com.google.android.gms.cast.framework.media.internal.n r5 = r4.f389153e
            android.content.ComponentName r5 = r5.f389161g
            r6.setComponent(r5)
            com.google.android.gms.cast.framework.media.internal.n r5 = r4.f389153e
            android.content.Context r5 = r5.f389156b
            r5.sendBroadcast(r6)
            return
        L_0x005c:
            com.google.android.gms.cast.framework.media.internal.n r5 = r4.f389153e
            com.google.android.gms.cast.framework.ar r5 = r5.f389159e
            if (r5 == 0) goto L_0x006f
            r5.mo118624d(r2)
            return
        L_0x0066:
            com.google.android.gms.cast.framework.media.internal.n r5 = r4.f389153e
            com.google.android.gms.cast.framework.ar r5 = r5.f389159e
            if (r5 == 0) goto L_0x006f
            r5.mo118624d(r0)
        L_0x006f:
            return
        L_0x0070:
            com.google.android.gms.cast.framework.media.internal.n r5 = r4.f389153e
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r5.f389160f
            long r5 = r5.f389057e
            long r5 = -r5
            r4.m233040w(r5)
            return
        L_0x007b:
            com.google.android.gms.cast.framework.media.internal.n r5 = r4.f389153e
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r5.f389160f
            long r5 = r5.f389057e
            r4.m233040w(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.C143519l.mo1064jU(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: jW */
    public final void mo1066jW() {
        C143521n.f389155a.mo118884b("onPause", new Object[0]);
        C143500bf bfVar = this.f389153e.f389165k;
        if (bfVar != null) {
            bfVar.mo118789q();
        }
    }

    /* renamed from: jX */
    public final void mo1067jX() {
        C143521n.f389155a.mo118884b("onPlay", new Object[0]);
        C143500bf bfVar = this.f389153e.f389165k;
        if (bfVar != null) {
            bfVar.mo118789q();
        }
    }

    /* renamed from: kg */
    public final void mo1076kg(long j) {
        C143521n.f389155a.mo118884b("onSeekTo %d", Long.valueOf(j));
        m233041x(j);
    }

    /* renamed from: kk */
    public final void mo1080kk() {
        C143521n.f389155a.mo118884b("onSkipToNext", new Object[0]);
        C143500bf bfVar = this.f389153e.f389165k;
        if (bfVar != null) {
            bfVar.mo118770J();
        }
    }

    /* renamed from: kl */
    public final void mo1081kl() {
        C143521n.f389155a.mo118884b("onSkipToPrevious", new Object[0]);
        C143500bf bfVar = this.f389153e.f389165k;
        if (bfVar != null) {
            bfVar.mo118771K();
        }
    }

    /* renamed from: ko */
    public final boolean mo1084ko(Intent intent) {
        C143500bf bfVar;
        C143521n.f389155a.mo118884b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (bfVar = this.f389153e.f389165k) == null) {
            return true;
        }
        bfVar.mo118789q();
        return true;
    }
}
