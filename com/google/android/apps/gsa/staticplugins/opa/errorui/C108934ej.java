package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.settings.shared.ai;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113760ac;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.setupdesign.p3558f.C45311e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4553a.C59567w;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ej */
/* compiled from: PG */
public final class C108934ej implements C90991b {

    /* renamed from: a */
    public static final C58974d f302877a = C58974d.m91136j();

    /* renamed from: A */
    private final C68214a f302878A;

    /* renamed from: B */
    private final C14096x f302879B;

    /* renamed from: C */
    private C60870cx f302880C = C60856cj.m92898g();

    /* renamed from: D */
    private C60870cx f302881D = C60856cj.m92898g();

    /* renamed from: E */
    private C60870cx f302882E = C60856cj.m92898g();

    /* renamed from: F */
    private final C114250c f302883F;

    /* renamed from: b */
    private final Context f302884b;

    /* renamed from: c */
    private final C22871g f302885c;

    /* renamed from: d */
    private final C86124t f302886d;

    /* renamed from: e */
    private final SharedPreferences f302887e;

    /* renamed from: f */
    private final C21370a f302888f;

    /* renamed from: g */
    private final C68214a f302889g;

    /* renamed from: h */
    private final C58833ax f302890h;

    /* renamed from: i */
    private final bm f302891i;

    /* renamed from: j */
    private final C9388a f302892j;

    /* renamed from: k */
    private final C113760ac f302893k;

    /* renamed from: l */
    private final C108887cq f302894l;

    /* renamed from: m */
    private final C9325m f302895m;

    /* renamed from: n */
    private final Queue f302896n;

    /* renamed from: o */
    private final C113787bc f302897o;

    /* renamed from: p */
    private final boolean f302898p;

    /* renamed from: q */
    private final C86054o f302899q;

    /* renamed from: r */
    private final C108993n f302900r;

    /* renamed from: s */
    private final C108891cu f302901s;

    /* renamed from: t */
    private final C68214a f302902t;

    /* renamed from: u */
    private final C113868cw f302903u;

    /* renamed from: v */
    private final C108899db f302904v;

    /* renamed from: w */
    private final ai f302905w;

    /* renamed from: x */
    private final C108135a f302906x;

    /* renamed from: y */
    private final C58833ax f302907y;

    /* renamed from: z */
    private final C58833ax f302908z;

