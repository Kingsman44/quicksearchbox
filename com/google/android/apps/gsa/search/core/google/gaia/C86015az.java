package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.apps.gsa.assistant.shared.C73850cd;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.az */
/* compiled from: PG */
public final class C86015az implements C118549h {

    /* renamed from: a */
    private final C86054o f232579a;

    /* renamed from: b */
    private final C86124t f232580b;

    /* renamed from: c */
    private final C73850cd f232581c;

    public C86015az(C86054o oVar, C86124t tVar, C73850cd cdVar) {
        this.f232579a = oVar;
        this.f232580b = tVar;
        this.f232581c = cdVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(this.f232580b.mo79758x(C90120fr.f250807aT));
        if (!this.f232580b.mo79746e(C90086ek.f250521s)) {
            hashSet.add("oauth2:https://www.googleapis.com/auth/googlenow");
        }
        if (this.f232580b.mo79746e(C89997bc.f246819p)) {
            hashSet.add(this.f232580b.mo79758x(C89997bc.f246820q));
        }
        for (String str : hashSet) {
            C86054o oVar = this.f232579a;
            oVar.mo79678l(oVar.mo79661H(str, 10000, false));
            this.f232579a.mo79661H(str, 10000, false);
        }
        this.f232581c.e();
        return C118826c.f331423b;
    }
}
