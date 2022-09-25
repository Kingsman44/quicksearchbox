package com.google.android.apps.gsa.staticplugins.opaonboarding.p8656c.p8658b;

import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.app.C0401v;
import android.view.KeyEvent;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83889aw;
import com.google.android.apps.gsa.opaonboarding.C83890ax;
import com.google.android.apps.gsa.opaonboarding.C83895ba;
import com.google.android.apps.gsa.opaonboarding.C83900bf;
import com.google.android.apps.gsa.opaonboarding.C83901bg;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83955s;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opaonboarding.C115843a;
import com.google.android.apps.gsa.staticplugins.opaonboarding.C115852b;
import com.google.android.apps.gsa.staticplugins.opaonboarding.C115859c;
import com.google.android.apps.gsa.staticplugins.opaonboarding.C115862d;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.c.b.a */
/* compiled from: PG */
public abstract class C115861a extends C19600b implements C83900bf, C83890ax {

    /* renamed from: d */
    private static final C59071e f321286d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.c.b.a");

    /* renamed from: a */
    public C83955s f321287a;

    /* renamed from: b */
    public C115862d f321288b;

    /* renamed from: c */
    public C104149a f321289c;

    /* renamed from: e */
    private C83880an f321290e;

    /* renamed from: f */
    private C83901bg f321291f;

    /* renamed from: g */
    private C91090a f321292g;

    /* renamed from: h */
    private C91075b f321293h;

    /* renamed from: p */
    private final boolean m192043p() {
        return "SetupWizard_Phone".equals(this.f321290e.mo77237k());
    }

