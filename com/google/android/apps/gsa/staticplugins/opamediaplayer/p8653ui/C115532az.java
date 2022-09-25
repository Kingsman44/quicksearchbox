package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115457aa;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23255e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23174k;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.az */
/* compiled from: PG */
public final class C115532az implements C115457aa, C23252b {

    /* renamed from: a */
    public final C23219p f320462a;

    /* renamed from: b */
    public final C23174k f320463b;

    /* renamed from: c */
    public final C23219p f320464c;

    /* renamed from: d */
    public final C23174k f320465d;

    /* renamed from: e */
    public final C23251a f320466e;

    /* renamed from: f */
    private final C23251a f320467f;

    /* renamed from: g */
    private final List f320468g;

    public C115532az(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f320462a = new C23219p("appbarChild", jVar, false);
        C23251a aVar2 = new C23251a(jVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), false, true, false);
        this.f320467f = aVar2;
        aVar.mo28530a(aVar2);
        this.f320463b = new C23174k("mediaPlayerChild", jVar);
        this.f320464c = new C23219p("playbackPanelChild", jVar, false);
        this.f320465d = new C23174k("playlistChild", jVar);
        C23251a aVar3 = new C23251a(jVar, "uxRefreshEnabled", new C23256a(), false, true, false);
        this.f320466e = aVar3;
        aVar.mo28530a(aVar3);
        this.f320468g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320468g;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo102038b() {
        return this.f320462a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo102039c() {
        return this.f320464c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102040d() {
        return this.f320467f;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102041e() {
        return this.f320466e;
    }

    /* renamed from: f */
    public final /* synthetic */ C23255e mo102042f() {
        return this.f320463b;
    }

    /* renamed from: g */
    public final /* synthetic */ C23255e mo102043g() {
        return this.f320465d;
    }
}
