package com.google.android.libraries.search.assistant.performer.p2753e;

import android.net.Uri;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.performer.e.e */
/* compiled from: PG */
public final /* synthetic */ class C35992e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C35998k f94183a;

    /* renamed from: b */
    public final /* synthetic */ int f94184b;

    /* renamed from: c */
    public final /* synthetic */ List f94185c;

    public /* synthetic */ C35992e(C35998k kVar, int i, List list) {
        this.f94183a = kVar;
        this.f94184b = i;
        this.f94185c = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C35998k kVar = this.f94183a;
        int i = this.f94184b;
        List list = this.f94185c;
        list.size();
        String str = (String) list.get(i);
        C60870cx b = C5528f.m14300b(C5528f.m14299a(kVar.f94194b.mo51286a().mo11864b().mo12445g(Uri.parse(str))));
        C35994g gVar = new C35994g(kVar, i);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(gVar), kVar.f94195c);
        C35995h hVar = new C35995h(str);
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(hVar), kVar.f94195c);
    }
}
