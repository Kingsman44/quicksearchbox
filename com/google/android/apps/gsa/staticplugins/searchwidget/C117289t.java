package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p337aa.C6619f;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.t */
/* compiled from: PG */
public final class C117289t {

    /* renamed from: a */
    static final long f325566a = Duration.ofHours(4).toMillis();

    /* renamed from: b */
    static final long f325567b = Duration.ofMinutes(1).toMillis();

    /* renamed from: c */
    static final long f325568c = Duration.ofMinutes(10).toMillis();

    /* renamed from: d */
    static final long f325569d = Duration.ofHours(4).toMillis();

    /* renamed from: e */
    static final long f325570e = Duration.ofSeconds(5).toMillis();

    /* renamed from: k */
    public static final /* synthetic */ int f325571k = 0;

    /* renamed from: l */
    private static final C59071e f325572l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.t");

    /* renamed from: f */
    public final C86124t f325573f;

    /* renamed from: g */
    public final C86338r f325574g;

    /* renamed from: h */
    public final C22871g f325575h;

    /* renamed from: i */
    public final C68214a f325576i;

    /* renamed from: j */
    public final C117275f f325577j;

    /* renamed from: m */
    private final C21370a f325578m;

    /* renamed from: n */
    private final C85929cw f325579n;

    /* renamed from: o */
    private final C68214a f325580o;

    /* renamed from: p */
    private final C89859i f325581p;

    /* renamed from: q */
    private final C89257aa f325582q;

    /* renamed from: r */
    private final SortedSet f325583r;

    /* renamed from: s */
    private long f325584s;

    /* renamed from: t */
    private long f325585t;

    /* renamed from: u */
    private Random f325586u = new Random();

    /* renamed from: v */
    private final C84466a f325587v;

