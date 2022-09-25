package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0707ho;
import android.support.p033v7.widget.C0778x;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.SearchView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.C2124k;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26116cz;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3505b.C44535e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.p3638c.C46752i;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.ar */
/* compiled from: PG */
public final class C26149ar extends C26175bq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f71053a = new C2393x(this);

    /* renamed from: b */
    private LanguagePickerFragmentPeer f71054b;

    /* renamed from: c */
    private Context f71055c;

    /* renamed from: d */
    private final C47515ab f71056d = new C47515ab(this);

    /* renamed from: e */
    private boolean f71057e;

    @Deprecated
    public C26149ar() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C26149ar m48291a(AccountId accountId, String str) {
        C26149ar arVar = new C26149ar();
        C68324h.m98669f(arVar);
        C47247a.m84047b(arVar, accountId);
        C47243l.m84040b(arVar, str);
        return arVar;
    }

    /* renamed from: b */
    public final LanguagePickerFragmentPeer mo17754z() {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71054b;
        if (languagePickerFragmentPeer == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f71057e) {
            return languagePickerFragmentPeer;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo31384d() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f71055c == null) {
            this.f71055c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f71055c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f71056d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f71053a;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f71056d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f71056d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            LanguagePickerFragmentPeer b = mo17754z();
            C2391v viewLifecycleOwner = b.f71020q.getViewLifecycleOwner();
            b.f71009f.mo5704e(viewLifecycleOwner, new C26150as(b));
            b.f71010g.mo5704e(viewLifecycleOwner, new C26154aw(b));
            b.f71011h.mo5704e(viewLifecycleOwner, new C26155ax(b));
            b.f71012i.mo5704e(viewLifecycleOwner, new C26156ay(b));
            b.f71013j.mo5704e(viewLifecycleOwner, new C26157az(b));
            b.f71014k.mo5704e(viewLifecycleOwner, new C26159ba(b));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f71056d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f71056d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f71056d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f71056d.mo51381i();
        try {
            super.onCreate(bundle);
            LanguagePickerFragmentPeer b = mo17754z();
            b.f71020q.setStyle(0, 2132150756);
            b.f71017n = C44534d.m78716c(new ContextThemeWrapper(b.f71020q.getContext(), 2132150756));
            b.f71016m = LayoutInflater.from(b.f71017n);
            b.f71020q.f71053a.mo5790b(b.f71026w);
            b.f71009f = b.f71021r.mo30903g();
            C26059ax axVar = b.f71022s;
            axVar.mo31256k();
            C26116cz czVar = (C26116cz) axVar.f70826p.mo3842a();
            czVar.getClass();
            b.f71005b = czVar.mo31306a();
            b.f71006c = czVar.mo31307b();
            C26059ax axVar2 = b.f71022s;
            axVar2.mo31256k();
            b.f71013j = axVar2.f70828r;
            C26059ax axVar3 = b.f71022s;
            b.f71010g = axVar3.f70830t;
            b.f71011h = axVar3.f70831u;
            b.f71012i = axVar3.f70787A;
            b.f71018o = b.f71020q.getResources().getInteger(17694721);
            b.f71028y.mo50429i(b.f71002B);
            C26164bf bfVar = new C26164bf(b);
            C26059ax axVar4 = b.f71022s;
            b.f71014k = axVar4.f70836z;
            b.f71007d = b.f71029z.mo31422a(b.f71005b, true, new C26160bb(b), bfVar, axVar4, b.f71017n);
            b.f71008e = b.f71029z.mo31422a(b.f71006c, false, new C26161bc(b), bfVar, b.f71022s, b.f71017n);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f71056d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f71056d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            LanguagePickerFragmentPeer b = mo17754z();
            b.f71017n.getClass();
            LayoutInflater layoutInflater2 = b.f71016m;
            layoutInflater2.getClass();
            View inflate = layoutInflater2.inflate(R.layout.lens_translate_filter_language_picker, viewGroup, false);
            MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.lens_translate_toolbar);
            materialToolbar.getClass();
            int i = 1 != b.f71019p ? R.string.lens_translate_filter_language_picker_title_source : R.string.lens_translate_filter_language_picker_title_target;
            b.f71020q.requireDialog().setTitle(i);
            ((MaterialToolbar) materialToolbar.findViewById(R.id.lens_translate_toolbar)).mo2422w(i);
            materialToolbar.mo2419t(new C47591co(b.f71001A, "navigation click", new C26162bd(b)));
            materialToolbar.mo2404n(R.menu.lens_translate_filter_language_picker_search_menu);
            MenuItem findItem = materialToolbar.mo2393g().findItem(R.id.lens_translate_language_picker_search);
            SearchView searchView = (SearchView) findItem.getActionView();
            searchView.setQueryHint(b.f71017n.getString(i));
            searchView.setIconifiedByDefault(false);
            searchView.setMaxWidth(Integer.MAX_VALUE);
            ((ImageView) searchView.findViewById(R.id.search_mag_icon)).setImageDrawable((Drawable) null);
            searchView.findViewById(R.id.search_plate).setBackground((Drawable) null);
            ((LinearLayout.LayoutParams) ((LinearLayout) searchView.findViewById(R.id.search_edit_frame)).getLayoutParams()).setMargins(0, 0, 0, 0);
            ImageView imageView = (ImageView) searchView.findViewById(R.id.search_close_btn);
            ((LinearLayout.LayoutParams) imageView.getLayoutParams()).setMargins(0, 0, 0, 0);
            C0778x xVar = (C0778x) searchView.findViewById(R.id.search_src_text);
            xVar.setTextAppearance(R.style.LanguagePickerSearchViewText);
            xVar.setHintTextColor(C44535e.m78719b(xVar, R.attr.colorOnSurfaceVariant));
            C2124k.m5892c(imageView, b.f71017n.getColorStateList(R.color.lens_translate_download_item_secondary_icon_color));
            int dimensionPixelSize = b.f71017n.getResources().getDimensionPixelSize(R.dimen.lens_translate_language_picker_button_size);
            imageView.setMinimumWidth(dimensionPixelSize);
            imageView.setMinimumHeight(dimensionPixelSize);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(b.f71017n.getDrawable(R.drawable.button_ripple_background));
            imageView.setContentDescription(b.f71017n.getResources().getString(R.string.lens_translate_filter_language_picker_search_clear_text_content_description));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.lens_translate_language_list);
            recyclerView.getClass();
            b.f71004a = recyclerView;
            b.f71004a.setLayoutManager(new LinearLayoutManager(b.f71017n));
            inflate.setOnApplyWindowInsetsListener(new C26163be(inflate));
            b.f71004a.setOnApplyWindowInsetsListener(new C26151at(b));
            C0646fh fhVar = b.f71004a.mItemAnimator;
            if (fhVar instanceof C0707ho) {
                ((C0707ho) fhVar).f2538m = false;
            }
            b.f71004a.addItemDecoration$ar$ds(new C26165bg(b.f71017n.getResources().getDimensionPixelSize(R.dimen.lens_translate_download_tooltip_height)));
            C26197x xVar2 = b.f71019p == 0 ? b.f71007d : b.f71008e;
            RecyclerView recyclerView2 = b.f71004a;
            if (xVar2.f71183g == null) {
                xVar2.f71184h = new C26193t(xVar2);
                xVar2.f71185i = new C26194u(xVar2);
                xVar2.f71186j = new C26195v(xVar2);
                C46753j jVar = new C46753j();
                jVar.f122102a = new C26188o(xVar2);
                jVar.mo50771b(C26189p.f71167a);
                jVar.f122103b = new C46752i();
                xVar2.f71183g = jVar.mo50770a();
                xVar2.mo31421d();
            }
            recyclerView2.setAdapter(xVar2.f71183g);
            findItem.setOnActionExpandListener(new C26167bi(b, xVar2, (AppBarLayout) inflate.findViewById(R.id.lens_translate_app_bar_layout), searchView));
            Dialog dialog = b.f71020q.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setNavigationBarColor(C28110al.m52389a(b.f71017n, R.attr.colorSurface));
                }
                dialog.setOnShowListener(new C28458c(b.f71020q, new C26152au(b, materialToolbar)));
                dialog.setOnKeyListener(new C26153av(findItem));
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f71056d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f71056d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f71056d.mo51376d();
        try {
            super.onDetach();
            this.f71057e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f71056d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f71056d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f71056d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f71056d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f71056d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f71056d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f71056d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f71056d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26148aq.m48290a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71056d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f71056d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f71056d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f71056d;
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
        C47515ab abVar = this.f71056d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f71056d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f71056d;
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
        C26149ar arVar = this;
        arVar.f71056d.mo51381i();
        try {
            if (!arVar.f71057e) {
                super.onAttach(context);
                if (arVar.f71054b == null) {
                    Object jN = mo31399f().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26149ar) {
                        C26149ar arVar2 = (C26149ar) fragment;
                        C68225k.m98532d(arVar2);
                        LensConnectivityManager lensConnectivityManager = (LensConnectivityManager) ((C74176nj) jN).f206836d.f205208C.mo17428b();
                        C26059ax axVar = (C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b();
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                        C25684e eVar = (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b();
                        C37215b bVar = (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b();
                        C60888db dbVar = (C60888db) ((C74176nj) jN).f206677a.n.mo17428b();
                        C46439e eVar2 = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                        C73958bn bnVar = ((C74176nj) jN).f206836d;
                        C69464a aVar = bnVar.f205238aF;
                        C69464a aVar2 = bnVar.f205208C;
                        anh anh = ((C74176nj) jN).f206730b;
                        C69464a aVar3 = anh.f198027a.f199167S;
                        C69464a aVar4 = anh.f198663m;
                        C69464a aVar5 = aVar4;
                        C69464a aVar6 = aVar;
                        C69464a aVar7 = aVar2;
                        C69464a aVar8 = aVar3;
                        arVar = this;
                        arVar.f71054b = new LanguagePickerFragmentPeer(b, arVar2, lensConnectivityManager, axVar, abVar, mVar, eVar, bVar, dbVar, eVar2, new C26198y(aVar6, aVar7, aVar8, aVar5, ((C74176nj) jN).f207091r, bnVar.f205215J), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(arVar.f71056d, arVar.f71053a));
                    } else {
                        String obj = LanguagePickerFragmentPeer.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = arVar.f71056d;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
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
