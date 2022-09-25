package com.google.android.libraries.geller.portable;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.geller.portable.callbacks.C21951b;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.C21953a;
import com.google.android.libraries.geller.portable.database.C21957e;
import com.google.android.libraries.geller.portable.database.C21961i;
import com.google.android.libraries.geller.portable.database.C21962j;
import com.google.android.libraries.geller.portable.database.C21964l;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;
import com.google.protos.p4985f.p5030q.p5032b.C65025aj;
import com.google.protos.p4985f.p5030q.p5032b.C65028am;
import com.google.protos.p4985f.p5030q.p5032b.C65029an;
import com.google.protos.p4985f.p5030q.p5032b.C65030ao;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5032b.C65058e;
import com.google.protos.p4985f.p5030q.p5032b.C65059f;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5032b.C65064k;
import com.google.protos.p4985f.p5030q.p5032b.C65065l;
import com.google.protos.p4985f.p5030q.p5032b.C65066m;
import com.google.protos.p4985f.p5030q.p5032b.C65070q;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65819cw;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
public class Geller {

    /* renamed from: a */
    public static final C59071e f60378a = C59071e.m91332i("com.google.android.libraries.geller.portable.Geller");

    /* renamed from: h */
    private static final C58528ij f60379h = C58528ij.m90011K(C65753ak.INTERNAL_METRICS_CACHE_STATUS, C65753ak.INTERNAL_METRICS_CACHE_ACCESS);

    /* renamed from: b */
    public final Executor f60380b;

    /* renamed from: c */
    public long f60381c;

    /* renamed from: d */
    public final boolean f60382d;

    /* renamed from: e */
    public final GellerLoggingCallback f60383e;

    /* renamed from: f */
    public final GellerStorageOperationsCallback f60384f;

    /* renamed from: g */
    public final C65021af f60385g;

    /* renamed from: i */
    private final Context f60386i;

    /* renamed from: j */
    private final Executor f60387j;

    /* renamed from: k */
    private final Map f60388k = new HashMap();

    /* renamed from: l */
    private final Map f60389l = new HashMap();

    /* renamed from: m */
    private final Map f60390m;

    /* renamed from: n */
    private final C58833ax f60391n;

    /* renamed from: o */
    private final C58833ax f60392o;

    /* renamed from: p */
    private final C58833ax f60393p;

    /* renamed from: q */
    private final C58833ax f60394q;

    /* renamed from: r */
    private final C58833ax f60395r;

    /* renamed from: s */
    private final Set f60396s;

    public Geller(C21938ad adVar) {
        this.f60386i = adVar.f60522a;
        this.f60382d = adVar.f60526e;
        boolean z = adVar.f60527f;
        this.f60390m = adVar.f60528g.mo55427f(true);
        GellerLoggingCallback gellerLoggingCallback = adVar.f60529h;
        this.f60383e = gellerLoggingCallback;
        this.f60387j = adVar.f60523b;
        this.f60380b = new C60904dr(adVar.f60524c);
        C21945ak akVar = new C21945ak(this, adVar.f60524c, adVar.f60535n);
        this.f60384f = akVar;
        Set set = adVar.f60525d;
        this.f60396s = set;
        this.f60381c = nativeCreate(akVar, new GellerStorageChangeListenerHandler(C58528ij.m90006F(set), gellerLoggingCallback), gellerLoggingCallback, adVar.f60535n.toByteArray());
        this.f60391n = adVar.f60530i;
        this.f60392o = adVar.f60531j;
        this.f60393p = adVar.f60532k;
        this.f60394q = adVar.f60533l;
        this.f60395r = adVar.f60534m;
        this.f60385g = adVar.f60535n;
    }

    private native long nativeCreate(GellerStorageOperationsCallback gellerStorageOperationsCallback, GellerStorageChangeListenerHandler gellerStorageChangeListenerHandler, GellerLoggingCallback gellerLoggingCallback, byte[] bArr);

    private native long nativeCreateDatabase(GellerDatabase gellerDatabase, String str);

    private native void nativeDestroy(long j);

