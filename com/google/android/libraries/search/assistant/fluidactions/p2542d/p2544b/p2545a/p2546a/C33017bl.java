package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33135w;
import com.google.android.libraries.search.assistant.fluidactions.p2554e.C33169y;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45626af;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C52373pi;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.p4242bp.p4266g.C56353c;
import com.google.p4242bp.p4266g.C56354d;
import com.google.p4242bp.p4266g.C56359i;
import com.google.p4242bp.p4266g.C56364n;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.C63348as;
import com.google.protos.p4850an.C63349at;
import com.google.protos.p4850an.C63633q;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63641y;
import com.google.protos.p4850an.C63642z;
import com.google.protos.p4850an.p4855d.p4862g.C63564a;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bl */
/* compiled from: PG */
public final class C33017bl implements C32993ao {

    /* renamed from: a */
    private static final C59071e f88417a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bl");

    /* renamed from: b */
    private final C32988aj f88418b;

    public C33017bl(C32988aj ajVar) {
        this.f88418b = ajVar;
    }

    /* renamed from: P */
    private final Optional m61180P() {
        C61752n nVar;
        C61758t tVar;
        Optional c = this.f88418b.mo38454c();
        if (!c.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar = (C61748j) c.get();
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        Optional findFirst = Collection.EL.stream(nVar.f166812c).filter(C33007bb.f88407a).findFirst();
        if (!findFirst.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar2 = ((C61746h) findFirst.get()).f166797e;
        if (jVar2 == null) {
            jVar2 = C61748j.f166800d;
        }
        if (jVar2.f166802a == 3) {
            tVar = (C61758t) jVar2.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        String str = tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR;
        return str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
    }

    /* renamed from: Q */
    private final Optional m61181Q() {
        C61752n nVar;
        C63565b bVar;
        Optional c = this.f88418b.mo38454c();
        if (!c.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar = (C61748j) c.get();
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        for (C61746h hVar : nVar.f166812c) {
            if (hVar.f166796d.equals("person")) {
                C61748j jVar2 = hVar.f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 9) {
                    bVar = (C63565b) jVar2.f166803b;
                } else {
                    bVar = C63565b.f171933j;
                }
                return Optional.m71637of(bVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: A */
    public final void mo38456A() {
        C61752n nVar;
        C61752n nVar2;
        C61752n nVar3;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            if (Collection.EL.stream(nVar.f166812c).filter(C33015bj.f88415a).findFirst().isPresent()) {
                if (jVar.f166802a == 2) {
                    nVar2 = (C61752n) jVar.f166803b;
                } else {
                    nVar2 = C61752n.f166808f;
                }
                C61751m mVar = (C61751m) nVar2.toBuilder();
                mVar.copyOnWrite();
                ((C61752n) mVar.instance).f166812c = C61752n.emptyProtobufList();
                if (jVar.f166802a == 2) {
                    nVar3 = (C61752n) jVar.f166803b;
                } else {
                    nVar3 = C61752n.f166808f;
                }
                mVar.mo58183b((Iterable) Collection.EL.stream(nVar3.f166812c).filter(C33016bk.f88416a).collect(Collectors.toCollection(C33011bf.f88411a)));
                C61747i iVar = (C61747i) jVar.toBuilder();
                C61752n nVar4 = (C61752n) mVar.build();
                iVar.copyOnWrite();
                C61748j jVar2 = (C61748j) iVar.instance;
                nVar4.getClass();
                jVar2.f166803b = nVar4;
                jVar2.f166802a = 2;
                this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar.build());
            }
        }
    }

    /* renamed from: B */
    public final void mo38457B() {
        C61752n nVar;
        C61752n nVar2;
        C61752n nVar3;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            if (Collection.EL.stream(nVar.f166812c).filter(C33009bd.f88409a).findFirst().isPresent()) {
                if (jVar.f166802a == 2) {
                    nVar2 = (C61752n) jVar.f166803b;
                } else {
                    nVar2 = C61752n.f166808f;
                }
                C61751m mVar = (C61751m) nVar2.toBuilder();
                mVar.copyOnWrite();
                ((C61752n) mVar.instance).f166812c = C61752n.emptyProtobufList();
                if (jVar.f166802a == 2) {
                    nVar3 = (C61752n) jVar.f166803b;
                } else {
                    nVar3 = C61752n.f166808f;
                }
                mVar.mo58183b((Iterable) Collection.EL.stream(nVar3.f166812c).filter(C33010be.f88410a).collect(Collectors.toCollection(C33011bf.f88411a)));
                C61747i iVar = (C61747i) jVar.toBuilder();
                C61752n nVar4 = (C61752n) mVar.build();
                iVar.copyOnWrite();
                C61748j jVar2 = (C61748j) iVar.instance;
                nVar4.getClass();
                jVar2.f166803b = nVar4;
                jVar2.f166802a = 2;
                this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar.build());
            }
        }
    }

    /* renamed from: C */
    public final void mo38458C() {
        Optional optional;
        C59071e eVar = f88417a;
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(50805)).mo56386p("storeRelationshipWithCallee");
        Optional s = mo38489s();
        Optional Q = m61181Q();
        if (!s.isPresent() || !Q.isPresent()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(50806)).mo56386p("!selectedPersonNameOptional.isPresent() || !modelPersonOptional.isPresent()");
            return;
        }
        String str = (String) s.get();
        Optional Q2 = m61181Q();
        if (!Q2.isPresent()) {
            optional = Optional.empty();
        } else {
            Optional findFirst = Collection.EL.stream(((C63565b) Q2.get()).f171941g).map(C33001aw.f88398a).filter(new C33002ax(str)).findFirst();
            if (findFirst.isPresent()) {
                optional = Optional.m71637of((C45632al) findFirst.get());
            } else {
                optional = Optional.empty();
            }
        }
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(50808)).mo56386p("recipientPersonOptional not present");
            return;
        }
        C56359i iVar = (C56359i) C56364n.f150310j.createBuilder();
        C45632al alVar = (C45632al) optional.get();
        iVar.copyOnWrite();
        C56364n nVar = (C56364n) iVar.instance;
        alVar.getClass();
        nVar.f150314c = alVar;
        nVar.f150312a |= 16;
        C63564a aVar = (C63564a) ((C63565b) Q.get()).toBuilder();
        aVar.copyOnWrite();
        ((C63565b) aVar.instance).f171941g = C63565b.emptyProtobufList();
        aVar.mo59218c((C56364n) iVar.build());
        C63565b bVar = (C63565b) aVar.build();
        C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
        iVar2.copyOnWrite();
        C61748j jVar = (C61748j) iVar2.instance;
        bVar.getClass();
        jVar.f166803b = bVar;
        jVar.f166802a = 9;
        C61748j jVar2 = (C61748j) iVar2.build();
        C19045c cVar = new C19045c(this.f88418b.mo38452a(), "Store_person_name");
        if (!cVar.f53449b) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(50807)).mo56386p("Store_person_name intent not found");
            return;
        }
        String str2 = cVar.mo24271c().f184279b;
        C63641y yVar = (C63641y) C63642z.f172112e.createBuilder();
        yVar.copyOnWrite();
        C63642z zVar = (C63642z) yVar.instance;
        str2.getClass();
        zVar.f172114a |= 1;
        zVar.f172115b = str2;
        yVar.copyOnWrite();
        C63642z zVar2 = (C63642z) yVar.instance;
        zVar2.f172114a |= 2;
        zVar2.f172116c = "Store_person_name";
        C63633q qVar = (C63633q) C63634r.f172096f.createBuilder();
        qVar.copyOnWrite();
        C63634r rVar = (C63634r) qVar.instance;
        rVar.f172098a |= 1;
        rVar.f172101d = "name";
        C63348as asVar = (C63348as) C63349at.f171190c.createBuilder();
        asVar.copyOnWrite();
        C63349at atVar = (C63349at) asVar.instance;
        jVar2.getClass();
        atVar.f171193b = jVar2;
        atVar.f171192a |= 1;
        qVar.copyOnWrite();
        C63634r rVar2 = (C63634r) qVar.instance;
        C63349at atVar2 = (C63349at) asVar.build();
        atVar2.getClass();
        rVar2.f172100c = atVar2;
        rVar2.f172099b = 2;
        yVar.mo59226c((C63634r) qVar.build());
        cVar.mo24279k(C58485gu.m89846n((C63642z) yVar.build()));
        this.f88418b.mo38455d(cVar.mo24270b(this.f88418b.mo38452a()));
    }

    /* renamed from: D */
    public final /* synthetic */ void mo38459D(C51401gi giVar) {
        C32992an.m61113l(this, giVar);
    }

    /* renamed from: E */
    public final /* synthetic */ void mo38460E() {
        C32992an.m61114m(this);
    }

    /* renamed from: F */
    public final void mo38461F(String str) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "id_form";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
            mVar2.copyOnWrite();
            C61752n nVar2 = (C61752n) mVar2.instance;
            nVar2.f166810a |= 4;
            nVar2.f166811b = "Email_address";
            C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
            gVar2.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar2.instance;
            hVar2.f166793a |= 2;
            hVar2.f166796d = "email_address_id";
            C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            str.getClass();
            tVar.f166826a = 1;
            tVar.f166827b = str;
            iVar2.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar2.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            gVar2.copyOnWrite();
            C61746h hVar3 = (C61746h) gVar2.instance;
            C61748j jVar3 = (C61748j) iVar2.build();
            jVar3.getClass();
            hVar3.f166797e = jVar3;
            hVar3.f166793a |= 4;
            mVar2.mo58184c(gVar2);
            iVar.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar.instance;
            C61752n nVar3 = (C61752n) mVar2.build();
            nVar3.getClass();
            jVar4.f166803b = nVar3;
            jVar4.f166802a = 2;
            gVar.copyOnWrite();
            C61746h hVar4 = (C61746h) gVar.instance;
            C61748j jVar5 = (C61748j) iVar.build();
            jVar5.getClass();
            hVar4.f166797e = jVar5;
            hVar4.f166793a |= 4;
            C61746h hVar5 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C33000av(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar5);
            } else {
                mVar.mo58185d(hVar5);
            }
            C61747i iVar3 = (C61747i) jVar.toBuilder();
            C61752n nVar4 = (C61752n) mVar.build();
            iVar3.copyOnWrite();
            C61748j jVar6 = (C61748j) iVar3.instance;
            nVar4.getClass();
            jVar6.f166803b = nVar4;
            jVar6.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar3.build());
        }
    }

    /* renamed from: G */
    public final void mo38462G(String str) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "label";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            str.getClass();
            tVar.f166826a = 1;
            tVar.f166827b = str;
            iVar.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            C61748j jVar3 = (C61748j) iVar.build();
            jVar3.getClass();
            hVar2.f166797e = jVar3;
            hVar2.f166793a |= 4;
            C61746h hVar3 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C33014bi(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar3);
            } else {
                mVar.mo58185d(hVar3);
            }
            C61747i iVar2 = (C61747i) jVar.toBuilder();
            C61752n nVar2 = (C61752n) mVar.build();
            iVar2.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar2.instance;
            nVar2.getClass();
            jVar4.f166803b = nVar2;
            jVar4.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar2.build());
        }
    }

    /* renamed from: H */
    public final void mo38463H(String str) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "id_form";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
            mVar2.copyOnWrite();
            C61752n nVar2 = (C61752n) mVar2.instance;
            nVar2.f166810a |= 4;
            nVar2.f166811b = "Phone_number";
            C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
            gVar2.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar2.instance;
            hVar2.f166793a |= 2;
            hVar2.f166796d = "phone_number_id";
            C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            str.getClass();
            tVar.f166826a = 1;
            tVar.f166827b = str;
            iVar2.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar2.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            gVar2.copyOnWrite();
            C61746h hVar3 = (C61746h) gVar2.instance;
            C61748j jVar3 = (C61748j) iVar2.build();
            jVar3.getClass();
            hVar3.f166797e = jVar3;
            hVar3.f166793a |= 4;
            mVar2.mo58184c(gVar2);
            iVar.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar.instance;
            C61752n nVar3 = (C61752n) mVar2.build();
            nVar3.getClass();
            jVar4.f166803b = nVar3;
            jVar4.f166802a = 2;
            gVar.copyOnWrite();
            C61746h hVar4 = (C61746h) gVar.instance;
            C61748j jVar5 = (C61748j) iVar.build();
            jVar5.getClass();
            hVar4.f166797e = jVar5;
            hVar4.f166793a |= 4;
            C61746h hVar5 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C32995aq(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar5);
            } else {
                mVar.mo58185d(hVar5);
            }
            C61747i iVar3 = (C61747i) jVar.toBuilder();
            C61752n nVar4 = (C61752n) mVar.build();
            iVar3.copyOnWrite();
            C61748j jVar6 = (C61748j) iVar3.instance;
            nVar4.getClass();
            jVar6.f166803b = nVar4;
            jVar6.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar3.build());
        }
    }

    /* renamed from: I */
    public final void mo38464I(String str) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "provider_mimetype";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            str.getClass();
            tVar.f166826a = 1;
            tVar.f166827b = str;
            iVar.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            C61748j jVar3 = (C61748j) iVar.build();
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            jVar3.getClass();
            hVar2.f166797e = jVar3;
            hVar2.f166793a |= 4;
            C61746h hVar3 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C33013bh(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar3);
            } else {
                mVar.mo58185d(hVar3);
            }
            C61747i iVar2 = (C61747i) jVar.toBuilder();
            C61752n nVar2 = (C61752n) mVar.build();
            iVar2.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar2.instance;
            nVar2.getClass();
            jVar4.f166803b = nVar2;
            jVar4.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar2.build());
        }
    }

    /* renamed from: J */
    public final void mo38465J(String str) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            String str2 = (String) ((C58723pp) C33135w.f88657a).f156468c.get(str);
            if (str2 == null) {
                ((C59052c) ((C59052c) f88417a.mo56225c()).mo56372aa(50809)).mo56389s("Cannot find mid for Provider Package Name = %s", str);
                return;
            }
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "provider";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            tVar.f166826a = 1;
            tVar.f166827b = str2;
            iVar.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            C61748j jVar3 = (C61748j) iVar.build();
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            jVar3.getClass();
            hVar2.f166797e = jVar3;
            hVar2.f166793a |= 4;
            C61746h hVar3 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C33006ba(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar3);
            } else {
                mVar.mo58185d(hVar3);
            }
            C61747i iVar2 = (C61747i) jVar.toBuilder();
            C61752n nVar2 = (C61752n) mVar.build();
            iVar2.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar2.instance;
            nVar2.getClass();
            jVar4.f166803b = nVar2;
            jVar4.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar2.build());
        }
    }

    /* renamed from: K */
    public final void mo38466K(ade ade) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "person";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C63565b e = C33169y.m61531e(ade);
            iVar.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar.instance;
            e.getClass();
            jVar2.f166803b = e;
            jVar2.f166802a = 9;
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            C61748j jVar3 = (C61748j) iVar.build();
            jVar3.getClass();
            hVar2.f166797e = jVar3;
            hVar2.f166793a |= 4;
            C61746h hVar3 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C32997as(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar3);
            } else {
                mVar.mo58185d(hVar3);
            }
            C61747i iVar2 = (C61747i) jVar.toBuilder();
            C61752n nVar2 = (C61752n) mVar.build();
            iVar2.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar2.instance;
            nVar2.getClass();
            jVar4.f166803b = nVar2;
            jVar4.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar2.build());
        }
    }

    /* renamed from: L */
    public final void mo38467L(String str) {
        C61752n nVar;
        C63565b bVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C33008bc(mVar)).findFirst();
            if (!findFirst.isPresent()) {
                ((C59052c) ((C59052c) f88417a.mo56225c()).mo56372aa(50810)).mo56386p("Failed to update selected person name. Missing argument proto named person");
                return;
            }
            C61745g gVar = (C61745g) mVar.mo58182a(findFirst.getAsInt()).toBuilder();
            C61748j jVar2 = ((C61746h) gVar.instance).f166797e;
            if (jVar2 == null) {
                jVar2 = C61748j.f166800d;
            }
            if (jVar2.f166802a == 9) {
                bVar = (C63565b) jVar2.f166803b;
            } else {
                bVar = C63565b.f171933j;
            }
            C63564a aVar = (C63564a) bVar.toBuilder();
            aVar.copyOnWrite();
            C63565b bVar2 = (C63565b) aVar.instance;
            str.getClass();
            bVar2.f171935a |= 8;
            bVar2.f171939e = str;
            C63565b bVar3 = (C63565b) aVar.build();
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            iVar.copyOnWrite();
            C61748j jVar3 = (C61748j) iVar.instance;
            bVar3.getClass();
            jVar3.f166803b = bVar3;
            jVar3.f166802a = 9;
            C61748j jVar4 = (C61748j) iVar.build();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            jVar4.getClass();
            hVar.f166797e = jVar4;
            hVar.f166793a |= 4;
            mVar.mo58188g(findFirst.getAsInt(), (C61746h) gVar.build());
            C61747i iVar2 = (C61747i) jVar.toBuilder();
            C61752n nVar2 = (C61752n) mVar.build();
            iVar2.copyOnWrite();
            C61748j jVar5 = (C61748j) iVar2.instance;
            nVar2.getClass();
            jVar5.f166803b = nVar2;
            jVar5.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar2.build());
        }
    }

    /* renamed from: M */
    public final void mo38468M(String str, String str2) {
        C61752n nVar;
        Optional c = this.f88418b.mo38454c();
        if (c.isPresent()) {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            C61751m mVar = (C61751m) nVar.toBuilder();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "id_form";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
            mVar2.copyOnWrite();
            C61752n nVar2 = (C61752n) mVar2.instance;
            nVar2.f166810a |= 4;
            nVar2.f166811b = "Third_party_endpoint";
            C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
            gVar2.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar2.instance;
            hVar2.f166793a |= 2;
            hVar2.f166796d = "third_party_endpoint_id";
            C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            str.getClass();
            tVar.f166826a = 1;
            tVar.f166827b = str;
            iVar2.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar2.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            gVar2.copyOnWrite();
            C61746h hVar3 = (C61746h) gVar2.instance;
            C61748j jVar3 = (C61748j) iVar2.build();
            jVar3.getClass();
            hVar3.f166797e = jVar3;
            hVar3.f166793a |= 4;
            mVar2.mo58184c(gVar2);
            iVar.copyOnWrite();
            C61748j jVar4 = (C61748j) iVar.instance;
            C61752n nVar3 = (C61752n) mVar2.build();
            nVar3.getClass();
            jVar4.f166803b = nVar3;
            jVar4.f166802a = 2;
            gVar.copyOnWrite();
            C61746h hVar4 = (C61746h) gVar.instance;
            C61748j jVar5 = (C61748j) iVar.build();
            jVar5.getClass();
            hVar4.f166797e = jVar5;
            hVar4.f166793a |= 4;
            C61746h hVar5 = (C61746h) gVar.build();
            OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C33012bg(mVar)).findFirst();
            if (findFirst.isPresent()) {
                mVar.mo58188g(findFirst.getAsInt(), hVar5);
            } else {
                mVar.mo58185d(hVar5);
            }
            C61747i iVar3 = (C61747i) jVar.toBuilder();
            C61752n nVar4 = (C61752n) mVar.build();
            iVar3.copyOnWrite();
            C61748j jVar6 = (C61748j) iVar3.instance;
            nVar4.getClass();
            jVar6.f166803b = nVar4;
            jVar6.f166802a = 2;
            this.f88418b.f88386d = C58833ax.m90834k((C61748j) iVar3.build());
        }
    }

    /* renamed from: N */
    public final boolean mo38469N() {
        return ((String) m61180P().orElse(BuildConfig.FLAVOR)).equals("/m/02p1fkx");
    }

    /* renamed from: O */
    public final boolean mo38470O() {
        Optional optional;
        C61752n nVar;
        C61758t tVar;
        if (!((String) m61180P().orElse(BuildConfig.FLAVOR)).equals("/m/0jzgd")) {
            return false;
        }
        Optional c = this.f88418b.mo38454c();
        if (!c.isPresent()) {
            optional = Optional.empty();
        } else {
            C61748j jVar = (C61748j) c.get();
            if (jVar.f166802a == 2) {
                nVar = (C61752n) jVar.f166803b;
            } else {
                nVar = C61752n.f166808f;
            }
            Optional findFirst = Collection.EL.stream(nVar.f166812c).filter(C33003ay.f88400a).findFirst();
            if (findFirst.isPresent()) {
                C61748j jVar2 = ((C61746h) findFirst.get()).f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 3) {
                    tVar = (C61758t) jVar2.f166803b;
                } else {
                    tVar = C61758t.f166824c;
                }
                String str = tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR;
                optional = str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
            } else {
                optional = Optional.empty();
            }
        }
        if (((String) optional.orElse(BuildConfig.FLAVOR)).equals("/m/07z4p")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C32988aj mo38471a() {
        return this.f88418b;
    }

    /* renamed from: b */
    public final C51936ep mo38472b() {
        C19045c cVar = new C19045c(this.f88418b.mo38452a(), "Initiate_call");
        if (cVar.f53449b) {
            return C51936ep.CALL;
        }
        cVar.mo24276h("Send_digital_object");
        if (cVar.f53449b) {
            return C51936ep.MESSAGE;
        }
        ((C59052c) ((C59052c) f88417a.mo56225c()).mo56372aa(50804)).mo56386p("Cannot identify feature type");
        return C51936ep.DEFAULT;
    }

    /* renamed from: c */
    public final /* synthetic */ Optional mo38473c() {
        return C32992an.m61102a(this);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo38474d() {
        return C32992an.m61103b(this);
    }

    /* renamed from: e */
    public final Optional mo38475e() {
        if (mo38483m().isPresent()) {
            C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
            String str = (String) mo38483m().get();
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            str.getClass();
            pjVar.f137437b = 2;
            pjVar.f137438c = str;
            String str2 = (String) mo38483m().get();
            piVar.copyOnWrite();
            C52374pj pjVar2 = (C52374pj) piVar.instance;
            str2.getClass();
            pjVar2.f137436a |= 256;
            pjVar2.f137439d = str2;
            return Optional.m71637of((C52374pj) piVar.build());
        } else if (mo38479i().isPresent()) {
            C52373pi piVar2 = (C52373pi) C52374pj.f137434e.createBuilder();
            String str3 = (String) mo38479i().get();
            piVar2.copyOnWrite();
            C52374pj pjVar3 = (C52374pj) piVar2.instance;
            str3.getClass();
            pjVar3.f137437b = 1;
            pjVar3.f137438c = str3;
            String str4 = (String) mo38479i().get();
            piVar2.copyOnWrite();
            C52374pj pjVar4 = (C52374pj) piVar2.instance;
            str4.getClass();
            pjVar4.f137436a |= 256;
            pjVar4.f137439d = str4;
            return Optional.m71637of((C52374pj) piVar2.build());
        } else if (!mo38493w().isPresent()) {
            return Optional.empty();
        } else {
            C52373pi piVar3 = (C52373pi) C52374pj.f137434e.createBuilder();
            String str5 = (String) mo38493w().get();
            piVar3.copyOnWrite();
            C52374pj pjVar5 = (C52374pj) piVar3.instance;
            str5.getClass();
            pjVar5.f137437b = 6;
            pjVar5.f137438c = str5;
            Optional v = mo38492v();
            if (v.isPresent()) {
                String str6 = (String) v.get();
                piVar3.copyOnWrite();
                C52374pj pjVar6 = (C52374pj) piVar3.instance;
                str6.getClass();
                pjVar6.f137436a |= 256;
                pjVar6.f137439d = str6;
            }
            return Optional.m71637of((C52374pj) piVar3.build());
        }
    }

    /* renamed from: f */
    public final /* synthetic */ Optional mo38476f() {
        return C32992an.m61104c(this);
    }

    /* renamed from: g */
    public final /* synthetic */ Optional mo38477g() {
        return C32992an.m61105d(this);
    }

    /* renamed from: h */
    public final /* synthetic */ Optional mo38478h() {
        return C32992an.m61106e(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo38479i() {
        /*
            r8 = this;
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r8.f88418b
            j$.util.Optional r0 = r0.mo38454c()
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x0011
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x0011:
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r1 = r0.f166802a
            r2 = 2
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x0023
        L_0x0021:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0023:
            com.google.protobuf.cq r0 = r0.f166812c
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.au r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C32999au.f88396a
            j$.util.stream.Stream r0 = r0.filter(r1)
            j$.util.Optional r0 = r0.findFirst()
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x003e
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x003e:
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x004a
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x004a:
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x00f7
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            java.lang.String r1 = r1.f166811b
            java.lang.String r3 = "Email_address"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0065
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0067
        L_0x0065:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0067:
            com.google.protobuf.cq r1 = r1.f166812c
            int r1 = r1.size()
            r3 = 1
            if (r1 != r3) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0079
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x007b
        L_0x0079:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x007b:
            com.google.protobuf.cq r1 = r1.f166812c
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            java.lang.String r1 = r1.f166796d
            java.lang.String r5 = "email_address_id"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0097
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0099
        L_0x0097:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0099:
            com.google.protobuf.cq r1 = r1.f166812c
            java.lang.Object r1 = r1.get(r4)
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            com.google.knowledge.a.a.j r1 = r1.f166797e
            if (r1 != 0) goto L_0x00a7
            com.google.knowledge.a.a.j r1 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00a7:
            int r5 = r1.f166802a
            r6 = 3
            if (r5 != r6) goto L_0x00b1
            java.lang.Object r1 = r1.f166803b
            com.google.knowledge.a.a.t r1 = (com.google.knowledge.p4661a.p4662a.C61758t) r1
            goto L_0x00b3
        L_0x00b1:
            com.google.knowledge.a.a.t r1 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00b3:
            int r5 = r1.f166826a
            java.lang.String r7 = ""
            if (r5 != r3) goto L_0x00be
            java.lang.Object r1 = r1.f166827b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00bf
        L_0x00be:
            r1 = r7
        L_0x00bf:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x00ce
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x00d0
        L_0x00ce:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x00d0:
            com.google.protobuf.cq r0 = r0.f166812c
            java.lang.Object r0 = r0.get(r4)
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x00de
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00de:
            int r1 = r0.f166802a
            if (r1 != r6) goto L_0x00e7
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.t r0 = (com.google.knowledge.p4661a.p4662a.C61758t) r0
            goto L_0x00e9
        L_0x00e7:
            com.google.knowledge.a.a.t r0 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00e9:
            int r1 = r0.f166826a
            if (r1 != r3) goto L_0x00f2
            java.lang.Object r0 = r0.f166827b
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x00f2:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x00fb
        L_0x00f7:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33017bl.mo38479i():j$.util.Optional");
    }

    /* renamed from: j */
    public final /* synthetic */ Optional mo38480j() {
        return C32992an.m61107f(this);
    }

    /* renamed from: k */
    public final Optional mo38481k() {
        C61752n nVar;
        C61758t tVar;
        Optional c = this.f88418b.mo38454c();
        if (!c.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar = (C61748j) c.get();
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        Optional findFirst = Collection.EL.stream(nVar.f166812c).filter(C32994ap.f88391a).findFirst();
        if (!findFirst.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar2 = ((C61746h) findFirst.get()).f166797e;
        if (jVar2 == null) {
            jVar2 = C61748j.f166800d;
        }
        if (jVar2.f166802a == 3) {
            tVar = (C61758t) jVar2.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        String str = tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR;
        return str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
    }

    /* renamed from: l */
    public final /* synthetic */ Optional mo38482l() {
        return C32992an.m61108g(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo38483m() {
        /*
            r8 = this;
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r8.f88418b
            j$.util.Optional r0 = r0.mo38454c()
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x0011
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x0011:
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r1 = r0.f166802a
            r2 = 2
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x0023
        L_0x0021:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0023:
            com.google.protobuf.cq r0 = r0.f166812c
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.at r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C32998at.f88395a
            j$.util.stream.Stream r0 = r0.filter(r1)
            j$.util.Optional r0 = r0.findFirst()
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x003e
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x003e:
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x004a
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x004a:
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x00f7
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            java.lang.String r1 = r1.f166811b
            java.lang.String r3 = "Phone_number"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0065
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0067
        L_0x0065:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0067:
            com.google.protobuf.cq r1 = r1.f166812c
            int r1 = r1.size()
            r3 = 1
            if (r1 != r3) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0079
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x007b
        L_0x0079:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x007b:
            com.google.protobuf.cq r1 = r1.f166812c
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            java.lang.String r1 = r1.f166796d
            java.lang.String r5 = "phone_number_id"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0097
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0099
        L_0x0097:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0099:
            com.google.protobuf.cq r1 = r1.f166812c
            java.lang.Object r1 = r1.get(r4)
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            com.google.knowledge.a.a.j r1 = r1.f166797e
            if (r1 != 0) goto L_0x00a7
            com.google.knowledge.a.a.j r1 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00a7:
            int r5 = r1.f166802a
            r6 = 3
            if (r5 != r6) goto L_0x00b1
            java.lang.Object r1 = r1.f166803b
            com.google.knowledge.a.a.t r1 = (com.google.knowledge.p4661a.p4662a.C61758t) r1
            goto L_0x00b3
        L_0x00b1:
            com.google.knowledge.a.a.t r1 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00b3:
            int r5 = r1.f166826a
            java.lang.String r7 = ""
            if (r5 != r3) goto L_0x00be
            java.lang.Object r1 = r1.f166827b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00bf
        L_0x00be:
            r1 = r7
        L_0x00bf:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x00ce
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x00d0
        L_0x00ce:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x00d0:
            com.google.protobuf.cq r0 = r0.f166812c
            java.lang.Object r0 = r0.get(r4)
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x00de
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00de:
            int r1 = r0.f166802a
            if (r1 != r6) goto L_0x00e7
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.t r0 = (com.google.knowledge.p4661a.p4662a.C61758t) r0
            goto L_0x00e9
        L_0x00e7:
            com.google.knowledge.a.a.t r0 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00e9:
            int r1 = r0.f166826a
            if (r1 != r3) goto L_0x00f2
            java.lang.Object r0 = r0.f166827b
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x00f2:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x00fb
        L_0x00f7:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33017bl.mo38483m():j$.util.Optional");
    }

    /* renamed from: n */
    public final /* synthetic */ Optional mo38484n(List list) {
        return C32992an.m61109h(this, list);
    }

    /* renamed from: o */
    public final /* synthetic */ Optional mo38485o() {
        return C32992an.m61110i(this);
    }

    /* renamed from: p */
    public final Optional mo38486p() {
        Optional r = mo38488r();
        if (!r.isPresent() || ((String) r.get()).isEmpty()) {
            return Optional.empty();
        }
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String str = (String) r.get();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str;
        Optional q = mo38487q();
        if (q.isPresent()) {
            String str2 = (String) q.get();
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            str2.getClass();
            evVar2.f132943a |= 1024;
            evVar2.f132953k = str2;
        }
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar3 = (C51058ev) esVar.build();
        evVar3.getClass();
        ghVar.f133013c = evVar3;
        ghVar.f133012b = 1;
        return Optional.m71637of((C51098gh) ggVar.build());
    }

    /* renamed from: q */
    public final Optional mo38487q() {
        C61752n nVar;
        C61758t tVar;
        Optional c = this.f88418b.mo38454c();
        if (!c.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar = (C61748j) c.get();
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        for (C61746h hVar : nVar.f166812c) {
            if (hVar.f166796d.equals("provider_mimetype")) {
                C61748j jVar2 = hVar.f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 3) {
                    tVar = (C61758t) jVar2.f166803b;
                } else {
                    tVar = C61758t.f166824c;
                }
                return Optional.m71637of(tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR);
            }
        }
        return Optional.empty();
    }

    /* renamed from: r */
    public final Optional mo38488r() {
        C61752n nVar;
        C61758t tVar;
        Optional c = this.f88418b.mo38454c();
        if (!c.isPresent()) {
            return Optional.empty();
        }
        C61748j jVar = (C61748j) c.get();
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        for (C61746h hVar : nVar.f166812c) {
            if (hVar.f166796d.equals("provider")) {
                C61748j jVar2 = hVar.f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 3) {
                    tVar = (C61758t) jVar2.f166803b;
                } else {
                    tVar = C61758t.f166824c;
                }
                return Optional.ofNullable((String) C33135w.f88657a.get(tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR));
            }
        }
        return Optional.empty();
    }

    /* renamed from: s */
    public final Optional mo38489s() {
        Optional Q = m61181Q();
        if (!Q.isPresent() || ((C63565b) Q.get()).f171939e.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(((C63565b) Q.get()).f171939e);
    }

    /* renamed from: t */
    public final Optional mo38490t(String str, String str2) {
        Optional Q = m61181Q();
        if (!Q.isPresent()) {
            return Optional.empty();
        }
        C62971cq<C56364n> cqVar = ((C63565b) Q.get()).f171941g;
        if (!TextUtils.isEmpty(str2)) {
            for (C56364n nVar : cqVar) {
                C45632al alVar = nVar.f150314c;
                if (alVar == null) {
                    alVar = C45632al.f120021r;
                }
                Iterator it = alVar.f120026d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C45626af) it.next()).f120006c.equals(str)) {
                            C56354d dVar = nVar.f150320i;
                            if (dVar == null) {
                                dVar = C56354d.f150295b;
                            }
                            C56353c cVar = dVar.f150297a;
                            if (cVar == null) {
                                cVar = C56353c.f150291b;
                            }
                            if (cVar.f150293a.equals(str2) && (nVar.f150312a & 16) != 0) {
                                C45632al alVar2 = nVar.f150314c;
                                if (alVar2 == null) {
                                    alVar2 = C45632al.f120021r;
                                }
                                return Optional.m71637of(C33169y.m61528b(alVar2));
                            }
                        }
                    }
                }
            }
        }
        for (C56364n nVar2 : cqVar) {
            C45632al alVar3 = nVar2.f150314c;
            if (alVar3 == null) {
                alVar3 = C45632al.f120021r;
            }
            Iterator it2 = alVar3.f120026d.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C45626af) it2.next()).f120006c.equals(str) && (nVar2.f150312a & 16) != 0) {
                        C45632al alVar4 = nVar2.f150314c;
                        if (alVar4 == null) {
                            alVar4 = C45632al.f120021r;
                        }
                        return Optional.m71637of(C33169y.m61528b(alVar4));
                    }
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: u */
    public final Optional mo38491u(String str, String str2) {
        Optional Q = m61181Q();
        if (!Q.isPresent()) {
            return Optional.empty();
        }
        C62971cq<C56364n> cqVar = ((C63565b) Q.get()).f171941g;
        if (!TextUtils.isEmpty(str2)) {
            for (C56364n nVar : cqVar) {
                C45632al alVar = nVar.f150314c;
                if (alVar == null) {
                    alVar = C45632al.f120021r;
                }
                Iterator it = alVar.f120026d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C45626af) it.next()).f120006c.equals(str)) {
                            C56354d dVar = nVar.f150320i;
                            if (dVar == null) {
                                dVar = C56354d.f150295b;
                            }
                            C56353c cVar = dVar.f150297a;
                            if (cVar == null) {
                                cVar = C56353c.f150291b;
                            }
                            if (cVar.f150293a.equals(str2) && (nVar.f150312a & 16) != 0) {
                                return Optional.m71637of(C33169y.m61530d(nVar));
                            }
                        }
                    }
                }
            }
        }
        for (C56364n nVar2 : cqVar) {
            C45632al alVar2 = nVar2.f150314c;
            if (alVar2 == null) {
                alVar2 = C45632al.f120021r;
            }
            Iterator it2 = alVar2.f120026d.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C45626af) it2.next()).f120006c.equals(str) && (nVar2.f150312a & 16) != 0) {
                        return Optional.m71637of(C33169y.m61530d(nVar2));
                    }
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: v */
    public final Optional mo38492v() {
        Optional w = mo38493w();
        Optional s = mo38489s();
        if (!w.isPresent() || !s.isPresent()) {
            return Optional.empty();
        }
        Optional t = mo38490t((String) s.get(), BuildConfig.FLAVOR);
        if (!t.isPresent()) {
            return Optional.empty();
        }
        C52627yt ytVar = ((C52623yp) t.get()).f138165b;
        if (ytVar == null) {
            ytVar = C52627yt.f138176c;
        }
        for (C52617yj yjVar : ytVar.f138179b) {
            Iterator it = yjVar.f138148a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C52633yz yzVar = (C52633yz) it.next();
                    C52613yf yfVar = yzVar.f138197d;
                    if (yfVar == null) {
                        yfVar = C52613yf.f138138f;
                    }
                    if (yfVar.f138141b.equals(w.get())) {
                        C52613yf yfVar2 = yzVar.f138197d;
                        if (yfVar2 == null) {
                            yfVar2 = C52613yf.f138138f;
                        }
                        String str = yfVar2.f138144e;
                        return !str.isEmpty() ? Optional.m71637of(str) : Optional.empty();
                    }
                }
            }
        }
        return Optional.empty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo38493w() {
        /*
            r8 = this;
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r0 = r8.f88418b
            j$.util.Optional r0 = r0.mo38454c()
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x0011
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x0011:
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r1 = r0.f166802a
            r2 = 2
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x0023
        L_0x0021:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0023:
            com.google.protobuf.cq r0 = r0.f166812c
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ar r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C32996ar.f88393a
            j$.util.stream.Stream r0 = r0.filter(r1)
            j$.util.Optional r0 = r0.findFirst()
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x003e
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x003e:
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x004a
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x004a:
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x00f7
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            java.lang.String r1 = r1.f166811b
            java.lang.String r3 = "Third_party_endpoint"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0065
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0067
        L_0x0065:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0067:
            com.google.protobuf.cq r1 = r1.f166812c
            int r1 = r1.size()
            r3 = 1
            if (r1 != r3) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0079
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x007b
        L_0x0079:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x007b:
            com.google.protobuf.cq r1 = r1.f166812c
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            java.lang.String r1 = r1.f166796d
            java.lang.String r5 = "third_party_endpoint_id"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0097
            java.lang.Object r1 = r0.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0099
        L_0x0097:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0099:
            com.google.protobuf.cq r1 = r1.f166812c
            java.lang.Object r1 = r1.get(r4)
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            com.google.knowledge.a.a.j r1 = r1.f166797e
            if (r1 != 0) goto L_0x00a7
            com.google.knowledge.a.a.j r1 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00a7:
            int r5 = r1.f166802a
            r6 = 3
            if (r5 != r6) goto L_0x00b1
            java.lang.Object r1 = r1.f166803b
            com.google.knowledge.a.a.t r1 = (com.google.knowledge.p4661a.p4662a.C61758t) r1
            goto L_0x00b3
        L_0x00b1:
            com.google.knowledge.a.a.t r1 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00b3:
            int r5 = r1.f166826a
            java.lang.String r7 = ""
            if (r5 != r3) goto L_0x00be
            java.lang.Object r1 = r1.f166827b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00bf
        L_0x00be:
            r1 = r7
        L_0x00bf:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00f7
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x00ce
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x00d0
        L_0x00ce:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x00d0:
            com.google.protobuf.cq r0 = r0.f166812c
            java.lang.Object r0 = r0.get(r4)
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x00de
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00de:
            int r1 = r0.f166802a
            if (r1 != r6) goto L_0x00e7
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.t r0 = (com.google.knowledge.p4661a.p4662a.C61758t) r0
            goto L_0x00e9
        L_0x00e7:
            com.google.knowledge.a.a.t r0 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00e9:
            int r1 = r0.f166826a
            if (r1 != r3) goto L_0x00f2
            java.lang.Object r0 = r0.f166827b
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x00f2:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x00fb
        L_0x00f7:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33017bl.mo38493w():j$.util.Optional");
    }

    /* renamed from: x */
    public final /* synthetic */ Optional mo38494x() {
        return C32992an.m61111j(this);
    }

    /* renamed from: y */
    public final Optional mo38495y() {
        return mo38489s();
    }

    /* renamed from: z */
    public final /* synthetic */ Optional mo38496z() {
        return C32992an.m61112k(this);
    }
}
