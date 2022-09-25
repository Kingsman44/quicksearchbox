package com.google.android.apps.search.podcasts.browser.p10558a;

import androidx.media.C2449z;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.u */
/* compiled from: PG */
public final class C140185u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140177n f380877a;

    /* renamed from: b */
    final /* synthetic */ String f380878b;

    /* renamed from: c */
    final /* synthetic */ C2449z f380879c;

    public C140185u(C140177n nVar, String str, C2449z zVar) {
        this.f380877a = nVar;
        this.f380878b = str;
        this.f380879c = zVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f380877a.f380860b.mo56226d()).mo56382g(th);
        String str = this.f380878b;
        cVar.mo56379ah(new C59094n(41507));
        cVar.mo56389s("Failed to load media items for %s", str);
        this.f380879c.mo5863c(C69496am.f185918a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f380879c.mo5863c((List) obj);
    }
}
