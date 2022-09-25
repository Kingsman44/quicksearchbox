package com.google.apps.tiktok.experiments.phenotype;

import android.content.Context;
import com.google.android.libraries.phenotype.client.stable.C31747n;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ei */
/* compiled from: PG */
public final class C47023ei {

    /* renamed from: a */
    public final Context f122570a;

    /* renamed from: b */
    public final C69464a f122571b;

    /* renamed from: c */
    public final C46175b f122572c;

    /* renamed from: d */
    public final C31747n f122573d;

    /* renamed from: e */
    public final Map f122574e;

    /* renamed from: f */
    public AccountId f122575f;

    /* renamed from: g */
    private final C68214a f122576g;

    /* renamed from: h */
    private final Executor f122577h;

    /* renamed from: i */
    private final C60836bq f122578i = new C60836bq();

    /* renamed from: com.google.apps.tiktok.experiments.phenotype.ei$a */
    /* compiled from: PG */
    public interface C47024a {
        /* renamed from: gS */
        C46917ak mo50982gS();

        /* renamed from: gT */
        C46917ak mo50983gT();
    }

    public C47023ei(Context context, C68214a aVar, C69464a aVar2, C46175b bVar, Executor executor, C31747n nVar, Map map) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "committer");
        C69664n.m101061g(aVar2, "selector");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(nVar, "experimentTokenDecorator");
        C69664n.m101061g(map, "logSources");
        this.f122570a = context;
        this.f122576g = aVar;
        this.f122571b = aVar2;
        this.f122572c = bVar;
        this.f122577h = executor;
        this.f122573d = nVar;
        this.f122574e = map;
    }

    /* renamed from: a */
    public final C60870cx mo50978a(String str, C63088z zVar, String str2, String str3) {
        return ((C47059m) this.f122576g.mo27525b()).mo50991a(str, zVar, new C47025ej(this, str3, str2));
    }

    /* renamed from: b */
    public final C60870cx mo50979b(AccountId accountId, String str, AccountId accountId2, String str2, C63088z zVar) {
        if (accountId == null || !C69664n.m101066l(accountId2, accountId)) {
            return C60866ct.f164955a;
        }
        C60870cx c = this.f122572c.mo50246c(accountId2);
        C47032eq eqVar = new C47032eq(new C47026ek(this, str2, zVar, str));
        return C60922j.m93045h(c, C47810es.m84966f(eqVar), this.f122577h);
    }

    /* renamed from: c */
    public final C60870cx mo50980c(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        C60870cx b = this.f122578i.mo57305b(C47810es.m84965e(new C47029en(accountId, this)), C60826bg.f164896a);
        C69664n.m101060f(b, "fun commitOnAccountChang…   directExecutor()\n    )");
        return b;
    }

    /* renamed from: d */
    public final C60870cx mo50981d(AccountId accountId, String str, String str2, C63088z zVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(str, "configPackage");
        C60870cx b = this.f122578i.mo57305b(C47810es.m84965e(new C47031ep(this, str, accountId, str2, zVar)), C60826bg.f164896a);
        C69664n.m101060f(b, "fun onConfigurationUpdat…   directExecutor()\n    )");
        return b;
    }
}
