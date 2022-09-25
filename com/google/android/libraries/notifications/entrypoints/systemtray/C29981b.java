package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.content.Intent;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.impl.C29810o;
import com.google.android.libraries.notifications.entrypoints.C29965d;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import java.util.Set;

/* renamed from: com.google.android.libraries.notifications.entrypoints.systemtray.b */
/* compiled from: PG */
public final class C29981b implements C29965d {

    /* renamed from: a */
    private final C29851a f81167a;

    /* renamed from: b */
    private final C29823n f81168b;

    /* renamed from: c */
    private final Set f81169c;

    /* renamed from: d */
    private final C29810o f81170d;

    public C29981b(C29851a aVar, C29823n nVar, C29810o oVar, Set set) {
        this.f81167a = aVar;
        this.f81168b = nVar;
        this.f81170d = oVar;
        this.f81169c = set;
    }

    /* renamed from: a */
    public final int mo35260a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        if (stringExtra != null) {
            return (stringExtra.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") || stringExtra.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) ? -2 : 10;
        }
        return 10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[SYNTHETIC, Splitter:B:28:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd A[LOOP:0: B:38:0x00b7->B:40:0x00bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040 A[SYNTHETIC, Splitter:B:9:0x0040] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35261b(android.content.Intent r11, com.google.android.libraries.notifications.C30007h r12, long r13) {
        /*
            r10 = this;
            java.lang.String r12 = "com.google.android.libraries.notifications.ACCOUNT_NAME"
            java.lang.String r12 = r11.getStringExtra(r12)
            com.google.bf.b.a.a.bq r13 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29939b.m55464a(r11)
            java.lang.String r14 = "com.google.android.libraries.notifications.THREAD_ID"
            java.lang.String r14 = r11.getStringExtra(r14)
            java.lang.String r0 = "com.google.android.libraries.notifications.GROUP_ID"
            java.lang.String r0 = r11.getStringExtra(r0)
            java.lang.String r1 = "com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE"
            byte[] r1 = r11.getByteArrayExtra(r1)
            java.lang.String r2 = "IntentExtrasHelper"
            r3 = 0
            if (r1 == 0) goto L_0x0036
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x002e }
            com.google.android.libraries.notifications.g.l r5 = com.google.android.libraries.notifications.p2292g.C30004l.f81216b     // Catch:{ ct -> 0x002e }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r1, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x002e }
            com.google.android.libraries.notifications.g.l r1 = (com.google.android.libraries.notifications.p2292g.C30004l) r1     // Catch:{ ct -> 0x002e }
            goto L_0x0038
        L_0x002e:
            r1 = move-exception
            java.lang.String r4 = "Unable to parse LocalThreadState message"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r2, r1, r4, r5)
        L_0x0036:
            com.google.android.libraries.notifications.g.l r1 = com.google.android.libraries.notifications.p2292g.C30004l.f81216b
        L_0x0038:
            java.lang.String r4 = "com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION"
            byte[] r4 = r11.getByteArrayExtra(r4)
            if (r4 == 0) goto L_0x0055
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x004d }
            com.google.bf.b.a.a.d r6 = com.google.p4160bf.p4164b.p4165a.p4166a.C55568d.f146611j     // Catch:{ ct -> 0x004d }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r4, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x004d }
            com.google.bf.b.a.a.d r4 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55568d) r4     // Catch:{ ct -> 0x004d }
            goto L_0x0057
        L_0x004d:
            r4 = move-exception
            java.lang.String r5 = "Unable to parse Action message"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r2, r4, r5, r6)
        L_0x0055:
            com.google.bf.b.a.a.d r4 = com.google.p4160bf.p4164b.p4165a.p4166a.C55568d.f146611j
        L_0x0057:
            int r2 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29939b.m55471h(r11)
            r5 = 1
            if (r14 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x0069
        L_0x0063:
            if (r14 != 0) goto L_0x0068
            if (r0 == 0) goto L_0x0068
            goto L_0x0061
        L_0x0068:
            r6 = 0
        L_0x0069:
            java.lang.String r7 = "One of Thread ID or Group ID should be null"
            com.google.common.base.C58838bb.m90869d(r6, r7)
            int r6 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29939b.m55470g(r11)
            java.lang.String r7 = "com.google.android.libraries.notifications.ACTION_ID"
            java.lang.String r7 = r11.getStringExtra(r7)
            if (r7 == 0) goto L_0x0088
            java.lang.String r8 = "com.google.android.libraries.notifications.ACTION_ID:"
            boolean r9 = r7.startsWith(r8)
            if (r9 == 0) goto L_0x0088
            java.lang.String r9 = ""
            java.lang.String r7 = r7.replaceFirst(r8, r9)
        L_0x0088:
            if (r12 != 0) goto L_0x008c
            r12 = 0
            goto L_0x0092
        L_0x008c:
            com.google.android.libraries.notifications.data.n r8 = r10.f81168b     // Catch:{ m -> 0x00f5 }
            com.google.android.libraries.notifications.data.k r12 = r8.mo35088b(r12)     // Catch:{ m -> 0x00f5 }
        L_0x0092:
            if (r14 == 0) goto L_0x009f
            com.google.android.libraries.notifications.data.impl.o r0 = r10.f81170d
            java.lang.String[] r8 = new java.lang.String[r5]
            r8[r3] = r14
            com.google.common.b.gu r14 = r0.mo35113c(r12, r8)
            goto L_0x00a5
        L_0x009f:
            com.google.android.libraries.notifications.data.impl.o r14 = r10.f81170d
            com.google.common.b.gu r14 = r14.mo35112b(r12, r0)
        L_0x00a5:
            int r0 = r13.f146605b
            int r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar.m87703a(r0)
            if (r0 != 0) goto L_0x00ae
            goto L_0x00cb
        L_0x00ae:
            r3 = 5
            if (r0 != r3) goto L_0x00cb
            java.util.Set r0 = r10.f81169c
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00cb
            java.lang.Object r3 = r0.next()
            com.google.android.libraries.notifications.f.a r3 = (com.google.android.libraries.notifications.p2289f.C29987a) r3
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89842j(r14)
            r3.mo35291b(r12, r8)
            goto L_0x00b7
        L_0x00cb:
            com.google.android.libraries.notifications.e.f.a r0 = r10.f81167a
            com.google.android.libraries.notifications.b.c r3 = com.google.android.libraries.notifications.p2265b.C29780d.m54925l()
            r8 = r3
            com.google.android.libraries.notifications.b.a r8 = (com.google.android.libraries.notifications.p2265b.C29777a) r8
            r8.f80685f = r5
            r3.mo34958f(r6)
            r8.f80680a = r7
            r8.f80681b = r12
            r3.mo34974h(r14)
            r3.mo34957e(r13)
            r8.f80683d = r11
            r3.mo34956d(r1)
            r8.f80684e = r4
            r3.mo34959g(r2)
            com.google.android.libraries.notifications.b.d r11 = r3.mo34953a()
            r0.mo35177b(r11)
            return
        L_0x00f5:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r3] = r7
            java.lang.String r13 = "SystemTrayIntentHandler"
            java.lang.String r14 = "Error handling system tray action [%s]"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r13, r11, r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.systemtray.C29981b.mo35261b(android.content.Intent, com.google.android.libraries.notifications.h, long):void");
    }

    /* renamed from: c */
    public final boolean mo35262c(Intent intent) {
        return "com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction());
    }
}
