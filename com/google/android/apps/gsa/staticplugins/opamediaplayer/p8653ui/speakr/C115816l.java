package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115456z;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ProtoListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.l */
/* compiled from: PG */
public final class C115816l implements C115456z, C23252b {

    /* renamed from: a */
    private final C23251a f321198a;

    /* renamed from: b */
    private final C23251a f321199b;

    /* renamed from: c */
    private final C23251a f321200c;

    /* renamed from: d */
    private final C23251a f321201d;

    /* renamed from: e */
    private final List f321202e;

    public C115816l(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "isDogfoodVoices", new C23256a(), false, true, false);
        this.f321198a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "selectedVoice", new C23271p(C68185bu.f184497d.getParserForType(), C62921ba.m95368a(), C68185bu.f184497d), false, true, false);
        this.f321199b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "ttsPlaying", new C23256a(), false, true, false);
        this.f321200c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar, "voices", new ProtoListUtils(C115815k.f321197a, C85333k.f231104g.getParserForType(), C62921ba.m95368a()), false, true, false);
        this.f321201d = aVar5;
        aVar.mo28530a(aVar5);
        this.f321202e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f321202e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102027b() {
        return this.f321198a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102028c() {
        return this.f321199b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102029d() {
        return this.f321200c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102030e() {
        return this.f321201d;
    }
}
