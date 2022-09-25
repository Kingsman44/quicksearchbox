package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.h.h.a;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133879g;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133880h;
import com.google.android.apps.search.googleapp.customtabs.features.p10157a.C133774c;
import com.google.android.apps.search.googleapp.customtabs.p10149a.C133672e;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133709aa;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133734t;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136697e;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136706n;
import com.google.android.apps.search.googleapp.p10357n.p10358a.C136707o;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1703d.C20642af;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.z */
/* compiled from: PG */
final class C133907z implements C133734t, C133709aa {

    /* renamed from: a */
    public static final C59071e f364698a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.z");

    /* renamed from: b */
    public final C133880h f364699b;

    /* renamed from: c */
    public final ScheduledExecutorService f364700c;

    /* renamed from: d */
    public final AccessibilityManager f364701d;

    /* renamed from: e */
    public final C133872a f364702e;

    /* renamed from: f */
    public final C46128f f364703f;

    /* renamed from: g */
    public final AccountId f364704g;

    /* renamed from: h */
    public final C133672e f364705h;

    /* renamed from: i */
    public final C133731q f364706i;

    /* renamed from: j */
    public final C46423aj f364707j;

    /* renamed from: k */
    public volatile boolean f364708k = true;

    /* renamed from: l */
    public volatile C133879g f364709l = null;

    /* renamed from: m */
    private final boolean f364710m;

    /* renamed from: n */
    private final boolean f364711n;

    /* renamed from: o */
    private final Duration f364712o;

    /* renamed from: p */
    private final boolean f364713p;

    /* renamed from: q */
    private final C136697e f364714q;

    /* renamed from: r */
    private final C21370a f364715r;

    /* renamed from: s */
    private final C136832c f364716s;

    /* renamed from: t */
    private final C133774c f364717t = new C133774c();

    /* renamed from: u */
    private long f364718u = 0;

    /* renamed from: v */
    private Uri f364719v = null;

    /* renamed from: w */
    private C60870cx f364720w = null;

    public C133907z(boolean z, boolean z2, long j, boolean z3, C133880h hVar, C136697e eVar, ScheduledExecutorService scheduledExecutorService, AccessibilityManager accessibilityManager, C21370a aVar, C133883b bVar, C136832c cVar, C46128f fVar, AccountId accountId, C133672e eVar2, C133731q qVar) {
        this.f364710m = z;
        this.f364711n = z2;
        this.f364712o = Duration.ofMillis(j);
        this.f364713p = z3;
        this.f364699b = hVar;
        this.f364714q = eVar;
        this.f364700c = scheduledExecutorService;
        this.f364701d = accessibilityManager;
        this.f364715r = aVar;
        C38750am amVar = (C38750am) bVar.f364665a.mo17428b();
        amVar.getClass();
        this.f364702e = new C133872a(amVar);
        this.f364716s = cVar;
        this.f364703f = fVar;
        this.f364704g = accountId;
        this.f364705h = eVar2;
        this.f364706i = qVar;
        this.f364707j = new C46423aj(new C133904w(this), scheduledExecutorService);
    }

    /* renamed from: k */
    private static void m217173k(C60870cx cxVar) {
        C133906y yVar = new C133906y();
        C60856cj.m92911t(cxVar, C47810es.m84974n(yVar), C60826bg.f164896a);
    }

