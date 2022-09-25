package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82372ct;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.HashMap;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cj */
/* compiled from: PG */
public final class C103964cj {

    /* renamed from: c */
    private static final C58974d f289340c = C58974d.m91136j();

    /* renamed from: d */
    private static final Duration f289341d = Duration.ofMinutes(10);

    /* renamed from: a */
    public final C118827a f289342a;

    /* renamed from: b */
    public final C104126w f289343b;

    /* renamed from: e */
    private final C22871g f289344e;

    /* renamed from: f */
    private final C21370a f289345f;

    /* renamed from: g */
    private final C103948bu f289346g;

    /* renamed from: h */
    private final C83305i f289347h;

    /* renamed from: i */
    private final C103799g f289348i;

    /* renamed from: j */
    private boolean f289349j = false;

    /* renamed from: k */
    private boolean f289350k = false;

    /* renamed from: l */
    private final HashMap f289351l = new HashMap();

    public C103964cj(C118827a aVar, C22871g gVar, C21370a aVar2, C103948bu buVar, C83305i iVar, C103799g gVar2, C104126w wVar) {
        this.f289342a = aVar;
        this.f289344e = gVar;
        this.f289345f = aVar2;
        this.f289346g = buVar;
        this.f289347h = iVar;
        this.f289348i = gVar2;
        this.f289343b = wVar;
    }

    /* renamed from: h */
    private final void m171905h(C118569b bVar) {
        bVar.name();
        m171906i(C118575h.NGA_INITIAL_DATA_DOWNLOAD_METRICS, bVar);
        C83305i iVar = this.f289347h;
        String languageTag = this.f289348i.mo93859b().toLanguageTag();
        if (languageTag != null) {
            String name = bVar.name();
            if (name != null) {
                iVar.mo75579d(new C82372ct("NGA_INITIAL_DOWNLOAD", languageTag, name));
                synchronized (this.f289351l) {
                    Long l = (Long) this.f289351l.get(bVar);
                    long b = this.f289345f.mo26870b();
                    if (l == null || l.longValue() + f289341d.toMillis() < b) {
                        this.f289351l.put(bVar, Long.valueOf(b));
                        m171906i(C118575h.NGA_INITIAL_DATA_DOWNLOAD_WINDOW_METRICS, bVar);
                    }
                }
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: i */
    private final void m171906i(C118575h hVar, C118569b bVar) {
        hVar.name();
        bVar.name();
        this.f289344e.mo28212l("[NGA] NgaInitialDownloadMetrics.runOnLightweightThread", new C103963ci(this, bVar, hVar));
    }

    /* renamed from: a */
    public final synchronized void mo93900a() {
        m171905h(C118569b.NGA_BACKGROUND_DOWNLOAD_SUCCEEDED_COUNT);
    }

    /* renamed from: b */
    public final synchronized void mo93901b() {
        this.f289350k = true;
        if (this.f289349j) {
            m171905h(C118569b.NGA_INITIAL_DOWNLOAD_MANUAL_CANCELED_COUNT);
        } else {
            m171905h(C118569b.NGA_INITIAL_DOWNLOAD_AUTOMATIC_CANCELED_COUNT);
        }
    }

    /* renamed from: c */
    public final synchronized void mo93902c() {
        if (this.f289349j) {
            ((C58970a) ((C58970a) f289340c.mo56226d()).mo56372aa(21725)).mo56386p("Automatic download started after manual, this shouldn't happen.");
            return;
        }
        this.f289350k = false;
        if (this.f289346g.mo93893a()) {
            m171905h(C118569b.NGA_INITIAL_DOWNLOAD_AUTOMATICALLY_STARTED_COUNT);
        }
    }

    /* renamed from: d */
    public final synchronized void mo93903d() {
        this.f289349j = true;
        this.f289350k = false;
        m171905h(C118569b.NGA_INITIAL_DOWNLOAD_MANUALLY_STARTED_COUNT);
    }

    /* renamed from: e */
    public final synchronized void mo93904e() {
        if (this.f289349j) {
            m171905h(C118569b.NGA_INITIAL_DOWNLOAD_MANUALLY_SUCCEEDED_COUNT);
        } else {
            m171905h(C118569b.NGA_INITIAL_DOWNLOAD_AUTOMATICALLY_SUCCEEDED_COUNT);
        }
    }

    /* renamed from: f */
    public final synchronized void mo93905f() {
        m171905h(C118569b.NGA_INITIAL_DOWNLOAD_UI_CREATED);
    }

    /* renamed from: g */
    public final synchronized void mo93906g(int i) {
        if (!this.f289350k) {
            this.f289350k = true;
            if (this.f289349j || this.f289346g.mo93893a()) {
                C103947bt btVar = C103947bt.ELIGIBLE;
                int i2 = i - 1;
                if (i2 == 0) {
                    m171905h(C118569b.NGA_INITIAL_DOWNLOAD_FAILURE_NO_NETWORK);
                } else if (i2 == 1) {
                    m171905h(C118569b.NGA_INITIAL_DOWNLOAD_FAILURE_MDD);
                } else if (i2 == 2) {
                    m171905h(C118569b.NGA_INITIAL_DOWNLOAD_FAILURE_AUTOMATIC_FLAG_DISABLED);
                } else if (i2 == 3) {
                    m171905h(C118569b.NGA_INITIAL_DOWNLOAD_FAILURE_AUTOMATIC_MOBILE_DATA_LIMIT);
                } else if (i2 != 4) {
                    m171905h(C118569b.NGA_INITIAL_DOWNLOAD_FAILURE_OTHER);
                } else {
                    m171905h(C118569b.NGA_INITIAL_DOWNLOAD_FAILURE_AUTOMATIC_OTHER_NETWORK);
                }
            }
        }
    }
}
