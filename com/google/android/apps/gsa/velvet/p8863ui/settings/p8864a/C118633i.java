package com.google.android.apps.gsa.velvet.p8863ui.settings.p8864a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.preferences.PrivacyAndSecurityFragment;
import com.google.android.apps.gsa.settingsui.C88992g;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118651e;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118686y;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118639b;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118640c;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.a.i */
/* compiled from: PG */
public final class C118633i implements C88992g {

    /* renamed from: a */
    public final Context f330962a;

    /* renamed from: b */
    private final C84474e f330963b;

    /* renamed from: c */
    private final C86054o f330964c;

    /* renamed from: d */
    private final C118686y f330965d;

    /* renamed from: e */
    private final C60887da f330966e;

    public C118633i(Context context, C84474e eVar, C86054o oVar, C118686y yVar, C60887da daVar) {
        this.f330962a = context;
        this.f330963b = eVar;
        this.f330964c = oVar;
        this.f330965d = yVar;
        this.f330966e = daVar;
    }

    /* renamed from: a */
    public final C58495hd mo17755a() {
        return C58729pv.f156485a;
    }

    /* renamed from: b */
    public final C60870cx mo17756b() {
        C60870cx b = this.f330965d.mo103868b(C137589b.LOCATION_CONSENT);
        return C47638k.m84751b(b).mo51520a(new C118632h(this, b), this.f330966e);
    }

    /* renamed from: c */
    public final List mo17757c() {
        ArrayList arrayList = new ArrayList();
        if (this.f330963b.mo78073R()) {
            C118639b bVar = (C118639b) C118640c.f330976g.createBuilder();
            String string = this.f330962a.getString(R.string.location_setting_title);
            bVar.copyOnWrite();
            C118640c cVar = (C118640c) bVar.instance;
            string.getClass();
            cVar.f330978a |= 2;
            cVar.f330980c = string;
            String string2 = this.f330962a.getString(R.string.location_setting_preference);
            bVar.copyOnWrite();
            C118640c cVar2 = (C118640c) bVar.instance;
            string2.getClass();
            cVar2.f330978a |= 1;
            cVar2.f330979b = string2;
            bVar.copyOnWrite();
            C118640c cVar3 = (C118640c) bVar.instance;
            cVar3.f330978a |= 16;
            cVar3.f330983f = true;
            String name = PrivacyAndSecurityFragment.class.getName();
            bVar.copyOnWrite();
            C118640c cVar4 = (C118640c) bVar.instance;
            name.getClass();
            cVar4.f330978a |= 8;
            cVar4.f330982e = name;
            arrayList.add((C118640c) bVar.build());
            if (this.f330963b.mo78128q()) {
                C118639b bVar2 = (C118639b) C118640c.f330976g.createBuilder();
                String string3 = this.f330962a.getString(R.string.ads_personalization_title);
                bVar2.copyOnWrite();
                C118640c cVar5 = (C118640c) bVar2.instance;
                string3.getClass();
                cVar5.f330978a |= 2;
                cVar5.f330980c = string3;
                String string4 = this.f330962a.getString(R.string.ads_personalization_setting_preference);
                bVar2.copyOnWrite();
                C118640c cVar6 = (C118640c) bVar2.instance;
                string4.getClass();
                cVar6.f330978a |= 1;
                cVar6.f330979b = string4;
                String name2 = PrivacyAndSecurityFragment.class.getName();
                bVar2.copyOnWrite();
                C118640c cVar7 = (C118640c) bVar2.instance;
                name2.getClass();
                cVar7.f330978a |= 8;
                cVar7.f330982e = name2;
                arrayList.add((C118640c) bVar2.build());
            }
            if (this.f330964c.mo79668a() == null) {
                C118639b bVar3 = (C118639b) C118640c.f330976g.createBuilder();
                String string5 = this.f330962a.getString(R.string.search_customization_title);
                bVar3.copyOnWrite();
                C118640c cVar8 = (C118640c) bVar3.instance;
                string5.getClass();
                cVar8.f330978a |= 2;
                cVar8.f330980c = string5;
                String string6 = this.f330962a.getString(R.string.signed_out_search_preference);
                bVar3.copyOnWrite();
                C118640c cVar9 = (C118640c) bVar3.instance;
                string6.getClass();
                cVar9.f330978a |= 1;
                cVar9.f330979b = string6;
                String name3 = PrivacyAndSecurityFragment.class.getName();
                bVar3.copyOnWrite();
                C118640c cVar10 = (C118640c) bVar3.instance;
                name3.getClass();
                cVar10.f330978a |= 8;
                cVar10.f330982e = name3;
                arrayList.add((C118640c) bVar3.build());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo17758d(C118651e eVar) {
        if (this.f330963b.mo78073R()) {
            return eVar.mo103835a(R.xml.privacy_and_security_header);
        }
        return new ArrayList();
    }
}
