package com.google.android.apps.gsa.staticplugins.opa.morris2.p8379a;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65848q;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.a.b */
/* compiled from: PG */
public final class C109479b extends C19602d {

    /* renamed from: a */
    public static final C59071e f304938a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.a.b");

    /* renamed from: b */
    private final C14647d f304939b;

    /* renamed from: c */
    private final Context f304940c;

    /* renamed from: d */
    private final C109658ac f304941d;

    /* renamed from: e */
    private final C69464a f304942e;

    /* renamed from: f */
    private final C86054o f304943f;

    /* renamed from: g */
    private final u f304944g;

    /* renamed from: h */
    private final C21370a f304945h;

    /* renamed from: i */
    private final Executor f304946i;

    /* renamed from: j */
    private final C60950i f304947j;

    public C109479b(C14647d dVar, Context context, C109658ac acVar, C69464a aVar, C86054o oVar, u uVar, C21370a aVar2, Executor executor, C60950i iVar) {
        this.f304939b = dVar;
        this.f304940c = context;
        this.f304941d = acVar;
        this.f304942e = aVar;
        this.f304943f = oVar;
        this.f304944g = uVar;
        this.f304945h = aVar2;
        this.f304946i = executor;
        this.f304947j = iVar;
    }

    /* renamed from: g */
    private static int m182186g(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        return "text/plain";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo24915b(android.net.Uri r13, java.lang.String[] r14) {
        /*
            r12 = this;
            r0 = 19
            com.google.android.apps.gsa.p5846e.C74507e.m120471g(r0)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Arrays.toString(r14)
            java.lang.String r0 = "calling_package_name"
            java.lang.String r13 = r13.getQueryParameter(r0)
            r0 = 0
            if (r14 == 0) goto L_0x0285
            int r1 = r14.length
            if (r1 != 0) goto L_0x0018
            goto L_0x0285
        L_0x0018:
            r1 = 0
            r14 = r14[r1]
            int r2 = r14.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1799270965: goto L_0x0063;
                case -1345614780: goto L_0x0059;
                case 67836897: goto L_0x004f;
                case 124566961: goto L_0x0045;
                case 561495351: goto L_0x003b;
                case 581662270: goto L_0x0031;
                case 1916415081: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x006d
        L_0x0027:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_bluetooth_connected_setting"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 6
            goto L_0x006e
        L_0x0031:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_dialog_content_vanagon"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 3
            goto L_0x006e
        L_0x003b:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_eligible"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 0
            goto L_0x006e
        L_0x0045:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_shown"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 2
            goto L_0x006e
        L_0x004f:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_enabled"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 4
            goto L_0x006e
        L_0x0059:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_eligibility_status"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 5
            goto L_0x006e
        L_0x0063:
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_set_car_mode"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = -1
        L_0x006e:
            java.lang.String r2 = "%s = %s"
            java.lang.String r7 = "Morris.StatusProvider"
            switch(r14) {
                case 0: goto L_0x0265;
                case 1: goto L_0x0244;
                case 2: goto L_0x0223;
                case 3: goto L_0x01df;
                case 4: goto L_0x01b8;
                case 5: goto L_0x00ee;
                case 6: goto L_0x0077;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x0285
        L_0x0077:
            java.lang.String[] r13 = new java.lang.String[r6]
            java.lang.String r14 = "column_name_morris_bluetooth_connected_setting"
            r13[r1] = r14
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r13)
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ac r13 = r12.f304941d
            com.google.protos.p.b.r r1 = r13.mo97944d()
            if (r1 == 0) goto L_0x00c5
            int r4 = r1.f179004a
            r5 = 10
            if (r4 != r5) goto L_0x00c5
            java.lang.Object r1 = r1.f179005b
            com.google.assistant.e.l.a.as r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r1
            int r4 = r1.f138293a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00c5
            int r1 = r1.f138295c
            com.google.assistant.e.l.a.bn r1 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.m86698a(r1)
            if (r1 != 0) goto L_0x00a3
            com.google.assistant.e.l.a.bn r1 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_DEFAULT
        L_0x00a3:
            com.google.assistant.e.l.a.bn r3 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_DEFAULT
            if (r1 == r3) goto L_0x00a8
            goto L_0x00c7
        L_0x00a8:
            com.google.android.apps.gsa.search.core.i.t r13 = r13.f305406c
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248923t
            long r3 = r13.mo79743a(r1)
            r5 = 4
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x00b9
            com.google.assistant.e.l.a.bn r1 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_USER_ENABLED_ASK
            goto L_0x00c7
        L_0x00b9:
            r5 = 5
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x00c2
            com.google.assistant.e.l.a.bn r1 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_USER_ENABLED_AUTO
            goto L_0x00c7
        L_0x00c2:
            com.google.assistant.e.l.a.bn r1 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_USER_DISABLED
            goto L_0x00c7
        L_0x00c5:
            com.google.assistant.e.l.a.bn r1 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_USER_DISABLED
        L_0x00c7:
            com.google.common.f.e r13 = f304938a
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r3, r7)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r3 = 24788(0x60d4, float:3.4735E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r3)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r13.mo56354G(r2, r14, r1)
            int r13 = r1.f138363g
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            r0.addRow(r13)
            goto L_0x0285
        L_0x00ee:
            java.lang.String[] r13 = new java.lang.String[r6]
            java.lang.String r14 = "column_name_morris_eligibility_status"
            r13[r1] = r14
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r13)
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ac r13 = r12.f304941d
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r1 = r13.mo97941a()
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac.f305404a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r9 = "Morris.TriggerCond"
            r3.mo56378ag(r8, r9)
            java.lang.String r8 = "MorrisEligibility = %s"
            r10 = 25102(0x620e, float:3.5175E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56389s(r8, r1)
            com.google.android.apps.gsa.search.core.i.t r3 = r13.f305406c
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248808aP
            long r10 = r3.mo79743a(r8)
            int r3 = (int) r10
            com.google.android.apps.gsa.search.core.i.t r8 = r13.f305406c
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248899ca
            boolean r8 = r8.mo79746e(r10)
            if (r8 == 0) goto L_0x0142
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r8 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_OPT_IN_NEEDED
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0142
            com.google.android.apps.gsa.search.core.i.t r13 = r13.f305406c
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248807aO
            long r3 = r13.mo79743a(r1)
            r5 = 2
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x013f
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG_OPT_IN_2
            goto L_0x0191
        L_0x013f:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG
            goto L_0x0191
        L_0x0142:
            if (r3 <= 0) goto L_0x0184
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r13 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.UNKNOWN
            com.google.assistant.e.l.a.aw r13 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.UNKNOWN_ENABLE_STATUS
            int r13 = r1.ordinal()
            switch(r13) {
                case 12: goto L_0x0172;
                case 13: goto L_0x0172;
                case 14: goto L_0x0172;
                case 15: goto L_0x014f;
                case 16: goto L_0x0150;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x0184
        L_0x0150:
            if (r3 == r6) goto L_0x016f
            if (r3 == r5) goto L_0x016c
            if (r3 == r4) goto L_0x0157
            goto L_0x0169
        L_0x0157:
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac.f305404a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r1, r9)
            java.lang.String r1 = "Opt-out arm 3 does not have a second dialog."
            r3 = 25103(0x620f, float:3.5177E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r3)).mo56386p(r1)
        L_0x0169:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE
            goto L_0x0191
        L_0x016c:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG_OPT_OUT_2B
            goto L_0x0191
        L_0x016f:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG_OPT_OUT_1B
            goto L_0x0191
        L_0x0172:
            if (r3 == r6) goto L_0x0181
            if (r3 == r5) goto L_0x017e
            if (r3 == r4) goto L_0x017b
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE
            goto L_0x0191
        L_0x017b:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG_OPT_OUT_3
            goto L_0x0191
        L_0x017e:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG_OPT_OUT_2A
            goto L_0x0191
        L_0x0181:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE_SHOW_DIALOG_OPT_OUT_1A
            goto L_0x0191
        L_0x0184:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r13 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L_0x018f
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.ELIGIBLE
            goto L_0x0191
        L_0x018f:
            com.google.android.libraries.assistant.d.b.e r13 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.NOT_ELIGIBLE
        L_0x0191:
            com.google.common.f.e r1 = f304938a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r7)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r3 = 24787(0x60d3, float:3.4734E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r1.mo56354G(r2, r14, r13)
            int r13 = r13.f51132k
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            r0.addRow(r13)
            goto L_0x0285
        L_0x01b8:
            g.a.a r13 = r12.f304942e
            java.lang.Object r13 = r13.mo17428b()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.String[] r14 = new java.lang.String[r6]
            java.lang.String r0 = "column_name_morris_enabled"
            r14[r1] = r0
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r14)
            int r13 = m182186g(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            r0.addRow(r13)
            return r0
        L_0x01df:
            java.lang.String[] r14 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40418a
            java.util.List r14 = java.util.Arrays.asList(r14)
            boolean r13 = r14.contains(r13)
            if (r13 != 0) goto L_0x01ed
            goto L_0x0285
        L_0x01ed:
            java.lang.String[] r13 = new java.lang.String[r4]
            java.lang.String r14 = "column_name_dialog_title"
            r13[r1] = r14
            java.lang.String r14 = "column_name_dialog_msg"
            r13[r6] = r14
            java.lang.String r14 = "column_name_dialog_ack_button"
            r13[r5] = r14
            android.database.MatrixCursor r14 = new android.database.MatrixCursor
            r14.<init>(r13)
            android.content.Context r13 = r12.f304940c
            android.content.res.Resources r13 = r13.getResources()
            r0 = 2132086309(0x7f150e25, float:1.9812841E38)
            java.lang.String r0 = r13.getString(r0)
            r1 = 2132086290(0x7f150e12, float:1.9812803E38)
            java.lang.String r1 = r13.getString(r1)
            r2 = 2132086242(0x7f150de2, float:1.9812706E38)
            java.lang.String r13 = r13.getString(r2)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89848p(r0, r1, r13)
            r14.addRow(r13)
            return r14
        L_0x0223:
            com.google.android.libraries.assistant.auto.tng.morris.f.d r13 = r12.f304939b
            boolean r13 = r13.mo21602k()
            java.lang.String[] r14 = new java.lang.String[r6]
            java.lang.String r0 = "column_name_morris_shown"
            r14[r1] = r0
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r14)
            int r13 = m182186g(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            r0.addRow(r13)
            return r0
        L_0x0244:
            com.google.android.libraries.assistant.auto.tng.morris.f.d r13 = r12.f304939b
            boolean r13 = r13.mo21602k()
            java.lang.String[] r14 = new java.lang.String[r6]
            java.lang.String r0 = "column_name_morris_set_car_mode"
            r14[r1] = r0
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r14)
            int r13 = m182186g(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            r0.addRow(r13)
            return r0
        L_0x0265:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ac r13 = r12.f304941d
            boolean r13 = r13.mo97945e()
            java.lang.String[] r14 = new java.lang.String[r6]
            java.lang.String r0 = "column_name_morris_eligibility"
            r14[r1] = r0
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            r0.<init>(r14)
            int r13 = m182186g(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            r0.addRow(r13)
        L_0x0285:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.p8379a.C109479b.mo24915b(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }

    /* renamed from: c */
    public final Uri mo24916c(Uri uri, ContentValues contentValues) {
        C52690aw awVar;
        C74507e.m120469e(19);
        C58976aa aaVar = C58975e.f156826a;
        if (contentValues.containsKey("com.google.android.apps.gsa.staticplugins.opa.morris.shared.key_morris_content_values_insert_set_morris_opt_in_status")) {
            Integer asInteger = contentValues.getAsInteger("com.google.android.apps.gsa.staticplugins.opa.morris.shared.key_morris_content_values_insert_set_morris_opt_in_status");
            if (asInteger == null) {
                C59104x d = f304938a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.StatusProvider");
                ((C59052c) ((C59052c) d).mo56372aa(24793)).mo56386p("Tried to update morris enable status with a null value");
                return Uri.EMPTY;
            }
            String F = this.f304943f.mo79659F();
            if (F == null) {
                C59104x c = f304938a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.StatusProvider");
                ((C59052c) ((C59052c) c).mo56372aa(24792)).mo56386p("Failed to write to Geller. Account name can't be null.");
                return Uri.EMPTY;
            }
            C52690aw awVar2 = C52690aw.UNKNOWN_ENABLE_STATUS;
            int intValue = asInteger.intValue();
            if (intValue != 1) {
                awVar = intValue != 2 ? intValue != 3 ? C52690aw.UNKNOWN_ENABLE_STATUS : C52690aw.DISMISSED_OPT_OUT_DIALOG : C52690aw.OPTED_OUT_FROM_PREVIEW;
            } else {
                awVar = C52690aw.ENABLED;
            }
            C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
            ayVar.copyOnWrite();
            C65768az azVar = (C65768az) ayVar.instance;
            azVar.f178795a |= 4;
            azVar.f178798d = "driving_settings";
            C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
            long micros = TimeUnit.MILLISECONDS.toMicros(this.f304945h.mo26870b());
            cVar.copyOnWrite();
            C65139d dVar = (C65139d) cVar.instance;
            dVar.f176309a |= 1;
            dVar.f176310b = micros;
            ayVar.copyOnWrite();
            C65768az azVar2 = (C65768az) ayVar.instance;
            C65139d dVar2 = (C65139d) cVar.build();
            dVar2.getClass();
            azVar2.f178796b = dVar2;
            azVar2.f178795a |= 1;
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantSettingsElement";
            C65848q qVar = (C65848q) C65849r.f179002c.createBuilder();
            C52685ar arVar = (C52685ar) C52686as.f138291q.createBuilder();
            arVar.copyOnWrite();
            C52686as asVar = (C52686as) arVar.instance;
            asVar.f138307o = awVar.f138318g;
            asVar.f138293a |= C89885b.NOW_VALUE;
            C63042fg b = C62950b.m95471b(this.f304947j);
            arVar.copyOnWrite();
            C52686as asVar2 = (C52686as) arVar.instance;
            b.getClass();
            asVar2.f138308p = b;
            asVar2.f138293a |= 4194304;
            qVar.copyOnWrite();
            C65849r rVar = (C65849r) qVar.instance;
            C52686as asVar3 = (C52686as) arVar.build();
            asVar3.getClass();
            rVar.f179005b = asVar3;
            rVar.f179004a = 10;
            C63088z byteString = ((C65849r) qVar.build()).toByteString();
            gVar.copyOnWrite();
            byteString.getClass();
            ((C63070h) gVar.instance).f170218b = byteString;
            ayVar.copyOnWrite();
            C65768az azVar3 = (C65768az) ayVar.instance;
            C63070h hVar = (C63070h) gVar.build();
            hVar.getClass();
            azVar3.f178799e = hVar;
            azVar3.f178795a |= 8;
            C60856cj.m92911t(this.f304944g.d(F, C65753ak.ASSISTANT_SETTINGS, (C65768az) ayVar.build(), true), C47810es.m84974n(new C109478a()), this.f304946i);
        }
        return uri;
    }
}
