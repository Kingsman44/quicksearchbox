package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7607c;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97238x;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c.a */
/* compiled from: PG */
public final class C97193a extends BroadcastReceiver {

    /* renamed from: a */
    public final Context f271554a;

    /* renamed from: b */
    private final C97238x f271555b;

    public C97193a(Context context, C97238x xVar) {
        this.f271554a = context;
        this.f271555b = xVar;
    }

    /* renamed from: a */
    public final void mo90579a() {
        try {
            this.f271554a.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x004a
            java.lang.String r3 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            java.lang.String r0 = r4.getAction()
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x000f
            goto L_0x004a
        L_0x000f:
            java.lang.String r3 = "reason"
            java.lang.String r3 = r4.getStringExtra(r3)
            java.lang.String r3 = com.google.common.base.C58837ba.m90858g(r3)
            int r4 = r3.hashCode()
            r0 = 350448461(0x14e36b4d, float:2.2963465E-26)
            r1 = 1
            if (r4 == r0) goto L_0x0033
            r0 = 1092716832(0x41218920, float:10.095978)
            if (r4 == r0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            java.lang.String r4 = "homekey"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003d
            r3 = 0
            goto L_0x003e
        L_0x0033:
            java.lang.String r4 = "recentapps"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = -1
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            if (r3 == r1) goto L_0x0043
            return
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.x r3 = r2.f271555b
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah r3 = r3.f271649a
            r3.mo90526n()
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7607c.C97193a.onReceive(android.content.Context, android.content.Intent):void");
    }
}
