package com.google.android.apps.gsa.staticplugins.videoplayer.p8781a;

import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117554h;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117556j;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23261f;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.a.c */
/* compiled from: PG */
public final class C117538c implements C117554h, C23252b {

    /* renamed from: a */
    private final C23251a f326256a;

    /* renamed from: b */
    private final C23251a f326257b;

    /* renamed from: c */
    private final C23251a f326258c;

    /* renamed from: d */
    private final C23251a f326259d;

    /* renamed from: e */
    private final List f326260e;

    public C117538c(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "sourceUrl", new C23272q(), true, false, false);
        this.f326256a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "triggerExitTransition", new C23256a(), true, false, false);
        this.f326257b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "videoAspectRatio", new C23261f(), true, false, false);
        this.f326258c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar, "youtubePlaybackModel", new C23271p(C117556j.f326308j.getParserForType(), C62921ba.m95368a(), C117556j.f326308j), true, false, false);
        this.f326259d = aVar5;
        aVar.mo28530a(aVar5);
        this.f326260e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326260e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103362b() {
        return this.f326256a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo103363c() {
        return this.f326257b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo103364d() {
        return this.f326258c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo103365e() {
        return this.f326259d;
    }
}
