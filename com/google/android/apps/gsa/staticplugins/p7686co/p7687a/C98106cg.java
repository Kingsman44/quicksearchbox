package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8852u.C118571d;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.sidekick.main.entry.C91329bg;
import com.google.android.apps.p489g.C9288f;
import com.google.android.apps.p489g.C9289g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cg */
/* compiled from: PG */
public final class C98106cg implements C91329bg, C90991b {

    /* renamed from: a */
    private static final C59071e f273939a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.a.cg");

    /* renamed from: b */
    private final C21370a f273940b;

    /* renamed from: c */
    private final C58881cr f273941c;

    /* renamed from: d */
    private final C86124t f273942d;

    /* renamed from: e */
    private final C91077d f273943e;

    /* renamed from: f */
    private final C69464a f273944f;

    /* renamed from: g */
    private final C86130z f273945g;

    /* renamed from: h */
    private final C39141kp f273946h;

    /* renamed from: i */
    private boolean f273947i;

    /* renamed from: j */
    private boolean f273948j;

    /* renamed from: k */
    private List f273949k = Arrays.asList(new C118571d[0]);

    /* renamed from: l */
    private Locale f273950l;

    /* renamed from: m */
    private long f273951m;

    /* renamed from: n */
    private long f273952n;

    /* renamed from: o */
    private boolean f273953o;

    /* renamed from: p */
    private int f273954p;

    /* renamed from: q */
    private boolean f273955q;

    /* renamed from: r */
    private String f273956r = "no session token";

    /* renamed from: s */
    private C8142xb f273957s = C8142xb.UNKNOWN_SURFACE;

    /* renamed from: t */
    private final Object f273958t = new Object();

    /* renamed from: u */
    private final C84486a f273959u;

    public C98106cg(C21370a aVar, C58881cr crVar, C86124t tVar, C91077d dVar, C86130z zVar, C69464a aVar2, C91022f fVar, C84486a aVar3, C39141kp kpVar) {
        this.f273940b = aVar;
        this.f273941c = crVar;
        this.f273942d = tVar;
        this.f273944f = aVar2;
        this.f273943e = dVar;
        this.f273945g = zVar;
        this.f273959u = aVar3;
        this.f273946h = kpVar;
        fVar.mo85301a(this);
    }

    /* renamed from: r */
    private final long m162466r(boolean z) {
        long a = this.f273942d.mo79743a(C90010bp.f246958aa);
        if (a > -1) {
            return TimeUnit.MINUTES.toMillis(a);
        }
        long a2 = this.f273942d.mo79743a(C90010bp.f246975ar);
        int a3 = this.f273945g.mo79762a(R.integer.offline_card_cache_timeout_days);
        if (z && a2 > 0) {
            return TimeUnit.MINUTES.toMillis(a2);
        }
        if (a3 >= 0) {
            return ((long) a3) * 86400000;
        }
        int intValue = ((Integer) this.f273941c.mo6453a()).intValue();
        return ((long) (intValue + intValue)) * 60000;
    }

