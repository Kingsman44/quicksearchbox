package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.C6007z;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2814a.C36686b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C50345tq;
import com.google.assistant.p3861at.ado;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.b */
/* compiled from: PG */
public final class C36725b extends C36708ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C36730g f95687a;

    /* renamed from: c */
    private Context f95688c;

    /* renamed from: d */
    private final C2393x f95689d = new C2393x(this);

    /* renamed from: e */
    private boolean f95690e;

    @Deprecated
    public C36725b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C36730g mo17754z() {
        C36730g gVar = this.f95687a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f95690e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo40339b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f95688c == null) {
            this.f95688c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f95688c;
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
        return this.f95689d;
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
            C36689a.m65287a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C36730g a = mo17754z();
            a.f95711m.mo50429i(a.f95713o);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C36689a.m65287a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C36730g a = mo17754z();
            a.f95709k.mo19974a(C37176a.f97300iu);
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.assistant_omniconsent_disclosure_fragment, viewGroup, false);
            ((TextView) glifLayout.findViewById(R.id.assistant_omniconsent_disclosure_identity)).setText(a.f95704f.f95696d);
            C50345tq tqVar = a.f95704f.f95694b;
            if (tqVar == null) {
                tqVar = C50345tq.f131022d;
            }
            LinearLayout linearLayout = (LinearLayout) glifLayout.findViewById(R.id.assistant_disclosure_content_container);
            int size = tqVar.f131026c.size();
            for (int i = 0; i < size; i++) {
                ado ado = (ado) tqVar.f131026c.get(i);
                C36686b bVar = new C36686b(a.f95701c);
                bVar.mo40328a(ado.f129055d, ado.f129056e);
                bVar.mo40329b(ado.f129054c);
                ImageView imageView = (ImageView) bVar.findViewById(R.id.consent_ui_image);
                ((C6007z) a.f95706h.mo51286a().mo11873k(ado.f129057f).mo11965R(C5997p.IMMEDIATE)).mo12439a(new C36729f(imageView)).mo12454r(imageView);
                TypedValue typedValue = new TypedValue();
                a.f95701c.getTheme().resolveAttribute(R.attr.colorOnboardingOnSurfaceVariant, typedValue, true);
                imageView.setColorFilter(C1878d.m5128a(a.f95701c, typedValue.resourceId));
                linearLayout.addView(bVar);
                if (i < size - 1) {
                    layoutInflater.inflate(R.layout.assistant_consent_component_spacing, linearLayout, true);
                }
            }
            C45276c cVar = new C45276c(a.f95701c);
            cVar.mo49181b(R.string.assistant_omniconsent_disclosure_screen_action_button_text);
            cVar.f118281b = new C47591co(a.f95703e, "Continue button is clicked", new C36728e(a));
            cVar.f118283d = R.style.AssistantOnboardingButtonPrimary;
            cVar.f118282c = 5;
            ((C45275b) glifLayout.mo49129j(C45275b.class)).mo49175f(cVar.mo49180a());
            a.f95707i.mo33802c(glifLayout.findViewById(R.id.assistant_oobe_empty_action_button), a.f95708j.mo33805a(C28427h.m53115a(152773)));
            a.f95707i.mo33802c(glifLayout, a.f95708j.mo33805a(C28427h.m53115a(152787)));
            C47831fm.m85019n();
            return glifLayout;
        } catch (Throwable th) {
            C36689a.m65287a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f95690e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C36689a.m65287a(th, th);
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
            C36689a.m65287a(th, th);
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
            if (!this.f95690e) {
                super.onAttach(context);
                if (this.f95687a == null) {
                    Object jN = mo40340d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C36725b) {
                        C36725b bVar = (C36725b) fragment;
                        C68225k.m98532d(bVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C36727d dVar = (C36727d) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C36727d.f95691e, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(dVar);
                        this.f95687a = new C36730g(accountId, bVar, (C46439e) ((C74176nj) jN).f206942f.mo17428b(), dVar, (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C36624a) ((C74176nj) jN).f206730b.f198093bM.mo17428b(), ((C74176nj) jN).mo69686eW());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f95689d));
                    } else {
                        String obj = C36730g.class.toString();
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
                C36689a.m65287a(th2, th3);
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
