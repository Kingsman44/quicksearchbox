package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.a */
/* compiled from: PG */
public final class C109625a implements C14653a {

    /* renamed from: a */
    public static final C59071e f305290a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.a");

    /* renamed from: b */
    public final Context f305291b;

    /* renamed from: c */
    public final C14647d f305292c;

    /* renamed from: d */
    public final C14096x f305293d;

    /* renamed from: e */
    public final C14115ap f305294e;

    /* renamed from: f */
    public final C91093c f305295f;

    /* renamed from: g */
    public final C86054o f305296g;

    /* renamed from: h */
    public Optional f305297h = Optional.empty();

    /* renamed from: i */
    public Optional f305298i = Optional.empty();

    public C109625a(Context context, C14647d dVar, C14115ap apVar, C14096x xVar, C86054o oVar) {
        this.f305291b = context;
        this.f305292c = dVar;
        this.f305294e = apVar;
        this.f305293d = xVar;
        this.f305295f = new C91093c(context);
        this.f305296g = oVar;
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
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305297h = Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final C52686as mo97919f(C14749d dVar) {
        C14239bw bwVar;
        Optional a = dVar.mo21714a(C14984b.m31508f());
        if (a.isPresent()) {
            C14221be beVar = (C14221be) a.get();
            if (beVar.f43043a == 13) {
                bwVar = (C14239bw) beVar.f43044b;
            } else {
                bwVar = C14239bw.f43093c;
            }
            C52686as asVar = bwVar.f43095a;
            if (asVar != null) {
                return asVar;
            }
            C59104x c = f305290a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.SettingsCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(24849)).mo56386p("Missing driving settings data from datasource");
        } else {
            C59104x c2 = f305290a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.SettingsCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(24848)).mo56386p("Failed to retrieve driving settings response");
        }
        return C52686as.f138291q;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0170, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020f, code lost:
        return false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21623h(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf r5, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f r6, com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e r7, com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d r8) {
        /*
            r4 = this;
            int r6 = r5.f43800c
            r7 = 17
            if (r6 != r7) goto L_0x000b
            java.lang.Object r5 = r5.f43801d
            com.google.android.libraries.assistant.auto.tng.morris.e.kt r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14479kt) r5
            goto L_0x000d
        L_0x000b:
            com.google.android.libraries.assistant.auto.tng.morris.e.kt r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14479kt.f43760e
        L_0x000d:
            int r6 = r5.f43763b
            r0 = 16
            r1 = 2
            r2 = 0
            switch(r6) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0041;
                case 2: goto L_0x003f;
                case 3: goto L_0x003d;
                case 4: goto L_0x003b;
                case 5: goto L_0x0039;
                case 6: goto L_0x0036;
                case 7: goto L_0x0033;
                case 8: goto L_0x0030;
                case 9: goto L_0x002d;
                case 10: goto L_0x002a;
                case 11: goto L_0x0027;
                case 12: goto L_0x0024;
                case 13: goto L_0x0021;
                case 14: goto L_0x001e;
                case 15: goto L_0x0044;
                case 16: goto L_0x001b;
                case 17: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            r7 = 0
            goto L_0x0044
        L_0x0018:
            r7 = 19
            goto L_0x0044
        L_0x001b:
            r7 = 18
            goto L_0x0044
        L_0x001e:
            r7 = 16
            goto L_0x0044
        L_0x0021:
            r7 = 15
            goto L_0x0044
        L_0x0024:
            r7 = 14
            goto L_0x0044
        L_0x0027:
            r7 = 13
            goto L_0x0044
        L_0x002a:
            r7 = 12
            goto L_0x0044
        L_0x002d:
            r7 = 11
            goto L_0x0044
        L_0x0030:
            r7 = 10
            goto L_0x0044
        L_0x0033:
            r7 = 9
            goto L_0x0044
        L_0x0036:
            r7 = 8
            goto L_0x0044
        L_0x0039:
            r7 = 7
            goto L_0x0044
        L_0x003b:
            r7 = 6
            goto L_0x0044
        L_0x003d:
            r7 = 5
            goto L_0x0044
        L_0x003f:
            r7 = 4
            goto L_0x0044
        L_0x0041:
            r7 = 3
            goto L_0x0044
        L_0x0043:
            r7 = 2
        L_0x0044:
            r6 = 1
            if (r7 != 0) goto L_0x0048
            r7 = 1
        L_0x0048:
            int r7 = r7 + -2
            java.lang.String r3 = "screenKey"
            switch(r7) {
                case 1: goto L_0x0255;
                case 2: goto L_0x0210;
                case 3: goto L_0x020f;
                case 4: goto L_0x01fc;
                case 5: goto L_0x01f3;
                case 6: goto L_0x017a;
                case 7: goto L_0x0173;
                case 8: goto L_0x0138;
                case 9: goto L_0x0173;
                case 10: goto L_0x0131;
                case 11: goto L_0x012a;
                case 12: goto L_0x00fa;
                case 13: goto L_0x00f1;
                case 14: goto L_0x0173;
                case 15: goto L_0x00a2;
                case 16: goto L_0x0098;
                case 17: goto L_0x0051;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0299
        L_0x0051:
            boolean r7 = r5.f43764c
            if (r7 == 0) goto L_0x006d
            android.content.Context r7 = r4.f305291b
            boolean r7 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30481b(r7)
            if (r7 == 0) goto L_0x005e
            goto L_0x006d
        L_0x005e:
            com.google.android.libraries.assistant.auto.tng.morris.e.lj r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj.NOTIFICATION_PERMISSIONS_TASK
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            r4.f305297h = r5
            com.google.android.libraries.assistant.auto.tng.morris.b.x r5 = r4.f305293d
            r5.mo21400d(r6)
            goto L_0x0170
        L_0x006d:
            com.google.assistant.e.l.a.as r6 = r4.mo97919f(r8)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.l.a.ar r6 = (com.google.assistant.p3897e.p3929l.p3930a.C52685ar) r6
            boolean r5 = r5.f43764c
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.l.a.as r7 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r7
            int r0 = r7.f138293a
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 | r1
            r7.f138293a = r0
            r7.f138306n = r5
            com.google.protobuf.bv r5 = r6.build()
            com.google.assistant.e.l.a.as r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31518p(r5)
            r8.mo21716c(r5)
            goto L_0x0299
        L_0x0098:
            com.google.assistant.e.l.a.as r5 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31518p(r5)
            r8.mo21716c(r5)
            return r2
        L_0x00a2:
            com.google.assistant.e.l.a.as r6 = r4.mo97919f(r8)
            com.google.protobuf.bn r7 = r6.toBuilder()
            com.google.assistant.e.l.a.ar r7 = (com.google.assistant.p3897e.p3929l.p3930a.C52685ar) r7
            int r5 = r5.f43765d
            int r5 = com.google.assistant.p3897e.p3929l.p3930a.C52699be.m86694a(r5)
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.assistant.e.l.a.as r0 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r0
            int r3 = r5 + -1
            if (r5 == 0) goto L_0x00ef
            r0.f138302j = r3
            int r5 = r0.f138293a
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r0.f138293a = r5
            int r5 = r6.f138302j
            int r5 = com.google.assistant.p3897e.p3929l.p3930a.C52699be.m86694a(r5)
            if (r5 != 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r1 = r5
        L_0x00cf:
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.assistant.e.l.a.as r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r5
            int r1 = r1 + -1
            r5.f138303k = r1
            int r6 = r5.f138293a
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r5.f138293a = r6
            com.google.protobuf.bv r5 = r7.build()
            com.google.assistant.e.l.a.as r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31518p(r5)
            r8.mo21716c(r5)
            goto L_0x0299
        L_0x00ef:
            r5 = 0
            throw r5
        L_0x00f1:
            com.google.android.libraries.assistant.auto.tng.morris.e.lj r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj.PRIVACY_DISCLAIMER_TASK
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            r4.f305297h = r5
            return r6
        L_0x00fa:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r6 = r4.f305291b
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.AssistantSettingsIntentLauncherActivity> r7 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.AssistantSettingsIntentLauncherActivity.class
            r5.<init>(r6, r7)
            java.lang.String r6 = "privacy"
            r5.putExtra(r3, r6)
            com.google.android.apps.gsa.search.core.google.gaia.o r6 = r4.f305296g
            android.accounts.Account r6 = r6.mo79668a()
            if (r6 == 0) goto L_0x0123
            java.lang.String r7 = r6.name
            if (r7 == 0) goto L_0x0123
            java.lang.String r7 = r6.name
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0123
            java.lang.String r7 = "accountKey"
            java.lang.String r6 = r6.name
            r5.putExtra(r7, r6)
        L_0x0123:
            com.google.android.apps.gsa.shared.util.t.c r6 = r4.f305295f
            r6.mo65089a(r5)
            goto L_0x0299
        L_0x012a:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            r4.f305298i = r5
            return r6
        L_0x0131:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            r4.f305298i = r5
            return r6
        L_0x0138:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            r4.f305297h = r5
            android.content.Context r5 = r4.f305291b
            com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65147c(r5)
            android.content.Context r5 = r4.f305291b
            android.content.Intent r5 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65146b(r5)
            if (r5 != 0) goto L_0x016b
            com.google.common.f.e r5 = f305290a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "Morris.SettingsCtrl"
            r5.mo56378ag(r7, r8)
            java.lang.String r7 = "Gsa Notification Util provided null intent."
            r8 = 24847(0x610f, float:3.4818E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            r5.<init>(r7)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r7)
        L_0x016b:
            android.content.Context r7 = r4.f305291b
            com.google.apps.tiktok.tracing.C47810es.m84979s(r7, r5)
        L_0x0170:
            r2 = 1
            goto L_0x0299
        L_0x0173:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            r4.f305297h = r5
            return r6
        L_0x017a:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            r4.f305297h = r5
            com.google.assistant.e.l.a.as r5 = r4.mo97919f(r8)
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.l.a.ar r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52685ar) r5
            com.google.assistant.e.l.a.aw r7 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.OPTED_OUT
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.assistant.e.l.a.as r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r1
            int r7 = r7.f138318g
            r1.f138307o = r7
            int r7 = r1.f138293a
            r3 = 2097152(0x200000, float:2.938736E-39)
            r7 = r7 | r3
            r1.f138293a = r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.l.a.as r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31518p(r5)
            r8.mo21716c(r5)
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r5 = r4.f305294e
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97997eQ
            com.google.android.libraries.search.b.i.a r7 = r7.mo40813g()
            r5.mo21431e(r7)
            com.google.android.libraries.assistant.auto.tng.morris.f.d r5 = r4.f305292c
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r8 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r8
            com.google.android.libraries.assistant.auto.tng.morris.e.kz r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz.f43772d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.kx r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14483kx) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.kz r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz) r3
            r3.f43774a = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.kz r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz) r1
            r1.getClass()
            r0.f43799b = r1
            r0.f43798a = r6
            com.google.protobuf.bv r6 = r8.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r6
            r5.mo21591A(r7, r6)
            return r2
        L_0x01f3:
            com.google.android.libraries.assistant.auto.tng.morris.e.lj r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj.DISABLE_MORRIS_TASK
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            r4.f305297h = r5
            return r6
        L_0x01fc:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r6 = r4.f305291b
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.AssistantSettingsIntentLauncherActivity> r7 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.AssistantSettingsIntentLauncherActivity.class
            r5.<init>(r6, r7)
            java.lang.String r6 = "driving"
            r5.putExtra(r3, r6)
            com.google.android.apps.gsa.shared.util.t.c r6 = r4.f305295f
            r6.mo65089a(r5)
        L_0x020f:
            return r2
        L_0x0210:
            boolean r7 = r5.f43764c
            if (r7 != 0) goto L_0x022c
            android.content.Context r7 = r4.f305291b
            boolean r7 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30481b(r7)
            if (r7 == 0) goto L_0x021d
            goto L_0x022c
        L_0x021d:
            com.google.android.libraries.assistant.auto.tng.morris.e.lj r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj.NOTIFICATION_PERMISSIONS_TASK
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            r4.f305297h = r5
            com.google.android.libraries.assistant.auto.tng.morris.b.x r5 = r4.f305293d
            r5.mo21398b(r6)
            goto L_0x0170
        L_0x022c:
            com.google.assistant.e.l.a.as r6 = r4.mo97919f(r8)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.l.a.ar r6 = (com.google.assistant.p3897e.p3929l.p3930a.C52685ar) r6
            boolean r5 = r5.f43764c
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.l.a.as r7 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r7
            int r0 = r7.f138293a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r7.f138293a = r0
            r7.f138299g = r5
            com.google.protobuf.bv r5 = r6.build()
            com.google.assistant.e.l.a.as r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31518p(r5)
            r8.mo21716c(r5)
            goto L_0x0299
        L_0x0255:
            boolean r7 = r5.f43764c
            if (r7 == 0) goto L_0x0271
            android.content.Context r7 = r4.f305291b
            boolean r7 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30482c(r7)
            if (r7 == 0) goto L_0x0262
            goto L_0x0271
        L_0x0262:
            com.google.android.libraries.assistant.auto.tng.morris.e.lj r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj.NOTIFICATION_PERMISSIONS_TASK
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            r4.f305297h = r5
            com.google.android.libraries.assistant.auto.tng.morris.b.x r5 = r4.f305293d
            r5.mo21401e(r6)
            goto L_0x0170
        L_0x0271:
            com.google.assistant.e.l.a.as r6 = r4.mo97919f(r8)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.l.a.ar r6 = (com.google.assistant.p3897e.p3929l.p3930a.C52685ar) r6
            boolean r5 = r5.f43764c
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.l.a.as r7 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r7
            int r0 = r7.f138293a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r7.f138293a = r0
            r7.f138300h = r5
            com.google.protobuf.bv r5 = r6.build()
            com.google.assistant.e.l.a.as r5 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31518p(r5)
            r8.mo21716c(r5)
        L_0x0299:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.C109625a.mo21623h(com.google.android.libraries.assistant.auto.tng.morris.e.lf, com.google.android.libraries.assistant.auto.tng.morris.e.f, com.google.android.libraries.assistant.auto.tng.morris.framework.e, com.google.android.libraries.assistant.auto.tng.morris.framework.d):boolean");
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        if (!this.f305297h.isPresent()) {
            return;
        }
        if (aVar.mo21707a()) {
            this.f305297h = Optional.empty();
        } else {
            dbVar.mo21542b((C14496lj) this.f305297h.get());
        }
    }

    /* renamed from: j */
    public final void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
        if (this.f305297h.isPresent() && ((C14496lj) this.f305297h.get()).equals(ljVar)) {
            this.f305297h = Optional.empty();
        }
    }
}
