package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8645a;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115474r;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23261f;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.a */
/* compiled from: PG */
public final class C115172a implements C115474r, C23252b {

    /* renamed from: a */
    private final C23251a f319640a;

    /* renamed from: b */
    private final C23251a f319641b;

    /* renamed from: c */
    private final C23251a f319642c;

    /* renamed from: d */
    private final C23251a f319643d;

    /* renamed from: e */
    private final List f319644e;

    public C115172a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), true, false, false);
        this.f319640a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "playbackError", new C23268m(new C23271p(C115464h.f320300c.getParserForType(), C62921ba.m95368a(), C115464h.f320300c)), true, false, false);
        this.f319641b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "playbackSpeed", new C23261f(), true, false, false);
        this.f319642c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar, "playbackStateProto", new C23268m(new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q)), true, false, false);
        this.f319643d = aVar5;
        aVar.mo28530a(aVar5);
        this.f319644e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f319644e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo101871b() {
        return this.f319640a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo101872c() {
        return this.f319641b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo101873d() {
        return this.f319642c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo101874e() {
        return this.f319643d;
    }
}