    private native void nativeDestroyDatabase(long j);

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m40985v(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006e
            com.google.common.base.ax r0 = r5.f60392o     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006e
            com.google.common.base.ax r0 = r5.f60392o     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0070 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.containsKey(r6)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x001e
            goto L_0x006e
        L_0x001e:
            com.google.common.base.ax r0 = r5.f60392o     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            com.google.common.base.ax r1 = r5.f60393p     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            com.google.common.base.ah r1 = (com.google.common.base.C58817ah) r1     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            java.lang.Object r1 = r1.apply(r6)     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            com.google.common.util.concurrent.cx r1 = (com.google.common.util.concurrent.C60870cx) r1     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            r3 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = r1.get(r3, r2)     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            com.google.android.libraries.geller.portable.database.e r1 = (com.google.android.libraries.geller.portable.database.C21957e) r1     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            r0.put(r6, r1)     // Catch:{ TimeoutException -> 0x005d, ExecutionException -> 0x005b, InterruptedException -> 0x0043 }
            monitor-exit(r5)
            return
        L_0x0043:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0070 }
            r1.interrupt()     // Catch:{ all -> 0x0070 }
            com.google.common.f.e r1 = f60378a     // Catch:{ all -> 0x0070 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "Failed to get the Portable Provider Data for %s"
            r3 = 48037(0xbba5, float:6.7314E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r6)     // Catch:{ all -> 0x0070 }
            monitor-exit(r5)
            return
        L_0x005b:
            r0 = move-exception
            goto L_0x005e
        L_0x005d:
            r0 = move-exception
        L_0x005e:
            com.google.common.f.e r1 = f60378a     // Catch:{ all -> 0x0070 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "Failed to get the Provider Platform DB for %s"
            r3 = 48036(0xbba4, float:6.7313E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r6)     // Catch:{ all -> 0x0070 }
            monitor-exit(r5)
            return
        L_0x006e:
            monitor-exit(r5)
            return
        L_0x0070:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.Geller.m40985v(java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized long mo27174a(String str) {
        Long l;
        l = (Long) this.f60388k.get(str);
        if (l == null) {
            l = Long.valueOf(nativeCreateDatabase(mo27176c(str), str));
            if (l.longValue() != 0) {
                this.f60388k.put(str, l);
            } else {
                ((C59052c) ((C59052c) f60378a.mo56225c()).mo56372aa(48023)).mo56386p("Failed to create native geller database, returning empty response/default value.");
            }
        }
        return l.longValue();
    }

    /* renamed from: b */
    public final GellerLoggingCallback mo27175b(C65753ak akVar) {
        if (f60379h.contains(akVar)) {
            return new C21951b();
        }
        GellerLoggingCallback gellerLoggingCallback = (GellerLoggingCallback) this.f60390m.get(akVar);
        return gellerLoggingCallback == null ? this.f60383e : gellerLoggingCallback;
    }

    /* renamed from: c */
    public final synchronized GellerDatabase mo27176c(String str) {
        GellerDatabase gellerDatabase;
        gellerDatabase = (GellerDatabase) this.f60389l.get(str);
        m40985v(str);
        C58833ax k = (!this.f60392o.mo56113h() || !((Map) this.f60392o.mo56107c()).containsKey(str)) ? C58836b.f156633a : C58833ax.m90834k((C21957e) ((Map) this.f60392o.mo56107c()).get(str));
        if (!str.isEmpty() && this.f60394q.mo56113h() && !((Map) this.f60394q.mo56107c()).containsKey(str) && this.f60395r.mo56113h()) {
            try {
                ((Map) this.f60394q.mo56107c()).put(str, (Map) ((C60870cx) ((C58817ah) this.f60395r.mo56107c()).apply(str)).get(3000, TimeUnit.MILLISECONDS));
                mo27205p(str, gellerDatabase);
                C21961i f = C21962j.m41167f();
                f.mo27269b(this.f60386i);
                f.mo27270c(str);
                f.mo27272e(this.f60382d);
                f.mo27275h();
                f.mo27274g(this.f60391n);
                f.mo27273f(this.f60394q);
                ((C21953a) f).f60561c = k;
                f.mo27271d(this.f60385g);
                gellerDatabase = f.mo27268a();
                this.f60389l.put(str, gellerDatabase);
            } catch (ExecutionException | TimeoutException e) {
                ((C59052c) ((C59052c) ((C59052c) f60378a.mo56225c()).mo56382g(e)).mo56372aa(48026)).mo56389s("Failed to get the ProtoDataStore for %s", str);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((C59052c) ((C59052c) ((C59052c) f60378a.mo56225c()).mo56382g(e2)).mo56372aa(48027)).mo56389s("Failed to get the ProtoDataStore for %s", str);
            }
        }
        if (gellerDatabase == null) {
            try {
                C21961i f2 = C21962j.m41167f();
                f2.mo27269b(this.f60386i);
                f2.mo27270c(str);
                f2.mo27272e(this.f60382d);
                f2.mo27275h();
                f2.mo27274g(this.f60391n);
                ((C21953a) f2).f60561c = k;
                f2.mo27271d(this.f60385g);
                f2.mo27273f(this.f60394q);
                gellerDatabase = f2.mo27268a();
                this.f60389l.put(str, gellerDatabase);
            } catch (SQLiteException | IllegalStateException e3) {
                ((C59052c) ((C59052c) ((C59052c) f60378a.mo56225c()).mo56382g(e3)).mo56372aa(48025)).mo56386p("Failed to create/open geller database, returning empty response/default value.");
            }
        }
        return gellerDatabase;
    }

    /* renamed from: d */
    public final C58485gu mo27177d(String str, C65753ak akVar, String str2, C65031ap apVar, C63662ac acVar, MessageLite messageLite) {
        if (str2 != null) {
            C65028am amVar = (C65028am) apVar.toBuilder();
            amVar.copyOnWrite();
            C65031ap apVar2 = (C65031ap) amVar.instance;
            apVar2.f176103b = 1;
            apVar2.f176104c = str2;
            apVar = (C65031ap) amVar.build();
        }
        C65033ar o = mo27204o(str, akVar, str2, apVar, acVar);
        C58480gp e = C58485gu.m89837e();
        for (C65768az azVar : o.f176113a) {
            try {
                C63010eb parserForType = messageLite.getParserForType();
                C63070h hVar = azVar.f178799e;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                e.mo55395g((MessageLite) parserForType.mo59011j(hVar.f170218b, C62921ba.m95368a()));
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) C21946al.f60546a.mo56225c()).mo56382g(e2)).mo56372aa(48045)).mo56386p("Skip invalid entry");
            }
        }
        return e.mo55394f();
    }

    /* renamed from: e */
    public final C58485gu mo27178e(String str, C65753ak akVar, String str2) {
        String[] strArr;
        try {
            strArr = nativeReadMetadata(this.f60381c, mo27174a(str), akVar.name(), str2);
        } catch (GellerException e) {
            ((C59052c) ((C59052c) ((C59052c) f60378a.mo56226d()).mo56382g(e)).mo56372aa(48029)).mo56386p("readMetadata called failed.");
            strArr = null;
        }
        if (strArr != null && strArr.length != 0) {
            return C58485gu.m89844l(strArr);
        }
        akVar.name();
        return C58485gu.m89845m();
    }

    /* renamed from: f */
    public final C58528ij mo27179f(String str, C65753ak akVar) {
        String[] nativeReadKeys = nativeReadKeys(this.f60381c, mo27174a(str), akVar.name());
        if (nativeReadKeys != null && nativeReadKeys.length != 0) {
            return C58528ij.m90008H(nativeReadKeys);
        }
        akVar.name();
        return C58733pz.f156496a;
    }

    /* renamed from: g */
    public final C60870cx mo27180g(String str, C65753ak akVar, List list, boolean z) {
        C60870cx cxVar;
        C65059f fVar;
        C65064k kVar = (C65064k) C65071r.f176208e.createBuilder();
        if (list.isEmpty()) {
            C65070q qVar = C65070q.f176204c;
            kVar.copyOnWrite();
            C65071r rVar = (C65071r) kVar.instance;
            qVar.getClass();
            rVar.f176212c = qVar;
            rVar.f176211b = 2;
        } else {
            C65065l lVar = (C65065l) C65066m.f176197b.createBuilder();
            C58801sm G = ((C58485gu) list).listIterator(0);
            while (G.hasNext()) {
                C21952d dVar = (C21952d) G.next();
                C65058e eVar = (C65058e) C65059f.f176180d.createBuilder();
                String b = dVar.mo27229b();
                eVar.copyOnWrite();
                C65059f fVar2 = (C65059f) eVar.instance;
                b.getClass();
                fVar2.f176182a |= 2;
                fVar2.f176184c = b;
                if (dVar.mo27228a().mo56113h()) {
                    long longValue = ((Long) dVar.mo27228a().mo56107c()).longValue();
                    eVar.copyOnWrite();
                    C65059f fVar3 = (C65059f) eVar.instance;
                    fVar3.f176182a |= 1;
                    fVar3.f176183b = longValue;
                    fVar = (C65059f) eVar.build();
                } else {
                    fVar = (C65059f) eVar.build();
                }
                lVar.copyOnWrite();
                C65066m mVar = (C65066m) lVar.instance;
                fVar.getClass();
                C62971cq cqVar = mVar.f176199a;
                if (!cqVar.mo58948c()) {
                    mVar.f176199a = C62942bv.mutableCopy(cqVar);
                }
                mVar.f176199a.add(fVar);
            }
            kVar.copyOnWrite();
            C65071r rVar2 = (C65071r) kVar.instance;
            C65066m mVar2 = (C65066m) lVar.build();
            mVar2.getClass();
            rVar2.f176212c = mVar2;
            rVar2.f176211b = 1;
        }
        C65071r rVar3 = (C65071r) kVar.build();
        C58838bb.m90884s(!this.f60382d, "delete() not allowed if Geller is read-only");
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        if (mo27176c(str) == null) {
            cxVar = C60856cj.m92899h(new GellerException(C62722b.UNKNOWN, "Geller instance is null."));
        } else {
            Class<GellerException> cls = GellerException.class;
            cxVar = C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(new C21989p(this, str, akVar, rVar3)), this.f60380b)).mo51514f(cls, new C21995v(this, z, akVar, d), this.f60380b).mo51515h(new C21996w(this, z, akVar, d), this.f60380b);
        }
        if (this.f60385g.f176082e) {
            return C60922j.m93044g(cxVar, C47810es.m84963c(new C21981h(this, str, akVar, list)), this.f60380b);
        }
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C21937ac(this, str, C21946al.m41085b(akVar, list))), this.f60387j);
        return cxVar;
    }

    /* renamed from: h */
    public final C60870cx mo27181h(String str, C65753ak akVar, String str2, C65031ap apVar, C63662ac acVar, MessageLite messageLite) {
        C58528ij ijVar = GellerDatabase.f60555b;
        if (((C58759qy) ijVar).f156534a.equals(akVar.name())) {
            C21998y yVar = new C21998y(this, str, akVar, str2, apVar, acVar, messageLite);
            return C60856cj.m92904m(C47810es.m84978r(yVar), this.f60380b);
        }
        C21999z zVar = new C21999z(this, str, akVar, str2, apVar, acVar, messageLite);
        return C60856cj.m92904m(C47810es.m84978r(zVar), this.f60387j);
    }

    /* renamed from: i */
    public final C60870cx mo27182i(String str, C65753ak akVar, String str2, C65031ap apVar, C63662ac acVar) {
        C58528ij ijVar = GellerDatabase.f60555b;
        if (((C58759qy) ijVar).f156534a.equals(akVar.name())) {
            C21979f fVar = new C21979f(this, str, akVar, str2, apVar, acVar);
            return C60856cj.m92904m(C47810es.m84978r(fVar), this.f60380b);
        }
        C21980g gVar = new C21980g(this, str, akVar, str2, apVar, acVar);
        return C60856cj.m92904m(C47810es.m84978r(gVar), this.f60387j);
    }

    /* renamed from: j */
    public final C60870cx mo27183j(String str, C65753ak akVar) {
        C58528ij ijVar = GellerDatabase.f60555b;
        if (((C58759qy) ijVar).f156534a.equals(akVar.name())) {
            C21988o oVar = new C21988o(this, str, akVar);
            return C60856cj.m92904m(C47810es.m84978r(oVar), this.f60380b);
        }
        C21990q qVar = new C21990q(this, str, akVar);
        return C60856cj.m92904m(C47810es.m84978r(qVar), this.f60387j);
    }

    /* renamed from: k */
    public final C60870cx mo27184k(String str, C65753ak akVar, String str2, int i, C63662ac acVar, MessageLite messageLite) {
        C58528ij ijVar = GellerDatabase.f60555b;
        if (((C58759qy) ijVar).f156534a.equals(akVar.name())) {
            C21993t tVar = new C21993t(this, str, akVar, str2, i, acVar, messageLite);
            return C60856cj.m92904m(C47810es.m84978r(tVar), this.f60380b);
        }
        C21994u uVar = new C21994u(this, str, akVar, str2, i, acVar, messageLite);
        return C60856cj.m92904m(C47810es.m84978r(uVar), this.f60387j);
    }

    /* renamed from: l */
    public final C60870cx mo27185l(String str, C65819cw cwVar) {
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        C65753ak b = C65753ak.m96797b(cwVar.f178929b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        C65753ak akVar = b;
        mo27175b(akVar).mo27239g(akVar);
        C58838bb.m90884s(!this.f60382d, "update() not allowed if Geller is read-only");
        C21983j jVar = new C21983j(this, str, cwVar, d, akVar);
        return C60856cj.m92904m(C47810es.m84978r(jVar), this.f60380b);
    }

    /* renamed from: m */
    public final C60870cx mo27186m(String str, C65753ak akVar, C65768az azVar) {
        C58838bb.m90884s(!this.f60382d, "write() not allowed if Geller is read-only");
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        C21985l lVar = new C21985l(this, str, akVar, azVar);
        return C60922j.m93044g(C60846c.m92879h(C60838bs.m92859i(C60856cj.m92905n(C47810es.m84965e(lVar), this.f60380b)), GellerException.class, new C21986m(this, akVar, d), this.f60387j), new C21987n(this, akVar, d), this.f60387j);
    }

    /* renamed from: n */
    public final C65063j mo27187n(String str, C58485gu guVar) {
        C58724pq pqVar = (C58724pq) guVar;
        String[] strArr = new String[pqVar.f156474d];
        for (int i = 0; i < pqVar.f156474d; i++) {
            strArr[i] = ((C65753ak) guVar.get(i)).name();
        }
        try {
            return (C65063j) C21946al.m41084a(nativeGetCorpusStats(this.f60381c, mo27174a(str), strArr), C65063j.f176192d);
        } catch (GellerException e) {
            ((C59052c) ((C59052c) ((C59052c) f60378a.mo56226d()).mo56382g(e)).mo56372aa(48031)).mo56386p("getCorpusStats call failed.");
            return C65063j.f176192d;
        }
    }

    public native byte[] nativeCleanupAll(long j, long j2);

    public native long nativeDelete(long j, long j2, String str, byte[] bArr);

    public native byte[] nativeGetCorpusStats(long j, long j2, String[] strArr);

    public native void nativeIncrementElementUsed(long j, long j2, String str, String str2, long j3);

    public native void nativePropagateDeletion(long j, long j2, byte[] bArr);

    public native byte[] nativeReadAndClearUsage(long j, long j2, String str, String[] strArr);

    public native byte[] nativeReadElements(long j, long j2, String str, byte[] bArr, byte[] bArr2);

    public native String[] nativeReadKeys(long j, long j2, String str);

    public native String[] nativeReadMetadata(long j, long j2, String str, String str2);

    public native byte[] nativeReadSnapshot(long j, long j2, String[] strArr, int i);

    public native byte[] nativeReadSyncConfig(long j, long j2, String str);

    /* access modifiers changed from: package-private */
    public native boolean nativeReconUpdate(long j, long j2, byte[] bArr);

    public native String[] nativeUpdate(long j, long j2, byte[] bArr);

    public native boolean nativeUpdateMetadata(long j, long j2, byte[] bArr, boolean z);

    public native void nativeWrite(long j, long j2, String str, String[] strArr, long j3, byte[] bArr);

    public native void nativeWriteMetadata(long j, long j2, String str, String str2, String str3);

    /* JADX WARNING: type inference failed for: r12v4, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protos.p4985f.p5030q.p5032b.C65033ar mo27204o(java.lang.String r10, com.google.protos.p5129p.p5131b.C65753ak r11, java.lang.String r12, com.google.protos.p4985f.p5030q.p5032b.C65031ap r13, com.google.protos.p4874ap.p4875a.p4876a.C63662ac r14) {
        /*
            r9 = this;
            com.google.common.base.cz r0 = com.google.common.android.p4521a.C58274c.f155808a
            com.google.common.base.ci r0 = com.google.common.base.C58872ci.m90947d(r0)
            if (r12 == 0) goto L_0x0021
            com.google.protobuf.bn r13 = r13.toBuilder()
            com.google.protos.f.q.b.am r13 = (com.google.protos.p4985f.p5030q.p5032b.C65028am) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.protos.f.q.b.ap r1 = (com.google.protos.p4985f.p5030q.p5032b.C65031ap) r1
            r2 = 1
            r1.f176103b = r2
            r1.f176104c = r12
            com.google.protobuf.bv r12 = r13.build()
            r13 = r12
            com.google.protos.f.q.b.ap r13 = (com.google.protos.p4985f.p5030q.p5032b.C65031ap) r13
        L_0x0021:
            com.google.protos.f.q.b.ar r12 = com.google.protos.p4985f.p5030q.p5032b.C65033ar.f176111c
            long r2 = r9.f60381c     // Catch:{ GellerException -> 0x0057 }
            long r4 = r9.mo27174a(r10)     // Catch:{ GellerException -> 0x0057 }
            java.lang.String r6 = r11.name()     // Catch:{ GellerException -> 0x0057 }
            byte[] r7 = r13.toByteArray()     // Catch:{ GellerException -> 0x0057 }
            byte[] r8 = r14.toByteArray()     // Catch:{ GellerException -> 0x0057 }
            r1 = r9
            byte[] r10 = r1.nativeReadElements(r2, r4, r6, r7, r8)     // Catch:{ GellerException -> 0x0057 }
            int r13 = r10.length     // Catch:{ GellerException -> 0x0057 }
            long r13 = (long) r13     // Catch:{ GellerException -> 0x0057 }
            r1 = 5000000(0x4c4b40, double:2.470328E-317)
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x004d
            com.google.protos.f.q.b.ar r13 = com.google.protos.p4985f.p5030q.p5032b.C65033ar.f176111c     // Catch:{ GellerException -> 0x0057 }
            com.google.protobuf.MessageLite r10 = com.google.android.libraries.geller.portable.C21946al.m41084a(r10, r13)     // Catch:{ GellerException -> 0x0057 }
            com.google.protos.f.q.b.ar r10 = (com.google.protos.p4985f.p5030q.p5032b.C65033ar) r10     // Catch:{ GellerException -> 0x0057 }
            r12 = r10
            goto L_0x0066
        L_0x004d:
            com.google.android.libraries.geller.portable.GellerException r10 = new com.google.android.libraries.geller.portable.GellerException     // Catch:{ GellerException -> 0x0057 }
            java.lang.String r13 = "Result of read exceeded maximum read result size."
            com.google.net.a.a.b r14 = com.google.net.p4726a.p4727a.C62722b.UNKNOWN     // Catch:{ GellerException -> 0x0057 }
            r10.<init>((com.google.net.p4726a.p4727a.C62722b) r14, (java.lang.String) r13)     // Catch:{ GellerException -> 0x0057 }
            throw r10     // Catch:{ GellerException -> 0x0057 }
        L_0x0057:
            r10 = move-exception
            com.google.common.f.e r13 = f60378a
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r14 = "Geller read failed."
            r1 = 48032(0xbba0, float:6.7307E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r10)).mo56372aa(r1)).mo56386p(r14)
        L_0x0066:
            com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback r10 = r9.mo27175b(r11)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r13 = r0.mo56158a(r13)
            r10.mo27241i(r11, r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.Geller.mo27204o(java.lang.String, com.google.protos.p.b.ak, java.lang.String, com.google.protos.f.q.b.ap, com.google.protos.ap.a.a.ac):com.google.protos.f.q.b.ar");
    }

    /* renamed from: p */
    public final synchronized void mo27205p(String str, GellerDatabase gellerDatabase) {
        if (this.f60388k.containsKey(str)) {
            long longValue = ((Long) this.f60388k.get(str)).longValue();
            this.f60388k.remove(str);
            nativeDestroyDatabase(longValue);
        }
        if (gellerDatabase != null) {
            gellerDatabase.mo27245c();
        }
    }

    /* renamed from: q */
    public final synchronized void mo27206q(C58528ij ijVar) {
        File parentFile = this.f60386i.getDatabasePath("geller").getParentFile();
        if (parentFile == null) {
            ((C59052c) ((C59052c) f60378a.mo56226d()).mo56372aa(48041)).mo56386p("Cannot get database directory.");
            return;
        }
        File[] listFiles = parentFile.listFiles(C21991r.f60661a);
        if (listFiles != null) {
            for (File file : listFiles) {
                String substring = file.getName().substring(0, file.getName().indexOf(".db"));
                String substring2 = substring.substring(16);
                if (!ijVar.contains(substring2)) {
                    this.f60386i.deleteDatabase(String.valueOf(substring).concat(".db"));
                    this.f60389l.remove(substring2);
                    this.f60388k.remove(substring2);
                    C21964l.m41188g(new File(this.f60386i.getFilesDir(), C60790c.m92793a("geller", substring2)));
                }
            }
        }
    }

    /* renamed from: r */
    public final C60870cx mo27207r(String str, C65753ak akVar, long j, long j2, C63662ac acVar) {
        C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
        C65029an anVar = (C65029an) C65030ao.f176095d.createBuilder();
        anVar.copyOnWrite();
        C65030ao aoVar = (C65030ao) anVar.instance;
        aoVar.f176097a |= 1;
        aoVar.f176098b = j;
        anVar.copyOnWrite();
        C65030ao aoVar2 = (C65030ao) anVar.instance;
        aoVar2.f176097a |= 2;
        aoVar2.f176099c = j2;
        amVar.copyOnWrite();
        C65031ap apVar = (C65031ap) amVar.instance;
        C65030ao aoVar3 = (C65030ao) anVar.build();
        aoVar3.getClass();
        apVar.f176106e = aoVar3;
        apVar.f176102a |= 8;
        return mo27182i(str, akVar, (String) null, (C65031ap) amVar.build(), acVar);
    }

    /* renamed from: s */
    public final C60870cx mo27208s(String str, C65753ak akVar, int i, C63662ac acVar) {
        C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
        amVar.copyOnWrite();
        C65031ap apVar = (C65031ap) amVar.instance;
        apVar.f176102a |= 4;
        apVar.f176105d = i;
        return mo27182i(str, akVar, (String) null, (C65031ap) amVar.build(), acVar);
    }

    /* renamed from: t */
    public final void mo27209t(String str, C65753ak akVar, C65025aj ajVar) {
        GellerDatabase c = mo27176c(str);
        if (c == null) {
            ((C59052c) ((C59052c) f60378a.mo56226d()).mo56372aa(48024)).mo56389s("The GellerDatabase is null, skipping marking status for corpus %s", akVar.name());
        } else {
            c.mo27243a(akVar.name(), ajVar);
        }
    }

    /* renamed from: u */
    public final C60870cx mo27210u(String str, C58528ij ijVar) {
        C21936ab abVar = new C21936ab(this, ijVar, str);
        return C60856cj.m92905n(C47810es.m84965e(abVar), this.f60380b);
    }
}
