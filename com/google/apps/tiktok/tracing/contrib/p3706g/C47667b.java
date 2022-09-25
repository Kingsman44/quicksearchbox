package com.google.apps.tiktok.tracing.contrib.p3706g;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30292a;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.apps.tiktok.tracing.contrib.g.b */
/* compiled from: PG */
public final /* synthetic */ class C47667b implements C30292a {

    /* renamed from: a */
    public final /* synthetic */ C47675j f123617a;

    /* renamed from: b */
    public final /* synthetic */ String f123618b;

    /* renamed from: c */
    public final /* synthetic */ C30292a f123619c;

    public /* synthetic */ C47667b(C47675j jVar, String str, C30292a aVar) {
        this.f123617a = jVar;
        this.f123618b = str;
        this.f123619c = aVar;
    }

    /* renamed from: a */
    public final void mo17832a(View view, Object obj) {
        C47675j jVar = this.f123617a;
        String str = this.f123618b;
        C30292a aVar = this.f123619c;
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
