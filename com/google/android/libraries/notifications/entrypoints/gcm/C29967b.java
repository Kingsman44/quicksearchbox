package com.google.android.libraries.notifications.entrypoints.gcm;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.notifications.C29986f;
import com.google.android.libraries.notifications.data.C29795i;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29828s;
import com.google.android.libraries.notifications.entrypoints.C29965d;
import com.google.android.libraries.notifications.p2268e.p2269a.p2270a.C29831a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import com.google.android.libraries.notifications.p2268e.p2285i.p2286a.C29932c;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.p2294i.p2295a.C30019b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2307a.C30060d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.C55661cq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55588x;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55590z;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.libraries.notifications.entrypoints.gcm.b */
/* compiled from: PG */
public final class C29967b implements C29965d {

    /* renamed from: a */
    private static final Set f81130a = EnumSet.of(C29986f.REGISTERED, C29986f.PENDING_REGISTRATION, C29986f.FAILED_REGISTRATION);

    /* renamed from: b */
    private final C29970e f81131b;

    /* renamed from: c */
    private final C29851a f81132c;

    /* renamed from: d */
    private final C29823n f81133d;

    /* renamed from: e */
    private final C29831a f81134e;

    /* renamed from: f */
    private final C29959j f81135f;

    /* renamed from: g */
    private final C68214a f81136g;

    /* renamed from: h */
    private final C30060d f81137h;

    /* renamed from: i */
    private final C21370a f81138i;

    /* renamed from: j */
    private final Lock f81139j;

    /* renamed from: k */
    private final C29932c f81140k;

    /* renamed from: l */
    private final C30019b f81141l;

    /* renamed from: m */
    private final C29835a f81142m;

    public C29967b(C29970e eVar, C29851a aVar, C29932c cVar, C29835a aVar2, C30019b bVar, C29823n nVar, C29831a aVar3, C29959j jVar, C68214a aVar4, C30060d dVar, C21370a aVar5, Lock lock) {
        this.f81131b = eVar;
        this.f81132c = aVar;
        this.f81140k = cVar;
        this.f81142m = aVar2;
        this.f81141l = bVar;
        this.f81133d = nVar;
        this.f81134e = aVar3;
        this.f81135f = jVar;
        this.f81136g = aVar4;
        this.f81137h = dVar;
        this.f81138i = aVar5;
        this.f81139j = lock;
    }

    /* renamed from: d */
    private static C29828s m55550d(C55661cq cqVar, C55564bq bqVar) {
        C29795i i = C29828s.m55170i();
        i.mo35079e(cqVar.f146871b);
        i.mo35077c(Long.valueOf(cqVar.f146872c));
        int a = C55538ar.m87703a(bqVar.f146605b);
        int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        i.mo35082h(a);
        int a2 = C55590z.m87714a(bqVar.f146606c);
        if (a2 == 0) {
            a2 = 1;
        }
        i.mo35081g(a2);
        int a3 = C55560bm.m87708a(bqVar.f146608e);
        if (a3 == 0) {
            a3 = 1;
        }
        i.mo35083i(a3);
        int a4 = C55588x.m87713a(bqVar.f146607d);
        if (a4 != 0) {
            i2 = a4;
        }
        i.mo35080f(i2);
        return i.mo35075a();
    }

    /* renamed from: e */
    private final void m55551e(C29820k kVar, C29969d dVar, List list) {
        if (!list.isEmpty()) {
            C29834a a = this.f81142m.mo35159a(C55489bz.DELIVERED_UPDATE_THREAD_INSTRUCTION);
            a.mo35145j(kVar);
            a.mo35152q(list);
            a.mo35144i(dVar.mo35273g());
            a.mo35136a();
            List d = this.f81135f.mo35249d(kVar, list, 8);
            if (!d.isEmpty()) {
                C29834a a2 = this.f81142m.mo35159a(C55489bz.DISMISSED_REMOTE);
                a2.mo35145j(kVar);
                a2.mo35140e(d);
                a2.mo35144i(dVar.mo35273g());
                a2.mo35136a();
            }
        }
    }

