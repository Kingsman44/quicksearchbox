package com.google.android.libraries.search.assistant.performer.permissions.impl;

import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.impl.DirectPermissionsRequesterImpl;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.performer.permissions.impl.a */
/* compiled from: PG */
public final /* synthetic */ class C36198a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ DirectPermissionsRequesterImpl f94569a;

    /* renamed from: b */
    public final /* synthetic */ C35470f f94570b;

    /* renamed from: c */
    public final /* synthetic */ String[] f94571c;

    public /* synthetic */ C36198a(DirectPermissionsRequesterImpl directPermissionsRequesterImpl, C35470f fVar, String[] strArr) {
        this.f94569a = directPermissionsRequesterImpl;
        this.f94570b = fVar;
        this.f94571c = strArr;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        DirectPermissionsRequesterImpl directPermissionsRequesterImpl = this.f94569a;
        C35470f fVar = this.f94570b;
        Intent putExtra = new Intent(directPermissionsRequesterImpl.f94564b, PermissionsRequestActivity.class).putExtra("permissions", this.f94571c);
        C46428ao aoVar = directPermissionsRequesterImpl.f94565c;
        Objects.requireNonNull(cVar);
        C60870cx f = fVar.mo20101f(putExtra.putExtra("receiver", new DirectPermissionsRequesterImpl.PermissionsCallback(aoVar, new C36199b(cVar))));
        C36200c cVar2 = new C36200c(cVar);
        C60856cj.m92911t(f, C47810es.m84974n(cVar2), C60826bg.f164896a);
        return "requesting permission";
    }
}
