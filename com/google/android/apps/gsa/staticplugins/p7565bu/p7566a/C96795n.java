package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29554bg;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.n */
/* compiled from: PG */
public final /* synthetic */ class C96795n implements C29554bg {

    /* renamed from: a */
    public final /* synthetic */ String f270722a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f270723b;

    /* renamed from: c */
    public final /* synthetic */ String f270724c;

    public /* synthetic */ C96795n(String str, C69464a aVar, String str2) {
        this.f270722a = str;
        this.f270723b = aVar;
        this.f270724c = str2;
    }

    /* renamed from: a */
    public final C60870cx mo33117a(C58833ax axVar) {
        String str = this.f270722a;
        C69464a aVar = this.f270723b;
        String str2 = this.f270724c;
        C28798cm cmVar = (C28798cm) C28803cr.f78265n.createBuilder();
        cmVar.copyOnWrite();
        C28803cr crVar = (C28803cr) cmVar.instance;
        crVar.f78267a |= 8;
        crVar.f78270d = str;
        String languageTag = ((Locale) aVar.mo17428b()).toLanguageTag();
        cmVar.copyOnWrite();
        C28803cr crVar2 = (C28803cr) cmVar.instance;
        languageTag.getClass();
        crVar2.f78267a |= 32;
        crVar2.f78272f = languageTag;
        cmVar.copyOnWrite();
        C28803cr crVar3 = (C28803cr) cmVar.instance;
        crVar3.f78267a |= 16;
        crVar3.f78271e = str2;
        return C60856cj.m92900i((C28803cr) cmVar.build());
    }
}
