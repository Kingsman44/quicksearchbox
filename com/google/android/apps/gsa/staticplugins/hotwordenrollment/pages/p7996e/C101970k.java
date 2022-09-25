package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.constraint.C0129a;
import android.support.p031v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.core.content.C1882h;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92379c;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101502c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101633w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101634x;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a.C101883i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i.C102113o;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39482cx;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39483cy;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39484cz;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39611c;
import com.google.android.setupdesign.p3558f.C45307a;
import com.google.android.setupdesign.p3558f.C45315i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.k */
/* compiled from: PG */
public final class C101970k extends C101936aj implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101933ag f284534a;

    /* renamed from: b */
    private Context f284535b;

    /* renamed from: c */
    private final C2393x f284536c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284537d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284538e;

    @Deprecated
    public C101970k() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    static C101970k m168758b(C101781u uVar) {
        C101970k kVar = new C101970k();
        C68324h.m98669f(kVar);
        C47243l.m84039a(kVar, uVar);
        return kVar;
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101933ag d = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), d.f284357h);
    }

    /* renamed from: d */
    public final C101933ag mo17754z() {
        C101933ag agVar = this.f284534a;
        if (agVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284538e) {
            return agVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284535b == null) {
            this.f284535b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284535b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* synthetic */ C68324h mo92718f() {
        return new C47243l(this);
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284537d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284536c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284537d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284537d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284537d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284537d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012a A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c A[Catch:{ all -> 0x0135 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f284537d
            r0.mo51381i()
            super.onCreate(r9)     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ag r0 = r8.mo17754z()     // Catch:{ all -> 0x0135 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0135 }
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L_0x001c
            java.lang.String r3 = "key_hotword_enrollment_done"
            boolean r9 = r9.getBoolean(r3)     // Catch:{ all -> 0x0135 }
            if (r9 == 0) goto L_0x001c
            r9 = 1
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            r0.f284345O = r9     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.m.b.f r9 = r0.f284363n     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = r0.f284336F     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r9 = r9.mo83841D(r3)     // Catch:{ all -> 0x0135 }
            r0.f284346P = r9     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r9 = r0.f284375z     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.opaonboarding.d.v r9 = r9.mo92328a()     // Catch:{ all -> 0x0135 }
            boolean r9 = r9.f228593b     // Catch:{ all -> 0x0135 }
            r0.f284353d = r9     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = r0.f284336F     // Catch:{ all -> 0x0135 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = "FreshEnrollScreenFrag"
            r4 = 2
            if (r9 == 0) goto L_0x006b
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101933ag.f284328a     // Catch:{ all -> 0x0135 }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ all -> 0x0135 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0135 }
            r9.mo56378ag(r1, r3)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = "Account is empty!"
            r2 = 20462(0x4fee, float:2.8673E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.e r9 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.e     // Catch:{ all -> 0x0135 }
            r9.<init>()     // Catch:{ all -> 0x0135 }
            r9.mo92562b(r4)     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.e r1 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e.NO_ACCOUNT_LOGGED_IN     // Catch:{ all -> 0x0135 }
            android.content.Intent r1 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.m151739a(r1)     // Catch:{ all -> 0x0135 }
            r9.f283865a = r1     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.s r9 = r9.mo92561a()     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.k r0 = r0.f284357h     // Catch:{ all -> 0x0135 }
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84236g(r9, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x012f
        L_0x006b:
            com.google.android.apps.gsa.h.s.u r9 = r0.f284362m     // Catch:{ all -> 0x0135 }
            boolean r9 = r9.mo70891j()     // Catch:{ all -> 0x0135 }
            if (r9 == 0) goto L_0x0083
            com.google.android.apps.gsa.shared.m.c r9 = r0.f284366q     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.util.b r5 = r0.f284369t     // Catch:{ all -> 0x0135 }
            boolean r5 = r5.mo85090c()     // Catch:{ all -> 0x0135 }
            boolean r9 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.m151744f(r9, r5)     // Catch:{ all -> 0x0135 }
            if (r9 == 0) goto L_0x0083
            r9 = 1
            goto L_0x0084
        L_0x0083:
            r9 = 0
        L_0x0084:
            r0.f284355f = r9     // Catch:{ all -> 0x0135 }
            if (r9 != 0) goto L_0x009b
            com.google.android.apps.gsa.h.s.u r9 = r0.f284362m     // Catch:{ all -> 0x0135 }
            boolean r9 = r9.mo70891j()     // Catch:{ all -> 0x0135 }
            if (r9 != 0) goto L_0x0099
            com.google.android.apps.gsa.shared.m.b.f r9 = r0.f284363n     // Catch:{ all -> 0x0135 }
            boolean r9 = r9.mo83851N()     // Catch:{ all -> 0x0135 }
            if (r9 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r9 = 0
            goto L_0x009c
        L_0x009b:
            r9 = 1
        L_0x009c:
            r0.f284356g = r9     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r9 = r0.f284358i     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.af r5 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a.C101511af.UPLOAD_UTTERANCES_FAILED     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r5 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.UNKNOWN     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.h.s.s r5 = com.google.android.apps.gsa.h.s.s.a     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.h.s.u r5 = r0.f284362m     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.h.s.s r5 = r5.mo70884b()     // Catch:{ all -> 0x0135 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x00d7
            if (r5 == r1) goto L_0x00b7
            if (r5 == r4) goto L_0x00b7
            goto L_0x00db
        L_0x00b7:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f284368s     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249925ao     // Catch:{ all -> 0x0135 }
            boolean r1 = r1.mo79746e(r5)     // Catch:{ all -> 0x0135 }
            if (r1 == 0) goto L_0x00d2
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r1 = r0.f284375z     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.speech.hotword.c.d r1 = r1.f283245b     // Catch:{ all -> 0x0135 }
            com.google.common.base.ax r1 = r1.mo87020a()     // Catch:{ all -> 0x0135 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x0135 }
            if (r1 != 0) goto L_0x00d2
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.g r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101966g.SODA     // Catch:{ all -> 0x0135 }
            goto L_0x00d4
        L_0x00d2:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.g r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101966g.DEFAULT     // Catch:{ all -> 0x0135 }
        L_0x00d4:
            r0.f284344N = r1     // Catch:{ all -> 0x0135 }
            goto L_0x00db
        L_0x00d7:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.g r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101966g.SODA     // Catch:{ all -> 0x0135 }
            r0.f284344N = r1     // Catch:{ all -> 0x0135 }
        L_0x00db:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.x r1 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.x     // Catch:{ all -> 0x0135 }
            r1.<init>(r0)     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.h r5 = r0.f284372w     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.g r6 = r0.f284344N     // Catch:{ all -> 0x0135 }
            boolean r7 = r0.f284355f     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.aq r9 = r5.mo92746a(r6, r1, r9, r7)     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.m148680c()     // Catch:{ all -> 0x0135 }
            r9.mo92729f()     // Catch:{ all -> 0x0133 }
            r0.f284337G = r9     // Catch:{ all -> 0x0135 }
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101933ag.f284328a     // Catch:{ all -> 0x0135 }
            com.google.common.f.x r9 = r9.mo56224b()     // Catch:{ all -> 0x0135 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0135 }
            r9.mo56378ag(r1, r3)     // Catch:{ all -> 0x0135 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x0135 }
            r1 = 20461(0x4fed, float:2.8672E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r1)     // Catch:{ all -> 0x0135 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = "isTisidEnrollment: %b, detectorType: %s"
            boolean r3 = r0.f284356g     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.g r5 = r0.f284344N     // Catch:{ all -> 0x0135 }
            r9.mo56357J(r1, r3, r5)     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.util.b r9 = r0.f284369t     // Catch:{ all -> 0x0135 }
            boolean r9 = r9.mo85090c()     // Catch:{ all -> 0x0135 }
            r1 = -1
            if (r9 == 0) goto L_0x011e
            r0.f284354e = r1     // Catch:{ all -> 0x0135 }
            goto L_0x0120
        L_0x011e:
            r0.f284354e = r2     // Catch:{ all -> 0x0135 }
        L_0x0120:
            r0.f284342L = r1     // Catch:{ all -> 0x0135 }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r9 = r0.f284335E     // Catch:{ all -> 0x0135 }
            int r9 = r9.ordinal()     // Catch:{ all -> 0x0135 }
            if (r9 == r4) goto L_0x012c
            r9 = 3
            goto L_0x012d
        L_0x012c:
            r9 = 4
        L_0x012d:
            r0.f284338H = r9     // Catch:{ all -> 0x0135 }
        L_0x012f:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x0133:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r9 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x013a }
            goto L_0x013e
        L_0x013a:
            r0 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101969j.m168757a(r9, r0)
        L_0x013e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101970k.onCreate(android.os.Bundle):void");
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284537d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        String str;
        Bundle bundle2 = bundle;
        this.f284537d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101933ag d = mo17754z();
            d.f284339I = new C101965f(d.f284361l, d.f284357h, d.f284369t, (C89859i) d.f284374y.mo27525b(), d.f284334D, C47810es.m84977q(new C101978s(d)), d.f284362m, d.f284363n, d.f284368s);
            View inflate = layoutInflater.inflate(R.layout.hotword_enrollment_enroll_layout, viewGroup, false);
            d.f284341K = d.f284334D.mo93020b(layoutInflater, R.layout.hotword_enrollment_enroll_screen_opa_page_layout, R.layout.hotword_enrollment_enroll_screen_glif_layout, R.layout.hotword_enrollment_enroll_screen_glif_layout_no_partner_theme, (ViewGroup) inflate.findViewById(R.id.fresh_enroll), R.id.opa_page_layout, R.id.fresh_enroll_glif);
            d.f284334D.mo93025g(d.mo92698a(C84011f.f228856a));
            if (d.mo92715s()) {
                String b = C5114a.m13988b(Locale.getDefault(), d.f284357h.getString(R.string.hotword_enrollment_unicorn_enroll_title_unbundled), "GENDER", d.f284375z.mo92330c(), "PERSON", d.f284375z.mo92329b());
                C102230s sVar = d.f284334D;
                C102231t e = C102232u.m169449e();
                ((C101502c) e).f283252a = b;
                sVar.mo93026h(e.mo92349a());
            }
            d.f284343M = (ViewFlipper) d.f284341K.findViewById(R.id.hotword_enrollment_enroll_hotword_list);
            ViewFlipper viewFlipper = d.f284343M;
            LinearLayout linearLayout = new LinearLayout(d.f284367r);
            TextView textView = (TextView) d.f284357h.getActivity().getLayoutInflater().inflate(R.layout.hotword_enrollment_enroll_start, linearLayout).findViewById(R.id.hotword_enrollment_enroll_intro);
            textView.setVisibility(0);
            if (d.mo92714r()) {
                C101970k kVar = d.f284357h;
                str = kVar.getString(R.string.hotword_enrollment_enroll_text_opa_tisid_talkback_assistant_device, kVar.getString(R.string.hotword_enrollment_enroll_tisid_talkback_next));
            } else if (d.f284335E == C90584f.OK_HEY_GOOGLE) {
                C101970k kVar2 = d.f284357h;
                Object[] objArr = new Object[1];
                String b2 = C92486a.m152115b(C90584f.OK_HEY_GOOGLE, d.f284331A.mo92638c());
                objArr[0] = b2 != null ? b2.replaceAll("/", "\n") : "Ok Google";
                str = kVar2.getString(R.string.hotword_enrollment_enroll_text_opa_talkback_assistant_device, objArr);
            } else {
                C101970k kVar3 = d.f284357h;
                int a = C92379c.m151713a(d.f284358i.f257603b);
                int i = R.string.hotword_enrollment_enroll_text_non_opa_talkback;
                if (a != 0 && a == 3) {
                    i = R.string.hotword_enrollment_enroll_text_opa_talkback;
                }
                str = kVar3.getString(i, kVar3.getString(R.string.hotword_enrollment_enroll_start).toUpperCase(Locale.getDefault()), d.f284370u.mo87230d());
            }
            textView.setText(str);
            Button button = (Button) linearLayout.findViewById(R.id.start_button);
            if (d.mo92714r()) {
                button.setText(R.string.hotword_enrollment_enroll_tisid_talkback_next);
            }
            if (d.f284362m.mo70886d().mo70847a().d() == 2) {
                button.setVisibility(8);
                linearLayout.findViewById(R.id.start_button_frame_layout).setBackgroundColor(0);
                button = (Button) linearLayout.findViewById(R.id.suw_start_button);
                button.setVisibility(0);
                if (C45315i.m80769d(d.f284357h.getActivity())) {
                    C45307a.m80755a(d.f284357h.getActivity(), button);
                }
            }
            if (d.mo92714r()) {
                button.setText(R.string.hotword_enrollment_enroll_tisid_talkback_next);
            }
            button.setAllCaps(false);
            button.setOnClickListener(new C101985z(d));
            viewFlipper.addView(linearLayout);
            ViewFlipper viewFlipper2 = d.f284343M;
            C101965f fVar = d.f284339I;
            View inflate2 = fVar.f284520c.getActivity().getLayoutInflater().inflate(R.layout.hotword_enrollment_enroll_hotword_record_circle_layout, (ViewGroup) null);
            if (fVar.mo92745e()) {
                inflate2.findViewById(R.id.hotword_enrollment_query).setVisibility(8);
            }
            View findViewById = inflate2.findViewById(R.id.hotword_animation_container);
            C0129a aVar = (C0129a) findViewById.getLayoutParams();
            if (aVar != null) {
                Resources resources = fVar.f284520c.getResources();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.hotword_animation_container_bottom_margin_multiplier, typedValue, true);
                int i2 = (int) (typedValue.getFloat() * ((float) (resources.getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(R.dimen.hotword_animation_container_size))));
                if (i2 < 0) {
                    i2 = resources.getDimensionPixelSize(R.dimen.hotword_animation_container_default_bottom_margin);
                }
                aVar.setMargins(0, 0, 0, i2);
                findViewById.setLayoutParams(aVar);
            }
            viewFlipper2.addView(inflate2);
            if (d.mo92715s()) {
                ViewFlipper viewFlipper3 = d.f284343M;
                View inflate3 = d.f284357h.getActivity().getLayoutInflater().inflate(R.layout.hotword_enrollment_passover_layout, new LinearLayout(d.f284367r));
                boolean j = d.f284362m.mo70891j();
                int i3 = R.string.hotword_enrollment_unicorn_enroll_parent_passover_text_retrain;
                if (!j || d.f284362m.mo70885c().mo70898b() != z.b) {
                    if (d.f284362m.mo70893l() || !d.f284362m.mo70887e().mo70858g()) {
                        i3 = R.string.hotword_enrollment_unicorn_enroll_parent_passover_text;
                    }
                }
                ((TextView) inflate3.findViewById(R.id.editText)).setText(C5114a.m13988b(Locale.getDefault(), d.f284357h.getString(i3), "GENDER", d.f284375z.mo92330c(), "PERSON", d.f284375z.mo92329b()));
                LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate3.findViewById(R.id.enrollment_passover_animation_view);
                lottieAnimationView.setVisibility(0);
                View findViewById2 = inflate3.findViewById(R.id.enrollment_passover_animation_container);
                C83973o a2 = C83974p.m133833a(findViewById2, lottieAnimationView, new C102113o(d.f284357h.getContext(), d.f284340J));
                if (d.f284340J) {
                    findViewById2.setForceDarkAllowed(false);
                }
                a2.mo77402c();
                a2.mo77403d();
                d.f284347Q = a2;
                lottieAnimationView.requestLayout();
                viewFlipper3.addView(inflate3);
            }
            if (d.f284369t.mo85090c()) {
                if (d.mo92715s()) {
                    String string = d.f284357h.getString(R.string.hotword_enrollment_unicorn_enroll_title_unbundled);
                    C102230s sVar2 = d.f284334D;
                    C102231t e2 = C102232u.m169449e();
                    ((C101502c) e2).f283252a = C5114a.m13988b(Locale.getDefault(), string, "GENDER", d.f284375z.mo92330c(), "PERSON", d.f284375z.mo92329b());
                    sVar2.mo93026h(e2.mo92349a());
                } else {
                    int a3 = C92379c.m151713a(d.f284358i.f257603b);
                    if (a3 != 0) {
                        if (a3 == 3) {
                            C102230s sVar3 = d.f284334D;
                            C102231t e3 = C102232u.m169449e();
                            e3.mo92352d(d.f284357h.getString(R.string.hotword_enrollment_enroll_header_title_opa));
                            sVar3.mo93026h(e3.mo92349a());
                        }
                    }
                    C102230s sVar4 = d.f284334D;
                    C102231t e4 = C102232u.m169449e();
                    e4.mo92352d(d.f284357h.getString(R.string.hotword_enrollment_enroll_header_title_non_opa));
                    sVar4.mo93026h(e4.mo92349a());
                }
                TextView d2 = d.f284334D.mo93022d();
                if (!d.mo92714r()) {
                    C90743b.m148214a(d2, 500);
                } else {
                    Button button2 = (Button) d.f284341K.findViewById(R.id.start_recording_button);
                    if (d.f284362m.mo70886d().mo70847a().d() == 2) {
                        d.f284341K.findViewById(R.id.start_recording_button_frame_layout).setBackgroundColor(0);
                        button2.setTextAppearance(d.f284367r, R.style.HotwordEnrollmentEnrollGlifButton);
                        button2.setBackgroundResource(R.drawable.suw_primary_button_bg);
                        if (C45315i.m80769d(d.f284357h.getActivity())) {
                            C45307a.m80755a(d.f284357h.getActivity(), button2);
                        }
                    }
                    button2.setVisibility(0);
                    button2.setOnClickListener(new C101973n(d));
                    d.f284339I.mo92741a(d.f284341K);
                }
            }
            if (bundle2 != null) {
                d.f284354e = bundle2.getInt("key_hotword_count");
                d.f284342L = bundle2.getInt("key_current_view_id");
                C58976aa aaVar = C58975e.f156826a;
            }
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.VOICE_MATCH_HOTWORD_CIRCLE_ENROLLMENT_START;
            fVar2.f246203c = d.mo92699c();
            ((C89859i) d.f284374y.mo27525b()).mo74236a(fVar2.mo83699a());
            d.mo92712p();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C101969j.m168757a(th, th2);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284537d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284537d.mo51375c();
        try {
            super.onDestroyView();
            C101933ag d = mo17754z();
            C83975q qVar = d.f284347Q;
            if (qVar != null) {
                qVar.mo77406g();
            }
            d.f284347Q = null;
            c.close();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284537d.mo51376d();
        try {
            super.onDetach();
            this.f284538e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284537d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284537d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284537d.mo51381i();
        try {
            super.onPause();
            C101933ag d = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (d.f284332B.mo56113h()) {
                C39484cz czVar = (C39484cz) d.f284332B.mo56107c();
                czVar.f103997b.mo51512b(new C39482cx(czVar), czVar.f103998c);
            }
            if (d.f284363n.mo83817f()) {
                d.f284337G.mo92734k(true, EventForDump.m147676e(8, "EnrollScreen#onPause"));
            }
            d.f284362m.mo70891j();
            if (!d.f284362m.mo70891j() && !d.f284362m.mo70887e().mo70853a().mo70880d() && d.f284346P != null && !d.f284336F.isEmpty() && !d.f284345O) {
                C59104x b = C101933ag.f284328a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
                ((C59052c) ((C59052c) b).mo56372aa(20467)).mo56386p("Restoring old speaker model");
                C89994f fVar = d.f284363n;
                SpeakerIdModel speakerIdModel = d.f284346P;
                speakerIdModel.getClass();
                fVar.mo83845H(speakerIdModel, true, EventForDump.m147676e(8, "Restoring old speaker model"));
                d.mo92707k();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C101933ag d = mo17754z();
        if (i != 2108) {
            return;
        }
        if (strArr.length <= 0 || !strArr[0].equals("android.permission.RECORD_AUDIO") || iArr.length <= 0 || iArr[0] != 0) {
            if (d.f284357h.getActivity() != null) {
                new AlertDialog.Builder(d.f284357h.getActivity()).setMessage(R.string.hotword_enrollment_no_audio_permission_message).setPositiveButton(R.string.hotword_enrollment_no_audio_permission_settings_button, new C101976q(d)).setNegativeButton(R.string.hotword_enrollment_voice_match_no_thanks, new C101977r(d)).create().show();
            }
            C59104x b = C101933ag.f284328a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            ((C59052c) ((C59052c) b).mo56372aa(20468)).mo56386p("Permission request not successfully.");
            return;
        }
        C59104x b2 = C101933ag.f284328a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b2).mo56372aa(20469)).mo56386p("Permission request successfully.");
        d.mo92700d();
        if (!d.mo92714r()) {
            d.mo92711o();
        }
    }

    public final void onResume() {
        C47573bx e = this.f284537d.mo51377e();
        try {
            super.onResume();
            C101933ag d = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            d.f284337G.mo92734k(false, EventForDump.m147676e(8, "EnrollScreen#onResume"));
            if (d.f284332B.mo56113h()) {
                C39484cz czVar = (C39484cz) d.f284332B.mo56107c();
                czVar.f103997b.mo51512b(new C39483cy(czVar), czVar.f103998c);
            }
            e.close();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284537d.mo51381i();
        try {
            C101933ag d = mo17754z();
            d.f284337G.mo92730g(bundle);
            bundle.putInt("key_hotword_count", d.f284354e);
            bundle.putInt("key_current_view_id", d.f284342L);
            if (d.f284345O) {
                bundle.putBoolean("key_hotword_enrollment_done", true);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f284537d.mo51381i();
        try {
            super.onStart();
            C101933ag d = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (C1882h.m5137c(d.f284367r, "android.permission.RECORD_AUDIO") != 0) {
                C59104x b = C101933ag.f284328a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
                ((C59052c) ((C59052c) b).mo56372aa(20473)).mo56386p("Requesting mic permissions.");
                d.f284357h.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 2108);
            } else {
                d.mo92700d();
                if (!d.mo92714r()) {
                    d.mo92711o();
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284537d.mo51381i();
        try {
            super.onStop();
            mo17754z().mo92706j();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101969j.m168757a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284537d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284537d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284537d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284537d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f284537d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284537d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284537d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r24v1, types: [com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.j, java.lang.Object] */
    public final void onAttach(Context context) {
        C101970k kVar;
        this.f284537d.mo51381i();
        try {
            if (!this.f284538e) {
                super.onAttach(context);
                if (this.f284534a == null) {
                    try {
                        Object jN = mo92719j().mo17653jN();
                        Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                        if (fragment instanceof C101970k) {
                            C101970k kVar2 = (C101970k) fragment;
                            C68225k.m98532d(kVar2);
                            C101781u w = ((C74178nm) jN).mo70081w();
                            C74555u uVar = (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b();
                            C90932cb cbVar = (C90932cb) ((C74178nm) jN).f207130a.a.f203444q.mo17428b();
                            C22871g gVar = (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b();
                            C89994f fVar = (C89994f) ((C74178nm) jN).f207130a.a.f202651bB.mo17428b();
                            C68214a a = C68219e.m98518a(((C74178nm) jN).f207130a.a.f203018hy);
                            C118561t tVar = (C118561t) ((C74178nm) jN).f207130a.a.f202112E.mo17428b();
                            C90021c cVar = (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                            Context context2 = (Context) ((C74178nm) jN).f207130a.g.mo17428b();
                            C68214a a2 = C68219e.m98518a(((C74178nm) jN).f207112I);
                            C86124t tVar2 = (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                            C90743b bVar = (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b();
                            C92486a aVar = (C92486a) ((C74178nm) jN).f207130a.a.f202803dv.mo17428b();
                            C101883i y = ((C74178nm) jN).mo70083y();
                            C101633w wVar = (C101633w) ((C74178nm) jN).f207136c.f205627cW.mo17428b();
                            C101634x xVar = (C101634x) ((C74178nm) jN).f207136c.f205626cV.mo17428b();
                            C73964bv bvVar = ((C74178nm) jN).f207136c;
                            C69464a aVar2 = bvVar.f205594bq;
                            C69464a aVar3 = bvVar.f205657d.f205818a;
                            Context context3 = context2;
                            aqy aqy = bvVar.f205604c;
                            C90021c cVar2 = cVar;
                            aso aso = aqy.d;
                            C118561t tVar3 = tVar;
                            C69464a aVar4 = aso.f201703eC;
                            C69464a aVar5 = aso.f201702eB;
                            C68214a aVar6 = a;
                            C69464a aVar7 = bvVar.f205628cX;
                            C89994f fVar2 = fVar;
                            asp asp = aqy.a;
                            C22871g gVar2 = gVar;
                            C69464a aVar8 = asp.f203017hx;
                            C90932cb cbVar2 = cbVar;
                            C69464a aVar9 = asp.f202651bB;
                            C74555u uVar2 = uVar;
                            C69464a aVar10 = aqy.g;
                            C101781u uVar3 = w;
                            C69464a aVar11 = aqy.aT;
                            C101970k kVar3 = kVar2;
                            C69464a aVar12 = aqy.aU;
                            Object obj = jN;
                            C69464a aVar13 = aqy.aW;
                            C69464a aVar14 = aqy.b.f200222fX;
                            C69464a aVar15 = asp.f202634al;
                            C69464a aVar16 = asp.f202006C;
                            C69464a aVar17 = asp.f202798dq;
                            C69464a aVar18 = aqy.aC;
                            C69464a a3 = C68226l.m98533a(asp.f202801dt);
                            aqy aqy2 = bvVar.f205604c;
                            C69464a aVar19 = aVar18;
                            asp asp2 = aqy2.a;
                            C69464a aVar20 = aVar17;
                            C69464a aVar21 = asp2.f202324I;
                            C69464a aVar22 = aqy2.i;
                            C101960bg bgVar = new C101960bg(aVar2, aVar3, aVar4, aVar5, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar20, aVar19, a3, aVar21, aVar22, aqy2.b.f200466kC, asp2.f202586Q, bvVar.f205609cE, bvVar.f205595br);
                            C69464a aVar23 = bvVar.f205594bq;
                            aqy aqy3 = bvVar.f205604c;
                            aso aso2 = aqy3.d;
                            C69464a aVar24 = aso2.f201702eB;
                            C69464a aVar25 = aso2.f201703eC;
                            C69464a aVar26 = aqy3.a.f202634al;
                            C69464a a4 = C68226l.m98533a(aqy3.b.f200055cP);
                            aqy aqy4 = bvVar.f205604c;
                            asp asp3 = aqy4.a;
                            C101968i iVar = new C101968i(bgVar, new C101944ar(aVar23, aVar24, aVar25, aVar26, a4, asp3.f203444q, asp3.f202803dv, bvVar.f205628cX, aqy4.aU, bvVar.f205657d.f205818a, asp3.f202651bB, bvVar.f205609cE, bvVar.f205595br, asp3.f202006C));
                            boolean ed = ((C74178nm) obj).f207136c.mo69302ed();
                            aso aso3 = ((C74178nm) obj).f207130a.d;
                            kVar = this;
                            kVar.f284534a = new C101933ag(kVar3, uVar3, uVar2, cbVar2, gVar2, fVar2, aVar6, tVar3, cVar2, context3, a2, tVar2, bVar, aVar, y, wVar, xVar, iVar, ((C74178nm) obj).f207136c.mo69208cb(), C68219e.m98518a(((C74178nm) obj).f207130a.a.f202586Q), (C101497ae) ((C74178nm) obj).f207109F.mo17428b(), ed, C58833ax.m90834k(new C39484cz((Executor) aso3.f201488a.n.mo17428b(), (C39611c) aso3.f201488a.a.f202971hD.mo17428b())), (C101860a) ((C74178nm) obj).f207135b.f205818a.mo17428b(), ((C74178nm) obj).f207136c.mo69070W(), ((C74178nm) obj).mo70079u(), (C90584f) ((C74178nm) obj).f207136c.f205609cE.mo17428b(), (String) ((C74178nm) obj).f207136c.f205595br.mo17428b());
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(kVar.f284537d, kVar.f284536c));
                        } else {
                            String obj2 = C101933ag.class.toString();
                            String valueOf = String.valueOf(fragment.getClass());
                            throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj2 + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        C47831fm.m85019n();
                        throw th2;
                    }
                } else {
                    kVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = kVar.f284537d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            C47831fm.m85019n();
            throw th22;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
