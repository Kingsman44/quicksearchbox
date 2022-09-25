package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import android.net.Uri;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p */
/* compiled from: PG */
public final /* synthetic */ class C133897p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133907z f364683a;

    /* renamed from: b */
    public final /* synthetic */ Uri f364684b;

    /* renamed from: c */
    public final /* synthetic */ C133771b f364685c;

    public /* synthetic */ C133897p(C133907z zVar, Uri uri, C133771b bVar) {
        this.f364683a = zVar;
        this.f364684b = uri;
        this.f364685c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C133907z zVar = this.f364683a;
        Uri uri = this.f364684b;
        C133771b bVar = this.f364685c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx i = zVar.mo111444i(uri, bVar);
        C133893l lVar = C133893l.f364676a;
        return C60922j.m93044g(i, C47810es.m84963c(lVar), C60826bg.f164896a);
    }
}
