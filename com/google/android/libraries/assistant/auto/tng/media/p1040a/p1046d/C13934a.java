package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.session.C0315q;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C13934a implements C13920d {

    /* renamed from: a */
    public final /* synthetic */ C13968v f42411a;

    /* renamed from: b */
    public final /* synthetic */ String f42412b;

    /* renamed from: c */
    public final /* synthetic */ String f42413c;

    public /* synthetic */ C13934a(C13968v vVar, String str, String str2) {
        this.f42411a = vVar;
        this.f42412b = str;
        this.f42413c = str2;
    }

    /* renamed from: a */
    public final void mo21353a(C0315q qVar) {
        C13968v vVar = this.f42411a;
        String str = this.f42412b;
        String str2 = this.f42413c;
        C60870cx b = vVar.f42532f.mo20393b();
        C13963q qVar2 = new C13963q(vVar, str, qVar, str2);
        C46459k.m82829b(C60922j.m93045h(b, C47810es.m84966f(qVar2), vVar.f42530d), "Failed to stop/pause media", new Object[0]);
    }
}
