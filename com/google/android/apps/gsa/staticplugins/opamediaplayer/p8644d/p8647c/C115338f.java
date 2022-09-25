package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115437g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115443m;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ProtoListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.f */
/* compiled from: PG */
public final class C115338f implements C115443m, C23252b {

    /* renamed from: a */
    private final C23251a f320014a;

    /* renamed from: b */
    private final C23251a f320015b;

    /* renamed from: c */
    private final C23251a f320016c;

    /* renamed from: d */
    private final List f320017d;

    public C115338f(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "selectedLanguage", new C23272q(), true, false, false);
        this.f320014a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "showSnackbar", new C23256a(), true, false, false);
        this.f320015b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "supportedLanguages", new ProtoListUtils(C115311e.f319945a, C115437g.f320275d.getParserForType(), C62921ba.m95368a()), true, false, false);
        this.f320016c = aVar4;
        aVar.mo28530a(aVar4);
        this.f320017d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320017d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo101979b() {
        return this.f320014a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo101980c() {
        return this.f320015b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo101981d() {
        return this.f320016c;
    }
}
