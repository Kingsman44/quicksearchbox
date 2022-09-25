package com.google.android.apps.search.googleapp.startup.p10515b;

import android.content.Context;
import com.google.android.libraries.locale.manager.C28256a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47267g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.startup.b.a */
/* compiled from: PG */
public final class C139686a implements C47267g {

    /* renamed from: a */
    private final Context f379678a;

    public C139686a(Context context) {
        C69664n.m101061g(context, "context");
        this.f379678a = context;
    }

    /* renamed from: e */
    public final void mo35389e() {
        C46459k.m82829b(C28256a.m52817a(this.f379678a.getApplicationContext()), "Could not schedule panlingual language settings sync.", new Object[0]);
    }
}
