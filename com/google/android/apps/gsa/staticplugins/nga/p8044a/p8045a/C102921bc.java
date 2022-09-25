package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.android.C80956l;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81214fi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6408a.C82199aa;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103384h;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104026er;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ahi;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.bc */
/* compiled from: PG */
public final class C102921bc implements C74714bo, C103384h, C90991b {

    /* renamed from: b */
    public static final /* synthetic */ int f287393b = 0;

    /* renamed from: c */
    private static final C59071e f287394c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.a.a.bc");

    /* renamed from: d */
    private static final Locale f287395d = new Locale("en", "AU");

    /* renamed from: e */
    private final Context f287396e;

    /* renamed from: f */
    private final C68214a f287397f;

    /* renamed from: g */
    private final boolean f287398g;

    /* renamed from: h */
    private final C68214a f287399h;

    /* renamed from: i */
    private final C68214a f287400i;

    /* renamed from: j */
    private final C68214a f287401j;

    /* renamed from: k */
    private final C68214a f287402k;

    /* renamed from: l */
    private final C68214a f287403l;

    /* renamed from: m */
    private final Supplier f287404m;

    /* renamed from: n */
    private final C91022f f287405n;

    /* renamed from: o */
    private final C68214a f287406o;

    /* renamed from: p */
    private final C68214a f287407p;

    /* renamed from: q */
    private final C68214a f287408q;

    /* renamed from: r */
    private final C68214a f287409r;

    /* renamed from: s */
    private final C68214a f287410s;

    /* renamed from: t */
    private final C68214a f287411t;

    /* renamed from: u */
    private final C68214a f287412u;

    /* renamed from: v */
    private final AtomicBoolean f287413v = new AtomicBoolean(false);

    public C102921bc(Context context, C68214a aVar, boolean z, C91022f fVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14) {
        this.f287396e = context;
        this.f287397f = aVar;
        this.f287398g = z;
        this.f287399h = aVar2;
        this.f287400i = aVar3;
        this.f287401j = aVar4;
        this.f287406o = aVar5;
        this.f287407p = aVar6;
        this.f287409r = aVar7;
        this.f287402k = aVar9;
        this.f287403l = aVar10;
        this.f287410s = aVar8;
        this.f287405n = fVar;
        this.f287411t = aVar13;
        this.f287412u = aVar14;
        this.f287404m = new C102919ba(aVar11);
        this.f287408q = aVar12;
    }

