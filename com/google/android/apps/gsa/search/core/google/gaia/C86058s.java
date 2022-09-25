package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.apps.gsa.shared.util.p7172j.C91044a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.s */
/* compiled from: PG */
public final /* synthetic */ class C86058s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232637a;

    public /* synthetic */ C86058s(C86013ax axVar) {
        this.f232637a = axVar;
    }

    public final void run() {
        C58528ij ijVar;
        C86013ax axVar = this.f232637a;
        synchronized (axVar.f232567o) {
            Set set = (Set) ((C58833ax) C60856cj.m92910s(axVar.f232561i.mo37977a())).mo56111f();
            C91044a aVar = axVar.f232554b;
            String[] stringArray = aVar.f254288b.getApplicationRestrictions(aVar.f254287a.getPackageName()).getStringArray("whitelisted_google_account_names");
            if (stringArray == null) {
                ijVar = null;
            } else {
                ijVar = C58528ij.m90006F(Arrays.asList(stringArray));
            }
            if (!C58832aw.m90831a(set, ijVar)) {
                C60856cj.m92910s(axVar.f232561i.mo37979c(ijVar));
                axVar.mo79680n();
            }
        }
    }
}
