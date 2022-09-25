package com.google.android.apps.gsa.speech.p7295k.p7297b;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.apps.gsa.shared.util.p7159c.C90906bc;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.helper.p7281b.C92307c;
import com.google.android.apps.gsa.speech.helper.p7281b.C92308d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66529a;
import com.google.speech.p5208h.C66591bq;
import com.google.speech.p5208h.C66592br;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66596bv;
import com.google.speech.p5208h.C66597bw;
import com.google.speech.p5208h.C66601c;
import com.google.speech.p5208h.C66614cl;
import com.google.speech.p5208h.C66615cm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.k.b.i */
/* compiled from: PG */
public final class C92452i extends C90880an {

    /* renamed from: a */
    private static final C59071e f257870a = C59071e.m91332i("com.google.android.apps.gsa.speech.k.b.i");

    /* renamed from: b */
    private final C92302a f257871b;

    /* renamed from: c */
    private final C89994f f257872c;

    /* renamed from: d */
    private final String f257873d;

    /* renamed from: e */
    private final C92304b f257874e;

    /* renamed from: f */
    private final String f257875f;

    /* renamed from: g */
    private final List f257876g;

    /* renamed from: h */
    private final C66615cm f257877h;

    /* renamed from: i */
    private final String f257878i;

    /* renamed from: j */
    private final C66595bu f257879j;

    /* renamed from: k */
    private final boolean f257880k;

    /* renamed from: l */
    private final Account f257881l;

    public C92452i(C92454k kVar) {
        super("S3UserInfoBuilderTask", 1, 16);
        this.f257871b = kVar.mo87133b();
        this.f257872c = kVar.mo87132a();
        this.f257874e = (C92304b) kVar.mo87142i().mo56111f();
        this.f257875f = (String) kVar.mo87143j().mo56111f();
        this.f257876g = (List) kVar.mo87135d().mo56111f();
        this.f257877h = (C66615cm) kVar.mo87139g().mo56111f();
        this.f257881l = (Account) kVar.mo87134c().mo56111f();
        this.f257879j = (C66595bu) kVar.mo87138f().mo56111f();
        this.f257880k = ((Boolean) kVar.mo87140h().mo56109e(Boolean.FALSE)).booleanValue();
        this.f257878i = (String) kVar.mo87144k().mo56111f();
        this.f257873d = (String) kVar.mo87136e().mo56109e(Locale.getDefault().toLanguageTag());
    }

    /* renamed from: d */
    public static C90906bc m151929d(C92302a aVar, C89994f fVar, C92304b bVar, String str, List list) {
        C92444a aVar2 = new C92444a();
        aVar2.mo87128d(aVar);
        aVar2.mo87130f(fVar);
        aVar2.f257822c = C58833ax.m90834k(bVar);
        aVar2.f257826g = C58833ax.m90833j(str);
        aVar2.f257827h = C58833ax.m90833j(list);
        aVar2.f257828i = C58833ax.m90834k(false);
        return new C92452i(aVar2.mo87125a());
    }

    /* renamed from: e */
    private static String m151930e(String str) {
        if (str.startsWith("oauth2:")) {
            str = str.substring(7);
        }
        return str.contains(" ") ? str.substring(0, str.indexOf(" ")) : str;
    }

