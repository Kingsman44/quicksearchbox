package com.google.android.libraries.onegoogle.accountmenu.gmshead;

import android.content.Context;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30304m;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30493f;
import com.google.android.libraries.onegoogle.common.C30933t;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.p2380c.C30834a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Deprecated
/* renamed from: com.google.android.libraries.onegoogle.accountmenu.gmshead.a */
/* compiled from: PG */
public final class C30645a {
    /* renamed from: a */
    public static final C30305n m57296a(Context context, C28421h hVar, C30474o oVar, C30518b bVar, C31012n nVar) {
        C30493f fVar = new C30493f();
        C30306o oVar2 = new C30306o(fVar);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(C30933t.m57729a());
        C30304m f = C30305n.m56405f(context, C30492e.class);
        C30309r rVar = (C30309r) f;
        rVar.f81942d = fVar;
        rVar.f81941c = oVar2;
        rVar.f81945g = new C30834a(fVar, context);
        f.mo35842p(newCachedThreadPool);
        f.mo35849w(hVar);
        if (oVar != null) {
            rVar.f81946h = oVar;
        }
        if (bVar != null) {
            rVar.f81943e = bVar;
        }
        rVar.f81944f = new C30649e(context, nVar, true);
        return f.mo35830d();
    }
}
