package com.google.android.apps.search.assistant.verticals.contextdebug.p10038a;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.a.a */
/* compiled from: PG */
public final class C132026a {

    /* renamed from: a */
    public final Context f360381a;

    /* renamed from: b */
    public final AtomicReference f360382b = new AtomicReference(new HashMap());

    public C132026a(Context context) {
        this.f360381a = context;
    }

    /* renamed from: a */
    public final Optional mo110386a(AccountId accountId) {
        return Optional.ofNullable((C50540h) ((Map) this.f360382b.get()).get(accountId));
    }
}
