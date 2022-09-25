package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115452v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.j */
/* compiled from: PG */
public final class C115814j implements C115452v, C23252b {

    /* renamed from: a */
    public final C23251a f321191a;

    /* renamed from: b */
    public final C23251a f321192b;

    /* renamed from: c */
    public final C23251a f321193c;

    /* renamed from: d */
    public final C23251a f321194d;

    /* renamed from: e */
    private final C23251a f321195e;

    /* renamed from: f */
    private final List f321196f;

    public C115814j(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "mediaData", new C23271p(C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), C52176ia.f136911k), false, true, false);
        this.f321191a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "playbackStateProto", new C23271p(C115466j.f320304q.getParserForType(), C62921ba.m95368a(), C115466j.f320304q), false, true, false);
        this.f321192b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "shouldResumePlaybackOnRestore", new C23256a(), false, true, false);
        this.f321195e = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "translationEnabled", new C23256a(), false, true, false);
        this.f321193c = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar2, "voiceSelectionEnabled", new C23256a(), false, true, false);
        this.f321194d = aVar6;
        aVar.mo28530a(aVar6);
        this.f321196f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f321196f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102023b() {
        return this.f321191a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102024c() {
        return this.f321192b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102025d() {
        return this.f321193c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102026e() {
        return this.f321194d;
    }

    /* renamed from: q */
    public final /* synthetic */ C23250b mo102013q() {
        return this.f321195e;
    }
}
