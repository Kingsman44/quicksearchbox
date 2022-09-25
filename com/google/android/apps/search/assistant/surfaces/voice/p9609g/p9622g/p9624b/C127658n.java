package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127637b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127671c;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.C127913q;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9660c.C127914a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.n */
/* compiled from: PG */
public final class C127658n implements C127671c {

    /* renamed from: a */
    public static final C59071e f351455a = C59071e.m91331h();

    /* renamed from: b */
    public final C127913q f351456b;

    /* renamed from: c */
    public final C127643ae f351457c;

    /* renamed from: d */
    public final C37215b f351458d;

    /* renamed from: e */
    public final AtomicBoolean f351459e = new AtomicBoolean(false);

    /* renamed from: f */
    public final C71788b f351460f = new C71799m();

    /* renamed from: g */
    private final C71422aw f351461g;

    public C127658n(C127913q qVar, C71422aw awVar, C127643ae aeVar, C37215b bVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aeVar, "mainAssistantTriggeringClient");
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f351456b = qVar;
        this.f351461g = awVar;
        this.f351457c = aeVar;
        this.f351458d = bVar;
        C127914a.m209034b(qVar, new C127655k(this));
    }

    /* renamed from: a */
    public final C60870cx mo108160a(C127613a aVar) {
        C69664n.m101061g(aVar, "connectReason");
        return C71663i.m104692e(this.f351461g, (C71424ay) null, new C127656l(this, aVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo108161b(C127637b bVar, List list) {
        C69664n.m101061g(bVar, "disconnectReason");
        return C71663i.m104692e(this.f351461g, (C71424ay) null, new C127657m(this, bVar, list, (C69577g) null), 3);
    }
}