    /* renamed from: s */
    private final Locale m162467s() {
        Locale locale;
        synchronized (this.f273958t) {
            m162468t();
            locale = this.f273950l;
        }
        return locale;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ ct -> 0x0047, RuntimeException -> 0x0028 }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m162468t() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f273958t
            monitor-enter(r0)
            boolean r1 = r7.f273947i     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00a6
            g.a.a r1 = r7.f273944f     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r1.mo17428b()     // Catch:{ all -> 0x00a8 }
            com.google.android.apps.gsa.search.core.preferences.r r1 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r1     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "now_entry_validation_state"
            r3 = 0
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x00a8 }
            byte[] r1 = r1.mo80079e(r2, r3)     // Catch:{ all -> 0x00a8 }
            r2 = 0
            if (r1 == 0) goto L_0x005d
            int r3 = r1.length     // Catch:{ all -> 0x00a8 }
            if (r3 != 0) goto L_0x001f
            goto L_0x005d
        L_0x001f:
            com.google.android.apps.g.g r3 = com.google.android.apps.p489g.C9289g.f32242l     // Catch:{ ct -> 0x0047, RuntimeException -> 0x0028 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1)     // Catch:{ ct -> 0x0047, RuntimeException -> 0x0028 }
            com.google.android.apps.g.g r1 = (com.google.android.apps.p489g.C9289g) r1     // Catch:{ ct -> 0x0047, RuntimeException -> 0x0028 }
            goto L_0x0060
        L_0x0028:
            r1 = move-exception
            java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x00a8 }
            boolean r3 = r3 instanceof com.google.protobuf.C62974ct     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x0046
            com.google.common.f.e r3 = f273939a     // Catch:{ all -> 0x00a8 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00a8 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "EntryValidationState"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = "Failed to parse entry preferences data"
            r5 = 30561(0x7761, float:4.2825E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x005f
        L_0x0046:
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x0047:
            r1 = move-exception
            com.google.common.f.e r3 = f273939a     // Catch:{ all -> 0x00a8 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00a8 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "EntryValidationState"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = "Failed to parse entry preferences data"
            r5 = 30560(0x7760, float:4.2824E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x005f
        L_0x005d:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a8 }
        L_0x005f:
            r1 = r2
        L_0x0060:
            r3 = 1
            if (r1 == 0) goto L_0x00a2
            r7.f273948j = r3     // Catch:{ all -> 0x00a8 }
            com.google.protobuf.cj r4 = new com.google.protobuf.cj     // Catch:{ all -> 0x00a8 }
            com.google.protobuf.ch r5 = r1.f32248e     // Catch:{ all -> 0x00a8 }
            com.google.protobuf.ci r6 = com.google.android.apps.p489g.C9289g.f32241f     // Catch:{ all -> 0x00a8 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00a8 }
            r7.f273949k = r4     // Catch:{ all -> 0x00a8 }
            int r4 = r1.f32244a     // Catch:{ all -> 0x00a8 }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x007e
            java.lang.String r4 = r1.f32246c     // Catch:{ all -> 0x00a8 }
            java.util.Locale r2 = com.google.android.apps.gsa.shared.util.C90725ai.m148180b(r4, r2)     // Catch:{ all -> 0x00a8 }
            r7.f273950l = r2     // Catch:{ all -> 0x00a8 }
        L_0x007e:
            long r4 = r1.f32245b     // Catch:{ all -> 0x00a8 }
            r7.f273951m = r4     // Catch:{ all -> 0x00a8 }
            long r4 = r1.f32249g     // Catch:{ all -> 0x00a8 }
            r7.f273952n = r4     // Catch:{ all -> 0x00a8 }
            boolean r2 = r1.f32247d     // Catch:{ all -> 0x00a8 }
            r7.f273953o = r2     // Catch:{ all -> 0x00a8 }
            int r2 = r1.f32252j     // Catch:{ all -> 0x00a8 }
            r7.f273954p = r2     // Catch:{ all -> 0x00a8 }
            boolean r2 = r1.f32250h     // Catch:{ all -> 0x00a8 }
            r7.f273955q = r2     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = r1.f32251i     // Catch:{ all -> 0x00a8 }
            r7.f273956r = r2     // Catch:{ all -> 0x00a8 }
            int r1 = r1.f32253k     // Catch:{ all -> 0x00a8 }
            com.google.ai.b.xb r1 = com.google.p375ai.p378b.C8142xb.m22954a(r1)     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00a0
            com.google.ai.b.xb r1 = com.google.p375ai.p378b.C8142xb.UNKNOWN_SURFACE     // Catch:{ all -> 0x00a8 }
        L_0x00a0:
            r7.f273957s = r1     // Catch:{ all -> 0x00a8 }
        L_0x00a2:
            r7.f273947i = r3     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98106cg.m162468t():void");
    }

    /* renamed from: u */
    private final void m162469u() {
        m162468t();
        C9288f fVar = (C9288f) C9289g.f32242l.createBuilder();
        long b = mo85643b();
        fVar.copyOnWrite();
        C9289g gVar = (C9289g) fVar.instance;
        gVar.f32244a |= 1;
        gVar.f32245b = b;
        long c = mo85644c();
        fVar.copyOnWrite();
        C9289g gVar2 = (C9289g) fVar.instance;
        gVar2.f32244a |= 8;
        gVar2.f32249g = c;
        boolean l = mo85652l();
        fVar.copyOnWrite();
        C9289g gVar3 = (C9289g) fVar.instance;
        gVar3.f32244a |= 4;
        gVar3.f32247d = l;
        boolean k = mo85651k();
        fVar.copyOnWrite();
        C9289g gVar4 = (C9289g) fVar.instance;
        gVar4.f32244a |= 16;
        gVar4.f32250h = k;
        int a = mo85642a();
        fVar.copyOnWrite();
        C9289g gVar5 = (C9289g) fVar.instance;
        gVar5.f32244a |= 64;
        gVar5.f32252j = a;
        String f = mo85646f();
        fVar.copyOnWrite();
        C9289g gVar6 = (C9289g) fVar.instance;
        f.getClass();
        gVar6.f32244a |= 32;
        gVar6.f32251i = f;
        C8142xb e = mo85645e();
        fVar.copyOnWrite();
        C9289g gVar7 = (C9289g) fVar.instance;
        gVar7.f32253k = e.f28649u;
        gVar7.f32244a |= 128;
        Locale s = m162467s();
        if (s != null) {
            String locale = s.toString();
            fVar.copyOnWrite();
            C9289g gVar8 = (C9289g) fVar.instance;
            locale.getClass();
            gVar8.f32244a |= 2;
            gVar8.f32246c = locale;
        }
        List<C118571d> q = mo90964q();
        fVar.copyOnWrite();
        C9289g gVar9 = (C9289g) fVar.instance;
        C62961ch chVar = gVar9.f32248e;
        if (!chVar.mo58948c()) {
            gVar9.f32248e = C62942bv.mutableCopy(chVar);
        }
        for (C118571d dVar : q) {
            gVar9.f32248e.mo58916g(dVar.f329810F);
        }
        C86337q b2 = ((C86338r) this.f273944f.mo17428b()).mo80076b();
        b2.mo80068c("now_entry_validation_state", ((C9289g) fVar.build()).toByteArray());
        b2.apply();
    }

    /* renamed from: v */
    private final boolean m162470v() {
        boolean z;
        synchronized (this.f273958t) {
            m162468t();
            z = this.f273948j;
        }
        return z;
    }

    /* renamed from: a */
    public final int mo85642a() {
        int i;
        synchronized (this.f273958t) {
            m162468t();
            i = this.f273954p;
        }
        return i;
    }

    /* renamed from: b */
    public final long mo85643b() {
        long j;
        synchronized (this.f273958t) {
            m162468t();
            j = this.f273951m;
        }
        return j;
    }

    /* renamed from: c */
    public final long mo85644c() {
        long j;
        synchronized (this.f273958t) {
            m162468t();
            j = this.f273952n;
        }
        return j;
    }

    /* renamed from: e */
    public final C8142xb mo85645e() {
        C8142xb xbVar;
        synchronized (this.f273958t) {
            m162468t();
            xbVar = this.f273957s;
        }
        return xbVar;
    }

    /* renamed from: f */
    public final String mo85646f() {
        String str;
        synchronized (this.f273958t) {
            m162468t();
            str = this.f273956r;
        }
        return str;
    }

    /* renamed from: g */
    public final void mo85647g() {
        synchronized (this.f273958t) {
            m162468t();
            this.f273949k = Arrays.asList(new C118571d[0]);
            this.f273950l = null;
            this.f273951m = 0;
            this.f273952n = 0;
            this.f273953o = false;
            this.f273956r = "no session token";
            this.f273957s = C8142xb.UNKNOWN_SURFACE;
            this.f273954p = 0;
            C86337q b = ((C86338r) this.f273944f.mo17428b()).mo80076b();
            b.mo80075j("now_entry_validation_state");
            b.apply();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryValidationState");
        fVar.mo85279c("dataPresentInPreferences").mo85276a(C90752i.m148228b(Boolean.valueOf(m162470v())));
        fVar.mo85279c("deniedRuntimePermissions").mo85276a(C90752i.m148231e(C58597ky.m90217h(mo90964q(), C98105cf.f273938a)));
        if (mo85643b() > 0) {
            fVar.mo85279c("lastRefresh").mo85276a(C90752i.m148229c(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(mo85643b()))));
        }
        if (mo85644c() > 0) {
            fVar.mo85279c("lastSession").mo85276a(C90752i.m148229c(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(mo85644c()))));
        }
        fVar.mo85279c("sessionToken").mo85276a(C90752i.m148229c(mo85646f()));
        fVar.mo85279c("promotionSurfaceType").mo85276a(C90752i.m148229c(mo85645e().name()));
        Locale s = m162467s();
        if (s != null) {
            fVar.mo85279c("locale").mo85276a(C90752i.m148229c(s.toString()));
        }
        fVar.mo85279c("talkbackEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo85652l())));
        fVar.mo85279c("gestaltVersion").mo85276a(C90752i.m148230d(Integer.valueOf(mo85642a())));
    }

    /* renamed from: h */
    public final void mo85648h(long j) {
        synchronized (this.f273958t) {
            m162468t();
            this.f273952n = j;
            m162469u();
        }
    }

    /* renamed from: i */
    public final void mo85649i(String str, C8142xb xbVar) {
        synchronized (this.f273958t) {
            m162468t();
            this.f273956r = str;
            this.f273957s = xbVar;
            m162469u();
        }
    }

    /* renamed from: j */
    public final boolean mo85650j() {
        if (this.f273940b.mo26870b() - mo85643b() > m162466r(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo85651k() {
        boolean z;
        synchronized (this.f273958t) {
            m162468t();
            z = this.f273955q;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo85652l() {
        boolean z;
        synchronized (this.f273958t) {
            m162468t();
            z = this.f273953o;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo85653m(Locale locale) {
        Locale s = m162467s();
        return s == null || s.equals(locale);
    }

    /* renamed from: n */
    public final boolean mo85654n() {
        if (!m162470v()) {
            return false;
        }
        List q = mo90964q();
        if (q != null) {
            List c = this.f273943e.mo85349c();
            C58976aa aaVar = C58975e.f156826a;
            if (q.size() == c.size() && ((q.size() == 0 && c.size() == 0) || EnumSet.copyOf(c).equals(EnumSet.copyOf(q)))) {
                if (this.f273959u.mo78205l()) {
                    return true;
                }
                long b = this.f273940b.mo26870b() - mo85643b();
                if (b >= 0 && b <= m162466r(false)) {
                    return true;
                }
                if (this.f273959u.mo78205l()) {
                    this.f273946h.mo41675I();
                }
                return false;
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (this.f273959u.mo78205l()) {
            this.f273946h.mo41675I();
        }
        return false;
    }

    /* renamed from: o */
    public final void mo85655o(boolean z, Locale locale, List list) {
        synchronized (this.f273958t) {
            this.f273951m = this.f273940b.mo26870b();
            this.f273953o = z;
            this.f273954p = (int) this.f273942d.mo79743a(C90010bp.f246919O);
            this.f273950l = locale;
            this.f273949k = list;
            this.f273947i = true;
            this.f273948j = true;
            this.f273955q = false;
            m162469u();
        }
    }

    /* renamed from: p */
    public final void mo85656p() {
        synchronized (this.f273958t) {
            m162468t();
            this.f273955q = true;
            m162469u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final List mo90964q() {
        List list;
        synchronized (this.f273958t) {
            m162468t();
            list = this.f273949k;
        }
        return list;
    }
}
