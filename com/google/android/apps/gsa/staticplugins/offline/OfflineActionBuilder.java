package com.google.android.apps.gsa.staticplugins.offline;

import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.g.g.b;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85719g;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84570aa;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84599z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.staticplugins.offline.p8169c.C105884a;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.android.libraries.p11002ag.C147579i;
import com.google.android.libraries.p11002ag.C147583m;
import com.google.android.libraries.p11002ag.p11003a.C147551a;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147565f;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147571l;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147572m;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4152bb.p4153a.C54945ac;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C55207jv;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55238kz;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55264ly;
import com.google.p4152bb.p4153a.C55265lz;
import com.google.p4152bb.p4153a.C55290mx;
import com.google.p4152bb.p4153a.C55302ni;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55348pa;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4242bp.p4243a.p4245b.C56142a;
import com.google.p4242bp.p4243a.p4245b.C56143b;
import com.google.p4242bp.p4243a.p4245b.C56144c;
import com.google.p4242bp.p4243a.p4245b.C56146e;
import com.google.p4242bp.p4243a.p4245b.C56150i;
import com.google.p440an.C8844b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.protos.p4958bd.C64438d;
import com.google.speech.grammar.pumpkin.C66520l;
import com.google.speech.grammar.pumpkin.C66521m;
import com.google.speech.grammar.pumpkin.C66523o;
import com.google.speech.grammar.pumpkin.C66524p;
import com.google.speech.grammar.pumpkin.C66525q;
import com.google.speech.grammar.pumpkin.C66527s;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
public class OfflineActionBuilder implements C84599z {

    /* renamed from: a */
    public static final C59071e f295366a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.offline.OfflineActionBuilder");

    /* renamed from: b */
    public static C105884a f295367b;

    /* renamed from: c */
    private final C86124t f295368c;

    /* renamed from: d */
    private final C86054o f295369d;

    /* renamed from: e */
    private final C86159h f295370e;

    /* renamed from: f */
    private final Locale f295371f;

    /* renamed from: g */
    private final String f295372g;

    /* renamed from: h */
    private final String f295373h;

    /* renamed from: i */
    private final C89859i f295374i;

    /* renamed from: j */
    private final C84516aa f295375j;

    /* renamed from: k */
    private final OfflineLoader f295376k;

    /* renamed from: l */
    private final C91123v f295377l;

    public OfflineActionBuilder(C86054o oVar, C86159h hVar, Locale locale, String str, String str2, C86124t tVar, C89859i iVar, C84516aa aaVar, C91123v vVar, OfflineLoader offlineLoader) {
        this.f295369d = oVar;
        this.f295370e = hVar;
        this.f295371f = locale;
        this.f295372g = str;
        this.f295373h = str2;
        this.f295368c = tVar;
        this.f295374i = iVar;
        this.f295375j = aaVar;
        this.f295377l = vVar;
        this.f295376k = offlineLoader;
    }

    static native byte[] nativeBuildAction(byte[] bArr, byte[] bArr2);

    static native void nativeUpdateMessageMapLocale(String str);

