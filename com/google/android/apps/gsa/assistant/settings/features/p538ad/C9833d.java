package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9836g;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.d */
/* compiled from: PG */
public final class C9833d extends C9792a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9836g f33822a;

    /* renamed from: c */
    private Context f33823c;

    /* renamed from: d */
    private final C2393x f33824d = new C2393x(this);

    /* renamed from: e */
    private boolean f33825e;

    @Deprecated
    public C9833d() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18039b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f33823c == null) {
            this.f33823c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f33823c;
    }

    /* renamed from: f */
    public final C9836g mo17754z() {
        C9836g gVar = this.f33822a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f33825e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f33824d;
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
            C9832c.m24590a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C9836g f = mo17754z();
            f.f33830c.mo50429i(f.f33840m);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9832c.m24590a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00be A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00f5 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f9 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00fe A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0102 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0107 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010b A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0116 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011b A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0120 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012b A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0130 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x019b, all -> 0x01a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f122869b
            r0.mo51381i()
            r8.mo51119t(r9, r10, r11)     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.features.ad.g r10 = r8.mo17754z()     // Catch:{ all -> 0x019b }
            java.lang.Boolean r11 = r10.f33836i     // Catch:{ all -> 0x019b }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x019b }
            r0 = 0
            if (r11 != 0) goto L_0x0023
            java.lang.Boolean r11 = r10.f33838k     // Catch:{ all -> 0x019b }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x019b }
            if (r11 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x019b }
            goto L_0x0052
        L_0x0023:
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r11 = r10.f33841n     // Catch:{ all -> 0x019b }
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x019b }
            android.content.Context r9 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v.m133919a(r11, r9, r0)     // Catch:{ all -> 0x019b }
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)     // Catch:{ all -> 0x019b }
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.features.ad.d r11 = r10.f33828a     // Catch:{ all -> 0x019b }
            android.support.v4.app.am r11 = r11.getActivity()     // Catch:{ all -> 0x019b }
            if (r11 == 0) goto L_0x0052
            android.view.Window r11 = r11.getWindow()     // Catch:{ all -> 0x019b }
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            int r2 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r9, r1)     // Catch:{ all -> 0x019b }
            r11.setStatusBarColor(r2)     // Catch:{ all -> 0x019b }
            int r1 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r9, r1)     // Catch:{ all -> 0x019b }
            r11.setNavigationBarColor(r1)     // Catch:{ all -> 0x019b }
        L_0x0052:
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r11 = new com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout     // Catch:{ all -> 0x019b }
            r11.<init>(r9)     // Catch:{ all -> 0x019b }
            r1 = 2131625848(0x7f0e0778, float:1.8878916E38)
            r11.mo77370b(r1)     // Catch:{ all -> 0x019b }
            android.view.View r1 = r11.f228728c     // Catch:{ all -> 0x019b }
            r2 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r1 = (com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout) r1     // Catch:{ all -> 0x019b }
            android.widget.TextView r2 = r1.f228718a     // Catch:{ all -> 0x019b }
            r3 = 2131296259(0x7f090003, float:1.821043E38)
            android.graphics.Typeface r9 = androidx.core.content.p091b.C1874w.m5107d(r9, r3)     // Catch:{ all -> 0x019b }
            r2.setTypeface(r9)     // Catch:{ all -> 0x019b }
            android.widget.TextView r9 = r1.f228719b     // Catch:{ all -> 0x019b }
            r9.setFocusable(r0)     // Catch:{ all -> 0x019b }
            android.view.View r9 = r11.f228728c     // Catch:{ all -> 0x019b }
            r1 = 2131432989(0x7f0b161d, float:1.848775E38)
            android.view.View r9 = r9.findViewById(r1)     // Catch:{ all -> 0x019b }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f33832e     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247392gL     // Catch:{ all -> 0x019b }
            java.lang.String r1 = r1.mo79758x(r2)     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.features.ad.d r2 = r10.f33828a     // Catch:{ all -> 0x019b }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.features.ad.d r3 = r10.f33828a     // Catch:{ all -> 0x019b }
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x019b }
            r6 = 2132085153(0x7f1509a1, float:1.9810497E38)
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x019b }
            r5[r0] = r7     // Catch:{ all -> 0x019b }
            r0 = 2132089170(0x7f151952, float:1.9818644E38)
            java.lang.String r0 = r3.getString(r0, r5)     // Catch:{ all -> 0x019b }
            java.lang.String r3 = r2.getString(r6)     // Catch:{ all -> 0x019b }
            java.lang.String r1 = com.google.android.apps.gsa.assistant.settings.shared.d.c.c(r1)     // Catch:{ all -> 0x019b }
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x019b }
            r5.<init>(r0)     // Catch:{ all -> 0x019b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x019b }
            int r0 = r0.indexOf(r3)     // Catch:{ all -> 0x019b }
            if (r0 < 0) goto L_0x00cd
            int r3 = r3.length()     // Catch:{ all -> 0x019b }
            int r3 = r3 + r0
            com.google.android.apps.gsa.assistant.settings.shared.d.b r6 = new com.google.android.apps.gsa.assistant.settings.shared.d.b     // Catch:{ all -> 0x019b }
            r6.<init>(r2, r1)     // Catch:{ all -> 0x019b }
            r1 = 33
            r5.setSpan(r6, r0, r3, r1)     // Catch:{ all -> 0x019b }
        L_0x00cd:
            r9.setText(r5)     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73790r.m108349a(r9)     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r9 = r11.f228726a     // Catch:{ all -> 0x019b }
            r0 = 2
            r9.mo77362c(r0)     // Catch:{ all -> 0x019b }
            android.widget.Button r0 = r9.mo77361b()     // Catch:{ all -> 0x019b }
            r1 = 2132089168(0x7f151950, float:1.981864E38)
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133907b(r0, r1, r9)     // Catch:{ all -> 0x019b }
            android.widget.Button r0 = r9.mo77360a()     // Catch:{ all -> 0x019b }
            r1 = 2132089167(0x7f15194f, float:1.9818638E38)
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133907b(r0, r1, r9)     // Catch:{ all -> 0x019b }
            java.lang.Boolean r0 = r10.f33837j     // Catch:{ all -> 0x019b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x019b }
            if (r4 == r0) goto L_0x00f9
            r1 = 121483(0x1da8b, float:1.70234E-40)
            goto L_0x00fc
        L_0x00f9:
            r1 = 142437(0x22c65, float:1.99597E-40)
        L_0x00fc:
            if (r4 == r0) goto L_0x0102
            r2 = 121482(0x1da8a, float:1.70233E-40)
            goto L_0x0105
        L_0x0102:
            r2 = 142436(0x22c64, float:1.99595E-40)
        L_0x0105:
            if (r4 == r0) goto L_0x010b
            r0 = 121481(0x1da89, float:1.70231E-40)
            goto L_0x010e
        L_0x010b:
            r0 = 142435(0x22c63, float:1.99594E-40)
        L_0x010e:
            java.lang.Boolean r3 = r10.f33838k     // Catch:{ all -> 0x019b }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x019b }
            if (r4 != r3) goto L_0x0119
            r1 = 155923(0x26113, float:2.18495E-40)
        L_0x0119:
            if (r4 != r3) goto L_0x011e
            r2 = 155922(0x26112, float:2.18493E-40)
        L_0x011e:
            if (r4 != r3) goto L_0x0123
            r0 = 155924(0x26114, float:2.18496E-40)
        L_0x0123:
            java.lang.Boolean r3 = r10.f33839l     // Catch:{ all -> 0x019b }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x019b }
            if (r4 != r3) goto L_0x012e
            r1 = 158685(0x26bdd, float:2.22365E-40)
        L_0x012e:
            if (r4 != r3) goto L_0x0133
            r2 = 158684(0x26bdc, float:2.22364E-40)
        L_0x0133:
            if (r4 != r3) goto L_0x0138
            r0 = 158683(0x26bdb, float:2.22362E-40)
        L_0x0138:
            com.google.android.libraries.logging.ve.af r3 = r10.f33833f     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.ab r3 = r3.f76997b     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r0)     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.c r0 = r3.mo33800a(r0)     // Catch:{ all -> 0x019b }
            r0.mo33809b(r11)     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.af r0 = r10.f33833f     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.ab r0 = r0.f76997b     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.h r2 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r2)     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.c r0 = r0.mo33800a(r2)     // Catch:{ all -> 0x019b }
            android.widget.Button r2 = r9.mo77360a()     // Catch:{ all -> 0x019b }
            r0.mo33809b(r2)     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.af r0 = r10.f33833f     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.ab r0 = r0.f76997b     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.h r1 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r1)     // Catch:{ all -> 0x019b }
            com.google.android.libraries.logging.ve.c r0 = r0.mo33800a(r1)     // Catch:{ all -> 0x019b }
            android.widget.Button r1 = r9.mo77361b()     // Catch:{ all -> 0x019b }
            r0.mo33809b(r1)     // Catch:{ all -> 0x019b }
            android.widget.Button r0 = r9.mo77360a()     // Catch:{ all -> 0x019b }
            com.google.apps.tiktok.tracing.dh r1 = r10.f33835h     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.features.ad.e r2 = new com.google.android.apps.gsa.assistant.settings.features.ad.e     // Catch:{ all -> 0x019b }
            r2.<init>(r10)     // Catch:{ all -> 0x019b }
            com.google.apps.tiktok.tracing.co r3 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x019b }
            java.lang.String r4 = "Action button tapped"
            r3.<init>(r1, r4, r2)     // Catch:{ all -> 0x019b }
            r0.setOnClickListener(r3)     // Catch:{ all -> 0x019b }
            android.widget.Button r9 = r9.mo77361b()     // Catch:{ all -> 0x019b }
            com.google.apps.tiktok.tracing.dh r0 = r10.f33835h     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.assistant.settings.features.ad.f r1 = new com.google.android.apps.gsa.assistant.settings.features.ad.f     // Catch:{ all -> 0x019b }
            r1.<init>(r10)     // Catch:{ all -> 0x019b }
            com.google.apps.tiktok.tracing.co r10 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x019b }
            java.lang.String r2 = "Cancel button tapped"
            r10.<init>(r0, r2, r1)     // Catch:{ all -> 0x019b }
            r9.setOnClickListener(r10)     // Catch:{ all -> 0x019b }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r11
        L_0x019b:
            r9 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x01a0 }
            goto L_0x01a4
        L_0x01a0:
            r10 = move-exception
            com.google.android.apps.gsa.assistant.settings.features.p538ad.C9832c.m24590a(r9, r10)
        L_0x01a4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.p538ad.C9833d.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f33825e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9832c.m24590a(th, th);
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
            C9832c.m24590a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C9836g.C9838a.class, new C9839h(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9832c.m24590a(th, th);
        }
        throw th;
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

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f33825e) {
                super.onAttach(context);
                if (this.f33822a == null) {
                    Object jN = mo18038a().mo17653jN();
                    String b = C47260e.m84065b(((C74178nm) jN).mo70044a());
                    C68225k.m98532d(b);
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9833d) {
                        C9833d dVar = (C9833d) fragment;
                        C68225k.m98532d(dVar);
                        this.f33822a = new C9836g(b, dVar, ((C74178nm) jN).f207130a.a.mo68619l(), (C46439e) ((C74178nm) jN).f207139f.mo17428b(), ((C74178nm) jN).mo70036S(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C104149a) ((C74178nm) jN).f207130a.b.f200015bc.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), (C47770dh) ((C74178nm) jN).f207130a.a.f202593X.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f33824d));
                    } else {
                        String obj = C9836g.class.toString();
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C9832c.m24590a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
