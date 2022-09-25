package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bx */
/* compiled from: PG */
public final class C103951bx {

    /* renamed from: a */
    static final C58528ij f289314a = C58528ij.m90015O(C80627v.TELEPORT, C80627v.QUERY_DEEP_LINKS, C80627v.SODA, C80627v.GENIE_FM, C80627v.APP_ACTIONS, C80627v.TCLIB, C80627v.INTENTS, C80627v.WEBREF, C80627v.SKIP_COMPONENT_LIST, C80627v.DICTATION_FORMATTING, C80627v.CORTEX, C80627v.SAFT_SEGMENTER);

    /* renamed from: b */
    private static final C58974d f289315b = C58974d.m91136j();

    /* renamed from: c */
    private static final C58528ij f289316c = ((C58528ij) Collection.EL.stream(C58485gu.m89852t("fr-FR", "fr-CA", "it-IT", "de-DE", "es-ES", "es-MX", "es-US")).map(C103950bw.f289313a).collect(C58370cn.f155947b));

    /* renamed from: d */
    private static final C58528ij f289317d = C58528ij.m90012L(C80627v.TELEPORT, C80627v.TCLIB, C80627v.WEBREF);

    /* renamed from: e */
    private final C86124t f289318e;

    /* renamed from: f */
    private final C103961cg f289319f;

    /* renamed from: g */
    private final C103799g f289320g;

    public C103951bx(C86124t tVar, C103961cg cgVar, C103799g gVar) {
        this.f289318e = tVar;
        this.f289319f = cgVar;
        this.f289320g = gVar;
    }

    /* renamed from: b */
    private final C58528ij m171892b() {
        try {
            C58528ij a = this.f289319f.mo93899a(this.f289318e.mo79758x(C90126fx.f251521kQ));
            ((C58970a) ((C58970a) f289315b.mo56224b()).mo56372aa(21711)).mo56389s("Flag controlled groups: %s", Collection.EL.stream(a).map(C103949bv.f289312a).collect(Collectors.joining(", ")));
            return a;
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f289315b.mo56225c()).mo56382g(e)).mo56372aa(21712)).mo56386p("Parsing initial download groups went wrong: returning default value.");
            return this.f289319f.mo93899a(C90126fx.f251521kQ.f251803b);
        }
    }

    /* renamed from: a */
    public final C58528ij mo93894a() {
        C58528ij ijVar;
        if (f289316c.contains(this.f289320g.mo93859b())) {
            C58526ih ihVar = new C58526ih();
            ihVar.mo55489i(f289317d);
            ihVar.mo55489i(m171892b());
            ijVar = ihVar.mo55486f();
        } else {
            C58526ih ihVar2 = new C58526ih();
            ihVar2.mo55489i(f289314a);
            ihVar2.mo55489i(m171892b());
            ijVar = ihVar2.mo55486f();
        }
        ((C58970a) ((C58970a) f289315b.mo56224b()).mo56372aa(21713)).mo56389s("Required groups: %s", Collection.EL.stream(ijVar).map(C103949bv.f289312a).collect(C58370cn.f155947b));
        return ijVar;
    }
}
