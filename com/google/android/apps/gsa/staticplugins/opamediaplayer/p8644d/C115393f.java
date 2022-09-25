package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115482z;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.f */
/* compiled from: PG */
public final class C115393f implements C115482z, C23252b {

    /* renamed from: a */
    private final C23251a f320181a;

    /* renamed from: b */
    private final C23251a f320182b;

    /* renamed from: c */
    private final List f320183c;

    public C115393f(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), true, false, false);
        this.f320181a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "playbackStateProto", new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q), true, false, false);
        this.f320182b = aVar3;
        aVar.mo28530a(aVar3);
        this.f320183c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320183c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102023b() {
        return this.f320181a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102024c() {
        return this.f320182b;
    }
}
