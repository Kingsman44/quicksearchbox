package com.google.android.libraries.search.assistant.performer.p2757g;

import android.text.TextUtils;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.c */
/* compiled from: PG */
public final /* synthetic */ class C36085c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f94396a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f94397b;

    public /* synthetic */ C36085c(C60870cx cxVar, C60870cx cxVar2) {
        this.f94396a = cxVar;
        this.f94397b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f94396a;
        String str = (String) C60856cj.m92909r(this.f94397b);
        if (((C46108a) C60856cj.m92909r(cxVar)).mo50210b().f121165j.equals("pseudonymous")) {
            return Optional.empty();
        }
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        return Optional.m71637of(str);
    }
}
