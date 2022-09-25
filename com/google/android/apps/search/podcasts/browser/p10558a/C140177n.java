package com.google.android.apps.search.podcasts.browser.p10558a;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Process;
import androidx.media.C2416an;
import androidx.media.C2434k;
import androidx.media.C2449z;
import com.google.android.apps.search.podcasts.browser.C140189c;
import com.google.android.apps.search.podcasts.p10571i.C140415j;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10603b.p10604a.C140960a;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.n */
/* compiled from: PG */
public final class C140177n implements C140189c {

    /* renamed from: a */
    public final Context f380859a;

    /* renamed from: b */
    public final C59071e f380860b = C59071e.m91331h();

    /* renamed from: c */
    public boolean f380861c;

    /* renamed from: d */
    private final Executor f380862d;

    /* renamed from: e */
    private final C140176m f380863e;

    /* renamed from: f */
    private final boolean f380864f;

    /* renamed from: g */
    private final C140498j f380865g;

    /* renamed from: h */
    private final boolean f380866h;

    /* renamed from: i */
    private C69615a f380867i;

    /* renamed from: j */
    private final C140960a f380868j;

    /* renamed from: com.google.android.apps.search.podcasts.browser.a.n$a */
    /* compiled from: PG */
    public interface C140178a {
        /* renamed from: cW */
        C140175l mo115492cW();

        /* renamed from: cX */
        C140415j mo115493cX();

        /* renamed from: cY */
        C140790h mo115494cY();
    }

    public C140177n(Context context, Executor executor, C140176m mVar, C140960a aVar, boolean z, C140498j jVar, boolean z2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(jVar, "devicePreferencesManager");
        this.f380859a = context;
        this.f380862d = executor;
        this.f380863e = mVar;
        this.f380868j = aVar;
        this.f380864f = z;
        this.f380865g = jVar;
        this.f380866h = z2;
    }

    /* renamed from: e */
    public static final C140178a m227831e(Context context, AccountId accountId) {
        Object a = C47245e.m84045a(context, C140178a.class, accountId);
        C69664n.m101060f(a, "getEntryPoint(\n      con…va,\n      accountId\n    )");
        return (C140178a) a;
    }

    /* renamed from: f */
    private final void m227832f(C2416an anVar, C60870cx cxVar) {
        C140989k.m228950h(C140989k.m228945c(cxVar, C140186v.f380880a), new C140187w(this, anVar));
    }

    /* renamed from: a */
    public final void mo115488a(C2416an anVar) {
        this.f380861c = false;
        C140179o oVar = new C140179o(this, anVar);
        this.f380867i = oVar;
        if (this.f380866h) {
            C140498j jVar = this.f380865g;
            C69664n.m101061g(oVar, "callback");
            jVar.f381598e.add(oVar);
        }
        if (!this.f380864f) {
            m227832f(anVar, C140989k.m228948f(this.f380868j.mo116044a(), new C140180p(this)));
        }
    }

    /* renamed from: b */
    public final void mo115489b() {
        if (this.f380866h) {
            C140498j jVar = this.f380865g;
            C69615a aVar = this.f380867i;
            if (aVar == null) {
                C69664n.m101065k("currentAccountIdChangeListener");
                aVar = null;
            }
            C69664n.m101061g(aVar, "callback");
            jVar.f381598e.remove(aVar);
        }
    }

    /* renamed from: c */
    public final void mo115490c(String str, C2449z zVar) {
        C69664n.m101061g(str, "parentId");
        zVar.mo5857b();
        C140989k.m228949g(C140989k.m228947e(this.f380868j.mo116044a(), this.f380862d, new C140184t(this, str)), this.f380862d, new C140185u(this, str, zVar));
    }

    /* renamed from: d */
    public final C2434k mo115491d(C2416an anVar, String str, int i) {
        List a;
        C69664n.m101061g(str, "clientPackageName");
        C140176m mVar = this.f380863e;
        if (!(i == 1000 || Process.myUid() == i)) {
            if (C140176m.f380855a.contains(str)) {
                return null;
            }
            List a2 = mVar.mo115487a("android");
            if ((a2 == null || a2.isEmpty() || (a = mVar.mo115487a(str)) == null || a.isEmpty() || !((Signature) a2.get(0)).equals(a.get(0))) && (!str.equals("com.google.android.projection.gearhead") || !mVar.f380857b.mo119084c(str))) {
                return null;
            }
        }
        if (!this.f380861c) {
            this.f380861c = true;
            C60870cx b = C140989k.m228944b(this.f380868j.mo116044a(), new C140182r(this));
            if (this.f380864f) {
                m227832f(anVar, b);
            }
            C140989k.m228950h(b, new C140181q(this));
        }
        return new C2434k("podcast_browser_media_root_id", (Bundle) null);
    }
}
