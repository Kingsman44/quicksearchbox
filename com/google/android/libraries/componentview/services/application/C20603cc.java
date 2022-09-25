package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.componentview.services.application.cc */
/* compiled from: PG */
public final /* synthetic */ class C20603cc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C20606cf f57804a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f57805b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f57806c;

    /* renamed from: d */
    public final /* synthetic */ C20605ce f57807d;

    public /* synthetic */ C20603cc(C20606cf cfVar, C60870cx cxVar, C60870cx cxVar2, C20605ce ceVar) {
        this.f57804a = cfVar;
        this.f57805b = cxVar;
        this.f57806c = cxVar2;
        this.f57807d = ceVar;
    }

    public final Object call() {
        C20606cf cfVar = this.f57804a;
        C60870cx cxVar = this.f57805b;
        C60870cx cxVar2 = this.f57806c;
        C20605ce ceVar = this.f57807d;
        Uri.Builder appendPath = new Uri.Builder().scheme((String) C60856cj.m92909r(cxVar2)).authority((String) C60856cj.m92909r(cxVar)).appendPath("httpservice").appendPath("RETRY".toLowerCase()).appendPath(cfVar.mo25494b()).appendPath(cfVar.mo25493a());
        C20616g gVar = (C20616g) ceVar;
        if (!TextUtils.isEmpty(gVar.f57834b)) {
            appendPath.appendQueryParameter("pf", gVar.f57834b);
        }
        if (!TextUtils.isEmpty(gVar.f57833a)) {
            appendPath.appendQueryParameter("ved", gVar.f57833a);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            appendPath.appendQueryParameter("vet", (String) null);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                appendPath.appendQueryParameter("ei", (String) null);
            }
        }
        return appendPath.build();
    }
}
