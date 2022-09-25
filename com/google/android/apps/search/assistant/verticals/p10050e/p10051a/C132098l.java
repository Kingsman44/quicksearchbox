package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.l */
/* compiled from: PG */
public final /* synthetic */ class C132098l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132105s f360484a;

    /* renamed from: b */
    public final /* synthetic */ Uri f360485b;

    /* renamed from: c */
    public final /* synthetic */ int f360486c;

    public /* synthetic */ C132098l(C132105s sVar, Uri uri, int i) {
        this.f360484a = sVar;
        this.f360485b = uri;
        this.f360486c = i;
    }

    public final C60870cx apply(Object obj) {
        C132105s sVar = this.f360484a;
        Uri uri = this.f360485b;
        int i = this.f360486c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(false);
        }
        return new C60817ay((C60803ak) new C132101o(sVar, uri), sVar.f360498d).mo57272e(C47810es.m84970j(new C132102p(sVar, i)), sVar.f360498d).mo57271c(IOException.class, C132103q.f360493a, sVar.f360498d).mo57275g();
    }
}
