package com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.provider.ContactsContract;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36907a;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36909c;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36911e;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2841c.p2842a.C36946c;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2841c.p2843b.C36947a;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d.C36948a;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d.C36949b;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d.C36950c;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d.C36951d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d.C36952e;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58671nr;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.assistant.y.g.b.af */
/* compiled from: PG */
public final class C36918af implements C36911e {

    /* renamed from: n */
    public static final /* synthetic */ int f96120n = 0;

    /* renamed from: o */
    private static final C59071e f96121o = C59071e.m91332i("com.google.android.libraries.search.assistant.y.g.b.af");

    /* renamed from: p */
    private static final Duration f96122p = Duration.ofSeconds(1);

    /* renamed from: a */
    public final Object f96123a = new Object();

    /* renamed from: b */
    public final C58671nr f96124b = new C58459fv();

    /* renamed from: c */
    public final ConcurrentMap f96125c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C60887da f96126d;

    /* renamed from: e */
    C36942y f96127e;

    /* renamed from: f */
    C36934q f96128f;

    /* renamed from: g */
    C36922e f96129g;

    /* renamed from: h */
    C36928k f96130h;

    /* renamed from: i */
    C36938u f96131i;

    /* renamed from: j */
    C36938u f96132j;

    /* renamed from: k */
    C36931n f96133k;

    /* renamed from: l */
    C36919b f96134l;

    /* renamed from: m */
    C36914ab f96135m;

    /* renamed from: q */
    private final Map f96136q = new EnumMap(C36910d.class);

    /* renamed from: r */
    private final C36952e f96137r;

    /* renamed from: s */
    private final C36943z f96138s;

    /* renamed from: t */
    private final C36935r f96139t;

    /* renamed from: u */
    private final C36923f f96140u;

    /* renamed from: v */
    private final C36929l f96141v;

    /* renamed from: w */
    private final C36939v f96142w;

    /* renamed from: x */
    private final C36932o f96143x;

    /* renamed from: y */
    private final C36920c f96144y;

    /* renamed from: z */
    private final C36915ac f96145z;

    public C36918af(C36943z zVar, C36935r rVar, C36923f fVar, C36929l lVar, C36939v vVar, C36932o oVar, C36920c cVar, C36915ac acVar, C36952e eVar, C60887da daVar, C36951d dVar) {
        this.f96138s = zVar;
        this.f96139t = rVar;
        this.f96140u = fVar;
        this.f96141v = lVar;
        this.f96142w = vVar;
        this.f96143x = oVar;
        this.f96144y = cVar;
        this.f96145z = acVar;
        this.f96137r = eVar;
        this.f96126d = daVar;
        for (C36910d put : C36910d.values()) {
            Map map = this.f96136q;
            Duration duration = f96122p;
            C60950i iVar = (C60950i) dVar.f96224a.mo17428b();
            iVar.getClass();
            C60888db dbVar = (C60888db) dVar.f96225b.mo17428b();
            dbVar.getClass();
            duration.getClass();
            map.put(put, new C36950c(iVar, dbVar, duration));
        }
    }

