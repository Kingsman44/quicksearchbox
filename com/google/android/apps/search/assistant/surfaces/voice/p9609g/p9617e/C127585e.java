package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9617e;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.C127334a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127671c;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.android.libraries.search.assistant.invocation.p2650m.C33952a;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.e.e */
/* compiled from: PG */
public final class C127585e implements C33952a {

    /* renamed from: a */
    public static final C59071e f351280a = C59071e.m91331h();

    /* renamed from: b */
    public final C127671c f351281b;

    /* renamed from: c */
    public final boolean f351282c;

    /* renamed from: d */
    public final C127334a f351283d;

    /* renamed from: e */
    public final Optional f351284e;

    /* renamed from: f */
    public final C37215b f351285f;

    /* renamed from: g */
    public final AtomicBoolean f351286g = new AtomicBoolean(false);

    /* renamed from: h */
    private final C71422aw f351287h;

    public C127585e(C71422aw awVar, C127671c cVar, boolean z, C127334a aVar, C31639g gVar, Optional optional, C37215b bVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cVar, "client");
        C69664n.m101061g(aVar, "speechBiasingContextSession");
        C69664n.m101061g(gVar, "phenotypeClient");
        C69664n.m101061g(optional, "spokenNotificationLifecycle");
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f351287h = awVar;
        this.f351281b = cVar;
        this.f351282c = z;
        this.f351283d = aVar;
        this.f351284e = optional;
        this.f351285f = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo39150a() {
        return C32561x.m60381a(this.f351287h, new C127582b(this, (C69577g) null));
    }

    /* renamed from: b */
    public final C60870cx mo39151b() {
        return C32561x.m60381a(this.f351287h, new C127584d(this, (C69577g) null));
    }
}
