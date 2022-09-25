package com.google.android.libraries.search.rendering.xuikit.bubbles.p3120b;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40323n;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.p4920a.C64176d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.b.e */
/* compiled from: PG */
public final class C40106e implements C40323n {

    /* renamed from: a */
    public final C40102a f105341a;

    /* renamed from: b */
    public final AccountId f105342b;

    /* renamed from: c */
    public final C46128f f105343c;

    /* renamed from: d */
    private final C71422aw f105344d;

    public C40106e(C40102a aVar, C71422aw awVar, AccountId accountId, C46128f fVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "gcoreAccountName");
        this.f105341a = aVar;
        this.f105344d = awVar;
        this.f105342b = accountId;
        this.f105343c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo42087a(Object obj, C21311r rVar, C40335z zVar) {
        C64176d dVar = (C64176d) obj;
        C69664n.m101061g(dVar, "command");
        C69664n.m101061g(zVar, "dependencies");
        return C71663i.m104692e(this.f105344d, (C71424ay) null, new C40105d(dVar, this, (C69577g) null), 3);
    }
}
