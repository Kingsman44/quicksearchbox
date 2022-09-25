package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115437g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115443m;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ProtoListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.g */
/* compiled from: PG */
public final class C115811g implements C115443m, C23252b {

    /* renamed from: a */
    public final C23251a f321158a;

    /* renamed from: b */
    public final C23251a f321159b;

    /* renamed from: c */
    public final C23251a f321160c;

    /* renamed from: d */
    private final List f321161d;

    public C115811g(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "selectedLanguage", new C23272q(), false, true, false);
        this.f321158a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "showSnackbar", new C23256a(), false, true, false);
        this.f321159b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "supportedLanguages", new ProtoListUtils(C115786f.f321062a, C115437g.f320275d.getParserForType(), C62921ba.m95368a()), false, true, false);
        this.f321160c = aVar4;
        aVar.mo28530a(aVar4);
        this.f321161d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f321161d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo101979b() {
        return this.f321158a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo101980c() {
        return this.f321159b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo101981d() {
        return this.f321160c;
    }
}