    /* renamed from: f */
    private final List m151931f() {
        String str;
        long V = this.f257872c.mo83859V();
        String str2 = this.f257878i;
        if (str2 == null) {
            str2 = this.f257872c.mo83887ag();
        }
        int i = 0;
        if (this.f257880k) {
            if (this.f257879j != null) {
                ((C59052c) ((C59052c) f257870a.mo56226d()).mo56372aa(12805)).mo56386p("Specifying impersonated users is not allowed when sending multiple auth tokens");
            }
            if (this.f257871b.mo79657D(str2, V) == null) {
                return C58485gu.m89845m();
            }
            Set<C92308d> G = this.f257871b.mo79660G(str2, V);
            if (!G.isEmpty()) {
                List arrayList = new ArrayList();
                C66615cm cmVar = this.f257877h;
                if (cmVar != null) {
                    i = cmVar.f181224b.size();
                    arrayList = this.f257877h.f181224b;
                }
                for (C92308d dVar : G) {
                    String str3 = dVar.f257405b;
                    String str4 = dVar.f257406c;
                    boolean N = this.f257871b.mo79667N(str3);
                    int a = C92307c.m151577a(dVar.f257407d);
                    if (a == 0) {
                        a = 1;
                    }
                    int i2 = a - 1;
                    int i3 = i2 != 1 ? i2 != 2 ? 1 : 3 : 2;
                    C66591bq bqVar = (C66591bq) C66592br.f181140e.createBuilder();
                    String e = m151930e(str2);
                    bqVar.copyOnWrite();
                    C66592br brVar = (C66592br) bqVar.instance;
                    e.getClass();
                    brVar.f181142a |= 4;
                    brVar.f181144c = e;
                    bqVar.copyOnWrite();
                    C66592br brVar2 = (C66592br) bqVar.instance;
                    brVar2.f181142a |= 2;
                    brVar2.f181143b = N;
                    bqVar.copyOnWrite();
                    C66592br brVar3 = (C66592br) bqVar.instance;
                    str4.getClass();
                    brVar3.f181142a |= 8;
                    brVar3.f181145d = str4;
                    if (i3 != 1) {
                        C62940bt btVar = C66601c.f181178d;
                        C66529a aVar = (C66529a) C66601c.f181177c.createBuilder();
                        aVar.copyOnWrite();
                        C66601c cVar = (C66601c) aVar.instance;
                        cVar.f181181b = i3 - 1;
                        cVar.f181180a |= 1;
                        bqVar.mo58885m(btVar, (C66601c) aVar.build());
                    }
                    arrayList.add(i, (C66592br) bqVar.build());
                    i++;
                }
                return C58485gu.m89842j(arrayList);
            }
            ((C59052c) ((C59052c) f257870a.mo56226d()).mo56372aa(12802)).mo56386p("Failed fetching auth.");
            return C58485gu.m89845m();
        }
        Account account = this.f257881l;
        if (account != null) {
            str = this.f257871b.mo79658E(account, str2, V);
        } else {
            str = this.f257871b.mo79657D(str2, V);
        }
        if (str == null) {
            return C58485gu.m89845m();
        }
        C66591bq bqVar2 = (C66591bq) C66592br.f181140e.createBuilder();
        String e2 = m151930e(str2);
        bqVar2.copyOnWrite();
        C66592br brVar4 = (C66592br) bqVar2.instance;
        e2.getClass();
        brVar4.f181142a |= 4;
        brVar4.f181144c = e2;
        bqVar2.copyOnWrite();
        C66592br brVar5 = (C66592br) bqVar2.instance;
        brVar5.f181142a = 2 | brVar5.f181142a;
        brVar5.f181143b = true;
        bqVar2.copyOnWrite();
        C66592br brVar6 = (C66592br) bqVar2.instance;
        brVar6.f181142a |= 8;
        brVar6.f181145d = str;
        C62940bt btVar2 = C66601c.f181178d;
        C66529a aVar2 = (C66529a) C66601c.f181177c.createBuilder();
        aVar2.copyOnWrite();
        C66601c cVar2 = (C66601c) aVar2.instance;
        cVar2.f181181b = 1;
        cVar2.f181180a = 1 | cVar2.f181180a;
        bqVar2.mo58885m(btVar2, (C66601c) aVar2.build());
        return Arrays.asList(new C66592br[]{(C66592br) bqVar2.build()});
    }

