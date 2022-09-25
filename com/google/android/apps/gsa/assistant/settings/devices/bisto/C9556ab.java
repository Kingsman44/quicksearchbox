package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142342bu;
import com.google.android.p10712d.C142346by;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59336s;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ab */
/* compiled from: PG */
public final class C9556ab extends C9504g {

    /* renamed from: i */
    public static final C59071e f33117i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.ab");

    /* renamed from: j */
    public final String f33118j;

    /* renamed from: k */
    private final C89496ch f33119k;

    /* renamed from: l */
    private final C22871g f33120l;

    /* renamed from: m */
    private C60870cx f33121m;

    /* renamed from: n */
    private boolean f33122n;

    public C9556ab(C89496ch chVar, C22871g gVar, String str) {
        this.f33119k = chVar;
        this.f33120l = gVar;
        this.f33118j = str;
    }

    /* renamed from: F */
    private final void m24254F(String str, String str2) {
        PreferenceScreen e = mo17792e();
        PreferenceCategory preferenceCategory = new PreferenceCategory(e.f12738j);
        preferenceCategory.f12718D = R.layout.preference_category_license;
        preferenceCategory.mo8347N(str);
        preferenceCategory.mo8329n(str2);
        e.mo8379af(preferenceCategory);
    }

    /* renamed from: b */
    private final void m24255b(String str, int i) {
        String str2;
        InputStreamReader inputStreamReader = new InputStreamReader(mo17792e().f12738j.getResources().openRawResource(i));
        try {
            str2 = C59336s.m92218a(inputStreamReader).toString();
            inputStreamReader.close();
        } catch (IOException e) {
            C59104x d = f33117i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoLicensesCtrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(358)).mo56386p("Error reading license");
            int i2 = C90755l.f253831a;
            str2 = null;
        }
        if (str2 != null) {
            m24254F(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17871a(C124548d dVar, C142324bc bcVar) {
        HashSet hashSet = new HashSet();
        if (!(dVar == null || (bcVar.f386115a & 32) == 0)) {
            C142346by byVar = bcVar.f386120f;
            if (byVar == null) {
                byVar = C142346by.f386219m;
            }
            for (C142342bu buVar : byVar.f386228h) {
                int i = buVar.f386206a;
                if ((i & 1) == 0) {
                    C59104x d = f33117i.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoLicensesCtrl");
                    ((C59052c) ((C59052c) d).mo56372aa(362)).mo56389s("license does not have title %s", buVar);
                    int i2 = C90755l.f253831a;
                } else if ((i & 2) != 0) {
                    hashSet.add(buVar.f386207b);
                    m24254F(buVar.f386207b, buVar.f386208c);
                } else {
                    C59104x d2 = f33117i.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BistoLicensesCtrl");
                    ((C59052c) ((C59052c) d2).mo56372aa(361)).mo56389s("license does not have text %s", buVar);
                    int i3 = C90755l.f253831a;
                }
            }
        }
        if (!hashSet.contains("Nanopb")) {
            m24255b("Nanopb", R.raw.nanopb);
        }
        if (!hashSet.contains("Micro-ecc") && dVar != null && dVar.mo106490ad() && dVar.mo106514l().equals(C124721s.APOLLO)) {
            m24255b("Micro-ecc", R.raw.microecc);
        }
        this.f33122n = true;
        mo17800k();
    }

    /* renamed from: q */
    public final void mo17806q() {
        C60870cx cxVar = this.f33121m;
        if (cxVar != null && !cxVar.isDone()) {
            this.f33121m.cancel(false);
        }
        mo17800k();
    }

    /* renamed from: s */
    public final void mo17808s() {
        if (!this.f33122n) {
            String str = this.f33118j;
            if (str == null) {
                mo17871a((C124548d) null, C142324bc.f386113s);
                return;
            }
            C60870cx i = this.f33120l.mo28209i(this.f33119k.mo83409o(str), "populateLicenses", new C9640w(this));
            this.f33121m = i;
            C90873ag agVar = new C90873ag(i, this.f33120l, "getDeviceInfo", C9641x.f33363a);
            agVar.mo85224b(C124551g.class, new C9642y(this));
            agVar.mo85224b(CancellationException.class, C9643z.f33365a);
            agVar.mo85223a(new C9555aa(this));
            mo17790D(false);
        }
    }
}