    static {
        Duration.ofMinutes(1).toMillis();
        Duration.ofMinutes(5).toMillis();
        new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.US);
    }

    public C117289t(C86124t tVar, C86338r rVar, C21370a aVar, C85929cw cwVar, C84466a aVar2, C68214a aVar3, C22871g gVar, C68214a aVar4, C89859i iVar, C89257aa aaVar, C117275f fVar) {
        DataInputStream dataInputStream;
        TreeSet treeSet = new TreeSet(new C117288s());
        this.f325583r = treeSet;
        this.f325573f = tVar;
        this.f325574g = rVar;
        this.f325578m = aVar;
        this.f325579n = cwVar;
        this.f325587v = aVar2;
        this.f325580o = aVar3;
        this.f325575h = gVar;
        this.f325576i = aVar4;
        this.f325581p = iVar;
        this.f325582q = aaVar;
        this.f325577j = fVar;
        this.f325584s = rVar.getLong("network_time_offset", -1);
        this.f325585t = rVar.getLong("network_time_sync_clock_offset", -1);
        byte[] e = rVar.mo80079e("search_widget_doodle_schedule", new byte[0]);
        treeSet.clear();
        if (e != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
            HashSet hashSet = new HashSet();
            try {
                dataInputStream = new DataInputStream(byteArrayInputStream);
                while (dataInputStream.available() > 0) {
                    hashSet.add((C6619f) C6619f.parseDelimitedFrom(C6619f.f19675e, dataInputStream, C62921ba.m95368a()));
                }
                dataInputStream.close();
            } catch (IOException e2) {
                C59104x c = f325572l.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DoodleScheduleMgr");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(32672)).mo56386p("Error loading serialized cards from preferences");
            } catch (Throwable th) {
                C117281l.m194905a(th, th);
            }
            treeSet.addAll(hashSet);
            return;
        }
        return;
        throw th;
    }

    /* renamed from: i */
    public static final void m194912i() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        return false;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m194913j() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.apps.gsa.search.core.i.t r0 = r8.f325573f     // Catch:{ all -> 0x003b }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246670X     // Catch:{ all -> 0x003b }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            monitor-exit(r8)
            return r1
        L_0x000e:
            com.google.android.libraries.f.a r0 = r8.f325578m     // Catch:{ all -> 0x003b }
            long r2 = r0.mo26870b()     // Catch:{ all -> 0x003b }
            com.google.android.libraries.f.a r0 = r8.f325578m     // Catch:{ all -> 0x003b }
            long r4 = r0.mo26871c()     // Catch:{ all -> 0x003b }
            long r6 = r8.f325585t     // Catch:{ all -> 0x003b }
            long r2 = r2 - r4
            long r6 = r6 - r2
            long r2 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x003b }
            long r4 = r8.f325585t     // Catch:{ all -> 0x003b }
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            long r4 = r8.f325584s     // Catch:{ all -> 0x003b }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            long r4 = f325567b     // Catch:{ all -> 0x003b }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0038
            monitor-exit(r8)
            return r1
        L_0x0038:
            monitor-exit(r8)
            r0 = 0
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117289t.m194913j():boolean");
    }

    /* renamed from: a */
    public final C60870cx mo103231a() {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C85929cw cwVar = this.f325579n;
            C85981c h = cwVar.mo79568h(cwVar.mo79564d(cwVar.mo79568h(cwVar.mo79563b(false)).f232493a, "/async/ddlsch"));
            h.mo79641g();
            UriRequest b = cwVar.mo79566f(h).mo79626b((C85966dl) null);
            Uri uri = b.f236331a;
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri.toString());
            c.mo82991c(b.mo81502a());
            c.f241244j = true;
            c.f241245k = 19;
            C89020ar a = c.mo82989a();
            return this.f325575h.mo28209i(((C87242k) this.f325580o.mo27525b()).mo80852a(this.f325587v.mo78026b("RefreshDoodleScheduleTask", C118575h.GRAPH_REFRESH_DOODLE_SCHEDULE_TASK, C118575h.GRAPH_REFRESH_DOODLE_SCHEDULE_TASK), C89066v.f241382a, new C89018ap(a, C89009ag.f241207b)), "processDoodleScheduleResponse", C117287r.f325565a);
        } catch (MalformedURLException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: b */
    public final synchronized C60870cx mo103232b() {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f325582q.mo83227t().length == 0) {
            return C118826c.f331423b;
        }
        mo103237g(C89849ae.WIDGET_DOODLE_SCHEDULE_UPDATE_START);
        if (m194913j()) {
            if (!this.f325573f.mo79746e(C89985ax.f246687aN)) {
                cxVar = C118826c.f331423b;
                return this.f325575h.mo28205e(this.f325575h.mo28209i(this.f325575h.mo28210j(cxVar, "downloadDoodleSchedule", new C117284o(this)), "processDoodleSchedule", new C117285p(this)), "handleDoodleScheduleDownloadFailure", Throwable.class, new C117286q(this));
            }
        }
        cxVar = this.f325577j.mo103227a();
        return this.f325575h.mo28205e(this.f325575h.mo28209i(this.f325575h.mo28210j(cxVar, "downloadDoodleSchedule", new C117284o(this)), "processDoodleSchedule", new C117285p(this)), "handleDoodleScheduleDownloadFailure", Throwable.class, new C117286q(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Optional mo103233c() {
        Optional d = mo103234d();
        Optional e = mo103235e();
        if (e.isEmpty() || d.isEmpty() || ((Long) d.get()).longValue() < ((C6619f) e.get()).f19678b) {
            return Optional.empty();
        }
        return Optional.m71637of(Long.valueOf(Math.max(((C6619f) e.get()).f19679c - ((Long) d.get()).longValue(), 0)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized Optional mo103234d() {
        if (this.f325573f.mo79746e(C89985ax.f246670X)) {
            return Optional.m71637of(Long.valueOf(this.f325578m.mo26870b()));
        } else if (m194913j()) {
            return Optional.m71637of(Long.valueOf(this.f325578m.mo26871c() + this.f325584s));
        } else {
            return Optional.empty();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized Optional mo103235e() {
        Optional d = mo103234d();
        if (!this.f325583r.isEmpty()) {
            if (!d.isEmpty()) {
                long longValue = ((Long) d.get()).longValue();
                for (C6619f fVar : this.f325583r) {
                    if (fVar.f19680d && fVar.f19679c > longValue) {
                        return Optional.m71637of(fVar);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0242  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo103236f(com.google.p4283bv.p4284a.p4286b.C56608b r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.apps.gsa.search.core.preferences.r r0 = r10.f325574g     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.search.core.preferences.q r0 = r0.mo80076b()     // Catch:{ all -> 0x029d }
            long r1 = r11.f151138b     // Catch:{ all -> 0x029d }
            j$.time.Duration r1 = p3186j$.time.Duration.ofSeconds(r1)     // Catch:{ all -> 0x029d }
            long r1 = r1.toMillis()     // Catch:{ all -> 0x029d }
            com.google.android.libraries.f.a r3 = r10.f325578m     // Catch:{ all -> 0x029d }
            long r3 = r3.mo26871c()     // Catch:{ all -> 0x029d }
            long r1 = r1 - r3
            r10.f325584s = r1     // Catch:{ all -> 0x029d }
            com.google.android.libraries.f.a r1 = r10.f325578m     // Catch:{ all -> 0x029d }
            long r1 = r1.mo26870b()     // Catch:{ all -> 0x029d }
            long r1 = r1 - r3
            r10.f325585t = r1     // Catch:{ all -> 0x029d }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x029d }
            java.lang.String r1 = "network_time_offset"
            long r2 = r10.f325584s     // Catch:{ all -> 0x029d }
            r0.mo80072g(r1, r2)     // Catch:{ all -> 0x029d }
            java.lang.String r1 = "network_time_sync_clock_offset"
            long r2 = r10.f325585t     // Catch:{ all -> 0x029d }
            r0.mo80072g(r1, r2)     // Catch:{ all -> 0x029d }
            com.google.protobuf.cq r11 = r11.f151139c     // Catch:{ all -> 0x029d }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x029d }
            r1.<init>()     // Catch:{ all -> 0x029d }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x029d }
        L_0x003e:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x029d }
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x029d }
            com.google.aa.f r2 = (com.google.p337aa.C6619f) r2     // Catch:{ all -> 0x029d }
            com.google.aa.f r3 = com.google.p337aa.C6619f.f19675e     // Catch:{ all -> 0x029d }
            com.google.protobuf.bn r3 = r3.createBuilder(r2)     // Catch:{ all -> 0x029d }
            com.google.aa.e r3 = (com.google.p337aa.C6618e) r3     // Catch:{ all -> 0x029d }
            long r4 = r2.f19678b     // Catch:{ all -> 0x029d }
            j$.time.Duration r4 = p3186j$.time.Duration.ofSeconds(r4)     // Catch:{ all -> 0x029d }
            long r4 = r4.toMillis()     // Catch:{ all -> 0x029d }
            r3.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ all -> 0x029d }
            com.google.aa.f r6 = (com.google.p337aa.C6619f) r6     // Catch:{ all -> 0x029d }
            int r7 = r6.f19677a     // Catch:{ all -> 0x029d }
            r7 = r7 | 2
            r6.f19677a = r7     // Catch:{ all -> 0x029d }
            r6.f19678b = r4     // Catch:{ all -> 0x029d }
            long r4 = r2.f19679c     // Catch:{ all -> 0x029d }
            j$.time.Duration r2 = p3186j$.time.Duration.ofSeconds(r4)     // Catch:{ all -> 0x029d }
            long r4 = r2.toMillis()     // Catch:{ all -> 0x029d }
            r3.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r2 = r3.instance     // Catch:{ all -> 0x029d }
            com.google.aa.f r2 = (com.google.p337aa.C6619f) r2     // Catch:{ all -> 0x029d }
            int r6 = r2.f19677a     // Catch:{ all -> 0x029d }
            r6 = r6 | 4
            r2.f19677a = r6     // Catch:{ all -> 0x029d }
            r2.f19679c = r4     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ all -> 0x029d }
            com.google.aa.f r2 = (com.google.p337aa.C6619f) r2     // Catch:{ all -> 0x029d }
            r1.add(r2)     // Catch:{ all -> 0x029d }
            goto L_0x003e
        L_0x008e:
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x029d }
            r11.<init>()     // Catch:{ all -> 0x029d }
            java.util.SortedSet r2 = r10.f325583r     // Catch:{ all -> 0x029d }
            r11.addAll(r2)     // Catch:{ all -> 0x029d }
            r11.addAll(r1)     // Catch:{ all -> 0x029d }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x029d }
            r1.<init>()     // Catch:{ all -> 0x029d }
            j$.util.Optional r2 = r10.mo103234d()     // Catch:{ all -> 0x029d }
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x029d }
        L_0x00a8:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x029d }
            if (r4 == 0) goto L_0x00ce
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x029d }
            com.google.aa.f r4 = (com.google.p337aa.C6619f) r4     // Catch:{ all -> 0x029d }
            boolean r5 = r2.isPresent()     // Catch:{ all -> 0x029d }
            if (r5 == 0) goto L_0x00a8
            long r5 = r4.f19679c     // Catch:{ all -> 0x029d }
            java.lang.Object r7 = r2.get()     // Catch:{ all -> 0x029d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x029d }
            long r7 = r7.longValue()     // Catch:{ all -> 0x029d }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a8
            r1.add(r4)     // Catch:{ all -> 0x029d }
            goto L_0x00a8
        L_0x00ce:
            r11.removeAll(r1)     // Catch:{ all -> 0x029d }
            java.util.SortedSet r1 = r10.f325583r     // Catch:{ all -> 0x029d }
            r1.clear()     // Catch:{ all -> 0x029d }
            java.util.SortedSet r1 = r10.f325583r     // Catch:{ all -> 0x029d }
            r1.addAll(r11)     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f325573f     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246687aN     // Catch:{ all -> 0x029d }
            boolean r11 = r11.mo79746e(r1)     // Catch:{ all -> 0x029d }
            if (r11 == 0) goto L_0x015c
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x029d }
            r11.<init>()     // Catch:{ all -> 0x029d }
            java.util.SortedSet r1 = r10.f325583r     // Catch:{ all -> 0x029d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x029d }
        L_0x00f0:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x029d }
            if (r2 == 0) goto L_0x0152
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x029d }
            com.google.aa.f r2 = (com.google.p337aa.C6619f) r2     // Catch:{ all -> 0x029d }
            boolean r3 = r2.f19680d     // Catch:{ all -> 0x029d }
            if (r3 == 0) goto L_0x00f0
            com.google.aa.f r3 = com.google.p337aa.C6619f.f19675e     // Catch:{ all -> 0x029d }
            com.google.protobuf.bn r2 = r3.createBuilder(r2)     // Catch:{ all -> 0x029d }
            com.google.aa.e r2 = (com.google.p337aa.C6618e) r2     // Catch:{ all -> 0x029d }
            com.google.android.libraries.f.a r3 = r10.f325578m     // Catch:{ all -> 0x029d }
            long r3 = r3.mo26870b()     // Catch:{ all -> 0x029d }
            r5 = 1
            j$.time.Duration r5 = p3186j$.time.Duration.ofMinutes(r5)     // Catch:{ all -> 0x029d }
            long r5 = r5.toMillis()     // Catch:{ all -> 0x029d }
            r2.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x029d }
            com.google.aa.f r7 = (com.google.p337aa.C6619f) r7     // Catch:{ all -> 0x029d }
            int r8 = r7.f19677a     // Catch:{ all -> 0x029d }
            r8 = r8 | 2
            r7.f19677a = r8     // Catch:{ all -> 0x029d }
            long r3 = r3 + r5
            r7.f19678b = r3     // Catch:{ all -> 0x029d }
            com.google.android.libraries.f.a r3 = r10.f325578m     // Catch:{ all -> 0x029d }
            long r3 = r3.mo26870b()     // Catch:{ all -> 0x029d }
            r5 = 10
            j$.time.Duration r5 = p3186j$.time.Duration.ofMinutes(r5)     // Catch:{ all -> 0x029d }
            long r5 = r5.toMillis()     // Catch:{ all -> 0x029d }
            r2.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x029d }
            com.google.aa.f r7 = (com.google.p337aa.C6619f) r7     // Catch:{ all -> 0x029d }
            int r8 = r7.f19677a     // Catch:{ all -> 0x029d }
            r8 = r8 | 4
            r7.f19677a = r8     // Catch:{ all -> 0x029d }
            long r3 = r3 + r5
            r7.f19679c = r3     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x029d }
            com.google.aa.f r2 = (com.google.p337aa.C6619f) r2     // Catch:{ all -> 0x029d }
            r11.add(r2)     // Catch:{ all -> 0x029d }
            goto L_0x00f0
        L_0x0152:
            java.util.SortedSet r1 = r10.f325583r     // Catch:{ all -> 0x029d }
            r1.clear()     // Catch:{ all -> 0x029d }
            java.util.SortedSet r1 = r10.f325583r     // Catch:{ all -> 0x029d }
            r1.addAll(r11)     // Catch:{ all -> 0x029d }
        L_0x015c:
            java.util.SortedSet r11 = r10.f325583r     // Catch:{ all -> 0x029d }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x029d }
            r1.<init>()     // Catch:{ all -> 0x029d }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x018e }
            r2.<init>(r1)     // Catch:{ IOException -> 0x018e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0184 }
        L_0x016c:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x0184 }
            if (r3 == 0) goto L_0x017c
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x0184 }
            com.google.aa.f r3 = (com.google.p337aa.C6619f) r3     // Catch:{ all -> 0x0184 }
            r3.writeDelimitedTo(r2)     // Catch:{ all -> 0x0184 }
            goto L_0x016c
        L_0x017c:
            byte[] r11 = r1.toByteArray()     // Catch:{ all -> 0x0184 }
            r2.close()     // Catch:{ IOException -> 0x018e }
            goto L_0x01a6
        L_0x0184:
            r11 = move-exception
            r2.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r1 = move-exception
            com.google.android.apps.gsa.staticplugins.searchwidget.C117281l.m194905a(r11, r1)     // Catch:{ IOException -> 0x018e }
        L_0x018d:
            throw r11     // Catch:{ IOException -> 0x018e }
        L_0x018e:
            r11 = move-exception
            com.google.common.f.e r1 = f325572l     // Catch:{ all -> 0x029d }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x029d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x029d }
            java.lang.String r3 = "DoodleScheduleMgr"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x029d }
            java.lang.String r2 = "Failed serializing schedule!"
            r3 = 32680(0x7fa8, float:4.5794E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r11)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x029d }
            r11 = 0
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x029d }
        L_0x01a6:
            java.lang.String r1 = "search_widget_doodle_schedule"
            r0.mo80068c(r1, r11)     // Catch:{ all -> 0x029d }
            r0.apply()     // Catch:{ all -> 0x029d }
            j$.util.Optional r11 = r10.mo103234d()     // Catch:{ all -> 0x029d }
            j$.util.Optional r0 = r10.mo103235e()     // Catch:{ all -> 0x029d }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x029d }
            if (r1 != 0) goto L_0x0238
            boolean r1 = r11.isEmpty()     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x01c3
            goto L_0x0238
        L_0x01c3:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x029d }
            com.google.aa.f r1 = (com.google.p337aa.C6619f) r1     // Catch:{ all -> 0x029d }
            long r1 = r1.f19678b     // Catch:{ all -> 0x029d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x029d }
            com.google.aa.f r0 = (com.google.p337aa.C6619f) r0     // Catch:{ all -> 0x029d }
            long r3 = r0.f19679c     // Catch:{ all -> 0x029d }
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x029d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x029d }
            long r5 = r0.longValue()     // Catch:{ all -> 0x029d }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fa
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x029d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x029d }
            long r5 = r0.longValue()     // Catch:{ all -> 0x029d }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01fa
            r0 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x029d }
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)     // Catch:{ all -> 0x029d }
            goto L_0x023c
        L_0x01fa:
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f325573f     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246689aP     // Catch:{ all -> 0x029d }
            long r3 = r0.mo79743a(r3)     // Catch:{ all -> 0x029d }
            j$.time.Duration r0 = p3186j$.time.Duration.ofMinutes(r3)     // Catch:{ all -> 0x029d }
            long r3 = r0.toMillis()     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f325573f     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246690aQ     // Catch:{ all -> 0x029d }
            long r5 = r0.mo79743a(r5)     // Catch:{ all -> 0x029d }
            j$.time.Duration r0 = p3186j$.time.Duration.ofMinutes(r5)     // Catch:{ all -> 0x029d }
            long r5 = r0.toMillis()     // Catch:{ all -> 0x029d }
            long r1 = r1 + r3
            java.util.Random r0 = r10.f325586u     // Catch:{ all -> 0x029d }
            int r3 = (int) r5     // Catch:{ all -> 0x029d }
            int r0 = r0.nextInt(r3)     // Catch:{ all -> 0x029d }
            long r3 = (long) r0     // Catch:{ all -> 0x029d }
            long r1 = r1 + r3
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x029d }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x029d }
            long r3 = r11.longValue()     // Catch:{ all -> 0x029d }
            long r1 = r1 - r3
            java.lang.Long r11 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x029d }
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)     // Catch:{ all -> 0x029d }
            goto L_0x023c
        L_0x0238:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x029d }
        L_0x023c:
            boolean r0 = r11.isPresent()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0296
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x029d }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x029d }
            long r0 = r11.longValue()     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.ag r11 = com.google.android.apps.gsa.tasks.C118472ag.f328819i     // Catch:{ all -> 0x029d }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.af r11 = (com.google.android.apps.gsa.tasks.C118471af) r11     // Catch:{ all -> 0x029d }
            r11.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r2 = r11.instance     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2     // Catch:{ all -> 0x029d }
            int r3 = r2.f328821a     // Catch:{ all -> 0x029d }
            r4 = 1
            r3 = r3 | r4
            r2.f328821a = r3     // Catch:{ all -> 0x029d }
            r2.f328822b = r0     // Catch:{ all -> 0x029d }
            long r0 = f325566a     // Catch:{ all -> 0x029d }
            r11.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r2 = r11.instance     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2     // Catch:{ all -> 0x029d }
            int r3 = r2.f328821a     // Catch:{ all -> 0x029d }
            r3 = r3 | 2
            r2.f328821a = r3     // Catch:{ all -> 0x029d }
            r2.f328823c = r0     // Catch:{ all -> 0x029d }
            r11.copyOnWrite()     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r0 = r11.instance     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.ag r0 = (com.google.android.apps.gsa.tasks.C118472ag) r0     // Catch:{ all -> 0x029d }
            r0.f328824d = r4     // Catch:{ all -> 0x029d }
            int r1 = r0.f328821a     // Catch:{ all -> 0x029d }
            r1 = r1 | 4
            r0.f328821a = r1     // Catch:{ all -> 0x029d }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.ag r11 = (com.google.android.apps.gsa.tasks.C118472ag) r11     // Catch:{ all -> 0x029d }
            dagger.a r0 = r10.f325576i     // Catch:{ all -> 0x029d }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.t r0 = (com.google.android.apps.gsa.tasks.C118561t) r0     // Catch:{ all -> 0x029d }
            com.google.android.apps.gsa.tasks.by r1 = com.google.android.apps.gsa.tasks.C118522by.DOODLE_DATA_UPDATE_TASK     // Catch:{ all -> 0x029d }
            r0.mo103754e(r1, r11)     // Catch:{ all -> 0x029d }
        L_0x0296:
            java.lang.String r11 = "widget_doodle_schedule_download_retry_count"
            r10.mo103238h(r11)     // Catch:{ all -> 0x029d }
            monitor-exit(r10)
            return
        L_0x029d:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x02a1
        L_0x02a0:
            throw r11
        L_0x02a1:
            goto L_0x02a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117289t.mo103236f(com.google.bv.a.b.b):void");
    }

    /* renamed from: g */
    public final void mo103237g(C89849ae aeVar) {
        if (this.f325573f.mo79746e(C89985ax.f246658L)) {
            this.f325581p.mo83702b(aeVar);
        }
    }

    /* renamed from: h */
    public final void mo103238h(String str) {
        C86337q b = this.f325574g.mo80076b();
        b.mo80075j(str);
        b.apply();
    }
}
