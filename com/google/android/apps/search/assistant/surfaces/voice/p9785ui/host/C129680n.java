package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.C62917ay;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.n */
/* compiled from: PG */
public final class C129680n implements C129684r {

    /* renamed from: a */
    final /* synthetic */ C69615a f355897a;

    /* renamed from: b */
    final /* synthetic */ C69630p f355898b;

    /* renamed from: c */
    private final C62917ay f355899c;

    public C129680n(C62917ay ayVar, C69615a aVar, C69630p pVar) {
        this.f355897a = aVar;
        this.f355898b = pVar;
        this.f355899c = ayVar;
    }

    /* renamed from: a */
    public final Fragment mo109192a(AccountId accountId, Object obj) {
        C69664n.m101061g(accountId, "account");
        return (Fragment) this.f355898b.mo5192a(accountId, obj);
    }

    /* renamed from: b */
    public final C129648c mo109193b() {
        C129648c a = C129648c.m211698a(((C129679m) this.f355897a).f355896a.f355844c);
        if (a == null) {
            a = C129648c.DISMISS_CONFIGURATION_UNDEFINED;
        }
        C69664n.m101060f(a, "configurationGetter().dismissConfiguration");
        return a;
    }

    /* renamed from: c */
    public final C129541aa mo109194c() {
        C129541aa aaVar = ((C129679m) this.f355897a).f355896a.f355843b;
        if (aaVar == null) {
            aaVar = C129541aa.f355591c;
        }
        C69664n.m101060f(aaVar, "configurationGetter().host");
        return aaVar;
    }

    /* renamed from: d */
    public final C62917ay mo109195d() {
        return this.f355899c;
    }
}
