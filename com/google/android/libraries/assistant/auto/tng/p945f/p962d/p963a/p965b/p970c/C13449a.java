package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.p970c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13441b;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13541q;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.C13457k;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.C13458l;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.p968b.p969a.C13446a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13515b;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4535g.C59203do;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61753o;
import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.p4272br.C56449r;
import com.google.p4272br.C56450s;
import com.google.protobuf.C62940bt;
import com.google.protos.p4850an.p4855d.p4862g.C63564a;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import com.google.protos.p4985f.p5001d.C64830l;
import com.google.protos.p4985f.p5001d.C64831m;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.c.a */
/* compiled from: PG */
public final class C13449a {

    /* renamed from: a */
    private static final C13461c f41283a = C13461c.HEURISTIC;

    /* renamed from: a */
    public static C13530f m29710a(C13458l lVar, C13543s sVar) {
        C51805du duVar;
        if (!lVar.f41303c.isEmpty()) {
            C13529e a = C13529e.m29814a(lVar.f41302b);
            if (a == null) {
                a = C13529e.UNRECOGNIZED;
            }
            if (a == C13529e.UNKNOWN_TYPE) {
                throw new IllegalArgumentException("Unknown candidate type in the template.");
            } else if (((double) lVar.f41304d) != C59203do.f157270a) {
                String str = lVar.f41303c;
                C13529e a2 = C13529e.m29814a(lVar.f41302b);
                if (a2 == null) {
                    a2 = C13529e.UNRECOGNIZED;
                }
                if (a2 == C13529e.CALL_SENDER && sVar.f41502a.size() > 0) {
                    str = C13528n.m29812c(((C13541q) sVar.f41502a.get(0)).f41493a, C13528n.m29810a(sVar.f41507i));
                }
                C13441b bVar = (C13441b) C13530f.f41474g.createBuilder();
                C13529e a3 = C13529e.m29814a(lVar.f41302b);
                if (a3 == null) {
                    a3 = C13529e.UNRECOGNIZED;
                }
                String str2 = lVar.f41303c;
                if (a3 != C13529e.CALL_SENDER) {
                    duVar = C13515b.m29797b(str2, a3);
                } else if (sVar.f41502a.size() != 0) {
                    String str3 = ((C13541q) C58557jl.m90131l(sVar.f41502a)).f41493a;
                    if (str3.matches("^(\\([0-9]{3}\\) [0-9]{3}-[0-9]{4})$")) {
                        String replaceAll = str3.replaceAll("[ ()-]", BuildConfig.FLAVOR);
                        C13529e eVar = C13529e.CALL_SENDER;
                        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
                        C61757s sVar2 = (C61757s) C61758t.f166824c.createBuilder();
                        sVar2.copyOnWrite();
                        C61758t tVar = (C61758t) sVar2.instance;
                        replaceAll.getClass();
                        tVar.f166826a = 1;
                        tVar.f166827b = replaceAll;
                        iVar.copyOnWrite();
                        C61748j jVar = (C61748j) iVar.instance;
                        C61758t tVar2 = (C61758t) sVar2.build();
                        tVar2.getClass();
                        jVar.f166803b = tVar2;
                        jVar.f166802a = 3;
                        C61746h c = C13515b.m29798c("callee", C13515b.m29799d(C13515b.m29800e("Contactable_entity", C13515b.m29798c("contact_id", C13515b.m29799d(C13515b.m29800e("Phone_number", C13515b.m29798c("id_form", (C61748j) iVar.build())))))));
                        C61753o oVar = (C61753o) C61754p.f166816a.createBuilder();
                        C62940bt btVar = C64831m.f175685d;
                        C64830l lVar2 = (C64830l) C64831m.f175684c.createBuilder();
                        lVar2.copyOnWrite();
                        C64831m mVar = (C64831m) lVar2.instance;
                        mVar.f175688b = eVar.getNumber();
                        mVar.f175687a |= 1;
                        oVar.mo58885m(btVar, (C64831m) lVar2.build());
                        duVar = C13515b.m29796a(C13515b.m29801f(c, (C61754p) oVar.build()));
                    } else {
                        C13529e eVar2 = C13529e.CALL_SENDER;
                        C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
                        C63564a aVar = (C63564a) C63565b.f171933j.createBuilder();
                        aVar.copyOnWrite();
                        C63565b bVar2 = (C63565b) aVar.instance;
                        str3.getClass();
                        bVar2.f171935a |= 8;
                        bVar2.f171939e = str3;
                        aVar.copyOnWrite();
                        C63565b bVar3 = (C63565b) aVar.instance;
                        str3.getClass();
                        bVar3.f171935a |= 1;
                        bVar3.f171936b = str3;
                        aVar.copyOnWrite();
                        C63565b bVar4 = (C63565b) aVar.instance;
                        bVar4.f171935a |= 2;
                        bVar4.f171937c = true;
                        aVar.copyOnWrite();
                        C63565b bVar5 = (C63565b) aVar.instance;
                        str3.getClass();
                        bVar5.f171935a |= 4;
                        bVar5.f171938d = str3;
                        aVar.copyOnWrite();
                        C63565b bVar6 = (C63565b) aVar.instance;
                        bVar6.f171935a |= 32;
                        bVar6.f171942h = false;
                        C63565b bVar7 = (C63565b) aVar.build();
                        iVar2.copyOnWrite();
                        C61748j jVar2 = (C61748j) iVar2.instance;
                        bVar7.getClass();
                        jVar2.f166803b = bVar7;
                        jVar2.f166802a = 9;
                        C61746h c2 = C13515b.m29798c("callee", C13515b.m29799d(C13515b.m29800e("Personal_contact", C13515b.m29798c("person", (C61748j) iVar2.build()))));
                        C61753o oVar2 = (C61753o) C61754p.f166816a.createBuilder();
                        C62940bt btVar2 = C64831m.f175685d;
                        C64830l lVar3 = (C64830l) C64831m.f175684c.createBuilder();
                        lVar3.copyOnWrite();
                        C64831m mVar2 = (C64831m) lVar3.instance;
                        mVar2.f175688b = eVar2.getNumber();
                        mVar2.f175687a |= 1;
                        oVar2.mo58885m(btVar2, (C64831m) lVar3.build());
                        duVar = C13515b.m29796a(C13515b.m29801f(c2, (C61754p) oVar2.build()));
                    }
                } else {
                    throw new NoSuchFieldException("No messages in the request.");
                }
                bVar.copyOnWrite();
                C13530f fVar = (C13530f) bVar.instance;
                duVar.getClass();
                fVar.f41477b = duVar;
                fVar.f41476a = 5;
                float f = lVar.f41304d;
                bVar.copyOnWrite();
                ((C13530f) bVar.instance).f41481f = f;
                bVar.copyOnWrite();
                str.getClass();
                ((C13530f) bVar.instance).f41480e = str;
                C13461c cVar = f41283a;
                bVar.copyOnWrite();
                ((C13530f) bVar.instance).f41479d = cVar.getNumber();
                C13529e a4 = C13529e.m29814a(lVar.f41302b);
                if (a4 == null) {
                    a4 = C13529e.UNRECOGNIZED;
                }
                bVar.copyOnWrite();
                ((C13530f) bVar.instance).f41478c = a4.getNumber();
                return (C13530f) bVar.build();
            } else {
                throw new IllegalArgumentException("Zero confidence score in the template.");
            }
        } else {
            throw new IllegalArgumentException("Empty display text in the template.");
        }
    }

    /* renamed from: b */
    public static C58528ij m29711b(C13458l lVar) {
        C58526ih ihVar = new C58526ih();
        for (C13457k kVar : lVar.f41301a) {
            int i = kVar.f41297a;
            int i2 = i != 0 ? i != 1 ? 0 : 1 : 2;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                String str = i == 1 ? (String) kVar.f41298b : BuildConfig.FLAVOR;
                if (!str.isEmpty()) {
                    try {
                        ihVar.mo55373c(new C13446a(C56449r.m88181b(str, str, 0)));
                    } catch (C56450s e) {
                        throw new IllegalArgumentException("Malformatted regex pattern.", e);
                    }
                } else {
                    throw new IllegalArgumentException("Empty regex pattern.");
                }
            } else if (i3 == 1) {
                throw new IllegalArgumentException("Triggering condition not set.");
            }
        }
        return ihVar.mo55486f();
    }
}
