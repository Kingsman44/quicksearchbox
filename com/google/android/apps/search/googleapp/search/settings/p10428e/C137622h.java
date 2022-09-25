package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.search.settings.p10428e.p10429a.C137614b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.h */
/* compiled from: PG */
public final class C137622h extends C137627m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137625k f374342a;

    /* renamed from: c */
    private Context f374343c;

    /* renamed from: d */
    private final C2393x f374344d = new C2393x(this);

    /* renamed from: e */
    private boolean f374345e;

    @Deprecated
    public C137622h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137625k mo17754z() {
        C137625k kVar = this.f374342a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374345e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113865b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374343c == null) {
            this.f374343c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374343c;
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
        return this.f374344d;
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
            C137621g.m223591a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137625k a = mo17754z();
            a.f374352e.mo50828h(R.id.googleapp_search_selected_region_data_service_subscription_mixin, a.f374351d.f374323c, a.f374355h);
            a.f374353f.mo50429i(C137615b.f374326b);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137621g.m223591a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137625k a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            C69664n.m101061g(viewGroup, "container");
            View inflate = layoutInflater.inflate(R.layout.googleapp_search_region_preference_screen, viewGroup, false);
            C69664n.m101060f(inflate, "layoutInflater.inflate(R…screen, container, false)");
            Resources resources = a.f374349b.getResources();
            String[] stringArray = resources.getStringArray(R.array.googleapp_search_region_country_codes);
            C69664n.m101060f(stringArray, "resources.getStringArray…rch_region_country_codes)");
            String string = resources.getString(R.string.googleapp_search_region_default);
            C69664n.m101060f(string, "resources.getString(R.st…pp_search_region_default)");
            String string2 = resources.getString(R.string.googleapp_search_region_country_code_default);
            C69664n.m101060f(string2, "resources.getString(R.st…ion_country_code_default)");
            int b = C69505av.m100860b(r3);
            if (b < 16) {
                b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(b);
            for (String str : stringArray) {
                linkedHashMap.put(new Locale(BuildConfig.FLAVOR, str).getDisplayCountry(), str);
            }
            a.f374356i = C69505av.m100873o(linkedHashMap, new C69685i(string, string2));
            Map map = a.f374356i;
            List list = null;
            if (map == null) {
                C69664n.m101065k("localeDisplayNameToCountryCode");
                map = null;
            }
            List<String> S = C69540x.m100837S(C69540x.m100840V(map.keySet()), new C137623i(string));
            ArrayList arrayList = new ArrayList(C69540x.m100804k(S, 10));
            for (String str2 : S) {
                C137612a aVar = C137612a.f374318a;
                Map map2 = a.f374356i;
                if (map2 == null) {
                    C69664n.m101065k("localeDisplayNameToCountryCode");
                    map2 = null;
                }
                Object obj = map2.get(str2);
                C69664n.m101059e(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(new C137615b(aVar, str2, (String) obj));
            }
            a.f374357j = arrayList;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.googleapp_search_region_preferences_layout);
            recyclerView.setLayoutManager(new LinearLayoutManager(a.f374349b));
            C137620f fVar = a.f374354g;
            List list2 = a.f374357j;
            if (list2 == null) {
                C69664n.m101065k("searchRegionEntries");
            } else {
                list = list2;
            }
            C137614b bVar = (C137614b) fVar.f374339a.mo17428b();
            bVar.getClass();
            C47770dh dhVar = (C47770dh) fVar.f374340b.mo17428b();
            dhVar.getClass();
            C46439e eVar = (C46439e) fVar.f374341c.mo17428b();
            eVar.getClass();
            list.getClass();
            recyclerView.setAdapter(new C137619e(bVar, dhVar, eVar, list));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C137621g.m223591a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374345e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137621g.m223591a(th, th);
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
            C137621g.m223591a(th, th);
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
            if (!this.f374345e) {
                super.onAttach(context);
                if (this.f374342a == null) {
                    Object jN = mo113867d().mo17653jN();
                    this.f374342a = new C137625k((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C137614b) ((C74176nj) jN).f206686aI.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), new C137620f(((C74176nj) jN).f206686aI, ((C74176nj) jN).f206730b.f198663m, ((C74176nj) jN).f206942f));
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374344d));
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
                C137621g.m223591a(th, th2);
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
