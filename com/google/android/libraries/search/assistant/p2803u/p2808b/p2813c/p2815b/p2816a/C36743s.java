package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C50349tu;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.s */
/* compiled from: PG */
final class C36743s extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C50349tu f95738a;

    /* renamed from: b */
    final /* synthetic */ C36745u f95739b;

    public C36743s(C36745u uVar, C50349tu tuVar) {
        this.f95739b = uVar;
        this.f95738a = tuVar;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f95738a.f131045e));
        intent.addFlags(268435456);
        C47810es.m84979s(this.f95739b.f95742b, intent);
    }
}
