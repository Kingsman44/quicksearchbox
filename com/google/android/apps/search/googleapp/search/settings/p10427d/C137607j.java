package com.google.android.apps.search.googleapp.search.settings.p10427d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.search.settings.p10424a.C137563c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.p395al.p408c.p414c.p416b.C8509s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.j */
/* compiled from: PG */
public final class C137607j extends C137610m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137609l f374292a;

    /* renamed from: c */
    private Context f374293c;

    /* renamed from: d */
    private final C2393x f374294d = new C2393x(this);

    /* renamed from: e */
    private boolean f374295e;

    @Deprecated
    public C137607j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137609l mo17754z() {
        C137609l lVar = this.f374292a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374295e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113854b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374293c == null) {
            this.f374293c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374293c;
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
        return this.f374294d;
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
            C137606i.m223566a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137609l a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            C69664n.m101061g(viewGroup, "container");
            View inflate = layoutInflater.inflate(R.layout.googleapp_search_language_preference_screen, viewGroup, false);
            C69664n.m101060f(inflate, "layoutInflater.inflate(R…screen, container, false)");
            Map map = a.f374305i;
            C8509s sVar = (C8509s) C62942bv.parseFrom((C62942bv) C8509s.f29522b, a.f374299c.getResources().openRawResource(R.raw.default_search_languages), C62921ba.m95368a());
            C69664n.m101060f(sVar, "parseFrom(\n        conte…neratedRegistry()\n      )");
            C62971cq<C8506p> cqVar = sVar.f29524a;
            C69664n.m101060f(cqVar, "getDefaultLanguages().searchLanguageList");
            ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
            for (C8506p pVar : cqVar) {
                arrayList.add(new C69685i(pVar.f29514b, pVar));
            }
            map.putAll(C69505av.m100874p(arrayList));
            String country = Locale.getDefault().getCountry();
            C69664n.m101060f(country, "getDefault().country");
            String lowerCase = country.toLowerCase(Locale.ROOT);
            C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            List<String> J = C69540x.m100828J(C69531o.m100939p(new String[]{lowerCase, a.f374303g.getSimCountryIso(), a.f374303g.getNetworkCountryIso()}));
            ArrayList arrayList2 = new ArrayList();
            for (String orDefault : J) {
                C69540x.m100811r(arrayList2, (List) Map.EL.getOrDefault(C137609l.f374297a, orDefault, C69496am.f185918a));
            }
            if (!arrayList2.isEmpty()) {
                List list = a.f374306j;
                C137598a aVar = C137598a.HEADER;
                String string = a.f374299c.getResources().getString(R.string.googleapp_search_language_suggested_section_header);
                C69664n.m101060f(string, "context.resources.getStr…suggested_section_header)");
                list.add(new C137599b(aVar, string, (String) null, (C8506p) null, 28));
                ArrayList<String> arrayList3 = new ArrayList<>();
                for (Object next : arrayList2) {
                    if (a.f374305i.containsKey((String) next)) {
                        arrayList3.add(next);
                    }
                }
                for (String str : arrayList3) {
                    C8506p pVar2 = (C8506p) C69505av.m100865g(a.f374305i, str);
                    List list2 = a.f374306j;
                    C137598a aVar2 = C137598a.LANGUAGE;
                    String str2 = pVar2.f29513a;
                    C69664n.m101060f(str2, "searchLanguageProto.languageDisplayName");
                    list2.add(new C137599b(aVar2, str2, str, pVar2, 16));
                }
            }
            List list3 = a.f374306j;
            C137598a aVar3 = C137598a.HEADER;
            String string2 = a.f374299c.getResources().getString(R.string.googleapp_search_language_preference_all_header);
            C69664n.m101060f(string2, "context.resources.getStr…ge_preference_all_header)");
            list3.add(new C137599b(aVar3, string2, (String) null, (C8506p) null, 28));
            java.util.Map map2 = a.f374305i;
            ArrayList<C137599b> arrayList4 = new ArrayList<>(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                C137598a aVar4 = C137598a.LANGUAGE;
                String str3 = ((C8506p) entry.getValue()).f29513a;
                C69664n.m101060f(str3, "it.value.languageDisplayName");
                arrayList4.add(new C137599b(aVar4, str3, (String) entry.getKey(), (C8506p) entry.getValue(), 16));
            }
            for (C137599b add : arrayList4) {
                a.f374306j.add(add);
            }
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.googleapp_search_language_preferences_layout);
            recyclerView.setLayoutManager(new LinearLayoutManager(a.f374299c));
            C137604g gVar = a.f374304h;
            List list4 = a.f374306j;
            C137563c cVar = (C137563c) gVar.f374289a.mo17428b();
            cVar.getClass();
            C47770dh dhVar = (C47770dh) gVar.f374290b.mo17428b();
            dhVar.getClass();
            recyclerView.setAdapter(new C137603f(cVar, dhVar, list4));
            a.f374302f.mo50828h(R.id.googleapp_search_selected_language_data_service_subscription_mixin, a.f374301e.f374174d, a.f374307k);
            C47831fm.m85019n();
            return inflate;
        } catch (C62974ct e) {
            throw new RuntimeException("Cannot read default languages from resources.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C137606i.m223566a(th, th2);
            }
            throw th;
        }
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374295e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137606i.m223566a(th, th);
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
            C137606i.m223566a(th, th);
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
            if (!this.f374295e) {
                super.onAttach(context);
                if (this.f374292a == null) {
                    Object jN = mo113855d().mo17653jN();
                    this.f374292a = new C137609l((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C137563c) ((C74176nj) jN).f206684aG.mo17428b(), (C46855i) ((C74176nj) jN).f206685aH.mo17428b(), (TelephonyManager) ((C74176nj) jN).f206677a.b.f199956aW.mo17428b(), new C137604g(((C74176nj) jN).f206684aG, ((C74176nj) jN).f206730b.f198663m));
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374294d));
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
                C137606i.m223566a(th, th2);
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
