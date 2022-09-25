package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115470n;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.d */
/* compiled from: PG */
public final class C115391d implements C115470n, C23252b {

    /* renamed from: a */
    private final C23251a f320172a;

    /* renamed from: b */
    private final C23251a f320173b;

    /* renamed from: c */
    private final List f320174c;

    public C115391d(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "mediaItem", new C23271p(C52174hz.f136892m.getParserForType(), C62921ba.m95368a(), C52174hz.f136892m), true, false, false);
        this.f320172a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "playbackStateProto", new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q), true, false, false);
        this.f320173b = aVar3;
        aVar.mo28530a(aVar3);
        this.f320174c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320174c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102031b() {
        return this.f320172a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102032c() {
        return this.f320173b;
    }
}