    /* renamed from: b */
    public final C66615cm call() {
        int size;
        C66615cm cmVar = this.f257877h;
        if (cmVar == null) {
            C66614cl clVar = (C66614cl) C66615cm.f181220j.createBuilder();
            String ac = this.f257872c.mo83883ac();
            clVar.copyOnWrite();
            C66615cm cmVar2 = (C66615cm) clVar.instance;
            ac.getClass();
            cmVar2.f181223a |= 4;
            cmVar2.f181229g = ac;
            C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
            String str = this.f257873d;
            bvVar.copyOnWrite();
            C66597bw bwVar = (C66597bw) bvVar.instance;
            str.getClass();
            bwVar.f181156a |= 1;
            bwVar.f181157b = str;
            bvVar.copyOnWrite();
            C66597bw bwVar2 = (C66597bw) bvVar.instance;
            bwVar2.f181156a |= 2;
            bwVar2.f181158c = 1;
            clVar.copyOnWrite();
            C66615cm cmVar3 = (C66615cm) clVar.instance;
            C66597bw bwVar3 = (C66597bw) bvVar.build();
            bwVar3.getClass();
            cmVar3.f181228f = bwVar3;
            cmVar3.f181223a |= 2;
            clVar.mo59688b(m151931f());
            C66595bu buVar = this.f257879j;
            if (buVar != null) {
                clVar.mo59690d(buVar);
            }
            C92304b bVar = this.f257874e;
            if (bVar == null || !bVar.mo78322b()) {
                clVar.copyOnWrite();
                C66615cm cmVar4 = (C66615cm) clVar.instance;
                cmVar4.f181223a |= 64;
                cmVar4.f181231i = false;
            } else {
                String a = this.f257874e.mo78321a();
                if (!C58837ba.m90859h(a)) {
                    clVar.copyOnWrite();
                    C66615cm cmVar5 = (C66615cm) clVar.instance;
                    a.getClass();
                    cmVar5.f181223a |= 32;
                    cmVar5.f181230h = a;
                } else {
                    clVar.copyOnWrite();
                    C66615cm cmVar6 = (C66615cm) clVar.instance;
                    cmVar6.f181223a |= 32;
                    cmVar6.f181230h = "w ";
                }
            }
            if (this.f257875f != null) {
                C66596bv bvVar2 = (C66596bv) C66597bw.f181154d.createBuilder();
                String str2 = this.f257875f;
                bvVar2.copyOnWrite();
                C66597bw bwVar4 = (C66597bw) bvVar2.instance;
                str2.getClass();
                bwVar4.f181156a |= 1;
                bwVar4.f181157b = str2;
                bvVar2.copyOnWrite();
                C66597bw bwVar5 = (C66597bw) bvVar2.instance;
                bwVar5.f181156a |= 2;
                bwVar5.f181158c = 1;
                clVar.copyOnWrite();
                C66615cm cmVar7 = (C66615cm) clVar.instance;
                C66597bw bwVar6 = (C66597bw) bvVar2.build();
                bwVar6.getClass();
                cmVar7.f181226d = bwVar6;
                cmVar7.f181223a |= 1;
            }
            List list = this.f257876g;
            if (list != null && (size = list.size()) > 0) {
                for (int i = 0; i < size; i++) {
                    C66596bv bvVar3 = (C66596bv) C66597bw.f181154d.createBuilder();
                    String str3 = (String) this.f257876g.get(i);
                    bvVar3.copyOnWrite();
                    C66597bw bwVar7 = (C66597bw) bvVar3.instance;
                    str3.getClass();
                    bwVar7.f181156a |= 1;
                    bwVar7.f181157b = str3;
                    bvVar3.copyOnWrite();
                    C66597bw bwVar8 = (C66597bw) bvVar3.instance;
                    bwVar8.f181156a |= 2;
                    bwVar8.f181158c = 1;
                    clVar.copyOnWrite();
                    C66615cm cmVar8 = (C66615cm) clVar.instance;
                    C66597bw bwVar9 = (C66597bw) bvVar3.build();
                    bwVar9.getClass();
                    cmVar8.mo59692b();
                    cmVar8.f181227e.add(bwVar9);
                }
            }
            return (C66615cm) clVar.build();
        }
        for (C66592br brVar : cmVar.f181224b) {
            this.f257871b.mo79665L(brVar.f181145d);
        }
        C66614cl clVar2 = (C66614cl) this.f257877h.toBuilder();
        clVar2.copyOnWrite();
        ((C66615cm) clVar2.instance).f181224b = C66615cm.emptyProtobufList();
        clVar2.mo59688b(m151931f());
        if (this.f257879j != null) {
            clVar2.copyOnWrite();
            ((C66615cm) clVar2.instance).f181225c = C66615cm.emptyProtobufList();
            clVar2.mo59690d(this.f257879j);
        }
        return (C66615cm) clVar2.build();
    }
}