    public C108934ej(Context context, C22871g gVar, C86124t tVar, SharedPreferences sharedPreferences, C21370a aVar, C58833ax axVar, bm bmVar, C68214a aVar2, C9388a aVar3, C113760ac acVar, C113787bc bcVar, ai aiVar, C108135a aVar4, boolean z, C86054o oVar, C108993n nVar, C108891cu cuVar, C108887cq cqVar, C68214a aVar5, C113868cw cwVar, C108899db dbVar, C114250c cVar, C9325m mVar, C58833ax axVar2, C58833ax axVar3, C68214a aVar6, C14096x xVar) {
        this.f302884b = context;
        this.f302885c = gVar;
        this.f302886d = tVar;
        this.f302887e = sharedPreferences;
        this.f302888f = aVar;
        this.f302890h = axVar;
        this.f302891i = bmVar;
        this.f302889g = aVar2;
        this.f302892j = aVar3;
        this.f302893k = acVar;
        this.f302894l = cqVar;
        this.f302896n = new C58781rt(new C58425eo(5));
        this.f302897o = bcVar;
        this.f302905w = aiVar;
        this.f302906x = aVar4;
        this.f302898p = z;
        this.f302899q = oVar;
        this.f302900r = nVar;
        this.f302901s = cuVar;
        this.f302902t = aVar5;
        this.f302903u = cwVar;
        this.f302904v = dbVar;
        this.f302883F = cVar;
        this.f302895m = mVar;
        this.f302907y = axVar2;
        this.f302908z = axVar3;
        this.f302878A = aVar6;
        this.f302879B = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0334, code lost:
        if (mo97288f(r10) == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x033e, code lost:
        if (mo97288f(r10) != false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0342, code lost:
        return com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.f302928t;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el m181167i(com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig r10) {
        /*
            r9 = this;
            r9.mo97287e()
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248937D
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0019
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.morris.b.x r0 = r9.f302879B
            com.google.android.libraries.storage.protostore.ab r0 = r0.f42764b
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()
            r9.f302882E = r0
        L_0x0019:
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248583da
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0053
            android.content.SharedPreferences r0 = r9.f302887e
            java.lang.String r2 = "opa_add_shortcut_screen_seen_count"
            int r0 = r0.getInt(r2, r1)
            long r2 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248572cu
            long r4 = r0.mo79743a(r4)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            com.google.android.apps.gsa.staticplugins.opa.util.cw r0 = r9.f302903u
            boolean r0 = r0.mo100727a()
            if (r0 != 0) goto L_0x0053
            com.google.android.apps.gsa.staticplugins.opa.widget.impl.c r0 = r9.f302883F
            boolean r0 = r0.mo101288a()
            if (r0 != 0) goto L_0x0053
            boolean r0 = r9.mo97288f(r10)
            if (r0 == 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.ADD_SHORTCUT
            return r10
        L_0x0053:
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248574cw
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0077
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x0077
            com.google.android.apps.gsa.assistant.settings.shared.ai r0 = r9.f302905w
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0077
            com.google.android.apps.gsa.staticplugins.opa.chathead.a r0 = r9.f302906x
            boolean r0 = r0.mo96476i()
            if (r0 != 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.CHAT_HEAD_OPTIN
            return r10
        L_0x0077:
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = r9.f302899q
            android.accounts.Account r0 = r0.mo79668a()
            java.lang.String r2 = "StartupChecker"
            if (r0 != 0) goto L_0x0094
            com.google.common.f.a.d r0 = f302877a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r2)
            java.lang.String r3 = "isOmniconsentRequired: account expected, but not found. Cannot consent."
            r4 = 24446(0x5f7e, float:3.4256E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x00d8
        L_0x0094:
            com.google.android.apps.gsa.search.core.i.t r3 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x00b7
            com.google.android.apps.gsa.search.core.i.t r3 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247225dD
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x00d8
            boolean r3 = r10.mo97187f()
            if (r3 != 0) goto L_0x00d5
            com.google.android.apps.gsa.staticplugins.opa.errorui.cu r3 = r9.f302901s
            boolean r0 = r3.mo97261a(r0)
            if (r0 == 0) goto L_0x00d8
            goto L_0x00d5
        L_0x00b7:
            com.google.android.apps.gsa.search.core.i.t r3 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247225dD
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x00d8
            boolean r3 = r10.mo97187f()
            if (r3 != 0) goto L_0x00cf
            com.google.android.apps.gsa.staticplugins.opa.errorui.cu r3 = r9.f302901s
            boolean r0 = r3.mo97261a(r0)
            if (r0 == 0) goto L_0x00d8
        L_0x00cf:
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x00d8
        L_0x00d5:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.OMNICONSENT_REQUIRED
            return r10
        L_0x00d8:
            boolean r0 = r9.mo97290h(r10)
            if (r0 != 0) goto L_0x036a
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248981n
            boolean r0 = r0.mo79746e(r3)
            r3 = 2
            r4 = 1
            if (r0 != 0) goto L_0x00eb
            goto L_0x0151
        L_0x00eb:
            com.google.android.apps.gsa.staticplugins.opa.errorui.db r0 = r9.f302904v
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f302774f
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248980m
            boolean r5 = r5.mo79746e(r6)
            if (r5 != 0) goto L_0x0107
            dagger.a r5 = r0.f302776h
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.bo r5 = (com.google.android.apps.gsa.search.core.C85664bo) r5
            com.google.android.apps.gsa.search.core.bm r6 = com.google.android.apps.gsa.search.core.C85662bm.WEB_HISTORY
            boolean r5 = r5.mo79197l(r6)
            if (r5 == 0) goto L_0x0151
        L_0x0107:
            com.google.android.apps.gsa.search.core.google.gaia.o r5 = r0.f302778j
            android.accounts.Account r5 = r5.mo79668a()
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f302774f
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248979l
            boolean r6 = r6.mo79746e(r7)
            if (r6 != 0) goto L_0x0121
            if (r5 == 0) goto L_0x0121
            com.google.android.apps.gsa.assistant.settings.devices.c.b.l r6 = r0.f302777i
            boolean r5 = r6.mo17959h(r5)
            if (r5 == 0) goto L_0x0151
        L_0x0121:
            com.google.android.apps.gsa.assistant.shared.bm r0 = r0.f302771c
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0151
            com.google.android.apps.gsa.staticplugins.opa.errorui.db r0 = r9.f302904v
            android.content.SharedPreferences r5 = r0.f302775g
            java.lang.String r6 = "opa_wakeup_routine_opt_in_status"
            int r5 = r5.getInt(r6, r1)
            if (r5 == r4) goto L_0x0151
            android.content.SharedPreferences r0 = r0.f302775g
            int r0 = r0.getInt(r6, r1)
            if (r0 == r3) goto L_0x0151
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x0148
            goto L_0x014e
        L_0x0148:
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x0151
        L_0x014e:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.WAKEUP_ROUTINE
            return r10
        L_0x0151:
            com.google.common.base.ax r0 = r9.f302890h
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.bo r0 = (com.google.android.apps.gsa.nga.api.C74714bo) r0
            boolean r0 = r0.mo71081c()
            if (r0 == 0) goto L_0x0179
            dagger.a r0 = r9.f302902t
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.aq.a r0 = (com.google.android.apps.gsa.shared.p6995aq.C89256a) r0
            int r0 = r0.mo83216d()
            if (r0 != r3) goto L_0x0179
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248976i
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x0179
            r0 = 1
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            dagger.a r5 = r9.f302902t
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.aq.a r5 = (com.google.android.apps.gsa.shared.p6995aq.C89256a) r5
            int r5 = r5.mo83216d()
            if (r5 != r3) goto L_0x0194
            com.google.android.apps.gsa.search.core.i.t r5 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248977j
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0194
            r5 = 1
            goto L_0x0195
        L_0x0194:
            r5 = 0
        L_0x0195:
            com.google.android.apps.gsa.search.core.i.t r6 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r6 = r6.mo79746e(r7)
            java.lang.String r7 = "opa_nga_swipe_demo_seen_count"
            if (r6 == 0) goto L_0x01b9
            if (r0 != 0) goto L_0x01a5
            if (r5 == 0) goto L_0x01d9
        L_0x01a5:
            android.content.SharedPreferences r0 = r9.f302887e
            int r0 = r0.getInt(r7, r1)
            long r5 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248938E
            long r7 = r0.mo79743a(r7)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x01d6
            goto L_0x01d9
        L_0x01b9:
            if (r0 != 0) goto L_0x01bd
            if (r5 == 0) goto L_0x01d9
        L_0x01bd:
            android.content.SharedPreferences r0 = r9.f302887e
            int r0 = r0.getInt(r7, r1)
            long r5 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248938E
            long r7 = r0.mo79743a(r7)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d9
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x01d9
        L_0x01d6:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.NGA_SWIPE_DEMO
            return r10
        L_0x01d9:
            boolean r0 = r9.m181171m(r10)
            if (r0 == 0) goto L_0x01e1
            goto L_0x027a
        L_0x01e1:
            android.os.Bundle r0 = r10.mo97184c()
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142266aN(r0)
            if (r0 != 0) goto L_0x027a
            boolean r0 = m181169k(r10)
            if (r0 != 0) goto L_0x027a
            boolean r0 = m181174p(r10)
            if (r0 != 0) goto L_0x027a
            boolean r0 = m181173o(r10)
            if (r0 != 0) goto L_0x027a
            boolean r0 = r9.m181170l(r10)
            if (r0 != 0) goto L_0x027a
            com.google.android.apps.gsa.assist.c.a.a r0 = r9.f302892j
            boolean r0 = r0.mo17584f()
            if (r0 != 0) goto L_0x022e
            com.google.android.apps.gsa.assist.c.a.a r0 = r9.f302892j
            boolean r0 = r0.mo17583e()
            if (r0 != 0) goto L_0x022e
            com.google.android.apps.gsa.assist.c.a.a r0 = r9.f302892j
            boolean r0 = r0.mo17585g()
            if (r0 != 0) goto L_0x022e
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248940G
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x0247
            com.google.common.base.ax r0 = r9.f302907y
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x022e
            goto L_0x0247
        L_0x022e:
            boolean r0 = r9.mo97289g()
            if (r0 != 0) goto L_0x0247
            com.google.android.apps.gsa.staticplugins.opa.errorui.db r0 = r9.f302904v
            boolean r0 = r0.mo97264c()
            if (r0 != 0) goto L_0x0247
            com.google.android.apps.gsa.staticplugins.opa.errorui.db r0 = r9.f302904v
            boolean r0 = r0.mo97263b()
            if (r0 == 0) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r0 = 0
            goto L_0x0248
        L_0x0247:
            r0 = 1
        L_0x0248:
            com.google.android.apps.gsa.search.core.i.t r5 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248944K
            boolean r5 = r5.mo79746e(r6)
            if (r5 != 0) goto L_0x0260
            if (r0 != 0) goto L_0x025f
            com.google.android.apps.gsa.staticplugins.opa.errorui.cq r0 = r9.f302894l
            boolean r0 = r0.mo97255c()
            if (r0 == 0) goto L_0x025d
            goto L_0x025f
        L_0x025d:
            r0 = 0
            goto L_0x0260
        L_0x025f:
            r0 = 1
        L_0x0260:
            com.google.android.apps.gsa.search.core.i.t r5 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r5 = r5.mo79746e(r6)
            if (r5 != 0) goto L_0x0275
            if (r0 == 0) goto L_0x0274
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x0274
            r0 = 1
            goto L_0x0275
        L_0x0274:
            r0 = 0
        L_0x0275:
            if (r0 == 0) goto L_0x027a
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.GET_MORE
            return r10
        L_0x027a:
            dagger.a r0 = r9.f302878A
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x02a8
            dagger.a r0 = r9.f302878A
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.bn r0 = (com.google.android.apps.gsa.nga.api.C74713bn) r0
            boolean r0 = r0.mo71076a()
            if (r0 == 0) goto L_0x02a8
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248948O
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x02a8
            r0 = 1
            goto L_0x02a9
        L_0x02a8:
            r0 = 0
        L_0x02a9:
            com.google.android.apps.gsa.search.core.i.t r5 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x02b6
            if (r0 != 0) goto L_0x02be
            goto L_0x02c1
        L_0x02b6:
            if (r0 == 0) goto L_0x02c1
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x02c1
        L_0x02be:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.VOICE_SESSION
            return r10
        L_0x02c1:
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248944K
            boolean r0 = r0.mo79746e(r5)
            if (r0 != 0) goto L_0x02cc
            goto L_0x02fa
        L_0x02cc:
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248948O
            boolean r0 = r0.mo79746e(r5)
            if (r0 != 0) goto L_0x02fa
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x02e9
            com.google.android.apps.gsa.staticplugins.opa.errorui.cq r0 = r9.f302894l
            boolean r0 = r0.mo97255c()
            if (r0 == 0) goto L_0x02fa
            goto L_0x02f7
        L_0x02e9:
            com.google.android.apps.gsa.staticplugins.opa.errorui.cq r0 = r9.f302894l
            boolean r0 = r0.mo97255c()
            if (r0 == 0) goto L_0x02fa
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x02fa
        L_0x02f7:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.CONTINUED_CONVERSATION_OPTIN
            return r10
        L_0x02fa:
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f302886d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248937D
            boolean r0 = r0.mo79746e(r5)
            if (r0 != 0) goto L_0x0305
            goto L_0x0343
        L_0x0305:
            com.google.common.util.concurrent.cx r0 = r9.f302882E     // Catch:{ IllegalStateException | ExecutionException -> 0x0337 }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ IllegalStateException | ExecutionException -> 0x0337 }
            com.google.android.libraries.assistant.auto.tng.morris.b.e r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e) r0     // Catch:{ IllegalStateException | ExecutionException -> 0x0337 }
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r5 = r0.f42740h
            if (r5 != 0) goto L_0x0313
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r5 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14068ac.f42705h
        L_0x0313:
            int r5 = r5.f42708b
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14067ab.m30357b(r5)
            if (r5 != 0) goto L_0x031c
            r5 = 1
        L_0x031c:
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r0 = r0.f42740h
            if (r0 != 0) goto L_0x0322
            com.google.android.libraries.assistant.auto.tng.morris.b.ac r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14068ac.f42705h
        L_0x0322:
            int r0 = r0.f42709c
            int r0 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14067ab.m30357b(r0)
            if (r0 != 0) goto L_0x032b
            goto L_0x032c
        L_0x032b:
            r4 = r0
        L_0x032c:
            if (r5 != r3) goto L_0x0343
            if (r4 != r3) goto L_0x0343
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x0343
            goto L_0x0340
        L_0x0337:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r9.mo97288f(r10)
            if (r0 != 0) goto L_0x0343
        L_0x0340:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.MORRIS_PERMISSIONS
            return r10
        L_0x0343:
            boolean r10 = r10.mo97188g()
            if (r10 == 0) goto L_0x0368
            com.google.android.apps.gsa.staticplugins.opa.util.bc r10 = r9.f302897o
            boolean r10 = r10.mo100629i(r1)
            if (r10 == 0) goto L_0x0368
            com.google.common.f.a.d r10 = f302877a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r2)
            java.lang.String r0 = "There is no onboarding screen to show."
            r1 = 24434(0x5f72, float:3.424E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.opa.util.bc r10 = r9.f302897o
            r10.mo100625e()
        L_0x0368:
            r10 = 0
            return r10
        L_0x036a:
            com.google.android.apps.gsa.staticplugins.opa.errorui.el r10 = com.google.android.apps.gsa.staticplugins.opa.errorui.C108936el.HOTWORD_TRAINING_REQUIRED
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej.m181167i(com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig):com.google.android.apps.gsa.staticplugins.opa.errorui.el");
    }

    /* renamed from: j */
    private final C108936el m181168j(StartupConfig startupConfig) {
        if (m181172n(startupConfig)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f302881D = ((C42876ab) ((C68214a) ((C58847bk) this.f302908z).f156646a).mo27525b()).mo46042d();
        }
        if (m181172n(startupConfig) && this.f302881D.isDone()) {
            C81237ab abVar = C81237ab.f222379B;
            try {
                C81237ab abVar2 = (C81237ab) C90877ak.m148472f(this.f302881D);
                if (!abVar2.f222402u) {
                    int i = abVar2.f222401t;
                    if (((long) i) < this.f302886d.mo79743a(C90053de.f248988u) && (C45311e.m80760d(this.f302884b, R.bool.enable_long_press_power_first_time_education) || Build.BRAND.toLowerCase(Locale.ENGLISH).equals("google"))) {
                        long j = (long) abVar2.f222403v;
                        long a = this.f302886d.mo79743a(C90053de.f248992y);
                        if (i <= 0 || j >= a) {
                            return C108936el.LONG_PRESS_POWER_EDUCATION;
                        }
                        C90875ai.m148465b(C108930ef.f302874a, ((C42876ab) ((C68214a) ((C58847bk) this.f302908z).f156646a).mo27525b()).mo46039a(C108929ee.f302873a, C60826bg.f164896a), this.f302885c, "Recording longPressPowerCountSinceLastEducation").mo85223a(C108931eg.f302875a);
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
        if (!this.f302891i.q()) {
            return C108936el.UNSUPPORTED_DEVICE;
        }
        if (!this.f302891i.w()) {
            return C108936el.OPA_DISABLED;
        }
        boolean a2 = this.f302895m.mo17534a();
        C58976aa aaVar3 = C58975e.f156826a;
        if (!a2) {
            return C108936el.ASSIST_APP_NOT_GOOGLE;
        }
        if (!this.f302891i.t() && e.a(startupConfig.mo97182a()) != null && this.f302891i.z(e.a(startupConfig.mo97182a())) == 2) {
            return C108936el.UNSUPPORTED_LOCALE;
        }
        if (!((C84413ad) this.f302889g.mo27525b()).mo77971h()) {
            return C108936el.GMSCORE_UNAVAILABLE;
        }
        if (((Boolean) this.f302890h.mo56106b(C108932eh.f302876a).mo56109e(false)).booleanValue()) {
            return C108936el.NGA_UPDATE_REQUIRED;
        }
        if (this.f302886d.mo79746e(C90014bt.f247692lu)) {
            if (this.f302899q.mo79668a() != null) {
                return null;
            }
            if (startupConfig.mo97191i() && !startupConfig.mo97188g() && (this.f302897o.mo100630j() || this.f302897o.mo100632l())) {
                return null;
            }
        } else if (this.f302899q.mo79668a() != null) {
            return null;
        } else {
            if ((startupConfig.mo97191i() && !startupConfig.mo97188g() && (this.f302897o.mo100630j() || this.f302897o.mo100632l())) || mo97288f(startupConfig)) {
                return null;
            }
        }
        return C108936el.NO_ACCOUNT;
    }

    /* renamed from: k */
    private static boolean m181169k(StartupConfig startupConfig) {
        Intent w = C87566i.m142324w(startupConfig.mo97184c());
        if (w == null || w.getBooleanExtra("opa_exit_signed_out_mode_and_relaunch", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private final boolean m181170l(StartupConfig startupConfig) {
        if (!startupConfig.mo97191i() || !this.f302897o.mo100629i(false) || startupConfig.mo97188g()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private final boolean m181171m(StartupConfig startupConfig) {
        return this.f302891i.u() && C87566i.m142270aR(startupConfig.mo97184c()) && C87566i.m142309h(startupConfig.mo97184c()) == 4;
    }

    /* renamed from: n */
    private final boolean m181172n(StartupConfig startupConfig) {
        if (this.f302886d.mo79746e(C90053de.f248973f) && startupConfig.mo97182a() == 140) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private static boolean m181173o(StartupConfig startupConfig) {
        return startupConfig.mo97182a() == 51;
    }

    /* renamed from: p */
    private static boolean m181174p(StartupConfig startupConfig) {
        return startupConfig.mo97182a() == 46;
    }

    /* renamed from: a */
    public final C58833ax mo97284a(StartupConfig startupConfig) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f302898p) {
            return C58836b.f156633a;
        }
        Bundle c = startupConfig.mo97184c();
        if (c != null) {
            c.setClassLoader(C108934ej.class.getClassLoader());
        }
        C108936el j = m181168j(startupConfig);
        if (j == null) {
            j = m181167i(startupConfig);
        }
        if (j == null) {
            return C58836b.f156633a;
        }
        this.f302896n.add(new C108994o(j, this.f302888f.mo26870b(), startupConfig));
        return C58833ax.m90834k(j);
    }

    /* renamed from: b */
    public final C58833ax mo97285b(StartupConfig startupConfig) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f302898p) {
            return C58836b.f156633a;
        }
        Bundle c = startupConfig.mo97184c();
        if (c != null) {
            c.setClassLoader(C108934ej.class.getClassLoader());
        }
        C108936el i = m181167i(startupConfig);
        if (i == null) {
            return C58836b.f156633a;
        }
        this.f302896n.add(new C108994o(i, this.f302888f.mo26870b(), startupConfig));
        return C58833ax.m90834k(i);
    }

    /* renamed from: c */
    public final C58833ax mo97286c(StartupConfig startupConfig) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f302898p) {
            return C58836b.f156633a;
        }
        Bundle c = startupConfig.mo97184c();
        if (c != null) {
            c.setClassLoader(C108934ej.class.getClassLoader());
        }
        C108936el j = m181168j(startupConfig);
        if (j == null) {
            return C58836b.f156633a;
        }
        this.f302896n.add(new C108994o(j, this.f302888f.mo26870b(), startupConfig));
        return C58833ax.m90834k(j);
    }

    /* renamed from: e */
    public final void mo97287e() {
        if (this.f302886d.mo79746e(C90053de.f248940G) && this.f302907y.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f302880C = ((C9799ae) this.f302907y.mo56107c()).mo18041a();
        }
    }

    /* renamed from: f */
    public final boolean mo97288f(StartupConfig startupConfig) {
        boolean z = false;
        if (this.f302898p) {
            return false;
        }
        if (startupConfig.mo97192j() && !startupConfig.mo97188g()) {
            z = true;
            if (!this.f302897o.mo100632l()) {
                C113787bc bcVar = this.f302897o;
                Account a = bcVar.f315135d.mo79668a();
                bcVar.f315134c.edit().putBoolean(C113787bc.m188358b(a), true).putBoolean(C113787bc.m188360d(a), true).apply();
                C59567w a2 = this.f302900r.mo97354a(e.a(startupConfig.mo97182a()));
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1307;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                a2.getClass();
                ufVar2.f164173ba = a2;
                ufVar2.f164251f |= 16777216;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                C58976aa aaVar = C58975e.f156826a;
                C59081b.m91349a(C58979ad.FULL, "stack size");
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97289g() {
        /*
            r3 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r3.f302886d
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248940G
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0034
            com.google.common.base.ax r0 = r3.f302907y
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0034
            com.google.android.apps.gsa.staticplugins.opa.util.bc r0 = r3.f302897o
            boolean r0 = r0.mo100629i(r1)
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.m148680c()
            com.google.common.util.concurrent.cx r0 = r3.f302880C     // Catch:{ InterruptedException | ExecutionException -> 0x0030 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0030 }
            com.google.android.apps.gsa.assistant.settings.features.ad.w r0 = (com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0030 }
            com.google.android.apps.gsa.assistant.settings.features.ad.w r2 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY     // Catch:{ InterruptedException | ExecutionException -> 0x0030 }
            boolean r0 = r0.equals(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0030 }
            return r0
        L_0x002e:
            r0 = move-exception
            goto L_0x0033
        L_0x0030:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002e }
            return r1
        L_0x0033:
            throw r0
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej.mo97289g():boolean");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("StartupChecker");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Recent error snapshots");
        synchronized (this.f302896n) {
            for (C108933ei m : this.f302896n) {
                e.mo85286m(m);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo97290h(StartupConfig startupConfig) {
        if (C87566i.m142266aN(startupConfig.mo97184c()) || m181170l(startupConfig) || m181171m(startupConfig) || m181169k(startupConfig) || m181174p(startupConfig) || m181173o(startupConfig) || this.f302886d.mo79746e(C90014bt.f247157bp) || !((C92486a) this.f302893k.f315065a.mo27525b()).mo87242p()) {
            return false;
        }
        if (this.f302887e.getBoolean("opa_force_hotword_enrollment", false)) {
            this.f302887e.edit().remove("opa_force_hotword_enrollment").apply();
            if (!this.f302886d.mo79746e(C90014bt.f247692lu) && mo97288f(startupConfig)) {
                return false;
            }
            return true;
        } else if (this.f302886d.mo79746e(C90014bt.f247378fy) && !C87566i.m142298av(startupConfig.mo97184c()) && this.f302887e.getBoolean("opa_hotword_training_force_seen", true)) {
            return true;
        } else {
            if (!this.f302893k.mo100604a() && !startupConfig.mo97189h()) {
                if (this.f302887e.getBoolean("opa_hotword_transition_seen", false)) {
                    this.f302887e.edit().putInt("opa_hotword_training_seen_count", this.f302887e.getInt("opa_hotword_training_seen_count", 0) + 1).remove("opa_hotword_transition_seen").apply();
                }
                int i = this.f302887e.getInt("opa_hotword_training_seen_count", 0);
                boolean z = ((startupConfig.mo97182a() == 5 || startupConfig.mo97182a() == 8) && i < 3) || i == 0;
                C58976aa aaVar = C58975e.f156826a;
                if (this.f302886d.mo79746e(C90014bt.f247692lu)) {
                    return z;
                }
                if (!z || mo97288f(startupConfig)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }
}
