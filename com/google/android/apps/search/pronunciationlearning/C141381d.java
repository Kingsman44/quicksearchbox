package com.google.android.apps.search.pronunciationlearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58837ba;
import com.google.common.p4552o.aqe;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d */
/* compiled from: PG */
public final class C141381d extends C141324aj implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141411f f383793a;

    /* renamed from: c */
    private Context f383794c;

    /* renamed from: d */
    private final C2393x f383795d = new C2393x(this);

    /* renamed from: e */
    private boolean f383796e;

    @Deprecated
    public C141381d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141411f mo17754z() {
        C141411f fVar = this.f383793a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383796e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116351b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383794c == null) {
            this.f383794c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383794c;
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
        return this.f383795d;
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
            C141333c.m229415a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Fragment fragment;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141411f a = mo17754z();
            boolean z = false;
            View inflate = layoutInflater.inflate(R.layout.pronunciationlearning_main_fragment, viewGroup, false);
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.pronunciationlearning_exit_button);
            imageButton.getClass();
            imageButton.setOnClickListener(new C141400e(a));
            String str = (String) a.f383849d.f384126d.get("ExitButtonDescription");
            str.getClass();
            imageButton.setContentDescription(str);
            TextView textView = (TextView) inflate.findViewById(R.id.pronunciationlearning_app_title);
            textView.getClass();
            String str2 = (String) a.f383849d.f384126d.get("AppTitle");
            str2.getClass();
            textView.setText(str2);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.pronunciationlearning_app_icon);
            imageView.getClass();
            String str3 = (String) a.f383849d.f384126d.get("AppLogoDescription");
            str3.getClass();
            imageView.setContentDescription(str3);
            if (C58837ba.m90859h(a.f383850e)) {
                fragment = C141415j.m229481a(a.f383847b, BuildConfig.FLAVOR);
            } else if (a.f383851f.equals(aqe.PRONUNCIATION_GRAMMAR)) {
                fragment = C141415j.m229481a(a.f383847b, a.f383850e);
            } else {
                AccountId accountId = a.f383847b;
                C141412g gVar = (C141412g) C141413h.f383852e.createBuilder();
                String str4 = a.f383850e;
                gVar.copyOnWrite();
                C141413h hVar = (C141413h) gVar.instance;
                hVar.f383854a |= 2;
                hVar.f383855b = str4;
                gVar.copyOnWrite();
                C141413h hVar2 = (C141413h) gVar.instance;
                hVar2.f383856c = 3;
                hVar2.f383854a |= 4;
                fragment = C141524z.m229712a(accountId, (C141413h) gVar.build());
                z = true;
            }
            C0154a aVar = new C0154a(a.f383846a.getChildFragmentManager());
            String str5 = "PronunciationPracticingFragment";
            if (true != z) {
                str5 = "PronunciationContentFragment";
            }
            aVar.mo689v(R.id.pronunciationlearning_fragment_container, fragment, str5);
            aVar.mo509f();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C141333c.m229415a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f383796e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141333c.m229415a(th, th);
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
            C141333c.m229415a(th, th);
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
            if (!this.f383796e) {
                super.onAttach(context);
                if (this.f383793a == null) {
                    Object jN = mo116352d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141381d) {
                        C141381d dVar = (C141381d) fragment;
                        C68225k.m98532d(dVar);
                        this.f383793a = new C141411f(dVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C141512e) ((C74176nj) jN).f206677a.d.f201639cs.mo17428b(), ((C74176nj) jN).f206836d.mo69009aq(), ((C74176nj) jN).f206836d.mo68997ae());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f383795d));
                    } else {
                        String obj = C141411f.class.toString();
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
                C141333c.m229415a(th, th2);
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