    /* renamed from: a */
    public final Optional mo40464a(C36910d dVar, C36909c cVar) {
        dVar.name();
        C36952e eVar = this.f96137r;
        String valueOf = String.valueOf(dVar);
        long incrementAndGet = eVar.f96226a.incrementAndGet();
        C36907a aVar = new C36907a(valueOf + ":" + incrementAndGet);
        synchronized (this.f96123a) {
            switch (dVar.ordinal()) {
                case 0:
                    if (this.f96127e == null) {
                        C36943z zVar = this.f96138s;
                        MediaSessionManager mediaSessionManager = (MediaSessionManager) zVar.f96205a.mo17428b();
                        mediaSessionManager.getClass();
                        C46428ao aoVar = (C46428ao) zVar.f96206b.mo17428b();
                        aoVar.getClass();
                        dVar.getClass();
                        C36942y yVar = new C36942y(mediaSessionManager, aoVar, dVar, this);
                        this.f96127e = yVar;
                        MediaSessionManager mediaSessionManager2 = yVar.f96204f;
                        if (mediaSessionManager2 != null) {
                            mediaSessionManager2.addOnActiveSessionsChangedListener(yVar, (ComponentName) null, yVar.f96203e);
                            C58480gp e = C58485gu.m89837e();
                            MediaSessionManager mediaSessionManager3 = yVar.f96204f;
                            if (mediaSessionManager3 != null) {
                                e.mo55396h(mediaSessionManager3.getActiveSessions((ComponentName) null));
                            }
                            C58485gu f = e.mo55394f();
                            int i = ((C58724pq) f).f156474d;
                            for (int i2 = 0; i2 < i; i2++) {
                                yVar.mo40487a((MediaController) f.get(i2));
                            }
                            break;
                        } else {
                            ((C59052c) ((C59052c) C36942y.f96199a.mo56226d()).mo56372aa(52443)).mo56386p("Unable to monitor media context change.");
                            break;
                        }
                    } else {
                        break;
                    }
                case 1:
                    if (this.f96129g == null) {
                        C36946c cVar2 = (C36946c) this.f96140u.f96156a.mo17428b();
                        cVar2.getClass();
                        dVar.getClass();
                        C36922e eVar2 = new C36922e(cVar2, dVar, this);
                        this.f96129g = eVar2;
                        eVar2.f96155d.mo40491a(eVar2.f96154c);
                        break;
                    }
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT >= 31) {
                        if (this.f96130h == null) {
                            C36929l lVar = this.f96141v;
                            C36947a aVar2 = (C36947a) lVar.f96167a.mo17428b();
                            aVar2.getClass();
                            C60887da daVar = (C60887da) lVar.f96168b.mo17428b();
                            daVar.getClass();
                            dVar.getClass();
                            C36928k kVar = new C36928k(aVar2, daVar, dVar, this);
                            this.f96130h = kVar;
                            C60870cx cxVar = kVar.f96162b;
                            C36924g gVar = new C36924g(kVar);
                            C36928k.m65620c(C60922j.m93044g(cxVar, C47810es.m84963c(gVar), kVar.f96163c));
                            break;
                        }
                    } else {
                        ((C59052c) ((C59052c) f96121o.mo56226d()).mo56372aa(52468)).mo56386p("Failed to do clock context monitoring, it requires API >= 31.");
                        Optional empty = Optional.empty();
                        return empty;
                    }
                    break;
                case 3:
                    if (this.f96128f == null) {
                        Context context = (Context) this.f96139t.f96184a.mo17428b();
                        context.getClass();
                        dVar.getClass();
                        C36934q qVar = new C36934q(context, dVar, this);
                        this.f96128f = qVar;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
                        qVar.f96180a.registerReceiver(qVar.f96183d, intentFilter);
                        break;
                    }
                    break;
                case 4:
                    if (this.f96131i == null) {
                        C36938u a = this.f96142w.mo40477a(dVar, this, aVar, C65753ak.PKG);
                        this.f96131i = a;
                        a.mo40475a();
                        break;
                    }
                    break;
                case 5:
                    if (this.f96133k == null) {
                        C36932o oVar = this.f96143x;
                        C46877q qVar2 = (C46877q) oVar.f96176a.mo17428b();
                        qVar2.getClass();
                        C47770dh dhVar = (C47770dh) oVar.f96177b.mo17428b();
                        dhVar.getClass();
                        C60888db dbVar = (C60888db) oVar.f96178c.mo17428b();
                        dbVar.getClass();
                        dVar.getClass();
                        C36931n nVar = new C36931n(qVar2, dhVar, dbVar, dVar, this);
                        this.f96133k = nVar;
                        nVar.f96170a.mo50875e(ContactsContract.Contacts.CONTENT_URI, true, nVar.f96171b);
                        break;
                    }
                    break;
                case 6:
                    if (this.f96134l == null) {
                        Context context2 = (Context) this.f96144y.f96150a.mo17428b();
                        context2.getClass();
                        dVar.getClass();
                        C36919b bVar = new C36919b(context2, dVar, this);
                        this.f96134l = bVar;
                        IntentFilter intentFilter2 = new IntentFilter();
                        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                        intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
                        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                        intentFilter2.addDataScheme("package");
                        bVar.f96146a.registerReceiver(bVar.f96149d, intentFilter2);
                        break;
                    }
                    break;
                case 7:
                    if (this.f96135m == null) {
                        C36946c cVar3 = (C36946c) this.f96145z.f96115a.mo17428b();
                        cVar3.getClass();
                        dVar.getClass();
                        C36914ab abVar = new C36914ab(cVar3, dVar, this);
                        this.f96135m = abVar;
                        abVar.f96114d.mo40491a(abVar.f96113c);
                        break;
                    }
                    break;
                case 8:
                    if (this.f96132j == null) {
                        C36938u a2 = this.f96142w.mo40477a(dVar, this, aVar, C65753ak.ASSISTANT_HISTORY);
                        this.f96132j = a2;
                        a2.mo40475a();
                        break;
                    }
                    break;
                default:
                    throw new AssertionError(String.format("Unsupported context key: %s", new Object[]{dVar}));
            }
            this.f96124b.mo54920x(dVar, aVar);
            this.f96125c.put(aVar, cVar);
            return Optional.m71637of(aVar);
        }
    }

    /* renamed from: b */
    public final void mo40465b(C36910d dVar) {
        C60870cx cxVar;
        dVar.name();
        C36950c cVar = (C36950c) this.f96136q.get(dVar);
        if (cVar == null) {
            ((C59052c) ((C59052c) f96121o.mo56226d()).mo56372aa(52452)).mo56389s("Skip Notification, no rateLimiter available for context key: %s", dVar);
            return;
        }
        synchronized (cVar.f96221d) {
            Instant a = cVar.f96218a.mo57444a();
            C36949b bVar = cVar.f96223f;
            if (bVar == null) {
                cVar.f96222e = a;
                cVar.f96223f = C36949b.APPROVED;
                cxVar = C60856cj.m92900i(cVar.f96223f);
            } else if (bVar == C36949b.APPROVED) {
                Duration minus = cVar.f96219b.minus(Duration.between(cVar.f96222e, a));
                if (minus.compareTo(Duration.ZERO) <= 0) {
                    cVar.f96223f = C36949b.APPROVED;
                    cxVar = C60856cj.m92900i(cVar.f96223f);
                } else {
                    cVar.f96223f = C36949b.PENDING_APPROVAL;
                    C36948a aVar = new C36948a(cVar);
                    cxVar = C60856cj.m92902k(C47810es.m84965e(aVar), minus.toMillis(), TimeUnit.MILLISECONDS, cVar.f96220c);
                }
            } else {
                cVar.f96223f = C36949b.IGNORED;
                cxVar = C60856cj.m92900i(cVar.f96223f);
            }
        }
        C36917ae aeVar = new C36917ae(this, dVar);
        C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(aeVar), this.f96126d), "Failed to resolve permitDecision for context key: %s", dVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0.equals("MEDIA_CONTEXT_CHANGE") != false) goto L_0x007d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40466c(com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36908b r6) {
        /*
            r5 = this;
            com.google.common.base.m r0 = new com.google.common.base.m
            r1 = 58
            r0.<init>(r1)
            com.google.common.base.cf r0 = com.google.common.base.C58869cf.m90936b(r0)
            java.lang.String r1 = r6.mo40459a()
            java.lang.Iterable r0 = r0.mo56153g(r1)
            r1 = 0
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90128i(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            switch(r2) {
                case -1913506304: goto L_0x0072;
                case -1609631598: goto L_0x0068;
                case -918117167: goto L_0x005e;
                case -671864261: goto L_0x0055;
                case -554705069: goto L_0x004b;
                case -427923359: goto L_0x0041;
                case -300276267: goto L_0x0037;
                case 1670111788: goto L_0x002c;
                case 1894249087: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x007c
        L_0x0022:
            java.lang.String r1 = "CONTACT_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 5
            goto L_0x007d
        L_0x002c:
            java.lang.String r1 = "ASSISTANT_HISTORY_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 8
            goto L_0x007d
        L_0x0037:
            java.lang.String r1 = "APP_NAMES_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 6
            goto L_0x007d
        L_0x0041:
            java.lang.String r1 = "CALL_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x004b:
            java.lang.String r1 = "PKG_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 4
            goto L_0x007d
        L_0x0055:
            java.lang.String r2 = "MEDIA_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007c
            goto L_0x007d
        L_0x005e:
            java.lang.String r1 = "CLOCK_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 2
            goto L_0x007d
        L_0x0068:
            java.lang.String r1 = "OUTBOUND_CALL_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 7
            goto L_0x007d
        L_0x0072:
            java.lang.String r1 = "DO_NOT_DISTURB_CONTEXT_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 3
            goto L_0x007d
        L_0x007c:
            r1 = -1
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00af;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00a1;
                case 5: goto L_0x009a;
                case 6: goto L_0x0093;
                case 7: goto L_0x008c;
                case 8: goto L_0x0085;
                default: goto L_0x0080;
            }
        L_0x0080:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x00c3
        L_0x0085:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.ASSISTANT_HISTORY_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x008c:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.OUTBOUND_CALL_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x0093:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.APP_NAMES_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x009a:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CONTACT_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x00a1:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.PKG_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x00a8:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.DO_NOT_DISTURB_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x00af:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CLOCK_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x00b6:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CALL_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c3
        L_0x00bd:
            com.google.android.libraries.search.assistant.y.g.a.d r0 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.MEDIA_CONTEXT_CHANGE
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x00c3:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00d7
            com.google.common.f.e r1 = f96121o
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Unable to unsubscribe for context change, cannot find context key use token: %s."
            r3 = 52464(0xccf0, float:7.3518E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r6)
        L_0x00d7:
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.search.assistant.y.g.a.d r0 = (com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d) r0
            r0.name()
            java.lang.Object r1 = r5.f96123a
            monitor-enter(r1)
            com.google.common.b.nr r2 = r5.f96124b     // Catch:{ all -> 0x0195 }
            r2.mo54956I(r0, r6)     // Catch:{ all -> 0x0195 }
            com.google.common.b.nr r2 = r5.f96124b     // Catch:{ all -> 0x0195 }
            boolean r2 = r2.mo54919w(r0)     // Catch:{ all -> 0x0195 }
            if (r2 != 0) goto L_0x018e
            r0.name()     // Catch:{ all -> 0x0195 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0195 }
            r2 = 0
            switch(r0) {
                case 0: goto L_0x017c;
                case 1: goto L_0x016c;
                case 2: goto L_0x0151;
                case 3: goto L_0x0141;
                case 4: goto L_0x0137;
                case 5: goto L_0x0129;
                case 6: goto L_0x0119;
                case 7: goto L_0x0108;
                case 8: goto L_0x00fd;
                default: goto L_0x00fb;
            }     // Catch:{ all -> 0x0195 }
        L_0x00fb:
            goto L_0x018e
        L_0x00fd:
            com.google.android.libraries.search.assistant.y.g.b.u r0 = r5.f96132j     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            r0.mo40476b()     // Catch:{ all -> 0x0195 }
            r5.f96132j = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x0108:
            com.google.android.libraries.search.assistant.y.g.b.ab r0 = r5.f96135m     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            com.google.android.libraries.search.assistant.y.g.c.a.a r3 = r0.f96113c     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x0115
            com.google.android.libraries.search.assistant.y.g.c.a.c r0 = r0.f96114d     // Catch:{ all -> 0x0195 }
            r0.mo40492b(r3)     // Catch:{ all -> 0x0195 }
        L_0x0115:
            r5.f96135m = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x0119:
            com.google.android.libraries.search.assistant.y.g.b.b r0 = r5.f96134l     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            android.content.BroadcastReceiver r3 = r0.f96149d     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x0126
            android.content.Context r0 = r0.f96146a     // Catch:{ all -> 0x0195 }
            r0.unregisterReceiver(r3)     // Catch:{ all -> 0x0195 }
        L_0x0126:
            r5.f96134l = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x0129:
            com.google.android.libraries.search.assistant.y.g.b.n r0 = r5.f96133k     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            com.google.apps.tiktok.dataservice.q r3 = r0.f96170a     // Catch:{ all -> 0x0195 }
            com.google.apps.tiktok.dataservice.d r0 = r0.f96171b     // Catch:{ all -> 0x0195 }
            r3.mo50876f(r0)     // Catch:{ all -> 0x0195 }
            r5.f96133k = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x0137:
            com.google.android.libraries.search.assistant.y.g.b.u r0 = r5.f96131i     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            r0.mo40476b()     // Catch:{ all -> 0x0195 }
            r5.f96131i = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x0141:
            com.google.android.libraries.search.assistant.y.g.b.q r0 = r5.f96128f     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            android.content.BroadcastReceiver r3 = r0.f96183d     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x014e
            android.content.Context r0 = r0.f96180a     // Catch:{ all -> 0x0195 }
            r0.unregisterReceiver(r3)     // Catch:{ all -> 0x0195 }
        L_0x014e:
            r5.f96128f = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x0151:
            com.google.android.libraries.search.assistant.y.g.b.k r0 = r5.f96130h     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            com.google.common.util.concurrent.cx r3 = r0.f96162b     // Catch:{ all -> 0x0195 }
            com.google.android.libraries.search.assistant.y.g.b.h r4 = new com.google.android.libraries.search.assistant.y.g.b.h     // Catch:{ all -> 0x0195 }
            r4.<init>(r0)     // Catch:{ all -> 0x0195 }
            com.google.common.util.concurrent.da r0 = r0.f96163c     // Catch:{ all -> 0x0195 }
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)     // Catch:{ all -> 0x0195 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r3, r4, r0)     // Catch:{ all -> 0x0195 }
            com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b.C36928k.m65620c(r0)     // Catch:{ all -> 0x0195 }
            r5.f96130h = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x016c:
            com.google.android.libraries.search.assistant.y.g.b.e r0 = r5.f96129g     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            com.google.android.libraries.search.assistant.y.g.c.a.a r3 = r0.f96154c     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x0179
            com.google.android.libraries.search.assistant.y.g.c.a.c r0 = r0.f96155d     // Catch:{ all -> 0x0195 }
            r0.mo40492b(r3)     // Catch:{ all -> 0x0195 }
        L_0x0179:
            r5.f96129g = r2     // Catch:{ all -> 0x0195 }
            goto L_0x018e
        L_0x017c:
            com.google.android.libraries.search.assistant.y.g.b.y r0 = r5.f96127e     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018e
            android.media.session.MediaSessionManager r3 = r0.f96204f     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x0187
            r3.removeOnActiveSessionsChangedListener(r0)     // Catch:{ all -> 0x0195 }
        L_0x0187:
            r0.f96204f = r2     // Catch:{ all -> 0x0195 }
            r0.mo40488b()     // Catch:{ all -> 0x0195 }
            r5.f96127e = r2     // Catch:{ all -> 0x0195 }
        L_0x018e:
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            java.util.concurrent.ConcurrentMap r0 = r5.f96125c
            r0.remove(r6)
            return
        L_0x0195:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b.C36918af.mo40466c(com.google.android.libraries.search.assistant.y.g.a.b):void");
    }
}
