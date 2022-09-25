package com.google.android.apps.search.googleapp.search.srp.p10436f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.silk.web.searchbox.C40898g;
import com.google.android.libraries.search.silk.web.searchbox.SilkSearchboxMessageHandler;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43509a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43511c;
import com.google.android.libraries.web.contrib.p3389i.C43630d;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.c */
/* compiled from: PG */
public final class C137839c extends C137850l implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137843g f375018a;

    /* renamed from: c */
    private Context f375019c;

    /* renamed from: d */
    private final C2393x f375020d = new C2393x(this);

    /* renamed from: e */
    private boolean f375021e;

    @Deprecated
    public C137839c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137843g mo17754z() {
        C137843g gVar = this.f375018a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f375021e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113996b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f375019c == null) {
            this.f375019c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f375019c;
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
        return this.f375020d;
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
            C137838b.m224083a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137843g a = mo17754z();
            if (bundle != null) {
                a.f375051z = bundle.getBoolean("isChangingConfigurations");
                a.f375027A = bundle.getString("searchBoxText");
            }
            if (a.f375040o) {
                a.f375035j.mo46655a(new C137840d(a));
            }
            a.f375043r.mo50829i(R.id.googleapp_error_mixin_subscription, new C43509a((C43511c) a.f375044s), new C137841e(a), C137842f.f375024a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137838b.m224083a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0124 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0124=Splitter:B:34:0x0124, B:20:0x00f8=Splitter:B:20:0x00f8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f122869b
            r0.mo51381i()
            r8.mo51119t(r9, r10, r11)     // Catch:{ all -> 0x0125 }
            com.google.android.apps.search.googleapp.search.srp.f.g r11 = r8.mo17754z()     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "SrpSearchBoxFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)     // Catch:{ all -> 0x0125 }
            r1 = 2131625413(0x7f0e05c5, float:1.8878033E38)
            r2 = 1
            r3 = 0
            android.view.View r9 = r9.inflate(r1, r10, r3)     // Catch:{ all -> 0x0109 }
            r10 = 2131431940(0x7f0b1204, float:1.8485623E38)
            android.view.View r10 = r9.findViewById(r10)     // Catch:{ all -> 0x0109 }
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ all -> 0x0109 }
            boolean r1 = r11.f375049x     // Catch:{ all -> 0x0109 }
            r4 = 0
            if (r1 == 0) goto L_0x0055
            android.content.Context r1 = r11.f375036k     // Catch:{ all -> 0x0109 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x0109 }
            r5 = 2131232245(0x7f0805f5, float:1.8080594E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r5)     // Catch:{ all -> 0x0109 }
            r9.setBackgroundDrawable(r1)     // Catch:{ all -> 0x0109 }
            r9.setElevation(r4)     // Catch:{ all -> 0x0109 }
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch:{ all -> 0x0109 }
            r1.<init>()     // Catch:{ all -> 0x0109 }
            android.content.Context r5 = r11.f375036k     // Catch:{ all -> 0x0109 }
            android.content.res.Resources$Theme r5 = r5.getTheme()     // Catch:{ all -> 0x0109 }
            r6 = 2130971351(0x7f040ad7, float:1.7551438E38)
            boolean r5 = r5.resolveAttribute(r6, r1, r2)     // Catch:{ all -> 0x0109 }
            if (r5 == 0) goto L_0x0055
            int r1 = r1.resourceId     // Catch:{ all -> 0x0109 }
            r10.setTextAppearance(r1)     // Catch:{ all -> 0x0109 }
        L_0x0055:
            r1 = 2131431709(0x7f0b111d, float:1.8485155E38)
            android.view.View r1 = r9.findViewById(r1)     // Catch:{ all -> 0x0109 }
            r1.setVisibility(r3)     // Catch:{ all -> 0x0109 }
            r5 = 2131431846(0x7f0b11a6, float:1.8485433E38)
            android.view.View r5 = r9.findViewById(r5)     // Catch:{ all -> 0x0109 }
            com.airbnb.lottie.LottieAnimationView r5 = (com.airbnb.lottie.LottieAnimationView) r5     // Catch:{ all -> 0x0109 }
            com.airbnb.lottie.ac r6 = r5.f15138d     // Catch:{ all -> 0x0109 }
            r6.mo9773j(r4)     // Catch:{ all -> 0x0109 }
            r5.setVisibility(r3)     // Catch:{ all -> 0x0109 }
            com.google.apps.tiktok.dataservice.dp r4 = r11.f375032g     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.web.c.v r5 = r11.f375034i     // Catch:{ all -> 0x0109 }
            com.google.apps.tiktok.dataservice.ag r5 = r5.mo46469b()     // Catch:{ all -> 0x0109 }
            com.google.apps.tiktok.dataservice.di r6 = r11.f375050y     // Catch:{ all -> 0x0109 }
            r4.mo50707a(r5, r6)     // Catch:{ all -> 0x0109 }
            com.google.android.apps.search.googleapp.j.e r4 = r11.f375045t     // Catch:{ all -> 0x0109 }
            boolean r4 = r4.mo112951a()     // Catch:{ all -> 0x0109 }
            if (r4 == 0) goto L_0x0095
            com.google.apps.tiktok.dataservice.dp r4 = r11.f375032g     // Catch:{ all -> 0x0109 }
            com.google.android.apps.search.googleapp.search.voicesearch.c.i r5 = r11.f375033h     // Catch:{ all -> 0x0109 }
            com.google.apps.tiktok.dataservice.ag r5 = r5.mo114523b()     // Catch:{ all -> 0x0109 }
            com.google.android.apps.search.googleapp.search.srp.f.g$a r6 = new com.google.android.apps.search.googleapp.search.srp.f.g$a     // Catch:{ all -> 0x0109 }
            r6.<init>()     // Catch:{ all -> 0x0109 }
            r4.mo50707a(r5, r6)     // Catch:{ all -> 0x0109 }
        L_0x0095:
            r4 = 2131431663(0x7f0b10ef, float:1.8485062E38)
            android.view.View r4 = r9.findViewById(r4)     // Catch:{ all -> 0x0109 }
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4     // Catch:{ all -> 0x0109 }
            boolean r5 = r11.f375031f     // Catch:{ all -> 0x0109 }
            if (r5 == 0) goto L_0x00a6
            r4.setVisibility(r3)     // Catch:{ all -> 0x0109 }
            goto L_0x00ab
        L_0x00a6:
            r5 = 8
            r4.setVisibility(r5)     // Catch:{ all -> 0x0109 }
        L_0x00ab:
            com.google.android.libraries.search.silk.web.searchbox.g r5 = r11.f375037l     // Catch:{ all -> 0x0109 }
            com.google.android.apps.search.googleapp.search.srp.f.h r6 = new com.google.android.apps.search.googleapp.search.srp.f.h     // Catch:{ all -> 0x0109 }
            r6.<init>(r11)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.search.silk.web.searchbox.SilkSearchboxMessageHandler r5 = r5.f107129a     // Catch:{ all -> 0x0109 }
            r5.mo42889h(r6)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.ab r5 = r11.f375039n     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.af r6 = r5.f76990a     // Catch:{ all -> 0x0109 }
            r7 = 105745(0x19d11, float:1.4818E-40)
            com.google.android.libraries.logging.ve.h r7 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r7)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.c r6 = r6.mo33805a(r7)     // Catch:{ all -> 0x0109 }
            r5.mo33801b(r9, r6)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.ab r5 = r11.f375039n     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.af r6 = r5.f76990a     // Catch:{ all -> 0x0109 }
            r7 = 105769(0x19d29, float:1.48214E-40)
            com.google.android.libraries.logging.ve.h r7 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r7)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.c r6 = r6.mo33805a(r7)     // Catch:{ all -> 0x0109 }
            r5.mo33801b(r4, r6)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.ab r4 = r11.f375039n     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.af r5 = r4.f76990a     // Catch:{ all -> 0x0109 }
            r6 = 105743(0x19d0f, float:1.48178E-40)
            com.google.android.libraries.logging.ve.h r6 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r6)     // Catch:{ all -> 0x0109 }
            com.google.android.libraries.logging.ve.c r5 = r5.mo33805a(r6)     // Catch:{ all -> 0x0109 }
            r4.mo33801b(r1, r5)     // Catch:{ all -> 0x0109 }
            com.google.android.apps.search.googleapp.search.srp.u r11 = r11.f375046u     // Catch:{ all -> 0x0109 }
            boolean r1 = r11.f375183b     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x00f8
            java.lang.String r11 = r11.f375184c     // Catch:{ all -> 0x0109 }
            r10.setHint(r11)     // Catch:{ all -> 0x0109 }
        L_0x00f8:
            r0.close()     // Catch:{ all -> 0x0125 }
            if (r9 == 0) goto L_0x0101
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r9
        L_0x0101:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = "Fragment cannot use Event annotations with null view!"
            r9.<init>(r10)     // Catch:{ all -> 0x0125 }
            throw r9     // Catch:{ all -> 0x0125 }
        L_0x0109:
            r9 = move-exception
            r0.close()     // Catch:{ all -> 0x010e }
            goto L_0x0124
        L_0x010e:
            r10 = move-exception
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0124 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r11[r3] = r0     // Catch:{ Exception -> 0x0124 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.reflect.Method r11 = r0.getDeclaredMethod(r1, r11)     // Catch:{ Exception -> 0x0124 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0124 }
            r0[r3] = r10     // Catch:{ Exception -> 0x0124 }
            r11.invoke(r9, r0)     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            throw r9     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r9 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r10 = move-exception
            com.google.android.apps.search.googleapp.search.srp.p10436f.C137838b.m224083a(r9, r10)
        L_0x012e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10436f.C137839c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f375021e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137838b.m224083a(th, th);
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
            C137838b.m224083a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C137843g a = mo17754z();
            View view = a.f375028c.getView();
            if (a.f375028c.getActivity().isChangingConfigurations() && view != null) {
                bundle.putBoolean("isChangingConfigurations", true);
                TextView textView = (TextView) view.findViewById(R.id.googleapp_srp_search_box_text);
                textView.getClass();
                bundle.putString("searchBoxText", textView.getText().toString());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137838b.m224083a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C137843g a2 = mo17754z();
            a.f123128b.findViewById(R.id.googleapp_mic_icon).setTag(R.id.tiktok_event_internal_trace, "Mic icon tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_mic_icon), new C137847i(a2));
            a.f123128b.findViewById(R.id.googleapp_lens_icon).setTag(R.id.tiktok_event_internal_trace, "Lens icon tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_lens_icon), new C137848j(a2));
            a.f123128b.findViewById(R.id.googleapp_srp_search_box).setTag(R.id.tiktok_event_internal_trace, "SrpSearchBoxClick");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_srp_search_box), new C137849k(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137838b.m224083a(th, th);
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
            if (!this.f375021e) {
                super.onAttach(context);
                if (this.f375018a == null) {
                    Object jN = mo114005d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137839c) {
                        C137839c cVar = (C137839c) fragment;
                        C68225k.m98532d(cVar);
                        this.f375018a = new C137843g(cVar, ((C74176nj) jN).mo69702em(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66954fU().f185287a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 212").mo50907f(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), ((C74176nj) jN).mo69736fT(), new C43630d(((C74176nj) jN).mo69777gH()), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), new C40898g(new SilkSearchboxMessageHandler(((C74176nj) jN).mo69819gx(), ((C74176nj) jN).mo69753fk(), ((C74176nj) jN).mo69740fX(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), Optional.m71637of(Boolean.valueOf(((C74176nj) jN).f206677a.d.mo67903fr())))), ((C74176nj) jN).mo69796ga(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 416").mo50907f(), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b(), (C89859i) ((C74176nj) jN).f206677a.c.f201254bi.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), ((C74176nj) jN).mo69721fE(), ((C74176nj) jN).f206730b.mo66139cf(), ((C74176nj) jN).mo69644dh(), ((C74176nj) jN).mo69733fQ().mo46771a(C137543b.class), ((C74176nj) jN).f206730b.f198027a.mo67068jI(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45379375").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f375020d));
                    } else {
                        String obj = C137843g.class.toString();
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
                C137838b.m224083a(th2, th3);
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
