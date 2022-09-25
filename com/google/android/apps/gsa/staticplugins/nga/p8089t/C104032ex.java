package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.languagepack.C74601au;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.nga.api.C74719bw;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import dagger.C68214a;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ex */
/* compiled from: PG */
public final class C104032ex implements C74601au {

    /* renamed from: a */
    public static final C58974d f289475a = C58974d.m91136j();

    /* renamed from: b */
    public final C103799g f289476b;

    /* renamed from: c */
    public final C68214a f289477c;

    /* renamed from: d */
    public final C90021c f289478d;

    /* renamed from: e */
    public final C42813k f289479e;

    /* renamed from: f */
    public final C104126w f289480f;

    /* renamed from: g */
    private final C74719bw f289481g;

    /* renamed from: h */
    private final C80617l f289482h;

    /* renamed from: i */
    private final C68214a f289483i;

    /* renamed from: j */
    private final C103908ah f289484j;

    public C104032ex(C74719bw bwVar, C103799g gVar, C80617l lVar, C68214a aVar, C68214a aVar2, C90021c cVar, C42813k kVar, C104126w wVar, C103908ah ahVar) {
        this.f289481g = bwVar;
        this.f289482h = lVar;
        this.f289476b = gVar;
        this.f289483i = aVar;
        this.f289477c = aVar2;
        this.f289478d = cVar;
        this.f289479e = kVar;
        this.f289480f = wVar;
        this.f289484j = ahVar;
        ((av) aVar.mo27525b()).e((C90936cf) null);
        ((av) aVar.mo27525b()).h.add(this);
    }

    /* renamed from: g */
    private final void m171984g() {
        if (m171985h()) {
            this.f289484j.mo93884f((C58528ij) Collection.EL.stream(((av) this.f289483i.mo27525b()).j().entrySet()).filter(new C104028et(this)).map(C104029eu.f289473a).collect(C58370cn.f155947b));
        }
    }

    /* renamed from: h */
    private final boolean m171985h() {
        av avVar = (av) this.f289483i.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        boolean z = avVar.o;
        return avVar.o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Optional mo93925a() {
        if (!m171985h()) {
            ((C58970a) ((C58970a) f289475a.mo56225c()).mo56372aa(21759)).mo56386p("Language Pack Update Controller not initialized.");
            return Optional.empty();
        }
        String e = mo93927e();
        Map i = ((av) this.f289483i.mo27525b()).i();
        Optional ofNullable = Optional.ofNullable((C8476as) i.get(e));
        if (ofNullable.isEmpty()) {
            ((C58970a) ((C58970a) f289475a.mo56226d()).mo56372aa(21758)).mo56354G("No compatible language for current locale (%s) present. Compatible language packs: %s", e, Collection.EL.stream(i.entrySet()).map(C104030ev.f289474a).collect(Collectors.joining(",")));
        }
        return ofNullable;
    }

    /* renamed from: b */
    public final void mo70957b(C8476as asVar) {
    }

    /* renamed from: c */
    public final void mo70958c() {
        m171984g();
        this.f289481g.mo71088c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo93926d() {
        return this.f289482h.mo74368c(C80627v.SODA);
    }

    /* renamed from: e */
    public final String mo93927e() {
        String languageTag = this.f289476b.mo93859b().toLanguageTag();
        return (String) Map.EL.getOrDefault(this.f289478d.mo79752r(C90126fx.f251596lm), languageTag, languageTag);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo93928f(boolean z) {
        if (z && Locale.forLanguageTag(mo93927e()).equals(Locale.forLanguageTag("en-US"))) {
            return true;
        }
        m171984g();
        C103908ah ahVar = this.f289484j;
        return ahVar.mo93880b().contains(mo93927e());
    }
}
