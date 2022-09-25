package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.content.Intent;
import android.databinding.C0118a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.p7282a.C92349f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101548b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101550d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101561o;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a.C101883i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.z */
/* compiled from: PG */
public final class C102226z {

    /* renamed from: a */
    public static final C59071e f285236a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.z");

    /* renamed from: A */
    private boolean f285237A = false;

    /* renamed from: b */
    public final C102217q f285238b;

    /* renamed from: c */
    public final C74555u f285239c;

    /* renamed from: d */
    public final C90743b f285240d;

    /* renamed from: e */
    public final C22871g f285241e;

    /* renamed from: f */
    public final C102213m f285242f;

    /* renamed from: g */
    public final C62921ba f285243g;

    /* renamed from: h */
    public final C101497ae f285244h;

    /* renamed from: i */
    public final boolean f285245i;

    /* renamed from: j */
    public final C101890g f285246j;

    /* renamed from: k */
    public final C58833ax f285247k;

    /* renamed from: l */
    public final C101610b f285248l;

    /* renamed from: m */
    public final C46440f f285249m = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C102226z.f285236a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(20625)).mo56386p("Exception at link account!");
            C102226z zVar = C102226z.this;
            Intent a = C92408n.m151739a(C92381e.ACCOUNT_LINKING_VALIDATION_FAILED);
            a.putExtra("assistant_enrollment_error", C92362c.VERIFY_ACCOUNT_LINKED);
            zVar.mo93018j(a);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            C92381e eVar;
            C92362c cVar;
            Void voidR = (Void) obj;
            C101550d dVar = (C101550d) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C101550d.f283389c, C102226z.this.f285243g);
            C59104x b = C102226z.f285236a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
            ((C59052c) ((C59052c) b).mo56372aa(20627)).mo56386p("#onSuccess linkAccountFuturesMixinCallback");
            C101548b a = C101548b.m167926a(dVar.f283392b);
            if (a == null) {
                a = C101548b.LINK_ACCOUNT_FAILED;
            }
            if (a == C101548b.LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_SUCCEEDED) {
                C102226z zVar = C102226z.this;
                if (zVar.f285238b.getView() != null) {
                    C47393f.m84236g(new C101783w(), zVar.f285238b);
                    return;
                }
                C59104x c = C102226z.f285236a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
                C59052c cVar2 = (C59052c) c;
                cVar2.mo56380ai(C58979ad.FULL);
                ((C59052c) cVar2.mo56372aa(20631)).mo56389s("fragment.getView() is %s", zVar.f285238b.getView());
                return;
            }
            C102226z zVar2 = C102226z.this;
            int i = dVar.f283392b;
            C101548b a2 = C101548b.m167926a(i);
            if (a2 == null) {
                a2 = C101548b.LINK_ACCOUNT_FAILED;
            }
            if (a2 == C101548b.LINK_ACCOUNT_FAILED) {
                eVar = C92381e.ACCOUNT_NOT_LINKED;
                cVar = C92362c.LINK_ACCOUNT;
                C59104x c2 = C102226z.f285236a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
                ((C59052c) ((C59052c) c2).mo56372aa(20636)).mo56386p("Link account failed!");
            } else {
                C101548b a3 = C101548b.m167926a(i);
                if (a3 == null) {
                    a3 = C101548b.LINK_ACCOUNT_FAILED;
                }
                if (a3 == C101548b.LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_FAILED) {
                    eVar = C92381e.ACCOUNT_LINKING_VALIDATION_FAILED;
                    cVar = C92362c.VERIFY_ACCOUNT_LINKED;
                    C59104x c3 = C102226z.f285236a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
                    ((C59052c) ((C59052c) c3).mo56372aa(20635)).mo56386p("Check if account is linked failed!");
                } else {
                    throw new AssertionError("Wrong account linking result type.");
                }
            }
            Intent a4 = C92408n.m151739a(eVar);
            a4.putExtra("assistant_enrollment_error", cVar);
            zVar2.mo93018j(a4);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
            C59104x b = C102226z.f285236a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
            ((C59052c) ((C59052c) b).mo56372aa(20626)).mo56386p("#onPending linkAccountFuturesMixinCallback");
        }
    };

    /* renamed from: n */
    public final C46439e f285250n;

    /* renamed from: o */
    public final C102230s f285251o;

    /* renamed from: p */
    public C83975q f285252p = null;

    /* renamed from: q */
    C92349f f285253q = null;

    /* renamed from: r */
    public final C104149a f285254r;

    /* renamed from: s */
    private final C92371d f285255s;

    /* renamed from: t */
    private final C101883i f285256t;

    /* renamed from: u */
    private final C68214a f285257u;

    /* renamed from: v */
    private final C101561o f285258v;

    /* renamed from: w */
    private final C68214a f285259w;

    /* renamed from: x */
    private final C92380d f285260x;

    /* renamed from: y */
    private final C86124t f285261y;

    /* renamed from: z */
    private final Map f285262z;

    /* JADX WARNING: Removed duplicated region for block: B:202:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x07cf  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x07d7  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0b7f  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0bed  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0c3e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102226z(com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u r27, com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102217q r28, com.google.android.apps.gsa.p5855h.p5861s.C74555u r29, com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a r30, com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s r31, com.google.android.apps.gsa.speech.hotword.p7285c.C92371d r32, com.google.android.apps.gsa.shared.util.C90743b r33, com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a.C101883i r34, dagger.C68214a r35, com.google.android.libraries.gsa.p1876k.C22871g r36, com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101561o r37, dagger.C68214a r38, com.google.android.apps.gsa.search.core.p6805i.C86124t r39, com.google.apps.tiktok.concurrent.futuresmixin.C46439e r40, com.google.protobuf.C62921ba r41, com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102215o r42, com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae r43, boolean r44, com.google.android.apps.gsa.assistant.settings.shared.o r45, com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a r46, com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g r47, com.google.common.base.C58833ax r48, com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b r49) {
        /*
            r26 = this;
            r0 = r26
            r1 = r39
            r2 = r42
            r26.<init>()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.z$1 r3 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.z$1
            r3.<init>()
            r0.f285249m = r3
            r3 = 0
            r0.f285252p = r3
            r0.f285253q = r3
            r4 = 0
            r0.f285237A = r4
            r5 = r28
            r0.f285238b = r5
            r5 = r29
            r0.f285239c = r5
            r5 = r30
            r0.f285254r = r5
            r5 = r32
            r0.f285255s = r5
            r5 = r33
            r0.f285240d = r5
            r5 = r34
            r0.f285256t = r5
            r5 = r35
            r0.f285257u = r5
            r5 = r36
            r0.f285241e = r5
            r5 = r37
            r0.f285258v = r5
            r5 = r38
            r0.f285259w = r5
            r5 = r40
            r0.f285250n = r5
            r5 = r41
            r0.f285243g = r5
            r0.f285261y = r1
            r5 = r27
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r5 = r5.f283919b
            if (r5 != 0) goto L_0x0052
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r5 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d.f257600g
        L_0x0052:
            r0.f285260x = r5
            r5 = r43
            r0.f285244h = r5
            r5 = r44
            r0.f285245i = r5
            r5 = r47
            r0.f285246j = r5
            r5 = r31
            r0.f285251o = r5
            r5 = r48
            r0.f285247k = r5
            r5 = r49
            r0.f285248l = r5
            com.google.assistant.at.act r5 = r46.mo92637b()
            com.google.android.apps.gsa.shared.m.h r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247730mf
            com.google.common.b.gu r1 = r1.mo79749o(r6)
            j$.util.concurrent.ConcurrentHashMap r6 = new j$.util.concurrent.ConcurrentHashMap
            r6.<init>()
            if (r5 == 0) goto L_0x00eb
            if (r1 != 0) goto L_0x0080
            goto L_0x00eb
        L_0x0080:
            int r7 = r5.f128894a
            r7 = r7 & 64
            if (r7 == 0) goto L_0x00de
            com.google.assistant.at.cx r5 = r5.f128900g
            if (r5 != 0) goto L_0x008c
            com.google.assistant.at.cx r5 = com.google.assistant.p3861at.C49893cx.f129688b
        L_0x008c:
            com.google.protobuf.cq r5 = r5.f129690a
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x00a2
            com.google.common.f.e r1 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.f257704a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r5 = "No assistant devices found."
            r7 = 12521(0x30e9, float:1.7546E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r7)).mo56386p(r5)
            goto L_0x00eb
        L_0x00a2:
            java.util.Iterator r5 = r5.iterator()
        L_0x00a6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00eb
            java.lang.Object r7 = r5.next()
            com.google.assistant.at.cj r7 = (com.google.assistant.p3861at.C49879cj) r7
            com.google.assistant.at.cv r8 = r7.f129639j
            if (r8 != 0) goto L_0x00b8
            com.google.assistant.at.cv r8 = com.google.assistant.p3861at.C49891cv.f129647N
        L_0x00b8:
            int r9 = r7.f129630a
            r9 = r9 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x00a6
            boolean r8 = r8.f129670h
            int r9 = r7.f129638i
            com.google.assistant.at.cf r9 = com.google.assistant.p3861at.C49875cf.m85755a(r9)
            if (r9 != 0) goto L_0x00ca
            com.google.assistant.at.cf r9 = com.google.assistant.p3861at.C49875cf.UNKNOWN
        L_0x00ca:
            int r9 = r9.f129621v
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r1.contains(r9)
            if (r8 == 0) goto L_0x00a6
            if (r9 == 0) goto L_0x00a6
            java.lang.String r8 = r7.f129631b
            r6.put(r8, r7)
            goto L_0x00a6
        L_0x00de:
            com.google.common.f.e r1 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.f257704a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r5 = "No settings found."
            r7 = 12522(0x30ea, float:1.7547E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r7)).mo56386p(r5)
        L_0x00eb:
            java.util.Collection r1 = r6.values()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f8:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x012d
            java.lang.Object r6 = r1.next()
            com.google.assistant.at.cj r6 = (com.google.assistant.p3861at.C49879cj) r6
            com.google.assistant.at.cv r7 = r6.f129639j
            if (r7 != 0) goto L_0x010a
            com.google.assistant.at.cv r7 = com.google.assistant.p3861at.C49891cv.f129647N
        L_0x010a:
            int r8 = r6.f129630a
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x012a
            java.lang.String r7 = r7.f129665c
            int r6 = r6.f129638i
            com.google.assistant.at.cf r6 = com.google.assistant.p3861at.C49875cf.m85755a(r6)
            if (r6 != 0) goto L_0x011c
            com.google.assistant.at.cf r6 = com.google.assistant.p3861at.C49875cf.UNKNOWN
        L_0x011c:
            r8 = r45
            int r6 = r8.b(r6, r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r7, r6)
            goto L_0x00f8
        L_0x012a:
            r8 = r45
            goto L_0x00f8
        L_0x012d:
            r0.f285262z = r5
            com.google.common.f.e r1 = f285236a
            com.google.common.f.x r6 = r1.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "VMConsentFragmentPeer"
            r6.mo56378ag(r7, r8)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            r7 = 20629(0x5095, float:2.8907E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r7)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.String r7 = "deviceIdToIconMap = %s"
            r6.mo56389s(r7, r5)
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r6 = r0.f285260x
            if (r6 == 0) goto L_0x0c48
            boolean r5 = r5.isEmpty()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.c r7 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.c
            r9 = 1
            r5 = r5 ^ r9
            r7.<init>(r6, r5)
            g.a.a r5 = r2.f285206a
            java.lang.Object r5 = r5.mo17428b()
            com.google.android.apps.gsa.h.s.u r5 = (com.google.android.apps.gsa.p5855h.p5861s.C74555u) r5
            r5.getClass()
            g.a.a r6 = r2.f285207b
            java.lang.Object r6 = r6.mo17428b()
            android.content.Context r6 = (android.content.Context) r6
            r6.getClass()
            g.a.a r10 = r2.f285208c
            java.lang.Object r10 = r10.mo17428b()
            com.google.android.apps.gsa.shared.m.b.f r10 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r10
            r10.getClass()
            g.a.a r11 = r2.f285209d
            java.lang.Object r11 = r11.mo17428b()
            com.google.android.apps.gsa.speech.hotword.c.d r11 = (com.google.android.apps.gsa.speech.hotword.p7285c.C92371d) r11
            r11.getClass()
            g.a.a r12 = r2.f285210e
            java.lang.Object r12 = r12.mo17428b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r12 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a) r12
            r12.getClass()
            g.a.a r13 = r2.f285211f
            java.lang.Object r13 = r13.mo17428b()
            com.google.android.apps.gsa.speech.microdetection.a r13 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r13
            r13.getClass()
            g.a.a r14 = r2.f285212g
            java.lang.Object r14 = r14.mo17428b()
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper r14 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper) r14
            r14.getClass()
            g.a.a r15 = r2.f285213h
            java.lang.Object r15 = r15.mo17428b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r15 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae) r15
            r15.getClass()
            g.a.a r3 = r2.f285214i
            java.lang.Object r3 = r3.mo17428b()
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            r3.getClass()
            g.a.a r4 = r2.f285215j
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.e r4 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101888e) r4
            r4.getClass()
            g.a.a r9 = r2.f285216k
            java.lang.Object r9 = r9.mo17428b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.g r9 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g) r9
            r9.getClass()
            r44 = r8
            g.a.a r8 = r2.f285217l
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.shared.speech.hotword.a.f r8 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f) r8
            r8.getClass()
            g.a.a r2 = r2.f285218m
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b) r2
            r2.getClass()
            r45 = r1
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r1 = r7.f285180a
            boolean r7 = r7.f285181b
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.a r0 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.a
            r0.<init>()
            boolean r17 = r2.mo92421b()
            r18 = 4
            r42 = r2
            java.lang.String r19 = "GENDER"
            if (r17 == 0) goto L_0x03be
            boolean r17 = r5.mo70892k()
            if (r17 == 0) goto L_0x0386
            boolean r17 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169392d(r12)
            if (r17 == 0) goto L_0x0318
            com.google.android.apps.gsa.h.s.ae r17 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r2 = r17.mo70854b()
            r17 = r9
            com.google.android.apps.gsa.h.s.af r9 = com.google.android.apps.gsa.h.s.af.f
            if (r2 != r9) goto L_0x0277
            com.google.android.apps.gsa.h.s.ae r2 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.r r2 = r2.mo70853a()
            boolean r2 = r2.mo70880d()
            if (r2 == 0) goto L_0x024d
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x0245
            r2 = 1
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            r16 = 0
            r9[r16] = r2
            r2 = 2132088221(0x7f15159d, float:1.981672E38)
            java.lang.String r2 = r6.getString(r2, r9)
            goto L_0x026f
        L_0x0245:
            r2 = 2132088220(0x7f15159c, float:1.9816717E38)
            java.lang.String r2 = r6.getString(r2)
            goto L_0x026f
        L_0x024d:
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x0268
            r2 = 1
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            r16 = 0
            r9[r16] = r2
            r2 = 2132088125(0x7f15153d, float:1.9816525E38)
            java.lang.String r2 = r6.getString(r2, r9)
            goto L_0x026f
        L_0x0268:
            r2 = 2132088079(0x7f15150f, float:1.9816431E38)
            java.lang.String r2 = r6.getString(r2)
        L_0x026f:
            r9 = 2132090623(0x7f151eff, float:1.9821591E38)
            java.lang.String r21 = r6.getString(r9)
            goto L_0x02b5
        L_0x0277:
            boolean r2 = r3.mo56113h()
            if (r2 == 0) goto L_0x02bf
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x02a1
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            java.lang.Object r2 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r2
            java.lang.String r2 = r2.mo92653k()
            java.lang.Object r9 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r9 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r9
            r15.mo92330c()
            java.lang.String r21 = r9.mo92652j()
            goto L_0x02b5
        L_0x02a1:
            java.lang.Object r2 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r2
            java.lang.String r2 = r2.mo92651i()
            java.lang.Object r9 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r9 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r9
            java.lang.String r21 = r9.mo92650h()
        L_0x02b5:
            r22 = r7
            r25 = r21
            r21 = r4
            r4 = r25
            goto L_0x03b6
        L_0x02bf:
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x0304
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            r21 = r4
            r9 = 1
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r16 = 0
            r4[r16] = r2
            r22 = r7
            r7 = 2132088125(0x7f15153d, float:1.9816525E38)
            java.lang.String r4 = r6.getString(r7, r4)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r7[r16] = r2
            r2 = 2132088196(0x7f151584, float:1.9816669E38)
            java.lang.String r2 = r6.getString(r2, r7)
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r16] = r19
            java.lang.String r7 = r15.mo92330c()
            r23 = 1
            r9[r23] = r7
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r2 = com.android.p265e.C5114a.m13988b(r7, r2, r9)
            r25 = r4
            r4 = r2
            r2 = r25
            goto L_0x03b6
        L_0x0304:
            r21 = r4
            r22 = r7
            r2 = 2132088079(0x7f15150f, float:1.9816431E38)
            java.lang.String r2 = r6.getString(r2)
            r4 = 2132088195(0x7f151583, float:1.9816667E38)
            java.lang.String r4 = r6.getString(r4)
            goto L_0x03b6
        L_0x0318:
            r21 = r4
            r22 = r7
            r17 = r9
            boolean r2 = r3.mo56113h()
            if (r2 == 0) goto L_0x035d
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x034b
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r4 = 0
            r7[r4] = r2
            r2 = 2132088083(0x7f151513, float:1.981644E38)
            java.lang.String r2 = r6.getString(r2, r7)
            java.lang.Object r4 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r4 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r4
            r15.mo92330c()
            java.lang.String r4 = r4.mo92652j()
            goto L_0x03b6
        L_0x034b:
            r2 = 2132088081(0x7f151511, float:1.9816435E38)
            java.lang.String r2 = r6.getString(r2)
            java.lang.Object r4 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r4 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r4
            java.lang.String r4 = r4.mo92654l()
            goto L_0x03b6
        L_0x035d:
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x0377
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            r7 = 0
            r4[r7] = r2
            r2 = 2132088083(0x7f151513, float:1.981644E38)
            java.lang.String r2 = r6.getString(r2, r4)
            goto L_0x037e
        L_0x0377:
            r2 = 2132088081(0x7f151511, float:1.9816435E38)
            java.lang.String r2 = r6.getString(r2)
        L_0x037e:
            r4 = 2132090623(0x7f151eff, float:1.9821591E38)
            java.lang.String r7 = r6.getString(r4)
            goto L_0x03b5
        L_0x0386:
            r21 = r4
            r22 = r7
            r17 = r9
            boolean r2 = r15.mo92334g()
            if (r2 == 0) goto L_0x03a6
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.google.android.apps.gsa.opaonboarding.d.v r2 = r15.mo92328a()
            java.lang.String r2 = r2.f228594c
            r7 = 0
            r4[r7] = r2
            r2 = 2132090625(0x7f151f01, float:1.9821595E38)
            java.lang.String r2 = r6.getString(r2, r4)
            goto L_0x03ae
        L_0x03a6:
            r2 = 2132090624(0x7f151f00, float:1.9821593E38)
            java.lang.String r4 = r6.getString(r2)
            r2 = r4
        L_0x03ae:
            r4 = 2132090623(0x7f151eff, float:1.9821591E38)
            java.lang.String r7 = r6.getString(r4)
        L_0x03b5:
            r4 = r7
        L_0x03b6:
            r0.mo92950c(r2)
            r0.mo92949b(r4)
            goto L_0x0452
        L_0x03be:
            r21 = r4
            r22 = r7
            r17 = r9
            boolean r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            if (r2 == 0) goto L_0x041d
            boolean r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169392d(r12)
            r4 = 1
            if (r4 == r2) goto L_0x03d5
            r2 = 2132088145(0x7f151551, float:1.9816565E38)
            goto L_0x03d8
        L_0x03d5:
            r2 = 2132088125(0x7f15153d, float:1.9816525E38)
        L_0x03d8:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r9 = r15.mo92329b()
            r16 = 0
            r7[r16] = r9
            java.lang.String r2 = r6.getString(r2, r7)
            r0.mo92950c(r2)
            boolean r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169392d(r12)
            if (r4 == r2) goto L_0x03f3
            r2 = 2132088165(0x7f151565, float:1.9816606E38)
            goto L_0x03f6
        L_0x03f3:
            r2 = 2132088196(0x7f151584, float:1.9816669E38)
        L_0x03f6:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r9 = r15.mo92329b()
            r7[r16] = r9
            java.lang.String r2 = r6.getString(r2, r7)
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r16] = r19
            java.lang.String r7 = r11.mo87023d()
            r9[r4] = r7
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r2 = com.android.p265e.C5114a.m13988b(r4, r2, r9)
            android.text.Spannable r2 = r14.mo87038a(r2)
            r0.mo92949b(r2)
            goto L_0x0452
        L_0x041d:
            boolean r2 = r5.mo70891j()
            if (r2 != 0) goto L_0x0458
            int r2 = r1.f257603b
            int r2 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92379c.m151713a(r2)
            if (r2 != 0) goto L_0x042c
            goto L_0x0430
        L_0x042c:
            r4 = 3
            if (r2 != r4) goto L_0x0430
            goto L_0x0458
        L_0x0430:
            r2 = 2132088118(0x7f151536, float:1.981651E38)
            java.lang.String r2 = r6.getString(r2)
            r0.mo92950c(r2)
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r2 = r13.mo87230d()
            r7 = 0
            r4[r7] = r2
            r2 = 2132088123(0x7f15153b, float:1.981652E38)
            java.lang.String r2 = r6.getString(r2, r4)
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            r0.mo92949b(r2)
        L_0x0452:
            r23 = r1
            r24 = r8
            goto L_0x072a
        L_0x0458:
            boolean r2 = r10.mo83852O()
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169392d(r12)
            boolean r7 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169393e(r5)
            com.google.android.apps.gsa.h.s.y r9 = r5.mo70885c()
            com.google.android.apps.gsa.h.s.z r9 = r9.mo70898b()
            r23 = r1
            com.google.android.apps.gsa.h.s.z r1 = com.google.android.apps.gsa.h.s.z.d
            boolean r24 = r5.mo70891j()
            if (r24 != 0) goto L_0x052a
            boolean r1 = r5.mo70892k()
            if (r1 == 0) goto L_0x04aa
            boolean r1 = r3.mo56113h()
            if (r1 == 0) goto L_0x04aa
            if (r4 == 0) goto L_0x04aa
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            boolean r1 = r1.f228593b
            if (r1 == 0) goto L_0x049e
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r1
            com.google.android.apps.gsa.opaonboarding.d.v r4 = r15.mo92328a()
            java.lang.String r4 = r4.f228594c
            java.lang.String r1 = r1.mo92653k()
            goto L_0x0567
        L_0x049e:
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r1
            java.lang.String r1 = r1.mo92651i()
            goto L_0x0567
        L_0x04aa:
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169395g(r5, r15)
            if (r1 == 0) goto L_0x04d6
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            java.lang.String r1 = r1.f228594c
            if (r4 == 0) goto L_0x04c7
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r9 = 0
            r7[r9] = r1
            r1 = 2132088125(0x7f15153d, float:1.9816525E38)
            java.lang.String r1 = r6.getString(r1, r7)
            goto L_0x0567
        L_0x04c7:
            r4 = 1
            r9 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r9] = r1
            r1 = 2132088083(0x7f151513, float:1.981644E38)
            java.lang.String r1 = r6.getString(r1, r7)
            goto L_0x0567
        L_0x04d6:
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            boolean r1 = r1.mo70857f()
            if (r1 == 0) goto L_0x04eb
            if (r4 != 0) goto L_0x04eb
            r1 = 2132088081(0x7f151511, float:1.9816435E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0567
        L_0x04eb:
            boolean r1 = r15.mo92337j()
            if (r1 == 0) goto L_0x050a
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r1 = r15.mo92329b()
            r7 = 0
            r4[r7] = r1
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r7 = 1
            r4[r7] = r1
            r1 = 2132088119(0x7f151537, float:1.9816513E38)
            java.lang.String r1 = r6.getString(r1, r4)
            goto L_0x0567
        L_0x050a:
            r7 = 1
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            boolean r1 = r1.mo70857f()
            if (r7 == r1) goto L_0x0519
            r1 = 2132088117(0x7f151535, float:1.9816508E38)
            goto L_0x051c
        L_0x0519:
            r1 = 2132088124(0x7f15153c, float:1.9816523E38)
        L_0x051c:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r7 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r9 = 0
            r4[r9] = r7
            java.lang.String r1 = r6.getString(r1, r4)
            goto L_0x0567
        L_0x052a:
            if (r4 != 0) goto L_0x053e
            if (r9 != r1) goto L_0x0536
            r1 = 2132088082(0x7f151512, float:1.9816437E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0567
        L_0x0536:
            r1 = 2132088081(0x7f151511, float:1.9816435E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0567
        L_0x053e:
            if (r7 != 0) goto L_0x0556
            if (r2 != 0) goto L_0x0556
            if (r22 == 0) goto L_0x0556
            if (r9 != r1) goto L_0x054e
            r1 = 2132088085(0x7f151515, float:1.9816444E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0567
        L_0x054e:
            r1 = 2132088084(0x7f151514, float:1.9816442E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0567
        L_0x0556:
            if (r9 != r1) goto L_0x0560
            r1 = 2132088080(0x7f151510, float:1.9816433E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0567
        L_0x0560:
            r1 = 2132088079(0x7f15150f, float:1.9816431E38)
            java.lang.String r1 = r6.getString(r1)
        L_0x0567:
            r0.mo92950c(r1)
            boolean r1 = r5.mo70891j()
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169392d(r12)
            boolean r7 = r5.mo70892k()
            if (r7 == 0) goto L_0x05c6
            boolean r7 = r3.mo56113h()
            if (r7 == 0) goto L_0x05c6
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            boolean r1 = r1.f228593b
            if (r1 == 0) goto L_0x05ac
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            java.lang.String r1 = r1.f228594c
            if (r4 == 0) goto L_0x059d
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r1
            r15.mo92330c()
            java.lang.String r1 = r1.mo92652j()
            goto L_0x063b
        L_0x059d:
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r1
            r15.mo92330c()
            java.lang.String r1 = r1.mo92655m()
            goto L_0x063b
        L_0x05ac:
            if (r4 == 0) goto L_0x05ba
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r1
            java.lang.String r1 = r1.mo92650h()
            goto L_0x063b
        L_0x05ba:
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.i.a r1 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a) r1
            java.lang.String r1 = r1.mo92654l()
            goto L_0x063b
        L_0x05c6:
            com.google.android.apps.gsa.h.s.ae r7 = r5.mo70887e()
            boolean r7 = r7.mo70857f()
            if (r7 == 0) goto L_0x063f
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169395g(r5, r15)
            if (r1 == 0) goto L_0x0620
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            java.lang.String r1 = r1.f228594c
            if (r4 == 0) goto L_0x05ff
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r7 = 0
            r4[r7] = r1
            r1 = 2132088196(0x7f151584, float:1.9816669E38)
            java.lang.String r1 = r6.getString(r1, r4)
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r7] = r19
            java.lang.String r16 = r15.mo92330c()
            r9[r2] = r16
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r1 = com.android.p265e.C5114a.m13988b(r4, r1, r9)
            goto L_0x063b
        L_0x05ff:
            r2 = 1
            r7 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r7] = r1
            r1 = 2132088198(0x7f151586, float:1.9816673E38)
            java.lang.String r1 = r6.getString(r1, r4)
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r7] = r19
            java.lang.String r4 = r15.mo92330c()
            r9[r2] = r4
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r1 = com.android.p265e.C5114a.m13988b(r4, r1, r9)
            goto L_0x063b
        L_0x0620:
            r2 = 1
            r7 = 0
            if (r4 == 0) goto L_0x062c
            r1 = 2132088195(0x7f151583, float:1.9816667E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x063b
        L_0x062c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r1[r7] = r2
            r2 = 2132088197(0x7f151585, float:1.981667E38)
            java.lang.String r1 = r6.getString(r2, r1)
        L_0x063b:
            r24 = r8
            goto L_0x0727
        L_0x063f:
            com.google.android.apps.gsa.h.s.ae r7 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r7 = r7.mo70854b()
            com.google.android.apps.gsa.h.s.af r9 = com.google.android.apps.gsa.h.s.af.f
            if (r7 != r9) goto L_0x06d5
            com.google.android.apps.gsa.h.s.ae r7 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.r r7 = r7.mo70853a()
            boolean r7 = r7.mo70879c()
            if (r7 == 0) goto L_0x06d5
            r27 = r6
            r28 = r5
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r23
            r35 = r22
            r36 = r15
            r37 = r3
            r38 = r21
            r39 = r17
            r40 = r8
            r41 = r42
            int r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169389a(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            boolean r4 = r15.mo92337j()
            if (r4 == 0) goto L_0x06be
            r4 = 5
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r4 = 0
            r7[r4] = r1
            java.lang.String r1 = r15.mo92329b()
            r9 = 1
            r7[r9] = r1
            r1 = 2
            r7[r1] = r2
            r16 = 3
            r7[r16] = r2
            java.lang.String r2 = r15.mo92329b()
            r7[r18] = r2
            r2 = 2132088116(0x7f151534, float:1.9816506E38)
            java.lang.String r2 = r6.getString(r2, r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r4] = r19
            java.lang.String r16 = r15.mo92330c()
            r7[r9] = r16
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = com.android.p265e.C5114a.m13988b(r1, r2, r7)
            goto L_0x063b
        L_0x06be:
            r24 = r8
            r4 = 0
            r7 = 3
            r9 = 1
            r20 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r4] = r1
            r8[r9] = r2
            r8[r20] = r2
            r1 = 2132088115(0x7f151533, float:1.9816504E38)
            java.lang.String r1 = r6.getString(r1, r8)
            goto L_0x0727
        L_0x06d5:
            r24 = r8
            r9 = 1
            if (r1 != 0) goto L_0x070c
            boolean r1 = r15.mo92337j()
            if (r1 == 0) goto L_0x0704
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = r15.mo92329b()
            r4 = 0
            r1[r4] = r2
            r2 = 2132088114(0x7f151532, float:1.9816502E38)
            java.lang.String r1 = r6.getString(r2, r1)
            r2 = 2
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r4] = r19
            java.lang.String r2 = r15.mo92330c()
            r7[r9] = r2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r1 = com.android.p265e.C5114a.m13988b(r2, r1, r7)
            goto L_0x0727
        L_0x0704:
            r1 = 2132088113(0x7f151531, float:1.98165E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0727
        L_0x070c:
            if (r4 != 0) goto L_0x0716
            r1 = 2132088090(0x7f15151a, float:1.9816454E38)
            java.lang.CharSequence r1 = r6.getText(r1)
            goto L_0x0727
        L_0x0716:
            if (r2 != 0) goto L_0x0720
            r1 = 2132088092(0x7f15151c, float:1.9816458E38)
            java.lang.CharSequence r1 = r6.getText(r1)
            goto L_0x0727
        L_0x0720:
            r1 = 2132088091(0x7f15151b, float:1.9816456E38)
            java.lang.CharSequence r1 = r6.getText(r1)
        L_0x0727:
            r0.mo92949b(r1)
        L_0x072a:
            boolean r1 = r21.mo92669c()
            if (r1 == 0) goto L_0x073e
            java.lang.String r1 = r17.mo92672c()
            r0.mo92950c(r1)
            java.lang.String r1 = r17.mo92671b()
            r0.mo92949b(r1)
        L_0x073e:
            r27 = r6
            r28 = r5
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r23
            r35 = r22
            r36 = r15
            r37 = r3
            r38 = r21
            r39 = r17
            r40 = r24
            r41 = r42
            int r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169389a(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.f285113a = r1
            int r1 = r0.f285110F
            r2 = 1
            r1 = r1 | r2
            r0.f285110F = r1
            boolean r1 = r5.mo70892k()
            r2 = 2132088218(0x7f15159a, float:1.9816713E38)
            if (r1 == 0) goto L_0x079b
            com.google.android.apps.gsa.h.s.af r1 = com.google.android.apps.gsa.h.s.af.a
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r1 = r1.mo70854b()
            int r1 = r1.ordinal()
            r3 = 2132088219(0x7f15159b, float:1.9816715E38)
            r4 = 3
            if (r1 == r4) goto L_0x0797
            r4 = 5
            if (r1 == r4) goto L_0x0789
            goto L_0x07bf
        L_0x0789:
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.r r1 = r1.mo70853a()
            boolean r1 = r1.mo70877a()
            if (r1 == 0) goto L_0x07bf
        L_0x0797:
            r2 = 2132088219(0x7f15159b, float:1.9816715E38)
            goto L_0x07bf
        L_0x079b:
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169393e(r5)
            if (r1 == 0) goto L_0x07a5
            r2 = 2132088093(0x7f15151d, float:1.981646E38)
            goto L_0x07bf
        L_0x07a5:
            boolean r1 = r15.mo92336i()
            if (r1 != 0) goto L_0x07bf
            boolean r1 = r15.mo92335h()
            if (r1 == 0) goto L_0x07b2
            goto L_0x07bf
        L_0x07b2:
            boolean r1 = r5.mo70891j()
            if (r1 == 0) goto L_0x07bc
            r2 = 2132088060(0x7f1514fc, float:1.9816393E38)
            goto L_0x07bf
        L_0x07bc:
            r2 = 2132088142(0x7f15154e, float:1.981656E38)
        L_0x07bf:
            r0.f285114b = r2
            int r1 = r0.f285110F
            r2 = 2
            r1 = r1 | r2
            r0.f285110F = r1
            boolean r1 = r21.mo92669c()
            r3 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x07d7
            java.lang.String r1 = r17.mo92673d()
            r8 = r24
            goto L_0x0849
        L_0x07d7:
            boolean r1 = r15.mo92337j()
            if (r1 == 0) goto L_0x080f
            boolean r1 = r15.mo92332e()
            if (r1 != 0) goto L_0x080f
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = r15.mo92329b()
            r7 = 0
            r1[r7] = r4
            r8 = r24
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r9 = 1
            r1[r9] = r4
            r4 = 2132088120(0x7f151538, float:1.9816515E38)
            java.lang.String r1 = r6.getString(r4, r1)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r7] = r19
            java.lang.String r2 = r15.mo92330c()
            r4[r9] = r2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r1 = com.android.p265e.C5114a.m13988b(r2, r1, r4)
            goto L_0x0849
        L_0x080f:
            r8 = r24
            com.google.assistant.at.act r1 = r12.mo92637b()
            if (r1 != 0) goto L_0x0818
            goto L_0x0842
        L_0x0818:
            int r2 = r1.f128894a
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0826
            com.google.assistant.at.ew r1 = r1.f128911r
            if (r1 != 0) goto L_0x0823
            com.google.assistant.at.ew r1 = com.google.assistant.p3861at.C49946ew.f129824q
        L_0x0823:
            boolean r1 = r1.f129835j
            goto L_0x0827
        L_0x0826:
            r1 = 0
        L_0x0827:
            com.google.common.f.e r2 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.f257704a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r7 = 12525(0x30ed, float:1.7551E-41)
            java.lang.String r9 = "isTiSidEligible is %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56389s(r9, r4)
            if (r1 == 0) goto L_0x0842
            r1 = 2132088106(0x7f15152a, float:1.9816486E38)
            java.lang.CharSequence r1 = r6.getText(r1)
            goto L_0x0849
        L_0x0842:
            r1 = 2132088199(0x7f151587, float:1.9816675E38)
            java.lang.CharSequence r1 = r6.getText(r1)
        L_0x0849:
            if (r1 == 0) goto L_0x0c3e
            r0.f285115c = r1
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r4 = r15.mo92329b()
            r7 = 0
            r2[r7] = r4
            r4 = 2132088190(0x7f15157e, float:1.9816657E38)
            java.lang.String r2 = r6.getString(r4, r2)
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r7] = r19
            java.lang.String r4 = r15.mo92330c()
            r9[r1] = r4
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r2 = com.android.p265e.C5114a.m13988b(r4, r2, r9)
            r0.f285116d = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r4 = r15.mo92329b()
            r2[r7] = r4
            r4 = 2132088192(0x7f151580, float:1.981666E38)
            java.lang.String r2 = r6.getString(r4, r2)
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r7] = r19
            java.lang.String r4 = r15.mo92330c()
            r9[r1] = r4
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r2 = com.android.p265e.C5114a.m13988b(r4, r2, r9)
            r0.f285117e = r2
            boolean r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            if (r2 == 0) goto L_0x08ad
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r4 = r15.mo92329b()
            r2[r7] = r4
            r4 = 2132088166(0x7f151566, float:1.9816608E38)
            java.lang.String r2 = r6.getString(r4, r2)
            goto L_0x08bc
        L_0x08ad:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r15.mo92329b()
            r2[r7] = r1
            r1 = 2132088194(0x7f151582, float:1.9816665E38)
            java.lang.String r2 = r6.getString(r1, r2)
        L_0x08bc:
            if (r2 == 0) goto L_0x0c34
            r0.f285118f = r2
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169392d(r12)
            r0.f285128p = r1
            int r1 = r0.f285110F
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f285110F = r1
            boolean r1 = r5.mo70891j()
            r0.f285125m = r1
            int r1 = r0.f285110F
            r1 = r1 | 16
            r0.f285110F = r1
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            r0.f285123k = r1
            int r1 = r0.f285110F
            r1 = r1 | 4
            r0.f285110F = r1
            r27 = r5
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r23
            r32 = r22
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169398j(r27, r28, r29, r30, r31, r32)
            r0.f285129q = r1
            int r1 = r0.f285110F
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f285110F = r1
            boolean r1 = r42.mo92421b()
            if (r1 != 0) goto L_0x091d
            boolean r1 = r21.mo92669c()
            if (r1 == 0) goto L_0x0909
            goto L_0x091d
        L_0x0909:
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            if (r1 != 0) goto L_0x091b
            boolean r1 = r5.mo70891j()
            if (r1 != 0) goto L_0x091b
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169391c(r23)
            if (r1 == 0) goto L_0x091d
        L_0x091b:
            r1 = 1
            goto L_0x091e
        L_0x091d:
            r1 = 0
        L_0x091e:
            r0.f285124l = r1
            int r1 = r0.f285110F
            r1 = r1 | 8
            r0.f285110F = r1
            r27 = r5
            r28 = r11
            r29 = r12
            r30 = r23
            r31 = r15
            r32 = r21
            r33 = r42
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169399k(r27, r28, r29, r30, r31, r32, r33)
            r0.f285127o = r1
            int r1 = r0.f285110F
            r1 = r1 | 64
            r0.f285110F = r1
            boolean r1 = r21.mo92669c()
            if (r1 == 0) goto L_0x094b
            java.lang.String r1 = r17.mo92672c()
            goto L_0x096a
        L_0x094b:
            boolean r1 = r15.mo92337j()
            if (r1 == 0) goto L_0x0963
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r4 = 0
            r2[r4] = r1
            r1 = 2132090622(0x7f151efe, float:1.982159E38)
            java.lang.String r1 = r6.getString(r1, r2)
            goto L_0x096a
        L_0x0963:
            r1 = 2132090624(0x7f151f00, float:1.9821593E38)
            java.lang.CharSequence r1 = r6.getText(r1)
        L_0x096a:
            if (r1 == 0) goto L_0x0c2a
            r0.f285119g = r1
            boolean r1 = r21.mo92669c()
            if (r1 == 0) goto L_0x0979
            java.lang.String r1 = r17.mo92671b()
            goto L_0x0980
        L_0x0979:
            r1 = 2132090623(0x7f151eff, float:1.9821591E38)
            java.lang.String r1 = r6.getString(r1)
        L_0x0980:
            if (r1 == 0) goto L_0x0c20
            r0.f285120h = r1
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169393e(r5)
            r0.f285126n = r1
            int r1 = r0.f285110F
            r1 = r1 | 32
            r0.f285110F = r1
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            r0.f285130r = r1
            int r1 = r0.f285110F
            r1 = r1 | 512(0x200, float:7.175E-43)
            r0.f285110F = r1
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            if (r1 != 0) goto L_0x09aa
            boolean r1 = r5.mo70891j()
            if (r1 == 0) goto L_0x09aa
            r1 = 1
            goto L_0x09ab
        L_0x09aa:
            r1 = 0
        L_0x09ab:
            r0.f285131s = r1
            int r1 = r0.f285110F
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r0.f285110F = r1
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            if (r1 != 0) goto L_0x09c1
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169391c(r23)
            if (r1 == 0) goto L_0x09c1
            r1 = 1
            goto L_0x09c2
        L_0x09c1:
            r1 = 0
        L_0x09c2:
            r0.f285132t = r1
            int r1 = r0.f285110F
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r0.f285110F = r1
            r2 = r42
            r1 = r23
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169397i(r5, r1, r2)
            r0.f285133u = r4
            int r4 = r0.f285110F
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r0.f285110F = r4
            boolean r4 = r2.mo92421b()
            if (r4 != 0) goto L_0x0a1e
            boolean r4 = r21.mo92669c()
            if (r4 == 0) goto L_0x09e7
            goto L_0x0a1e
        L_0x09e7:
            r27 = r5
            r28 = r11
            r29 = r12
            r30 = r1
            r31 = r15
            r32 = r21
            r33 = r2
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169399k(r27, r28, r29, r30, r31, r32, r33)
            if (r4 != 0) goto L_0x0a1e
            com.google.android.apps.gsa.h.s.ab r4 = r5.mo70886d()
            com.google.android.apps.gsa.h.s.ac r4 = r4.mo70847a()
            int r4 = r4.d()
            r7 = 2
            if (r4 == r7) goto L_0x0a1e
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169394f(r5, r11, r12)
            if (r4 != 0) goto L_0x0a1e
            boolean r4 = r5.mo70891j()
            if (r4 != 0) goto L_0x0a1c
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169391c(r1)
            if (r4 == 0) goto L_0x0a1e
        L_0x0a1c:
            r4 = 1
            goto L_0x0a1f
        L_0x0a1e:
            r4 = 0
        L_0x0a1f:
            r0.f285134v = r4
            int r4 = r0.f285110F
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r0.f285110F = r4
            boolean r4 = r2.mo92421b()
            if (r4 != 0) goto L_0x0a5c
            boolean r4 = r21.mo92669c()
            if (r4 == 0) goto L_0x0a34
            goto L_0x0a5c
        L_0x0a34:
            r27 = r5
            r28 = r11
            r29 = r12
            r30 = r1
            r31 = r15
            r32 = r21
            r33 = r2
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169399k(r27, r28, r29, r30, r31, r32, r33)
            if (r4 != 0) goto L_0x0a5c
            r27 = r5
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r1
            r32 = r22
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169398j(r27, r28, r29, r30, r31, r32)
            if (r4 == 0) goto L_0x0a5c
            r4 = 1
            goto L_0x0a5d
        L_0x0a5c:
            r4 = 0
        L_0x0a5d:
            r0.f285135w = r4
            int r4 = r0.f285110F
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r0.f285110F = r4
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169396h(r5, r1)
            if (r4 == 0) goto L_0x0a85
            com.google.android.apps.gsa.h.s.ae r4 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r4 = r4.mo70854b()
            com.google.android.apps.gsa.h.s.af r7 = com.google.android.apps.gsa.h.s.af.d
            if (r4 == r7) goto L_0x0a85
            com.google.android.apps.gsa.h.s.ae r4 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r4 = r4.mo70854b()
            com.google.android.apps.gsa.h.s.af r7 = com.google.android.apps.gsa.h.s.af.e
            if (r4 == r7) goto L_0x0a85
            r4 = 1
            goto L_0x0a86
        L_0x0a85:
            r4 = 0
        L_0x0a86:
            r0.f285136x = r4
            int r4 = r0.f285110F
            r7 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r7
            r0.f285110F = r4
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169396h(r5, r1)
            r0.f285137y = r4
            int r4 = r0.f285110F
            r7 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r7
            r0.f285110F = r4
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169396h(r5, r1)
            r0.f285138z = r4
            int r4 = r0.f285110F
            r7 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r7
            r0.f285110F = r4
            boolean r4 = r5.mo70891j()
            r0.f285105A = r4
            int r4 = r0.f285110F
            r7 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 | r7
            r0.f285110F = r4
            boolean r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169395g(r5, r15)
            r0.f285106B = r4
            int r4 = r0.f285110F
            r3 = r3 | r4
            r0.f285110F = r3
            boolean r3 = r21.mo92669c()
            r0.f285107C = r3
            int r3 = r0.f285110F
            r4 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r4
            r0.f285110F = r3
            r4 = r21
            boolean r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169400l(r5, r15, r4, r2)
            r0.f285108D = r3
            int r3 = r0.f285110F
            r7 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 | r7
            r0.f285110F = r3
            boolean r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169400l(r5, r15, r4, r2)
            if (r3 == 0) goto L_0x0aec
            boolean r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169397i(r5, r1, r2)
            if (r1 != 0) goto L_0x0aec
            r1 = 1
            goto L_0x0aed
        L_0x0aec:
            r1 = 0
        L_0x0aed:
            r0.f285109E = r1
            int r1 = r0.f285110F
            r3 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r3
            r0.f285110F = r1
            boolean r1 = r2.mo92421b()
            if (r1 != 0) goto L_0x0b62
            boolean r1 = r4.mo92669c()
            if (r1 == 0) goto L_0x0b03
            goto L_0x0b62
        L_0x0b03:
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r1 = r1.mo70854b()
            com.google.android.apps.gsa.h.s.af r3 = com.google.android.apps.gsa.h.s.af.f
            if (r1 != r3) goto L_0x0b6f
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.r r1 = r1.mo70853a()
            boolean r1 = r1.mo70880d()
            if (r1 == 0) goto L_0x0b6f
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.r r1 = r1.mo70853a()
            boolean r1 = r1.mo70878b()
            if (r1 != 0) goto L_0x0b6f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r1 = r15.f283244a
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f284137d
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0b50
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            java.lang.String r1 = r1.f228594c
            r7 = 0
            r3[r7] = r1
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r9 = 1
            r3[r9] = r1
            r1 = 2132088122(0x7f15153a, float:1.9816519E38)
            java.lang.String r1 = r6.getString(r1, r3)
            goto L_0x0b70
        L_0x0b50:
            r7 = 0
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            r1[r7] = r3
            r3 = 2132088121(0x7f151539, float:1.9816517E38)
            java.lang.String r1 = r6.getString(r3, r1)
            goto L_0x0b70
        L_0x0b62:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.f285205a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r3 = "getMisactivationDisclosure: not showing for cloud served consent"
            r7 = 20624(0x5090, float:2.89E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r7)).mo56386p(r3)
        L_0x0b6f:
            r1 = 0
        L_0x0b70:
            r0.f285121i = r1
            boolean r1 = r2.mo92421b()
            if (r1 != 0) goto L_0x0bed
            boolean r1 = r4.mo92669c()
            if (r1 == 0) goto L_0x0b7f
            goto L_0x0bed
        L_0x0b7f:
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.af r1 = r1.mo70854b()
            com.google.android.apps.gsa.h.s.af r2 = com.google.android.apps.gsa.h.s.af.f
            if (r1 != r2) goto L_0x0bdf
            com.google.android.apps.gsa.h.s.ae r1 = r5.mo70887e()
            com.google.android.apps.gsa.h.s.r r1 = r1.mo70853a()
            boolean r1 = r1.mo70879c()
            if (r1 == 0) goto L_0x0bdf
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.f285205a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "getBatteryImpactDisclosure: showing"
            r3 = 20623(0x508f, float:2.8899E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.m169390b(r12, r13, r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r2 = r15.f283244a
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f284137d
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0bce
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r4 = 1
            r2[r4] = r1
            com.google.android.apps.gsa.opaonboarding.d.v r1 = r15.mo92328a()
            java.lang.String r1 = r1.f228594c
            r5 = 2
            r2[r5] = r1
            r1 = 2132088051(0x7f1514f3, float:1.9816375E38)
            java.lang.String r3 = r6.getString(r1, r2)
            goto L_0x0bfb
        L_0x0bce:
            r3 = 0
            r4 = 1
            r5 = 2
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r1
            r2[r4] = r1
            r1 = 2132088050(0x7f1514f2, float:1.9816373E38)
            java.lang.String r3 = r6.getString(r1, r2)
            goto L_0x0bfb
        L_0x0bdf:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.f285205a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "getBatteryImpactDisclosure: not showing"
            r3 = 20622(0x508e, float:2.8898E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0bfa
        L_0x0bed:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102214n.f285205a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "getBatteryImpactDisclosure: not showing for cloud served consent"
            r3 = 20621(0x508d, float:2.8896E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x0bfa:
            r3 = 0
        L_0x0bfb:
            r0.f285122j = r3
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.m r0 = r0.mo92948a()
            r1 = r26
            r1.f285242f = r0
            com.google.common.f.x r2 = r45.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4 = r44
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 20630(0x5096, float:2.8909E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "data = %s"
            r2.mo56389s(r3, r0)
            return
        L_0x0c20:
            r1 = r26
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null bottomSheetMessage"
            r0.<init>(r2)
            throw r0
        L_0x0c2a:
            r1 = r26
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null bottomSheetTitle"
            r0.<init>(r2)
            throw r0
        L_0x0c34:
            r1 = r26
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null legalPart3TextForUnicorn"
            r0.<init>(r2)
            throw r0
        L_0x0c3e:
            r1 = r26
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null legalText"
            r0.<init>(r2)
            throw r0
        L_0x0c48:
            r1 = r0
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null enrollmentConfig"
            r0.<init>(r2)
            goto L_0x0c52
        L_0x0c51:
            throw r0
        L_0x0c52:
            goto L_0x0c51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.C102226z.<init>(com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.u, com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.q, com.google.android.apps.gsa.h.s.u, com.google.android.apps.gsa.staticplugins.nga.ui.b.a, com.google.android.apps.gsa.staticplugins.hotwordenrollment.s, com.google.android.apps.gsa.speech.hotword.c.d, com.google.android.apps.gsa.shared.util.b, com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.a.i, dagger.a, com.google.android.libraries.gsa.k.g, com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.o, dagger.a, com.google.android.apps.gsa.search.core.i.t, com.google.apps.tiktok.concurrent.futuresmixin.e, com.google.protobuf.ba, com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.o, com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae, boolean, com.google.android.apps.gsa.assistant.settings.shared.o, com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a, com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.g, com.google.common.base.ax, com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b):void");
    }

    /* renamed from: k */
    private static final void m169411k(View view) {
        if (view != null) {
            C58976aa aaVar = C58975e.f156826a;
            C47393f.m84237h(new C101783w(), view);
            return;
        }
        C59104x c = f285236a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
        C0118a.m96d(c, "The view should not be null!", 20632, C58979ad.FULL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C84011f mo93009a(int i) {
        C84010e e = C84011f.m133882e();
        e.mo77375c(this.f285238b.getString(i));
        ((C83958a) e).f228734b = new C102220t(this);
        return e.mo77373a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C84011f mo93010b() {
        C84010e e = C84011f.m133882e();
        e.mo77375c(this.f285238b.getString(this.f285242f.mo92962b()));
        ((C83958a) e).f228734b = new C102221u(this);
        boolean z = true;
        if (!this.f285242f.mo92960G() && ((!this.f285242f.mo92976n() || this.f285242f.mo92957D()) && (!this.f285239c.mo70892k() || this.f285239c.mo70887e().mo70857f() || this.f285242f.mo92957D()))) {
            z = false;
            if (this.f285261y.mo79746e(C90062dn.f249201E) && this.f285239c.mo70887e().mo70857f()) {
                z = this.f285239c.mo70887e().mo70855c().mo70861c();
            }
        }
        e.mo77374b(z);
        return e.mo77373a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo93011c(View view) {
        if (this.f285239c.mo70886d().mo70847a().d() != 2 || this.f285237A) {
            if (this.f285242f.mo92980r()) {
                ((C92486a) this.f285257u.mo27525b()).mo87234h();
            }
            mo93013e(C89849ae.VOICE_MATCH_INTRO_AGREED);
            if (this.f285242f.mo92979q()) {
                C59104x b = f285236a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
                ((C59052c) ((C59052c) b).mo56372aa(20634)).mo56389s("#handleAcceptForGoogleHomeEnrollment. isOobe %b", Boolean.valueOf(this.f285242f.mo92977o()));
                if (!this.f285242f.mo92977o()) {
                    C92349f fVar = this.f285253q;
                    if (fVar != null) {
                        fVar.f257463k.mo77362c(3);
                    } else {
                        C102230s sVar = this.f285251o;
                        C102228q f = C102229r.m169429f();
                        f.mo92319b(3);
                        f.mo92320c(C84011f.f228856a);
                        f.mo92321d(C84011f.f228856a);
                        sVar.mo93025g(f.mo92318a());
                    }
                    C46439e eVar = this.f285250n;
                    C46438d a = C46438d.m82809a(this.f285258v.mo92398a(this.f285255s.f257559d));
                    eVar.mo50428h(a.f121541a, (Object) null, this.f285249m);
                    return;
                }
                m169411k(view);
                return;
            }
            m169411k(view);
            return;
        }
        View view2 = this.f285238b.getView();
        if (view2 instanceof GlifLayout) {
            ((GlifLayout) view2).mo49190m().pageScroll(130);
        }
    }

    /* renamed from: d */
    public final void mo93012d(View view) {
        if (this.f285242f.mo92980r()) {
            ((C92486a) this.f285257u.mo27525b()).mo87234h();
        }
        if (this.f285242f.mo92985v()) {
            this.f285256t.mo92664a(this.f285238b.getActivity(), new C102224x(this, view), this.f285238b.getChildFragmentManager());
        } else {
            this.f285256t.mo92664a(this.f285238b.getActivity(), new C102225y(this, view), this.f285238b.getChildFragmentManager());
        }
    }

    /* renamed from: e */
    public final void mo93013e(C89849ae aeVar) {
        ((C89859i) this.f285259w.mo27525b()).mo83702b(aeVar);
    }

    /* renamed from: f */
    public final void mo93014f() {
        C102230s sVar = this.f285251o;
        sVar.mo93023e();
        GlifLayout glifLayout = (GlifLayout) sVar.f285265a;
        if (!this.f285237A && !glifLayout.mo49190m().canScrollVertically(1)) {
            this.f285237A = true;
            mo93015g();
        }
    }

    /* renamed from: g */
    public final void mo93015g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f285237A = true;
        C102230s sVar = this.f285251o;
        C102228q f = C102229r.m169429f();
        f.mo92319b(2);
        f.mo92320c(mo93009a(this.f285242f.mo92961a()));
        f.mo92321d(mo93010b());
        sVar.mo93025g(f.mo92318a());
    }

    /* renamed from: h */
    public final void mo93016h(TextView textView) {
        textView.setText(this.f285242f.mo92971i());
        textView.setVisibility(0);
    }

    /* renamed from: i */
    public final void mo93017i(View view) {
        TextView textView;
        LinearLayout linearLayout;
        if (this.f285242f.mo92957D()) {
            textView = (TextView) view.findViewById(R.id.device_list_bottomsheet_text);
        } else {
            textView = (TextView) view.findViewById(R.id.device_list_text);
        }
        textView.setText(R.string.hotword_enrollment_google_home_tisid_enrollment_devices);
        textView.setVisibility(0);
        if (this.f285242f.mo92957D()) {
            linearLayout = (LinearLayout) view.findViewById(R.id.bottomsheet_device_list);
        } else {
            linearLayout = (LinearLayout) view.findViewById(R.id.device_list);
        }
        for (Map.Entry entry : this.f285262z.entrySet()) {
            C59104x b = f285236a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
            ((C59052c) ((C59052c) b).mo56372aa(20644)).mo56354G("populateDeviceList: deviceID = %s, icon = %s", entry.getKey(), entry.getValue());
            View inflate = this.f285238b.getActivity().getLayoutInflater().inflate(R.layout.hotword_enrollment_upgrade_device_row, linearLayout, false);
            ((TextView) inflate.findViewById(R.id.deviceName)).setText((String) entry.getKey());
            ((ImageView) inflate.findViewById(R.id.deviceIcon)).setImageResource(((Integer) entry.getValue()).intValue());
            linearLayout.addView(inflate);
        }
        linearLayout.setVisibility(0);
    }

    /* renamed from: j */
    public final void mo93018j(Intent intent) {
        C102207g gVar = new C102207g();
        C68324h.m98669f(gVar);
        C47243l.m84040b(gVar, "NORMAL_USER");
        gVar.getArguments().putBundle("ERROR_RESULT_CONTAINER", intent.getExtras());
        mo93013e(C89849ae.VOICE_MATCH_FA_GENERAL_ERROR_DIALOG_SHOWN);
        gVar.showNow(this.f285238b.getChildFragmentManager(), "LINKING_FAILURE_DIALOG_FRAGMENT_TAG");
    }
}
