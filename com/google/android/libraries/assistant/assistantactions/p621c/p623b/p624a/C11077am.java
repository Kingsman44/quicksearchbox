package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e;
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
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.am */
/* compiled from: PG */
public final /* synthetic */ class C11077am {
    /* renamed from: a */
    public static C58833ax m26194a(C11078an anVar) {
        if (anVar.mo19571b() != C51936ep.MESSAGE) {
            return C58836b.f156633a;
        }
        C58833ax b = anVar.mo19570a().mo19553b();
        if (!b.mo56113h()) {
            return C58836b.f156633a;
        }
        String str = ((C51460in) b.mo56107c()).f134056c;
        return str.isEmpty() ? C58836b.f156633a : C58833ax.m90834k(str);
    }

    /* renamed from: b */
    public static C58833ax m26195b(C11078an anVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C52286mc mcVar = (C52286mc) C52289mf.f137258j.createBuilder();
        if (anVar.mo19582m().mo56113h()) {
            String str = (String) anVar.mo19582m().mo56107c();
            mcVar.copyOnWrite();
            str.getClass();
            ((C52289mf) mcVar.instance).f137262c = str;
            mcVar.copyOnWrite();
            ((C52289mf) mcVar.instance).f137263d = "PHONE_NUMBER";
        } else if (!anVar.mo19592w().mo56113h()) {
            return C58836b.f156633a;
        } else {
            String str2 = (String) anVar.mo19592w().mo56107c();
            mcVar.copyOnWrite();
            str2.getClass();
            ((C52289mf) mcVar.instance).f137262c = str2;
            mcVar.copyOnWrite();
            ((C52289mf) mcVar.instance).f137263d = "APP_UNIQUE_ENDPOINT";
        }
        if (anVar.mo19587r().mo56113h()) {
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            String str3 = (String) anVar.mo19587r().mo56107c();
            esVar.copyOnWrite();
            C51058ev evVar3 = (C51058ev) esVar.instance;
            str3.getClass();
            evVar3.f132943a |= 1;
            evVar3.f132944b = str3;
            C58833ax p = anVar.mo19585p();
            if (p.mo56113h()) {
                C51098gh ghVar = (C51098gh) p.mo56107c();
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if ((evVar.f132943a & 1024) != 0) {
                    C51098gh ghVar2 = (C51098gh) p.mo56107c();
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
        return C58833ax.m90834k(C11209d.m26571a((C52289mf) mcVar.build()));
    }

    /* renamed from: c */
    public static C58833ax m26196c(C11078an anVar) {
        if (!anVar.mo19570a().f36352c.mo56113h()) {
            return C58836b.f156633a;
        }
        C51401gi a = C51401gi.m86175a(((C51406gn) anVar.mo19570a().f36352c.mo56107c()).f133894f);
        if (a == null) {
            a = C51401gi.CONTROLLER_STATE_UNKNOWN;
        }
        return C58833ax.m90834k(a);
    }

    /* renamed from: d */
    public static C58833ax m26197d(C11078an anVar) {
        C58833ax axVar = anVar.mo19570a().f36352c;
        if (axVar.mo56113h()) {
            C58833ax e = C11118i.m26420e((C51406gn) axVar.mo56107c());
            if (e.mo56113h()) {
                C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
                String str = (String) e.mo56107c();
                guVar.copyOnWrite();
                C52003hb hbVar = (C52003hb) guVar.instance;
                str.getClass();
                hbVar.f136478a |= 1;
                hbVar.f136479b = str;
                return C58833ax.m90834k(C11209d.m26582l((C52003hb) guVar.build()));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public static C58833ax m26198e(C11078an anVar) {
        C58833ax o = anVar.mo19584o();
        if (!o.mo56113h() || ((List) o.mo56107c()).isEmpty()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(C11110bs.m26370c((List) o.mo56107c()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m26199f(com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11078an r5) {
        /*
            com.google.android.libraries.assistant.assistantactions.c.b.a.ai r5 = r5.mo19570a()
            com.google.assistant.e.j.ex r5 = r5.mo19552a()
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
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x0064
        L_0x0062:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11077am.m26199f(com.google.android.libraries.assistant.assistantactions.c.b.a.an):com.google.common.base.ax");
    }

    /* renamed from: g */
    public static C58833ax m26200g(C11078an anVar) {
        C58833ax s = anVar.mo19588s();
        if (!s.mo56113h()) {
            return C58836b.f156633a;
        }
        C58833ax t = anVar.mo19589t((String) s.mo56107c(), BuildConfig.FLAVOR);
        C58833ax w = anVar.mo19592w();
        if (!t.mo56113h() || !w.mo56113h() || ((String) w.mo56107c()).isEmpty()) {
            return C58836b.f156633a;
        }
        ArrayList arrayList = new ArrayList();
        C52627yt ytVar = ((C52623yp) t.mo56107c()).f138165b;
        if (ytVar == null) {
            ytVar = C52627yt.f138176c;
        }
        Collection.EL.stream(ytVar.f138179b).forEach(new C11075ak(arrayList));
        Optional findFirst = Collection.EL.stream(arrayList).filter(new C11076al(w)).findFirst();
        return findFirst.isPresent() ? C58833ax.m90834k((C52633yz) findFirst.get()) : C58836b.f156633a;
    }

    /* renamed from: h */
    public static C58833ax m26201h(C11078an anVar, List list) {
        if (list.isEmpty()) {
            return C58836b.f156633a;
        }
        if (!anVar.mo19570a().f36352c.mo56113h()) {
            return C58836b.f156633a;
        }
        C52308my myVar = (C52308my) ((C52321nk) C11110bs.m26377j((C51406gn) anVar.mo19570a().f36352c.mo56107c()).mo56109e(C52321nk.f137326j)).toBuilder();
        if (anVar.mo19587r().mo56113h()) {
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            String str = (String) anVar.mo19587r().mo56107c();
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
        if (anVar.mo19582m().mo56113h()) {
            String str2 = (String) anVar.mo19582m().mo56107c();
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            str2.getClass();
            pjVar.f137437b = 2;
            pjVar.f137438c = str2;
        } else if (anVar.mo19578i().mo56113h()) {
            String str3 = (String) anVar.mo19578i().mo56107c();
            piVar.copyOnWrite();
            C52374pj pjVar2 = (C52374pj) piVar.instance;
            str3.getClass();
            pjVar2.f137437b = 1;
            pjVar2.f137438c = str3;
        } else if (anVar.mo19592w().mo56113h()) {
            String str4 = (String) anVar.mo19592w().mo56107c();
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
        return C58833ax.m90834k(C11209d.m26579i((C52321nk) myVar.build()));
    }

    /* renamed from: i */
    public static C58833ax m26202i(C11078an anVar) {
        C52312nb nbVar;
        if (!anVar.mo19570a().f36352c.mo56113h()) {
            return C58836b.f156633a;
        }
        C51406gn gnVar = (C51406gn) anVar.mo19570a().f36352c.mo56107c();
        if (!C11110bs.m26384q(gnVar)) {
            return C58836b.f156633a;
        }
        C58833ax j = C11110bs.m26377j(gnVar);
        if (!j.mo56113h()) {
            return C58836b.f156633a;
        }
        if (((C52321nk) j.mo56107c()).f137328a != 13) {
            return C58836b.f156633a;
        }
        C52321nk nkVar = (C52321nk) j.mo56107c();
        if (nkVar.f137328a == 13) {
            nbVar = (C52312nb) nkVar.f137329b;
        } else {
            nbVar = C52312nb.f137312c;
        }
        C62971cq cqVar = nbVar.f137314a;
        if (cqVar.isEmpty()) {
            return C58836b.f156633a;
        }
        return Collection.EL.stream(cqVar).anyMatch(C11074aj.f36355a) ? C58833ax.m90834k(cqVar) : C58836b.f156633a;
    }

    /* renamed from: j */
    public static C58833ax m26203j(C11078an anVar) {
        if (anVar.mo19571b() != C51936ep.MESSAGE) {
            return C58836b.f156633a;
        }
        if (!anVar.mo19570a().f36352c.mo56113h()) {
            return C58836b.f156633a;
        }
        C58833ax i = C11110bs.m26376i((C51406gn) anVar.mo19570a().f36352c.mo56107c());
        return (!i.mo56113h() || ((C51458il) i.mo56107c()).f134046b.isEmpty()) ? C58836b.f156633a : C58833ax.m90834k(((C51458il) i.mo56107c()).f134046b);
    }

    /* renamed from: k */
    public static C58833ax m26204k(C11078an anVar) {
        C51058ev evVar;
        C51058ev evVar2;
        if (!anVar.mo19587r().mo56113h() || !anVar.mo19578i().mo56105a(anVar.mo19582m()).mo56105a(anVar.mo19592w()).mo56113h()) {
            return C58836b.f156633a;
        }
        String str = (String) anVar.mo19587r().mo56107c();
        C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
        if (anVar.mo19582m().mo56113h()) {
            String str2 = (String) anVar.mo19582m().mo56107c();
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            str2.getClass();
            pjVar.f137437b = 2;
            pjVar.f137438c = str2;
        } else if (anVar.mo19578i().mo56113h()) {
            String str3 = (String) anVar.mo19578i().mo56107c();
            piVar.copyOnWrite();
            C52374pj pjVar2 = (C52374pj) piVar.instance;
            str3.getClass();
            pjVar2.f137437b = 1;
            pjVar2.f137438c = str3;
        } else if (anVar.mo19592w().mo56113h()) {
            String str4 = (String) anVar.mo19592w().mo56107c();
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
        C58833ax p = anVar.mo19585p();
        if (p.mo56113h()) {
            C51098gh ghVar = (C51098gh) p.mo56107c();
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            if ((evVar.f132943a & 1024) != 0) {
                C51098gh ghVar2 = (C51098gh) p.mo56107c();
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
        return C58833ax.m90834k(C11209d.m26585o((apn) apk.build()));
    }

    /* renamed from: l */
    public static void m26205l(C11078an anVar, C51401gi giVar) {
        C58833ax axVar = anVar.mo19570a().f36352c;
        if (axVar.mo56113h()) {
            C51406gn a = C11118i.m26416a(giVar, (C51406gn) axVar.mo56107c());
            anVar.mo19570a().f36352c = C58833ax.m90834k(a);
        }
    }

    /* renamed from: m */
    public static void m26206m(C11078an anVar) {
        anVar.mo19570a().mo19554c(C11210e.m26589a(anVar.mo19570a().mo19552a()));
    }
}
