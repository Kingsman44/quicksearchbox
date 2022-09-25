package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124524e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142355cg;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cm */
/* compiled from: PG */
final class C124888cm implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C124890co f344576a;

    public C124888cm(C124890co coVar) {
        this.f344576a = coVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        String str;
        Locale locale = (Locale) obj;
        C59104x b = C124890co.f344578a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UnsupportedLanguageFrag");
        ((C59052c) ((C59052c) b).mo56372aa(36351)).mo56354G("Locale %s %s", locale.getDisplayName(), locale.toLanguageTag());
        if (locale == null) {
            str = null;
        } else {
            str = locale.toLanguageTag();
        }
        C142324bc bcVar = this.f344576a.f344590m;
        bcVar.getClass();
        if (!bcVar.f386127m.contains(str)) {
            this.f344576a.f344586i.mo106637a().mo106662b("UnsupportedLocale");
            C44581b a = C124849bt.m204630a(this.f344576a.f344580c.requireContext());
            a.mo47604w(R.string.assistant_bisto_oobe_set_up_later_title);
            a.mo47601t(R.string.assistant_bisto_generic_next, new C47752cq(this.f344576a.f344584g, "quit", new C124886ck(this)));
            C142355cg cgVar = this.f344576a.f344590m.f386117c;
            if (cgVar == null) {
                cgVar = C142355cg.f386263b;
            }
            C124524e a2 = C124525f.m203985a(cgVar);
            a2.mo106449b(this.f344576a.f344580c.requireContext(), R.string.assistant_bisto_generic_device_type);
            a2.mo106448a(new C124887cl(this, a));
            a.create().show();
            return;
        }
        this.f344576a.mo106709a();
    }
}
