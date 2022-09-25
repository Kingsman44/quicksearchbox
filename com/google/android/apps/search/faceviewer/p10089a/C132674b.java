package com.google.android.apps.search.faceviewer.p10089a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.faceviewer.p10090b.C132677a;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;

/* renamed from: com.google.android.apps.search.faceviewer.a.b */
/* compiled from: PG */
final class C132674b implements GatewayHandler {

    /* renamed from: a */
    public final Context f362052a;

    /* renamed from: b */
    public final C32158h f362053b;

    /* renamed from: c */
    private final boolean f362054c;

    public C132674b(Context context, C32158h hVar, boolean z) {
        this.f362052a = context;
        this.f362053b = hVar;
        this.f362054c = z;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Intent b;
        if (!this.f362054c || (b = C132677a.m215668b(mVar.f123337a)) == null) {
            return null;
        }
        return new C132673a(this, b);
    }
}
