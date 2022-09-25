package com.google.apps.tiktok.dataservice.local;

import com.google.common.base.C58817ah;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.apps.tiktok.dataservice.local.ab */
/* compiled from: PG */
public final /* synthetic */ class C46827ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46838am f122243a;

    /* renamed from: b */
    public final /* synthetic */ C46841ap f122244b;

    public /* synthetic */ C46827ab(C46838am amVar, C46841ap apVar) {
        this.f122243a = amVar;
        this.f122244b = apVar;
    }

    public final Object apply(Object obj) {
        C46838am amVar = this.f122243a;
        C46841ap apVar = this.f122244b;
        Throwable th = (Throwable) obj;
        if (!(th instanceof CancellationException)) {
            apVar.mo50849a();
            amVar.mo50842c(apVar);
            return null;
        }
        throw ((CancellationException) th);
    }
}
