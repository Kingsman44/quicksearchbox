package com.google.android.gms.signin;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.signin.internal.C146001g;

/* renamed from: com.google.android.gms.signin.a */
/* compiled from: PG */
public final class C145989a extends C143707a {
    /* renamed from: c */
    public static final C146001g m237769c(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        C145994f fVar = sVar.f390175g;
        Integer num = sVar.f390176h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", sVar.f390169a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new C146001g(context, looper, sVar, bundle, uVar, vVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C143839k mo57743b(Context context, Looper looper, C143944s sVar, Object obj, C143849u uVar, C143850v vVar) {
        C145994f fVar = (C145994f) obj;
        return m237769c(context, looper, sVar, uVar, vVar);
    }
}
