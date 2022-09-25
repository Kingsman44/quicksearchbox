package com.google.android.libraries.web.webview.p3471a;

import android.content.Context;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43979a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.a.q */
/* compiled from: PG */
public final class C44333q {

    /* renamed from: a */
    public final Context f115277a;

    /* renamed from: b */
    public final C46175b f115278b;

    /* renamed from: c */
    public final C42876ab f115279c;

    /* renamed from: d */
    public final C71788b f115280d;

    /* renamed from: e */
    public final C43979a f115281e;

    /* renamed from: f */
    public final C44325i f115282f;

    /* renamed from: g */
    private final C71422aw f115283g;

    public C44333q(Context context, C46175b bVar, C42876ab abVar, C71788b bVar2, C43979a aVar, C44325i iVar, C71422aw awVar) {
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(abVar, "accountInfoProtoDataStore");
        C69664n.m101061g(bVar2, "mutex");
        C69664n.m101061g(aVar, "webAccountStateRegistries");
        C69664n.m101061g(iVar, "webViewDataOwnerChangeListenerRegistry");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f115277a = context;
        this.f115278b = bVar;
        this.f115279c = abVar;
        this.f115280d = bVar2;
        this.f115281e = aVar;
        this.f115282f = iVar;
        this.f115283g = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo47225a(AccountId accountId) {
        C69664n.m101061g(accountId, "newOwnerAccountId");
        return C71663i.m104692e(this.f115283g, C71424ay.UNDISPATCHED, new C44332p(this, accountId, (C69577g) null), 1);
    }
}
