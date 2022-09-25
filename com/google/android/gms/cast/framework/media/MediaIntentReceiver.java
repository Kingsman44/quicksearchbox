package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.C143368az;
import com.google.android.gms.cast.framework.C143409aq;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;

/* compiled from: PG */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final C143566ae log = new C143566ae(TAG);

    private static C143500bf getRemoteMediaClient(C143466m mVar) {
        if (mVar == null || !mVar.mo118620p()) {
            return null;
        }
        return mVar.mo118720c();
    }

    private void seek(C143466m mVar, long j) {
        C143500bf remoteMediaClient;
        if (j != 0 && (remoteMediaClient = getRemoteMediaClient(mVar)) != null && !remoteMediaClient.mo118795w() && !remoteMediaClient.mo118763B()) {
            remoteMediaClient.mo118783k(new C143368az(remoteMediaClient.mo118776d() + j));
        }
    }

    private void togglePlayback(C143466m mVar) {
        C143500bf remoteMediaClient = getRemoteMediaClient(mVar);
        if (remoteMediaClient != null) {
            remoteMediaClient.mo118789q();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r1 = com.google.android.gms.cast.framework.C143429e.m232798f(r10).mo118637d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.getAction()
            com.google.android.gms.cast.internal.ae r1 = log
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "onReceive action: %s"
            r1.mo118884b(r5, r3)
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            com.google.android.gms.cast.framework.e r1 = com.google.android.gms.cast.framework.C143429e.m232798f(r10)
            com.google.android.gms.cast.framework.ar r1 = r1.mo118637d()
            com.google.android.gms.cast.framework.aq r3 = r1.mo118622b()
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            int r5 = r0.hashCode()
            switch(r5) {
                case -1699820260: goto L_0x0071;
                case -945151566: goto L_0x0067;
                case -945080078: goto L_0x005d;
                case -668151673: goto L_0x0053;
                case -124479363: goto L_0x0049;
                case 235550565: goto L_0x003f;
                case 1362116196: goto L_0x0035;
                case 1997055314: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x007b
        L_0x002b:
            java.lang.String r5 = "android.intent.action.MEDIA_BUTTON"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 7
            goto L_0x007c
        L_0x0035:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 3
            goto L_0x007c
        L_0x003f:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 0
            goto L_0x007c
        L_0x0049:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 6
            goto L_0x007c
        L_0x0053:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 5
            goto L_0x007c
        L_0x005d:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 1
            goto L_0x007c
        L_0x0071:
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x007b
            r5 = 4
            goto L_0x007c
        L_0x007b:
            r5 = -1
        L_0x007c:
            r6 = 0
            java.lang.String r8 = "googlecast-extra_skip_step_ms"
            switch(r5) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a7;
                case 2: goto L_0x00a3;
                case 3: goto L_0x009b;
                case 4: goto L_0x0093;
                case 5: goto L_0x008f;
                case 6: goto L_0x008b;
                case 7: goto L_0x0087;
                default: goto L_0x0083;
            }
        L_0x0083:
            r9.onReceiveOtherAction(r10, r0, r11)
            return
        L_0x0087:
            r9.onReceiveActionMediaButton(r3, r11)
            return
        L_0x008b:
            r1.mo118624d(r4)
            return
        L_0x008f:
            r1.mo118624d(r2)
            return
        L_0x0093:
            long r10 = r11.getLongExtra(r8, r6)
            r9.onReceiveActionRewind(r3, r10)
            return
        L_0x009b:
            long r10 = r11.getLongExtra(r8, r6)
            r9.onReceiveActionForward(r3, r10)
            return
        L_0x00a3:
            r9.onReceiveActionSkipPrev(r3)
            return
        L_0x00a7:
            r9.onReceiveActionSkipNext(r3)
            return
        L_0x00ab:
            r9.onReceiveActionTogglePlayback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaIntentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionForward(C143409aq aqVar, long j) {
        if (aqVar instanceof C143466m) {
            seek((C143466m) aqVar, j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionMediaButton(C143409aq aqVar, Intent intent) {
        if ((aqVar instanceof C143466m) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            C143919bh.m233958a(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((C143466m) aqVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionRewind(C143409aq aqVar, long j) {
        if (aqVar instanceof C143466m) {
            seek((C143466m) aqVar, -j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipNext(C143409aq aqVar) {
        C143500bf remoteMediaClient;
        if ((aqVar instanceof C143466m) && (remoteMediaClient = getRemoteMediaClient((C143466m) aqVar)) != null && !remoteMediaClient.mo118763B()) {
            remoteMediaClient.mo118770J();
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipPrev(C143409aq aqVar) {
        C143500bf remoteMediaClient;
        if ((aqVar instanceof C143466m) && (remoteMediaClient = getRemoteMediaClient((C143466m) aqVar)) != null && !remoteMediaClient.mo118763B()) {
            remoteMediaClient.mo118771K();
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionTogglePlayback(C143409aq aqVar) {
        if (aqVar instanceof C143466m) {
            togglePlayback((C143466m) aqVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction((Context) null, str, intent);
    }
}
