package com.google.android.libraries.lens.view.p2113h.p2123f;

import android.util.Size;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.ImagingSession;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26777ab;
import com.google.android.libraries.lens.view.p2173u.C28095a;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28172n;
import com.google.android.libraries.lens.view.vision.p2175a.C28147a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.aad;
import com.google.common.p4552o.aae;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4698d.C62165d;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62427bd;
import com.google.lens.p4707j.C62431bh;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.h.f.i */
/* compiled from: PG */
public final class C26827i implements C26821c {

    /* renamed from: a */
    public C28172n f73107a;

    /* renamed from: b */
    public final Object f73108b = new Object();

    /* renamed from: c */
    public final C25799b f73109c;

    /* renamed from: d */
    public final boolean f73110d;

    /* renamed from: e */
    public final C26816a f73111e;

    /* renamed from: f */
    public volatile boolean f73112f = false;

    /* renamed from: g */
    public volatile boolean f73113g = false;

    /* renamed from: h */
    public volatile boolean f73114h = false;

    /* renamed from: i */
    public volatile boolean f73115i = false;

    /* renamed from: j */
    public volatile boolean f73116j = false;

    /* renamed from: k */
    public volatile boolean f73117k = false;

    /* renamed from: l */
    public volatile boolean f73118l = false;

    /* renamed from: m */
    public volatile boolean f73119m = false;

    /* renamed from: n */
    public C58833ax f73120n;

    /* renamed from: o */
    public C58833ax f73121o;

    /* renamed from: p */
    public boolean f73122p;

    /* renamed from: q */
    public String f73123q;

    /* renamed from: r */
    public volatile C58833ax f73124r;

    /* renamed from: s */
    public volatile Size f73125s;

    /* renamed from: t */
    public C56306df f73126t;

    /* renamed from: u */
    public final C28147a f73127u;

    /* renamed from: v */
    int f73128v;

    /* renamed from: w */
    public volatile C26777ab f73129w;

    /* renamed from: x */
    private C60870cx f73130x;

    /* renamed from: y */
    private final Executor f73131y;

    static {
        C58974d.m91135i("FrameSelectorNativeImpl");
    }

    public C26827i(C25799b bVar, C28147a aVar, boolean z, Executor executor) {
        C58836b bVar2 = C58836b.f156633a;
        this.f73120n = bVar2;
        this.f73128v = 2;
        this.f73121o = bVar2;
        this.f73122p = true;
        this.f73123q = BuildConfig.FLAVOR;
        this.f73124r = bVar2;
        this.f73126t = C56306df.AUTO_FILTER;
        this.f73109c = bVar;
        this.f73127u = aVar;
        this.f73110d = z;
        this.f73131y = executor;
        this.f73111e = new C26816a();
        mo32200m();
    }

