package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90215f;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117553g;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.c */
/* compiled from: PG */
public final class C117581c implements C117553g, C23252b {

    /* renamed from: a */
    public final C23251a f326400a;

    /* renamed from: b */
    private final List f326401b;

    public C117581c(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "videoPlayerInitModel", new C23271p(C90215f.f252021i.getParserForType(), C62921ba.m95368a(), C90215f.f252021i), false, true, false);
        this.f326400a = aVar2;
        aVar.mo28530a(aVar2);
        this.f326401b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326401b;
    }
}
