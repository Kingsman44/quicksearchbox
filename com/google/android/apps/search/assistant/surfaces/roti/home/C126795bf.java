package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119473g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protos.p5124m.p5125a.C65599b;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bf */
/* compiled from: PG */
public final class C126795bf extends C126841cu implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126804bo f349173a;

    /* renamed from: c */
    private Context f349174c;

    /* renamed from: d */
    private final C2393x f349175d = new C2393x(this);

    /* renamed from: e */
    private boolean f349176e;

    @Deprecated
    public C126795bf() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C126804bo mo17754z() {
        C126804bo boVar = this.f349173a;
        if (boVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349176e) {
            return boVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo107792b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f349174c == null) {
            this.f349174c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f349174c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f349175d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C126804bo a = mo17754z();
            C37215b bVar = a.f349220h;
            C126797bh bhVar = a.f349222j;
            int i = bhVar.f349181c;
            C63042fg fgVar = bhVar.f349185g;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C126838cr.m207502a(bVar, i, fgVar, a.f349222j.f349182d);
            a.f349218f.mo50429i(a.f349237y);
            a.f349218f.mo50429i(a.f349236x);
            a.f349215c.mo50828h(R.id.assistant_assistant_state_subscription_id, a.f349214b.mo107780a(), a.f349238z);
            a.f349215c.mo50828h(R.id.assistant_audio_level_subscription_id, a.f349214b.mo107781b(), a.f349197A);
            a.f349215c.mo50828h(R.id.assistant_transcription_subscription_id, a.f349214b.mo107783d(), a.f349198B);
            a.f349215c.mo50828h(R.id.assistant_activity_connection_subscription_id, a.f349214b.mo107782c(), a.f349199C);
            a.f349216d.requireActivity().f2707h.mo3339b(a.f349216d, a.f349205I);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z().f349220h.mo19974a(C37176a.f96807E);
            View inflate = layoutInflater.inflate(R.layout.assistant_roti_home_fragment, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f349176e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C126804bo a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.mo107806l();
            a.f349217e.mo107774d();
            MediaPlayer mediaPlayer = a.f349204H;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C126804bo a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.mo107801g();
            e.close();
            return;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C126804bo a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.mo107806l();
            a.mo107798d();
            if (a.f349206J == 1) {
                C126838cr.m207506e(a.f349220h, a.f349207K);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126794be.m207428a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x016a A[Catch:{ all -> 0x01a8, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016c A[Catch:{ all -> 0x01a8, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017b A[Catch:{ all -> 0x01a8, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017c A[Catch:{ all -> 0x01a8, all -> 0x01ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            com.google.apps.tiktok.tracing.ab r0 = r11.f122869b
            r0.mo51381i()
            android.content.Context r0 = r11.getContext()     // Catch:{ all -> 0x01a8 }
            com.google.apps.tiktok.l.c.m r0 = com.google.apps.tiktok.p3674l.p3679c.C47389c.m84226a(r0)     // Catch:{ all -> 0x01a8 }
            r0.f123128b = r12     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bo r1 = r11.mo17754z()     // Catch:{ all -> 0x01a8 }
            android.view.View r2 = r0.f123128b     // Catch:{ all -> 0x01a8 }
            r3 = 2131429087(0x7f0b06df, float:1.8479837E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bv r4 = new com.google.android.apps.search.assistant.surfaces.roti.home.bv     // Catch:{ all -> 0x01a8 }
            r4.<init>(r1)     // Catch:{ all -> 0x01a8 }
            r0.mo51254d(r2, r4)     // Catch:{ all -> 0x01a8 }
            android.view.View r2 = r0.f123128b     // Catch:{ all -> 0x01a8 }
            r4 = 2131428786(0x7f0b05b2, float:1.8479226E38)
            android.view.View r2 = r2.findViewById(r4)     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bw r5 = new com.google.android.apps.search.assistant.surfaces.roti.home.bw     // Catch:{ all -> 0x01a8 }
            r5.<init>(r1)     // Catch:{ all -> 0x01a8 }
            r0.mo51254d(r2, r5)     // Catch:{ all -> 0x01a8 }
            android.view.View r2 = r0.f123128b     // Catch:{ all -> 0x01a8 }
            r5 = 2131428816(0x7f0b05d0, float:1.8479287E38)
            android.view.View r2 = r2.findViewById(r5)     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bx r6 = new com.google.android.apps.search.assistant.surfaces.roti.home.bx     // Catch:{ all -> 0x01a8 }
            r6.<init>(r1)     // Catch:{ all -> 0x01a8 }
            r0.mo51254d(r2, r6)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.at.c.ar r0 = r11.f54442o     // Catch:{ all -> 0x01a8 }
            r0.mo24720k(r13)     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bo r13 = r11.mo17754z()     // Catch:{ all -> 0x01a8 }
            com.google.protos.m.a.b r0 = r13.f349231s     // Catch:{ all -> 0x01a8 }
            com.google.protobuf.ch r0 = r0.f178301a     // Catch:{ all -> 0x01a8 }
            int r1 = r13.f349235w     // Catch:{ all -> 0x01a8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01a8 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x01a8 }
            r1 = 2131428821(0x7f0b05d5, float:1.8479297E38)
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r13.f349232t     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x0068
            goto L_0x00fe
        L_0x0068:
            com.google.protos.m.a.b r0 = r13.f349233u     // Catch:{ all -> 0x01a8 }
            com.google.protobuf.ch r0 = r0.f178301a     // Catch:{ all -> 0x01a8 }
            int r2 = r13.f349235w     // Catch:{ all -> 0x01a8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01a8 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x01a8 }
            r2 = 2
            if (r0 != 0) goto L_0x0097
            boolean r0 = r13.f349234v     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x007e
            goto L_0x0097
        L_0x007e:
            android.content.Context r0 = r13.f349221i     // Catch:{ all -> 0x01a8 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x01a8 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x01a8 }
            int r0 = r0.orientation     // Catch:{ all -> 0x01a8 }
            if (r0 == r2) goto L_0x0101
            r0 = 2131428822(0x7f0b05d6, float:1.84793E38)
            android.view.View r0 = r12.findViewById(r0)     // Catch:{ all -> 0x01a8 }
            r13.mo107797c(r0)     // Catch:{ all -> 0x01a8 }
            goto L_0x0101
        L_0x0097:
            r13.mo107796b(r12)     // Catch:{ all -> 0x01a8 }
            android.content.Context r0 = r13.f349221i     // Catch:{ all -> 0x01a8 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x01a8 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x01a8 }
            int r0 = r0.orientation     // Catch:{ all -> 0x01a8 }
            if (r0 == r2) goto L_0x0101
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01a8 }
            r0.<init>()     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bf r2 = r13.f349216d     // Catch:{ all -> 0x01a8 }
            android.support.v4.app.am r2 = r2.getActivity()     // Catch:{ all -> 0x01a8 }
            android.view.WindowManager r2 = r2.getWindowManager()     // Catch:{ all -> 0x01a8 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ all -> 0x01a8 }
            r2.getMetrics(r0)     // Catch:{ all -> 0x01a8 }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x01a8 }
            double r6 = (double) r0
            r8 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
            int r0 = (int) r6
            r2 = 1126957056(0x432c0000, float:172.0)
            float r2 = r13.mo107795a(r2)     // Catch:{ all -> 0x01a8 }
            int r2 = (int) r2     // Catch:{ all -> 0x01a8 }
            int r0 = r0 - r2
            android.view.View r2 = r12.findViewById(r1)     // Catch:{ all -> 0x01a8 }
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()     // Catch:{ all -> 0x01a8 }
            double r7 = (double) r0
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            int r7 = (int) r7
            r6.height = r7     // Catch:{ all -> 0x01a8 }
            r2.setLayoutParams(r6)     // Catch:{ all -> 0x01a8 }
            int r2 = r6.height     // Catch:{ all -> 0x01a8 }
            int r0 = r0 - r2
            r2 = 2131429085(0x7f0b06dd, float:1.8479833E38)
            android.view.View r2 = r12.findViewById(r2)     // Catch:{ all -> 0x01a8 }
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()     // Catch:{ all -> 0x01a8 }
            r6.height = r0     // Catch:{ all -> 0x01a8 }
            r2.setLayoutParams(r6)     // Catch:{ all -> 0x01a8 }
            goto L_0x0101
        L_0x00fe:
            r13.mo107796b(r12)     // Catch:{ all -> 0x01a8 }
        L_0x0101:
            android.view.View r0 = r12.findViewById(r1)     // Catch:{ all -> 0x01a8 }
            r1 = 0
            r0.setOnClickListener(r1)     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bk r0 = new com.google.android.apps.search.assistant.surfaces.roti.home.bk     // Catch:{ all -> 0x01a8 }
            r0.<init>(r13, r12)     // Catch:{ all -> 0x01a8 }
            android.view.ViewTreeObserver r1 = r12.getViewTreeObserver()     // Catch:{ all -> 0x01a8 }
            r1.addOnGlobalLayoutListener(r0)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.ab r0 = r13.f349226n     // Catch:{ all -> 0x01a8 }
            android.view.View r1 = r12.findViewById(r5)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.af r2 = r13.f349227o     // Catch:{ all -> 0x01a8 }
            r5 = 119032(0x1d0f8, float:1.668E-40)
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r5)     // Catch:{ all -> 0x01a8 }
            r0.mo33801b(r1, r2)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.ab r0 = r13.f349226n     // Catch:{ all -> 0x01a8 }
            android.view.View r1 = r12.findViewById(r3)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.af r2 = r13.f349227o     // Catch:{ all -> 0x01a8 }
            r3 = 119034(0x1d0fa, float:1.66802E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.i r0 = r0.mo33801b(r1, r2)     // Catch:{ all -> 0x01a8 }
            r13.f349203G = r0     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.ab r0 = r13.f349226n     // Catch:{ all -> 0x01a8 }
            android.view.View r1 = r12.findViewById(r4)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.af r2 = r13.f349227o     // Catch:{ all -> 0x01a8 }
            r3 = 119035(0x1d0fb, float:1.66804E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x01a8 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)     // Catch:{ all -> 0x01a8 }
            r0.mo33801b(r1, r2)     // Catch:{ all -> 0x01a8 }
            boolean r0 = r13.f349223k     // Catch:{ all -> 0x01a8 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x016c
            boolean r3 = r13.f349225m     // Catch:{ all -> 0x01a8 }
            if (r3 == 0) goto L_0x016c
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r3 = r13.f349222j     // Catch:{ all -> 0x01a8 }
            boolean r3 = r3.f349186h     // Catch:{ all -> 0x01a8 }
            if (r3 == 0) goto L_0x016c
            r3 = 1
            goto L_0x016d
        L_0x016c:
            r3 = 0
        L_0x016d:
            r13.f349201E = r3     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x017c
            boolean r0 = r13.f349224l     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x017c
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r0 = r13.f349222j     // Catch:{ all -> 0x01a8 }
            boolean r0 = r0.f349187i     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x017c
            goto L_0x017d
        L_0x017c:
            r1 = 0
        L_0x017d:
            r13.f349202F = r1     // Catch:{ all -> 0x01a8 }
            r13.mo107804j(r2)     // Catch:{ all -> 0x01a8 }
            r0 = 2131428820(0x7f0b05d4, float:1.8479295E38)
            android.view.View r12 = r12.findViewById(r0)     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.libraries.ui.logoview.LogoView r12 = (com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView) r12     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bt r0 = new com.google.android.apps.search.assistant.surfaces.roti.home.bt     // Catch:{ all -> 0x01a8 }
            r0.<init>(r13)     // Catch:{ all -> 0x01a8 }
            r12.f332964f = r0     // Catch:{ all -> 0x01a8 }
            com.google.android.apps.search.assistant.surfaces.roti.home.bf r12 = r13.f349216d     // Catch:{ all -> 0x01a8 }
            android.view.View r12 = r12.requireView()     // Catch:{ all -> 0x01a8 }
            r13 = 2131428823(0x7f0b05d7, float:1.8479301E38)
            android.view.View r12 = r12.findViewById(r13)     // Catch:{ all -> 0x01a8 }
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ all -> 0x01a8 }
            r12.setVisibility(r2)     // Catch:{ all -> 0x01a8 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x01a8:
            r12 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x01ad }
            goto L_0x01b1
        L_0x01ad:
            r13 = move-exception
            com.google.android.apps.search.assistant.surfaces.roti.home.C126794be.m207428a(r12, r13)
        L_0x01b1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.roti.home.C126795bf.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, com.google.android.apps.search.assistant.surfaces.roti.home.n] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f349176e) {
                super.onAttach(context);
                if (this.f349173a == null) {
                    Object jN = mo107828d().mo17653jN();
                    C126797bh r = ((C74176nj) jN).mo70008r();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126795bf) {
                        C126795bf bfVar = (C126795bf) fragment;
                        C68225k.m98532d(bfVar);
                        Executor executor = (Executor) ((C74176nj) jN).f206677a.n.mo17428b();
                        boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 2").mo50907f();
                        boolean f2 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45352254").mo50907f();
                        boolean f3 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45352255").mo50907f();
                        C65599b bVar = (C65599b) ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45354655").mo50905d();
                        C68225k.m98532d(bVar);
                        C65599b bVar2 = (C65599b) ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45354656").mo50905d();
                        C68225k.m98532d(bVar2);
                        C65599b bVar3 = (C65599b) ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45354657").mo50905d();
                        C68225k.m98532d(bVar3);
                        this.f349173a = new C126804bo(r, bfVar, (C126781as) ((C74176nj) jN).f207087n.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), ((C74176nj) jN).mo69851hi(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), f, f2, f3, bVar, bVar2, bVar3, ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45353647").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45353646").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45353648").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66982fw().f184847a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45355106").mo50907f(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), new C119473g(), (AccessibilityManager) ((C74176nj) jN).f206677a.bt.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f349175d));
                    } else {
                        String obj = C126804bo.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C126794be.m207428a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
