package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.r */
/* compiled from: PG */
public final /* synthetic */ class C29306r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79427a;

    public /* synthetic */ C29306r(C29314z zVar) {
        this.f79427a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C29314z zVar = this.f79427a;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C28816c a : (List) obj) {
            arrayList.add(a.mo34483a());
        }
        C60870cx e = zVar.f79441b.mo34600e();
        C29313y yVar = new C29313y(zVar, arrayList, hashSet);
        return C60922j.m93044g(e, C47810es.m84963c(yVar), zVar.f79449j);
    }
}
