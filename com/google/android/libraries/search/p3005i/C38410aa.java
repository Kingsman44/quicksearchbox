package com.google.android.libraries.search.p3005i;

import android.content.Context;
import com.google.android.libraries.search.p3005i.C38411ab;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.i.aa */
/* compiled from: PG */
public final /* synthetic */ class C38410aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Context f101666a;

    /* renamed from: b */
    public final /* synthetic */ C46128f f101667b;

    /* renamed from: c */
    public final /* synthetic */ C60887da f101668c;

    public /* synthetic */ C38410aa(Context context, C46128f fVar, C60887da daVar) {
        this.f101666a = context;
        this.f101667b = fVar;
        this.f101668c = daVar;
    }

    public final C60870cx apply(Object obj) {
        Context context = this.f101666a;
        C46128f fVar = this.f101667b;
        C60887da daVar = this.f101668c;
        ArrayList arrayList = new ArrayList();
        for (C46108a aVar : (List) obj) {
            arrayList.add(C60922j.m93044g(fVar.mo50215b(aVar.mo50209a()), C47810es.m84963c(new C38479w(((C38411ab.C38412a) C47245e.m84045a(context, C38411ab.C38412a.class, aVar.mo50209a())).mo41414iT())), daVar));
        }
        return C47638k.m84752c(arrayList).mo51520a(new C38480x(arrayList), daVar);
    }
}
