package com.google.android.apps.search.podcasts.search;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10600q.C140942a;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.search.C141001b;
import com.google.android.apps.search.podcasts.search.p10610b.C141008f;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.C31975ax;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46689ag;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
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
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SearchFragment extends C141024p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141001b f382796a;

    /* renamed from: c */
    private Context f382797c;

    /* renamed from: d */
    private final C2393x f382798d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f382799e = new C47515ab(this);

    /* renamed from: f */
    private boolean f382800f;

    @Deprecated
    public SearchFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141001b mo17754z() {
        C141001b bVar = this.f382796a;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382800f) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116067b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382797c == null) {
            this.f382797c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382797c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f382799e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f382798d;
    }

    public final int getTheme() {
        mo17754z();
        return R.style.FullscreenDialogTheme;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f382799e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f382799e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f382799e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f382799e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f382799e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f382799e.mo51381i();
        try {
            super.onCreate(bundle);
            mo17754z().f382804c.setStyle(2, R.style.FullscreenDialogTheme);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f382799e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C141001b a = mo17754z();
        Dialog dialog = new Dialog(a.f382804c.requireContext(), R.style.FullscreenDialogTheme);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(21);
        }
        dialog.setOnShowListener(new C141011c(a));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f382799e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C141001b a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_search_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_search_clear_button);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…asts_search_clear_button)");
            View findViewById2 = inflate.findViewById(R.id.podcasts_search_input_edittext);
            C69664n.m101060f(findViewById2, "rootView.findViewById(R.…ts_search_input_edittext)");
            EditText editText = (EditText) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.podcasts_back_button);
            C69664n.m101060f(findViewById3, "rootView.findViewById(R.id.podcasts_back_button)");
            editText.addTextChangedListener(new C47764db(a.f382808g, new C141012d(findViewById, a), "search field text watcher"));
            editText.setOnEditorActionListener(new C47577ca(a.f382808g, new C141013e(editText, a), "Invoking search action on Search edit text"));
            findViewById.setOnClickListener(new C47591co(a.f382808g, "search clear button", new C141014f(editText)));
            findViewById3.setOnClickListener(new C47591co(a.f382808g, "search back button", new C141015g(a)));
            View findViewById4 = inflate.findViewById(R.id.podcasts_search_suggest_recycler);
            C69664n.m101060f(findViewById4, "rootView.findViewById(R.…_search_suggest_recycler)");
            RecyclerView recyclerView = (RecyclerView) findViewById4;
            recyclerView.setItemAnimator((C0646fh) null);
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context));
            a.f382811j = C31972au.m59570a(a.f382804c, C140951j.m228907a(recyclerView, a.f382807f.f382835a.mo116036a())).mo37724a();
            editText.setOnFocusChangeListener(new C47590cn(a.f382808g, new C141016h(a, editText), "Changes focus of search bar in search fragment"));
            C46801dp dpVar = a.f382805d;
            C46689ag a2 = a.f382806e.mo116072a(BuildConfig.FLAVOR);
            C31974aw awVar = a.f382811j;
            C69664n.m101058d(awVar);
            dpVar.mo50707a(a2, new C141001b.C141002a(a, awVar));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f382799e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f382799e.mo51375c();
        try {
            super.onDestroyView();
            C141001b a = mo17754z();
            a.f382810i = null;
            a.f382811j = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f382799e.mo51376d();
        try {
            super.onDetach();
            this.f382800f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f382799e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f382799e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f382799e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f382799e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f382799e.mo51377e();
        try {
            super.onResume();
            C141001b a = mo17754z();
            C140952k kVar = a.f382810i;
            C31974aw awVar = a.f382811j;
            if (awVar != null) {
                a.mo116071a(kVar, awVar);
                e.close();
                return;
            }
            throw new IllegalStateException("onCreateView() wasn't called");
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f382799e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        Window window;
        this.f382799e.mo51381i();
        try {
            super.onStart();
            Dialog dialog = mo17754z().f382804c.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                window.setLayout(-1, -1);
            }
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f382799e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f382799e.mo51381i();
        try {
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140999a.m228966a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f382799e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f382799e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f382799e;
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
        C47515ab abVar = this.f382799e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f382799e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f382799e;
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
        this.f382799e.mo51381i();
        try {
            if (!this.f382800f) {
                super.onAttach(context);
                if (this.f382796a == null) {
                    Object jN = mo116084d().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    this.f382796a = new C141001b(b, (SearchFragment) ((C74176nj) jN).f206762bf.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C141008f) ((C74176nj) jN).f206763bg.mo17428b(), new C141017i((C31975ax) ((C74176nj) jN).f206764bh.mo17428b(), (C140942a) ((C74176nj) jN).f206758bb.mo17428b()), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f382799e, this.f382798d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f382799e;
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
                C140999a.m228966a(th, th2);
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
