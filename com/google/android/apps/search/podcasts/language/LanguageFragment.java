package com.google.android.apps.search.podcasts.language;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.language.C140539e;
import com.google.android.apps.search.podcasts.language.p10577a.C140517b;
import com.google.android.apps.search.podcasts.language.p10578b.C140526f;
import com.google.android.apps.search.podcasts.language.p10578b.C140532l;
import com.google.android.apps.search.podcasts.language.p10578b.C140536p;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10600q.C140942a;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.C31975ax;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47577ca;
import com.google.apps.tiktok.tracing.C47590cn;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47764db;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class LanguageFragment extends C140557v implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C140539e f381644b;

    /* renamed from: c */
    private Context f381645c;

    /* renamed from: d */
    private final C2393x f381646d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f381647e = new C47515ab(this);

    /* renamed from: f */
    private boolean f381648f;

    /* renamed from: g */
    private boolean f381649g;

    @Deprecated
    public LanguageFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140539e mo17754z() {
        C140539e eVar = this.f381644b;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381649g) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115701b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381645c == null) {
            this.f381645c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381645c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f381647e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f381646d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f381647e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f381647e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f381647e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f381647e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f381647e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f381647e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f381647e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C140539e a = mo17754z();
        C44565p pVar = new C44565p(a.f381700b.requireContext(), a.f381700b.getTheme());
        pVar.setOnShowListener(new C140543h(a));
        return pVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f381647e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C140539e a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_language_dialog_fragment, viewGroup, false);
            EditText editText = (EditText) inflate.findViewById(R.id.podcasts_language_search_bar_editor);
            editText.addTextChangedListener(new C47764db(a.f381704f, new C140544i(a), "Language list filter watcher"));
            C2043bi.m5555ai(inflate, new C140545j(a));
            editText.setOnFocusChangeListener(new C47590cn(a.f381704f, new C140546k(a), "Changes focus of search bar in language dialog"));
            editText.setOnClickListener(new C47591co(a.f381704f, "Clicks on search bar of language dialog", new C140547l(a)));
            editText.setOnEditorActionListener(new C47577ca(a.f381704f, new C140548m(a), "Clicks on search icon of keyboard in language dialog"));
            C69664n.m101060f(inflate, "rootView");
            C140539e.m228249f(inflate).addOnScrollListener(new C140549n(a));
            ((ImageView) inflate.findViewById(R.id.podcasts_language_appbar_close_button)).setOnClickListener(new C47591co(a.f381704f, "Clicks on close languages dialog button", new C140550o(a)));
            C31974aw a2 = C31972au.m59570a(a.f381700b, C140951j.m228907a(C140539e.m228249f(inflate), a.f381703e.f381650a.mo116036a())).mo37724a();
            a.f381701c.mo50707a(new C140526f(a.f381702d), new C140539e.C140540a(a2));
            a.f381706h = a2;
            this.f381648f = false;
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f381647e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f381647e.mo51375c();
        try {
            super.onDestroyView();
            C140539e a = mo17754z();
            a.f381706h = null;
            a.f381705g = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f381647e.mo51376d();
        try {
            super.onDetach();
            this.f381649g = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f381647e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f381647e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f381647e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f381647e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f381647e.mo51377e();
        try {
            super.onResume();
            C140539e a = mo17754z();
            C140517b bVar = a.f381705g;
            C31974aw awVar = a.f381706h;
            if (awVar != null) {
                a.mo115721a(bVar, awVar);
                e.close();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f381647e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f381647e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f381648f) {
                    C47389c.m84226a(getContext()).f123128b = C47393f.m84230a(this);
                    C140552q.m228261a(this, mo17754z());
                    this.f381648f = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f381647e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f381647e.mo51381i();
        try {
            if (!getShowsDialog() && !this.f381648f) {
                C47389c.m84226a(getContext()).f123128b = view;
                C140552q.m228261a(this, mo17754z());
                this.f381648f = true;
            }
            this.f54441a.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140538d.m228247a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f381647e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f381647e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f381647e;
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
        C47515ab abVar = this.f381647e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f381647e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f381647e;
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

    public final void onAttach(Context context) {
        this.f381647e.mo51381i();
        try {
            if (!this.f381649g) {
                super.onAttach(context);
                if (this.f381644b == null) {
                    Object jN = mo115737d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof LanguageFragment) {
                        LanguageFragment languageFragment = (LanguageFragment) fragment;
                        C68225k.m98532d(languageFragment);
                        this.f381644b = new C140539e(languageFragment, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), new C140532l((C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b(), (Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), new C140536p((C46407v) ((C74176nj) jN).f206730b.f198027a.f199515gV.mo17428b(), (C140385d) ((C74176nj) jN).f206730b.f198027a.f199878x.mo17428b(), ((C74176nj) jN).mo69789gT(), (C46128f) ((C74176nj) jN).f206730b.f198504j.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b())), new C140515a((C31975ax) ((C74176nj) jN).f206760bd.mo17428b(), (C31975ax) ((C74176nj) jN).f206761be.mo17428b(), (C140942a) ((C74176nj) jN).f206758bb.mo17428b()), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f381647e, this.f381646d));
                    } else {
                        String obj = C140539e.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f381647e;
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
                C140538d.m228247a(th2, th3);
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
