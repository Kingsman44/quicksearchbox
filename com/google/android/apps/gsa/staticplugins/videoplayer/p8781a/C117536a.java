package com.google.android.apps.gsa.staticplugins.videoplayer.p8781a;

import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117550d;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117552f;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.a.a */
/* compiled from: PG */
public final class C117536a implements C117550d, C23252b {

    /* renamed from: a */
    private final C23251a f326249a;

    /* renamed from: b */
    private final C23251a f326250b;

    /* renamed from: c */
    private final C23251a f326251c;

    /* renamed from: d */
    private final C23251a f326252d;

    /* renamed from: e */
    private final List f326253e;

    public C117536a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "playbackTimeoutMillis", new C23265j(), true, false, false);
        this.f326249a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "sourceUrl", new C23272q(), true, false, false);
        this.f326250b = aVar3;
        aVar.mo28530a(aVar3);
        C23052c cVar3 = cVar;
        C23251a aVar4 = new C23251a(cVar3, "thirdPartyPlaybackModel", new C23271p(C117552f.f326294l.getParserForType(), C62921ba.m95368a(), C117552f.f326294l), true, false, false);
        this.f326251c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar3, "triggerExitTransition", new C23256a(), true, false, false);
        this.f326252d = aVar5;
        aVar.mo28530a(aVar5);
        this.f326253e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326253e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103358b() {
        return this.f326249a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo103359c() {
        return this.f326250b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo103360d() {
        return this.f326251c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo103361e() {
        return this.f326252d;
    }
}
