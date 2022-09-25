package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.g */
/* compiled from: PG */
public final class C140921g {

    /* renamed from: a */
    public final C140918d f382650a;

    /* renamed from: b */
    public final C140790h f382651b;

    /* renamed from: c */
    public final C46855i f382652c;

    /* renamed from: d */
    public final C21370a f382653d;

    /* renamed from: e */
    public final C47449e f382654e;

    /* renamed from: f */
    public final C140997s f382655f;

    /* renamed from: g */
    public C140787e f382656g;

    /* renamed from: h */
    public final C46852f f382657h = new C140919e(this);

    /* renamed from: i */
    private final C28306ab f382658i;

    public C140921g(C140918d dVar, C140790h hVar, C47770dh dhVar, C46855i iVar, C21370a aVar, C47449e eVar, C28306ab abVar, C140997s sVar) {
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(sVar, "veLoggedEvents");
        this.f382650a = dVar;
        this.f382651b = hVar;
        this.f382652c = iVar;
        this.f382653d = aVar;
        this.f382654e = eVar;
        this.f382658i = abVar;
        this.f382655f = sVar;
    }

    /* renamed from: a */
    public final void mo116019a(View view, int i) {
        C28306ab abVar = this.f382658i;
        abVar.mo33801b(view, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
    }
}