    /* renamed from: a */
    public final C55349pb mo78366a(TaggerResult taggerResult, C66527s sVar, Query query) {
        C54946ad adVar;
        C55348pa paVar;
        C55265lz lzVar;
        Object obj;
        Object obj2;
        boolean z;
        TaggerResult taggerResult2 = taggerResult;
        C66527s sVar2 = sVar;
        Query query2 = query;
        C147579i iVar = null;
        if (!this.f295376k.f295378a) {
            return null;
        }
        if (e.a(query2.mo84263a("android.opa.extra.TRIGGERED_BY")) == e.bQ) {
            return null;
        }
        if (query.mo84411cr()) {
            return null;
        }
        C56144c cVar = (C56144c) C56146e.f149581v.createBuilder();
        String locale = this.f295371f.toString();
        cVar.copyOnWrite();
        C56146e eVar = (C56146e) cVar.instance;
        locale.getClass();
        eVar.f149583a |= 1024;
        eVar.f149589g = locale;
        TimeZone timeZone = TimeZone.getDefault();
        String obj3 = query2.f252768g.toString();
        cVar.copyOnWrite();
        C56146e eVar2 = (C56146e) cVar.instance;
        obj3.getClass();
        eVar2.f149583a |= 1;
        eVar2.f149584b = obj3;
        String id = timeZone.getID();
        cVar.copyOnWrite();
        C56146e eVar3 = (C56146e) cVar.instance;
        id.getClass();
        eVar3.f149583a |= 64;
        eVar3.f149587e = id;
        String F = this.f295369d.mo79659F();
        if (F != null) {
            cVar.copyOnWrite();
            C56146e eVar4 = (C56146e) cVar.instance;
            eVar4.f149583a |= 32;
            eVar4.f149586d = F;
        }
        int i = 0;
        C61818k e = this.f295370e.mo79795e(false);
        cVar.copyOnWrite();
        C56146e eVar5 = (C56146e) cVar.instance;
        e.getClass();
        eVar5.f149590h = e;
        eVar5.f149583a |= 2048;
        String str = taggerResult2.f118518a;
        if (!"Call".equals(str) && !"CallFollowOn".equals(str) && !"SendMessage".equals(str) && !"SendMessageFollowOn".equals(str) && !"SearchMessage".equals(str) && !"SearchMessageFollowOn".equals(str) && !"Planning".equals(str) && !"PlanningFollowOn".equals(str) && !"DialogCoreFollowOn".equals(str) && !"CommunicationDialogFollowOn".equals(str)) {
            C61818k kVar = ((C56146e) cVar.instance).f149590h;
            if (kVar == null) {
                kVar = C61818k.f166999r;
            }
            C61817j jVar = (C61817j) kVar.toBuilder();
            jVar.copyOnWrite();
            ((C61818k) jVar.instance).f167002b = C61818k.emptyProtobufList();
            cVar.copyOnWrite();
            C56146e eVar6 = (C56146e) cVar.instance;
            C61818k kVar2 = (C61818k) jVar.build();
            kVar2.getClass();
            eVar6.f149590h = kVar2;
            eVar6.f149583a |= 2048;
        }
        ArrayList arrayList = new ArrayList();
        if (sVar2 != null && sVar2.f180939a.size() > 0 && !taggerResult2.f118518a.equals("DialogCoreFollowOn")) {
            for (C66525q qVar : sVar2.f180939a) {
                if (qVar.f180932b.equals("DialogCoreFollowOn")) {
                    arrayList.add(qVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            cVar.copyOnWrite();
            C56146e eVar7 = (C56146e) cVar.instance;
            C62971cq cqVar = eVar7.f149591i;
            if (!cqVar.mo58948c()) {
                eVar7.f149591i = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) eVar7.f149591i);
        }
        if (query.mo84337bV()) {
            if (query.mo84412cs()) {
                C64438d dVar = C64438d.CAR;
                cVar.copyOnWrite();
                C56146e eVar8 = (C56146e) cVar.instance;
                eVar8.f149588f = dVar.f174811g;
                eVar8.f149583a |= 256;
                C52431rm rmVar = C52431rm.ANDROID_AUTO;
                cVar.copyOnWrite();
                C56146e eVar9 = (C56146e) cVar.instance;
                eVar9.f149600r = rmVar.f137633ah;
                eVar9.f149583a |= 524288;
                if (this.f295368c.mo79746e(C90086ek.f250357bc) && C85719g.m137721a(query2, this.f295377l)) {
                    cVar.copyOnWrite();
                    C56146e eVar10 = (C56146e) cVar.instance;
                    eVar10.f149583a |= 4194304;
                    eVar10.f149603u = true;
                }
            } else {
                C61818k kVar3 = ((C56146e) cVar.instance).f149590h;
                if (kVar3 == null) {
                    kVar3 = C61818k.f166999r;
                }
                if (kVar3.f167005e) {
                    C64438d dVar2 = C64438d.EYES_FREE_NAVIGATING;
                    cVar.copyOnWrite();
                    C56146e eVar11 = (C56146e) cVar.instance;
                    eVar11.f149588f = dVar2.f174811g;
                    eVar11.f149583a |= 256;
                    C52431rm rmVar2 = C52431rm.EYESFREE_GMM;
                    cVar.copyOnWrite();
                    C56146e eVar12 = (C56146e) cVar.instance;
                    eVar12.f149600r = rmVar2.f137633ah;
                    eVar12.f149583a |= 524288;
                } else {
                    C64438d dVar3 = C64438d.EYES_FREE;
                    cVar.copyOnWrite();
                    C56146e eVar13 = (C56146e) cVar.instance;
                    eVar13.f149588f = dVar3.f174811g;
                    eVar13.f149583a |= 256;
                    if (query.mo84324bI()) {
                        C52431rm rmVar3 = C52431rm.AUDIOWEAR;
                        cVar.copyOnWrite();
                        C56146e eVar14 = (C56146e) cVar.instance;
                        eVar14.f149600r = rmVar3.f137633ah;
                        eVar14.f149583a |= 524288;
                    } else {
                        C52431rm rmVar4 = C52431rm.EYESFREE_AGSA;
                        cVar.copyOnWrite();
                        C56146e eVar15 = (C56146e) cVar.instance;
                        eVar15.f149600r = rmVar4.f137633ah;
                        eVar15.f149583a |= 524288;
                    }
                }
            }
        } else if (query.mo84326bK()) {
            C64438d dVar4 = C64438d.WATCH;
            cVar.copyOnWrite();
            C56146e eVar16 = (C56146e) cVar.instance;
            eVar16.f149588f = dVar4.f174811g;
            eVar16.f149583a |= 256;
            C52431rm rmVar5 = C52431rm.ANDROID_WEAR;
            cVar.copyOnWrite();
            C56146e eVar17 = (C56146e) cVar.instance;
            eVar17.f149600r = rmVar5.f137633ah;
            eVar17.f149583a |= 524288;
            Bundle bundle = query2.f252786y;
            if (bundle != null && bundle.containsKey("user-agent-suffix")) {
                String string = bundle.getString("user-agent-suffix");
                string.getClass();
                cVar.copyOnWrite();
                C56146e eVar18 = (C56146e) cVar.instance;
                eVar18.f149583a |= 65536;
                eVar18.f149594l = string;
            }
        } else {
            C64438d dVar5 = C64438d.DEFAULT;
            cVar.copyOnWrite();
            C56146e eVar19 = (C56146e) cVar.instance;
            eVar19.f149588f = dVar5.f174811g;
            eVar19.f149583a |= 256;
            if (query.mo84403cj()) {
                C52431rm rmVar6 = C52431rm.OPA_AGSA;
                cVar.copyOnWrite();
                C56146e eVar20 = (C56146e) cVar.instance;
                eVar20.f149600r = rmVar6.f137633ah;
                eVar20.f149583a |= 524288;
            } else {
                C52431rm rmVar7 = C52431rm.MULTIMODAL_AGSA;
                cVar.copyOnWrite();
                C56146e eVar21 = (C56146e) cVar.instance;
                eVar21.f149600r = rmVar7.f137633ah;
                eVar21.f149583a |= 524288;
            }
        }
        if (C90721ae.f253794c.contains(query.mo84351bj())) {
            cVar.copyOnWrite();
            C56146e eVar22 = (C56146e) cVar.instance;
            eVar22.f149602t = 8;
            eVar22.f149583a |= C89885b.NOW_VALUE;
        }
        int i2 = Build.VERSION.SDK_INT;
        cVar.copyOnWrite();
        C56146e eVar23 = (C56146e) cVar.instance;
        eVar23.f149583a |= 16384;
        eVar23.f149592j = i2;
        boolean dA = query.mo84420dA();
        cVar.copyOnWrite();
        C56146e eVar24 = (C56146e) cVar.instance;
        eVar24.f149583a |= 32768;
        eVar24.f149593k = dA;
        C8844b a = b.a(this.f295371f);
        cVar.copyOnWrite();
        C56146e eVar25 = (C56146e) cVar.instance;
        eVar25.f149585c = a.f30754cC;
        eVar25.f149583a |= 2;
        String str2 = Build.VERSION.RELEASE;
        cVar.copyOnWrite();
        C56146e eVar26 = (C56146e) cVar.instance;
        str2.getClass();
        eVar26.f149583a |= C89885b.S3REQUEST_VALUE;
        eVar26.f149598p = str2;
        String str3 = this.f295373h;
        cVar.copyOnWrite();
        C56146e eVar27 = (C56146e) cVar.instance;
        str3.getClass();
        eVar27.f149583a |= C89885b.HTTP_VALUE;
        eVar27.f149599q = str3;
        List c = C84570aa.m135298c(query2, this.f295368c);
        cVar.copyOnWrite();
        C56146e eVar28 = (C56146e) cVar.instance;
        C62971cq cqVar2 = eVar28.f149596n;
        if (!cqVar2.mo58948c()) {
            eVar28.f149596n = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) c, (List) eVar28.f149596n);
        C58528ij<C55421x> a2 = C84570aa.m135296a(query2, this.f295368c, this.f295372g);
        cVar.copyOnWrite();
        C56146e eVar29 = (C56146e) cVar.instance;
        C62961ch chVar = eVar29.f149595m;
        if (!chVar.mo58948c()) {
            eVar29.f149595m = C62942bv.mutableCopy(chVar);
        }
        for (C55421x xVar : a2) {
            eVar29.f149595m.mo58916g(xVar.f146230cP);
        }
        List list = C84570aa.f230154b;
        cVar.copyOnWrite();
        C56146e eVar30 = (C56146e) cVar.instance;
        C62961ch chVar2 = eVar30.f149597o;
        if (!chVar2.mo58948c()) {
            eVar30.f149597o = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) list, (List) eVar30.f149597o);
        cVar.copyOnWrite();
        C56146e eVar31 = (C56146e) cVar.instance;
        eVar31.f149583a |= 1048576;
        eVar31.f149601s = true;
        C56146e eVar32 = (C56146e) cVar.build();
        C56143b b = mo95106b(taggerResult2.f118520c, eVar32);
        if (b != null) {
            if ((b.f149576a & 1) != 0) {
                adVar = b.f149577b;
                if (adVar == null) {
                    adVar = C54946ad.f144531h;
                }
            } else {
                adVar = null;
            }
            int a3 = C56150i.m87914a(b.f149578c);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 != 1) {
                if (a3 == 2) {
                    a3 = 2;
                } else {
                    i = a3;
                    paVar = null;
                }
            }
            if (adVar == null) {
                ((C59052c) ((C59052c) f295366a.mo56225c()).mo56372aa(22460)).mo56386p("Unknown error during offline action building.");
            } else {
                C54948af afVar = adVar.f144536d;
                if (afVar == null) {
                    afVar = C54948af.f144541h;
                }
                if (afVar != null) {
                    C55421x a4 = C55421x.m87686a(afVar.f144544b);
                    if (a4 == null) {
                        a4 = C55421x.UNKNOWN_ACTION_TYPE;
                    }
                    if (query.mo84337bV() && !query.mo84412cs()) {
                        z = C84570aa.f230153a.contains(Integer.valueOf(a4.f146230cP));
                        if (!z && (query.mo84404ck() || query2.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED"))) {
                            z = this.f295368c.mo79749o(C90139r.f251859g).contains(Integer.valueOf(a4.f146230cP));
                        }
                    } else if (query.mo84412cs()) {
                        z = this.f295368c.mo79749o(C90086ek.f250468dh).contains(Integer.valueOf(a4.f146230cP));
                    } else if (query.mo84326bK()) {
                        z = false;
                    } else {
                        boolean isDeviceLocked = this.f295375j.f230023b.isDeviceLocked();
                        C58976aa aaVar = C58975e.f156826a;
                        z = (!isDeviceLocked || !this.f295368c.mo79746e(C90014bt.f247232dK) || this.f295368c.mo79749o(C90139r.f251865m).contains(Integer.valueOf(a4.f146230cP))) ? this.f295368c.mo79749o(C90120fr.f250815ag).contains(Integer.valueOf(a4.f146230cP)) : true;
                    }
                    if (!z && query.mo84415cv()) {
                        z = this.f295368c.mo79749o(C90082eg.f250009cS).contains(Integer.valueOf(a4.f146230cP));
                    }
                    if (z || C84570aa.m135297b(this.f295372g, this.f295368c).contains(Integer.valueOf(a4.f146230cP))) {
                        ((C59052c) ((C59052c) f295366a.mo56224b()).mo56372aa(22475)).mo56387q("Action type %d suppressed by flag.", a4.f146230cP);
                        i = 1002;
                    } else {
                        ((C59052c) ((C59052c) f295366a.mo56224b()).mo56372aa(22474)).mo56387q("Action built with type %d.", a4.f146230cP);
                    }
                }
                C105884a aVar = f295367b;
                if (aVar != null) {
                    C64438d a5 = C64438d.m96405a(eVar32.f149588f);
                    if (a5 == null) {
                        a5 = C64438d.DEFAULT;
                    }
                    adVar = aVar.mo95127a(adVar, a5);
                }
                if (query.mo84331bP()) {
                    C62940bt r2 = C62942bv.checkIsLite(C55265lz.f145556m);
                    adVar.mo58887l(r2);
                    Object l = adVar.f169962ag.mo58854l(r2.f169971d);
                    if (l == null) {
                        obj2 = r2.f169969b;
                    } else {
                        obj2 = r2.mo58889c(l);
                    }
                    C55264ly lyVar = (C55264ly) ((C55265lz) obj2).toBuilder();
                    if (lyVar != null) {
                        lyVar.copyOnWrite();
                        ((C55265lz) lyVar.instance).f145567j = C55265lz.emptyProtobufList();
                        C54945ac acVar = (C54945ac) adVar.toBuilder();
                        acVar.mo58885m(C55265lz.f145556m, (C55265lz) lyVar.build());
                        adVar = (C54946ad) acVar.build();
                    }
                }
                paVar = (C55348pa) C55349pb.f145830g.createBuilder();
                paVar.mo54248a(adVar);
                float f = a3 == 1 ? 0.9f : 0.5f;
                paVar.copyOnWrite();
                C55349pb pbVar = (C55349pb) paVar.instance;
                pbVar.f145832a |= 4;
                pbVar.f145833b = f;
                paVar.copyOnWrite();
                C55349pb pbVar2 = (C55349pb) paVar.instance;
                pbVar2.f145832a |= 128;
                pbVar2.f145836e = 6;
                int i3 = 0;
                while (i3 < ((C55349pb) paVar.instance).f145835d.size()) {
                    C54945ac acVar2 = (C54945ac) ((C54946ad) ((C55349pb) paVar.instance).f145835d.get(i3)).toBuilder();
                    if (acVar2 != null) {
                        C54948af afVar2 = ((C54946ad) acVar2.instance).f144536d;
                        if (afVar2 == null) {
                            afVar2 = C54948af.f144541h;
                        }
                        C55421x a6 = C55421x.m87686a(afVar2.f144544b);
                        if (a6 == null) {
                            a6 = C55421x.UNKNOWN_ACTION_TYPE;
                        }
                        if (a6 == C55421x.PHONE_CALL_NUMBER && (lzVar = (C55265lz) acVar2.mo58881i(C55265lz.f145556m)) != null) {
                            C55213ka kaVar = (C55213ka) lzVar.f145559b.get(0);
                            C62940bt r13 = C62942bv.checkIsLite(C55290mx.f145636f);
                            kaVar.mo58887l(r13);
                            if (kaVar.f169962ag.mo58857o(r13.f169971d)) {
                                C55213ka kaVar2 = (C55213ka) lzVar.f145559b.get(0);
                                C62940bt r132 = C62942bv.checkIsLite(C55290mx.f145636f);
                                kaVar2.mo58887l(r132);
                                Object l2 = kaVar2.f169962ag.mo58854l(r132.f169971d);
                                if (l2 == null) {
                                    obj = r132.f169969b;
                                } else {
                                    obj = r132.mo58889c(l2);
                                }
                                String str4 = ((C55290mx) obj).f145639b;
                                C147583m mVar = C147583m.f398380a;
                                String country = this.f295371f.getCountry();
                                CharSequence g = C147576f.m240622g(str4);
                                if (!C147576f.f398275b.matcher(g).lookingAt()) {
                                    if (country != null) {
                                        try {
                                            C147571l lVar = mVar.f398382c;
                                            if (C147551a.m240588a(country)) {
                                                iVar = ((C147565f) ((C147572m) lVar).f398271b.mo124310a(((C147572m) lVar).f398270a.mo124314a(country))).mo124313b(country);
                                            } else {
                                                throw new IllegalArgumentException(country.concat(" region code is a non-geo entity"));
                                            }
                                        } catch (IllegalArgumentException unused) {
                                            iVar = null;
                                        }
                                    }
                                    if (iVar != null && iVar.f398346k) {
                                        if (!(!mVar.f398383d.mo124305a(C147576f.m240623k(g), iVar.f398347l, !C147583m.f398381b.contains(country)) || lzVar.f145560c.size() == 0 || ((C55305nl) lzVar.f145560c.get(0)).f145692b.size() == 0)) {
                                            C55240la laVar = (C55240la) ((C55305nl) lzVar.f145560c.get(0)).f145692b.get(0);
                                            C62940bt r12 = C62942bv.checkIsLite(C55208jw.f145316z);
                                            laVar.mo58887l(r12);
                                            if (laVar.f169962ag.mo58857o(r12.f169971d)) {
                                                C55240la laVar2 = (C55240la) ((C55305nl) lzVar.f145560c.get(0)).f145692b.get(0);
                                                C62940bt r122 = C62942bv.checkIsLite(C55208jw.f145313A);
                                                laVar2.mo58887l(r122);
                                                if (laVar2.f169962ag.mo58857o(r122.f169971d)) {
                                                    C55238kz kzVar = (C55238kz) ((C55240la) ((C55305nl) lzVar.f145560c.get(0)).f145692b.get(0)).toBuilder();
                                                    C62940bt btVar = C55208jw.f145316z;
                                                    C55207jv jvVar = (C55207jv) ((C55208jw) kzVar.mo58881i(btVar)).toBuilder();
                                                    jvVar.copyOnWrite();
                                                    C55208jw jwVar = (C55208jw) jvVar.instance;
                                                    jwVar.f145318a |= 1;
                                                    jwVar.f145319b = "android.intent.action.CALL_PRIVILEGED";
                                                    kzVar.mo58885m(btVar, (C55208jw) jvVar.build());
                                                    C62940bt btVar2 = C55208jw.f145313A;
                                                    C55207jv jvVar2 = (C55207jv) ((C55208jw) kzVar.mo58881i(btVar2)).toBuilder();
                                                    jvVar2.copyOnWrite();
                                                    C55208jw jwVar2 = (C55208jw) jvVar2.instance;
                                                    jwVar2.f145318a |= 1;
                                                    jwVar2.f145319b = "android.intent.action.CALL_PRIVILEGED";
                                                    kzVar.mo58885m(btVar2, (C55208jw) jvVar2.build());
                                                    C55264ly lyVar2 = (C55264ly) lzVar.toBuilder();
                                                    C55302ni niVar = (C55302ni) ((C55305nl) lzVar.f145560c.get(0)).toBuilder();
                                                    niVar.mo54237c(0, kzVar);
                                                    lyVar2.mo54225d(0, niVar);
                                                    acVar2.mo58885m(C55265lz.f145556m, (C55265lz) lyVar2.build());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    paVar.copyOnWrite();
                    C55349pb pbVar3 = (C55349pb) paVar.instance;
                    C54946ad adVar2 = (C54946ad) acVar2.build();
                    adVar2.getClass();
                    pbVar3.mo54249a();
                    pbVar3.f145835d.set(i3, adVar2);
                    i3++;
                    iVar = null;
                }
                i = 1;
            }
            paVar = null;
        } else {
            paVar = null;
            adVar = null;
        }
        Long valueOf = Long.valueOf(query2.f252749G);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 467;
        String b2 = C39191a.m68623b(valueOf.longValue());
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b2.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b2;
        if (i != 1) {
            int i4 = -1;
            if (i != 0) {
                i4 = -1 + i;
            }
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ufVar3.f164249d |= 1048576;
            ufVar3.f164141av = i4;
        }
        if (!(adVar == null || (adVar.f144533a & 16) == 0)) {
            C54948af afVar3 = adVar.f144536d;
            if (afVar3 == null) {
                afVar3 = C54948af.f144541h;
            }
            C55421x a7 = C55421x.m87686a(afVar3.f144544b);
            if (a7 == null) {
                a7 = C55421x.UNKNOWN_ACTION_TYPE;
            }
            int i5 = a7.f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164093a |= 256;
            ufVar4.f164264s = i5;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        if (paVar == null) {
            return null;
        }
        return (C55349pb) paVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C56143b mo95106b(C66525q qVar, C56146e eVar) {
        byte[] bArr;
        int a;
        int a2;
        if (qVar == null) {
            return null;
        }
        this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_START);
        for (C66521m mVar : qVar.f180933c) {
            if (mVar.f180924d <= 0.5f && (((a = C66523o.m97239a(mVar.f180923c)) == 0 || a != 2) && ((a2 = C66523o.m97239a(mVar.f180923c)) == 0 || a2 != 15))) {
                C56142a aVar = (C56142a) C56143b.f149574d.createBuilder();
                aVar.copyOnWrite();
                C56143b bVar = (C56143b) aVar.instance;
                bVar.f149578c = 206;
                bVar.f149576a |= 2;
                return (C56143b) aVar.build();
            }
        }
        C66524p pVar = (C66524p) qVar.toBuilder();
        boolean z = false;
        for (int i = 0; i < qVar.f180933c.size(); i++) {
            C66521m mVar2 = (C66521m) qVar.f180933c.get(i);
            int a3 = C66523o.m97239a(mVar2.f180923c);
            if (a3 != 0 && a3 == 2 && !mVar2.f180925e.isEmpty()) {
                int codePointAt = mVar2.f180925e.codePointAt(0);
                String upperCase = new String(Character.toChars(codePointAt)).toUpperCase(this.f295371f);
                C66520l lVar = (C66520l) mVar2.toBuilder();
                String concat = upperCase.concat(mVar2.f180925e.substring(Character.charCount(codePointAt)));
                lVar.copyOnWrite();
                C66521m mVar3 = (C66521m) lVar.instance;
                concat.getClass();
                mVar3.f180921a |= 16;
                mVar3.f180925e = concat;
                pVar.copyOnWrite();
                C66525q qVar2 = (C66525q) pVar.instance;
                C66521m mVar4 = (C66521m) lVar.build();
                mVar4.getClass();
                qVar2.mo59669a();
                qVar2.f180933c.set(i, mVar4);
                z = true;
            }
        }
        if (z) {
            qVar = (C66525q) pVar.build();
        }
        try {
            bArr = nativeBuildAction(qVar.toByteArray(), eVar.toByteArray());
        } catch (UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f295366a.mo56225c()).mo56382g(e)).mo56372aa(22467)).mo56389s("Error nativeBuildAction: %s", e);
            bArr = null;
        }
        if (bArr != null) {
            try {
                this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_PARSE_SUCCESS);
                this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_END);
                return (C56143b) C62942bv.parseFrom((C62942bv) C56143b.f149574d, bArr, C62921ba.m95368a());
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) f295366a.mo56225c()).mo56382g(e2)).mo56372aa(22465)).mo56386p("Couldn't parse OfflineActionBuildingResult bytes.");
                this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_PARSE_FAIL);
                this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_END);
                return null;
            }
        } else {
            this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_IS_NULL);
            this.f295374i.mo83702b(C89849ae.OFFLINE_ACTION_BUILD_END);
            return null;
        }
    }
}
