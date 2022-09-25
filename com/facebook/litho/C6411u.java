package com.facebook.litho;

import android.content.Context;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.p332h.C6375a;
import com.google.android.libraries.elements.p1729h.C21215m;

/* renamed from: com.facebook.litho.u */
/* compiled from: PG */
public class C6411u {

    /* renamed from: a */
    public static final C6181da f19008a = new C6243eq();

    /* renamed from: b */
    public final Context f19009b;

    /* renamed from: c */
    public final C6280fw f19010c;

    /* renamed from: d */
    public String f19011d;

    /* renamed from: e */
    public C6407q f19012e;

    /* renamed from: f */
    public final C6268fk f19013f;

    /* renamed from: g */
    public int f19014g;

    /* renamed from: h */
    public int f19015h;

    /* renamed from: i */
    public C6381hf f19016i;

    /* renamed from: j */
    public ComponentTree f19017j;

    /* renamed from: k */
    public C6188dh f19018k;

    /* renamed from: l */
    private final String f19019l;

    /* renamed from: m */
    private final C6267fj f19020m;

    /* renamed from: n */
    private final C21215m f19021n;

    /* renamed from: a */
    public static C6411u m17308a(C6411u uVar) {
        return new C6411u(uVar.f19009b, uVar.mo13470f(), uVar.mo13475m(), C6381hf.m17120b(uVar.f19016i));
    }

    /* renamed from: n */
    private final void mo13351n() {
        String str = this.f19011d;
        if (str != null) {
            throw new IllegalStateException("Updating the state of a component during " + str + " leads to unexpected behaviour, consider using lazy state updates.");
        }
    }

