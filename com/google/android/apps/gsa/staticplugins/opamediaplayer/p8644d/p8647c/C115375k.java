package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115456z;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ProtoListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.k */
/* compiled from: PG */
public final class C115375k implements C115456z, C23252b {

    /* renamed from: a */
    private final C23251a f320142a;

    /* renamed from: b */
    private final C23251a f320143b;

    /* renamed from: c */
    private final C23251a f320144c;

    /* renamed from: d */
    private final C23251a f320145d;

    /* renamed from: e */
    private final List f320146e;

    public C115375k(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "isDogfoodVoices", new C23256a(), true, false, false);
        this.f320142a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "selectedVoice", new C23271p(C68185bu.f184497d.getParserForType(), C62921ba.m95368a(), C68185bu.f184497d), true, false, false);
        this.f320143b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "ttsPlaying", new C23256a(), true, false, false);
        this.f320144c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar, "voices", new ProtoListUtils(C115374j.f320141a, C85333k.f231104g.getParserForType(), C62921ba.m95368a()), true, false, false);
        this.f320145d = aVar5;
        aVar.mo28530a(aVar5);
        this.f320146e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f320146e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102027b() {
        return this.f320142a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102028c() {
        return this.f320143b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102029d() {
        return this.f320144c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102030e() {
        return this.f320145d;
    }
}
