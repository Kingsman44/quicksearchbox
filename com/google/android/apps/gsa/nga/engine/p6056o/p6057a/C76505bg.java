package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80573g;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80575i;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80576j;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82840cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.acz;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.net.URISyntaxException;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.bg */
/* compiled from: PG */
public final class C76505bg extends C76498b {

    /* renamed from: d */
    private static final C58974d f211720d = C58974d.m91136j();

    public C76505bg(C74757n nVar, C74965n nVar2, C79851ai aiVar) {
        super(nVar, nVar2, aiVar);
    }

    /* renamed from: g */
    private final Optional m123135g(String str) {
        if (this.f211702c.mo71337l().isEmpty()) {
            return Optional.m71637of(str);
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (!"com.google.android.googlequicksearchbox.GOOGLE_SEARCH".equals(parseUri.getAction()) || parseUri.getStringExtra("ved") != null) {
                return Optional.m71637of(str);
            }
            parseUri.putExtra("ved", (String) this.f211702c.mo71337l().get());
            return Optional.m71637of(parseUri.toUri(0));
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) f211720d.mo56226d()).mo56382g(e)).mo56372aa(3606)).mo56389s("Can't parse Intent from  uri: %s", str);
            return Optional.empty();
        }
    }

    /* renamed from: b */
    public final C82838ch mo72215b() {
        C82837cg cgVar = (C82837cg) C82838ch.f225874h.createBuilder();
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        chVar.f225877b = 1007;
        chVar.f225876a |= 1;
        C80371a aVar = (C80371a) C80386p.f220578g.createBuilder();
        C80379i f = mo72217f();
        aVar.copyOnWrite();
        f.getClass();
        ((C80386p) aVar.instance).f220585f = f;
        cgVar.copyOnWrite();
        C82838ch chVar2 = (C82838ch) cgVar.instance;
        C80386p pVar = (C80386p) aVar.build();
        pVar.getClass();
        chVar2.f225881f = pVar;
        chVar2.f225876a |= 16;
        C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder();
        ckVar.mo76626a(this.f211701b.mo71164r());
        ckVar.copyOnWrite();
        ((C82843cm) ckVar.instance).f225894d = C82840cj.m132412a(15);
        C82843cm cmVar = (C82843cm) ckVar.build();
        cgVar.copyOnWrite();
        C82838ch chVar3 = (C82838ch) cgVar.instance;
        cmVar.getClass();
        chVar3.f225882g = cmVar;
        chVar3.f225876a |= 32;
        return (C82838ch) cgVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C60870cx mo72216d() {
        C80401n nVar;
        C80576j jVar;
        Optional optional;
        if (this.f211701b.mo71165s()) {
            nVar = C80401n.f220656k;
        } else {
            Optional m = this.f211702c.mo71338m();
            e eVar = e.be;
            Objects.requireNonNull(eVar);
            if (((Boolean) m.map(new C76504bf(eVar)).orElse(false)).booleanValue()) {
                nVar = C80401n.f220656k;
            } else {
                Optional n = this.f211701b.mo71161n();
                if (n.isEmpty()) {
                    nVar = C80401n.f220656k;
                } else {
                    C80581o oVar = (C80581o) n.get();
                    C80586t tVar = oVar.f221192b;
                    if (tVar == null) {
                        tVar = C80586t.f221205g;
                    }
                    String str = tVar.f221208b;
                    C80578l lVar = oVar.f221193c;
                    if (lVar == null) {
                        lVar = C80578l.f221173g;
                    }
                    int a = C80573g.m128206a(lVar.f221175a);
                    int i = a - 1;
                    if (a == 0) {
                        throw null;
                    } else if (i == 0) {
                        C80578l lVar2 = oVar.f221193c;
                        if ((lVar2 == null ? C80578l.f221173g : lVar2).f221177c) {
                            C80578l lVar3 = lVar2 == null ? C80578l.f221173g : lVar2;
                            if (lVar3.f221175a == 2) {
                                String str2 = (String) lVar3.f221176b;
                            }
                            if (lVar2 == null) {
                                lVar2 = C80578l.f221173g;
                            }
                            nVar = C81442m.m129542d(lVar2.f221175a == 2 ? (String) lVar2.f221176b : BuildConfig.FLAVOR, C80363t.NGA_SUGGESTION);
                        } else {
                            nVar = C80401n.f220656k;
                        }
                    } else if (i == 1) {
                        C80578l lVar4 = oVar.f221193c;
                        if (lVar4 == null) {
                            lVar4 = C80578l.f221173g;
                        }
                        if (lVar4.f221175a == 3) {
                            jVar = (C80576j) lVar4.f221176b;
                        } else {
                            jVar = C80576j.f221168d;
                        }
                        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                        Optional g = m123135g(jVar.f221170a);
                        if (g.isEmpty()) {
                            optional = Optional.empty();
                        } else {
                            String str3 = (String) g.get();
                            esVar.copyOnWrite();
                            C51058ev evVar = (C51058ev) esVar.instance;
                            str3.getClass();
                            evVar.f132943a |= 32;
                            evVar.f132949g = str3;
                            if (!jVar.f221171b.isEmpty()) {
                                String str4 = jVar.f221171b;
                                esVar.copyOnWrite();
                                C51058ev evVar2 = (C51058ev) esVar.instance;
                                str4.getClass();
                                evVar2.f132943a |= 1;
                                evVar2.f132944b = str4;
                            }
                            int b = C80575i.m128208b(jVar.f221172c);
                            if (b == 0) {
                                b = 1;
                            }
                            int i2 = b - 2;
                            if (i2 == -1 || i2 == 0) {
                                C58970a aVar = (C58970a) ((C58970a) f211720d.mo56226d()).mo56372aa(3607);
                                int b2 = C80575i.m128208b(jVar.f221172c);
                                aVar.mo56389s("Invalid delivery type: %s", (b2 == 0 || b2 == 1) ? "UNRECOGNIZED" : b2 != 2 ? b2 != 3 ? b2 != 5 ? "null" : "SEND_BROADCAST" : "START_ACTIVITY" : "DELIVERY_TYPE_UNSPECIFIED");
                                optional = Optional.empty();
                            } else {
                                if (i2 == 3) {
                                    esVar.copyOnWrite();
                                    C51058ev evVar3 = (C51058ev) esVar.instance;
                                    evVar3.f132943a |= 2048;
                                    evVar3.f132954l = true;
                                }
                                optional = Optional.m71637of((C51058ev) esVar.build());
                            }
                        }
                        if (optional.isEmpty()) {
                            nVar = C80401n.f220656k;
                        } else {
                            C80399l lVar5 = (C80399l) C80401n.f220656k.createBuilder();
                            C51058ev evVar4 = (C51058ev) optional.get();
                            acz acz = (acz) ada.f134865f.createBuilder();
                            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                            ggVar.copyOnWrite();
                            C51098gh ghVar = (C51098gh) ggVar.instance;
                            evVar4.getClass();
                            ghVar.f133013c = evVar4;
                            ghVar.f133012b = 1;
                            acz.copyOnWrite();
                            ada ada = (ada) acz.instance;
                            C51098gh ghVar2 = (C51098gh) ggVar.build();
                            ghVar2.getClass();
                            ada.f134868b = ghVar2;
                            ada.f134867a |= 1;
                            C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
                            dxVar.copyOnWrite();
                            C51809dy dyVar = (C51809dy) dxVar.instance;
                            dyVar.f135935a |= 1;
                            dyVar.f135936b = "provider.OPEN";
                            C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
                            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                            kbVar.copyOnWrite();
                            C52232kc kcVar = (C52232kc) kbVar.instance;
                            kcVar.f137064a |= 1;
                            kcVar.f137065b = "open_provider_args";
                            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                            jzVar.copyOnWrite();
                            C52230ka kaVar = (C52230ka) jzVar.instance;
                            kaVar.f137059a = 1 | kaVar.f137059a;
                            kaVar.f137060b = "assistant.api.client_op.OpenProviderArgs";
                            C63088z byteString = ((ada) acz.build()).toByteString();
                            jzVar.copyOnWrite();
                            C52230ka kaVar2 = (C52230ka) jzVar.instance;
                            byteString.getClass();
                            kaVar2.f137059a |= 2;
                            kaVar2.f137061c = byteString;
                            kbVar.copyOnWrite();
                            C52232kc kcVar2 = (C52232kc) kbVar.instance;
                            C52230ka kaVar3 = (C52230ka) jzVar.build();
                            kaVar3.getClass();
                            kcVar2.f137066c = kaVar3;
                            kcVar2.f137064a = 2 | kcVar2.f137064a;
                            dvVar.mo53732b(kbVar);
                            dxVar.copyOnWrite();
                            C51809dy dyVar2 = (C51809dy) dxVar.instance;
                            C51807dw dwVar = (C51807dw) dvVar.build();
                            dwVar.getClass();
                            dyVar2.f135938d = dwVar;
                            dyVar2.f135935a |= 4;
                            C81442m.m129557s(lVar5, (C51809dy) dxVar.build());
                            String str5 = ((C51058ev) optional.get()).f132949g;
                            nVar = (C80401n) lVar5.build();
                        }
                    } else if (i == 2) {
                        C80578l lVar6 = oVar.f221193c;
                        if (lVar6 == null) {
                            lVar6 = C80578l.f221173g;
                        }
                        if (lVar6.f221175a == 8) {
                            nVar = (C80401n) lVar6.f221176b;
                        } else {
                            nVar = C80401n.f220656k;
                        }
                    } else if (i != 3) {
                        nVar = C80401n.f220656k;
                    } else {
                        ((C58970a) ((C58970a) f211720d.mo56226d()).mo56372aa(3602)).mo56386p("Suggestion action is not set.");
                        nVar = C80401n.f220656k;
                    }
                }
            }
        }
        return C60856cj.m92900i(nVar);
    }

    /* renamed from: f */
    public final C80379i mo72217f() {
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220562f = true;
        return (C80379i) hVar.build();
    }
}
