package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.view.KeyEvent;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96457ao;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4526f.C59071e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.dx */
/* compiled from: PG */
final class C95427dx implements InvocationHandler, C95410dg {

    /* renamed from: c */
    private static final C59071e f267009c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.dx");

    /* renamed from: a */
    public final C95397cu f267010a;

    /* renamed from: b */
    public final C95411dh f267011b;

    /* renamed from: d */
    private final boolean f267012d;

    /* renamed from: e */
    private final C96457ao f267013e;

    /* renamed from: f */
    private final C95403d f267014f;

    /* renamed from: g */
    private boolean f267015g;

    public C95427dx(C95397cu cuVar, C96457ao aoVar, C95411dh dhVar, boolean z, C95403d dVar) {
        this.f267012d = z;
        this.f267010a = cuVar;
        this.f267013e = aoVar;
        this.f267014f = dVar;
        this.f267011b = dhVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89350a(com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj r9) {
        /*
            r8 = this;
            com.google.common.f.e r0 = f267009c
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "WiredHeadsetInputRtr"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Got new gesture %s"
            r2 = 15055(0x3acf, float:2.1097E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r9)
            boolean r0 = r8.f267015g
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_SINGLE_TAP
            if (r9 != r0) goto L_0x0020
            r8.f267015g = r1
            goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_SINGLE_TAP
            r2 = 2
            r3 = 1
            if (r9 != r0) goto L_0x003c
            boolean r0 = r8.f267012d
            if (r0 != 0) goto L_0x002c
            goto L_0x003c
        L_0x002c:
            com.google.android.apps.gsa.staticplugins.bisto.g.d r9 = r8.f267014f
            com.google.android.d.ck[] r0 = new com.google.android.p10712d.C142359ck[r2]
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.WILL_PAUSE
            r0[r1] = r2
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PREPARE_VOICE_INPUT
            r0[r3] = r1
            r9.mo89344a(r0)
            return
        L_0x003c:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.SINGLE_TAP
            r4 = 3
            r5 = 4
            if (r9 != r0) goto L_0x005a
            com.google.android.apps.gsa.staticplugins.bisto.g.d r9 = r8.f267014f
            com.google.android.d.ck[] r0 = new com.google.android.p10712d.C142359ck[r5]
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            r0[r1] = r5
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.CALL_ANSWER
            r0[r3] = r1
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.CALL_HANGUP
            r0[r2] = r1
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            r0[r4] = r1
            r9.mo89344a(r0)
            return
        L_0x005a:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.DOUBLE_TAP
            if (r9 != r0) goto L_0x0076
            com.google.android.apps.gsa.staticplugins.bisto.g.d r9 = r8.f267014f
            com.google.android.d.ck[] r0 = new com.google.android.p10712d.C142359ck[r5]
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            r0[r1] = r5
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.SKIP_CURRENT_ANNOUNCEMENT
            r0[r3] = r1
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.CALL_HANGUP
            r0[r2] = r1
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.CALL_REJECT
            r0[r4] = r1
            r9.mo89344a(r0)
            return
        L_0x0076:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.TRIPLE_TAP
            if (r9 != r0) goto L_0x0086
            com.google.android.apps.gsa.staticplugins.bisto.g.d r9 = r8.f267014f
            com.google.android.d.ck[] r0 = new com.google.android.p10712d.C142359ck[r3]
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PREV_TRACK
            r0[r1] = r2
            r9.mo89344a(r0)
            return
        L_0x0086:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_LONG_PRESS
            if (r9 != r0) goto L_0x0134
            com.google.android.apps.gsa.staticplugins.bisto.util.ao r9 = r8.f267013e
            com.google.android.apps.gsa.search.core.aj.aa r0 = r9.f269848c
            android.app.KeyguardManager r0 = r0.f230023b
            boolean r0 = r0.isDeviceLocked()
            if (r0 == 0) goto L_0x00bc
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r6 = "android.speech.action.VOICE_SEARCH_HANDS_FREE"
            r0.<init>(r6)
            com.google.android.apps.gsa.search.core.aj.aa r6 = r9.f269848c
            boolean r6 = r6.mo78228b()
            if (r6 == 0) goto L_0x00b5
            com.google.android.apps.gsa.search.core.aj.aa r6 = r9.f269848c
            com.google.android.apps.gsa.shared.s.a.a r7 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.app.KeyguardManager r6 = r6.f230023b     // Catch:{ all -> 0x00b3 }
            boolean r6 = r6.isKeyguardSecure()     // Catch:{ all -> 0x00b3 }
            if (r6 == 0) goto L_0x00b5
            r6 = 1
            goto L_0x00b6
        L_0x00b3:
            r9 = move-exception
            throw r9
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            java.lang.String r7 = "android.speech.extras.EXTRA_SECURE"
            r0.putExtra(r7, r6)
            goto L_0x00c8
        L_0x00bc:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r6 = "android.speech.action.WEB_SEARCH"
            r0.<init>(r6)
            r6 = 276824064(0x10800000, float:5.0487098E-29)
            r0.setFlags(r6)
        L_0x00c8:
            com.google.android.apps.gsa.shared.s.a.a r6 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.content.Context r6 = r9.f269846a     // Catch:{ all -> 0x0132 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0132 }
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r0, r1)     // Catch:{ all -> 0x0132 }
            if (r6 != 0) goto L_0x00d8
        L_0x00d6:
            r4 = 1
            goto L_0x010a
        L_0x00d8:
            android.content.pm.ActivityInfo r7 = r6.activityInfo
            if (r7 == 0) goto L_0x00e1
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.packageName
            goto L_0x00f2
        L_0x00e1:
            android.content.pm.ServiceInfo r7 = r6.serviceInfo
            if (r7 == 0) goto L_0x00ea
            android.content.pm.ServiceInfo r6 = r6.serviceInfo
            java.lang.String r6 = r6.packageName
            goto L_0x00f2
        L_0x00ea:
            android.content.pm.ProviderInfo r7 = r6.providerInfo
            if (r7 == 0) goto L_0x00d6
            android.content.pm.ProviderInfo r6 = r6.providerInfo
            java.lang.String r6 = r6.packageName
        L_0x00f2:
            java.lang.String r7 = "android"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00fc
            r4 = 2
            goto L_0x010a
        L_0x00fc:
            android.content.Context r7 = r9.f269846a
            java.lang.String r7 = r7.getPackageName()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r4 = 4
        L_0x010a:
            if (r4 != r5) goto L_0x0112
            com.google.android.apps.gsa.staticplugins.bisto.r.d r9 = r9.f269847b
            r9.mo89823a(r0)
            goto L_0x0123
        L_0x0112:
            if (r4 != r2) goto L_0x0126
            com.google.android.apps.gsa.search.core.aj.aa r2 = r9.f269848c
            android.app.KeyguardManager r2 = r2.f230023b
            boolean r2 = r2.isDeviceLocked()
            if (r2 != 0) goto L_0x0126
            com.google.android.apps.gsa.staticplugins.bisto.r.d r9 = r9.f269847b
            r9.mo89823a(r0)
        L_0x0123:
            r8.f267015g = r3
            return
        L_0x0126:
            com.google.android.apps.gsa.staticplugins.bisto.g.d r9 = r8.f267014f
            com.google.android.d.ck[] r0 = new com.google.android.p10712d.C142359ck[r3]
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PREPARE_VOICE_INPUT
            r0[r1] = r2
            r9.mo89344a(r0)
            return
        L_0x0132:
            r9 = move-exception
            throw r9
        L_0x0134:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.LONG_PRESS
            if (r9 != r0) goto L_0x013c
            r8.mo89359b()
            return
        L_0x013c:
            com.google.android.apps.gsa.staticplugins.bisto.g.dj r0 = com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95413dj.INCOMPLETE_LONGER_PRESS
            if (r9 != r0) goto L_0x014f
            com.google.android.apps.gsa.staticplugins.bisto.g.d r9 = r8.f267014f
            com.google.android.d.ck[] r0 = new com.google.android.p10712d.C142359ck[r2]
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            r0[r1] = r2
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            r0[r3] = r1
            r9.mo89344a(r0)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95427dx.mo89350a(com.google.android.apps.gsa.staticplugins.bisto.g.dj):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo89359b() {
        C142359ck ckVar;
        C95403d dVar = this.f267014f;
        C142359ck[] ckVarArr = new C142359ck[1];
        if (this.f267012d) {
            ckVar = C142359ck.PERFORM_VOICE_INPUT;
        } else {
            ckVar = C142359ck.START_ENDPOINTING_VOICE_INPUT;
        }
        ckVarArr[0] = ckVar;
        dVar.mo89344a(ckVarArr);
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr.length > 0) {
            boolean z = false;
            KeyEvent keyEvent = objArr[0];
            if (keyEvent instanceof KeyEvent) {
                KeyEvent keyEvent2 = keyEvent;
                if (method.getName().equals("onMediaKey")) {
                    if ((keyEvent2.getKeyCode() == 79 || keyEvent2.getKeyCode() == 85) && (keyEvent2.getFlags() & 1073741824) != 1073741824) {
                        C95411dh dhVar = this.f267011b;
                        dhVar.f266946b.mo28212l("update-gesture", new C95408de(dhVar, keyEvent2));
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }
}
