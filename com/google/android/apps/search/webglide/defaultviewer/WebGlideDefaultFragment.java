package com.google.android.apps.search.webglide.defaultviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.media3.common.C2640bb;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C2848br;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.webglide.bottombar.BottomBarCarouselView;
import com.google.android.apps.search.webglide.bottombar.C142186a;
import com.google.android.apps.search.webglide.p10698a.C142168g;
import com.google.android.apps.search.webglide.p10698a.C142169h;
import com.google.android.apps.search.webglide.p10699b.C142173d;
import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.apps.search.webglide.p10700c.C142195a;
import com.google.android.apps.search.webglide.p10700c.C142197c;
import com.google.android.apps.search.webglide.p10700c.C142198d;
import com.google.android.apps.search.webglide.p10700c.C142199e;
import com.google.android.apps.search.webglide.p10700c.C142200f;
import com.google.android.apps.search.webglide.p10702e.C142216a;
import com.google.android.apps.search.webglide.p10702e.C142222e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.p3034a.C38769r;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.storage.protostore.C42876ab;
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
import com.google.apps.tiktok.media.C47449e;
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
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47620b;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47626h;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47627i;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62971cq;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* compiled from: PG */
public final class WebGlideDefaultFragment extends C142202a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142211j f385774a;

    /* renamed from: c */
    private Context f385775c;

    /* renamed from: d */
    private final C2393x f385776d = new C2393x(this);

    /* renamed from: e */
    private boolean f385777e;

    @Deprecated
    public WebGlideDefaultFragment() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo117052b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385775c == null) {
            this.f385775c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385775c;
    }

    /* renamed from: f */
    public final C142211j mo17754z() {
        C142211j jVar = this.f385774a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385777e) {
            return jVar;
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
        return this.f385776d;
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
            C142203b.m230861a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C142211j f = mo17754z();
            C142176g gVar = f.f385811r;
            if (gVar.f385695d && !gVar.f385701j) {
                f.f385808o.mo50829i(R.id.webglide_subscription_local_data_for_tutorials, new C142168g(f.f385807n), new C142204c(f), C142205d.f385784a);
            }
            if (!f.f385811r.f385699h) {
                f.f385795b.setRequestedOrientation(1);
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C142211j.f385794a.mo56226d()).mo56382g(e)).mo56372aa(42039)).mo56386p("WebGlideActivity: Unable to setRequestedOrientation.");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C142203b.m230861a(th, th2);
            }
            throw th;
        }
        C47831fm.m85019n();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C142211j f = mo17754z();
            View inflate = layoutInflater.inflate(f.f385795b.getResources().getConfiguration().orientation == 1 ? R.layout.webglide_default_fragment : R.layout.webglide_default_fragment_landscape, viewGroup, false);
            ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.webglide_viewpager);
            viewPager2.mo9217f(0);
            viewPager2.mo9218g(false);
            f.f385802i.f13865d.mo9199a(new C47626h(f.f385796c, "ExperienceFragmentPeer"));
            viewPager2.mo9210b(f.f385802i);
            C142173d b = C142174e.m230796b(f.f385795b.getIntent(), f.f385798e.f385686a);
            C142215n nVar = f.f385802i;
            C62971cq cqVar = b.f385678b;
            int size = nVar.f385816f.size();
            nVar.f385816f.addAll(cqVar);
            nVar.mObservable.mo2882d(size, cqVar.size());
            viewPager2.f13892b.mo9232c(new C47620b(f.f385796c, f.f385806m, "WebGlidePageChangeLogger"));
            viewPager2.mo9211c(b.f385679c, false);
            if (C142174e.m230796b(f.f385795b.getIntent(), f.f385798e.f385686a).f385678b.size() <= 1) {
                C142211j.m230865a(inflate.findViewById(R.id.webglide_default_bottom_bar));
                C142211j.m230865a(inflate.findViewById(R.id.webglide_bottom_bar_carousel_navigation_view));
            } else if (f.f385811r.f385701j) {
                C142211j.m230865a(inflate.findViewById(R.id.webglide_default_bottom_bar));
                C142211j.m230866b(inflate.findViewById(R.id.webglide_bottom_bar_carousel_navigation_view));
                ((BottomBarCarouselView) inflate.findViewById(R.id.webglide_bottom_bar_carousel_navigation_view)).mo17754z().mo117045a(viewPager2.f13893c);
            } else {
                C142211j.m230865a(inflate.findViewById(R.id.webglide_bottom_bar_carousel_navigation_view));
                C142211j.m230866b(inflate.findViewById(R.id.webglide_default_bottom_bar));
                viewPager2.f13892b.mo9232c(new C142207f(f, inflate));
                View findViewById = inflate.findViewById(R.id.webglide_bottom_navigation_next);
                View findViewById2 = inflate.findViewById(R.id.webglide_bottom_navigation_previous);
                View findViewById3 = inflate.findViewById(R.id.webglide_bottom_navigation_previous_last_index);
                View findViewById4 = inflate.findViewById(R.id.webglide_bottom_navigation_next);
                C28306ab abVar = f.f385804k;
                abVar.mo33802c(findViewById4, abVar.f76990a.mo33805a(C28427h.m53115a(126268)));
                View findViewById5 = inflate.findViewById(R.id.webglide_bottom_navigation_previous);
                C28306ab abVar2 = f.f385804k;
                abVar2.mo33802c(findViewById5, abVar2.f76990a.mo33805a(C28427h.m53115a(126269)));
                View findViewById6 = inflate.findViewById(R.id.webglide_bottom_navigation_previous_last_index);
                C28306ab abVar3 = f.f385804k;
                abVar3.mo33802c(findViewById6, abVar3.f76990a.mo33805a(C28427h.m53115a(126269)));
                findViewById.setOnClickListener(new C47591co(f.f385803j, "Next button clicked", new C142208g(f, viewPager2)));
                findViewById2.setOnClickListener(new C47591co(f.f385803j, "Previous button clicked", new C142209h(f, viewPager2)));
                findViewById3.setOnClickListener(new C47591co(f.f385803j, "Back button clicked on the last item", new C142210i(f, viewPager2)));
            }
            TextureView textureView = (TextureView) inflate.findViewById(R.id.webglide_video_preview);
            C142198d dVar = f.f385801h;
            dVar.f385766a.mo5979G(textureView);
            dVar.f385766a.mo5980H(0.0f);
            C2759ad adVar = dVar.f385766a;
            ((C2848br) adVar).mo6600aQ();
            ((C2848br) adVar).f8011x = 2;
            ((C2848br) adVar).mo6591aH(2, 4, 2);
            dVar.f385766a.mo5975C(new C2640bb(0.5f, 1.0f));
            dVar.f385766a.mo5977E(2);
            dVar.f385766a.mo6016w(new C142197c(textureView));
            Locale forLanguageTag = Locale.forLanguageTag(C142174e.m230796b(f.f385795b.getIntent(), f.f385798e.f385686a).f385682f);
            if (!Locale.ROOT.equals(forLanguageTag)) {
                Configuration configuration = new Configuration(f.f385800g.getResources().getConfiguration());
                configuration.setLocale(forLanguageTag);
                f.f385812s = f.f385800g.createConfigurationContext(configuration).getResources();
                if (!f.f385811r.f385701j) {
                    ((ImageView) inflate.findViewById(R.id.webglide_bottom_navigation_image_next_thumbnail)).setContentDescription(f.f385812s.getString(R.string.webglide_content_description_na));
                    ((TextView) inflate.findViewById(R.id.webglide_bottom_navigation_next_title)).setText(f.f385812s.getString(R.string.webglide_next));
                    ((TextView) inflate.findViewById(R.id.webglide_default_fragment_container_placeholder_view3)).setText(f.f385812s.getString(R.string.webglide_back));
                    inflate.findViewById(R.id.webglide_bottom_navigation_previous_text).setContentDescription(f.f385812s.getString(R.string.webglide_previous));
                }
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C142203b.m230861a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C142211j f = mo17754z();
            C142198d dVar = f.f385801h;
            dVar.mo117050a();
            dVar.f385766a.mo6018y();
            dVar.f385769d = true;
            f.f385810q = null;
            c.close();
            return;
        } catch (Throwable th) {
            C142203b.m230861a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385777e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142203b.m230861a(th, th);
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
            C142203b.m230861a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f385801h.mo117051b();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142203b.m230861a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C142211j f = mo17754z();
            C142198d dVar = f.f385801h;
            dVar.mo117050a();
            dVar.f385766a.mo5974B(true);
            int i = C142174e.m230796b(f.f385795b.getIntent(), f.f385798e.f385686a).f385679c;
            if (!f.f385811r.f385701j) {
                if (i > 0) {
                    View view = f.f385797d.getView();
                    C58893dc.m90996a(view);
                    f.mo117059c(i, view);
                }
                if (f.f385800g.getResources().getConfiguration().orientation == 2) {
                    View view2 = f.f385797d.getView();
                    C58893dc.m90996a(view2);
                    ((ImageView) view2.findViewById(R.id.webglide_bottom_navigation_image_next_thumbnail)).setVisibility(0);
                    ((TextureView) view2.findViewById(R.id.webglide_video_preview)).setVisibility(8);
                    f.f385801h.mo117051b();
                }
            }
            e.close();
            return;
        } catch (Throwable th) {
            C142203b.m230861a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C142211j f = mo17754z();
            C47393f.m84233d(this, C142195a.class, new C142212k(f));
            C47393f.m84233d(this, C142200f.class, new C142213l(f));
            C47393f.m84233d(this, C142186a.class, new C142214m(f));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142203b.m230861a(th, th);
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
        WebGlideDefaultFragment webGlideDefaultFragment = this;
        webGlideDefaultFragment.f122869b.mo51381i();
        try {
            if (!webGlideDefaultFragment.f385777e) {
                super.onAttach(context);
                if (webGlideDefaultFragment.f385774a == null) {
                    Object jN = mo117054a().mo17653jN();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    C47627i ha = ((C74176nj) jN).mo69843ha();
                    C142174e eVar = (C142174e) ((C74176nj) jN).f206656F.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof WebGlideDefaultFragment) {
                        WebGlideDefaultFragment webGlideDefaultFragment2 = (WebGlideDefaultFragment) fragment;
                        C68225k.m98532d(webGlideDefaultFragment2);
                        C47449e eVar2 = (C47449e) ((C74176nj) jN).f207092s.mo17428b();
                        Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                        C142199e eVar3 = new C142199e(((C74176nj) jN).f206677a.g);
                        C47770dh dhVar = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                        C142215n nVar = (C142215n) ((C74176nj) jN).f206771bo.mo17428b();
                        C142222e eVar4 = new C142222e((C142215n) ((C74176nj) jN).f206771bo.mo17428b(), new C142216a(((C38769r) ((C74176nj) jN).f206730b.f198027a.f199228b.mo66461ij()).mo41618a(C38828b.WEBGLIDE)), (C142176g) ((C74176nj) jN).f206730b.f198027a.f199480fn.mo17428b());
                        C142222e eVar5 = eVar4;
                        webGlideDefaultFragment = this;
                        webGlideDefaultFragment.f385774a = new C142211j(activity, ha, eVar, webGlideDefaultFragment2, eVar2, context2, eVar3, dhVar, abVar, mVar, nVar, eVar5, new C142169h((C42876ab) ((C74176nj) jN).f206730b.f198027a.f199588hp.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.n.mo17428b()), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C39141kp) ((C74176nj) jN).f206677a.v.mo17428b(), (C142176g) ((C74176nj) jN).f206730b.f198027a.f199480fn.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(webGlideDefaultFragment.f122869b, webGlideDefaultFragment.f385776d));
                    } else {
                        String obj = C142211j.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = webGlideDefaultFragment.f122869b;
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
