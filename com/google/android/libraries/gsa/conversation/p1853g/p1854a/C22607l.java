package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import androidx.p060c.C0977g;
import com.google.android.libraries.gsa.conversation.p1838b.C22348b;
import com.google.android.libraries.gsa.conversation.p1838b.C22350d;
import com.google.android.libraries.gsa.conversation.p1858i.C22724a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52087et;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62972cr;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.l */
/* compiled from: PG */
public final class C22607l implements C22348b {

    /* renamed from: a */
    public static final C59071e f62272a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.a.l");

    /* renamed from: b */
    static final long f62273b = TimeUnit.DAYS.toMillis(21);

    /* renamed from: c */
    public final List f62274c = new ArrayList();

    /* renamed from: d */
    public SettableFuture f62275d = new SettableFuture();

    /* renamed from: e */
    public final Map f62276e = new HashMap();

    /* renamed from: f */
    public C22606k f62277f = C22606k.UNINITIALIZED;

    /* renamed from: g */
    private final C58833ax f62278g;

    public C22607l(C58833ax axVar) {
        this.f62278g = axVar;
    }

    /* renamed from: h */
    private final Set m42104h() {
        HashSet hashSet = new HashSet(this.f62274c);
        hashSet.removeAll(this.f62276e.keySet());
        return hashSet;
    }

