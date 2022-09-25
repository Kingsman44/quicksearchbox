package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117550d;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117552f;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.b */
/* compiled from: PG */
public final class C117580b implements C117550d, C23252b {

    /* renamed from: a */
    public final C23251a f326395a;

    /* renamed from: b */
    public final C23251a f326396b;

    /* renamed from: c */
    public final C23251a f326397c;

    /* renamed from: d */
    public final C23251a f326398d;

    /* renamed from: e */
    private final List f326399e;

    public C117580b(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "playbackTimeoutMillis", new C23265j(), false, true, false);
        this.f326395a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "sourceUrl", new C23272q(), false, true, false);
        this.f326396b = aVar3;
        aVar.mo28530a(aVar3);
        C22945j jVar3 = jVar;
        C23251a aVar4 = new C23251a(jVar3, "thirdPartyPlaybackModel", new C23271p(C117552f.f326294l.getParserForType(), C62921ba.m95368a(), C117552f.f326294l), false, true, false);
        this.f326397c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar3, "triggerExitTransition", new C23256a(), false, true, false);
        this.f326398d = aVar5;
        aVar.mo28530a(aVar5);
        this.f326399e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326399e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103358b() {
        return this.f326395a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo103359c() {
        return this.f326396b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo103360d() {
        return this.f326397c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo103361e() {
        return this.f326398d;
    }
}
