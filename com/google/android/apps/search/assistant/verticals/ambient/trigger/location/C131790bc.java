package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.gms.semanticlocation.SemanticLocationEventRequest;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.bc */
/* compiled from: PG */
public final class C131790bc {

    /* renamed from: a */
    public static final SemanticLocationEventRequest f359974a = new SemanticLocationEventRequest(0.0f);

    /* renamed from: b */
    public final AccountId f359975b;

    /* renamed from: c */
    public final C46128f f359976c;

    /* renamed from: d */
    public final C131763ad f359977d;

    /* renamed from: e */
    public final ExecutorService f359978e;

    /* renamed from: f */
    public final C21370a f359979f;

    /* renamed from: g */
    public final C42876ab f359980g;

    /* renamed from: h */
    public final C58974d f359981h;

    public C131790bc(AccountId accountId, C46128f fVar, C131763ad adVar, ExecutorService executorService, C21370a aVar, C42876ab abVar, C130603a aVar2) {
        this.f359975b = accountId;
        this.f359976c = fVar;
        this.f359977d = adVar;
        this.f359978e = executorService;
        this.f359979f = aVar;
        this.f359980g = abVar;
        this.f359981h = aVar2.mo109740b(this);
    }
}
