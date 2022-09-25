package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.componentview.services.application.ag */
/* compiled from: PG */
public final /* synthetic */ class C20553ag implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f57724a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f57725b;

    /* renamed from: c */
    public final /* synthetic */ LogData f57726c;

    public /* synthetic */ C20553ag(C60870cx cxVar, C60870cx cxVar2, LogData logData) {
        this.f57724a = cxVar;
        this.f57725b = cxVar2;
        this.f57726c = logData;
    }

    public final Object call() {
        C60870cx cxVar = this.f57724a;
        C60870cx cxVar2 = this.f57725b;
        LogData logData = this.f57726c;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme((String) C60856cj.m92909r(cxVar)).authority((String) C60856cj.m92909r(cxVar2)).appendPath("url");
        builder.appendQueryParameter("sa", "T");
        String c = logData.mo25459c();
        if (!TextUtils.isEmpty(c)) {
            builder.appendQueryParameter("sig2", c);
        }
        builder.appendQueryParameter("ved", logData.mo25464g());
        String e = logData.mo25461e();
        if (!TextUtils.isEmpty(e)) {
            builder.appendQueryParameter("url", e);
        }
        String d = logData.mo25460d();
        if (!TextUtils.isEmpty(d)) {
            builder.appendQueryParameter("sqi", d);
        }
        String b = logData.mo25458b();
        if (!TextUtils.isEmpty(b)) {
            builder.appendQueryParameter("psig", b);
        }
        String f = logData.mo25463f();
        if (!TextUtils.isEmpty(f)) {
            builder.appendQueryParameter("ust", f);
        }
        return builder.build();
    }
}
