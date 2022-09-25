package com.google.android.libraries.search.assistant.p2700k;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.util.concurrent.C60826bg;
import dagger.p5294a.C68220f;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.k.h */
/* compiled from: PG */
public final class C34770h implements C68220f {
    /* renamed from: a */
    public static C46423aj m63528a(AccountId accountId, C46175b bVar, C46128f fVar, C71422aw awVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(awVar, "lightweightScope");
        return new C46423aj(new C34767e(awVar, bVar, accountId, fVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
