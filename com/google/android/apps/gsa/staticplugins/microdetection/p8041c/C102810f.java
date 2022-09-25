package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import android.webkit.URLUtil;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92351a;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28713as;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.f */
/* compiled from: PG */
public final class C102810f implements C28746bx {

    /* renamed from: a */
    public static final C58974d f287072a = C58974d.m91134h("HotwordModelPopulator");

    /* renamed from: f */
    private static final C58485gu f287073f = C58485gu.m89849q(C118569b.HOTWORD_MODEL_MDD_ADD_PENDING, C118569b.HOTWORD_MODEL_MDD_ADD_FAILED, C118569b.HOTWORD_MODEL_MDD_ADD_ALREADY_DOWNLOADED, C118569b.HOTWORD_MODEL_MDD_ADD_LOST);

    /* renamed from: b */
    public final C68214a f287074b;

    /* renamed from: c */
    public final C68214a f287075c;

    /* renamed from: d */
    public final C60887da f287076d;

    /* renamed from: e */
    public final C68214a f287077e;

    /* renamed from: g */
    private final C68214a f287078g;

    /* renamed from: h */
    private final C68214a f287079h;

    /* renamed from: i */
    private final C68214a f287080i;

    /* renamed from: j */
    private final C60888db f287081j;

    /* renamed from: k */
    private final C91123v f287082k;

    public C102810f(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C60888db dbVar, C60887da daVar, C91123v vVar, C68214a aVar6) {
        this.f287078g = aVar;
        this.f287079h = aVar2;
        this.f287080i = aVar3;
        this.f287074b = aVar4;
        this.f287075c = aVar5;
        this.f287081j = dbVar;
        this.f287076d = daVar;
        this.f287082k = vVar;
        this.f287077e = aVar6;
    }

    /* renamed from: c */
    private final C60870cx m170501c(String str, C90584f fVar, Map map, C29409fd fdVar) {
        String str2 = (String) C92354c.f257487a.getOrDefault(str, str);
        if (!str2.equals(str)) {
            ((C58970a) ((C58970a) f287072a.mo56224b()).mo56372aa(21176)).mo56354G("Changing locale %s to %s for hotword model download.", str, str2);
        }
        C90580b bVar = (C90580b) map.get(str2);
        if (bVar == null) {
            ((C58970a) ((C58970a) f287072a.mo56225c()).mo56372aa(21175)).mo56354G("HotwordLocaleConfig does not exist for model %s, type %s! This model will not be downloaded or updated; please ensure that hotword config flags contain URLs for all supported assistant locales.", str2, fVar.name());
            return C60856cj.m92900i(false);
        }
        String str3 = bVar.f253241c;
        if (!URLUtil.isValidUrl(str3)) {
            ((C58970a) ((C58970a) f287072a.mo56225c()).mo56372aa(21174)).mo56359L("HotwordLocaleConfig does not have a valid URL for model %s, type %s: %s! This model will not be downloaded or updated", str2, fVar.name(), str3);
            return C60856cj.m92900i(false);
        }
        String c = C92354c.m151657c(str2, fVar);
        ((C58970a) ((C58970a) f287072a.mo56224b()).mo56372aa(21173)).mo56359L("#updateHotwordFileGroup group name: %s, raw locale: %s, locale: %s", c, str, str2);
        C28707am amVar = (C28707am) C28708an.f77994l.createBuilder();
        amVar.copyOnWrite();
        C28708an anVar = (C28708an) amVar.instance;
        c.getClass();
        anVar.f77996a |= 1;
        anVar.f77997b = c;
        C28713as asVar = (C28713as) C28716av.f78018d.createBuilder();
        asVar.copyOnWrite();
        C28716av avVar = (C28716av) asVar.instance;
        avVar.f78022c = 1;
        avVar.f78020a |= 2;
        asVar.copyOnWrite();
        C28716av avVar2 = (C28716av) asVar.instance;
        avVar2.f78021b = 2;
        avVar2.f78020a |= 1;
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        C28716av avVar3 = (C28716av) asVar.build();
        avVar3.getClass();
        anVar2.f78002g = avVar3;
        anVar2.f77996a |= 1024;
        C28703ai aiVar = (C28703ai) C28706al.f77976q.createBuilder();
        aiVar.copyOnWrite();
        C28706al alVar = (C28706al) aiVar.instance;
        alVar.f77978a |= 1;
        alVar.f77979b = "hotword.data";
        aiVar.copyOnWrite();
        C28706al alVar2 = (C28706al) aiVar.instance;
        str3.getClass();
        alVar2.f77978a |= 2;
        alVar2.f77980c = str3;
        aiVar.copyOnWrite();
        C28706al alVar3 = (C28706al) aiVar.instance;
        alVar3.f77982e = 1;
        alVar3.f77978a |= 8;
        amVar.mo34328b(aiVar);
        amVar.copyOnWrite();
        C28708an anVar3 = (C28708an) amVar.instance;
        anVar3.f77996a |= 256;
        anVar3.f78001f = 86400;
        C28708an anVar4 = (C28708an) amVar.build();
        C29343e eVar = new C29343e();
        eVar.mo34326b(anVar4);
        C60870cx a = fdVar.mo34712a(eVar.mo34325a());
        String str4 = anVar4.f77997b;
        C60856cj.m92911t(C60922j.m93045h(C60838bs.m92859i(a), new C102807c(fdVar, str4), this.f287076d), new C102809e(this, str4, ((C28706al) anVar4.f78003h.get(0)).f77980c, fdVar), this.f287081j);
        return a;
    }

    /* renamed from: a */
    public final void mo93462a(C118569b bVar) {
        C58485gu guVar = f287073f;
        if (!guVar.contains(bVar)) {
            ((C58970a) ((C58970a) f287072a.mo56226d()).mo56372aa(21177)).mo56387q("Metric type %s is not recognized by MDD model updates! Is this metric correct?", bVar.f329776ks);
        }
        Collection.EL.stream(guVar).forEach(new C102805a(this, bVar));
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        if (!((C86124t) this.f287074b.mo27525b()).mo79746e(C90082eg.f250020cd) && !((C86124t) this.f287074b.mo27525b()).mo79746e(C90082eg.f250021ce)) {
            return C60866ct.f164955a;
        }
        if (this.f287082k.mo85392d()) {
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        String Z = ((C89994f) this.f287080i.mo27525b()).mo83863Z();
        C90584f p = ((C89994f) this.f287080i.mo27525b()).mo83827p();
        arrayList.add(m170501c(Z, p, ((C92351a) this.f287078g.mo27525b()).mo87000b(p, C58833ax.m90834k(true)), fdVar));
        if (((C89994f) this.f287080i.mo27525b()).mo83834w()) {
            arrayList.add(m170501c(Z, C90584f.OK_HEY_GOOGLE, ((C92351a) this.f287078g.mo27525b()).mo87000b(C90584f.OK_HEY_GOOGLE, C58833ax.m90834k(true)), fdVar));
        }
        String b = ((C92371d) this.f287079h.mo27525b()).mo87021b();
        C90584f q = ((C89994f) this.f287080i.mo27525b()).mo83828q();
        arrayList.add(m170501c(b, q, ((C92351a) this.f287078g.mo27525b()).mo87000b(q, C58833ax.m90834k(true)), fdVar));
        return C47638k.m84750a(arrayList).mo51520a(C102806b.f287064a, C60826bg.f164896a);
    }
}
