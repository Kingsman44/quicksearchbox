package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a.C124223i;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a.C124234t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.C124237a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.apps.tiktok.concurrent.C46459k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C124246i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124247j f343053a;

    /* renamed from: b */
    public final /* synthetic */ C32796ar f343054b;

    public /* synthetic */ C124246i(C124247j jVar, C32796ar arVar) {
        this.f343053a = jVar;
        this.f343054b = arVar;
    }

    public final void run() {
        C124247j jVar = this.f343053a;
        C32796ar arVar = this.f343054b;
        if (jVar.f343056b.f343061e.containsKey(jVar.f343055a)) {
            C124237a aVar = jVar.f343056b.f343062f;
            if (aVar != null) {
                String str = jVar.f343055a;
                C124234t tVar = (C124234t) aVar;
                C46459k.m82829b(tVar.f343031j.mo51512b(new C124223i(tVar, str, arVar.f87975a == 1 ? (String) arVar.f87976b : BuildConfig.FLAVOR), tVar.f343027f), "Fail to handle context invalidation for id: %s.", str);
                return;
            }
            throw new IllegalStateException("ContextManager callbacks is not set");
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Failed to find AccessSession for id: %s.", new Object[]{jVar.f343055a}));
    }
}
