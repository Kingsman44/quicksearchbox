package com.google.apps.tiktok.p3644h;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.h.f */
/* compiled from: PG */
public final /* synthetic */ class C47129f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47134k f122732a;

    /* renamed from: b */
    public final /* synthetic */ String f122733b;

    public /* synthetic */ C47129f(C47134k kVar, String str) {
        this.f122732a = kVar;
        this.f122733b = str;
    }

    public final C60870cx apply(Object obj) {
        C47134k kVar = this.f122732a;
        String str = this.f122733b;
        Void voidR = (Void) obj;
        long b = kVar.f122745d.mo26870b();
        C60870cx b2 = C43205e.m76192b(kVar.f122746e.mo117812c(new Account(str, "com.google"), kVar.f122744c.mo51028a(), (Bundle) null));
        C47131h hVar = new C47131h(b);
        return C60922j.m93044g(b2, C47810es.m84963c(hVar), C60826bg.f164896a);
    }
}
