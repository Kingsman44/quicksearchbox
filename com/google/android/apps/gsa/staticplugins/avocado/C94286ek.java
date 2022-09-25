package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ek */
/* compiled from: PG */
public final class C94286ek extends C83907bm {

    /* renamed from: g */
    private static final C59071e f263471g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.ek");

    /* renamed from: b */
    public C68214a f263472b;

    /* renamed from: c */
    public C86124t f263473c;

    /* renamed from: d */
    public C68214a f263474d;

    /* renamed from: e */
    public boolean f263475e;

    /* renamed from: f */
    public int f263476f = 1;

    /* renamed from: h */
    private C83973o f263477h;

    /* renamed from: i */
    private C94327n f263478i = C94327n.f263598g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ce A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r0 = r16
            com.google.common.f.e r1 = f263471g
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "updateErrorFragment"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "onCreateView"
            r5 = 14417(0x3851, float:2.0203E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            android.os.Bundle r2 = r16.getArguments()
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = "enrollment_errors_key"
            boolean r5 = r2.containsKey(r3)
            if (r5 == 0) goto L_0x0032
            com.google.android.apps.gsa.staticplugins.avocado.n r5 = com.google.android.apps.gsa.staticplugins.avocado.C94327n.f263598g
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r2 = com.google.android.apps.gsa.assistant.settings.shared.b.a.b(r2, r3, r5)
            com.google.android.apps.gsa.staticplugins.avocado.n r2 = (com.google.android.apps.gsa.staticplugins.avocado.C94327n) r2
            r0.f263478i = r2
        L_0x0032:
            r2 = 2131624814(0x7f0e036e, float:1.8876818E38)
            r3 = 0
            r5 = r17
            android.view.View r2 = r5.inflate(r2, r3)
            r3 = 2131434103(0x7f0b1a77, float:1.849001E38)
            android.view.View r3 = r2.findViewById(r3)
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r3 = (com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout) r3
            r5 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r5 = r3.findViewById(r5)
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r5 = (com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout) r5
            android.widget.TextView r6 = r5.f228718a
            r7 = 2132089435(0x7f151a5b, float:1.9819182E38)
            java.lang.CharSequence r7 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r7, r5)
            android.widget.TextView$BufferType r8 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r6, r7, r8, r5)
            android.widget.TextView r6 = r5.f228719b
            r7 = 2132089434(0x7f151a5a, float:1.981918E38)
            java.lang.CharSequence r7 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r7, r5)
            android.widget.TextView$BufferType r8 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r6, r7, r8, r5)
            r5 = 2131430446(0x7f0b0c2e, float:1.8482593E38)
            android.view.View r5 = r3.findViewById(r5)
            r6 = 2131430445(0x7f0b0c2d, float:1.8482591E38)
            android.view.View r3 = r3.findViewById(r6)
            com.airbnb.lottie.LottieAnimationView r3 = (com.airbnb.lottie.LottieAnimationView) r3
            com.google.android.apps.gsa.opaonboarding.ui.a.o r6 = new com.google.android.apps.gsa.opaonboarding.ui.a.o
            com.google.android.apps.gsa.staticplugins.avocado.ej r7 = new com.google.android.apps.gsa.staticplugins.avocado.ej
            r7.<init>()
            r6.<init>(r5, r3, r7)
            r6.mo77402c()
            r6.mo77403d()
            r0.f263477h = r6
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r5 = 62533(0xf445, float:8.7627E-41)
            r3.<init>(r5)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f263473c
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249987bx
            boolean r3 = r3.mo79746e(r5)
            r5 = 2132089433(0x7f151a59, float:1.9819178E38)
            r6 = 2132089432(0x7f151a58, float:1.9819176E38)
            r7 = 2132089430(0x7f151a56, float:1.9819172E38)
            r8 = 2132089429(0x7f151a55, float:1.981917E38)
            r9 = 0
            if (r3 == 0) goto L_0x00ed
            dagger.a r3 = r0.f263474d
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r3 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r3
            java.lang.String r10 = "PROBLEM_WITH_UP_DOWN_POSE_KEY"
            boolean r3 = r3.getBoolean(r10, r9)
            if (r3 == 0) goto L_0x00ed
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.app.Activity r3 = r16.getActivity()
            r1.<init>(r3)
            android.app.AlertDialog$Builder r1 = r1.setTitle(r7)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r8)
            com.google.android.apps.gsa.staticplugins.avocado.eg r3 = new com.google.android.apps.gsa.staticplugins.avocado.eg
            r3.<init>(r0)
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r6, r3)
            com.google.android.apps.gsa.staticplugins.avocado.eh r3 = new com.google.android.apps.gsa.staticplugins.avocado.eh
            r3.<init>(r0)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r5, r3)
            android.app.AlertDialog r1 = r1.create()
            r1.setCanceledOnTouchOutside(r9)
            r1.show()
            goto L_0x01fb
        L_0x00ed:
            com.google.common.f.x r3 = r1.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r10, r4)
            java.lang.String r10 = "#showErrorDialog"
            r11 = 14418(0x3852, float:2.0204E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r10)
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            android.app.Activity r10 = r16.getActivity()
            r3.<init>(r10)
            com.google.android.apps.gsa.staticplugins.avocado.n r10 = r0.f263478i
            int r11 = r10.f263600a
            r11 = r11 & 2
            r12 = 2132089424(0x7f151a50, float:1.981916E38)
            r13 = 2132089423(0x7f151a4f, float:1.9819157E38)
            if (r11 == 0) goto L_0x0146
            int r11 = r10.f263603e
            com.google.android.apps.gsa.staticplugins.avocado.fa r11 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.m155612a(r11)
            if (r11 != 0) goto L_0x011e
            com.google.android.apps.gsa.staticplugins.avocado.fa r11 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.LOCAL_FACE_MATCH_ERROR_UNDEFINED
        L_0x011e:
            com.google.android.apps.gsa.staticplugins.avocado.fa r14 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.CAMERA_ERROR
            if (r11 == r14) goto L_0x0141
            com.google.android.apps.gsa.staticplugins.avocado.fa r14 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.FRONT_CAMERA_MISSING
            if (r11 != r14) goto L_0x0127
            goto L_0x0141
        L_0x0127:
            com.google.android.apps.gsa.staticplugins.avocado.fa r14 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.DETECTOR_NOT_OPERATIONAL
            if (r11 != r14) goto L_0x0130
            r8 = 2132089424(0x7f151a50, float:1.981916E38)
            goto L_0x01c5
        L_0x0130:
            com.google.common.f.x r14 = r1.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r4)
            java.lang.String r15 = "other locale error %s"
            r8 = 14416(0x3850, float:2.0201E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r8)).mo56389s(r15, r11)
            goto L_0x0146
        L_0x0141:
            r8 = 2132089423(0x7f151a4f, float:1.9819157E38)
            goto L_0x01c5
        L_0x0146:
            com.google.protobuf.cj r8 = new com.google.protobuf.cj
            com.google.protobuf.ch r10 = r10.f263601b
            com.google.protobuf.ci r11 = com.google.android.apps.gsa.staticplugins.avocado.C94327n.f263597c
            r8.<init>(r10, r11)
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x01c2
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_NOT_DETECTED
            boolean r10 = r8.contains(r10)
            r11 = 2132089428(0x7f151a54, float:1.9819167E38)
            if (r10 != 0) goto L_0x01be
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_DETECTION_ERROR
            boolean r10 = r8.contains(r10)
            if (r10 != 0) goto L_0x01be
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_WITHOUT_SIGNATURE
            boolean r10 = r8.contains(r10)
            if (r10 != 0) goto L_0x01be
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_DETECTION_LOW_CONFIDENCE
            boolean r10 = r8.contains(r10)
            if (r10 != 0) goto L_0x01be
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_LANDMARK_LOW_CONFIDENCE
            boolean r10 = r8.contains(r10)
            if (r10 != 0) goto L_0x01be
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_WITHOUT_CONFIDENCE
            boolean r10 = r8.contains(r10)
            if (r10 == 0) goto L_0x0189
            goto L_0x01be
        L_0x0189:
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.MISSING_FRONTAL_POSE
            boolean r10 = r8.contains(r10)
            if (r10 == 0) goto L_0x0195
            r8 = 2132089426(0x7f151a52, float:1.9819163E38)
            goto L_0x01c5
        L_0x0195:
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.FACE_TOO_SMALL
            boolean r10 = r8.contains(r10)
            if (r10 == 0) goto L_0x01a1
            r8 = 2132089425(0x7f151a51, float:1.9819161E38)
            goto L_0x01c5
        L_0x01a1:
            com.google.assistant.e.l.a.ay r10 = com.google.assistant.p3897e.p3929l.p3930a.C52692ay.MULTIPLE_FACE_DETECTED
            boolean r10 = r8.contains(r10)
            if (r10 == 0) goto L_0x01ad
            r8 = 2132089427(0x7f151a53, float:1.9819165E38)
            goto L_0x01c5
        L_0x01ad:
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r10, r4)
            java.lang.String r4 = "Undefined error %s"
            r10 = 14415(0x384f, float:2.02E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r10)).mo56389s(r4, r8)
            goto L_0x01c2
        L_0x01be:
            r8 = 2132089428(0x7f151a54, float:1.9819167E38)
            goto L_0x01c5
        L_0x01c2:
            r8 = 2132089429(0x7f151a55, float:1.981917E38)
        L_0x01c5:
            android.app.AlertDialog$Builder r1 = r3.setTitle(r7)
            r1.setMessage(r8)
            if (r8 == r13) goto L_0x01e3
            if (r8 != r12) goto L_0x01d1
            goto L_0x01e3
        L_0x01d1:
            com.google.android.apps.gsa.staticplugins.avocado.ee r1 = new com.google.android.apps.gsa.staticplugins.avocado.ee
            r1.<init>(r0)
            android.app.AlertDialog$Builder r1 = r3.setNegativeButton(r6, r1)
            com.google.android.apps.gsa.staticplugins.avocado.ef r4 = new com.google.android.apps.gsa.staticplugins.avocado.ef
            r4.<init>(r0)
            r1.setPositiveButton(r5, r4)
            goto L_0x01f1
        L_0x01e3:
            r3.setCancelable(r9)
            com.google.android.apps.gsa.staticplugins.avocado.ed r1 = new com.google.android.apps.gsa.staticplugins.avocado.ed
            r1.<init>(r0)
            r4 = 2132089431(0x7f151a57, float:1.9819174E38)
            r3.setNeutralButton(r4, r1)
        L_0x01f1:
            android.app.AlertDialog r1 = r3.create()
            r1.setCanceledOnTouchOutside(r9)
            r1.show()
        L_0x01fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.avocado.C94286ek.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        C89849ae aeVar;
        super.onDestroyView();
        C83973o oVar = this.f263477h;
        if (oVar != null) {
            oVar.mo77406g();
        }
        if (this.f263475e) {
            aeVar = C89849ae.FACE_MATCH_ENROLLMENT_ERROR_RETRY;
        } else {
            aeVar = C89849ae.FACE_MATCH_ENROLLMENT_ERROR_EXIT;
        }
        ((C89859i) this.f263472b.mo27525b()).mo83702b(aeVar);
    }
}