    /* renamed from: l */
    private final void m217174l(Uri uri) {
        long j = 0;
        if (!this.f364701d.isTouchExplorationEnabled()) {
            j = Math.max(0, this.f364712o.minusMillis(this.f364715r.mo26871c() - this.f364718u).toMillis());
        }
        C133901t tVar = new C133901t(this, uri);
        C60870cx k = C60856cj.m92902k(C47810es.m84965e(tVar), j, TimeUnit.MILLISECONDS, this.f364700c);
        C133902u uVar = C133902u.f364693a;
        C60870cx h = C60846c.m92879h(k, Exception.class, C47810es.m84966f(uVar), C60826bg.f164896a);
        m217173k(this.f364717t.mo111389a(h, C47810es.m84966f(new C133903v(this)), this.f364700c));
        this.f364720w = h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r2.f364706i.f364234c;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m217175m() {
        /*
            r2 = this;
            boolean r0 = r2.f364710m
            if (r0 == 0) goto L_0x0018
            boolean r0 = r2.f364711n
            if (r0 != 0) goto L_0x0018
            com.google.android.apps.search.googleapp.customtabs.d.a.q r0 = r2.f364706i
            java.lang.Integer r0 = r0.f364234c
            if (r0 == 0) goto L_0x0018
            int r0 = r0.intValue()
            r1 = 30
            if (r0 < r1) goto L_0x0018
            r0 = 1
            return r0
        L_0x0018:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.C133907z.m217175m():boolean");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo111366a(int i) {
    }

    /* renamed from: b */
    public final void mo111367b() {
        if (m217175m()) {
            this.f364708k = false;
            this.f364702e.f364619b.set(false);
            Uri uri = this.f364719v;
            if (uri != null) {
                m217174l(uri);
                this.f364719v = null;
            }
            C133879g gVar = this.f364709l;
            if (gVar != null) {
                m217173k(this.f364717t.mo111389a(C60866ct.f164955a, C47810es.m84966f(new C133895n(this, gVar)), this.f364700c));
            }
        }
    }

    /* renamed from: c */
    public final void mo111368c() {
        C60870cx cxVar;
        if (m217175m()) {
            this.f364708k = true;
            C133872a aVar = this.f364702e;
            aVar.f364619b.set(true);
            C133879g gVar = (C133879g) aVar.f364618a.getAndSet((Object) null);
            if (gVar != null) {
                aVar.mo111438a(gVar);
            }
            if (this.f364713p && (cxVar = this.f364720w) != null) {
                cxVar.cancel(false);
                this.f364720w = null;
            }
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo111369d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111370e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo111351f(C20642af afVar) {
    }

    /* renamed from: g */
    public final void mo111352g(int i, Uri uri, Uri uri2) {
        if (m217175m() && i == 1) {
            this.f364718u = this.f364715r.mo26871c();
            this.f364719v = null;
            this.f364709l = null;
            C133774c cVar = this.f364717t;
            C133731q qVar = this.f364706i;
            Objects.requireNonNull(qVar);
            C46459k.m82829b(cVar.mo111390b(C47810es.m84965e(new C133894m(qVar)), this.f364700c), "Unable to reset bottom bar", new Object[0]);
            if (uri2 != null) {
                Uri h = mo111443h(uri2);
                if (this.f364701d.isTouchExplorationEnabled()) {
                    m217174l(h);
                } else {
                    this.f364719v = h;
                }
            }
        }
    }

    /* renamed from: h */
    public final Uri mo111443h(Uri uri) {
        Uri a = this.f364716s.mo113395a(uri);
        return a == null ? uri : a;
    }

    /* renamed from: i */
    public final C60870cx mo111444i(Uri uri, C133771b bVar) {
        C136697e eVar = this.f364714q;
        C136706n nVar = (C136706n) C136707o.f372118f.createBuilder();
        String uri2 = uri.toString();
        nVar.copyOnWrite();
        C136707o oVar = (C136707o) nVar.instance;
        uri2.getClass();
        oVar.f372120a |= 1;
        oVar.f372121b = uri2;
        long j = bVar.f364372c;
        nVar.copyOnWrite();
        C136707o oVar2 = (C136707o) nVar.instance;
        int i = 2;
        oVar2.f372120a |= 2;
        oVar2.f372122c = j;
        C60494rz a = C60494rz.m92598a(bVar.f364371b);
        if (a == null) {
            a = C60494rz.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 1) {
            i = 3;
            if (ordinal != 3) {
                i = ordinal != 8 ? 1 : 5;
            }
        }
        nVar.copyOnWrite();
        C136707o oVar3 = (C136707o) nVar.instance;
        oVar3.f372123d = i - 1;
        oVar3.f372120a |= 4;
        nVar.copyOnWrite();
        C136707o oVar4 = (C136707o) nVar.instance;
        oVar4.f372124e = 1;
        oVar4.f372120a = 8 | oVar4.f372120a;
        return eVar.mo113331a((C136707o) nVar.build());
    }

    /* renamed from: j */
    public final C60870cx mo111445j(C133879g gVar) {
        Intent intent;
        C133731q qVar = this.f364706i;
        RemoteViews remoteViews = gVar.f364637a;
        int[] iArr = {R.id.googleapp_customtabs_bottom_bar};
        if (gVar.f364638b.f364111m) {
            intent = a.a(gVar.f364639c);
        } else {
            intent = a.a(gVar.f364640d);
        }
        PendingIntent activity = PendingIntent.getActivity(gVar.f364641e.f364643b, 0, C147798a.m240896b(intent, 201326592, 0), 201326592);
        C58893dc.m90996a(activity);
        C60870cx e = qVar.mo111362e(remoteViews, iArr, activity);
        C133905x xVar = new C133905x(this, gVar);
        return C60922j.m93044g(e, C47810es.m84963c(xVar), this.f364700c);
    }
}
