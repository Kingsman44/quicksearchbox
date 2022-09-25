package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117554h;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117556j;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23261f;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.d */
/* compiled from: PG */
public final class C117582d implements C117554h, C23252b {

    /* renamed from: a */
    public final C23251a f326402a;

    /* renamed from: b */
    public final C23251a f326403b;

    /* renamed from: c */
    public final C23251a f326404c;

    /* renamed from: d */
    public final C23251a f326405d;

    /* renamed from: e */
    private final List f326406e;

    public C117582d(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "sourceUrl", new C23272q(), false, true, false);
        this.f326402a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "triggerExitTransition", new C23256a(), false, true, false);
        this.f326403b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "videoAspectRatio", new C23261f(), false, true, false);
        this.f326404c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar, "youtubePlaybackModel", new C23271p(C117556j.f326308j.getParserForType(), C62921ba.m95368a(), C117556j.f326308j), false, true, false);
        this.f326405d = aVar5;
        aVar.mo28530a(aVar5);
        this.f326406e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326406e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103362b() {
        return this.f326402a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo103363c() {
        return this.f326403b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo103364d() {
        return this.f326404c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo103365e() {
        return this.f326405d;
    }
}
