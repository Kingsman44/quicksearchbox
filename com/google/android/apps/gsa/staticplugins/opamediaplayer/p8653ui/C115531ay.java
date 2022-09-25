package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115482z;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ay */
/* compiled from: PG */
public final class C115531ay implements C115482z, C23252b {

    /* renamed from: a */
    public final C23251a f320459a;

    /* renamed from: b */
    public final C23251a f320460b;

    /* renamed from: c */
    private final List f320461c;

    public C115531ay(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), false, true, false);
        this.f320459a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "playbackStateProto", new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q), false, true, false);
        this.f320460b = aVar3;
        aVar.mo28530a(aVar3);
        this.f320461c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320461c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102023b() {
        return this.f320459a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102024c() {
        return this.f320460b;
    }
}
