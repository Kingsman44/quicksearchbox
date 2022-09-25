package com.google.apps.tiktok.account.p3616e.p3620d;

import android.content.Context;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.e.d.h */
/* compiled from: PG */
public final class C46348h implements C45977ao, C45978ap {

    /* renamed from: a */
    public final C42876ab f121344a;

    /* renamed from: b */
    public final String f121345b;

    /* renamed from: c */
    public final C46325t f121346c;

    public C46348h(Context context, C42876ab abVar, C46325t tVar) {
        this.f121344a = abVar;
        this.f121345b = context.getPackageName();
        this.f121346c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Get Default Account");
        try {
            C60870cx g = C60922j.m93044g(this.f121344a.mo46042d(), C47810es.m84963c(new C46344d(this)), C60826bg.f164896a);
            a.mo51417a(g);
            a.close();
            return g;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo37984b(AccountId accountId) {
        return C60866ct.f164955a;
    }
}
