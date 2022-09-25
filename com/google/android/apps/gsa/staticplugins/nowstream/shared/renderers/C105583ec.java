package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105442l;
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
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ec */
/* compiled from: PG */
public final class C105583ec implements C105442l, C23252b {

    /* renamed from: a */
    private final C23219p f294577a;

    /* renamed from: b */
    private final C23251a f294578b;

    /* renamed from: c */
    private final C23251a f294579c;

    /* renamed from: d */
    private final C23219p f294580d;

    /* renamed from: e */
    private final C23251a f294581e;

    /* renamed from: f */
    private final C23251a f294582f;

    /* renamed from: g */
    private final C23251a f294583g;

    /* renamed from: h */
    private final C23251a f294584h;

    /* renamed from: i */
    private final C23251a f294585i;

    /* renamed from: j */
    private final C23251a f294586j;

    /* renamed from: k */
    private final List f294587k;

    public C105583ec(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f294577a = new C23219p("accountParticleChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "actionButtonsAboveDoodle", new C23256a(), false, true, false);
        this.f294578b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "allowDoodleSwitchForFeedRefresh", new C23256a(), false, true, false);
        this.f294579c = aVar3;
        aVar.mo28530a(aVar3);
        this.f294580d = new C23219p("doodleChild", jVar, true);
        C22945j jVar3 = jVar;
        C23251a aVar4 = new C23251a(jVar3, "isBackgroundDark", new C23256a(), false, true, false);
        this.f294581e = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar3, "moveUpcomingIconToStart", new C23256a(), false, true, false);
        this.f294582f = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar3, "optedIn", new C23256a(), false, true, false);
        this.f294583g = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar3, "shouldDisableHeaderGradient", new C23256a(), false, true, false);
        this.f294584h = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar3, "showUpdatesTab", new C23256a(), false, true, false);
        this.f294585i = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(jVar3, "zeroStateIconV2Enabled", new C23256a(), false, true, false);
        this.f294586j = aVar9;
        aVar.mo28530a(aVar9);
        this.f294587k = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294587k;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo94606b() {
        return this.f294577a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo94607c() {
        return this.f294580d;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94608d() {
        return this.f294578b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94609e() {
        return this.f294579c;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo94610f() {
        return this.f294581e;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo94611g() {
        return this.f294582f;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo94612h() {
        return this.f294583g;
    }

    /* renamed from: i */
    public final /* synthetic */ C23250b mo94613i() {
        return this.f294584h;
    }

    /* renamed from: j */
    public final /* synthetic */ C23250b mo94614j() {
        return this.f294585i;
    }

    /* renamed from: k */
    public final /* synthetic */ C23250b mo94615k() {
        return this.f294586j;
    }

    /* renamed from: l */
    public final C23251a mo94616l() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
