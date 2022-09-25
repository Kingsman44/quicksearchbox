package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.res.Resources;
import android.preference.Preference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7681cm.p7683b.C97971d;
import com.google.android.apps.gsa.staticplugins.p7681cm.p7683b.C97972e;
import com.google.android.apps.gsa.staticplugins.p7681cm.p7683b.C97973f;
import com.google.android.apps.gsa.staticplugins.p7681cm.p7683b.C97975h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.j */
/* compiled from: PG */
public final class C98015j extends C88994i {

    /* renamed from: a */
    public static final C59071e f273679a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.j");

    /* renamed from: b */
    public final Resources f273680b;

    /* renamed from: c */
    public C60870cx f273681c;

    /* renamed from: d */
    private final C97975h f273682d;

    /* renamed from: e */
    private final C22871g f273683e;

    public C98015j(Resources resources, C97975h hVar, C22871g gVar) {
        this.f273680b = resources;
        this.f273682d = hVar;
        this.f273683e = gVar;
    }

    /* renamed from: a */
    private final void m162262a() {
        C60870cx cxVar = this.f273681c;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f273681c = null;
        }
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        m162262a();
        C97975h hVar = this.f273682d;
        C22871g gVar = hVar.f273563c;
        C60870cx i = hVar.f273563c.mo28209i(gVar.mo28210j(gVar.mo28210j(hVar.f273562b.mo79697b(), "Preferences Summary: get discover language store", new C97973f(hVar)), "Preferences Summary: get data from discover language store", new C97971d(hVar)), "Preferences Summary: get discover language from store data", C97972e.f273558a);
        this.f273681c = i;
        new C90873ag(i, this.f273683e, "GetDiscoverLanguageForSummaryPage", new C98012g(this, preference)).mo85223a(new C98013h(preference));
    }

    /* renamed from: e */
    public final void mo82943e() {
        m162262a();
    }
}
