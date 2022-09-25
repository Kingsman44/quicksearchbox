package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3917i.p3918a.C51458il;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3921j.C52286mc;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52311na;
import com.google.assistant.p3897e.p3921j.C52312nb;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52373pi;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.assistant.p3897e.p3921j.apk;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.an */
/* compiled from: PG */
public final /* synthetic */ class C32992an {
    /* renamed from: a */
    public static Optional m61102a(C32993ao aoVar) {
        if (aoVar.mo38472b() != C51936ep.MESSAGE) {
            return Optional.empty();
        }
        Optional b = aoVar.mo38471a().mo38453b();
        if (!b.isPresent()) {
            return Optional.empty();
        }
        String str = ((C51460in) b.get()).f134056c;
        return str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
    }

    /* renamed from: b */
    public static Optional m61103b(C32993ao aoVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C52286mc mcVar = (C52286mc) C52289mf.f137258j.createBuilder();
        if (aoVar.mo38483m().isPresent()) {
            String str = (String) aoVar.mo38483m().get();
            mcVar.copyOnWrite();
            str.getClass();
            ((C52289mf) mcVar.instance).f137262c = str;
            mcVar.copyOnWrite();
            ((C52289mf) mcVar.instance).f137263d = "PHONE_NUMBER";
        } else if (!aoVar.mo38493w().isPresent()) {
            return Optional.empty();
        } else {
            String str2 = (String) aoVar.mo38493w().get();
            mcVar.copyOnWrite();
            str2.getClass();
            ((C52289mf) mcVar.instance).f137262c = str2;
            mcVar.copyOnWrite();
            ((C52289mf) mcVar.instance).f137263d = "APP_UNIQUE_ENDPOINT";
        }
        if (aoVar.mo38488r().isPresent()) {
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            String str3 = (String) aoVar.mo38488r().get();
            esVar.copyOnWrite();
            C51058ev evVar3 = (C51058ev) esVar.instance;
            str3.getClass();
            evVar3.f132943a |= 1;
            evVar3.f132944b = str3;
            Optional p = aoVar.mo38486p();
            if (p.isPresent()) {
                C51098gh ghVar = (C51098gh) p.get();
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if ((evVar.f132943a & 1024) != 0) {
                    C51098gh ghVar2 = (C51098gh) p.get();
                    if (ghVar2.f133012b == 1) {
                        evVar2 = (C51058ev) ghVar2.f133013c;
                    } else {
                        evVar2 = C51058ev.f132941o;
                    }
                    String str4 = evVar2.f132953k;
                    esVar.copyOnWrite();
                    C51058ev evVar4 = (C51058ev) esVar.instance;
                    str4.getClass();
                    evVar4.f132943a |= 1024;
                    evVar4.f132953k = str4;
                }
            }
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            C51058ev evVar5 = (C51058ev) esVar.build();
            ggVar.copyOnWrite();
            C51098gh ghVar3 = (C51098gh) ggVar.instance;
            evVar5.getClass();
            ghVar3.f133013c = evVar5;
            ghVar3.f133012b = 1;
            mcVar.copyOnWrite();
            C52289mf mfVar = (C52289mf) mcVar.instance;
            C51098gh ghVar4 = (C51098gh) ggVar.build();
            ghVar4.getClass();
            mfVar.f137261b = ghVar4;
            mfVar.f137260a = 6;
        }
        return Optional.m71637of(C33116d.m61442a((C52289mf) mcVar.build()));
    }

    /* renamed from: c */
    public static Optional m61104c(C32993ao aoVar) {
        if (!aoVar.mo38471a().f88385c.isPresent()) {
            return Optional.empty();
        }
        C51401gi a = C51401gi.m86175a(((C51406gn) aoVar.mo38471a().f88385c.get()).f133894f);
        if (a == null) {
            a = C51401gi.CONTROLLER_STATE_UNKNOWN;
        }
        return Optional.m71637of(a);
    }

    /* renamed from: d */
    public static Optional m61105d(C32993ao aoVar) {
        Optional optional = aoVar.mo38471a().f88385c;
        if (optional.isPresent()) {
            Optional e = C33036j.m61314e((C51406gn) optional.get());
            if (e.isPresent()) {
                C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
                String str = (String) e.get();
                guVar.copyOnWrite();
                C52003hb hbVar = (C52003hb) guVar.instance;
                str.getClass();
                hbVar.f136478a |= 1;
                hbVar.f136479b = str;
                return Optional.m71637of(C33116d.m61452k((C52003hb) guVar.build()));
            }
        }
        return Optional.empty();
    }

    /* renamed from: e */
    public static Optional m61106e(C32993ao aoVar) {
        Optional o = aoVar.mo38485o();
        if (!o.isPresent() || ((List) o.get()).isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(C33027bv.m61271b((List) o.get()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.Optional m61107f(com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C32993ao r5) {
        /*
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r5 = r5.mo38471a()
            com.google.assistant.e.j.ex r5 = r5.mo38452a()
            java.lang.String r0 = "dictation"
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36497c(r5, r0)
            boolean r0 = r5.mo56113h()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r5.mo56107c()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r0 = r0.f166802a
            r1 = 3
            if (r0 != r1) goto L_0x0062
            java.lang.Object r0 = r5.mo56107c()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r2 = r0.f166802a
            if (r2 != r1) goto L_0x002e
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.t r0 = (com.google.knowledge.p4661a.p4662a.C61758t) r0
            goto L_0x0030
        L_0x002e:
            com.google.knowledge.a.a.t r0 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x0030:
            int r2 = r0.f166826a
            java.lang.String r3 = ""
            r4 = 1
            if (r2 != r4) goto L_0x003c
            java.lang.Object r0 = r0.f166827b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0062
            java.lang.Object r5 = r5.mo56107c()
            com.google.knowledge.a.a.j r5 = (com.google.knowledge.p4661a.p4662a.C61748j) r5
            int r0 = r5.f166802a
            if (r0 != r1) goto L_0x0052
            java.lang.Object r5 = r5.f166803b
            com.google.knowledge.a.a.t r5 = (com.google.knowledge.p4661a.p4662a.C61758t) r5
            goto L_0x0054
        L_0x0052:
            com.google.knowledge.a.a.t r5 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x0054:
            int r0 = r5.f166826a
            if (r0 != r4) goto L_0x005d
            java.lang.Object r5 = r5.f166827b
            r3 = r5
            java.lang.String r3 = (java.lang.String) r3
        L_0x005d:
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x0066
        L_0x0062:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C32992an.m61107f(com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao):j$.util.Optional");
    }

    /* renamed from: g */
    public static Optional m61108g(C32993ao aoVar) {
        Optional s = aoVar.mo38489s();
        if (!s.isPresent()) {
            return Optional.empty();
        }
        Optional t = aoVar.mo38490t((String) s.get(), BuildConfig.FLAVOR);
        Optional w = aoVar.mo38493w();
        if (!t.isPresent() || !w.isPresent() || ((String) w.get()).isEmpty()) {
            return Optional.empty();
        }
        ArrayList arrayList = new ArrayList();
        C52627yt ytVar = ((C52623yp) t.get()).f138165b;
        if (ytVar == null) {
            ytVar = C52627yt.f138176c;
        }
        Collection.EL.stream(ytVar.f138179b).forEach(new C32990al(arrayList));
        Optional findFirst = Collection.EL.stream(arrayList).filter(new C32991am(w)).findFirst();
        if (findFirst.isPresent()) {
            return Optional.m71637of((C52633yz) findFirst.get());
        }
        return Optional.empty();
    }

    /* renamed from: h */
    public static Optional m61109h(C32993ao aoVar, List list) {
        if (list.isEmpty()) {
            return Optional.empty();
        }
        if (!aoVar.mo38471a().f88385c.isPresent()) {
            return Optional.empty();
        }
        C52308my myVar = (C52308my) ((C52321nk) C33027bv.m61278i((C51406gn) aoVar.mo38471a().f88385c.get()).orElse(C52321nk.f137326j)).toBuilder();
        if (aoVar.mo38488r().isPresent()) {
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            String str = (String) aoVar.mo38488r().get();
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str.getClass();
            evVar.f132943a |= 1;
            evVar.f132944b = str;
            C51058ev evVar2 = (C51058ev) esVar.build();
            ggVar.copyOnWrite();
            C51098gh ghVar = (C51098gh) ggVar.instance;
            evVar2.getClass();
            ghVar.f133013c = evVar2;
            ghVar.f133012b = 1;
            myVar.copyOnWrite();
            C51098gh ghVar2 = (C51098gh) ggVar.build();
            ghVar2.getClass();
            ((C52321nk) myVar.instance).f137333f = ghVar2;
        }
        C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
        if (aoVar.mo38483m().isPresent()) {
            String str2 = (String) aoVar.mo38483m().get();
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            str2.getClass();
            pjVar.f137437b = 2;
            pjVar.f137438c = str2;
        } else if (aoVar.mo38479i().isPresent()) {
            String str3 = (String) aoVar.mo38479i().get();
            piVar.copyOnWrite();
            C52374pj pjVar2 = (C52374pj) piVar.instance;
            str3.getClass();
            pjVar2.f137437b = 1;
            pjVar2.f137438c = str3;
        } else if (aoVar.mo38493w().isPresent()) {
            String str4 = (String) aoVar.mo38493w().get();
            piVar.copyOnWrite();
            C52374pj pjVar3 = (C52374pj) piVar.instance;
            str4.getClass();
            pjVar3.f137437b = 6;
            pjVar3.f137438c = str4;
        }
        myVar.copyOnWrite();
        C52374pj pjVar4 = (C52374pj) piVar.build();
        pjVar4.getClass();
        ((C52321nk) myVar.instance).f137331d = pjVar4;
        C52311na naVar = (C52311na) C52312nb.f137312c.createBuilder();
        naVar.mo53828a(list);
        myVar.copyOnWrite();
        C52321nk nkVar = (C52321nk) myVar.instance;
        C52312nb nbVar = (C52312nb) naVar.build();
        nbVar.getClass();
        nkVar.f137329b = nbVar;
        nkVar.f137328a = 13;
        return Optional.m71637of(C33116d.m61450i((C52321nk) myVar.build()));
    }

    /* renamed from: i */
    public static Optional m61110i(C32993ao aoVar) {
        C52312nb nbVar;
        if (!aoVar.mo38471a().f88385c.isPresent()) {
            return Optional.empty();
        }
        C51406gn gnVar = (C51406gn) aoVar.mo38471a().f88385c.get();
        if (!C33027bv.m61283n(gnVar)) {
            return Optional.empty();
        }
        Optional i = C33027bv.m61278i(gnVar);
        if (!i.isPresent()) {
            return Optional.empty();
        }
        if (((C52321nk) i.get()).f137328a != 13) {
            return Optional.empty();
        }
        C52321nk nkVar = (C52321nk) i.get();
        if (nkVar.f137328a == 13) {
            nbVar = (C52312nb) nkVar.f137329b;
        } else {
            nbVar = C52312nb.f137312c;
        }
        C62971cq cqVar = nbVar.f137314a;
        if (cqVar.isEmpty()) {
            return Optional.empty();
        }
        if (Collection.EL.stream(cqVar).anyMatch(C32989ak.f88388a)) {
            return Optional.m71637of(cqVar);
        }
        return Optional.empty();
    }

    /* renamed from: j */
    public static Optional m61111j(C32993ao aoVar) {
        if (aoVar.mo38472b() != C51936ep.MESSAGE) {
            return Optional.empty();
        }
        if (!aoVar.mo38471a().f88385c.isPresent()) {
            return Optional.empty();
        }
        Optional h = C33027bv.m61277h((C51406gn) aoVar.mo38471a().f88385c.get());
        if (!h.isPresent() || ((C51458il) h.get()).f134046b.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(((C51458il) h.get()).f134046b);
    }

    /* renamed from: k */
    public static Optional m61112k(C32993ao aoVar) {
        C51058ev evVar;
        C51058ev evVar2;
        if (!aoVar.mo38488r().isPresent() || (!aoVar.mo38479i().isPresent() && !aoVar.mo38483m().isPresent() && !aoVar.mo38493w().isPresent())) {
            return Optional.empty();
        }
        String str = (String) aoVar.mo38488r().get();
        C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
        if (aoVar.mo38483m().isPresent()) {
            String str2 = (String) aoVar.mo38483m().get();
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            str2.getClass();
            pjVar.f137437b = 2;
            pjVar.f137438c = str2;
        } else if (aoVar.mo38479i().isPresent()) {
            String str3 = (String) aoVar.mo38479i().get();
            piVar.copyOnWrite();
            C52374pj pjVar2 = (C52374pj) piVar.instance;
            str3.getClass();
            pjVar2.f137437b = 1;
            pjVar2.f137438c = str3;
        } else if (aoVar.mo38493w().isPresent()) {
            String str4 = (String) aoVar.mo38493w().get();
            piVar.copyOnWrite();
            C52374pj pjVar3 = (C52374pj) piVar.instance;
            str4.getClass();
            pjVar3.f137437b = 6;
            pjVar3.f137438c = str4;
        }
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        esVar.copyOnWrite();
        C51058ev evVar3 = (C51058ev) esVar.instance;
        str.getClass();
        evVar3.f132943a |= 1;
        evVar3.f132944b = str;
        Optional p = aoVar.mo38486p();
        if (p.isPresent()) {
            C51098gh ghVar = (C51098gh) p.get();
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            if ((evVar.f132943a & 1024) != 0) {
                C51098gh ghVar2 = (C51098gh) p.get();
                if (ghVar2.f133012b == 1) {
                    evVar2 = (C51058ev) ghVar2.f133013c;
                } else {
                    evVar2 = C51058ev.f132941o;
                }
                String str5 = evVar2.f132953k;
                esVar.copyOnWrite();
                C51058ev evVar4 = (C51058ev) esVar.instance;
                str5.getClass();
                evVar4.f132943a |= 1024;
                evVar4.f132953k = str5;
            }
        }
        apk apk = (apk) apn.f135563g.createBuilder();
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        ggVar.copyOnWrite();
        C51098gh ghVar3 = (C51098gh) ggVar.instance;
        C51058ev evVar5 = (C51058ev) esVar.build();
        evVar5.getClass();
        ghVar3.f133013c = evVar5;
        ghVar3.f133012b = 1;
        apk.copyOnWrite();
        C51098gh ghVar4 = (C51098gh) ggVar.build();
        ghVar4.getClass();
        ((apn) apk.instance).f135567c = ghVar4;
        apk.copyOnWrite();
        C52374pj pjVar4 = (C52374pj) piVar.build();
        pjVar4.getClass();
        ((apn) apk.instance).f135565a = pjVar4;
        return Optional.m71637of(C33116d.m61455n((apn) apk.build()));
    }

    /* renamed from: l */
    public static void m61113l(C32993ao aoVar, C51401gi giVar) {
        Optional optional = aoVar.mo38471a().f88385c;
        if (optional.isPresent()) {
            C51406gn a = C33036j.m61310a(giVar, (C51406gn) optional.get());
            aoVar.mo38471a().f88385c = Optional.m71637of(a);
        }
    }

    /* renamed from: m */
    public static void m61114m(C32993ao aoVar) {
        aoVar.mo38471a().mo38455d(C33119g.m61465a(aoVar.mo38471a().mo38452a()));
    }
}
