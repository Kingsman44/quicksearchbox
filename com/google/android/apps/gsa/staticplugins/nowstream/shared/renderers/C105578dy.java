package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105437g;
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
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7853mj;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dy */
/* compiled from: PG */
public final class C105578dy implements C105437g, C23252b {

    /* renamed from: a */
    public final C23251a f294542a;

    /* renamed from: b */
    private final C23251a f294543b;

    /* renamed from: c */
    private final C23251a f294544c;

    /* renamed from: d */
    private final C23251a f294545d;

    /* renamed from: e */
    private final C23251a f294546e;

    /* renamed from: f */
    private final C23251a f294547f;

    /* renamed from: g */
    private final C23251a f294548g;

    /* renamed from: h */
    private final C23219p f294549h;

    /* renamed from: i */
    private final C23251a f294550i;

    /* renamed from: j */
    private final C23219p f294551j;

    /* renamed from: k */
    private final C23251a f294552k;

    /* renamed from: l */
    private final C23251a f294553l;

    /* renamed from: m */
    private final C23251a f294554m;

    /* renamed from: n */
    private final C23251a f294555n;

    /* renamed from: o */
    private final C23251a f294556o;

    /* renamed from: p */
    private final C23219p f294557p;

    /* renamed from: q */
    private final C23251a f294558q;

    /* renamed from: r */
    private final C23251a f294559r;

    /* renamed from: s */
    private final List f294560s;

    public C105578dy(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "allChildrenAdded", new C23256a(), false, true, false);
        this.f294543b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "enableNowRemoteClientConnection", new C23256a(), false, true, false);
        this.f294544c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "hasNotificationRefreshContent", new C23256a(), false, true, false);
        this.f294545d = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "isBackgroundDark", new C23256a(), false, true, false);
        this.f294546e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar2, "isHeaderDetached", new C23256a(), false, true, false);
        this.f294547f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar2, "isPomoEnabled", new C23256a(), false, true, false);
        this.f294548g = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar, "newContentButtonData", new C23271p(C7853mj.f27527d.getParserForType(), C62921ba.m95368a(), C7853mj.f27527d), false, true, false);
        this.f294542a = aVar8;
        aVar.mo28530a(aVar8);
        this.f294549h = new C23219p("reactionChild", jVar, false);
        C23251a aVar9 = new C23251a(jVar, "refreshingEntries", new C23256a(), false, true, false);
        this.f294550i = aVar9;
        aVar.mo28530a(aVar9);
        this.f294551j = new C23219p("scrimChild", jVar, false);
        C22945j jVar3 = jVar;
        C23251a aVar10 = new C23251a(jVar3, "scrimEnabled", new C23256a(), false, true, false);
        this.f294552k = aVar10;
        aVar.mo28530a(aVar10);
        C23251a aVar11 = new C23251a(jVar3, "scrollOffset", new C23265j(), false, true, false);
        this.f294553l = aVar11;
        aVar.mo28530a(aVar11);
        C23251a aVar12 = new C23251a(jVar3, "scrollPosition", new C23265j(), false, true, false);
        this.f294554m = aVar12;
        aVar.mo28530a(aVar12);
        new C23219p("snackbarChild", jVar, false);
        C23251a aVar13 = new C23251a(jVar, "spinnerEnabled", new C23256a(), false, true, false);
        this.f294555n = aVar13;
        aVar.mo28530a(aVar13);
        C23251a aVar14 = new C23251a(jVar, "surfaceType", new C23268m(new C23259d(C8142xb.values())), false, true, false);
        this.f294556o = aVar14;
        aVar.mo28530a(aVar14);
        this.f294557p = new C23219p("tooltipChild", jVar, false);
        C22945j jVar4 = jVar;
        C23251a aVar15 = new C23251a(jVar4, "veLoggingDebugOverlayEnabled", new C23256a(), false, true, false);
        this.f294558q = aVar15;
        aVar.mo28530a(aVar15);
        C23251a aVar16 = new C23251a(jVar4, "viewRecordingInOnPause", new C23256a(), false, true, false);
        this.f294559r = aVar16;
        aVar.mo28530a(aVar16);
        this.f294560s = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294560s;
    }

    /* renamed from: d */
    public final /* synthetic */ C23248a mo94539d() {
        return this.f294549h;
    }

    /* renamed from: e */
    public final /* synthetic */ C23248a mo94540e() {
        return this.f294551j;
    }

    /* renamed from: f */
    public final /* synthetic */ C23248a mo94541f() {
        return this.f294557p;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo94542g() {
        return this.f294543b;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo94543h() {
        return this.f294544c;
    }

    /* renamed from: i */
    public final /* synthetic */ C23250b mo94544i() {
        return this.f294545d;
    }

    /* renamed from: j */
    public final /* synthetic */ C23250b mo94545j() {
        return this.f294546e;
    }

    /* renamed from: k */
    public final /* synthetic */ C23250b mo94546k() {
        return this.f294548g;
    }

    /* renamed from: l */
    public final /* synthetic */ C23250b mo94547l() {
        return this.f294550i;
    }

    /* renamed from: m */
    public final /* synthetic */ C23250b mo94548m() {
        return this.f294552k;
    }

    /* renamed from: n */
    public final /* synthetic */ C23250b mo94549n() {
        return this.f294553l;
    }

    /* renamed from: o */
    public final /* synthetic */ C23250b mo94550o() {
        return this.f294554m;
    }

    /* renamed from: p */
    public final /* synthetic */ C23250b mo94551p() {
        return this.f294555n;
    }

    /* renamed from: q */
    public final /* synthetic */ C23250b mo94552q() {
        return this.f294556o;
    }

    /* renamed from: r */
    public final /* synthetic */ C23250b mo94553r() {
        return this.f294558q;
    }

    /* renamed from: s */
    public final /* synthetic */ C23250b mo94554s() {
        return this.f294559r;
    }

    /* renamed from: t */
    public final C23251a mo94555t() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: v */
    public final C23251a mo94557v() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: w */
    public final C23251a mo94558w() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: y */
    public final C23251a mo94560y() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: z */
    public final C23251a mo94561z() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
