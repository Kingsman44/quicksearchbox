package com.google.apps.tiktok.experiments.phenotype;

import android.content.Context;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ew */
/* compiled from: PG */
public final class C47038ew {

    /* renamed from: a */
    public final Context f122613a;

    /* renamed from: b */
    public final C46983cw f122614b;

    /* renamed from: c */
    public final C31639g f122615c;

    /* renamed from: d */
    public final C47065s f122616d;

    /* renamed from: e */
    public final C46128f f122617e;

    /* renamed from: f */
    private final C46175b f122618f;

    public C47038ew(Context context, C46983cw cwVar, C31639g gVar, C46175b bVar, C47065s sVar, C46128f fVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(gVar, "phenotypeApi");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(sVar, "configurationUpdater");
        C69664n.m101061g(fVar, "gcoreAccountName");
        this.f122613a = context;
        this.f122614b = cwVar;
        this.f122615c = gVar;
        this.f122618f = bVar;
        this.f122616d = sVar;
        this.f122617e = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo50985a(String str, AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        return C47633f.m84733g(this.f122618f.mo50246c(accountId)).mo51516i(new C47035et(this, str), C60826bg.f164896a).mo51516i(new C47036eu(str, this, accountId), C60826bg.f164896a).mo51516i(new C47037ev(this, accountId), C60826bg.f164896a);
    }
}
