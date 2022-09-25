package com.google.android.apps.search.googleapp.discover.p10166a;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.h.f.a.b;
import com.google.android.apps.p486f.p487a.p488a.C9113a;
import com.google.android.apps.search.googleapp.discover.channels.C134124am;
import com.google.android.apps.search.googleapp.discover.feedback.FeedbackLauncher;
import com.google.android.apps.search.googleapp.discover.fullcoverage.C134326m;
import com.google.android.apps.search.googleapp.discover.p10166a.p10167a.C133935a;
import com.google.android.apps.search.googleapp.discover.p10166a.p10167a.C133936b;
import com.google.android.apps.search.googleapp.discover.p10166a.p10167a.C133937c;
import com.google.android.apps.search.googleapp.discover.p10175ab.p10176a.C134085c;
import com.google.android.apps.search.googleapp.discover.p10178b.C134095a;
import com.google.android.apps.search.googleapp.discover.p10178b.C134097c;
import com.google.android.apps.search.googleapp.discover.p10189g.C134345p;
import com.google.android.apps.search.googleapp.discover.secondscreen.C134625p;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.C134646g;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134698d;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134722b;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.search.video.lightbox.C41540s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57064af;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b */
/* compiled from: PG */
public final class C133939b {

    /* renamed from: a */
    public static final C59071e f364792a = C59071e.m91331h();

    /* renamed from: b */
    public final C133991e f364793b;

    /* renamed from: c */
    public final Fragment f364794c;

    /* renamed from: d */
    public final C134345p f364795d;

    /* renamed from: e */
    public final FeedbackLauncher f364796e;

    /* renamed from: f */
    public final C134085c f364797f;

    /* renamed from: g */
    public final C134724d f364798g;

    /* renamed from: h */
    public final C134002p f364799h;

    /* renamed from: i */
    public final C41540s f364800i;

    /* renamed from: j */
    public final b f364801j;

    /* renamed from: k */
    public final C60950i f364802k;

    /* renamed from: l */
    public final C134625p f364803l;

    /* renamed from: m */
    public final C134326m f364804m;

    /* renamed from: n */
    public final C134646g f364805n;

    /* renamed from: o */
    public final C68214a f364806o;

    /* renamed from: p */
    public final C134124am f364807p;

    /* renamed from: q */
    public final boolean f364808q;

    /* renamed from: r */
    public final C134766q f364809r;

    /* renamed from: s */
    public final C134722b f364810s;

    /* renamed from: t */
    public final C134698d f364811t;

    /* renamed from: u */
    public final C71422aw f364812u;

    /* renamed from: v */
    public final boolean f364813v;

    /* renamed from: w */
    public final C9113a f364814w;

    /* renamed from: x */
    private final C133936b f364815x;

    public C133939b(C133991e eVar, Fragment fragment, C134345p pVar, FeedbackLauncher feedbackLauncher, C134085c cVar, C134724d dVar, C133936b bVar, C134002p pVar2, C41540s sVar, b bVar2, C60950i iVar, C134625p pVar3, C134326m mVar, C9113a aVar, C134646g gVar, C68214a aVar2, C134124am amVar, boolean z, C134766q qVar, C134722b bVar3, C134698d dVar2, C71422aw awVar, boolean z2) {
        Fragment fragment2 = fragment;
        C134345p pVar4 = pVar;
        FeedbackLauncher feedbackLauncher2 = feedbackLauncher;
        C134085c cVar2 = cVar;
        C134724d dVar3 = dVar;
        C41540s sVar2 = sVar;
        C60950i iVar2 = iVar;
        C9113a aVar3 = aVar;
        C134646g gVar2 = gVar;
        C68214a aVar4 = aVar2;
        C134124am amVar2 = amVar;
        C134766q qVar2 = qVar;
        C134722b bVar4 = bVar3;
        C134698d dVar4 = dVar2;
        C69664n.m101061g(fragment2, "fragment");
        C69664n.m101061g(pVar4, "bottomsheetManager");
        C69664n.m101061g(feedbackLauncher2, "feedbackLauncher");
        C69664n.m101061g(cVar2, "discoverAttentionLogger");
        C69664n.m101061g(dVar3, "discoverLaunchSignals");
        C69664n.m101061g(sVar2, "videoLightboxLauncher");
        C69664n.m101061g(iVar2, "timeSource");
        C69664n.m101061g(aVar3, "gGoDiscoverOverrides");
        C69664n.m101061g(gVar2, "discoverLanguageSetting");
        C69664n.m101061g(aVar4, "xUiKit");
        C69664n.m101061g(amVar2, "channelIntents");
        C69664n.m101061g(qVar2, "tngDiscoverSurface");
        C69664n.m101061g(bVar4, "discoverInitialRenderTracker");
        C69664n.m101061g(dVar4, "animateFeedLayoutManager");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f364793b = eVar;
        this.f364794c = fragment2;
        this.f364795d = pVar4;
        this.f364796e = feedbackLauncher2;
        this.f364797f = cVar2;
        this.f364798g = dVar3;
        this.f364815x = bVar;
        this.f364799h = pVar2;
        this.f364800i = sVar2;
        this.f364801j = bVar2;
        this.f364802k = iVar2;
        this.f364803l = pVar3;
        this.f364804m = mVar;
        this.f364814w = aVar3;
        this.f364805n = gVar2;
        this.f364806o = aVar4;
        this.f364807p = amVar2;
        this.f364808q = z;
        this.f364809r = qVar2;
        this.f364810s = bVar4;
        this.f364811t = dVar4;
        this.f364812u = awVar;
        this.f364813v = z2;
    }

    /* renamed from: a */
    public final void mo111466a(C57064af afVar) {
        C69664n.m101061g(afVar, "openUrlData");
        this.f364810s.mo111908d(C134720e.CARD_TAPPED);
        C133936b bVar = this.f364815x;
        String str = afVar.f152337b;
        boolean z = afVar.f152338c;
        boolean z2 = afVar.f152339d;
        Uri parse = Uri.parse(str);
        if (z2) {
            Uri.Builder buildUpon = parse.buildUpon();
            int i = bVar.f364787d.f366958g;
            int i2 = i - 1;
            if (i != 0) {
                Uri build = buildUpon.appendQueryParameter("cas", String.valueOf(i2)).build();
                C133937c cVar = bVar.f364788e;
                C134097c cVar2 = bVar.f364786c;
                C47633f e = C47633f.m84733g(cVar2.f365282a.mo19399b(C47810es.m84978r(new C134095a(cVar2, build)))).mo51513e(Exception.class, new C133935a(build), bVar.f364785b);
                C139851q qVar = z ? C139851q.AMP_DISCOVER : C139851q.DISCOVER;
                C139795f fVar = cVar.f364789a;
                C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
                iVar.copyOnWrite();
                C139823j jVar = (C139823j) iVar.instance;
                jVar.f380069b = qVar.f380143m;
                jVar.f380068a |= 1;
                C58833ax axVar = cVar.f364790b;
                iVar.copyOnWrite();
                C139823j jVar2 = (C139823j) iVar.instance;
                jVar2.f380068a |= 1024;
                jVar2.f380079l = axVar.mo56113h();
                iVar.copyOnWrite();
                C139823j jVar3 = (C139823j) iVar.instance;
                jVar3.f380068a |= 512;
                jVar3.f380078k = true;
                fVar.mo115251b(e, (C139823j) iVar.build());
                return;
            }
            throw null;
        }
        bVar.f364788e.mo111465a(parse, z);
    }
}
