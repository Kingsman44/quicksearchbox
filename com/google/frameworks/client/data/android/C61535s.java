package com.google.frameworks.client.data.android;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.frameworks.client.data.android.s */
/* compiled from: PG */
public final /* synthetic */ class C61535s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C61359aa f166332a;

    /* renamed from: b */
    public final /* synthetic */ C61365ag f166333b;

    public /* synthetic */ C61535s(C61359aa aaVar, C61365ag agVar) {
        this.f166332a = aaVar;
        this.f166333b = agVar;
    }

    public final C60870cx apply(Object obj) {
        C61359aa aaVar = this.f166332a;
        C61365ag agVar = this.f166333b;
        SettableFuture settableFuture = new SettableFuture();
        UrlRequest.Builder allowDirectExecutor = ((CronetEngine) obj).newUrlRequestBuilder(agVar.f165938a, new C61625z(settableFuture, aaVar.f165927b, agVar), C60826bg.f164896a).allowDirectExecutor();
        String str = agVar.f165944g;
        if (str != null) {
            allowDirectExecutor.setHttpMethod(str);
        }
        for (Map.Entry entry : agVar.f165940c.mo54948A()) {
            allowDirectExecutor.addHeader(((C61362ad) entry.getKey()).mo57931a(), (String) entry.getValue());
        }
        C61364af afVar = agVar.f165941d;
        if (afVar != null) {
            allowDirectExecutor.addHeader("Content-Type", afVar.f165936a);
            allowDirectExecutor.setUploadDataProvider(new C61621v(agVar.f165941d), C60826bg.f164896a);
        }
        if (allowDirectExecutor instanceof ExperimentalUrlRequest.Builder) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) allowDirectExecutor;
        }
        int i = agVar.f165943f;
        allowDirectExecutor.setPriority(3);
        C61359aa.f165925a.getAndIncrement();
        UrlRequest build = allowDirectExecutor.build();
        settableFuture.mo4106b(new C61619t(settableFuture, build), C60826bg.f164896a);
        String str2 = agVar.f165938a;
        build.start();
        return settableFuture;
    }
}
