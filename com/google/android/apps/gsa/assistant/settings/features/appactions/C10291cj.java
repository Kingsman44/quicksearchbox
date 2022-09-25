package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10276u;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C49826ak;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cj */
/* compiled from: PG */
public final class C10291cj extends C10288cg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10301ct f34875a;

    /* renamed from: c */
    private Context f34876c;

    /* renamed from: d */
    private final C2393x f34877d = new C2393x(this);

    /* renamed from: e */
    private boolean f34878e;

    @Deprecated
    public C10291cj() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18386b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34876c == null) {
            this.f34876c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34876c;
    }

    /* renamed from: f */
    public final C10301ct mo17754z() {
        C10301ct ctVar = this.f34875a;
        if (ctVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34878e) {
            return ctVar;
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
        return this.f34877d;
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
            C10290ci.m25201a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            mo17754z().f34897d.setHasOptionsMenu(true);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10290ci.m25201a(th, th);
        }
        throw th;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo17754z();
        menu.clear();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10301ct f = mo17754z();
            f.f34895b = layoutInflater.inflate(R.layout.shortcut_detailed_page, viewGroup, false);
            if (bundle == null) {
                ((C0395p) f.f34897d.getActivity()).mo1322k().mo1192t((Toolbar) f.f34895b.findViewById(R.id.assistant_settings_toolbar));
            }
            C73778a.m108339b(f.f34897d);
            TextView textView = (TextView) f.f34895b.findViewById(R.id.bar_title);
            f.f34896c.f76997b.mo33800a(C28427h.m53115a(106331)).mo33809b(f.f34895b);
            int a = C10276u.m25163a(f.f34898e.f34831f);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 2) {
                textView.setText(R.string.edit_shortcut_header);
                l lVar = f.f34900g;
                C10294cm cmVar = new C10294cm(f);
                C10295cn cnVar = new C10295cn(f);
                C10291cj cjVar = f.f34897d;
                Objects.requireNonNull(cjVar);
                view = lVar.b(cmVar, cnVar, new C10296co(cjVar)).b.a(layoutInflater, viewGroup, f.f34895b);
            } else if (i == 3) {
                textView.setText(R.string.edit_shortcut_header);
                C49826ak akVar = f.f34898e.f34830e;
                if (akVar == null) {
                    akVar = C49826ak.f129462q;
                }
                f.mo18399b(akVar, false);
                view = f.f34895b;
            } else {
                throw new IllegalStateException("unknown type for shortcut detailed page.");
            }
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C10290ci.m25201a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34878e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10290ci.m25201a(th, th);
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
            C10290ci.m25201a(th, th);
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
            if (!this.f34878e) {
                super.onAttach(context);
                if (this.f34875a == null) {
                    Object jN = mo18385a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10291cj) {
                        C10291cj cjVar = (C10291cj) fragment;
                        C68225k.m98532d(cjVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C10277v vVar = (C10277v) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10277v.f34824h, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(vVar);
                        this.f34875a = new C10301ct(cjVar, vVar, (C10325al) ((C74178nm) jN).f207136c.f205576bY.mo17428b(), ((C74178nm) jN).mo70075q(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), ((C74178nm) jN).mo70064f(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (InputMethodManager) ((C74178nm) jN).f207130a.d.f201569bb.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34877d));
                    } else {
                        String obj = C10301ct.class.toString();
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
                C10290ci.m25201a(th2, th3);
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
