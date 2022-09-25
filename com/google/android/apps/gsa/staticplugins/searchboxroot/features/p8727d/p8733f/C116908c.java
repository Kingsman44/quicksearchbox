package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8733f;

import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88556g;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.p4017at.p4060h.p4073d.p4074a.C54230as;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.f.c */
/* compiled from: PG */
public final class C116908c implements C88556g {

    /* renamed from: a */
    private final C86124t f324582a;

    /* renamed from: b */
    private final C86338r f324583b;

    public C116908c(C86124t tVar, C86338r rVar) {
        this.f324582a = tVar;
        this.f324583b = rVar;
    }

    /* renamed from: a */
    public final int mo82218a() {
        return 8;
    }

    /* renamed from: b */
    public final C41626a mo82219b(C88616t tVar, C41626a aVar) {
        if (!this.f324582a.mo79746e(C90085ej.f250161al) || !TextUtils.isEmpty(tVar.f239556a.mo84352bk()) || !aVar.f108837b.getBoolean("gsa::aa") || !aVar.f108840e.f142363c || !TextUtils.isEmpty(this.f324583b.getString("previous_query", BuildConfig.FLAVOR))) {
            return aVar;
        }
        List list = aVar.f108836a;
        Bundle bundle = aVar.f108837b;
        C54230as asVar = (C54230as) aVar.f108840e.toBuilder();
        asVar.copyOnWrite();
        C54231at atVar = (C54231at) asVar.instance;
        atVar.f142361a |= 4;
        atVar.f142363c = false;
        return new C41626a(list, bundle, false, true, (C54231at) asVar.build());
    }
}
