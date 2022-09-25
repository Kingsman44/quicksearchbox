package com.google.android.libraries.assistant.auto.tng.common.p901d;

import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.h */
/* compiled from: PG */
public final class C13231h implements C69464a {

    /* renamed from: a */
    public String f40882a;

    /* renamed from: b */
    public final AccountId f40883b;

    /* renamed from: c */
    public final C13213i f40884c;

    /* renamed from: d */
    public final C13225b f40885d;

    /* renamed from: e */
    public final Executor f40886e;

    /* renamed from: f */
    public final C42876ab f40887f;

    public C13231h(AccountId accountId, C13213i iVar, C13225b bVar, C60887da daVar, C42876ab abVar) {
        this.f40883b = accountId;
        this.f40884c = iVar;
        this.f40885d = bVar;
        this.f40887f = abVar;
        this.f40886e = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final C60870cx mo17428b() {
        C47558bi a = C47831fm.m85006a("ClientIdConfigurator#get");
        try {
            C60870cx d = this.f40887f.mo46042d();
            C13229f fVar = new C13229f(this);
            C60870cx h = C60922j.m93045h(d, C47810es.m84966f(fVar), this.f40886e);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
