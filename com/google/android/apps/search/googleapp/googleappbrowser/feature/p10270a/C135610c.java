package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentContainerView;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.C135608d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a.C135595f;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a.C135597h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43415b;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43417d;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43419f;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43421h;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43423j;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43425l;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43433t;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43435v;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43437x;
import com.google.android.libraries.web.contrib.contextmenu.p3362a.C43439z;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43442b;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43447g;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.android.libraries.web.contrib.contextmenu.p3364c.C43451c;
import com.google.android.libraries.web.contrib.contextmenu.p3364c.C43452d;
import com.google.android.libraries.web.contrib.contextmenu.p3364c.C43453e;
import com.google.android.libraries.web.contrib.contextmenu.p3364c.C43454f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3675a.C47363g;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.c */
/* compiled from: PG */
public final class C135610c extends C135613f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135612e f369394a;

    /* renamed from: c */
    private Context f369395c;

    /* renamed from: d */
    private final C2393x f369396d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f369397e = new C47515ab(this);

    /* renamed from: f */
    private boolean f369398f;

    @Deprecated
    public C135610c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135612e mo17754z() {
        C135612e eVar = this.f369394a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369398f) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112414b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369395c == null) {
            this.f369395c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369395c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f369397e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f369396d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f369397e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f369397e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f369397e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f369397e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f369397e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f369397e.mo51381i();
        try {
            super.onCreate(bundle);
            C135612e a = mo17754z();
            a.f369403d = a.f369401b.mo33916a(a.f369402c);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f369397e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C135612e a = mo17754z();
        C43451c cVar = a.f369400a;
        View inflate = LayoutInflater.from(cVar.f113511a.requireContext()).inflate(R.layout.context_menu, (ViewGroup) null);
        cVar.f113515e = inflate;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.webx_context_menu_layout);
        C58801sm G = ((C58485gu) cVar.f113513c).listIterator(0);
        while (G.hasNext()) {
            C43442b bVar = (C43442b) G.next();
            if (bVar instanceof C43448h) {
                C43448h hVar = (C43448h) bVar;
                C43454f fVar = cVar.f113514d;
                TextView textView = (TextView) LayoutInflater.from(fVar.f113521a.requireContext()).inflate(R.layout.menu_item, viewGroup, false);
                textView.setId(hVar.mo46519a());
                textView.setText(hVar.mo46521c());
                if (hVar.mo46520b() != 0) {
                    fVar.f113524d.f76997b.mo33800a(C28427h.m53115a(hVar.mo46520b())).mo33809b(textView);
                }
                fVar.f113522b.mo51254d(textView, new C43453e(fVar, hVar));
                viewGroup.addView(textView);
            } else if (bVar instanceof C135595f) {
                C135595f fVar2 = (C135595f) bVar;
                FragmentContainerView fragmentContainerView = new FragmentContainerView(viewGroup.getContext());
                Fragment c = cVar.f113511a.getChildFragmentManager().f634a.mo671c("PreviewImageMenuItem");
                if (c == null) {
                    int generateViewId = View.generateViewId();
                    fragmentContainerView.setId(generateViewId);
                    C0154a aVar = new C0154a(cVar.f113511a.getChildFragmentManager());
                    AccountId accountId = fVar2.f369346b;
                    String str = fVar2.f369345a;
                    C135597h hVar2 = new C135597h();
                    C68324h.m98669f(hVar2);
                    C47247a.m84047b(hVar2, accountId);
                    C47243l.m84040b(hVar2, str);
                    aVar.mo511h(generateViewId, hVar2, "PreviewImageMenuItem", 1);
                    aVar.mo509f();
                } else {
                    fragmentContainerView.setId(c.getId());
                }
                viewGroup.addView(fragmentContainerView);
            } else {
                throw new IllegalArgumentException("Received unknown ContextMenuItem: ".concat(String.valueOf(String.valueOf(bVar))));
            }
        }
        C47363g a2 = cVar.f113512b.mo51239a();
        a2.mo51238h(inflate);
        C0392m a3 = a2.mo51231a();
        a3.setOnShowListener(new C28458c(a.f369402c, new C135611d(a)));
        return a3;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f369397e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C43451c cVar = mo17754z().f369400a;
            View view = cVar.f113515e;
            cVar.f113515e = null;
            view.getClass();
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f369397e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f369397e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f369397e.mo51376d();
        try {
            super.onDetach();
            this.f369398f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f369397e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f369397e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f369397e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f369397e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f369397e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f369397e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f369397e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f369397e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f369397e.mo51381i();
        try {
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135609b.m219869a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f369397e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f369397e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f369397e;
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
        C47515ab abVar = this.f369397e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f369397e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f369397e;
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
        this.f369397e.mo51381i();
        try {
            if (!this.f369398f) {
                super.onAttach(context);
                if (this.f369394a == null) {
                    Object jN = mo112416d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C43446f fVar = (C43446f) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C43446f.f113498i, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(fVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135610c) {
                        C135610c cVar = (C135610c) fragment;
                        C68225k.m98532d(cVar);
                        this.f369394a = new C135612e(accountId, fVar, cVar, new C43452d(((C74176nj) jN).f206889e, ((C74176nj) jN).f206661K, ((C74176nj) jN).f206728ay), new C43447g(new C43415b(((C74176nj) jN).f206889e), new C43417d(((C74176nj) jN).f206729az, ((C74176nj) jN).f206889e), new C43419f(((C74176nj) jN).f206729az, ((C74176nj) jN).f206889e), new C43421h(((C74176nj) jN).f206677a.b.f200129dk, ((C74176nj) jN).f206889e), new C43423j(((C74176nj) jN).f206677a.b.f200129dk, ((C74176nj) jN).f206889e), new C43435v(((C74176nj) jN).f206889e), new C43439z(((C74176nj) jN).f206889e, ((C74176nj) jN).f206727ax), new C43437x(((C74176nj) jN).f206889e, ((C74176nj) jN).f206727ax), new C43425l(((C74176nj) jN).f206889e)), new C135608d(((C74176nj) jN).f206836d.f205391d, ((C74176nj) jN).f206889e), new C43433t(((C74176nj) jN).f206889e, ((C74176nj) jN).f206678aA), ((C74176nj) jN).f206677a.d.mo67738ao(), ((C74176nj) jN).mo69693ed(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45367337").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f369397e, this.f369396d));
                    } else {
                        String obj = C135612e.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f369397e;
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
                C135609b.m219869a(th2, th3);
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