    /* renamed from: i */
    private final void m42105i(String str, MessageLite messageLite) {
        if (this.f62278g.mo56113h()) {
            C60856cj.m92911t(C22598c.m42092b(str, messageLite, f62273b, 1, (C22724a) this.f62278g.mo56107c()), C47810es.m84974n(new C22604i(str)), C60826bg.f164896a);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final synchronized void mo27576a(C22350d dVar) {
        dVar.mo27580c("JwnLibraryManager");
        dVar.mo27579b("Status", this.f62277f);
        dVar.mo27579b("Load sequence", this.f62274c);
        for (C52087et etVar : this.f62276e.values()) {
            dVar.mo27579b(etVar.f136702a, etVar.f136703b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C60870cx mo27715b() {
        mo27717d(false);
        return this.f62275d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized Map mo27716c() {
        C0977g gVar;
        gVar = new C0977g(this.f62276e.size());
        for (C52087et etVar : this.f62276e.values()) {
            gVar.put(etVar.f136702a, etVar.f136703b);
        }
        return gVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0083=Splitter:B:35:0x0083, B:15:0x0029=Splitter:B:15:0x0029} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27717d(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.libraries.gsa.conversation.g.a.k r0 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22606k.UNINITIALIZED     // Catch:{ all -> 0x008c }
            com.google.android.libraries.gsa.conversation.g.a.k r0 = r3.f62277f     // Catch:{ all -> 0x008c }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x008c }
            r1 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r1) goto L_0x0035
            r2 = 2
            if (r0 == r2) goto L_0x0012
            goto L_0x004a
        L_0x0012:
            if (r4 != 0) goto L_0x0029
            com.google.common.util.concurrent.SettableFuture r4 = r3.f62275d     // Catch:{ all -> 0x008c }
            boolean r4 = r4.isDone()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0027
            java.util.Set r4 = r3.m42104h()     // Catch:{ all -> 0x008c }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            monitor-exit(r3)
            return
        L_0x0029:
            com.google.common.util.concurrent.SettableFuture r4 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x008c }
            r4.<init>()     // Catch:{ all -> 0x008c }
            r3.f62275d = r4     // Catch:{ all -> 0x008c }
            r3.mo27718e()     // Catch:{ all -> 0x008c }
            monitor-exit(r3)
            return
        L_0x0035:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008c }
            monitor-exit(r3)
            return
        L_0x0039:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008c }
            com.google.common.util.concurrent.SettableFuture r4 = r3.f62275d     // Catch:{ all -> 0x008c }
            boolean r4 = r4.isDone()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x004a
            com.google.common.util.concurrent.SettableFuture r4 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x008c }
            r4.<init>()     // Catch:{ all -> 0x008c }
            r3.f62275d = r4     // Catch:{ all -> 0x008c }
        L_0x004a:
            java.util.List r4 = r3.f62274c     // Catch:{ all -> 0x008c }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0083
            com.google.common.base.ax r4 = r3.f62278g     // Catch:{ all -> 0x008c }
            boolean r4 = r4.mo56113h()     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x005b
            goto L_0x0083
        L_0x005b:
            com.google.android.libraries.gsa.conversation.g.a.k r4 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22606k.INITIALIZING     // Catch:{ all -> 0x008c }
            r3.f62277f = r4     // Catch:{ all -> 0x008c }
            com.google.android.libraries.gsa.conversation.g.a.g r4 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22602g.f62262b     // Catch:{ all -> 0x008c }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ all -> 0x008c }
            com.google.common.base.ax r0 = r3.f62278g     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x008c }
            com.google.android.libraries.gsa.conversation.i.a r0 = (com.google.android.libraries.gsa.conversation.p1858i.C22724a) r0     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "jwn_libs_record"
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22598c.m42091a(r2, r4, r1, r0)     // Catch:{ all -> 0x008c }
            com.google.android.libraries.gsa.conversation.g.a.h r0 = new com.google.android.libraries.gsa.conversation.g.a.h     // Catch:{ all -> 0x008c }
            r0.<init>(r3)     // Catch:{ all -> 0x008c }
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)     // Catch:{ all -> 0x008c }
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x008c }
            com.google.common.util.concurrent.C60856cj.m92911t(r4, r0, r1)     // Catch:{ all -> 0x008c }
            monitor-exit(r3)
            return
        L_0x0083:
            com.google.android.libraries.gsa.conversation.g.a.k r4 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22606k.INITIALIZED     // Catch:{ all -> 0x008c }
            r3.f62277f = r4     // Catch:{ all -> 0x008c }
            r3.mo27718e()     // Catch:{ all -> 0x008c }
            monitor-exit(r3)
            return
        L_0x008c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22607l.mo27717d(boolean):void");
    }

    /* renamed from: e */
    public final void mo27718e() {
        if (this.f62274c.isEmpty() || !this.f62278g.mo56113h() || m42104h().isEmpty()) {
            mo27719f();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> h = m42104h();
        C58976aa aaVar = C58975e.f156826a;
        for (String valueOf : h) {
            arrayList.add(C22598c.m42091a("jwn_lib_".concat(String.valueOf(valueOf)), C52087et.f136700d.getParserForType(), 1, (C22724a) this.f62278g.mo56107c()));
        }
        C60856cj.m92911t(C60856cj.m92906o(arrayList), C47810es.m84974n(new C22605j(this)), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo27719f() {
        if (this.f62274c.isEmpty()) {
            this.f62275d.mo57356n(C58836b.f156633a);
            return;
        }
        Set h = m42104h();
        if (!h.isEmpty()) {
            this.f62275d.mo57357o(new IllegalStateException("Missing libraries: ".concat(h.toString())));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.f62274c) {
            if (this.f62276e.containsKey(str)) {
                sb.append(((C52087et) this.f62276e.get(str)).f136704c.mo59170I(C62972cr.f170009a));
                sb.append("\n");
            }
        }
        this.f62275d.mo57356n(C58833ax.m90834k(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        return true;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo27720g(com.google.assistant.p3897e.p3921j.C52085er r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.List r0 = r7.f62274c     // Catch:{ all -> 0x009a }
            com.google.protobuf.cq r1 = r8.f136699b     // Catch:{ all -> 0x009a }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x009a }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0048
            java.util.List r0 = r7.f62274c     // Catch:{ all -> 0x009a }
            r0.clear()     // Catch:{ all -> 0x009a }
            java.util.List r0 = r7.f62274c     // Catch:{ all -> 0x009a }
            com.google.protobuf.cq r3 = r8.f136699b     // Catch:{ all -> 0x009a }
            r0.addAll(r3)     // Catch:{ all -> 0x009a }
            com.google.android.libraries.gsa.conversation.g.a.g r0 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22602g.f62262b     // Catch:{ all -> 0x009a }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x009a }
            com.google.android.libraries.gsa.conversation.g.a.f r0 = (com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22601f) r0     // Catch:{ all -> 0x009a }
            java.util.List r3 = r7.f62274c     // Catch:{ all -> 0x009a }
            r0.copyOnWrite()     // Catch:{ all -> 0x009a }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x009a }
            com.google.android.libraries.gsa.conversation.g.a.g r4 = (com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22602g) r4     // Catch:{ all -> 0x009a }
            com.google.protobuf.cq r5 = r4.f62264a     // Catch:{ all -> 0x009a }
            boolean r6 = r5.mo58948c()     // Catch:{ all -> 0x009a }
            if (r6 != 0) goto L_0x0038
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)     // Catch:{ all -> 0x009a }
            r4.f62264a = r5     // Catch:{ all -> 0x009a }
        L_0x0038:
            com.google.protobuf.cq r4 = r4.f62264a     // Catch:{ all -> 0x009a }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "jwn_libs_record"
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x009a }
            r7.m42105i(r3, r0)     // Catch:{ all -> 0x009a }
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            com.google.protobuf.cq r8 = r8.f136698a     // Catch:{ all -> 0x009a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x009a }
            r3 = 0
        L_0x0050:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x009a }
            com.google.assistant.e.j.et r4 = (com.google.assistant.p3897e.p3921j.C52087et) r4     // Catch:{ all -> 0x009a }
            java.util.Map r5 = r7.f62276e     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r4.f136702a     // Catch:{ all -> 0x009a }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x009a }
            com.google.assistant.e.j.et r5 = (com.google.assistant.p3897e.p3921j.C52087et) r5     // Catch:{ all -> 0x009a }
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = r5.f136703b     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r4.f136703b     // Catch:{ all -> 0x009a }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x009a }
            if (r5 != 0) goto L_0x0050
        L_0x0072:
            java.util.Map r3 = r7.f62276e     // Catch:{ all -> 0x009a }
            java.lang.String r5 = r4.f136702a     // Catch:{ all -> 0x009a }
            r3.put(r5, r4)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "jwn_lib_"
            java.lang.String r5 = r4.f136702a     // Catch:{ all -> 0x009a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r3.concat(r5)     // Catch:{ all -> 0x009a }
            r7.m42105i(r3, r4)     // Catch:{ all -> 0x009a }
            r3 = 1
            goto L_0x0050
        L_0x008a:
            if (r0 != 0) goto L_0x008e
            if (r3 == 0) goto L_0x0091
        L_0x008e:
            r7.mo27717d(r2)     // Catch:{ all -> 0x009a }
        L_0x0091:
            if (r0 != 0) goto L_0x0098
            if (r3 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            monitor-exit(r7)
            return r1
        L_0x0098:
            monitor-exit(r7)
            return r2
        L_0x009a:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x009e
        L_0x009d:
            throw r8
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22607l.mo27720g(com.google.assistant.e.j.er):boolean");
    }
}