    /* renamed from: g */
    public static ahi m170691g(Locale locale) {
        if (Locale.UK.equals(locale)) {
            return ahi.NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_GB;
        }
        if (Locale.CANADA.equals(locale)) {
            return ahi.NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_CA;
        }
        if (f287395d.equals(locale)) {
            return ahi.NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_AU;
        }
        if (Locale.JAPAN.equals(locale)) {
            return ahi.NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_JA_JP;
        }
        return ahi.NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_OTHER;
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m170692h(C68214a aVar) {
        boolean z = false;
        if (Settings.Global.getInt((ContentResolver) aVar.mo27525b(), "device_demo_mode", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: j */
    public static boolean m170693j(C90021c cVar, Locale locale) {
        return C90772bp.m148274A(cVar.mo79745c(C90126fx.f251578lU), locale.toLanguageTag());
    }

    /* renamed from: k */
    private final void m170694k() {
        if (!this.f287413v.getAndSet(true)) {
            this.f287405n.mo85301a(this);
            ((C82199aa) this.f287402k.mo27525b()).mo75540c(new C102920bb(this));
        }
    }

    /* renamed from: a */
    public final ahi mo71079a() {
        C80956l lVar = (C80956l) this.f287408q.mo27525b();
        if (!this.f287398g) {
            C58976aa aaVar = C58975e.f156826a;
            return ahi.NON_ELIGIBLE_NGA_DISABLED;
        } else if (!((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251332gn)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return ahi.NON_ELIGIBLE_NGA_FLAG_DISABLED;
        } else if (!C90772bp.m148274A(((C90021c) this.f287397f.mo27525b()).mo79745c(C90126fx.f251577lT), Build.MODEL) && (!((Boolean) this.f287403l.mo27525b()).booleanValue() || !C102922bd.m170702a())) {
            C58976aa aaVar3 = C58975e.f156826a;
            return ahi.NON_ELIGIBLE_UNSUPPORTED_DEVICE_MODEL;
        } else if (!C90685b.m148054b(this.f287396e, (C90021c) this.f287397f.mo27525b()) || ((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251338gt)) {
            return ahi.ELIGIBLE;
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return ahi.NON_ELIGIBLE_UNSUPPORTED_DEVICE_MODEL;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4552o.ahi mo71080b() {
        /*
            r4 = this;
            r4.m170694k()
            com.google.common.o.ahi r0 = r4.mo71079a()
            com.google.common.o.ahi r1 = com.google.common.p4552o.ahi.ELIGIBLE
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            dagger.a r0 = r4.f287401j
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.shared.android.r r0 = (com.google.android.apps.gsa.nga.shared.android.C80962r) r0
            boolean r1 = r0.f221961b
            if (r1 != 0) goto L_0x0057
            com.google.common.base.cr r0 = r0.f221960a
            java.lang.Object r0 = r0.mo6453a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0057
            dagger.a r0 = r4.f287397f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.c r0 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251337gs
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0052
            dagger.a r0 = r4.f287412u
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.shared.android.p r0 = (com.google.android.apps.gsa.nga.shared.android.C80960p) r0
            com.google.common.base.cr r0 = r0.f221958d
            java.lang.Object r0 = r0.mo6453a()
            java.lang.String r1 = "isUnicornAccount.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_WORK_PROFILE
            return r0
        L_0x0057:
            j$.util.function.Supplier r0 = r4.f287404m
            com.google.android.apps.gsa.staticplugins.nga.a.a.ba r0 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102919ba) r0
            dagger.a r0 = r0.f287391a
            java.lang.Boolean r0 = m170692h(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0079
            dagger.a r0 = r4.f287403l
            java.lang.Object r0 = r0.mo27525b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_DEMO_MODE_WITHOUT_DEMO_USER
            return r0
        L_0x0079:
            dagger.a r0 = r4.f287406o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r0 = (com.google.android.apps.gsa.assistant.shared.bm) r0
            boolean r0 = r0.w()
            if (r0 != 0) goto L_0x008c
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_ASSISTANT_DISABLED
            return r0
        L_0x008c:
            dagger.a r0 = r4.f287410s
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.a.a.ar r0 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102909ar) r0
            com.google.common.o.aea r0 = r0.mo93526f()
            com.google.common.o.aea r1 = com.google.common.p4552o.aea.DASHER_ACCOUNT_PRESENT
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b4
            dagger.a r0 = r4.f287410s
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.a.a.ar r0 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102909ar) r0
            boolean r0 = r0.mo93531k()
            if (r0 == 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_DASHER_SAA_DISABLED
            return r0
        L_0x00b4:
            dagger.a r0 = r4.f287409r
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.a.a.f r0 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102977f) r0
            android.view.accessibility.AccessibilityManager r1 = r0.f287550b
            boolean r1 = r1.isEnabled()
            if (r1 != 0) goto L_0x00c5
            goto L_0x010f
        L_0x00c5:
            android.view.accessibility.AccessibilityManager r1 = r0.f287550b
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x00d6
            android.view.accessibility.AccessibilityManager r1 = r0.f287550b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L_0x00d6
            goto L_0x00e4
        L_0x00d6:
            com.google.common.base.cr r0 = r0.f287554f
            java.lang.Object r0 = r0.mo6453a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010f
        L_0x00e4:
            dagger.a r0 = r4.f287397f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.c r0 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251336gr
            boolean r0 = r0.mo79746e(r1)
            dagger.a r1 = r4.f287397f
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.m.c r1 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r1
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251569lL
            com.google.common.b.gu r1 = r1.mo79745c(r2)
            java.lang.String r2 = android.os.Build.MODEL
            boolean r1 = com.google.android.apps.gsa.shared.util.C90772bp.m148274A(r1, r2)
            if (r0 == 0) goto L_0x010a
            if (r1 != 0) goto L_0x010f
        L_0x010a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_ACCESSIBILITY_ENABLED
            return r0
        L_0x010f:
            dagger.a r0 = r4.f287403l
            java.lang.Object r0 = r0.mo27525b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0132
            dagger.a r0 = r4.f287399h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.s.g r0 = (com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g) r0
            r0.mo93859b()
            boolean r0 = com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102922bd.m170702a()
            if (r0 == 0) goto L_0x0132
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.ELIGIBLE
            goto L_0x01aa
        L_0x0132:
            dagger.a r0 = r4.f287406o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r0 = (com.google.android.apps.gsa.assistant.shared.bm) r0
            boolean r0 = r0.t()
            if (r0 != 0) goto L_0x0143
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_LOCALE_NOT_SUPPORTED_BY_OPA
            goto L_0x01aa
        L_0x0143:
            dagger.a r0 = r4.f287397f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.c r0 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f250962O
            boolean r1 = r0.mo79746e(r1)
            if (r1 != 0) goto L_0x016d
            dagger.a r1 = r4.f287399h
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.s.g r1 = (com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g) r1
            java.util.Locale r1 = r1.mo93859b()
            boolean r0 = m170693j(r0, r1)
            if (r0 == 0) goto L_0x0168
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.ELIGIBLE
            goto L_0x01aa
        L_0x0168:
            com.google.common.o.ahi r0 = m170691g(r1)
            goto L_0x01aa
        L_0x016d:
            dagger.a r1 = r4.f287399h
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.s.g r1 = (com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g) r1
            com.google.common.b.gu r1 = r1.mo93858a()
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x018b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251133d
            boolean r2 = r0.mo79746e(r2)
            if (r2 != 0) goto L_0x018b
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.NON_ELIGIBLE_MULTIPLE_ASSISTANT_LANGUAGES
            goto L_0x01aa
        L_0x018b:
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.nga.a.a.ay r2 = new com.google.android.apps.gsa.staticplugins.nga.a.a.ay
            r2.<init>(r0)
            j$.util.stream.Stream r0 = r1.filter(r2)
            j$.util.Optional r0 = r0.findFirst()
            com.google.android.apps.gsa.staticplugins.nga.a.a.az r1 = com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102917az.f287389a
            j$.util.Optional r0 = r0.map(r1)
            com.google.common.o.ahi r1 = com.google.common.p4552o.ahi.ELIGIBLE
            java.lang.Object r0 = r0.orElse(r1)
            com.google.common.o.ahi r0 = (com.google.common.p4552o.ahi) r0
        L_0x01aa:
            com.google.common.o.ahi r1 = com.google.common.p4552o.ahi.ELIGIBLE
            if (r1 == r0) goto L_0x01b1
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r0
        L_0x01b1:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.ahi r0 = com.google.common.p4552o.ahi.ELIGIBLE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102921bc.mo71080b():com.google.common.o.ahi");
    }

    /* renamed from: c */
    public final boolean mo71081c() {
        return mo71080b() == ahi.ELIGIBLE;
    }

    /* renamed from: e */
    public final boolean mo71082e() {
        if (!mo71081c()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (((Boolean) this.f287403l.mo27525b()).booleanValue()) {
            return false;
        } else {
            return mo71083f();
        }
    }

    /* renamed from: f */
    public final boolean mo71083f() {
        boolean z = false;
        if (((C102909ar) this.f287410s.mo27525b()).f287375i.get()) {
            C59104x d = f287394c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NgaEligibility");
            ((C59052c) ((C59052c) d).mo56372aa(21369)).mo56386p("Invalid OAuth token. Skipping initial downloader.");
            ((C102909ar) this.f287410s.mo27525b()).mo93529i();
            return false;
        }
        if (((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251140dG)) {
            z = !((C104026er) this.f287400i.mo27525b()).mo93923g();
        }
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            ((C102909ar) this.f287410s.mo27525b()).mo93529i();
        }
        return z;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        ahi b = mo71080b();
        String name = b.name();
        fVar.mo85291r("NgaEligibility");
        C91005e b2 = fVar.mo85278b("NGA eligibility");
        if (TextUtils.isEmpty(name)) {
            name = String.valueOf(b.f158764y);
        }
        b2.mo85276a(C90752i.m148229c(name));
        if (b == ahi.ELIGIBLE) {
            C81214fi fiVar = (C81214fi) this.f287407p.mo27525b();
        }
        ((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251586lc);
        fVar.mo85278b("Panthera enabled").mo85276a(C90752i.m148229c(Boolean.toString(false)));
        fVar.mo85278b("Panthera DF enabled").mo85276a(C90752i.m148229c(Boolean.toString(false)));
        fVar.mo85278b("Sierra DF account").mo85276a(C90752i.m148229c(Boolean.toString(((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251587ld))));
        String x = ((C90021c) this.f287397f.mo27525b()).mo79758x(C90126fx.f251581lX);
        if (!x.isEmpty()) {
            fVar.mo85278b("NGAv2 Enabled Features").mo85276a(C90752i.m148229c(x.trim()));
        }
        ((C102909ar) this.f287410s.mo27525b()).mo17602gS(fVar);
    }

    /* renamed from: i */
    public final void mo93533i() {
        m170694k();
        ArrayList arrayList = new ArrayList();
        if (mo71081c()) {
            C81214fi fiVar = (C81214fi) this.f287407p.mo27525b();
            arrayList.add(46679652);
            if (!((C90021c) this.f287397f.mo27525b()).mo79758x(C90126fx.f251581lX).isEmpty()) {
                arrayList.add(46707062);
            }
        } else {
            arrayList.add(46679651);
        }
        if (((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251479jb)) {
            arrayList.add(46707638);
        }
        if (((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251327gi)) {
            arrayList.add(46741981);
        }
        if (((C90021c) this.f287397f.mo27525b()).mo79746e(C90126fx.f251328gj)) {
            arrayList.add(46741982);
        }
        ((C31639g) this.f287411t.mo27525b()).mo37290d(Collection.EL.stream(arrayList).mapToInt(C102914aw.f287386a).toArray(), "com.google.android.googlequicksearchbox", "STREAMZ_NGA");
        ((C31639g) this.f287411t.mo27525b()).mo37290d(Collection.EL.stream(arrayList).mapToInt(C102915ax.f287387a).toArray(), "com.google.android.googlequicksearchbox_primes", "ANDROID_GSA_ANDROID_PRIMES");
    }
}
