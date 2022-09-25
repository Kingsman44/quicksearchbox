package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105437g;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23194a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ar */
/* compiled from: PG */
public final class C105490ar implements C105437g, C23252b {

    /* renamed from: a */
    public final C23251a f294268a;

    /* renamed from: b */
    private final C23251a f294269b;

    /* renamed from: c */
    private final C23251a f294270c;

    /* renamed from: d */
    private final C23251a f294271d;

    /* renamed from: e */
    private final C23251a f294272e;

    /* renamed from: f */
    private final C23251a f294273f;

    /* renamed from: g */
    private final C23251a f294274g;

    /* renamed from: h */
    private final C23251a f294275h;

    /* renamed from: i */
    private final C23194a f294276i;

    /* renamed from: j */
    private final C23194a f294277j;

    /* renamed from: k */
    private final C23251a f294278k;

    /* renamed from: l */
    private final C23251a f294279l;

    /* renamed from: m */
    private final C23251a f294280m;

    /* renamed from: n */
    private final C23251a f294281n;

    /* renamed from: o */
    private final C23251a f294282o;

    /* renamed from: p */
    private final C23194a f294283p;

    /* renamed from: q */
    private final C23251a f294284q;

    /* renamed from: r */
    private final C23251a f294285r;

    /* renamed from: s */
    private final List f294286s;

    public C105490ar(C23117m mVar, C23110f fVar) {
        C23087a aVar = new C23087a();
        C23117m mVar2 = mVar;
        C23251a aVar2 = new C23251a(mVar2, "allChildrenAdded", new C23256a(), true, false, false);
        this.f294269b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(mVar2, "enableNowRemoteClientConnection", new C23256a(), true, false, false);
        this.f294270c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(mVar2, "hasNotificationRefreshContent", new C23256a(), true, false, false);
        this.f294271d = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(mVar2, "isBackgroundDark", new C23256a(), true, false, false);
        this.f294272e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(mVar2, "isHeaderDetached", new C23256a(), true, false, false);
        this.f294273f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(mVar2, "isPomoEnabled", new C23256a(), true, false, false);
        this.f294274g = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(mVar, "newContentButtonData", new C23271p(C7853mj.f27527d.getParserForType(), C62921ba.m95368a(), C7853mj.f27527d), true, false, false);
        this.f294275h = aVar8;
        aVar.mo28530a(aVar8);
        this.f294276i = new C23194a("reactionChild", mVar, fVar);
        C23251a aVar9 = new C23251a(mVar, "refreshingEntries", new C23256a(), true, false, false);
        this.f294268a = aVar9;
        aVar.mo28530a(aVar9);
        this.f294277j = new C23194a("scrimChild", mVar, fVar);
        C23117m mVar3 = mVar;
        C23251a aVar10 = new C23251a(mVar3, "scrimEnabled", new C23256a(), true, false, false);
        this.f294278k = aVar10;
        aVar.mo28530a(aVar10);
        C23251a aVar11 = new C23251a(mVar3, "scrollOffset", new C23265j(), true, false, false);
        this.f294279l = aVar11;
        aVar.mo28530a(aVar11);
        C23251a aVar12 = new C23251a(mVar3, "scrollPosition", new C23265j(), true, false, false);
        this.f294280m = aVar12;
        aVar.mo28530a(aVar12);
        new C23194a("snackbarChild", mVar, fVar);
        C23251a aVar13 = new C23251a(mVar, "spinnerEnabled", new C23256a(), true, false, false);
        this.f294281n = aVar13;
        aVar.mo28530a(aVar13);
        C23251a aVar14 = new C23251a(mVar, "surfaceType", new C23268m(new C23259d(C8142xb.values())), true, false, false);
        this.f294282o = aVar14;
        aVar.mo28530a(aVar14);
        this.f294283p = new C23194a("tooltipChild", mVar, fVar);
        C23117m mVar4 = mVar;
        C23251a aVar15 = new C23251a(mVar4, "veLoggingDebugOverlayEnabled", new C23256a(), true, false, false);
        this.f294284q = aVar15;
        aVar.mo28530a(aVar15);
        C23251a aVar16 = new C23251a(mVar4, "viewRecordingInOnPause", new C23256a(), true, false, false);
        this.f294285r = aVar16;
        aVar.mo28530a(aVar16);
        this.f294286s = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294286s;
    }

    /* renamed from: d */
    public final /* synthetic */ C23248a mo94539d() {
        return this.f294276i;
    }

    /* renamed from: e */
    public final /* synthetic */ C23248a mo94540e() {
        return this.f294277j;
    }

    /* renamed from: f */
    public final /* synthetic */ C23248a mo94541f() {
        return this.f294283p;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo94542g() {
        return this.f294269b;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo94543h() {
        return this.f294270c;
    }

    /* renamed from: i */
    public final /* synthetic */ C23250b mo94544i() {
        return this.f294271d;
    }

    /* renamed from: j */
    public final /* synthetic */ C23250b mo94545j() {
        return this.f294272e;
    }

    /* renamed from: k */
    public final /* synthetic */ C23250b mo94546k() {
        return this.f294274g;
    }

    /* renamed from: l */
    public final /* synthetic */ C23250b mo94547l() {
        return this.f294268a;
    }

    /* renamed from: m */
    public final /* synthetic */ C23250b mo94548m() {
        return this.f294278k;
    }

    /* renamed from: n */
    public final /* synthetic */ C23250b mo94549n() {
        return this.f294279l;
    }

    /* renamed from: o */
    public final /* synthetic */ C23250b mo94550o() {
        return this.f294280m;
    }

    /* renamed from: p */
    public final /* synthetic */ C23250b mo94551p() {
        return this.f294281n;
    }

    /* renamed from: q */
    public final /* synthetic */ C23250b mo94552q() {
        return this.f294282o;
    }

    /* renamed from: r */
    public final /* synthetic */ C23250b mo94553r() {
        return this.f294284q;
    }

    /* renamed from: s */
    public final /* synthetic */ C23250b mo94554s() {
        return this.f294285r;
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
