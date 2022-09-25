package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2242f.C29098l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.mdi.download.d.fr */
/* compiled from: PG */
public final /* synthetic */ class C29130fr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29148gi f79003a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f79004b;

    public /* synthetic */ C29130fr(C29148gi giVar, Comparator comparator) {
        this.f79003a = giVar;
        this.f79004b = comparator;
    }

    public final C60870cx apply(Object obj) {
        C29148gi giVar = this.f79003a;
        Comparator comparator = this.f79004b;
        C60870cx n = giVar.mo34611n(giVar.f79038a.mo34598c());
        C29145gf gfVar = new C29145gf(giVar, (C29098l) obj, comparator);
        return C60922j.m93045h(n, C47810es.m84966f(gfVar), giVar.f79039b);
    }
}
