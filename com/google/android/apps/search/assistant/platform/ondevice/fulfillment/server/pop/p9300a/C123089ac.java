package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123140c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123534h;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.C123148c;
import com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122136q;
import com.google.android.libraries.assistant.portable.C19099g;
import com.google.android.libraries.assistant.portable.C19100h;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.android.libraries.search.assistant.p2716p.p2717a.p2718a.p2719a.C34922b;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ac */
/* compiled from: PG */
public final class C123089ac implements C123140c {

    /* renamed from: a */
    public static final C59071e f340684a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ac");

    /* renamed from: b */
    public final C122136q f340685b;

    /* renamed from: c */
    public final C123098al f340686c;

    /* renamed from: d */
    public final C123117g f340687d;

    /* renamed from: e */
    public final C123534h f340688e;

    /* renamed from: f */
    public final Executor f340689f;

    /* renamed from: g */
    public final Executor f340690g;

    /* renamed from: h */
    public final Executor f340691h;

    /* renamed from: i */
    public final boolean f340692i;

    /* renamed from: j */
    public final C37215b f340693j;

    /* renamed from: k */
    public final C123103aq f340694k;

    /* renamed from: l */
    public final C123114d f340695l;

    /* renamed from: m */
    private final C123148c f340696m;

    /* renamed from: n */
    private final C123033c f340697n;

    /* renamed from: o */
    private final C34922b f340698o;

    public C123089ac(C122136q qVar, C123103aq aqVar, C34922b bVar, C123148c cVar, C123098al alVar, C123033c cVar2, C123117g gVar, C123534h hVar, boolean z, Executor executor, Executor executor2, Executor executor3, C38780c cVar3, C123114d dVar) {
        this.f340685b = qVar;
        this.f340694k = aqVar;
        this.f340698o = bVar;
        this.f340696m = cVar;
        this.f340686c = alVar;
        this.f340697n = cVar2;
        this.f340687d = gVar;
        this.f340688e = hVar;
        this.f340692i = z;
        this.f340689f = executor;
        this.f340690g = executor2;
        this.f340691h = executor3;
        this.f340693j = cVar3.mo41619a(C38828b.ASSISTANT);
        this.f340695l = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo105872a(C123099am amVar, C122985af afVar, C123001av avVar) {
        C123148c cVar = this.f340696m;
        Objects.requireNonNull(cVar);
        C60870cx c = avVar.mo105820c(20002, new C123126p(cVar));
        C34922b bVar = this.f340698o;
        Objects.requireNonNull(bVar);
        C60870cx c2 = avVar.mo105820c(20003, new C123127q(bVar));
        C123033c cVar2 = this.f340697n;
        Objects.requireNonNull(cVar2);
        C60870cx c3 = avVar.mo105820c(20004, new C123128r(cVar2));
        return C47638k.m84753d(c, c2, c3).mo51521b(new C123130t(this, avVar, c2, c, c3, amVar, afVar), this.f340690g);
    }

    /* renamed from: b */
    public final C60870cx mo105873b(PortableAssistant portableAssistant, Optional optional) {
        C60870cx f = portableAssistant.mo24260f(C19099g.f53560a);
        C19100h hVar = C19100h.f53561a;
        C60870cx h = C60922j.m93045h(f, C47810es.m84966f(hVar), C60826bg.f164896a);
        if (!optional.isPresent()) {
            return h;
        }
        C123122l lVar = new C123122l(portableAssistant, optional);
        return C60922j.m93045h(h, C47810es.m84966f(lVar), this.f340690g);
    }
}
