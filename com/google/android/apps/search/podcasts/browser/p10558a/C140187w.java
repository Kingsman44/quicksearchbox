package com.google.android.apps.search.podcasts.browser.p10558a;

import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media.C2416an;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.w */
/* compiled from: PG */
public final class C140187w implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140177n f380881a;

    /* renamed from: b */
    final /* synthetic */ C2416an f380882b;

    public C140187w(C140177n nVar, C2416an anVar) {
        this.f380881a = nVar;
        this.f380882b = anVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f380881a.f380860b.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41509));
        cVar.mo56386p("Failed to retrieve the media session token.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        MediaSessionCompat.Token token = (MediaSessionCompat.Token) obj;
        C69664n.m101061g(token, "token");
        C59052c cVar = (C59052c) this.f380881a.f380860b.mo56224b();
        cVar.mo56379ah(new C59094n(41510));
        cVar.mo56386p("Sets the media session token.");
        C2416an anVar = this.f380882b;
        if (anVar.f6689e == null) {
            anVar.mo5836iP(token);
        }
    }
}