    /* renamed from: b */
    public final C6154cb mo13467b() {
        C6154cb cbVar;
        C6407q qVar = this.f19012e;
        if (qVar != null && (cbVar = qVar.f18997t) != null) {
            return cbVar;
        }
        ComponentTree componentTree = this.f19017j;
        return componentTree != null ? componentTree.f17876G : C6123bd.f18071a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C6187dg mo13468c() {
        C6188dh dhVar = this.f19018k;
        if (dhVar == null) {
            return null;
        }
        return dhVar.f18322a;
    }

    /* renamed from: d */
    public final Object mo13469d(Class cls) {
        C6381hf hfVar = this.f19016i;
        if (hfVar == null) {
            return null;
        }
        return hfVar.mo13397c(cls);
    }

    /* renamed from: e */
    public String mo13348e() {
        boolean z = C6180a.f18234a;
        C6407q qVar = this.f19012e;
        if (qVar != null) {
            return C6407q.m17273E(qVar);
        }
        throw new RuntimeException("getGlobalKey cannot be accessed from a ComponentContext without a scope");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f17879J;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo13470f() {
        /*
            r1 = this;
            com.facebook.litho.ComponentTree r0 = r1.f19017j
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.f17879J
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.lang.String r0 = r1.f19019l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6411u.mo13470f():java.lang.String");
    }

    /* renamed from: g */
    public void mo13349g(C6278fu fuVar, String str) {
        mo13351n();
        ComponentTree componentTree = this.f19017j;
        if (componentTree != null) {
            String e = mo13348e();
            boolean i = mo13471i();
            if (componentTree.f17913p) {
                synchronized (componentTree) {
                    if (componentTree.f17922y != null) {
                        componentTree.f17873D.mo13287l(e, fuVar, false);
                        C6375a.f18852c.addAndGet(1);
                        componentTree.mo12722q(true, str, i);
                        return;
                    }
                    return;
                }
            }
            throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        com.facebook.litho.p332h.C6375a.f18851b.addAndGet(1);
        r8 = android.os.Looper.myLooper();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r8 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        android.util.Log.w(com.facebook.litho.ComponentTree.f17868a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
        r3 = r2.f17905h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8 = r2.f17906i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r8 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r2.f17915r.mo13164b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r2.f17906i = new com.facebook.litho.C6101al(r2, r9, r4);
        r8 = com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r2.f17915r.mo13165c() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r8 = "updateStateSyncNoLooper " + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r2.f17915r.mo13163a(r2.f17906i, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r1 = (java.lang.ref.WeakReference) com.facebook.litho.ComponentTree.f17869b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r1 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        r1 = (com.facebook.litho.C6193dm) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r1 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r1 = new com.facebook.litho.C6192dl(r8);
        com.facebook.litho.ComponentTree.f17869b.set(new java.lang.ref.WeakReference(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r8 = r2.f17905h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r3 = r2.f17906i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (r3 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r1.mo13164b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r2.f17906i = new com.facebook.litho.C6101al(r2, r9, r4);
        r3 = com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        if (r1.mo13165c() == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        r3 = "updateStateSync " + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r1.mo13163a(r2.f17906i, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13350h(com.facebook.litho.C6278fu r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "updateStateSync "
            java.lang.String r1 = "updateStateSyncNoLooper "
            r7.mo13351n()
            com.facebook.litho.ComponentTree r2 = r7.f19017j
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r3 = r7.mo13348e()
            boolean r4 = r7.mo13471i()
            monitor-enter(r2)
            com.facebook.litho.q r5 = r2.f17922y     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x001b
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            return
        L_0x001b:
            com.facebook.litho.fw r5 = r2.f17873D     // Catch:{ all -> 0x00bd }
            r6 = 0
            r5.mo13287l(r3, r8, r6)     // Catch:{ all -> 0x00bd }
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            java.util.concurrent.atomic.AtomicLong r8 = com.facebook.litho.p332h.C6375a.f18851b
            r5 = 1
            r8.addAndGet(r5)
            android.os.Looper r8 = android.os.Looper.myLooper()
            if (r8 != 0) goto L_0x006b
            java.lang.String r8 = com.facebook.litho.ComponentTree.f17868a
            java.lang.String r0 = "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead"
            android.util.Log.w(r8, r0)
            java.lang.Object r3 = r2.f17905h
            monitor-enter(r3)
            com.facebook.litho.al r8 = r2.f17906i     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x0042
            com.facebook.litho.dm r0 = r2.f17915r     // Catch:{ all -> 0x0068 }
            r0.mo13164b(r8)     // Catch:{ all -> 0x0068 }
        L_0x0042:
            com.facebook.litho.al r8 = new com.facebook.litho.al     // Catch:{ all -> 0x0068 }
            r8.<init>(r2, r9, r4)     // Catch:{ all -> 0x0068 }
            r2.f17906i = r8     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = ""
            com.facebook.litho.dm r0 = r2.f17915r     // Catch:{ all -> 0x0068 }
            boolean r0 = r0.mo13165c()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x005f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r8.<init>(r1)     // Catch:{ all -> 0x0068 }
            r8.append(r9)     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0068 }
        L_0x005f:
            com.facebook.litho.dm r9 = r2.f17915r     // Catch:{ all -> 0x0068 }
            com.facebook.litho.al r0 = r2.f17906i     // Catch:{ all -> 0x0068 }
            r9.mo13163a(r0, r8)     // Catch:{ all -> 0x0068 }
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            throw r8
        L_0x006b:
            java.lang.ThreadLocal r1 = com.facebook.litho.ComponentTree.f17869b
            java.lang.Object r1 = r1.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L_0x007c
            java.lang.Object r1 = r1.get()
            com.facebook.litho.dm r1 = (com.facebook.litho.C6193dm) r1
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            if (r1 != 0) goto L_0x008e
            com.facebook.litho.dl r1 = new com.facebook.litho.dl
            r1.<init>(r8)
            java.lang.ThreadLocal r8 = com.facebook.litho.ComponentTree.f17869b
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r8.set(r3)
        L_0x008e:
            java.lang.Object r8 = r2.f17905h
            monitor-enter(r8)
            com.facebook.litho.al r3 = r2.f17906i     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x0098
            r1.mo13164b(r3)     // Catch:{ all -> 0x00ba }
        L_0x0098:
            com.facebook.litho.al r3 = new com.facebook.litho.al     // Catch:{ all -> 0x00ba }
            r3.<init>(r2, r9, r4)     // Catch:{ all -> 0x00ba }
            r2.f17906i = r3     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = ""
            boolean r4 = r1.mo13165c()     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x00b3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r3.<init>(r0)     // Catch:{ all -> 0x00ba }
            r3.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ba }
        L_0x00b3:
            com.facebook.litho.al r9 = r2.f17906i     // Catch:{ all -> 0x00ba }
            r1.mo13163a(r9, r3)     // Catch:{ all -> 0x00ba }
            monitor-exit(r8)     // Catch:{ all -> 0x00ba }
            return
        L_0x00ba:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ba }
            throw r9
        L_0x00bd:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6411u.mo13350h(com.facebook.litho.fu, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo13471i() {
        C6187dg dgVar;
        C6188dh dhVar = this.f19018k;
        if (dhVar == null || (dgVar = dhVar.f18322a) == null) {
            return false;
        }
        return dgVar.f18318w;
    }

    /* renamed from: j */
    public final boolean mo13472j() {
        ComponentTree componentTree = this.f19017j;
        if (componentTree != null) {
            return componentTree.f17878I;
        }
        boolean z = C6180a.f18234a;
        return false;
    }

    /* renamed from: k */
    public final boolean mo13473k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo13474l() {
        C6188dh dhVar = this.f19018k;
        if (dhVar == null) {
            return false;
        }
        dhVar.mo13162a();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f17881L;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.elements.p1729h.C21215m mo13475m() {
        /*
            r1 = this;
            com.facebook.litho.ComponentTree r0 = r1.f19017j
            if (r0 == 0) goto L_0x000a
            com.google.android.libraries.elements.h.m r0 = r0.f17881L
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            com.google.android.libraries.elements.h.m r0 = r1.f19021n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6411u.mo13475m():com.google.android.libraries.elements.h.m");
    }

    public C6411u(Context context, String str, C21215m mVar, C6381hf hfVar) {
        if (mVar == null || str != null) {
            this.f19009b = context;
            this.f19020m = C6267fj.m16815a(context.getResources().getConfiguration());
            this.f19013f = new C6268fk(this);
            this.f19016i = hfVar;
            this.f19021n = mVar;
            this.f19019l = str;
            this.f19010c = null;
            return;
        }
        throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
    }

    public C6411u(C6411u uVar) {
        this(uVar, uVar.f19010c, uVar.f19016i, uVar.f19018k);
    }

    public C6411u(C6411u uVar, C6280fw fwVar, C6381hf hfVar, C6188dh dhVar) {
        this.f19009b = uVar.f19009b;
        this.f19020m = uVar.f19020m;
        this.f19013f = uVar.f19013f;
        this.f19014g = uVar.f19014g;
        this.f19015h = uVar.f19015h;
        this.f19012e = uVar.f19012e;
        ComponentTree componentTree = uVar.f19017j;
        this.f19017j = componentTree;
        this.f19018k = dhVar;
        this.f19021n = uVar.f19021n;
        String str = uVar.f19019l;
        if (str == null && componentTree != null) {
            str = componentTree.mo12709e();
        }
        this.f19019l = str;
        this.f19010c = fwVar == null ? uVar.f19010c : fwVar;
        this.f19016i = hfVar == null ? uVar.f19016i : hfVar;
    }
}
