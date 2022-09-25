package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110963aa;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3790a.C48550c;
import com.google.assistant.p3781ad.p3789d.p3790a.C48551d;
import com.google.assistant.p3781ad.p3789d.p3790a.C48552e;
import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.assistant.p3781ad.p3789d.p3790a.C48555h;
import com.google.assistant.p3781ad.p3789d.p3790a.C48556i;
import com.google.assistant.p3781ad.p3789d.p3790a.C48557j;
import com.google.assistant.p3781ad.p3789d.p3790a.C48558k;
import com.google.assistant.p3781ad.p3789d.p3790a.C48559l;
import com.google.assistant.p3781ad.p3789d.p3790a.C48560m;
import com.google.assistant.p3781ad.p3789d.p3790a.C48565r;
import com.google.assistant.p3781ad.p3789d.p3790a.C48566s;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.m */
/* compiled from: PG */
public final class C111862m implements C111858i {

    /* renamed from: a */
    private final C111857h f310846a;

    /* renamed from: b */
    private final C111850a f310847b;

    public C111862m(C111857h hVar, C111850a aVar) {
        this.f310846a = hVar;
        this.f310847b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo99268a(C113415ez ezVar) {
        Optional optional;
        Optional optional2;
        C60870cx cxVar;
        Optional optional3;
        C60870cx cxVar2;
        String str;
        C48565r rVar = (C48565r) C48566s.f125467i.createBuilder();
        String L = ezVar.mo100199L();
        rVar.copyOnWrite();
        C48566s sVar = (C48566s) rVar.instance;
        L.getClass();
        sVar.f125469a |= 32;
        sVar.f125475g = L;
        C48580an j = ezVar.mo100210j();
        rVar.copyOnWrite();
        C48566s sVar2 = (C48566s) rVar.instance;
        sVar2.f125470b = j.getNumber();
        sVar2.f125469a |= 1;
        int e = ezVar.mo100205e();
        rVar.copyOnWrite();
        C48566s sVar3 = (C48566s) rVar.instance;
        sVar3.f125469a |= 2;
        sVar3.f125471c = e;
        C48672ag k = ezVar.mo100211k();
        rVar.copyOnWrite();
        C48566s sVar4 = (C48566s) rVar.instance;
        sVar4.f125474f = k.f125915O;
        sVar4.f125469a |= 16;
        double a = ezVar.mo100201a();
        rVar.copyOnWrite();
        C48566s sVar5 = (C48566s) rVar.instance;
        sVar5.f125469a |= 8;
        sVar5.f125473e = a;
        if (ezVar.mo100210j() == C48580an.ICON_SHORTCUT) {
            optional = Optional.m71637of(C111851b.OPEN_APP);
        } else if (ezVar.mo100211k() == C48672ag.APP_ACTIONS_SHORTCUT) {
            optional = Optional.m71637of(C111851b.APP_ACTION_SHORTCUT);
        } else if (ezVar.mo100210j() == C48580an.APP_SHORTCUTS) {
            optional = Optional.m71637of(C111851b.APP_SHORTCUT);
        } else {
            optional = Optional.empty();
        }
        if (!optional.isPresent()) {
            return C60856cj.m92900i((C48566s) rVar.build());
        }
        C111851b bVar = (C111851b) optional.get();
        C111850a aVar = this.f310847b;
        C111851b bVar2 = C111851b.OPEN_APP;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            Optional c = ((C113284bi) ezVar.mo100224x().get()).mo99961c();
            if (!c.isPresent()) {
                ((C59052c) ((C59052c) C111850a.f310829a.mo56226d()).mo56372aa(27453)).mo56386p("missing iconSourceOptional for the OpenApp icon");
                optional2 = Optional.empty();
            } else {
                C113286bk bkVar = (C113286bk) c.get();
                if (bkVar.mo99930b() == 1) {
                    C48552e eVar = (C48552e) C48553f.f125431e.createBuilder();
                    eVar.copyOnWrite();
                    C48553f fVar = (C48553f) eVar.instance;
                    fVar.f125436d = 1;
                    fVar.f125433a |= 4;
                    String e2 = ((C113286bk) c.get()).mo99942e();
                    eVar.copyOnWrite();
                    C48553f fVar2 = (C48553f) eVar.instance;
                    e2.getClass();
                    fVar2.f125434b = 1;
                    fVar2.f125435c = e2;
                    optional2 = Optional.m71637of((C48553f) eVar.build());
                } else if (bkVar.mo99930b() == 4) {
                    optional2 = Optional.m71637of(aVar.mo99267a(bkVar.mo99929a()));
                } else {
                    ((C59052c) ((C59052c) C111850a.f310829a.mo56226d()).mo56372aa(27452)).mo56386p("icon source is neither a URI or package");
                    optional2 = Optional.empty();
                }
            }
        } else if (ordinal == 1) {
            C113284bi biVar = (C113284bi) ezVar.mo100224x().get();
            if (biVar.mo99962d().isPresent()) {
                optional2 = Optional.m71637of(aVar.mo99267a(((ShortcutInfo) biVar.mo99962d().get()).getPackage()));
            } else {
                ((C59052c) ((C59052c) C111850a.f310829a.mo56226d()).mo56372aa(27451)).mo56386p("missing ShortcutInfo package in IconShortcutSuggestionParams");
                optional2 = Optional.empty();
            }
        } else if (ordinal != 2) {
            optional2 = Optional.empty();
        } else {
            Optional j2 = ((C113502n) ezVar.mo100218r().get()).mo100047j();
            if (!j2.isPresent()) {
                ((C59052c) ((C59052c) C111850a.f310829a.mo56226d()).mo56372aa(27450)).mo56386p("missing package in AppActionSuggestionParams");
                optional2 = Optional.empty();
            } else {
                optional2 = Optional.m71637of(aVar.mo99267a((String) j2.get()));
            }
        }
        Objects.requireNonNull(rVar);
        optional2.ifPresent(new C111859j(rVar));
        C111857h hVar = this.f310846a;
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                C113284bi biVar2 = (C113284bi) ezVar.mo100224x().get();
                if (biVar2.mo99962d().isEmpty()) {
                    ((C59052c) ((C59052c) C111857h.f310841a.mo56226d()).mo56372aa(27454)).mo56386p("missing ShortcutInfo from IconShortcutSuggestionParams");
                    cxVar2 = C60856cj.m92900i(Optional.empty());
                } else {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) biVar2.mo99962d().get();
                    C48555h hVar2 = (C48555h) C48556i.f125438f.createBuilder();
                    String str2 = shortcutInfo.getPackage();
                    hVar2.copyOnWrite();
                    C48556i iVar = (C48556i) hVar2.instance;
                    str2.getClass();
                    iVar.f125440a = 4 | iVar.f125440a;
                    iVar.f125443d = str2;
                    String id = shortcutInfo.getId();
                    hVar2.copyOnWrite();
                    C48556i iVar2 = (C48556i) hVar2.instance;
                    id.getClass();
                    iVar2.f125440a = 2 | iVar2.f125440a;
                    iVar2.f125442c = id;
                    boolean isDynamic = shortcutInfo.isDynamic();
                    hVar2.copyOnWrite();
                    C48556i iVar3 = (C48556i) hVar2.instance;
                    iVar3.f125440a |= 8;
                    iVar3.f125444e = isDynamic;
                    cxVar2 = biVar2.mo99959a().isPresent() ? C60922j.m93044g((C60870cx) biVar2.mo99959a().get(), new C111852c(hVar2), C60826bg.f164896a) : C60856cj.m92900i(Optional.m71637of((C48556i) hVar2.build()));
                }
                cxVar = C60922j.m93044g(cxVar2, C111856g.f310840a, C60826bg.f164896a);
            } else if (ordinal2 == 2) {
                C48557j jVar = (C48557j) C48558k.f125445c.createBuilder();
                C48550c cVar = (C48550c) C48551d.f125425e.createBuilder();
                C113502n nVar = (C113502n) ezVar.mo100218r().get();
                C110963aa aaVar = hVar.f310842b;
                C58495hd c2 = nVar.mo100038c();
                C58976aa aaVar2 = C58975e.f156826a;
                Optional a2 = aaVar.mo98992a(nVar.mo100250p(), nVar.mo100047j(), c2);
                if (a2.isEmpty()) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = ((Intent) a2.get()).toUri(1);
                }
                cVar.copyOnWrite();
                C48551d dVar = (C48551d) cVar.instance;
                str.getClass();
                dVar.f125427a = 2 | dVar.f125427a;
                dVar.f125429c = str;
                Optional g = nVar.mo100043g();
                Objects.requireNonNull(cVar);
                g.ifPresent(new C111854e(cVar));
                Optional p = nVar.mo100250p();
                Objects.requireNonNull(cVar);
                p.ifPresent(new C111855f(cVar));
                C48551d dVar2 = (C48551d) cVar.build();
                jVar.copyOnWrite();
                C48558k kVar = (C48558k) jVar.instance;
                dVar2.getClass();
                kVar.f125448b = dVar2;
                kVar.f125447a = 3;
                cxVar = C60856cj.m92900i(Optional.m71637of((C48558k) jVar.build()));
            }
            return C60922j.m93044g(cxVar, new C111860k(rVar), C60826bg.f164896a);
        }
        C41679e i = ezVar.mo100209i();
        C41693s sVar6 = i.f109009c;
        if (sVar6 == null) {
            sVar6 = C41693s.f109053h;
        }
        if ((sVar6.f109055a & 2) != 0) {
            C48559l lVar = (C48559l) C48560m.f125449c.createBuilder();
            C41693s sVar7 = i.f109009c;
            if (sVar7 == null) {
                sVar7 = C41693s.f109053h;
            }
            String str3 = sVar7.f109057c;
            lVar.copyOnWrite();
            C48560m mVar = (C48560m) lVar.instance;
            str3.getClass();
            mVar.f125451a |= 1;
            mVar.f125452b = str3;
            optional3 = Optional.m71637of((C48560m) lVar.build());
        } else {
            optional3 = Optional.empty();
        }
        if (optional3.isPresent()) {
            C48557j jVar2 = (C48557j) C48558k.f125445c.createBuilder();
            C48560m mVar2 = (C48560m) optional3.get();
            jVar2.copyOnWrite();
            C48558k kVar2 = (C48558k) jVar2.instance;
            mVar2.getClass();
            kVar2.f125448b = mVar2;
            kVar2.f125447a = 1;
            cxVar = C60856cj.m92900i(Optional.m71637of((C48558k) jVar2.build()));
            return C60922j.m93044g(cxVar, new C111860k(rVar), C60826bg.f164896a);
        }
        cxVar = C60856cj.m92900i(Optional.empty());
        return C60922j.m93044g(cxVar, new C111860k(rVar), C60826bg.f164896a);
    }
}