    /* renamed from: f */
    private static boolean m55552f(C55564bq bqVar) {
        int a = C55590z.m87714a(bqVar.f146606c);
        if (a != 0 && a == 3) {
            return true;
        }
        int a2 = C55560bm.m87708a(bqVar.f146608e);
        return a2 != 0 && a2 == 3;
    }

    /* renamed from: g */
    private final void m55553g() {
        for (C29987a h : (Set) this.f81136g.mo27525b()) {
            h.mo35297h();
        }
    }

    /* renamed from: h */
    private static void m55554h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C55661cq) it.next()).f146871b);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ int mo35260a(Intent intent) {
        return 10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: com.google.android.libraries.notifications.data.k} */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01eb, code lost:
        if (r7.f146521c.isEmpty() != false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020a, code lost:
        if (r7 == 5) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0212, code lost:
        if (r12.f146625b.isEmpty() == false) goto L_0x0214;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35261b(android.content.Intent r26, com.google.android.libraries.notifications.C30007h r27, long r28) {
        /*
            r25 = this;
            r1 = r25
            com.google.android.libraries.notifications.entrypoints.gcm.d r2 = com.google.android.libraries.notifications.entrypoints.gcm.C29969d.m55559f(r26)
            com.google.android.libraries.f.a r0 = r1.f81138i
            long r3 = r0.mo26871c()
            com.google.android.libraries.notifications.e.b.a.a r0 = r1.f81142m
            com.google.bf.a.b.bz r5 = com.google.p4160bf.p4161a.p4163b.C55489bz.DELIVERED_FCM_PUSH
            com.google.android.libraries.notifications.e.b.a r0 = r0.mo35159a(r5)
            com.google.bf.a.b.ae r5 = r2.mo35273g()
            r0.mo35144i(r5)
            r5 = r28
            r0.mo35150o(r5)
            r0.mo35136a()
            r0 = r2
            com.google.android.libraries.notifications.entrypoints.gcm.a r0 = (com.google.android.libraries.notifications.entrypoints.gcm.C29966a) r0
            int r7 = r0.f81126b
            int r7 = r7 + -1
            r8 = 0
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L_0x005f
            if (r7 == r10) goto L_0x005f
            if (r7 == r9) goto L_0x0035
            goto L_0x051c
        L_0x0035:
            com.google.android.libraries.notifications.data.n r0 = r1.f81133d
            java.util.List r0 = r0.mo35089c()
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x051c
            java.lang.Object r2 = r0.next()
            com.google.android.libraries.notifications.data.k r2 = (com.google.android.libraries.notifications.data.C29820k) r2
            java.util.Set r3 = f81130a
            com.google.android.libraries.notifications.f r4 = r2.mo35002b()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x003f
            com.google.android.libraries.notifications.e.i.a.c r3 = r1.f81140k
            com.google.bf.b.a.a.ab r4 = com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab.REMOTE_DELETED_MESSAGES
            r3.mo35221a(r2, r8, r4)
            goto L_0x003f
        L_0x005f:
            java.lang.String r0 = r0.f81125a
            java.lang.String r7 = "PayloadUtil"
            r11 = 0
            if (r0 != 0) goto L_0x0068
        L_0x0066:
            r12 = r8
            goto L_0x008c
        L_0x0068:
            byte[] r0 = android.util.Base64.decode(r0, r10)     // Catch:{ IllegalArgumentException -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Failed to decode payload string into bytes."
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r7, r12, r0, r13)
            r0 = r8
        L_0x0077:
            if (r0 == 0) goto L_0x0066
            com.google.bf.b.a.a.f r12 = com.google.p4160bf.p4164b.p4165a.p4166a.C55570f.f146622e     // Catch:{ ct -> 0x0083 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r12, (byte[]) r0)     // Catch:{ ct -> 0x0083 }
            com.google.bf.b.a.a.f r0 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55570f) r0     // Catch:{ ct -> 0x0083 }
            r12 = r0
            goto L_0x008c
        L_0x0083:
            r0 = move-exception
            java.lang.String r12 = "Failed to parse AndroidPayload proto."
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r7, r0, r12, r13)
            goto L_0x0066
        L_0x008c:
            r13 = 3
            java.lang.String r14 = "GcmIntentHandler"
            if (r12 != 0) goto L_0x00a9
            java.lang.String r0 = "AndroidPayload is null."
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r3)
            com.google.android.libraries.notifications.e.b.a.a r0 = r1.f81142m
            com.google.android.libraries.notifications.e.b.a r0 = r0.mo35160b(r13)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r0.mo35144i(r2)
            r0.mo35136a()
            return
        L_0x00a9:
            com.google.android.libraries.notifications.entrypoints.gcm.e r15 = r1.f81131b
            java.lang.String r8 = r12.f146625b
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0160
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.android.libraries.notifications.data.n r0 = r15.f81143a
            java.util.List r0 = r0.mo35089c()
            java.util.Iterator r16 = r0.iterator()
        L_0x00c2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r16.next()
            r17 = r0
            com.google.android.libraries.notifications.data.k r17 = (com.google.android.libraries.notifications.data.C29820k) r17
            java.lang.Long r0 = r17.mo35004d()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.add(r0)
            java.lang.String r0 = r17.mo35012j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = r17.mo35009h()
            com.google.android.libraries.notifications.platform.f.a.a.g r13 = r15.f81144b     // Catch:{ Exception -> 0x0103 }
            java.lang.String r0 = r13.mo35498c(r0)     // Catch:{ Exception -> 0x0103 }
            boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0103 }
            if (r13 == 0) goto L_0x0112
            java.lang.String r0 = "AuthUtil returned empty obfuscated account ID for account with ID [%s]."
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0103 }
            java.lang.Long r18 = r17.mo35004d()     // Catch:{ Exception -> 0x0103 }
            r13[r11] = r18     // Catch:{ Exception -> 0x0103 }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r7, r0, r13)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0111
        L_0x0103:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Long r18 = r17.mo35004d()
            r13[r11] = r18
            java.lang.String r10 = "Failed to get the obfuscated account ID for account with ID [%s]."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r7, r0, r10, r13)
        L_0x0111:
            r0 = 0
        L_0x0112:
            if (r0 == 0) goto L_0x0125
            com.google.android.libraries.notifications.data.a r10 = r17.mo35014l()
            r10.f80714b = r0
            com.google.android.libraries.notifications.data.k r0 = r10.mo34995a()
            com.google.android.libraries.notifications.data.n r10 = r15.f81143a
            r10.mo35091e(r0)
            r17 = r0
        L_0x0125:
            java.lang.String r0 = r17.mo35012j()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0132
            r0 = r17
            goto L_0x0161
        L_0x0132:
            r10 = 1
            r13 = 3
            goto L_0x00c2
        L_0x0135:
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x0143
            java.lang.String r8 = "None"
            goto L_0x0149
        L_0x0143:
            java.lang.String r8 = ", "
            java.lang.String r8 = android.text.TextUtils.join(r8, r9)
        L_0x0149:
            r10 = 1
            r0[r10] = r8
            int r8 = r9.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.frameworks.client.a.a.b r8 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r8)
            r9 = 2
            r0[r9] = r8
            java.lang.String r8 = "The recipient [%s] is not found in SDK's storage. Accounts IDs found: [%s] (%s)"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r7, r8, r0)
        L_0x0160:
            r0 = 0
        L_0x0161:
            java.lang.String r7 = r12.f146625b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x018c
            if (r0 != 0) goto L_0x018c
            com.google.android.libraries.notifications.e.b.a.a r0 = r1.f81142m
            r3 = 10
            com.google.android.libraries.notifications.e.b.a r0 = r0.mo35160b(r3)
            java.lang.String r3 = r12.f146625b
            r0.mo35148m(r3)
            com.google.bf.b.a.a.af r3 = r12.f146626c
            if (r3 != 0) goto L_0x017e
            com.google.bf.b.a.a.af r3 = com.google.p4160bf.p4164b.p4165a.p4166a.C55526af.f146517o
        L_0x017e:
            r0.mo35146k(r3)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r0.mo35144i(r2)
            r0.mo35136a()
            return
        L_0x018c:
            if (r0 == 0) goto L_0x01d8
            java.util.Set r7 = f81130a
            com.google.android.libraries.notifications.f r8 = r0.mo35002b()
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x01d8
            com.google.android.libraries.notifications.e.b.a.a r3 = r1.f81142m
            r4 = 11
            com.google.android.libraries.notifications.e.b.a r3 = r3.mo35160b(r4)
            java.lang.String r4 = r12.f146625b
            r3.mo35148m(r4)
            com.google.bf.b.a.a.af r4 = r12.f146626c
            if (r4 != 0) goto L_0x01ad
            com.google.bf.b.a.a.af r4 = com.google.p4160bf.p4164b.p4165a.p4166a.C55526af.f146517o
        L_0x01ad:
            r3.mo35146k(r4)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r3.mo35144i(r2)
            r3.mo35136a()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = r0.mo35004d()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2[r11] = r3
            com.google.android.libraries.notifications.f r0 = r0.mo35002b()
            java.lang.String r0 = r0.name()
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "Recipient with account ID [%s] not registered, cannot receive notifications. Registration status: [%s]."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r2)
            return
        L_0x01d8:
            int r7 = r12.f146624a
            r8 = r7 & 2
            r9 = 4
            if (r8 == 0) goto L_0x01ef
            com.google.bf.b.a.a.af r7 = r12.f146626c
            if (r7 != 0) goto L_0x01e5
            com.google.bf.b.a.a.af r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55526af.f146517o
        L_0x01e5:
            java.lang.String r7 = r7.f146521c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0214
            goto L_0x051d
        L_0x01ef:
            r7 = r7 & r9
            if (r7 == 0) goto L_0x051d
            com.google.bf.b.a.a.bk r7 = r12.f146627d
            if (r7 != 0) goto L_0x01f8
            com.google.bf.b.a.a.bk r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55558bk.f146588d
        L_0x01f8:
            int r7 = r7.f146590a
            int r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55553bf.m87707a(r7)
            if (r7 != 0) goto L_0x0201
            r7 = 1
        L_0x0201:
            r8 = 2
            if (r7 == r8) goto L_0x020c
            r8 = 3
            if (r7 == r8) goto L_0x020c
            if (r7 == r9) goto L_0x0214
            r8 = 5
            if (r7 != r8) goto L_0x051d
        L_0x020c:
            java.lang.String r7 = r12.f146625b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x051d
        L_0x0214:
            int r7 = r12.f146624a
            r8 = r7 & 2
            if (r8 == 0) goto L_0x0269
            com.google.android.libraries.notifications.e.b.c r7 = new com.google.android.libraries.notifications.e.b.c
            java.lang.Long r5 = java.lang.Long.valueOf(r28)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.google.bf.a.b.an r4 = com.google.p4160bf.p4161a.p4163b.C55450an.DELIVERED_FCM_PUSH
            r7.<init>(r5, r3, r4)
            com.google.android.libraries.notifications.e.b.a.a r3 = r1.f81142m
            com.google.bf.a.b.bz r4 = com.google.p4160bf.p4161a.p4163b.C55489bz.DELIVERED
            com.google.android.libraries.notifications.e.b.a r3 = r3.mo35159a(r4)
            r3.mo35145j(r0)
            com.google.bf.b.a.a.af r4 = r12.f146626c
            if (r4 != 0) goto L_0x023a
            com.google.bf.b.a.a.af r4 = com.google.p4160bf.p4164b.p4165a.p4166a.C55526af.f146517o
        L_0x023a:
            r3.mo35146k(r4)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r3.mo35144i(r2)
            r3.mo35151p(r7)
            r3.mo35136a()
            com.google.android.libraries.notifications.e.f.a r2 = r1.f81132c
            r3 = 1
            com.google.bf.b.a.a.af[] r3 = new com.google.p4160bf.p4164b.p4165a.p4166a.C55526af[r3]
            com.google.bf.b.a.a.af r4 = r12.f146626c
            if (r4 != 0) goto L_0x0255
            com.google.bf.b.a.a.af r4 = com.google.p4160bf.p4164b.p4165a.p4166a.C55526af.f146517o
        L_0x0255:
            r3[r11] = r4
            java.util.List r21 = java.util.Arrays.asList(r3)
            r24 = 0
            r19 = r2
            r20 = r0
            r22 = r27
            r23 = r7
            r19.mo35176a(r20, r21, r22, r23, r24)
            return
        L_0x0269:
            r3 = r7 & 4
            if (r3 == 0) goto L_0x051c
            com.google.bf.b.a.a.bk r3 = r12.f146627d
            if (r3 != 0) goto L_0x0273
            com.google.bf.b.a.a.bk r3 = com.google.p4160bf.p4164b.p4165a.p4166a.C55558bk.f146588d
        L_0x0273:
            int r4 = r3.f146590a
            int r10 = com.google.p4160bf.p4164b.p4165a.p4166a.C55553bf.m87707a(r4)
            if (r10 != 0) goto L_0x027c
            r10 = 1
        L_0x027c:
            int r10 = r10 + -1
            r4 = 1
            if (r10 == r4) goto L_0x04e9
            r5 = 2
            if (r10 == r5) goto L_0x04bb
            r5 = 3
            if (r10 == r5) goto L_0x04ac
            if (r10 == r9) goto L_0x02b6
            r3 = 6
            if (r10 == r3) goto L_0x0294
            java.lang.String r0 = "Unknown sync instruction."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r2)
            return
        L_0x0294:
            com.google.android.libraries.notifications.e.b.a.a r3 = r1.f81142m
            com.google.bf.a.b.bz r4 = com.google.p4160bf.p4161a.p4163b.C55489bz.DELIVERED_REMOVE_STORAGE_INSTRUCTION
            com.google.android.libraries.notifications.e.b.a r3 = r3.mo35159a(r4)
            r3.mo35145j(r0)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r3.mo35144i(r2)
            r3.mo35136a()
            java.lang.String r2 = "Clear all data associated with the account."
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r14, r2, r3)
            com.google.android.libraries.notifications.e.a.a.a r2 = r1.f81134e
            r2.mo35134a(r0, r11)
            return
        L_0x02b6:
            if (r0 != 0) goto L_0x02c0
            java.lang.String r0 = "Payload with UPDATE_THREAD instruction must have an account"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r2)
            return
        L_0x02c0:
            java.lang.String r5 = "Payload has UPDATE_THREAD_STATE instruction."
            java.lang.Object[] r6 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r14, r5, r6)
            com.google.bf.b.a.a.bj r3 = r3.f146592c
            if (r3 != 0) goto L_0x02cd
            com.google.bf.b.a.a.bj r3 = com.google.p4160bf.p4164b.p4165a.p4166a.C55557bj.f146585b
        L_0x02cd:
            boolean r5 = r27.mo35312f()
            if (r5 != 0) goto L_0x02f3
            java.util.concurrent.locks.Lock r4 = r1.f81139j     // Catch:{ InterruptedException -> 0x02f1 }
            long r5 = r27.mo35310c()     // Catch:{ InterruptedException -> 0x02f1 }
            e.a.a.o.a.p r7 = p5304e.p5305a.p5306a.p5409o.p5410a.C68952p.f185242a     // Catch:{ InterruptedException -> 0x02f1 }
            e.a.a.o.a.q r7 = r7.mo6453a()     // Catch:{ InterruptedException -> 0x02f1 }
            long r7 = r7.mo60810a()     // Catch:{ InterruptedException -> 0x02f1 }
            long r5 = r5 - r7
            r7 = 0
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ InterruptedException -> 0x02f1 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x02f1 }
            boolean r10 = r4.tryLock(r5, r7)     // Catch:{ InterruptedException -> 0x02f1 }
            goto L_0x02f9
        L_0x02f1:
            r10 = 0
            goto L_0x02f9
        L_0x02f3:
            java.util.concurrent.locks.Lock r5 = r1.f81139j
            r5.lock()
            r10 = 1
        L_0x02f9:
            e.a.a.o.a.p r4 = p5304e.p5305a.p5306a.p5409o.p5410a.C68952p.f185242a     // Catch:{ all -> 0x04a3 }
            e.a.a.o.a.q r4 = r4.mo6453a()     // Catch:{ all -> 0x04a3 }
            boolean r4 = r4.mo60811b()     // Catch:{ all -> 0x04a3 }
            if (r4 == 0) goto L_0x03c3
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r5.<init>()     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.cq r3 = r3.f146587a     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0315:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r6 == 0) goto L_0x0380
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bi r6 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55556bi) r6     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.cq r7 = r6.f146583b     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0327:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r8 == 0) goto L_0x034d
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.cq r8 = (com.google.p4160bf.p4164b.p4165a.C55661cq) r8     // Catch:{ all -> 0x04a3 }
            com.google.android.libraries.notifications.platform.a.d r9 = r1.f81137h     // Catch:{ all -> 0x04a3 }
            java.lang.String r11 = r0.mo35009h()     // Catch:{ all -> 0x04a3 }
            java.lang.Object r9 = r9.mo35400a(r11)     // Catch:{ all -> 0x04a3 }
            com.google.android.libraries.notifications.data.impl.j r9 = (com.google.android.libraries.notifications.data.impl.C29805j) r9     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r11 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r11 != 0) goto L_0x0345
            com.google.bf.b.a.a.bq r11 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x0345:
            com.google.android.libraries.notifications.data.s r8 = m55550d(r8, r11)     // Catch:{ all -> 0x04a3 }
            r9.mo35105b(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x0327
        L_0x034d:
            com.google.bf.b.a.a.bq r7 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r7 != 0) goto L_0x0353
            com.google.bf.b.a.a.bq r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x0353:
            boolean r7 = m55552f(r7)     // Catch:{ all -> 0x04a3 }
            if (r7 == 0) goto L_0x035e
            com.google.protobuf.cq r7 = r6.f146583b     // Catch:{ all -> 0x04a3 }
            r5.addAll(r7)     // Catch:{ all -> 0x04a3 }
        L_0x035e:
            com.google.bf.b.a.a.bq r7 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r7 != 0) goto L_0x0364
            com.google.bf.b.a.a.bq r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x0364:
            java.lang.Object r7 = r4.get(r7)     // Catch:{ all -> 0x04a3 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x04a3 }
            if (r7 != 0) goto L_0x0371
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r7.<init>()     // Catch:{ all -> 0x04a3 }
        L_0x0371:
            com.google.protobuf.cq r8 = r6.f146583b     // Catch:{ all -> 0x04a3 }
            r7.addAll(r8)     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r6 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r6 != 0) goto L_0x037c
            com.google.bf.b.a.a.bq r6 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x037c:
            r4.put(r6, r7)     // Catch:{ all -> 0x04a3 }
            goto L_0x0315
        L_0x0380:
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x04a3 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x04a3 }
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x04a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x04a3 }
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x04a3 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x04a3 }
            r1.m55551e(r0, r2, r4)     // Catch:{ all -> 0x04a3 }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0398:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r2 == 0) goto L_0x049b
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x04a3 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x04a3 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r3 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r3     // Catch:{ all -> 0x04a3 }
            boolean r3 = m55552f(r3)     // Catch:{ all -> 0x04a3 }
            if (r3 == 0) goto L_0x0398
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x04a3 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x04a3 }
            m55554h(r3)     // Catch:{ all -> 0x04a3 }
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r2 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r2     // Catch:{ all -> 0x04a3 }
            r25.m55553g()     // Catch:{ all -> 0x04a3 }
            goto L_0x0398
        L_0x03c3:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r5.<init>()     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.cq r3 = r3.f146587a     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x03d3:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r6 == 0) goto L_0x043a
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bi r6 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55556bi) r6     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.cq r7 = r6.f146583b     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x03e5:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r8 == 0) goto L_0x040b
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.cq r8 = (com.google.p4160bf.p4164b.p4165a.C55661cq) r8     // Catch:{ all -> 0x04a3 }
            com.google.android.libraries.notifications.platform.a.d r9 = r1.f81137h     // Catch:{ all -> 0x04a3 }
            java.lang.String r11 = r0.mo35009h()     // Catch:{ all -> 0x04a3 }
            java.lang.Object r9 = r9.mo35400a(r11)     // Catch:{ all -> 0x04a3 }
            com.google.android.libraries.notifications.data.impl.j r9 = (com.google.android.libraries.notifications.data.impl.C29805j) r9     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r11 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r11 != 0) goto L_0x0403
            com.google.bf.b.a.a.bq r11 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x0403:
            com.google.android.libraries.notifications.data.s r8 = m55550d(r8, r11)     // Catch:{ all -> 0x04a3 }
            r9.mo35105b(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x03e5
        L_0x040b:
            com.google.bf.b.a.a.bq r7 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r7 != 0) goto L_0x0411
            com.google.bf.b.a.a.bq r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x0411:
            int r7 = r7.f146606c     // Catch:{ all -> 0x04a3 }
            int r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55590z.m87714a(r7)     // Catch:{ all -> 0x04a3 }
            if (r7 != 0) goto L_0x041a
            goto L_0x0423
        L_0x041a:
            r8 = 3
            if (r7 != r8) goto L_0x0423
            com.google.protobuf.cq r6 = r6.f146583b     // Catch:{ all -> 0x04a3 }
            r5.addAll(r6)     // Catch:{ all -> 0x04a3 }
            goto L_0x03d3
        L_0x0423:
            com.google.bf.b.a.a.bq r7 = r6.f146582a     // Catch:{ all -> 0x04a3 }
            if (r7 != 0) goto L_0x0429
            com.google.bf.b.a.a.bq r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
        L_0x0429:
            int r7 = r7.f146608e     // Catch:{ all -> 0x04a3 }
            int r7 = com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm.m87708a(r7)     // Catch:{ all -> 0x04a3 }
            if (r7 == 0) goto L_0x03d3
            r8 = 3
            if (r7 != r8) goto L_0x03d3
            com.google.protobuf.cq r6 = r6.f146583b     // Catch:{ all -> 0x04a3 }
            r4.addAll(r6)     // Catch:{ all -> 0x04a3 }
            goto L_0x03d3
        L_0x043a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r3.<init>()     // Catch:{ all -> 0x04a3 }
            r3.addAll(r4)     // Catch:{ all -> 0x04a3 }
            r3.addAll(r5)     // Catch:{ all -> 0x04a3 }
            r1.m55551e(r0, r2, r3)     // Catch:{ all -> 0x04a3 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x04a3 }
            if (r0 != 0) goto L_0x0471
            m55554h(r5)     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bp r0 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp) r0     // Catch:{ all -> 0x04a3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r2 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r2     // Catch:{ all -> 0x04a3 }
            r3 = 2
            r2.f146606c = r3     // Catch:{ all -> 0x04a3 }
            int r5 = r2.f146604a     // Catch:{ all -> 0x04a3 }
            r5 = r5 | r3
            r2.f146604a = r5     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r0 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r0     // Catch:{ all -> 0x04a3 }
            r25.m55553g()     // Catch:{ all -> 0x04a3 }
        L_0x0471:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x04a3 }
            if (r0 != 0) goto L_0x049b
            m55554h(r4)     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq.f146602f     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bp r0 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp) r0     // Catch:{ all -> 0x04a3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r2 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r2     // Catch:{ all -> 0x04a3 }
            r3 = 2
            r2.f146608e = r3     // Catch:{ all -> 0x04a3 }
            int r3 = r2.f146604a     // Catch:{ all -> 0x04a3 }
            r3 = r3 | 8
            r2.f146604a = r3     // Catch:{ all -> 0x04a3 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x04a3 }
            com.google.bf.b.a.a.bq r0 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq) r0     // Catch:{ all -> 0x04a3 }
            r25.m55553g()     // Catch:{ all -> 0x04a3 }
        L_0x049b:
            if (r10 == 0) goto L_0x051c
            java.util.concurrent.locks.Lock r0 = r1.f81139j
            r0.unlock()
            return
        L_0x04a3:
            r0 = move-exception
            if (r10 == 0) goto L_0x04ab
            java.util.concurrent.locks.Lock r2 = r1.f81139j
            r2.unlock()
        L_0x04ab:
            throw r0
        L_0x04ac:
            java.lang.String r0 = "Payload has STORE_ALL_ACCOUNTS instruction."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r14, r0, r2)
            com.google.android.libraries.notifications.i.a.b r0 = r1.f81141l
            com.google.bf.b.a.a.at r2 = com.google.p4160bf.p4164b.p4165a.p4166a.C55540at.SERVER_SYNC_INSTRUCTION
            r0.mo35345a(r2)
            return
        L_0x04bb:
            if (r0 != 0) goto L_0x04c5
            java.lang.String r0 = "Payload with FULL_SYNC instruction must have an account"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r2)
            return
        L_0x04c5:
            java.lang.String r3 = "Payload has FULL_SYNC instruction."
            java.lang.Object[] r4 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r14, r3, r4)
            com.google.android.libraries.notifications.e.b.a.a r3 = r1.f81142m
            com.google.bf.a.b.bz r4 = com.google.p4160bf.p4161a.p4163b.C55489bz.DELIVERED_FULL_SYNC_INSTRUCTION
            com.google.android.libraries.notifications.e.b.a r3 = r3.mo35159a(r4)
            r3.mo35145j(r0)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r3.mo35144i(r2)
            r3.mo35136a()
            com.google.android.libraries.notifications.e.i.a.c r2 = r1.f81140k
            com.google.bf.b.a.a.ab r3 = com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab.FULL_SYNC_INSTRUCTION
            r2.mo35222b(r0, r3)
            return
        L_0x04e9:
            if (r0 != 0) goto L_0x04f3
            java.lang.String r0 = "Payload with SYNC instruction must have an account"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r2)
            return
        L_0x04f3:
            java.lang.String r4 = "Payload has SYNC instruction."
            java.lang.Object[] r5 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r14, r4, r5)
            com.google.android.libraries.notifications.e.b.a.a r4 = r1.f81142m
            com.google.bf.a.b.bz r5 = com.google.p4160bf.p4161a.p4163b.C55489bz.DELIVERED_SYNC_INSTRUCTION
            com.google.android.libraries.notifications.e.b.a r4 = r4.mo35159a(r5)
            r4.mo35145j(r0)
            com.google.bf.a.b.ae r2 = r2.mo35273g()
            r4.mo35144i(r2)
            r4.mo35136a()
            com.google.android.libraries.notifications.e.i.a.c r2 = r1.f81140k
            long r3 = r3.f146591b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.google.bf.b.a.a.ab r4 = com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab.SYNC_INSTRUCTION
            r2.mo35221a(r0, r3, r4)
        L_0x051c:
            return
        L_0x051d:
            com.google.android.libraries.notifications.e.b.a.a r3 = r1.f81142m
            r4 = 3
            com.google.android.libraries.notifications.e.b.a r3 = r3.mo35160b(r4)
            r3.mo35145j(r0)
            com.google.bf.b.a.a.af r0 = r12.f146626c
            if (r0 != 0) goto L_0x052d
            com.google.bf.b.a.a.af r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55526af.f146517o
        L_0x052d:
            r3.mo35146k(r0)
            com.google.bf.a.b.ae r0 = r2.mo35273g()
            r3.mo35144i(r0)
            r3.mo35136a()
            java.lang.String r0 = "AndroidPayload doesn't have sufficient data to show the notification."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r14, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.gcm.C29967b.mo35261b(android.content.Intent, com.google.android.libraries.notifications.h, long):void");
    }

    /* renamed from: c */
    public final boolean mo35262c(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append("\n");
            }
        }
        sb.append("]");
        objArr[1] = sb.toString();
        C30058b.m55794f("GcmIntentHandler", "onReceive: %s \n %s", objArr);
        C29966a aVar = (C29966a) C29969d.m55559f(intent);
        int i = aVar.f81126b - 1;
        if (i == 0 || i == 1) {
            if (!TextUtils.isEmpty(aVar.f81125a)) {
                return true;
            }
            return false;
        } else if (i != 2) {
            return false;
        } else {
            return true;
        }
    }
}
