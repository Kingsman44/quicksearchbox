package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.C62917ay;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.p */
/* compiled from: PG */
public final class C129682p implements C129684r {

    /* renamed from: a */
    final /* synthetic */ C69615a f355901a;

    /* renamed from: b */
    final /* synthetic */ C69626l f355902b;

    public C129682p(C69615a aVar, C69626l lVar) {
        this.f355901a = aVar;
        this.f355902b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Fragment mo109192a(AccountId accountId, Object obj) {
        C69788q qVar = (C69788q) obj;
        C69664n.m101061g(accountId, "account");
        return (Fragment) this.f355902b.mo5761a(accountId);
    }

    /* renamed from: b */
    public final C129648c mo109193b() {
        C129648c a = C129648c.m211698a(((C129653d) this.f355901a.mo5672a()).f355844c);
        if (a == null) {
            a = C129648c.DISMISS_CONFIGURATION_UNDEFINED;
        }
        C69664n.m101060f(a, "configurationGetter().dismissConfiguration");
        return a;
    }

    /* renamed from: c */
    public final C129541aa mo109194c() {
        C129541aa aaVar = ((C129653d) this.f355901a.mo5672a()).f355843b;
        if (aaVar == null) {
            aaVar = C129541aa.f355591c;
        }
        C69664n.m101060f(aaVar, "configurationGetter().host");
        return aaVar;
    }

    /* renamed from: d */
    public final C62917ay mo109195d() {
        return null;
    }
}
