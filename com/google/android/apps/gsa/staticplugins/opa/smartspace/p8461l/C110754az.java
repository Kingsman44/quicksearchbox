package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.az */
/* compiled from: PG */
public final /* synthetic */ class C110754az implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308578a;

    public /* synthetic */ C110754az(C110764bi biVar) {
        this.f308578a = biVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Object obj2;
        C110764bi biVar = this.f308578a;
        Pair pair = (Pair) obj;
        if (((List) pair.second).isEmpty()) {
            obj2 = C58836b.f156633a;
        } else {
            obj2 = C58833ax.m90834k((C83741am) ((List) pair.second).get(0));
        }
        return C60856cj.m92900i(new Pair(obj2, biVar.mo98870h((List) pair.first)));
    }
}
