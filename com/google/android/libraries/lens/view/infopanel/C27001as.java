package com.google.android.libraries.lens.view.infopanel;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0508af;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.textfield.TextInputLayout;
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
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47577ca;
import com.google.apps.tiktok.tracing.C47764db;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.as */
/* compiled from: PG */
public final class C27001as extends C27089cg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27051bm f73621a;

    /* renamed from: b */
    private Context f73622b;

    /* renamed from: c */
    private final C2393x f73623c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f73624d = new C47515ab(this);

    /* renamed from: e */
    private boolean f73625e;

    /* renamed from: f */
    private boolean f73626f;

    @Deprecated
    public C27001as() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27051bm mo17754z() {
        C27051bm bmVar = this.f73621a;
        if (bmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f73626f) {
            return bmVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32461b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f73622b == null) {
            this.f73622b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f73622b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f73624d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f73623c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f73624d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f73624d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f73624d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f73624d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f73624d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f73624d.mo51381i();
        try {
            super.onCreate(bundle);
            C27051bm a = mo17754z();
            a.f73725e.setStyle(0, 2132150753);
            a.f73731k.mo32511b(C25802e.RECOGNIZE_SPEECH_SEARCH_BOX, a.f73725e, (View) null);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f73624d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73624d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27051bm a = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.multimodal_panel, viewGroup, false);
            Dialog dialog = a.f73725e.getDialog();
            dialog.getClass();
            Window window = dialog.getWindow();
            window.getClass();
            window.setSoftInputMode(16);
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.multimodal_panel_thumbnail);
            C0508af afVar = (C0508af) viewGroup2.findViewById(R.id.multimodal_panel_input);
            boolean z = true;
            imageView.setClipToOutline(true);
            imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C27043be(a, imageView, viewGroup2));
            afVar.append((CharSequence) ((C58833ax) a.f73723c.f73571e.mo3842a()).mo56106b(C27006ax.f73636a).mo56109e(BuildConfig.FLAVOR));
            afVar.setOnEditorActionListener(new C47577ca(a.f73728h, C27007ay.f73637a, "'Search' IME action received by the search bar."));
            C27001as asVar = a.f73725e;
            DialogVisualElements.m53173a(asVar, asVar.requireDialog(), new C27008az(a));
            a.f73727g.f75782a.mo5704e(a.f73725e.getViewLifecycleOwner(), new C27039ba(a));
            View findViewById = viewGroup2.findViewById(R.id.text_input_end_icon);
            if (a.f73732l) {
                afVar.addTextChangedListener(new C47764db(a.f73728h, new C27044bf(a, findViewById), "Multimodal text input changed"));
            }
            Editable text = afVar.getText();
            if (text == null || text.length() <= 0) {
                z = false;
            }
            if (!a.f73732l || z) {
                a.mo32493a(viewGroup2);
            } else {
                a.mo32494b(viewGroup2);
            }
            if (!a.f73732l) {
                ((TextInputLayout) viewGroup2.findViewById(R.id.multimodal_panel_input_layout)).f117308b.mo48599i(2);
            }
            this.f73625e = false;
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f73624d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f73624d.mo51375c();
        try {
            super.onDestroyView();
            C27051bm a = mo17754z();
            C27050bl blVar = a.f73734n;
            if (blVar != null) {
                blVar.f73717c.mo32490a(1.0f);
                blVar.f73718d.mo32490a(1.0f);
                ((C27042bd) blVar.f73719e).f73703a.mo32484a();
                blVar.f73715a.animate().cancel();
                blVar.f73716b.animate().cancel();
                a.f73734n = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f73624d.mo51376d();
        try {
            super.onDetach();
            this.f73626f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f73624d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f73624d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f73624d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f73624d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f73624d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f73624d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f73624d.mo51381i();
        try {
            super.onStart();
            C27051bm a = mo17754z();
            Dialog dialog = a.f73725e.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null) {
                window.setWindowAnimations(R.style.dialog_animation_fade);
                window.getDecorView().setSystemUiVisibility(true != C28110al.m52391c(a.f73721a) ? 9472 : 1280);
            }
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f73625e) {
                    View a2 = C47393f.m84230a(this);
                    C47400m a3 = C47389c.m84226a(getContext());
                    a3.f123128b = a2;
                    C27053bo.m50190a(a3, mo17754z());
                    this.f73625e = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f73624d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f73624d.mo51381i();
        try {
            if (!getShowsDialog() && !this.f73625e) {
                C47400m a = C47389c.m84226a(getContext());
                a.f123128b = view;
                C27053bo.m50190a(a, mo17754z());
                this.f73625e = true;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27000ar.m50098a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f73624d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f73624d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f73624d;
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
        C47515ab abVar = this.f73624d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f73624d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f73624d;
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
        this.f73624d.mo51381i();
        try {
            if (!this.f73626f) {
                super.onAttach(context);
                if (this.f73621a == null) {
                    Object jN = mo32530d().mo17653jN();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    C47449e eVar = (C47449e) ((C74176nj) jN).f207092s.mo17428b();
                    C26980p pVar = (C26980p) ((C74176nj) jN).f206836d.f205248aP.mo17428b();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27001as) {
                        C27001as asVar = (C27001as) fragment;
                        C68225k.m98532d(asVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C27005aw awVar = (C27005aw) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C27005aw.f73633b, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(awVar);
                        this.f73621a = new C27051bm(activity, eVar, pVar, mVar, asVar, (C27766bb) ((C74176nj) jN).f206836d.f205254aV.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), awVar, ((C74176nj) jN).mo69678eO(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45376707").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f73624d, this.f73623c));
                    } else {
                        String obj = C27051bm.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f73624d;
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
                C27000ar.m50098a(th2, th3);
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
