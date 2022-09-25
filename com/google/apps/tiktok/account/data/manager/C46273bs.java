package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.account.data.manager.bs */
/* compiled from: PG */
public final class C46273bs implements C46302j {

    /* renamed from: a */
    private final C46293cl f121260a;

    /* renamed from: b */
    private final Executor f121261b;

    public C46273bs(C46293cl clVar, Executor executor) {
        this.f121260a = clVar;
        this.f121261b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo50272a(Collection collection) {
        Bundle bundle = new Bundle();
        ProtoParsers.m95533p(bundle, "account_infos", new ArrayList(collection));
        return this.f121260a.mo50315a(this.f121261b, C47810es.m84966f(new C46260bf(bundle)));
    }

    /* renamed from: b */
    public final C60870cx mo50273b(AccountId accountId) {
        return this.f121260a.mo50315a(this.f121261b, C47810es.m84966f(new C46268bn(accountId)));
    }

    /* renamed from: c */
    public final C60870cx mo50274c(AccountId accountId) {
        return this.f121260a.mo50315a(this.f121261b, C47810es.m84966f(new C46267bm(accountId)));
    }

    /* renamed from: d */
    public final C60870cx mo50275d(Collection collection) {
        int[] iArr = new int[((C58724pq) collection).f156474d];
        int i = 0;
        C58801sm G = ((C58485gu) collection).listIterator(0);
        while (G.hasNext()) {
            iArr[i] = ((AccountId) G.next()).mo50068a();
            i++;
        }
        return this.f121260a.mo50315a(this.f121261b, C47810es.m84966f(new C46262bh(iArr)));
    }

    /* renamed from: e */
    public final C60870cx mo50276e(Collection collection) {
        Bundle bundle = new Bundle();
        ProtoParsers.m95533p(bundle, "account_infos", new ArrayList(collection));
        return this.f121260a.mo50315a(this.f121261b, C47810es.m84966f(new C46259be(bundle)));
    }

    /* renamed from: f */
    public final C60870cx mo50277f(Collection collection, C58528ij ijVar) {
        Bundle bundle = new Bundle();
        ProtoParsers.m95533p(bundle, "account_infos", new ArrayList(collection));
        bundle.putStringArrayList("account_types", new ArrayList(ijVar));
        return this.f121260a.mo50315a(this.f121261b, C47810es.m84966f(new C46261bg(bundle)));
    }
}
