package com.google.apps.tiktok.tracing.contrib.p3706g;

import android.view.View;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.apps.tiktok.tracing.contrib.g.c */
/* compiled from: PG */
public final /* synthetic */ class C47668c implements C30156a {

    /* renamed from: a */
    public final /* synthetic */ C47675j f123620a;

    /* renamed from: b */
    public final /* synthetic */ String f123621b;

    /* renamed from: c */
    public final /* synthetic */ C30156a f123622c;

    public /* synthetic */ C47668c(C47675j jVar, String str, C30156a aVar) {
        this.f123620a = jVar;
        this.f123621b = str;
        this.f123622c = aVar;
    }

    /* renamed from: a */
    public final void mo17832a(View view, Object obj) {
        C47675j jVar = this.f123620a;
        String str = this.f123621b;
        C30156a aVar = this.f123622c;
        C46108a aVar2 = (C46108a) obj;
        C47538ax c = jVar.f123627a.mo51613c(str);
        try {
            aVar.mo17832a(view, aVar2);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47666a.m84803a(th, th);
        }
        throw th;
    }
}
