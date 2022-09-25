package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2043bi;
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
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.ado;
import com.google.protobuf.C62971cq;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.al */
/* compiled from: PG */
public final class C36715al extends C36711ah implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C36719ap f95659a;

    /* renamed from: c */
    private Context f95660c;

    /* renamed from: d */
    private final C2393x f95661d = new C2393x(this);

    /* renamed from: e */
    private boolean f95662e;

    @Deprecated
    public C36715al() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo40349b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f95660c == null) {
            this.f95660c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f95660c;
    }

    /* renamed from: f */
    public final C36719ap mo17754z() {
        C36719ap apVar = this.f95659a;
        if (apVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f95662e) {
            return apVar;
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
        return this.f95661d;
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
            C36714ak.m65334a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C36719ap f = mo17754z();
            f.f95670e.mo50429i(f.f95677l);
            f.f95670e.mo50429i(f.f95678m);
            f.f95670e.mo50429i(f.f95679n);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C36714ak.m65334a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C36719ap f = mo17754z();
            f.f95676k.mo19974a(C37176a.f97297ir);
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.assistant_omniconsent_udc_fragment, viewGroup, false);
            C50358uc ucVar = f.f95669d.f95651c;
            if (ucVar == null) {
                ucVar = C50358uc.f131066m;
            }
            C2043bi.m5528V(glifLayout, f.f95667b.getString(R.string.assistant_omniconsent_udc_screen_title));
            glifLayout.mo49195q(TextUtils.join("<p>", ucVar.f131073f));
            ((TextView) glifLayout.findViewById(R.id.assistant_omniconsent_identity)).setText(ucVar.f131074g);
            LinearLayout linearLayout = (LinearLayout) glifLayout.findViewById(R.id.assistant_omniconsent_content_container);
            for (int i = 0; i < ucVar.f131078k.size(); i++) {
                ado ado = (ado) ucVar.f131078k.get(i);
                C62971cq cqVar = ((ado) ucVar.f131078k.get(i)).f129056e;
                C36686b bVar = new C36686b(f.f95667b);
                bVar.mo40328a(ado.f129055d, cqVar);
                bVar.mo40329b(ado.f129054c);
                ImageView imageView = (ImageView) bVar.findViewById(R.id.consent_ui_image);
                ((C6007z) f.f95671f.mo51286a().mo11873k(ado.f129057f).mo11965R(C5997p.IMMEDIATE)).mo12439a(new C36718ao(imageView)).mo12454r(imageView);
                TypedValue typedValue = new TypedValue();
                f.f95667b.getTheme().resolveAttribute(R.attr.colorOnboardingOnSurfaceVariant, typedValue, true);
                imageView.setColorFilter(C1878d.m5128a(f.f95667b, typedValue.resourceId));
                linearLayout.addView(bVar);
                if (i < ucVar.f131078k.size() - 1) {
                    layoutInflater.inflate(R.layout.assistant_consent_component_spacing, linearLayout, true);
                }
            }
            ((TextView) glifLayout.findViewById(R.id.assistant_omniconsent_footer_paragraph)).setText(TextUtils.join("<p>", ucVar.f131079l));
            C45275b bVar2 = (C45275b) glifLayout.mo49129j(C45275b.class);
            C45276c cVar = new C45276c(f.f95667b);
            cVar.mo49181b(R.string.assistant_omniconsent_udc_screen_action_button_text);
            cVar.f118281b = new C47591co(f.f95668c, "Turn on button is clicked", new C36716am(f));
            cVar.f118282c = 5;
            cVar.f118283d = R.style.AssistantOnboardingButtonPrimary;
            bVar2.mo49175f(cVar.mo49180a());
            C45276c cVar2 = new C45276c(f.f95667b);
            cVar2.mo49181b(R.string.assistant_omniconsent_udc_screen_skip_button_text);
            cVar2.f118281b = new C47591co(f.f95668c, "No thanks button is clicked", new C36717an(f));
            cVar2.f118282c = 7;
            if (f.f95669d.f95657i) {
                cVar2.f118283d = R.style.AssistantOnboardingButtonPrimary;
                bVar2.mo49176g(cVar2.mo49180a(), true);
            } else {
                bVar2.mo49176g(cVar2.mo49180a(), false);
            }
            View findViewById = glifLayout.findViewById(R.id.assistant_oobe_empty_action_button);
            View findViewById2 = glifLayout.findViewById(R.id.assistant_oobe_empty_cancel_button);
            f.f95672g.mo33802c(findViewById, f.f95673h.mo33805a(C28427h.m53115a(152773)));
            f.f95672g.mo33802c(findViewById2, f.f95673h.mo33805a(C28427h.m53115a(152779)));
            f.f95672g.mo33802c(glifLayout, f.f95673h.mo33805a(C28427h.m53115a(152783)));
            C47831fm.m85019n();
            return glifLayout;
        } catch (Throwable th) {
            C36714ak.m65334a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f95662e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C36714ak.m65334a(th, th);
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
            C36714ak.m65334a(th, th);
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
            if (!this.f95662e) {
                super.onAttach(context);
                if (this.f95659a == null) {
                    Object jN = mo40348a().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C36715al) {
                        C36715al alVar = (C36715al) fragment;
                        C68225k.m98532d(alVar);
                        this.f95659a = new C36719ap(alVar, ((C74176nj) jN).mo69687eX(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66920en(), ((C74176nj) jN).mo69686eW());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f95661d));
                    } else {
                        String obj = C36719ap.class.toString();
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
                C36714ak.m65334a(th2, th3);
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
