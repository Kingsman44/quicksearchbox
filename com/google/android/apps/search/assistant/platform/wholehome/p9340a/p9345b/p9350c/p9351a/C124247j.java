package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.j */
/* compiled from: PG */
final class C124247j implements C32774c {

    /* renamed from: a */
    public final String f343055a;

    /* renamed from: b */
    final /* synthetic */ C124248k f343056b;

    public C124247j(C124248k kVar, String str) {
        this.f343056b = kVar;
        this.f343055a = str;
    }

    /* renamed from: a */
    public final void mo38033a(C32796ar arVar) {
        C124246i iVar = new C124246i(this, arVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(iVar), this.f343056b.f343060d), "Usonia callbacks is not set", new Object[0]);
    }

    /* renamed from: b */
    public final void mo38034b(Throwable th) {
        this.f343056b.f343060d.execute(C47810es.m84977q(new C124245h(this, th)));
    }
}
