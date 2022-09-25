package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import android.media.MediaPlayer;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14106ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14534mu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14535mv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14536mw;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ah */
/* compiled from: PG */
public final class C14668ah implements C14985g {

    /* renamed from: a */
    public static final C59071e f44291a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ah");

    /* renamed from: b */
    public Optional f44292b = Optional.empty();

    /* renamed from: c */
    public String f44293c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public final Context f44294d;

    /* renamed from: e */
    public final AtomicInteger f44295e = new AtomicInteger(0);

    /* renamed from: f */
    public final C14106ag f44296f;

    /* renamed from: g */
    int f44297g = 1;

    /* renamed from: h */
    private Optional f44298h = Optional.empty();

    /* renamed from: i */
    private Optional f44299i = Optional.empty();

    /* renamed from: j */
    private final C60888db f44300j;

    /* renamed from: k */
    private final C86124t f44301k;

    public C14668ah(Context context, C86124t tVar, C14106ag agVar, C60888db dbVar) {
        this.f44294d = context;
        this.f44301k = tVar;
        this.f44296f = agVar;
        this.f44300j = dbVar;
    }

    /* renamed from: k */
    public static void m30746k(String str, C14749d dVar) {
        C14534mu muVar = (C14534mu) C14536mw.f43962l.createBuilder();
        muVar.copyOnWrite();
        ((C14536mw) muVar.instance).f43964a = C14535mv.m30635b(10);
        muVar.copyOnWrite();
        str.getClass();
        ((C14536mw) muVar.instance).f43968e = str;
        C14536mw mwVar = (C14536mw) muVar.build();
        C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
        baVar.copyOnWrite();
        C14219bc bcVar = (C14219bc) baVar.instance;
        mwVar.getClass();
        bcVar.f43039b = mwVar;
        bcVar.f43038a = 4;
        dVar.mo21716c((C14219bc) baVar.build());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final synchronized void mo21504d() {
        mo21638h();
        if (this.f44292b.isPresent()) {
            ((MediaPlayer) this.f44292b.get()).stop();
            ((MediaPlayer) this.f44292b.get()).release();
            this.f44292b = Optional.empty();
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final synchronized String mo21637f() {
        return this.f44293c;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final synchronized void mo21638h() {
        this.f44298h.ifPresent(C14665ae.f44288a);
        this.f44299i.ifPresent(C14666af.f44289a);
        mo21641l();
        this.f44293c = BuildConfig.FLAVOR;
        if (this.f44297g != 1) {
            this.f44297g = 1;
            this.f44296f.mo21411b(C37182a.f97923cw.mo40813g(), Optional.empty());
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21639i(com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f44297g     // Catch:{ all -> 0x0083 }
            r1 = 2
            if (r0 != r1) goto L_0x0061
            r4 = 3
            r3.f44297g = r4     // Catch:{ all -> 0x0083 }
            j$.util.Optional r4 = r3.f44292b     // Catch:{ all -> 0x0083 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0083 }
            r0 = 0
            if (r4 == 0) goto L_0x0039
            android.content.Context r4 = r3.f44294d     // Catch:{ all -> 0x0083 }
            r1 = 2132017174(0x7f140016, float:1.9672619E38)
            android.media.MediaPlayer r4 = android.media.MediaPlayer.create(r4, r1)     // Catch:{ all -> 0x0083 }
            r4.getClass()
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ all -> 0x0083 }
            r3.f44292b = r4     // Catch:{ all -> 0x0083 }
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f44295e     // Catch:{ all -> 0x0083 }
            r4.set(r0)     // Catch:{ all -> 0x0083 }
            j$.util.Optional r4 = r3.f44292b     // Catch:{ all -> 0x0083 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0083 }
            android.media.MediaPlayer r4 = (android.media.MediaPlayer) r4     // Catch:{ all -> 0x0083 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ag r1 = new com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ag     // Catch:{ all -> 0x0083 }
            r1.<init>(r3)     // Catch:{ all -> 0x0083 }
            r4.setOnCompletionListener(r1)     // Catch:{ all -> 0x0083 }
        L_0x0039:
            j$.util.Optional r4 = r3.f44292b     // Catch:{ all -> 0x0083 }
            boolean r4 = r4.isPresent()     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            j$.util.Optional r4 = r3.f44292b     // Catch:{ all -> 0x0083 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0083 }
            android.media.MediaPlayer r4 = (android.media.MediaPlayer) r4     // Catch:{ all -> 0x0083 }
            boolean r4 = r4.isPlaying()     // Catch:{ all -> 0x0083 }
            if (r4 != 0) goto L_0x0081
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f44295e     // Catch:{ all -> 0x0083 }
            r4.set(r0)     // Catch:{ all -> 0x0083 }
            j$.util.Optional r4 = r3.f44292b     // Catch:{ all -> 0x0083 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0083 }
            android.media.MediaPlayer r4 = (android.media.MediaPlayer) r4     // Catch:{ all -> 0x0083 }
            r4.start()     // Catch:{ all -> 0x0083 }
            monitor-exit(r3)
            return
        L_0x0061:
            r1 = 4
            if (r0 != r1) goto L_0x0081
            r3.mo21638h()     // Catch:{ all -> 0x0083 }
            com.google.android.libraries.assistant.auto.tng.morris.c.ag r0 = r3.f44296f     // Catch:{ all -> 0x0083 }
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97924cx     // Catch:{ all -> 0x0083 }
            com.google.android.libraries.search.b.i.a r1 = r1.mo40813g()     // Catch:{ all -> 0x0083 }
            j$.util.Optional r2 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0083 }
            r0.mo21411b(r1, r2)     // Catch:{ all -> 0x0083 }
            com.google.android.libraries.assistant.auto.tng.morris.e.mt r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt.END_FAILURE_CANNOT_CONNECT     // Catch:{ all -> 0x0083 }
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31503a(r0)     // Catch:{ all -> 0x0083 }
            r4.mo21716c(r0)     // Catch:{ all -> 0x0083 }
            monitor-exit(r3)
            return
        L_0x0081:
            monitor-exit(r3)
            return
        L_0x0083:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14668ah.mo21639i(com.google.android.libraries.assistant.auto.tng.morris.framework.d):void");
    }

    /* renamed from: j */
    public final synchronized void mo21640j(C14749d dVar) {
        mo21638h();
        this.f44298h = Optional.m71637of(this.f44300j.mo29164d(new C14662ab(this, dVar), this.f44301k.mo79743a(C90051dc.f248861bP), TimeUnit.MILLISECONDS));
        this.f44299i.ifPresent(C14663ac.f44285a);
        this.f44299i = Optional.m71637of(this.f44300j.mo29164d(new C14664ad(this, dVar), this.f44301k.mo79743a(C90051dc.f248802aJ), TimeUnit.MILLISECONDS));
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: l */
    public final void mo21641l() {
        if (this.f44292b.isPresent() && ((MediaPlayer) this.f44292b.get()).isPlaying()) {
            ((MediaPlayer) this.f44292b.get()).stop();
            ((MediaPlayer) this.f44292b.get()).prepareAsync();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: m */
    public final synchronized boolean mo21642m() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x000f }
            int r0 = r2.f44297g     // Catch:{ all -> 0x000c }
            r1 = 1
            if (r0 == r1) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r2)
            return r1
        L_0x000c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14668ah.mo21642m():boolean");
    }
}
