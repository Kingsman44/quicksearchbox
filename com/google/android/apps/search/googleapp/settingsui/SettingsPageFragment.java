package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.preference.C3990ap;
import androidx.preference.C3995au;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.p10536x.C139867c;
import com.google.android.apps.search.googleapp.p10536x.C139868d;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.apps.search.googleapp.p10536x.C139877m;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.android.apps.search.googleapp.p10536x.C139880p;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139138b;
import com.google.android.apps.search.googleapp.settingsui.p10483b.C139175b;
import com.google.android.apps.search.googleapp.settingsui.p10484c.C139205a;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139252a;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139253b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63077o;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SettingsPageFragment extends C139210ce implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: f */
    private C139178ba f378413f;

    /* renamed from: g */
    private Context f378414g;

    /* renamed from: h */
    private final C2393x f378415h = new C2393x(this);

    /* renamed from: i */
    private final C47515ab f378416i = new C47515ab(this);

    /* renamed from: j */
    private boolean f378417j;

    @Deprecated
    public SettingsPageFragment() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C139178ba mo17754z() {
        C139178ba baVar = this.f378413f;
        if (baVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378417j) {
            return baVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378414g == null) {
            this.f378414g = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378414g;
    }

    /* renamed from: fZ */
    public final void mo8407fZ(Bundle bundle, String str) {
        SettingsPageFragment settingsPageFragment = mo17754z().f378513c;
        C3995au auVar = settingsPageFragment.f12807b;
        settingsPageFragment.mo8413j(auVar.mo8432e(auVar.f12829a));
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f378416i.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f378415h;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f378416i.mo51380h(eyVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ C47247a mo114775m() {
        return new C47242k(this);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f378416i.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f378416i.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f378416i.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f378416i.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f378416i.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Fragment fragment;
        this.f378416i.mo51381i();
        try {
            C139178ba b = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            PreferenceScreen gi = b.f378513c.mo8412gi();
            if (gi.mo8381j() <= 0) {
                FragmentManager childFragmentManager = b.f378513c.getChildFragmentManager();
                C69664n.m101060f(childFragmentManager, "settingsPageFragment.childFragmentManager");
                for (C139873i iVar : b.mo114800a()) {
                    Fragment c = childFragmentManager.f634a.mo671c(iVar.name());
                    if (c != null) {
                        C0154a aVar = new C0154a(childFragmentManager);
                        aVar.mo516m(c);
                        aVar.mo509f();
                    }
                    C139879o oVar = (C139879o) b.f378514d.get(iVar);
                    if (oVar instanceof C139865b) {
                        fragment = C139228f.m226239a(b.f378512b, iVar.name());
                    } else if (oVar instanceof C139867c) {
                        fragment = C139238k.m226267a(b.f378512b, iVar.name());
                    } else if (oVar instanceof C139877m) {
                        fragment = C139250r.m226299a(b.f378512b, iVar.name());
                    } else {
                        if (!(oVar instanceof C139880p)) {
                            if (!(oVar instanceof C139875k)) {
                                if (oVar instanceof C139858a) {
                                    fragment = C139173b.m226110a(b.f378512b, iVar.name());
                                } else {
                                    fragment = oVar instanceof C139868d ? ((C139868d) oVar).mo112669b() : null;
                                }
                            }
                        }
                        fragment = C139264w.m226336a(b.f378512b, iVar.name());
                    }
                    if (fragment != null) {
                        C0154a aVar2 = new C0154a(childFragmentManager);
                        aVar2.mo685r(fragment, iVar.name());
                        aVar2.mo509f();
                        Preference a = ((C139878n) ((C47231d) fragment).mo17754z()).mo112667a();
                        a.mo8343J(iVar.name());
                        a.mo8344K(iVar.ordinal());
                        gi.mo8379af(a);
                    }
                }
            }
            View inflate = layoutInflater.inflate(R.layout.googleapp_settings_page_fragment, viewGroup, false);
            C139219cn e = ((ToolbarView) inflate.findViewById(R.id.googleapp_settings_page_toolbar)).mo17754z();
            int i = b.f378523m.f380279k;
            if (e.f378646g) {
                e.mo114847a().mo47439f(e.f378643d.getString(i));
            } else {
                e.f378647h.mo2422w(i);
            }
            if (b.f378523m == C139874j.TOP) {
                e.f378648i.mo33911e("NAV_UP_VE_KEY");
                e.f378648i.mo33907a("CLOSE_VE_KEY", e.f378645f.mo33805a(C28427h.m53115a(158289)));
                e.f378647h.mo2417r(R.drawable.quantum_gm_ic_close_vd_theme_24);
                e.f378647h.mo2415p(R.string.googleapp_settings_close_button_desc);
                e.f378647h.mo2419t(new C47591co(e.f378642c, "Settings toolbar close button", new C139216ck(e)));
                e.mo114848b();
            }
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.googleapp_settings_page_container);
            viewGroup2.addView(super.onCreateView(layoutInflater, viewGroup2, bundle));
            C139874j jVar = b.f378523m;
            if (jVar == C139874j.TOP) {
                b.f378518h.mo50828h(R.id.googleapp_settings_menu_highlight_subscription, new C139252a(b.f378517g), b.f378526p);
            } else {
                b.f378517g.mo114856a(new C139160an(jVar));
            }
            C69664n.m101060f(inflate, "root");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f378416i.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f378416i.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f378416i.mo51376d();
        try {
            super.onDetach();
            this.f378417j = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f378416i.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f378416i.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54439e.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f378416i.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f378416i.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f378416i.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f378416i.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f378416i.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C46370ah a;
        C63077o oVar;
        this.f378416i.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C139175b.class, new C139179bb(mo17754z()));
            super.onViewCreated(view, bundle);
            C139178ba b = mo17754z();
            C69664n.m101061g(view, "view");
            RecyclerView recyclerView = b.f378513c.f12808c;
            recyclerView.setItemAnimator((C0646fh) null);
            if (b.f378523m == C139874j.TOP && b.f378520j.f362963a) {
                int dimension = (int) b.f378513c.getResources().getDimension(R.dimen.googleapp_settings_searchbox_margin);
                int dimension2 = ((int) b.f378513c.getResources().getDimension(R.dimen.googleapp_settings_searchbox_height)) + dimension + dimension;
                recyclerView.setPadding(0, dimension2, 0, dimension2);
                View findViewById = view.findViewById(R.id.googleapp_settings_searchbox);
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new C47591co(b.f378519i, "googleapp_settings_searchbox onClick", new C139171ay(b)));
                recyclerView.addOnScrollListener(new C139172az(dimension2, findViewById, ((ToolbarView) view.findViewById(R.id.googleapp_settings_page_toolbar)).mo17754z()));
            }
            if (b.f378524n != null && b.mo114800a().contains(b.f378524n) && ((a = b.f378521k.mo50378a(C62912at.f169862a)) == null || (oVar = (C63077o) a.f121384a) == null || !oVar.f170230a)) {
                b.mo114802c(b.f378524n);
                C139873i iVar = b.f378524n;
                RecyclerView recyclerView2 = b.f378513c.f12808c;
                C0640fb fbVar = recyclerView2.mAdapter;
                C69664n.m101059e(fbVar, "null cannot be cast to non-null type androidx.preference.PreferenceGroupAdapter");
                recyclerView2.addOnChildAttachStateChangeListener(new C139170ax((C3990ap) fbVar, iVar, recyclerView2, b));
                b.f378521k.mo50381d(C62912at.f169862a, C63077o.m96099a(true));
            }
            C28452b bVar = new C28452b(b.f378516f.mo33801b(view.findViewById(R.id.googleapp_settings_page_container), b.f378515e.mo33805a(C28427h.m53115a(123184))));
            SettingsPageFragment settingsPageFragment = b.f378513c;
            PreferenceScreen gi = settingsPageFragment.mo8412gi();
            for (Fragment fragment : settingsPageFragment.getChildFragmentManager().f634a.mo677i()) {
                String tag = fragment.getTag();
                if (tag != null) {
                    Preference l = gi.mo8382l(tag);
                    if (l != null) {
                        Object obj = b.f378514d.get(C139873i.m227462a(tag));
                        if (obj != null) {
                            C139879o oVar2 = (C139879o) obj;
                            if (oVar2.mo111452a() > 0) {
                                C28439i a2 = bVar.mo33907a(l, b.f378515e.mo33805a(C28427h.m53115a(oVar2.mo111452a())));
                                C69664n.m101059e(fragment, "null cannot be cast to non-null type com.google.apps.tiktok.inject.PeeredInterface<com.google.android.apps.search.googleapp.settings.PreferenceFragmentPeer>");
                                C69664n.m101060f(a2, "ve");
                                ((C139878n) ((C47231d) fragment).mo17754z()).mo112668b(a2);
                            } else if (!(oVar2 instanceof C139868d)) {
                                throw new IllegalArgumentException("veId must be set for non-CustomSettingUiElements");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139167au.m226098a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f378416i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f378416i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f378416i;
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
        C47515ab abVar = this.f378416i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f378416i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f378416i;
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
        this.f378416i.mo51381i();
        try {
            if (!this.f378417j) {
                super.onAttach(context);
                if (this.f378413f == null) {
                    Object jN = mo114836n().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof SettingsPageFragment) {
                        SettingsPageFragment settingsPageFragment = (SettingsPageFragment) fragment;
                        C68225k.m98532d(settingsPageFragment);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C139138b bVar = (C139138b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C139138b.f378426d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(bVar);
                        C139178ba baVar = r4;
                        C139178ba baVar2 = new C139178ba(accountId, settingsPageFragment, bVar, ((C74176nj) jN).mo69829hG(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), new C139205a((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a), (InstanceStateStoreFactory) ((C74176nj) jN).f206680aC.mo17428b(), (C139253b) ((C74176nj) jN).f206730b.f198027a.f199502gI.mo17428b(), (C46855i) ((C74176nj) jN).f206685aH.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67089kC(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69694ee());
                        this.f378413f = baVar;
                        baVar.f378530r = this;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f378416i, this.f378415h));
                    } else {
                        String obj = C139178ba.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f378416i;
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
                C139167au.m226098a(th2, th3);
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
