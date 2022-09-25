package com.google.android.apps.gsa.nga.engine.p6243v;

import android.os.Trace;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.m */
/* compiled from: PG */
public final /* synthetic */ class C79363m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C79365o f217904a;

    public /* synthetic */ C79363m(C79365o oVar) {
        this.f217904a = oVar;
    }

    public final C60870cx apply(Object obj) {
        C79365o oVar = this.f217904a;
        oVar.mo71204l();
        Trace.endAsyncSection(oVar.mo73921Y(), 0);
        return oVar.mo73918V(C60856cj.m92899h((Throwable) obj));
    }
}
