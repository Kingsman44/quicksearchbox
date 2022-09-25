package com.google.android.libraries.notifications.p2294i.p2295a;

import android.content.Context;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2268e.p2269a.p2270a.C29833c;
import com.google.android.libraries.notifications.p2268e.p2281g.p2282a.C29864ac;
import com.google.android.libraries.notifications.p2268e.p2283h.C29897a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2332a.p2333a.C30139a;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.notifications.i.a.d */
/* compiled from: PG */
public final class C30021d {

    /* renamed from: a */
    public final C29823n f81241a;

    /* renamed from: b */
    private final C21370a f81242b;

    /* renamed from: c */
    private final C30075e f81243c;

    /* renamed from: d */
    private final C29897a f81244d;

    /* renamed from: e */
    private final C29864ac f81245e;

    /* renamed from: f */
    private final C29833c f81246f;

    /* renamed from: g */
    private final C30139a f81247g;

    public C30021d(C21370a aVar, C29833c cVar, C30075e eVar, C29897a aVar2, C29823n nVar, C30139a aVar3, C29864ac acVar, Context context) {
        this.f81242b = aVar;
        this.f81246f = cVar;
        this.f81243c = eVar;
        this.f81244d = aVar2;
        this.f81241a = nVar;
        this.f81247g = aVar3;
        this.f81245e = acVar;
        C30144a.m56002a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r7 = com.google.android.libraries.notifications.data.C29820k.m55110m();
        r7.mo34996b(r2);
        r7 = r7.mo34995a();
        r8 = r0.f80855a.mo35087a(r7);
        r0 = new com.google.android.libraries.notifications.data.C29787a(r7);
        r0.f80713a = java.lang.Long.valueOf(r8);
        r0 = r0.mo34995a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.notifications.C29992g mo35346a(java.lang.String r17, boolean r18, com.google.p4160bf.p4164b.p4165a.p4166a.C55540at r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r19
            java.lang.String r4 = "RegistrationHandler"
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            r5 = 1
            r0 = r0 ^ r5
            java.lang.String r6 = "Account name must not be empty."
            com.google.common.base.C58838bb.m90869d(r0, r6)
            com.google.android.libraries.notifications.platform.c.e r0 = r1.f81243c
            com.google.android.libraries.notifications.platform.c.a r0 = (com.google.android.libraries.notifications.platform.p2309c.C30071a) r0
            com.google.android.libraries.notifications.platform.c.d r0 = r0.f81357c
            r6 = 0
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.lang.String r7 = "Environment must be set on GnpConfig"
            com.google.common.base.C58838bb.m90869d(r0, r7)
            java.lang.String r0 = "GcmSenderProjectId must be set on GnpConfig"
            com.google.common.base.C58838bb.m90869d(r5, r0)
            com.google.android.libraries.notifications.platform.f.f.a.a.a r0 = r1.f81247g
            java.util.Set r0 = r0.mo35527a()     // Catch:{ a -> 0x0049 }
            boolean r0 = r0.contains(r2)     // Catch:{ a -> 0x0049 }
            if (r0 == 0) goto L_0x0036
            goto L_0x0053
        L_0x0036:
            java.lang.String r0 = "Registration failed. Provided account is not available on device."
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r4, r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r2 = "Account intended to register is not available on device."
            r0.<init>(r2)
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.m55627c(r0)
            return r0
        L_0x0049:
            r0 = move-exception
            java.lang.String r7 = "HasCorrespondingAccountOnDevice falled back to true"
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r9 = "DeviceAccountsUtilImpl"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r9, r0, r7, r8)
        L_0x0053:
            com.google.android.libraries.notifications.e.a.a.c r0 = r1.f81246f     // Catch:{ l -> 0x0136 }
            com.google.android.libraries.notifications.data.n r7 = r0.f80855a     // Catch:{ m -> 0x005c }
            com.google.android.libraries.notifications.data.k r0 = r7.mo35088b(r2)     // Catch:{ m -> 0x005c }
            goto L_0x007c
        L_0x005c:
            com.google.android.libraries.notifications.data.a r7 = com.google.android.libraries.notifications.data.C29820k.m55110m()     // Catch:{ l -> 0x0136 }
            r7.mo34996b(r2)     // Catch:{ l -> 0x0136 }
            com.google.android.libraries.notifications.data.k r7 = r7.mo34995a()     // Catch:{ l -> 0x0136 }
            com.google.android.libraries.notifications.data.n r0 = r0.f80855a     // Catch:{ l -> 0x0136 }
            long r8 = r0.mo35087a(r7)     // Catch:{ l -> 0x0136 }
            com.google.android.libraries.notifications.data.a r0 = new com.google.android.libraries.notifications.data.a     // Catch:{ l -> 0x0136 }
            r0.<init>(r7)     // Catch:{ l -> 0x0136 }
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ l -> 0x0136 }
            r0.f80713a = r7     // Catch:{ l -> 0x0136 }
            com.google.android.libraries.notifications.data.k r0 = r0.mo34995a()     // Catch:{ l -> 0x0136 }
        L_0x007c:
            if (r18 != 0) goto L_0x011e
            com.google.android.libraries.notifications.e.g.a.ac r7 = r1.f81245e     // Catch:{ b -> 0x011e }
            com.google.bf.b.a.a.aw r8 = com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw.f146565c     // Catch:{ b -> 0x011e }
            com.google.bf.b.a.bi r7 = r7.mo35182a(r0, r3, r8)     // Catch:{ b -> 0x011e }
            int r7 = com.google.android.libraries.notifications.p2294i.p2295a.C30024g.m55686c(r7)     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.f r8 = r0.mo35002b()     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.f r9 = com.google.android.libraries.notifications.C29986f.REGISTERED     // Catch:{ b -> 0x011e }
            if (r8 == r9) goto L_0x009a
            com.google.android.libraries.notifications.f r8 = r0.mo35002b()     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.f r9 = com.google.android.libraries.notifications.C29986f.PENDING_REGISTRATION     // Catch:{ b -> 0x011e }
            if (r8 != r9) goto L_0x011e
        L_0x009a:
            int r8 = r0.mo35001a()     // Catch:{ b -> 0x011e }
            r9 = 2
            if (r8 == 0) goto L_0x0108
            if (r8 == r7) goto L_0x00a4
            goto L_0x0108
        L_0x00a4:
            com.google.android.libraries.f.a r8 = r1.f81242b     // Catch:{ b -> 0x011e }
            long r10 = r8.mo26870b()     // Catch:{ b -> 0x011e }
            java.lang.Long r8 = r0.mo35005e()     // Catch:{ b -> 0x011e }
            long r12 = r8.longValue()     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.platform.c.e r8 = r1.f81243c     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.platform.c.a r8 = (com.google.android.libraries.notifications.platform.p2309c.C30071a) r8     // Catch:{ b -> 0x011e }
            java.lang.Long r8 = r8.f81360f     // Catch:{ b -> 0x011e }
            long r14 = r8.longValue()     // Catch:{ b -> 0x011e }
            r18 = r7
            r6 = 0
            long r6 = java.lang.Math.max(r6, r14)     // Catch:{ b -> 0x011e }
            long r14 = r10 - r12
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d9
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ b -> 0x011e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ b -> 0x011e }
            r7 = 0
            r8[r7] = r6     // Catch:{ b -> 0x011e }
            java.lang.String r6 = "Last registration was more than [%d] ms ago, considering this as new."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r4, r6, r8)     // Catch:{ b -> 0x011e }
            goto L_0x011e
        L_0x00d9:
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ b -> 0x011e }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ b -> 0x011e }
            r13 = 0
            r8[r13] = r12     // Catch:{ b -> 0x011e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ b -> 0x011e }
            r8[r5] = r6     // Catch:{ b -> 0x011e }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ b -> 0x011e }
            r8[r9] = r6     // Catch:{ b -> 0x011e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)     // Catch:{ b -> 0x011e }
            r7 = 3
            r8[r7] = r6     // Catch:{ b -> 0x011e }
            java.lang.String r6 = "Not treating this register request as new. The last registration was at [%d], which is less than [%d] ms ago (current time [%d]), also the request hash [%d] doesn't differ from the old one."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r4, r6, r8)     // Catch:{ b -> 0x011e }
            java.lang.String r6 = "Skip registration. Target already stored for account: %s."
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ b -> 0x011e }
            r8 = 0
            r7[r8] = r2     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r4, r6, r7)     // Catch:{ b -> 0x011e }
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.f81202a     // Catch:{ b -> 0x011e }
            return r0
        L_0x0108:
            r18 = r7
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ b -> 0x011e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)     // Catch:{ b -> 0x011e }
            r9 = 0
            r6[r9] = r7     // Catch:{ b -> 0x011e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ b -> 0x011e }
            r6[r5] = r7     // Catch:{ b -> 0x011e }
            java.lang.String r7 = "New request hash [%d] differs with old request hash [%d]."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r4, r7, r6)     // Catch:{ b -> 0x011e }
        L_0x011e:
            com.google.android.libraries.notifications.e.a.a.c r6 = r1.f81246f
            com.google.android.libraries.notifications.f r7 = com.google.android.libraries.notifications.C29986f.PENDING_REGISTRATION
            r6.mo35135a(r2, r7)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r2
            java.lang.String r2 = "Registration scheduled for account: %s."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r4, r2, r5)
            com.google.android.libraries.notifications.e.h.a r2 = r1.f81244d
            com.google.android.libraries.notifications.g r0 = r2.mo35206a(r0, r3)
            return r0
        L_0x0136:
            r0 = move-exception
            java.lang.String r2 = "Registration failed. Error inserting account."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r4, r2, r3)
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.m55627c(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2294i.p2295a.C30021d.mo35346a(java.lang.String, boolean, com.google.bf.b.a.a.at):com.google.android.libraries.notifications.g");
    }
}
