package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105452v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.eh */
/* compiled from: PG */
public final class C105588eh implements C105452v, C23252b {

    /* renamed from: a */
    private final C23219p f294606a;

    /* renamed from: b */
    private final C23251a f294607b;

    /* renamed from: c */
    private final C23251a f294608c;

    /* renamed from: d */
    private final C23251a f294609d;

    /* renamed from: e */
    private final C23219p f294610e;

    /* renamed from: f */
    private final C23251a f294611f;

    /* renamed from: g */
    private final C23251a f294612g;

    /* renamed from: h */
    private final C23251a f294613h;

    /* renamed from: i */
    private final C23251a f294614i;

    /* renamed from: j */
    private final C23251a f294615j;

    /* renamed from: k */
    private final List f294616k;

    public C105588eh(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f294606a = new C23219p("accountParticleChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "allowDoodleSwitchForFeedRefresh", new C23256a(), false, true, false);
        this.f294607b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "customHintColor", new C23272q(), false, true, false);
        this.f294608c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "customHintColorDarkMode", new C23272q(), false, true, false);
        this.f294609d = aVar4;
        aVar.mo28530a(aVar4);
        this.f294610e = new C23219p("doodleChild", jVar, true);
        C22945j jVar3 = jVar;
        C23251a aVar5 = new C23251a(jVar3, "hotwordHint", new C23268m(new C23272q()), false, true, false);
        this.f294611f = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar3, "isBackgroundDark", new C23256a(), false, true, false);
        this.f294612g = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar3, "optedIn", new C23256a(), false, true, false);
        this.f294613h = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar3, "showUpdatesTab", new C23256a(), false, true, false);
        this.f294614i = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(jVar3, "zeroStateIconV2Enabled", new C23256a(), false, true, false);
        this.f294615j = aVar9;
        aVar.mo28530a(aVar9);
        this.f294616k = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294616k;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo94606b() {
        return this.f294606a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo94607c() {
        return this.f294610e;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94642d() {
        return this.f294608c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94609e() {
        return this.f294607b;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo94610f() {
        return this.f294612g;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo94643g() {
        return this.f294609d;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo94644h() {
        return this.f294611f;
    }

    /* renamed from: i */
    public final /* synthetic */ C23250b mo94645i() {
        return this.f294613h;
    }

    /* renamed from: j */
    public final /* synthetic */ C23250b mo94614j() {
        return this.f294614i;
    }

    /* renamed from: k */
    public final /* synthetic */ C23250b mo94615k() {
        return this.f294615j;
    }

    /* renamed from: l */
    public final C23251a mo94616l() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
