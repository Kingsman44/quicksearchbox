package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
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
import com.google.apps.tiktok.tracing.C47577ca;
import com.google.apps.tiktok.tracing.C47590cn;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47764db;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b */
/* compiled from: PG */
public final class C138575b extends C138598bg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138611m f376902a;

    /* renamed from: c */
    private Context f376903c;

    /* renamed from: d */
    private final C2393x f376904d = new C2393x(this);

    /* renamed from: e */
    private boolean f376905e;

    @Deprecated
    public C138575b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138611m mo17754z() {
        C138611m mVar = this.f376902a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f376905e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114338b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f376903c == null) {
            this.f376903c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f376903c;
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
        return this.f376904d;
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
            C138544a.m224984a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138611m a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C69664n.m101061g(viewGroup, "container");
            View inflate = layoutInflater.inflate(true != a.f376980k ? R.layout.googleapp_search_box : R.layout.googleapp_pixel_search_box, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.googleapp_search_box);
            C69664n.m101060f(findViewById, "view.findViewById(R.id.googleapp_search_box)");
            EditText editText = (EditText) findViewById;
            View findViewById2 = inflate.findViewById(R.id.googleapp_superg);
            C69664n.m101060f(findViewById2, "view.findViewById(R.id.googleapp_superg)");
            View findViewById3 = inflate.findViewById(R.id.googleapp_mic_icon);
            C69664n.m101060f(findViewById3, "view.findViewById(R.id.googleapp_mic_icon)");
            View findViewById4 = inflate.findViewById(R.id.googleapp_lens_icon);
            C69664n.m101060f(findViewById4, "view.findViewById(R.id.googleapp_lens_icon)");
            ImageButton imageButton = (ImageButton) findViewById4;
            C138601c.m225070a(imageButton, a.f376978i);
            View findViewById5 = inflate.findViewById(R.id.googleapp_search_box_clear_button);
            C69664n.m101060f(findViewById5, "view.findViewById(R.id.g…_search_box_clear_button)");
            C28306ab abVar = a.f376976g;
            abVar.mo33801b(findViewById5, abVar.f76990a.mo33805a(C28427h.m53115a(108181)));
            C28306ab abVar2 = a.f376976g;
            abVar2.mo33801b(findViewById3, abVar2.f76990a.mo33805a(C28427h.m53115a(108182)));
            C28306ab abVar3 = a.f376976g;
            abVar3.mo33801b(editText, abVar3.f76990a.mo33805a(C28427h.m53115a(108180)));
            C28306ab abVar4 = a.f376976g;
            abVar4.mo33801b(findViewById2, abVar4.f76990a.mo33805a(C28427h.m53115a(108191)));
            C28306ab abVar5 = a.f376976g;
            abVar5.mo33801b(imageButton, abVar5.f76990a.mo33805a(C28427h.m53115a(121154)));
            editText.setOnFocusChangeListener(new C47590cn(a.f376971b, new C138602d(editText), "SearchBox OnFocusChangeListener"));
            editText.addTextChangedListener(new C47764db(a.f376971b, new C138603e(editText, findViewById5, findViewById3, imageButton, a), "SearchBox TextWatcher"));
            editText.setOnEditorActionListener(new C47577ca(a.f376971b, new C138604f(a, editText), "SearchBox onEditorAction"));
            if (a.f376982m.f101930a) {
                editText.setImeOptions(editText.getImeOptions() | 16777216);
            }
            findViewById2.setOnClickListener(new C47591co(a.f376971b, "SuperG onClick", new C138605g(a, findViewById2)));
            findViewById3.setOnClickListener(new C47591co(a.f376971b, "Mic button tapped", new C138606h(a, findViewById3)));
            imageButton.setOnClickListener(new C47591co(a.f376971b, "Lens button tapped", new C138607i(a, imageButton)));
            findViewById5.setOnClickListener(new C47591co(a.f376971b, "ClearButton onClick", new C138608j(a, findViewById5, editText)));
            if (a.f376981l.mo50378a(C62912at.f169862a) == null) {
                C139704d a2 = C139704d.m227141a(a.f376970a.f376837b);
                if (a2 == null) {
                    a2 = C139704d.UNKNOWN;
                }
                C69664n.m101060f(a2, "fragmentArgument.entryPoint");
                a.mo114403e(a2);
            }
            a.mo114408j(editText);
            C138611m.m225071d(findViewById5, editText, findViewById3, imageButton, a);
            C69664n.m101060f(inflate, "view");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C138544a.m224984a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f376905e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138544a.m224984a(th, th);
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
            C138544a.m224984a(th, th);
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
            if (!this.f376905e) {
                super.onAttach(context);
                if (this.f376902a == null) {
                    Object jN = mo114382d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138575b) {
                        C138575b bVar = (C138575b) fragment;
                        C68225k.m98532d(bVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C138548ac acVar = (C138548ac) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C138548ac.f376834c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(acVar);
                        C138611m mVar = r4;
                        C138611m mVar2 = new C138611m(bVar, acVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C138068y) ((C74176nj) jN).f206730b.f198027a.f199382dv.mo17428b(), (C138057n) ((C74176nj) jN).f206730b.f198027a.f199496gC.mo17428b(), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b(), (C89859i) ((C74176nj) jN).f206677a.c.f201254bi.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66954fU().f185287a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 309").mo50907f(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), ((C74176nj) jN).mo69702em(), ((Boolean) ((C74176nj) jN).f206730b.f198102bV.mo17428b()).booleanValue(), (InstanceStateStoreFactory) ((C74176nj) jN).f206689aL.mo17428b());
                        this.f376902a = mVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f376904d));
                    } else {
                        String obj = C138611m.class.toString();
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
                C138544a.m224984a(th2, th3);
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
