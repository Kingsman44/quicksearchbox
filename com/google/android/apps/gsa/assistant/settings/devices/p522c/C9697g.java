package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.g */
/* compiled from: PG */
public final class C9697g extends C9714x {

    /* renamed from: a */
    public C69464a f33506a;

    /* renamed from: b */
    public C69464a f33507b;

    /* renamed from: c */
    public C69464a f33508c;

    /* renamed from: d */
    public C69464a f33509d;

    /* renamed from: e */
    public C69464a f33510e;

    /* renamed from: f */
    public C69464a f33511f;

    /* renamed from: g */
    public C69464a f33512g;

    /* renamed from: h */
    public C69464a f33513h;

    /* renamed from: i */
    public C86124t f33514i;

    /* renamed from: j */
    public C58833ax f33515j;

    /* renamed from: k */
    public C9650ae f33516k;

    /* renamed from: l */
    public View f33517l;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C73778a.m108339b(this);
        this.f33517l = layoutInflater.inflate(R.layout.fragment_nexus_settings, viewGroup, false);
        if (bundle == null) {
            C0154a aVar = new C0154a(getChildFragmentManager());
            aVar.mo511h(R.id.settings_nexus_opa_user_enabled_container, (Fragment) this.f33506a.mo17428b(), (String) null, 1);
            if (this.f33514i.mo79746e(C90014bt.f247375fv) || ((Boolean) ((C110045b) ((C58847bk) this.f33515j).f156646a).f306610b.mo6453a()).booleanValue()) {
                aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33512g.mo17428b(), (String) null, 1);
            }
            aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33507b.mo17428b(), (String) null, 1);
            aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33508c.mo17428b(), (String) null, 1);
            aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33509d.mo17428b(), (String) null, 1);
            aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33510e.mo17428b(), (String) null, 1);
            aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33511f.mo17428b(), (String) null, 1);
            C86124t tVar = this.f33514i;
            if (!tVar.mo79746e(C90059dk.f249025O) && (tVar.mo79746e(C90014bt.f247587jv) || tVar.mo79746e(C90082eg.f249872O))) {
                aVar.mo511h(R.id.settings_nexus_page_content_container, (Fragment) this.f33513h.mo17428b(), (String) null, 1);
            }
            aVar.mo509f();
        }
        this.f33516k.f33388a.mo5704e(this, new C9696f(this));
        C28295m.m52919e(this.f33517l, new C28292j(67939));
        C89949q.m146521e(C28285c.m52874a(this.f33517l, 61687), false);
        return this.f33517l;
    }
}
