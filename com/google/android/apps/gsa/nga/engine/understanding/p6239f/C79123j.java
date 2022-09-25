package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.j */
/* compiled from: PG */
public final /* synthetic */ class C79123j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79126m f217516a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f217517b;

    /* renamed from: c */
    public final /* synthetic */ int f217518c;

    /* renamed from: d */
    public final /* synthetic */ C61746h f217519d;

    public /* synthetic */ C79123j(C79126m mVar, C60870cx cxVar, int i, C61746h hVar) {
        this.f217516a = mVar;
        this.f217517b = cxVar;
        this.f217518c = i;
        this.f217519d = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C79126m mVar = this.f217516a;
        C60870cx cxVar = this.f217517b;
        int i = this.f217518c;
        C61746h hVar = this.f217519d;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            return mVar.f217522a.mo28209i(cxVar, "[NGA] ArgumentValueResolver.updateBuilder", new C79120g(i, hVar, optional));
        }
        cxVar.cancel(true);
        return C60856cj.m92898g();
    }
}
