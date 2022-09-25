package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124032d;
import com.google.android.libraries.assistant.auto.tng.common.p916g.p917a.C13264a;
import com.google.android.libraries.assistant.auto.tng.common.p919i.C13271a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16128c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15783j;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.C15949a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.p */
/* compiled from: PG */
public final class C15965p implements C15949a {

    /* renamed from: a */
    public static final C16077ac f47344a;

    /* renamed from: f */
    private static final C59071e f47345f = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.d.a.p");

    /* renamed from: b */
    public final C124032d f47346b;

    /* renamed from: c */
    public final C21370a f47347c;

    /* renamed from: d */
    public final C15973f f47348d;

    /* renamed from: e */
    public final TelephonyManager f47349e;

    /* renamed from: g */
    private final C69464a f47350g;

    /* renamed from: h */
    private final C58833ax f47351h;

    /* renamed from: i */
    private final Context f47352i;

    /* renamed from: j */
    private final C69464a f47353j;

    /* renamed from: k */
    private final C69464a f47354k;

    static {
        C16128c cVar = new C16128c();
        cVar.f47607a = BuildConfig.FLAVOR;
        cVar.mo22690c(0);
        cVar.mo22696i(0);
        cVar.mo22693f(0);
        cVar.mo22695h(0);
        cVar.mo22692e(0);
        cVar.mo22691d(0);
        cVar.mo22694g(0);
        f47344a = cVar.mo22688a();
    }

    public C15965p(C124032d dVar, C69464a aVar, C58833ax axVar, C21370a aVar2, Context context, C69464a aVar3, C69464a aVar4, C15973f fVar) {
        this.f47346b = dVar;
        this.f47350g = aVar;
        this.f47351h = axVar;
        this.f47347c = aVar2;
        this.f47352i = context;
        this.f47353j = aVar3;
        this.f47354k = aVar4;
        this.f47348d = fVar;
        this.f47349e = (TelephonyManager) C39239a.m68666a(context, C39226b.TAG_ASSISTANT_AUTO_TNG_SUGGESTIONS).getSystemService("phone");
    }

    /* renamed from: d */
    public static boolean m32764d(int i) {
        return i == 2 || i == 7 || i == 8;
    }

    /* renamed from: e */
    private static C58833ax m32765e(C15777d dVar) {
        C58833ax h = dVar.mo22551h();
        if (!h.mo56113h()) {
            C59104x b = f47345f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SuggestionFilter");
            ((C59052c) ((C59052c) b).mo56372aa(46575)).mo56386p("Skipping media apps installed predicate");
            return C58836b.f156633a;
        }
        C59104x b2 = f47345f.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SuggestionFilter");
        ((C59052c) ((C59052c) b2).mo56372aa(46574)).mo56386p("Applying media apps installed predicate");
        return C58833ax.m90834k(new C15959j(h));
    }

