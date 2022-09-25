package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10276d;

import android.content.Context;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136072b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.p3348b.p3349a.C43239d;
import com.google.android.libraries.web.contrib.p3367d.p3368a.C43462a;
import com.google.android.libraries.web.contrib.p3367d.p3368a.C43465b;
import com.google.android.libraries.web.contrib.p3367d.p3368a.p3369a.C43464b;
import com.google.android.libraries.web.contrib.p3367d.p3370b.C43466a;
import com.google.android.libraries.web.contrib.p3367d.p3370b.p3371a.C43468b;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.d.a */
/* compiled from: PG */
public final class C135631a implements C43541a {

    /* renamed from: a */
    private final C136072b f369453a;

    /* renamed from: b */
    private final Context f369454b;

    /* renamed from: c */
    private final C43466a f369455c;

    public C135631a(C136072b bVar, C43466a aVar, Context context) {
        this.f369453a = bVar;
        this.f369455c = aVar;
        this.f369454b = context;
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.googleapp_browser_actionbutton_findinpage;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 92798;
    }

    /* renamed from: c */
    public final CharSequence mo46596c() {
        return this.f369454b.getResources().getString(R.string.gab_actionbutton_findinpage);
    }

    /* renamed from: d */
    public final void mo46597d() {
        C43239d e;
        C43468b bVar = (C43468b) this.f369455c;
        if (!bVar.f113549a.mo46534c() && (e = bVar.mo46541e()) != null && e.mo46324e(bVar.f113550b)) {
            C43464b bVar2 = bVar.f113549a;
            C43462a aVar = (C43462a) ((C43465b) bVar2.f113537b.mo47045a()).toBuilder();
            aVar.copyOnWrite();
            C43465b bVar3 = (C43465b) aVar.instance;
            bVar3.f113541a |= 32;
            bVar3.f113547g = true;
            bVar2.f113537b.mo47046b((C43465b) aVar.build());
            bVar2.f113538c.mo50787a(C60866ct.f164955a, "WebX_FindInPageState");
            this.f369453a.mo112730a("FindInPageBarFragmentPeer");
        }
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo46598e() {
        return true;
    }
}
