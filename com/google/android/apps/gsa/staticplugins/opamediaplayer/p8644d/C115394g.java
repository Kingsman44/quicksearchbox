package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115457aa;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23255e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23160l;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.g */
/* compiled from: PG */
public final class C115394g implements C115457aa, C23252b {

    /* renamed from: a */
    private final C23186f f320184a;

    /* renamed from: b */
    private final C23251a f320185b;

    /* renamed from: c */
    private final C23160l f320186c;

    /* renamed from: d */
    private final C23186f f320187d;

    /* renamed from: e */
    private final C23160l f320188e;

    /* renamed from: f */
    private final C23251a f320189f;

    /* renamed from: g */
    private final List f320190g;

    public C115394g(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f320184a = new C23186f("appbarChild", cVar, true);
        C23251a aVar2 = new C23251a(cVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), true, false, false);
        this.f320185b = aVar2;
        aVar.mo28530a(aVar2);
        this.f320186c = new C23160l("mediaPlayerChild", cVar);
        this.f320187d = new C23186f("playbackPanelChild", cVar, true);
        this.f320188e = new C23160l("playlistChild", cVar);
        C23251a aVar3 = new C23251a(cVar, "uxRefreshEnabled", new C23256a(), true, false, false);
        this.f320189f = aVar3;
        aVar.mo28530a(aVar3);
        this.f320190g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320190g;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo102038b() {
        return this.f320184a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo102039c() {
        return this.f320187d;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102040d() {
        return this.f320185b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102041e() {
        return this.f320189f;
    }

    /* renamed from: f */
    public final /* synthetic */ C23255e mo102042f() {
        return this.f320186c;
    }

    /* renamed from: g */
    public final /* synthetic */ C23255e mo102043g() {
        return this.f320188e;
    }
}
