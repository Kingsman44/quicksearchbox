package com.google.android.apps.gsa.assistant.settings.features.p571aq;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.az.ak;
import com.google.android.apps.gsa.assistant.settings.features.az.bf;
import com.google.android.apps.gsa.assistant.settings.features.az.bs;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10019ar;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10054t;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81005a;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18514b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18516d;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18519g;
import com.google.android.material.tabs.TabLayout;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aq.f */
/* compiled from: PG */
public final class C10435f {

    /* renamed from: d */
    private static final C58974d f35163d = C58974d.m91136j();

    /* renamed from: e */
    private static final C58495hd f35164e;

    /* renamed from: a */
    public final C10432c f35165a;

    /* renamed from: b */
    public final bf f35166b;

    /* renamed from: c */
    public final C90021c f35167c;

    /* renamed from: f */
    private final bs f35168f;

    /* renamed from: g */
    private final C81006b f35169g;

    /* renamed from: h */
    private C18516d f35170h;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C18514b.QUICK_PHRASES_OPEN_TAB_UNSPECIFIED, 0);
        gzVar.mo55429h(C18514b.MOBILE, 0);
        gzVar.mo55429h(C18514b.SHARED_DEVICES, 1);
        f35164e = gzVar.mo55427f(false);
    }

    public C10435f(C10432c cVar, bf bfVar, bs bsVar, C81006b bVar, C90021c cVar2, C18516d dVar) {
        this.f35165a = cVar;
        this.f35166b = bfVar;
        this.f35168f = bsVar;
        this.f35169g = bVar;
        this.f35167c = cVar2;
        this.f35170h = dVar;
    }

    /* renamed from: a */
    public static C10432c m25410a(C18516d dVar) {
        C10432c cVar = new C10432c();
        C68324h.m98669f(cVar);
        C47243l.m84039a(cVar, dVar);
        return cVar;
    }

    /* renamed from: b */
    public final void mo18483b() {
        Fragment fragment;
        TabLayout tabLayout = (TabLayout) this.f35165a.requireView().findViewById(R.id.tab_layout);
        tabLayout.getClass();
        tabLayout.setVisibility(0);
        this.f35165a.requireView().findViewById(R.id.content_container).setVisibility(0);
        this.f35165a.requireView().findViewById(R.id.loading_view).setVisibility(8);
        if (C81005a.m128912a(this.f35169g)) {
            C18519g gVar = this.f35170h.f52477b;
            if (gVar == null) {
                gVar = C18519g.f52480e;
            }
            fragment = C10054t.m24847a(gVar);
        } else {
            fragment = new C10019ar();
            C68324h.m98669f(fragment);
        }
        C0154a aVar = new C0154a(this.f35165a.getChildFragmentManager());
        aVar.mo689v(R.id.mobile_container, fragment, (String) null);
        ak akVar = new ak();
        C68324h.m98669f(akVar);
        aVar.mo689v(R.id.shared_devices_container, akVar, (String) null);
        aVar.mo509f();
        C18514b a = C18514b.m35980a(this.f35170h.f52478c);
        if (a == null) {
            a = C18514b.QUICK_PHRASES_OPEN_TAB_UNSPECIFIED;
        }
        a.name();
        if (!a.equals(C18514b.QUICK_PHRASES_OPEN_TAB_UNSPECIFIED)) {
            tabLayout.mo48413h(tabLayout.mo48406b(((Integer) f35164e.getOrDefault(a, 0)).intValue()), true);
        }
        this.f35170h = C18516d.f52474d;
        if (!C81005a.m128913b(this.f35169g)) {
            if (a.equals(C18514b.MOBILE)) {
                ((C58970a) ((C58970a) f35163d.mo56226d()).mo56372aa(1248)).mo56386p("#MWW OpenTab has mobile, but mobile settings are ineligible.");
            }
            tabLayout.mo48413h(tabLayout.mo48406b(((Integer) f35164e.getOrDefault(C18514b.SHARED_DEVICES, 0)).intValue()), true);
            tabLayout.setVisibility(8);
        }
        if (!this.f35168f.g()) {
            if (a.equals(C18514b.SHARED_DEVICES)) {
                ((C58970a) ((C58970a) f35163d.mo56226d()).mo56372aa(1247)).mo56386p("#MWW OpenTab has shared devices, but shared devices settings are ineligible.");
            }
            tabLayout.mo48413h(tabLayout.mo48406b(((Integer) f35164e.getOrDefault(C18514b.MOBILE, 0)).intValue()), true);
            tabLayout.setVisibility(8);
        }
    }
}
