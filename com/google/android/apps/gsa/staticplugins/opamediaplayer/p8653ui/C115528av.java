package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115460d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.av */
/* compiled from: PG */
public final class C115528av implements C115460d, C23252b {

    /* renamed from: a */
    public final C23251a f320448a;

    /* renamed from: b */
    private final List f320449b;

    public C115528av(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), false, true, false);
        this.f320448a = aVar2;
        aVar.mo28530a(aVar2);
        this.f320449b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320449b;
    }
}
