package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115478v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23261f;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ax */
/* compiled from: PG */
public final class C115530ax implements C115478v, C23252b {

    /* renamed from: a */
    public final C23251a f320453a;

    /* renamed from: b */
    public final C23251a f320454b;

    /* renamed from: c */
    public final C23251a f320455c;

    /* renamed from: d */
    public final C23251a f320456d;

    /* renamed from: e */
    public final C23251a f320457e;

    /* renamed from: f */
    private final List f320458f;

    public C115530ax(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), false, true, false);
        this.f320453a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "playbackError", new C23268m(new C23271p(C115464h.f320300c.getParserForType(), C62921ba.m95368a(), C115464h.f320300c)), false, true, false);
        this.f320454b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "playbackPanelState", new C23265j(), false, true, false);
        this.f320455c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "playbackSpeed", new C23261f(), false, true, false);
        this.f320456d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar, "playbackStateProto", new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q), false, true, false);
        this.f320457e = aVar6;
        aVar.mo28530a(aVar6);
        this.f320458f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320458f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102033b() {
        return this.f320453a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102034c() {
        return this.f320454b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102035d() {
        return this.f320455c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102036e() {
        return this.f320456d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo102037f() {
        return this.f320457e;
    }
}