    /* renamed from: f */
    private final boolean m32766f() {
        if (!((Boolean) this.f47353j.mo17428b()).booleanValue()) {
            return true;
        }
        if (!this.f47351h.mo56113h() || ((C13264a) this.f47351h.mo56107c()).f40956b.mo117124a() == 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0331 A[LOOP:0: B:62:0x032f->B:63:0x0331, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo22623a(com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d r8, java.util.List r9, com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h r10) {
        /*
            r7 = this;
            boolean r0 = r7.m32766f()
            java.lang.String r1 = "SuggestionFilter"
            if (r0 != 0) goto L_0x0020
            com.google.common.f.e r8 = f47345f
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r1)
            java.lang.String r9 = "Skipping suggestion filter when DataSubscriptionStatus is INACTIVE."
            r10 = 46584(0xb5f8, float:6.5278E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
            return r8
        L_0x0020:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r2 = r7.f47352i
            com.google.common.f.e r3 = f47345f
            com.google.common.f.x r4 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r1)
            java.lang.String r5 = "Applying default assistant predicate"
            r6 = 46567(0xb5e7, float:6.5254E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.o r4 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.o
            r4.<init>(r2, r8)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r4)
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r0.addAll(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.g r2 = r10.mo22605a()
            com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.g r4 = com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g.PERIODIC_SUGGESTION_GENERATION
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0080
            com.google.common.base.ax r2 = r8.mo22554j()
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x0065
            goto L_0x0080
        L_0x0065:
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Applying periodic suggestion predicate"
            r5 = 46583(0xb5f7, float:6.5277E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.m r2 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.m
            r2.<init>(r8)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0093
        L_0x0080:
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Skipping periodic suggestion predicate"
            r5 = 46582(0xb5f6, float:6.5275E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0093:
            java.util.Set r2 = r2.mo56112g()
            r0.addAll(r2)
            com.google.common.base.ax r2 = r8.mo22554j()
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x00d9
            com.google.common.base.ax r2 = r8.mo22554j()
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bk r2 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16364bk) r2
            int r2 = r2.f48171b
            com.google.android.libraries.assistant.auto.tng.suggestions.k.y r2 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y.m33345a(r2)
            if (r2 != 0) goto L_0x00b8
            com.google.android.libraries.assistant.auto.tng.suggestions.k.y r2 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y.DRIVE_STATUS_UNKNOWN
        L_0x00b8:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.y r4 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y.VEHICLE_INIT
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00c1
            goto L_0x00d9
        L_0x00c1:
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Applying vehicle init predicate"
            r5 = 46581(0xb5f5, float:6.5274E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.f r2 = com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a.C15955f.f47330a
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x00ec
        L_0x00d9:
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Skipping vehicle init predicate"
            r5 = 46580(0xb5f4, float:6.5272E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x00ec:
            java.util.Set r2 = r2.mo56112g()
            r0.addAll(r2)
            j$.util.function.Predicate r2 = r7.mo22625c(r8)
            r0.add(r2)
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Applying user signed-in predicate"
            r5 = 46591(0xb5ff, float:6.5288E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.i r2 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.i
            r2.<init>(r8)
            r0.add(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r2 = r8.mo22544b()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r2 = r2.mo22733g()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r4 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap.COOLWALK
            if (r2 != r4) goto L_0x013f
            android.telephony.TelephonyManager r2 = r7.f47349e
            if (r2 != 0) goto L_0x0124
            goto L_0x013f
        L_0x0124:
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Applying Call state predicate"
            r5 = 46565(0xb5e5, float:6.5251E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.l r2 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.l
            r2.<init>(r7)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0141
        L_0x013f:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0141:
            java.util.Set r2 = r2.mo56112g()
            r0.addAll(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bg r2 = r8.mo22547e()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bf r2 = r2.f48165e
            if (r2 != 0) goto L_0x0152
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bf r2 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf.f48152f
        L_0x0152:
            boolean r2 = r2.f48155b
            if (r2 == 0) goto L_0x016a
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Skipping personalized results predicate"
            r5 = 46577(0xb5f1, float:6.5268E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x0181
        L_0x016a:
            com.google.common.f.x r2 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r1)
            java.lang.String r4 = "Applying personalized results predicate"
            r5 = 46576(0xb5f0, float:6.5267E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.a r2 = com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a.C15950a.f47324a
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
        L_0x0181:
            java.util.Set r2 = r2.mo56112g()
            r0.addAll(r2)
            g.a.a r2 = r7.f47354k
            java.lang.Object r2 = r2.mo17428b()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01aa
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Skipping throttling trigger predicate"
            r4 = 46579(0xb5f3, float:6.5271E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            goto L_0x01cc
        L_0x01aa:
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r2 = r8.mo22544b()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r2 = r2.mo22733g()
            com.google.common.f.x r4 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r1)
            java.lang.String r5 = "Applying throttling trigger predicate"
            r6 = 46578(0xb5f2, float:6.527E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.g r4 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.g
            r4.<init>(r7, r8, r2, r10)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r4)
        L_0x01cc:
            java.util.Set r10 = r10.mo56112g()
            r0.addAll(r10)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r10 = r8.mo22544b()
            int r10 = r10.mo22730d()
            if (r10 > 0) goto L_0x01f1
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Skipping max display text length predicate"
            r4 = 46573(0xb5ed, float:6.5263E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            goto L_0x020b
        L_0x01f1:
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Applying max display text length predicate"
            r4 = 46572(0xb5ec, float:6.5261E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.c r10 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.c
            r10.<init>(r8)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x020b:
            java.util.Set r10 = r10.mo56112g()
            r0.addAll(r10)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r10 = r8.mo22544b()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r10 = r10.mo22733g()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r2 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap.SIDE_CARD
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0236
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Skipping greetings suggestion predicate"
            r4 = 46571(0xb5eb, float:6.526E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            goto L_0x024d
        L_0x0236:
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Applying greetings suggestion predicate"
            r4 = 46570(0xb5ea, float:6.5258E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.h r10 = com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a.C15957h.f47335a
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x024d:
            java.util.Set r10 = r10.mo56112g()
            r0.addAll(r10)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r10 = r8.mo22544b()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r10 = r10.mo22733g()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r2 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap.HOME_SCREEN
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0278
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Skipping default suggestion predicate"
            r4 = 46569(0xb5e9, float:6.5257E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            goto L_0x028f
        L_0x0278:
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Applying default suggestion for non-homescreen predicate"
            r4 = 46568(0xb5e8, float:6.5256E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.n r10 = com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a.C15963n.f47341a
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x028f:
            java.util.Set r10 = r10.mo56112g()
            r0.addAll(r10)
            com.google.common.base.ax r10 = r8.mo22551h()
            boolean r2 = r10.mo56113h()
            if (r2 == 0) goto L_0x02cd
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.u r10 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16385u) r10
            int r10 = r10.f48228b
            com.google.assistant.e.i.a.if r10 = com.google.assistant.p3897e.p3917i.p3918a.C51452if.m86190a(r10)
            if (r10 != 0) goto L_0x02b0
            com.google.assistant.e.i.a.if r10 = com.google.assistant.p3897e.p3917i.p3918a.C51452if.UNKNOWN_STATE
        L_0x02b0:
            com.google.assistant.e.i.a.if r2 = com.google.assistant.p3897e.p3917i.p3918a.C51452if.PLAYING
            if (r10 == r2) goto L_0x02b5
            goto L_0x02cd
        L_0x02b5:
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Applying active media predicate"
            r4 = 46564(0xb5e4, float:6.525E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.d r10 = com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a.C15953d.f47327a
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x02e0
        L_0x02cd:
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r2 = "Skipping active media predicate"
            r4 = 46563(0xb5e3, float:6.5249E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
        L_0x02e0:
            java.util.Set r10 = r10.mo56112g()
            r0.addAll(r10)
            com.google.common.base.ax r10 = m32765e(r8)
            java.util.Set r10 = r10.mo56112g()
            r0.addAll(r10)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r10 = r8.mo22544b()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r10 = r10.mo22733g()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r2 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap.COOLWALK
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L_0x0305
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            goto L_0x031f
        L_0x0305:
            com.google.common.f.x r10 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r2, r1)
            java.lang.String r1 = "Applying Drive session predicate"
            r2 = 46566(0xb5e6, float:6.5253E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r2)).mo56386p(r1)
            com.google.android.libraries.assistant.auto.tng.suggestions.d.a.k r10 = new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.k
            r10.<init>(r8)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x031f:
            java.util.Set r8 = r8.mo56112g()
            r0.addAll(r8)
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r9)
            int r9 = r0.size()
            r10 = 0
        L_0x032f:
            if (r10 >= r9) goto L_0x033e
            java.lang.Object r1 = r0.get(r10)
            j$.util.function.Predicate r1 = (p3186j$.util.function.Predicate) r1
            j$.util.stream.Stream r8 = r8.filter(r1)
            int r10 = r10 + 1
            goto L_0x032f
        L_0x033e:
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r8 = r8.collect(r9)
            com.google.common.b.gu r8 = (com.google.common.p4522b.C58485gu) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a.C15965p.mo22623a(com.google.android.libraries.assistant.auto.tng.suggestions.a.b.d, java.util.List, com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.h):com.google.common.b.gu");
    }

    /* renamed from: b */
    public final C58485gu mo22624b(C15777d dVar, List list) {
        C58976aa aaVar = C58975e.f156826a;
        if (list.isEmpty()) {
            C59104x b = f47345f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SuggestionFilter");
            ((C59052c) ((C59052c) b).mo56372aa(46589)).mo56386p("Skipping shortcut filter on the empty list.");
            return C58485gu.m89845m();
        } else if (!C13271a.m29529a(this.f47352i) && dVar.mo22544b().mo22733g().equals(C16090ap.SIDE_CARD)) {
            C59104x b2 = f47345f.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SuggestionFilter");
            ((C59052c) ((C59052c) b2).mo56372aa(46588)).mo56386p("Skipping shortcut filter on Google Assistant is not default.");
            return C58485gu.m89845m();
        } else if (m32766f()) {
            return (C58485gu) Collection.EL.stream(list).filter(mo22625c(dVar)).filter((Predicate) m32765e(dVar).mo56109e(C15951b.f47325a)).collect(C58370cn.f155946a);
        } else {
            C59104x b3 = f47345f.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SuggestionFilter");
            ((C59052c) ((C59052c) b3).mo56372aa(46587)).mo56386p("Skipping shortcut filter when DataSubscriptionStatus is INACTIVE.");
            return C58485gu.m89845m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Predicate mo22625c(C15777d dVar) {
        C15783j jVar = (C15783j) this.f47350g.mo17428b();
        jVar.f47018a = C58833ax.m90833j(dVar);
        C59104x b = f47345f.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SuggestionFilter");
        ((C59052c) ((C59052c) b).mo56372aa(46590)).mo56386p("Applying context trigger predicate");
        return new C15954e(this, jVar);
    }
}
