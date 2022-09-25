package com.google.android.libraries.lens.view.filters;

import android.content.res.Resources;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25986j;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2074ap.C25464d;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.filters.x */
/* compiled from: PG */
public final class C26236x implements C27654a {

    /* renamed from: e */
    private static final C59071e f71285e = C59071e.m91332i("com.google.android.libraries.lens.view.filters.x");

    /* renamed from: a */
    public final C26234v f71286a;

    /* renamed from: b */
    public final C25466f f71287b;

    /* renamed from: c */
    public final C25989d f71288c;

    /* renamed from: d */
    public C25986j f71289d;

    /* renamed from: f */
    private final C24974a f71290f;

    /* renamed from: g */
    private final Map f71291g;

    public C26236x(C26234v vVar, C25466f fVar, C24974a aVar, C25989d dVar, Map map) {
        this.f71286a = vVar;
        this.f71287b = fVar;
        this.f71290f = aVar;
        this.f71288c = dVar;
        this.f71291g = map;
    }

    /* renamed from: a */
    public final void mo31451a(C25497ac acVar, C25981e eVar) {
        FragmentManager childFragmentManager = this.f71286a.getChildFragmentManager();
        if (childFragmentManager.mo461ab()) {
            ((C59052c) ((C59052c) f71285e.mo56226d()).mo56372aa(49359)).mo56386p("Should not perform the commit after onSaveInstanceState.");
            return;
        }
        C25980d d = eVar.mo31185d();
        if (!acVar.mo30524a() || !this.f71291g.containsKey(d)) {
            Fragment c = childFragmentManager.f634a.mo671c("filter_settings_fragment");
            if (c != null) {
                C0154a aVar = new C0154a(this.f71286a.getChildFragmentManager());
                aVar.mo516m(c);
                aVar.f814j = 4099;
                aVar.mo509f();
            }
            this.f71289d = null;
            return;
        }
        C25986j jVar = (C25986j) ((C69464a) this.f71291g.get(d)).mo17428b();
        C0154a aVar2 = new C0154a(childFragmentManager);
        aVar2.mo689v(R.id.filter_settings_container, jVar.mo31044a(), "filter_settings_fragment");
        aVar2.f814j = 4099;
        aVar2.mo509f();
        this.f71289d = jVar;
    }

    /* renamed from: b */
    public final void mo31452b() {
        View view = this.f71286a.getView();
        if (view != null) {
            Resources resources = view.getResources();
            view.findViewById(R.id.filter_settings_container).setPadding(0, ((C25464d) this.f71287b.f69401a.mo3842a()).mo30499a() + resources.getDimensionPixelSize(true != (!C24974a.m46225a(this.f71290f.f68122a) && resources.getConfiguration().orientation == 2) ? R.dimen.lens_overlay_scrim_height : R.dimen.filter_settings_phone_landscape_top_margin), 0, 0);
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("FilterSettingsContainerFragmentPeer");
        C25986j jVar = this.f71289d;
        if (jVar != null) {
            eVar.mo33146c(jVar);
        }
    }
}
