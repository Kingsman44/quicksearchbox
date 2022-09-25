package com.google.apps.tiktok.p3643g;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45966ad;
import com.google.apps.tiktok.account.p3604b.C46063d;
import com.google.apps.tiktok.account.p3604b.C46064e;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.g.c */
/* compiled from: PG */
public class C47086c extends C47098n {

    /* renamed from: com.google.apps.tiktok.g.c$a */
    /* compiled from: PG */
    public interface C47087a {
        /* renamed from: cZ */
        C45966ad mo51008cZ();

        /* renamed from: di */
        C46064e mo51009di();
    }

    protected C47086c(Class cls) {
        super(cls, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C60870cx mo51007d(Context context, Intent intent, Class cls) {
        C47087a aVar = (C47087a) C47266f.m84076a(context, C47087a.class);
        C46064e di = aVar.mo51009di();
        Bundle extras = intent.getExtras() == null ? Bundle.EMPTY : intent.getExtras();
        C58838bb.m90884s(extras.containsKey("account_id"), "Missing AccountId. Did you forget to add the account id to the Intent?");
        int i = extras.getInt("account_id", -1);
        AccountId b = i != -1 ? AccountId.m82057b(i) : null;
        C60870cx g = C60922j.m93044g(C60856cj.m92897f(di.f120923c.mo50284d(b), di.mo50181a()), new C46063d(extras, b), C60826bg.f164896a);
        C45966ad cZ = aVar.mo51008cZ();
        Objects.requireNonNull(cZ);
        return C60922j.m93044g(C60922j.m93045h(g, C47810es.m84966f(new C47084a(cZ)), C60826bg.f164896a), C47810es.m84963c(new C47085b(context, cls)), C60826bg.f164896a);
    }
}
