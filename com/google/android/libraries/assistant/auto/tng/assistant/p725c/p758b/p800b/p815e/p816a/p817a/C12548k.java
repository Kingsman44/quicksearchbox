package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p817a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.C12581c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16329ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51082fs;
import com.google.assistant.p3897e.p3902c.p3907c.C51085fv;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52181if;
import com.google.assistant.p3897e.p3921j.C52184ii;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.acz;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import com.google.protos.p4757ac.p4758a.C63109h;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.k */
/* compiled from: PG */
public final class C12548k extends C68247h {

    /* renamed from: a */
    private final C68283d f39481a;

    public C12548k(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C12548k.class), aVar);
        this.f39481a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C52560wg wgVar;
        C58833ax axVar;
        C51016dg dgVar;
        C58833ax axVar2;
        C12581c cVar = (C12581c) obj;
        C52567wn wnVar = C52567wn.UNKNOWN;
        int a = C16329ac.m33333a(cVar.mo20650c().f48068b);
        int i = a - 1;
        if (a != 0) {
            if (i == 3) {
                C16330ad c = cVar.mo20650c();
                String str = c.f48068b == 4 ? (String) c.f48069c : BuildConfig.FLAVOR;
                acz acz = (acz) ada.f134865f.createBuilder();
                C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                esVar.copyOnWrite();
                C51058ev evVar = (C51058ev) esVar.instance;
                str.getClass();
                evVar.f132943a |= 32;
                evVar.f132949g = str;
                ggVar.copyOnWrite();
                C51098gh ghVar = (C51098gh) ggVar.instance;
                C51058ev evVar2 = (C51058ev) esVar.build();
                evVar2.getClass();
                ghVar.f133013c = evVar2;
                ghVar.f133012b = 1;
                acz.copyOnWrite();
                ada ada = (ada) acz.instance;
                C51098gh ghVar2 = (C51098gh) ggVar.build();
                ghVar2.getClass();
                ada.f134868b = ghVar2;
                ada.f134867a |= 1;
                C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
                C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                kbVar.copyOnWrite();
                C52232kc kcVar = (C52232kc) kbVar.instance;
                kcVar.f137064a |= 1;
                kcVar.f137065b = "open_provider_args";
                C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar.copyOnWrite();
                C52230ka kaVar = (C52230ka) jzVar.instance;
                kaVar.f137059a |= 1;
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
                kcVar2.f137064a |= 2;
                dvVar.mo53732b(kbVar);
                C51807dw dwVar = (C51807dw) dvVar.build();
                C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
                dxVar.copyOnWrite();
                C51809dy dyVar = (C51809dy) dxVar.instance;
                dyVar.f135935a |= 1;
                dyVar.f135936b = "provider.OPEN";
                dxVar.copyOnWrite();
                C51809dy dyVar2 = (C51809dy) dxVar.instance;
                dwVar.getClass();
                dyVar2.f135938d = dwVar;
                dyVar2.f135935a |= 4;
                obj2 = C58833ax.m90834k((C51809dy) dxVar.build()).mo56106b(C12542e.f39474a);
            } else if (i != 4) {
                obj2 = C58836b.f156633a;
            } else {
                C16330ad c2 = cVar.mo20650c();
                if (c2.f48068b == 7) {
                    wgVar = (C52560wg) c2.f48069c;
                } else {
                    wgVar = C52560wg.f137943j;
                }
                C52568wo woVar = wgVar.f137950f;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                C52567wn b = C52567wn.m86649b(woVar.f138003j);
                if (b == null) {
                    b = C52567wn.UNKNOWN;
                }
                int ordinal = b.ordinal();
                if (!(ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4)) {
                    if (ordinal == 9) {
                        String str2 = wgVar.f137948d;
                        C52568wo woVar2 = wgVar.f137950f;
                        if (woVar2 == null) {
                            woVar2 = C52568wo.f137992v;
                        }
                        String str3 = woVar2.f137998e;
                        if (wgVar.f137946b == 16) {
                            dgVar = (C51016dg) wgVar.f137947c;
                        } else {
                            dgVar = C51016dg.f132827g;
                        }
                        C51805du duVar = dgVar.f132833e;
                        if (duVar == null) {
                            duVar = C51805du.f135924e;
                        }
                        try {
                            C62995dn dnVar = duVar.f135929d;
                            if (dnVar.containsKey("intent_input")) {
                                axVar2 = C58833ax.m90833j((C63109h) Collection.EL.stream(((C61752n) C62942bv.parseFrom((C62942bv) C61752n.f166808f, ((C52152hd) C62942bv.parseFrom((C62942bv) C52152hd.f136850c, ((C52230ka) dnVar.get("intent_input")).f137061c, C62921ba.m95368a())).f136853b, C62921ba.m95368a())).f166812c).filter(C12543f.f39475a).map(C12544g.f39476a).map(new C12545h(str3, str2)).findFirst().orElse(null));
                                if (!axVar2.mo56113h()) {
                                    axVar = C58836b.f156633a;
                                } else {
                                    C52181if ifVar = (C52181if) C52184ii.f136960f.createBuilder();
                                    C63109h hVar = (C63109h) axVar2.mo56107c();
                                    ifVar.copyOnWrite();
                                    C52184ii iiVar = (C52184ii) ifVar.instance;
                                    hVar.getClass();
                                    iiVar.f136963b = hVar;
                                    iiVar.f136962a |= 1;
                                    ifVar.copyOnWrite();
                                    C52184ii iiVar2 = (C52184ii) ifVar.instance;
                                    iiVar2.f136962a |= 2;
                                    iiVar2.f136964c = 0;
                                    ifVar.copyOnWrite();
                                    C52184ii iiVar3 = (C52184ii) ifVar.instance;
                                    iiVar3.f136962a |= 4;
                                    iiVar3.f136965d = 0;
                                    ifVar.copyOnWrite();
                                    C52184ii iiVar4 = (C52184ii) ifVar.instance;
                                    iiVar4.f136966e = 1;
                                    iiVar4.f136962a |= 8;
                                    C51806dv dvVar2 = (C51806dv) C51807dw.f135930b.createBuilder();
                                    C52231kb kbVar2 = (C52231kb) C52232kc.f137062d.createBuilder();
                                    kbVar2.copyOnWrite();
                                    C52232kc kcVar3 = (C52232kc) kbVar2.instance;
                                    kcVar3.f137064a |= 1;
                                    kcVar3.f137065b = "play_spoken_content_args";
                                    C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
                                    jzVar2.copyOnWrite();
                                    C52230ka kaVar4 = (C52230ka) jzVar2.instance;
                                    kaVar4.f137059a |= 1;
                                    kaVar4.f137060b = "assistant.api.client_op.PlaySpokenContentArgs";
                                    C63088z byteString2 = ((C52184ii) ifVar.build()).toByteString();
                                    jzVar2.copyOnWrite();
                                    C52230ka kaVar5 = (C52230ka) jzVar2.instance;
                                    byteString2.getClass();
                                    kaVar5.f137059a |= 2;
                                    kaVar5.f137061c = byteString2;
                                    kbVar2.copyOnWrite();
                                    C52232kc kcVar4 = (C52232kc) kbVar2.instance;
                                    C52230ka kaVar6 = (C52230ka) jzVar2.build();
                                    kaVar6.getClass();
                                    kcVar4.f137066c = kaVar6;
                                    kcVar4.f137064a |= 2;
                                    dvVar2.mo53732b(kbVar2);
                                    C51808dx dxVar2 = (C51808dx) C51809dy.f135933f.createBuilder();
                                    dxVar2.copyOnWrite();
                                    C51809dy dyVar3 = (C51809dy) dxVar2.instance;
                                    dyVar3.f135935a |= 1;
                                    dyVar3.f135936b = "media.PLAY_MEDIA";
                                    dxVar2.copyOnWrite();
                                    C51809dy dyVar4 = (C51809dy) dxVar2.instance;
                                    C51807dw dwVar2 = (C51807dw) dvVar2.build();
                                    dwVar2.getClass();
                                    dyVar4.f135938d = dwVar2;
                                    dyVar4.f135935a |= 4;
                                    axVar = C58833ax.m90834k((C51809dy) dxVar2.build());
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } catch (C62974ct | IllegalArgumentException e) {
                            ((C59052c) ((C59052c) ((C59052c) C12547j.f39480a.mo56226d()).mo56382g(e)).mo56372aa(44306)).mo56386p("Failed to parse input intent from client input of the podcast media item");
                            axVar2 = C58836b.f156633a;
                        }
                    } else if (ordinal != 10) {
                        if (ordinal != 21) {
                            axVar = C58836b.f156633a;
                        } else {
                            C51097gg ggVar2 = (C51097gg) C51098gh.f133009e.createBuilder();
                            C51082fs fsVar = (C51082fs) C51085fv.f132995c.createBuilder();
                            fsVar.copyOnWrite();
                            C51085fv fvVar = (C51085fv) fsVar.instance;
                            fvVar.f132998b = 3;
                            fvVar.f132997a |= 1;
                            ggVar2.copyOnWrite();
                            C51098gh ghVar3 = (C51098gh) ggVar2.instance;
                            C51085fv fvVar2 = (C51085fv) fsVar.build();
                            fvVar2.getClass();
                            ghVar3.f133013c = fvVar2;
                            ghVar3.f133012b = 7;
                            axVar = C12547j.m28708b(C12547j.m28707a(wgVar, (C51098gh) ggVar2.build()));
                        }
                    }
                    obj2 = axVar.mo56106b(C12542e.f39474a);
                }
                C51098gh ghVar4 = wgVar.f137949e;
                if (ghVar4 == null) {
                    ghVar4 = C51098gh.f133009e;
                }
                axVar = C12547j.m28708b(C12547j.m28707a(wgVar, ghVar4));
                obj2 = axVar.mo56106b(C12542e.f39474a);
            }
            return C60856cj.m92900i(obj2);
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39481a.mo60297gq();
    }
}
