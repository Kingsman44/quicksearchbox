package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.p060c.C0977g;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.signin.C145992d;
import com.google.android.gms.signin.C145994f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: com.google.android.gms.common.api.t */
/* compiled from: PG */
public final class C143848t {

    /* renamed from: a */
    public Account f389935a;

    /* renamed from: b */
    public final Set f389936b = new HashSet();

    /* renamed from: c */
    public final Set f389937c = new HashSet();

    /* renamed from: d */
    public final Map f389938d = new C0977g();

    /* renamed from: e */
    public Looper f389939e;

    /* renamed from: f */
    private final String f389940f;

    /* renamed from: g */
    private final String f389941g;

    /* renamed from: h */
    private final Map f389942h = new C0977g();

    /* renamed from: i */
    private final Context f389943i;

    /* renamed from: j */
    private final C143875g f389944j = C143875g.f389987a;

    /* renamed from: k */
    private final C143707a f389945k = C145992d.f394667c;

    /* renamed from: l */
    private final ArrayList f389946l = new ArrayList();

    /* renamed from: m */
    private final ArrayList f389947m = new ArrayList();

    public C143848t(Context context) {
        this.f389943i = context;
        this.f389939e = context.getMainLooper();
        this.f389940f = context.getPackageName();
        this.f389941g = context.getClass().getName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.api.C143851w mo119294a() {
        /*
            r17 = this;
            r1 = r17
            java.util.Map r0 = r1.f389938d
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            java.lang.String r3 = "must call addApi() to add at least one API"
            com.google.android.gms.common.internal.C143919bh.m233960c(r0, r3)
            com.google.android.gms.common.internal.s r0 = r17.mo119295b()
            java.util.Map r3 = r0.f390172d
            androidx.c.g r11 = new androidx.c.g
            r11.<init>()
            androidx.c.g r14 = new androidx.c.g
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Map r4 = r1.f389938d
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r12 = r4.iterator()
            r4 = 0
            r13 = r4
        L_0x0030:
            boolean r4 = r12.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x009c
            java.lang.Object r4 = r12.next()
            r10 = r4
            com.google.android.gms.common.api.m r10 = (com.google.android.gms.common.api.C143841m) r10
            java.util.Map r4 = r1.f389938d
            java.lang.Object r8 = r4.get(r10)
            java.lang.Object r4 = r3.get(r10)
            if (r4 == 0) goto L_0x004b
            r5 = 1
        L_0x004b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r11.put(r10, r4)
            com.google.android.gms.common.api.internal.v r9 = new com.google.android.gms.common.api.internal.v
            r9.<init>(r10, r5)
            r15.add(r9)
            com.google.android.gms.common.api.a r4 = r10.f389916a
            com.google.android.gms.common.internal.C143919bh.m233958a(r4)
            android.content.Context r5 = r1.f389943i
            android.os.Looper r6 = r1.f389939e
            r7 = r0
            r16 = r9
            r2 = r10
            r10 = r16
            com.google.android.gms.common.api.k r4 = r4.mo57743b(r5, r6, r7, r8, r9, r10)
            com.google.android.gms.common.api.l r5 = r2.f389917b
            r14.put(r5, r4)
            boolean r4 = r4.mo119250y()
            if (r4 == 0) goto L_0x009a
            if (r13 != 0) goto L_0x007c
            r13 = r2
            goto L_0x009a
        L_0x007c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.f389918c
            java.lang.String r3 = r13.f389918c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " cannot be used with "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x009a:
            r2 = 1
            goto L_0x0030
        L_0x009c:
            if (r13 == 0) goto L_0x00c5
            android.accounts.Account r2 = r1.f389935a
            if (r2 != 0) goto L_0x00a4
            r2 = 1
            goto L_0x00a5
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r6 = r13.f389918c
            r4[r5] = r6
            java.lang.String r6 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
            com.google.android.gms.common.internal.C143919bh.m233968k(r2, r6, r4)
            java.util.Set r2 = r1.f389936b
            java.util.Set r4 = r1.f389937c
            boolean r2 = r2.equals(r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r6 = r13.f389918c
            r4[r5] = r6
            java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
            com.google.android.gms.common.internal.C143919bh.m233968k(r2, r5, r4)
            goto L_0x00c6
        L_0x00c5:
            r3 = 1
        L_0x00c6:
            java.util.Collection r2 = r14.values()
            com.google.android.gms.common.api.internal.C143750ay.m233561j(r2, r3)
            com.google.android.gms.common.api.internal.ay r2 = new com.google.android.gms.common.api.internal.ay
            android.content.Context r5 = r1.f389943i
            java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
            r6.<init>()
            android.os.Looper r7 = r1.f389939e
            com.google.android.gms.common.g r9 = r1.f389944j
            com.google.android.gms.common.api.a r10 = r1.f389945k
            java.util.ArrayList r12 = r1.f389946l
            java.util.ArrayList r13 = r1.f389947m
            r4 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.Set r3 = com.google.android.gms.common.api.C143851w.f389948a
            monitor-enter(r3)
            java.util.Set r0 = com.google.android.gms.common.api.C143851w.f389948a     // Catch:{ all -> 0x00ef }
            r0.add(r2)     // Catch:{ all -> 0x00ef }
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            return r2
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            goto L_0x00f3
        L_0x00f2:
            throw r0
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C143848t.mo119294a():com.google.android.gms.common.api.w");
    }

    /* renamed from: b */
    public final C143944s mo119295b() {
        C145994f fVar = C145994f.f394670a;
        if (this.f389938d.containsKey(C145992d.f394669e)) {
            fVar = (C145994f) this.f389938d.get(C145992d.f394669e);
        }
        return new C143944s(this.f389935a, this.f389936b, this.f389942h, this.f389940f, this.f389941g, fVar);
    }

    /* renamed from: c */
    public final void mo119296c(C143841m mVar) {
        C143919bh.m233971n(mVar, "Api must not be null");
        this.f389938d.put(mVar, (Object) null);
        C143919bh.m233971n(mVar.f389916a, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        this.f389937c.addAll(emptyList);
        this.f389936b.addAll(emptyList);
    }

    /* renamed from: d */
    public final void mo119297d(C143849u uVar) {
        C143919bh.m233971n(uVar, "Listener must not be null");
        this.f389946l.add(uVar);
    }

    /* renamed from: e */
    public final void mo119298e(C143850v vVar) {
        C143919bh.m233971n(vVar, "Listener must not be null");
        this.f389947m.add(vVar);
    }

    /* renamed from: f */
    public final void mo119299f(String str) {
        this.f389935a = str == null ? null : new Account(str, "com.google");
    }
}