    /* renamed from: r */
    public static final C62427bd m49637r(ImagingSession imagingSession, C62425bb bbVar) {
        try {
            C62427bd a = imagingSession.mo29450a(bbVar);
            a.getClass();
            C62431bh bhVar = a.f168518d;
            if (bhVar == null) {
                bhVar = C62431bh.f168521d;
            }
            boolean z = bhVar.f168524b == C62722b.OK.f169415s;
            C62431bh bhVar2 = a.f168518d;
            if (bhVar2 == null) {
                bhVar2 = C62431bh.f168521d;
            }
            C58838bb.m90890y(z, "%s-sendRequest: error sending request: %s", "FSNI", bhVar2.f168525c);
            return a;
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }

    /* renamed from: a */
    public final void mo32186a() {
        this.f73116j = true;
    }

    /* renamed from: b */
    public final void mo32187b(C56280cg cgVar) {
        C60870cx m = mo32200m();
        C26822d dVar = new C26822d(this, cgVar);
        C60922j.m93044g(m, C47810es.m84963c(dVar), this.f73131y);
    }

    /* renamed from: c */
    public final void mo32188c(C28097c cVar) {
        long j = cVar.f76484b;
        aad aad = (aad) aae.f158088c.createBuilder();
        int i = this.f73128v;
        aad.copyOnWrite();
        aae aae = (aae) aad.instance;
        aae.f158091b = C62165d.m94755a(i);
        aae.f158090a |= 1;
        cVar.f76496n = (aae) aad.build();
        synchronized (this.f73108b) {
            this.f73124r = C58833ax.m90834k(new C26826h(cVar.f76484b));
        }
        this.f73113g = true;
    }

    /* renamed from: d */
    public final void mo32189d() {
        this.f73115i = true;
    }

    /* renamed from: e */
    public final void mo32190e() {
        synchronized (this.f73108b) {
            mo32202q();
        }
    }

    /* renamed from: f */
    public final synchronized void mo32191f(boolean z) {
        C60870cx m = mo32200m();
        C26823e eVar = new C26823e(this, z);
        C60922j.m93044g(m, C47810es.m84963c(eVar), this.f73131y);
    }

    /* renamed from: h */
    public final void mo32193h(long j) {
        synchronized (this.f73108b) {
            if (this.f73124r.mo56113h()) {
                ((C26826h) this.f73124r.mo56107c()).f73105a = j;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32194i(long r5, com.google.common.base.C58833ax r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f73108b
            monitor-enter(r0)
            com.google.common.base.ax r1 = r4.f73124r     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0043
            com.google.common.base.ax r1 = r4.f73124r     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x0045 }
            com.google.android.libraries.lens.view.h.f.h r1 = (com.google.android.libraries.lens.view.p2113h.p2123f.C26826h) r1     // Catch:{ all -> 0x0045 }
            long r1 = r1.f73105a     // Catch:{ all -> 0x0045 }
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x001a
            goto L_0x0043
        L_0x001a:
            r5 = 1
            r4.f73119m = r5     // Catch:{ all -> 0x0045 }
            r6 = r7
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = r6.f156646a     // Catch:{ all -> 0x0045 }
            com.google.android.libraries.lens.view.session.m r6 = (com.google.android.libraries.lens.view.session.C27793m) r6     // Catch:{ all -> 0x0045 }
            boolean r6 = r6.mo33301i()     // Catch:{ all -> 0x0045 }
            if (r6 != 0) goto L_0x003c
            com.google.common.base.bk r7 = (com.google.common.base.C58847bk) r7     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = r7.f156646a     // Catch:{ all -> 0x0045 }
            com.google.android.libraries.lens.view.session.m r6 = (com.google.android.libraries.lens.view.session.C27793m) r6     // Catch:{ all -> 0x0045 }
            com.google.bp.f.b.a.aa r6 = r6.mo33243h()     // Catch:{ all -> 0x0045 }
            com.google.protobuf.cq r6 = r6.f149750a     // Catch:{ all -> 0x0045 }
            int r6 = r6.size()     // Catch:{ all -> 0x0045 }
            if (r6 <= 0) goto L_0x003e
        L_0x003c:
            r4.f73118l = r5     // Catch:{ all -> 0x0045 }
        L_0x003e:
            r4.mo32202q()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2123f.C26827i.mo32194i(long, com.google.common.base.ax):void");
    }

    /* renamed from: j */
    public final synchronized void mo32195j(Size size) {
        this.f73125s = size;
    }

    /* renamed from: k */
    public final synchronized void mo32196k(C26777ab abVar) {
        if (this.f73129w != abVar) {
            this.f73129w = abVar;
        }
    }

    /* renamed from: l */
    public final void mo32197l() {
        this.f73111e.mo32178a();
    }

    /* renamed from: m */
    public final C60870cx mo32200m() {
        if (this.f73130x == null) {
            C26824f fVar = new C26824f(this);
            this.f73130x = C60856cj.m92904m(C47810es.m84978r(fVar), this.f73131y);
        }
        return this.f73130x;
    }

    /* renamed from: n */
    public final void mo32201n() {
        if (this.f73120n.mo56113h()) {
            ((C28097c) this.f73120n.mo56107c()).mo33560c(C28095a.SKIPPED);
            this.f73120n = C58836b.f156633a;
        }
    }

    /* renamed from: o */
    public final synchronized void mo30756o(C28172n nVar) {
        if (this.f73107a != nVar) {
            this.f73107a = nVar;
            nVar.mo33591l(new C26825g(this));
        }
    }

    /* renamed from: p */
    public final void mo30757p() {
    }

    /* renamed from: q */
    public final void mo32202q() {
        if (this.f73124r.mo56113h()) {
            this.f73124r = C58836b.f156633a;
            this.f73114h = true;
        }
    }

    public final String toString() {
        String str;
        String d = new C58827ar("\n").mo56097d(new C58825ap(new Object[0], "FS native=%s", "FS reason=%s"));
        Object[] objArr = new Object[2];
        objArr[0] = this.f73123q;
        int i = this.f73128v;
        switch (i) {
            case 1:
                str = "UNRECOGNIZED";
                break;
            case 2:
                str = "UNKNOWN";
                break;
            case 3:
                str = "FORCED_SELECTION";
                break;
            case 4:
                str = "FORCED_INVALIDATION";
                break;
            case 5:
                str = "INVALIDATION_BY_BOX_TRANSLATION";
                break;
            case 6:
                str = "INVALIDATION_BY_BOX_ROTATION";
                break;
            case 7:
                str = "INVALIDATION_BY_BOX_SCALE";
                break;
            case 8:
                str = "INVALIDATION_BY_BOX_LOST";
                break;
            case 9:
                str = "HOVER";
                break;
            case 10:
                str = "CAMERA_SIGNALS";
                break;
            case 11:
                str = "IQ_INCREASED";
                break;
            case 12:
                str = "FOCUS_REQUEST";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            objArr[1] = str;
            return String.format(d, objArr);
        }
        throw null;
    }

    /* renamed from: g */
    public final synchronized void mo32192g(boolean z) {
        synchronized (this.f73108b) {
            if (this.f73112f != z) {
                this.f73112f = z;
                this.f73116j = z;
                this.f73114h = z;
                this.f73117k = true;
                mo32201n();
            }
        }
    }
}