    /* renamed from: t */
    private final boolean m192044t() {
        if (!this.f321289c.mo93971b()) {
            return false;
        }
        if ("error_checker_seq".equals(this.f321290e.mo77237k()) || this.f321290e.mo77227a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C83889aw mo77276a() {
        return this.f321287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d A[SYNTHETIC, Splitter:B:33:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x035d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24895b(android.os.Bundle r23) {
        /*
            r22 = this;
            r13 = r22
            r1 = r23
            com.google.android.apps.gsa.e.f r0 = com.google.android.apps.gsa.e.f.bd
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r0)
            com.google.android.libraries.ay.a r0 = r13.f54539k
            android.content.Intent r0 = r0.mo24853b()
            r0.getClass()
            android.content.Intent r2 = com.google.android.libraries.p1646ay.C19601c.m37395b(r0)
            com.google.android.apps.gsa.opaonboarding.am r3 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()
            java.lang.String r0 = "seq_name"
            java.lang.String r4 = r2.getStringExtra(r0)
            java.lang.String r5 = "No sequence name provided in Intent under key %s"
            com.google.common.base.C58838bb.m90867b(r4, r5, r0)
            r5 = r3
            com.google.android.apps.gsa.opaonboarding.g r5 = (com.google.android.apps.gsa.opaonboarding.C83940g) r5
            r5.f228605a = r4
            java.lang.String r0 = "seq_args"
            android.os.Bundle r0 = r2.getBundleExtra(r0)
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            java.lang.Object r0 = com.google.common.base.C58831av.m90830c(r0, r4)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5.f228606b = r0
            java.lang.String r0 = "acc_config"
            android.os.Bundle r0 = r2.getBundleExtra(r0)
            r4 = 0
            r14 = 2
            r6 = 0
            r15 = 1
            if (r0 != 0) goto L_0x004c
            com.google.android.apps.gsa.opaonboarding.e r0 = new com.google.android.apps.gsa.opaonboarding.e
            r0.<init>(r4, r6, r6)
            goto L_0x009c
        L_0x004c:
            java.lang.String r7 = "account_config:use_gsa_account"
            int r7 = r0.getInt(r7)
            if (r7 == 0) goto L_0x0097
            java.lang.String r8 = "No account name under key %s"
            java.lang.String r9 = "account_config:fixed_account_name"
            if (r7 == r15) goto L_0x0089
            if (r7 != r14) goto L_0x0075
            java.lang.String r7 = r0.getString(r9)
            com.google.common.base.C58838bb.m90867b(r7, r8, r9)
            java.lang.String r8 = "account_config:impersonated_user_id"
            java.lang.String r0 = r0.getString(r8)
            java.lang.String r9 = "No impersonated user ID under key %s"
            com.google.common.base.C58838bb.m90867b(r0, r9, r8)
            com.google.android.apps.gsa.opaonboarding.e r8 = new com.google.android.apps.gsa.opaonboarding.e
            r8.<init>(r14, r7, r0)
            r0 = r8
            goto L_0x009c
        L_0x0075:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AccountMode:"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            java.lang.String r0 = r0.getString(r9)
            com.google.common.base.C58838bb.m90867b(r0, r8, r9)
            com.google.android.apps.gsa.opaonboarding.e r7 = new com.google.android.apps.gsa.opaonboarding.e
            r7.<init>(r15, r0, r6)
            r0 = r7
            goto L_0x009c
        L_0x0097:
            com.google.android.apps.gsa.opaonboarding.e r0 = new com.google.android.apps.gsa.opaonboarding.e
            r0.<init>(r4, r6, r6)
        L_0x009c:
            r5.f228607c = r0
            java.lang.String r0 = "unicorn_config"
            android.os.Bundle r0 = r2.getBundleExtra(r0)
            if (r0 != 0) goto L_0x00a8
            r0 = r6
            goto L_0x00cd
        L_0x00a8:
            java.lang.String r7 = "unicorn_config:unicorn_mode"
            int r17 = r0.getInt(r7)
            java.lang.String r7 = "unicorn_config:parent_user_id"
            java.lang.String r19 = r0.getString(r7)
            java.lang.String r7 = "unicorn_config:parent_account_name"
            java.lang.String r18 = r0.getString(r7)
            java.lang.String r7 = "unicorn_config:child_user_id"
            java.lang.String r21 = r0.getString(r7)
            java.lang.String r7 = "unicorn_config:child_account_name"
            java.lang.String r20 = r0.getString(r7)
            com.google.android.apps.gsa.opaonboarding.q r0 = new com.google.android.apps.gsa.opaonboarding.q
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x00cd:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r5.f228608d = r0
            java.lang.String r0 = "unicorn_enrollment_config"
            byte[] r0 = r2.getByteArrayExtra(r0)
            if (r0 != 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00ea }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r8 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s.f257652e     // Catch:{ ct -> 0x00ea }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r0, (com.google.protobuf.C62921ba) r7)     // Catch:{ ct -> 0x00ea }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s r0 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s) r0     // Catch:{ ct -> 0x00ea }
            r6 = r0
            goto L_0x00f8
        L_0x00ea:
            r0 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.opaonboarding.C83880an.f228526a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "#UnicornEnrollmentConfig: invalid data"
            r9 = 6889(0x1ae9, float:9.654E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r9)).mo56386p(r8)
        L_0x00f8:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r6)
            r5.f228609e = r0
            java.lang.String r0 = "confirm_cancel_dialog"
            byte[] r0 = r2.getByteArrayExtra(r0)
            if (r0 == 0) goto L_0x0121
            com.google.android.apps.gsa.opaonboarding.d.b r6 = com.google.android.apps.gsa.opaonboarding.p6462d.C83915b.f228541j     // Catch:{ Exception -> 0x0113 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0)     // Catch:{ Exception -> 0x0113 }
            com.google.android.apps.gsa.opaonboarding.d.b r0 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83915b) r0     // Catch:{ Exception -> 0x0113 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ Exception -> 0x0113 }
            goto L_0x0123
        L_0x0113:
            r0 = move-exception
            com.google.common.f.e r6 = com.google.android.apps.gsa.opaonboarding.C83880an.f228526a
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "#onCreate: invalid ConfirmCancelDialogContent"
            r8 = 6890(0x1aea, float:9.655E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r8)).mo56386p(r7)
        L_0x0121:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0123:
            r5.f228610f = r0
            java.lang.String r0 = "onboarding_data"
            byte[] r0 = r2.getByteArrayExtra(r0)
            if (r0 == 0) goto L_0x0148
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x013a }
            com.google.common.o.a.w r7 = com.google.common.p4552o.p4553a.C59567w.f158058g     // Catch:{ ct -> 0x013a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r0, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x013a }
            com.google.common.o.a.w r0 = (com.google.common.p4552o.p4553a.C59567w) r0     // Catch:{ ct -> 0x013a }
            goto L_0x014a
        L_0x013a:
            r0 = move-exception
            com.google.common.f.e r6 = com.google.android.apps.gsa.opaonboarding.C83880an.f228526a
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "invalid AssistantOnboarding proto bytes"
            r8 = 6891(0x1aeb, float:9.656E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r8)).mo56386p(r7)
        L_0x0148:
            com.google.common.o.a.w r0 = com.google.common.p4552o.p4553a.C59567w.f158058g
        L_0x014a:
            r3.mo77222b(r0)
            java.lang.String r0 = "hide_caption_bar"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r3.mo77223c(r0)
            java.lang.String r0 = "sequence_theme"
            int r0 = r2.getIntExtra(r0, r4)
            r3.mo77226f(r0)
            java.lang.String r0 = "material_next_mode"
            int r0 = r2.getIntExtra(r0, r4)
            r3.mo77224d(r0)
            java.lang.String r0 = "sequence_orientation_mode"
            int r0 = r2.getIntExtra(r0, r4)
            r3.mo77225e(r0)
            java.lang.String r0 = "package_name"
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 == 0) goto L_0x017b
            r5.f228611g = r0
        L_0x017b:
            com.google.android.apps.gsa.opaonboarding.an r0 = r3.mo77221a()
            r13.f321290e = r0
            boolean r0 = r22.m192043p()
            if (r0 == 0) goto L_0x019c
            com.google.android.libraries.ay.a r0 = r13.f54539k
            android.view.Window r0 = r0.getWindow()
            r2 = 13
            r0.requestFeature(r2)
            com.google.android.libraries.ay.a r0 = r13.f54539k
            com.google.android.setupdesign.p3556e.C45304a.m80750f(r0)
            com.google.android.libraries.ay.a r0 = r13.f54539k
            com.google.android.setupdesign.p3556e.C45304a.m80749e(r0)
        L_0x019c:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.e r0 = f321286d
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "BaseNamedSeqAct"
            r0.mo56378ag(r2, r3)
            com.google.android.apps.gsa.opaonboarding.an r2 = r13.f321290e
            java.lang.String r2 = r2.mo77237k()
            r3 = 30124(0x75ac, float:4.2213E-41)
            java.lang.String r4 = "onCreate: sequenceName = %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r4, r2)
            com.google.android.apps.gsa.shared.util.t.a r0 = new com.google.android.apps.gsa.shared.util.t.a
            com.google.android.libraries.ay.a r2 = r13.f54539k
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r2, r2, r3)
            r13.f321292g = r0
            com.google.android.apps.gsa.shared.util.permissions.b r0 = new com.google.android.apps.gsa.shared.util.permissions.b
            com.google.android.apps.gsa.shared.util.t.a r2 = r13.f321292g
            android.app.Activity r3 = r2.f254379a
            r0.<init>(r3, r2)
            r13.f321293h = r0
            com.google.android.apps.gsa.opaonboarding.an r2 = r13.f321290e
            com.google.android.apps.gsa.shared.util.t.a r3 = r13.f321292g
            r13.mo102289h(r2, r3, r0)
            com.google.android.apps.gsa.staticplugins.opaonboarding.d r0 = r13.f321288b
            java.lang.String r2 = "SequenceControllerFactory null after injection."
            com.google.common.base.C58838bb.m90866a(r0, r2)
            android.support.p033v7.app.C0401v.m1321C()
            com.google.android.libraries.ay.a r0 = r13.f54539k
            r0.mo24861h(r1)
            com.google.android.apps.gsa.shared.util.t.a r0 = r13.f321292g
            r0.mo85358i(r1)
            com.google.android.apps.gsa.opaonboarding.an r0 = r13.f321290e
            boolean r0 = r0.mo77238l()
            if (r0 == 0) goto L_0x01f6
            com.google.android.libraries.ay.a r0 = r13.f54539k
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148872d(r0)
        L_0x01f6:
            com.google.android.apps.gsa.opaonboarding.an r0 = r13.f321290e
            int r0 = r0.mo77229c()
            com.google.android.libraries.ay.a r1 = r13.f54539k
            boolean r2 = r22.m192043p()
            java.lang.String r3 = "Unknown sequenceTheme: "
            r4 = 7
            r12 = 5
            if (r2 == 0) goto L_0x023a
            com.google.android.libraries.ay.a r2 = r13.f54539k
            boolean r2 = com.google.android.setupdesign.p3558f.C45315i.m80766a(r2)
            if (r15 == r2) goto L_0x0214
            r2 = 2132150218(0x7f1607ca, float:1.9942464E38)
            goto L_0x0217
        L_0x0214:
            r2 = 2132150217(0x7f1607c9, float:1.9942462E38)
        L_0x0217:
            com.google.android.setupdesign.f.k r5 = com.google.android.setupdesign.p3558f.C45317k.m80773c()
            int r6 = r5.f118379a
            java.lang.String r6 = r5.f118380b
            boolean r5 = r5.f118381c
            com.google.android.setupdesign.f.k r2 = com.google.android.setupdesign.p3558f.C45316j.m80772a(r2)
            com.google.android.libraries.ay.a r5 = r13.f54539k
            android.content.Intent r5 = r5.mo24853b()
            r5.getClass()
            com.google.android.libraries.ay.a r6 = r13.f54539k
            boolean r6 = com.google.android.setupdesign.p3558f.C45315i.m80766a(r6)
            r6 = r6 ^ r15
            int r2 = r2.mo49238a(r5, r6)
            goto L_0x0273
        L_0x023a:
            if (r0 == 0) goto L_0x0266
            if (r0 == r15) goto L_0x0262
            if (r0 == r14) goto L_0x025e
            if (r0 == r12) goto L_0x025a
            if (r0 != r4) goto L_0x0248
            r2 = 2132149502(0x7f1604fe, float:1.9941012E38)
            goto L_0x0273
        L_0x0248:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x025a:
            r2 = 2132149507(0x7f160503, float:1.9941022E38)
            goto L_0x0273
        L_0x025e:
            r2 = 2132149506(0x7f160502, float:1.994102E38)
            goto L_0x0273
        L_0x0262:
            r2 = 2132149505(0x7f160501, float:1.9941018E38)
            goto L_0x0273
        L_0x0266:
            boolean r2 = r22.m192044t()
            if (r15 == r2) goto L_0x0270
            r2 = 2132149501(0x7f1604fd, float:1.994101E38)
            goto L_0x0273
        L_0x0270:
            r2 = 2132149504(0x7f160500, float:1.9941016E38)
        L_0x0273:
            r1.setTheme(r2)
            boolean r1 = r22.m192044t()
            if (r1 == 0) goto L_0x029e
            com.google.android.apps.gsa.opaonboarding.an r1 = r13.f321290e
            int r1 = r1.mo77229c()
            if (r1 == 0) goto L_0x028c
            com.google.android.apps.gsa.opaonboarding.an r1 = r13.f321290e
            int r1 = r1.mo77227a()
            if (r1 != r15) goto L_0x029e
        L_0x028c:
            boolean r1 = com.google.android.material.p3505b.C44534d.m78715b()
            if (r1 == 0) goto L_0x029e
            com.google.android.libraries.ay.a r1 = r13.f54539k
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 2132150627(0x7f160963, float:1.9943294E38)
            r1.applyStyle(r2, r15)
        L_0x029e:
            boolean r1 = r22.m192043p()
            r2 = 2131625063(0x7f0e0467, float:1.8877323E38)
            if (r1 == 0) goto L_0x02a8
            goto L_0x02c8
        L_0x02a8:
            if (r0 == 0) goto L_0x02c8
            if (r0 == r15) goto L_0x02c5
            if (r0 == r14) goto L_0x02c5
            if (r0 == r12) goto L_0x02c5
            if (r0 != r4) goto L_0x02b3
            goto L_0x02c8
        L_0x02b3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x02c5:
            r2 = 2131625064(0x7f0e0468, float:1.8877325E38)
        L_0x02c8:
            com.google.android.libraries.ay.a r0 = r13.f54539k
            r0.setContentView(r2)
            com.google.android.apps.gsa.staticplugins.opaonboarding.d r0 = r13.f321288b
            com.google.android.apps.gsa.opaonboarding.an r1 = r13.f321290e
            com.google.common.o.a.w r2 = r1.mo77235i()
            com.google.android.libraries.ay.a r3 = r13.f54539k
            com.google.android.apps.gsa.opaonboarding.an r1 = r13.f321290e
            r1.mo77229c()
            com.google.android.apps.gsa.staticplugins.opaonboarding.c r11 = new com.google.android.apps.gsa.staticplugins.opaonboarding.c
            r2.getClass()
            r3.getClass()
            g.a.a r1 = r0.f321294a
            java.lang.Object r1 = r1.mo17428b()
            r6 = r1
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6
            r6.getClass()
            g.a.a r1 = r0.f321295b
            java.lang.Object r1 = r1.mo17428b()
            r7 = r1
            com.google.android.apps.gsa.shared.util.b r7 = (com.google.android.apps.gsa.shared.util.C90743b) r7
            r7.getClass()
            g.a.a r1 = r0.f321296c
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.opaonboarding.c r1 = (com.google.android.apps.gsa.opaonboarding.C83909c) r1
            r1.getClass()
            g.a.a r1 = r0.f321297d
            java.lang.Object r1 = r1.mo17428b()
            r8 = r1
            com.google.android.apps.gsa.search.core.i.t r8 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r8
            r8.getClass()
            g.a.a r1 = r0.f321298e
            java.lang.Object r1 = r1.mo17428b()
            r9 = r1
            java.util.Map r9 = (java.util.Map) r9
            r9.getClass()
            g.a.a r1 = r0.f321299f
            java.lang.Object r1 = r1.mo17428b()
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            g.a.a r1 = r0.f321300g
            java.lang.Object r1 = r1.mo17428b()
            r16 = r1
            com.google.android.apps.gsa.opaonboarding.b r16 = (com.google.android.apps.gsa.opaonboarding.C83893b) r16
            r16.getClass()
            g.a.a r0 = r0.f321301h
            dagger.a.g r0 = (dagger.p5294a.C68221g) r0
            java.lang.Object r0 = r0.f184583a
            com.google.android.apps.gsa.opaonboarding.an r0 = (com.google.android.apps.gsa.opaonboarding.C83880an) r0
            r0.getClass()
            r4 = 2131435398(0x7f0b1f86, float:1.8492637E38)
            r1 = r11
            r5 = r22
            r15 = r11
            r11 = r16
            r12 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f321291f = r15
            r11 = r15
            com.google.android.apps.gsa.staticplugins.opaonboarding.c r11 = (com.google.android.apps.gsa.staticplugins.opaonboarding.C115859c) r11
            com.google.android.apps.gsa.opaonboarding.an r0 = r15.f321271g
            int r0 = r0.mo77228b()
            if (r0 == 0) goto L_0x0370
            if (r0 == r14) goto L_0x036d
            r1 = 3
            if (r0 == r1) goto L_0x036b
            r1 = 4
            if (r0 == r1) goto L_0x0371
            r2 = 5
            if (r0 == r2) goto L_0x0369
            goto L_0x0370
        L_0x0369:
            r14 = 4
            goto L_0x0371
        L_0x036b:
            r14 = 3
            goto L_0x0371
        L_0x036d:
            r14 = 14
            goto L_0x0371
        L_0x0370:
            r14 = 1
        L_0x0371:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opaonboarding.C115859c.f321265a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "SequenceController"
            r0.mo56378ag(r1, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 30107(0x759b, float:4.2189E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "sequenceName: %s, orientation: %d "
            java.lang.String r2 = r15.f321267c
            r0.mo56352E(r1, r2, r14)
            android.app.Activity r0 = r15.f321268d
            com.google.android.apps.gsa.shared.util.C90779c.m148334a(r0, r14)
            java.util.Map r0 = r15.f321266b
            java.lang.String r1 = r15.f321267c
            java.lang.Object r0 = r0.get(r1)
            g.a.a r0 = (p5460g.p5461a.C69464a) r0
            java.lang.String r1 = "No sequence found for name %s"
            java.lang.String r2 = r15.f321267c
            com.google.common.base.C58838bb.m90867b(r0, r1, r2)
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.opaonboarding.ap r0 = (com.google.android.apps.gsa.opaonboarding.C83882ap) r0
            java.lang.String r1 = "Sequence provider returned null"
            com.google.common.base.C58838bb.m90866a(r0, r1)
            r15.f321272h = r0
            r15.mo102287c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opaonboarding.p8656c.p8658b.C115861a.mo24895b(android.os.Bundle):void");
    }

    /* renamed from: c */
    public final void mo24896c(int i, String[] strArr, int[] iArr) {
        this.f321293h.mo85347b(i, strArr, iArr);
    }

    /* renamed from: d */
    public final void mo24897d() {
        this.f54539k.mo24866m();
        C115859c cVar = (C115859c) this.f321291f;
        cVar.f321274j = true;
        if (cVar.f321275k) {
            cVar.f321275k = false;
            cVar.mo102287c();
        }
    }

    /* renamed from: e */
    public final void mo24898e(int i, int i2, Intent intent) {
        this.f54539k.mo24856f(i, i2, intent);
        C83907bm bmVar = ((C115859c) this.f321291f).f321273i;
        if (bmVar != null && bmVar.mo77317f()) {
            bmVar.onActivityResult(i, i2, intent);
        }
        C91090a aVar = this.f321292g;
        aVar.mo85356g(i, i2, intent, aVar.f254379a);
    }

    /* renamed from: f */
    public final void mo24899f() {
        C115859c cVar = (C115859c) this.f321291f;
        C83907bm bmVar = cVar.f321273i;
        if (bmVar != null && bmVar.mo77316d()) {
            return;
        }
        if (cVar.f321278n.mo56113h()) {
            C83895ba.m133621a(cVar.f321268d, (C83915b) cVar.f321278n.mo56107c(), new C115843a(cVar), C115852b.f321254a).mo77277a();
            return;
        }
        this.f54539k.setResult(0);
        this.f54539k.mo24855e();
    }

    /* renamed from: g */
    public final void mo24900g() {
        this.f54539k.mo24862i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo102289h(C83880an anVar, C91090a aVar, C91075b bVar);

    /* renamed from: iN */
    public final void mo24901iN() {
        this.f54539k.mo24888p();
        C83907bm bmVar = ((C115859c) this.f321291f).f321273i;
        if (bmVar != null) {
            bmVar.mo77315c();
        }
    }

    /* renamed from: iO */
    public final boolean mo24902iO(int i, KeyEvent keyEvent) {
        C83901bg bgVar = this.f321291f;
        if (i != 111) {
            return this.f54539k.mo24890r(i, keyEvent);
        }
        ((C115859c) bgVar).mo102288d();
        return true;
    }

    /* renamed from: ih */
    public final void mo24903ih(Bundle bundle) {
        this.f54539k.mo24865l(bundle);
        C115859c cVar = (C115859c) this.f321291f;
        if (cVar.f321270f.mo79746e(C90014bt.f247636kr)) {
            cVar.f321274j = false;
        }
        this.f321292g.mo85357h(bundle);
    }

    /* renamed from: in */
    public final void mo24904in() {
        this.f54539k.mo24863j();
    }

    /* renamed from: j */
    public final void mo24905j() {
        this.f54539k.mo24864k();
        C0401v.m1321C();
        C115859c cVar = (C115859c) this.f321291f;
        C90743b.m148214a(cVar.f321268d.findViewById(cVar.f321269e), 500);
    }

    /* renamed from: jI */
    public final void mo77303jI(C83903bi biVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58833ax c = biVar.mo77309c();
        if (c.mo56113h()) {
            this.f54539k.setResult(biVar.mo77308b(), (Intent) c.mo56107c());
        } else {
            this.f54539k.setResult(biVar.mo77308b());
        }
        if (!m192043p()) {
            this.f54539k.mo24855e();
            if (biVar.mo77307a() != 0) {
                mo24912u(biVar.mo77307a());
                return;
            }
            return;
        }
        C45304a.m80748d(this.f54539k);
    }

    /* renamed from: k */
    public final void mo24906k() {
        this.f54539k.mo24867n();
        C115859c cVar = (C115859c) this.f321291f;
        cVar.f321274j = false;
        cVar.f321276l = false;
        cVar.f321277m = false;
    }
}
