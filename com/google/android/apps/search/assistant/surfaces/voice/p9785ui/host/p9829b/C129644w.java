package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129684r;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.w */
/* compiled from: PG */
public final class C129644w {

    /* renamed from: a */
    public final AccountId f355818a;

    /* renamed from: b */
    private final Map f355819b;

    public C129644w(AccountId accountId, Map map) {
        C69664n.m101061g(accountId, "accountId");
        this.f355818a = accountId;
        this.f355819b = map;
    }

    /* renamed from: a */
    public final C129684r mo109155a(C129676j jVar) {
        Map map = this.f355819b;
        C129662i a = C129662i.m211713a(jVar.f355893b);
        if (a == null) {
            a = C129662i.DEFAULT_NOT_VISIBLE;
        }
        C129684r rVar = (C129684r) map.get(a);
        if (rVar != null) {
            return rVar;
        }
        C129662i a2 = C129662i.m211713a(jVar.f355893b);
        if (a2 == null) {
            a2 = C129662i.DEFAULT_NOT_VISIBLE;
        }
        throw new IllegalArgumentException("No fragment factory registered for type: ".concat(String.valueOf(a2.name())));
    }

    /* renamed from: b */
    public final C129541aa mo109156b(C129676j jVar) {
        C69664n.m101061g(jVar, "content");
        return mo109155a(jVar).mo109194c();
    }
}
