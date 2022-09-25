package com.google.android.apps.search.googleapp.discover.settings.p10218c;

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
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.C134649j;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134640h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46778cv;
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
import dagger.hilt.p5299a.C68288b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.i */
/* compiled from: PG */
public final class C134648i extends C134663w implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134649j f366661a;

    /* renamed from: c */
    private Context f366662c;

    /* renamed from: d */
    private final C2393x f366663d = new C2393x(this);

    /* renamed from: e */
    private boolean f366664e;

    @Deprecated
    public C134648i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134649j mo17754z() {
        C134649j jVar = this.f366661a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f366664e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111858b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f366662c == null) {
            this.f366662c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f366662c;
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
        return this.f366663d;
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
            C134647h.m218406a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C134649j a = mo17754z();
            C69664n.m101061g(layoutInflater2, "inflater");
            C69664n.m101061g(viewGroup2, "parent");
            View inflate = layoutInflater2.inflate(R.layout.googleapp_discover_language_setting_screen, viewGroup2, false);
            Context context = layoutInflater.getContext();
            C69664n.m101060f(context, "inflater.context");
            if (a.f366676l.isEmpty()) {
                Map map = a.f366676l;
                C62971cq<C8506p> cqVar = ((C8509s) C62942bv.parseFrom((C62942bv) C8509s.f29522b, context.getResources().openRawResource(R.raw.default_search_languages), C62921ba.m95368a())).f29524a;
                C69664n.m101060f(cqVar, "parseFrom(\n          con…      .searchLanguageList");
                int b = C69505av.m100860b(C69540x.m100804k(cqVar, 10));
                if (b < 16) {
                    b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(b);
                for (C8506p pVar : cqVar) {
                    C69685i iVar = new C69685i(pVar.f29514b, pVar.f29513a);
                    linkedHashMap.put(iVar.f186052a, iVar.f186053b);
                }
                map.putAll(linkedHashMap);
            }
            C69664n.m101060f(inflate, "root");
            RecyclerView a2 = C134649j.m218414a(inflate);
            Context context2 = layoutInflater.getContext();
            C69664n.m101060f(context2, "inflater.context");
            a2.setLayoutManager(new LinearLayoutManager(context2));
            a.f366678n.clear();
            List<String> J = C69540x.m100828J(C69531o.m100939p(new String[]{Locale.getDefault().getCountry(), a.f366666b.getSimCountryIso(), a.f366666b.getNetworkCountryIso()}));
            ArrayList arrayList = new ArrayList();
            for (String orDefault : J) {
                C69540x.m100811r(arrayList, (List) Map.EL.getOrDefault(C134649j.f366665a, orDefault, C69496am.f185918a));
            }
            if (!arrayList.isEmpty()) {
                List list = a.f366678n;
                C134659s sVar = C134659s.SECTION_HEADER;
                String string = context2.getResources().getString(R.string.googleapp_disco_lang_suggested_section_header);
                C69664n.m101060f(string, "context.resources.getStr…suggested_section_header)");
                list.add(new C134658r(sVar, string, (String) null, 12));
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (Object next : arrayList) {
                    if (a.f366676l.containsKey((String) next)) {
                        arrayList2.add(next);
                    }
                }
                for (String str : arrayList2) {
                    a.f366678n.add(new C134658r(C134659s.LANGUAGE, (String) Map.EL.getOrDefault(a.f366676l, str, BuildConfig.FLAVOR), str, 8));
                }
            }
            List list2 = a.f366678n;
            C134659s sVar2 = C134659s.SECTION_HEADER;
            String string2 = context2.getResources().getString(R.string.googleapp_disco_lang_all_section_header);
            C69664n.m101060f(string2, "context.resources.getStr…_lang_all_section_header)");
            list2.add(new C134658r(sVar2, string2, (String) null, 12));
            java.util.Map map2 = a.f366676l;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList<C134658r> arrayList3 = new ArrayList<>(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                arrayList3.add(new C134658r(C134659s.LANGUAGE, (String) entry2.getValue(), (String) entry2.getKey(), 8));
            }
            for (C134658r add : arrayList3) {
                a.f366678n.add(add);
            }
            a2.setAdapter(new C134662v(a.f366678n, a.f366667c, a.f366668d, a.f366672h, a.f366673i, new C134651k(a)));
            a.f366671g.mo50707a(a.f366670f.f366646i, new C134649j.C134650a(a, inflate));
            C28306ab abVar = a.f366668d;
            C28313c a3 = a.f366667c.mo33805a(C28427h.m53115a(125756));
            a3.mo33859g(C45954d.m82060a(a.f366669e));
            abVar.mo33801b(inflate, a3);
            a.f366668d.mo33801b(C134649j.m218414a(inflate), a.f366667c.mo33805a(C28427h.m53115a(125757)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C134647h.m218406a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f366664e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134647h.m218406a(th, th);
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
            C134647h.m218406a(th, th);
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
            if (!this.f366664e) {
                super.onAttach(context);
                if (this.f366661a == null) {
                    Object jN = mo111866d().mo17653jN();
                    this.f366661a = new C134649j((TelephonyManager) ((C74176nj) jN).f206677a.b.f199956aW.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C134640h) ((C74176nj) jN).f206730b.f198027a.f199446fF.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f366663d));
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
                C134647h.m218406a(th, th2);
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
