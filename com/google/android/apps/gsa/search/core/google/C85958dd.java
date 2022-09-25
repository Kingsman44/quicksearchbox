package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.dd */
/* compiled from: PG */
public final class C85958dd {

    /* renamed from: a */
    private final C86124t f232465a;

    /* renamed from: b */
    private final C85919cm f232466b;

    /* renamed from: c */
    private final String f232467c;

    public C85958dd(C86124t tVar, C85919cm cmVar, Context context) {
        this.f232465a = tVar;
        this.f232466b = cmVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f232467c = displayMetrics != null ? String.valueOf(displayMetrics.density) : BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final void mo79624a(C85981c cVar, Query query, String str) {
        String str2;
        int i;
        C58495hd hdVar;
        if (TextUtils.isEmpty(query.mo84352bk())) {
            if (query.mo84414cu()) {
                String x = this.f232465a.mo79758x(C90120fr.f250849p);
                if (!TextUtils.isEmpty(x)) {
                    cVar.mo79638d(x, this.f232465a.mo79758x(C90120fr.f250850q));
                }
            }
            cVar.mo79638d("q", BuildConfig.FLAVOR);
        }
        if (str != null) {
            cVar.mo79638d("sclient", str);
        }
        int a = C89235z.m145129a(query);
        if (a >= 0) {
            cVar.mo79638d("cp", Integer.toString(a));
        }
        C85919cm cmVar = this.f232466b;
        synchronized (cmVar.f232288b) {
            if (cmVar.f232302p == null || cmVar.f232301o != cmVar.f232300n) {
                cmVar.f232301o = cmVar.f232300n;
                long currentTimeMillis = System.currentTimeMillis();
                cmVar.f232302p = C85919cm.m138054a() + '.' + currentTimeMillis + '.' + cmVar.f232301o;
            }
            str2 = cmVar.f232302p;
        }
        cVar.mo79638d("psi", str2);
        C85919cm cmVar2 = this.f232466b;
        synchronized (cmVar2.f232288b) {
            i = cmVar2.f232303q;
            cmVar2.f232303q = i + 1;
        }
        cVar.mo79638d("ech", Integer.toString(i));
        if (!C58837ba.m90859h(this.f232467c)) {
            cVar.mo79638d("dpr", this.f232467c);
        }
        Bundle bundle = query.f252786y;
        if (bundle == null) {
            hdVar = C58729pv.f156485a;
        } else {
            hdVar = C58495hd.m89898l(C90772bp.m148314v(bundle.getBundle("android.search.extra.SUGGEST_CGI_PARAMETERS")));
        }
        for (Map.Entry entry : hdVar.entrySet()) {
            cVar.mo79638d((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
