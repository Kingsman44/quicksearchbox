package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115474r;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23261f;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.av */
/* compiled from: PG */
public final class C115575av implements C115474r, C23252b {

    /* renamed from: a */
    private final C23251a f320599a;

    /* renamed from: b */
    private final C23251a f320600b;

    /* renamed from: c */
    private final C23251a f320601c;

    /* renamed from: d */
    private final C23251a f320602d;

    /* renamed from: e */
    private final List f320603e;

    public C115575av(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), false, true, false);
        this.f320599a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "playbackError", new C23268m(new C23271p(C115464h.f320300c.getParserForType(), C62921ba.m95368a(), C115464h.f320300c)), false, true, false);
        this.f320600b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "playbackSpeed", new C23261f(), false, true, false);
        this.f320601c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar, "playbackStateProto", new C23268m(new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q)), false, true, false);
        this.f320602d = aVar5;
        aVar.mo28530a(aVar5);
        this.f320603e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320603e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo101871b() {
        return this.f320599a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo101872c() {
        return this.f320600b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo101873d() {
        return this.f320601c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo101874e() {
        return this.f320602d;
    }
}
