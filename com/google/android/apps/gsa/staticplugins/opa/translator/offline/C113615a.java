package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3897e.p3921j.p3925d.C51775a;
import com.google.assistant.p3897e.p3921j.p3925d.C51776b;
import com.google.assistant.p3897e.p3921j.p3925d.C51777c;
import com.google.assistant.p3897e.p3921j.p3925d.C51778d;
import com.google.assistant.p3897e.p3921j.p3925d.C51779e;
import com.google.assistant.p3897e.p3921j.p3925d.C51780f;
import com.google.assistant.p3897e.p3921j.p3925d.C51781g;
import com.google.assistant.p3897e.p3921j.p3925d.C51782h;
import com.google.assistant.p3897e.p3921j.p3926e.C51905dl;
import com.google.assistant.p3897e.p3921j.p3926e.C51908do;
import com.google.assistant.p3897e.p3921j.p3926e.C51909dp;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.a */
/* compiled from: PG */
public final class C113615a {
    /* renamed from: a */
    public static C51910dq m188105a(String str, String str2, String str3, String str4, String str5, boolean z) {
        C51775a aVar = (C51775a) C51776b.f135842e.createBuilder();
        C51779e b = m188106b(str3);
        aVar.copyOnWrite();
        C51776b bVar = (C51776b) aVar.instance;
        C51780f fVar = (C51780f) b.build();
        fVar.getClass();
        bVar.f135845b = fVar;
        bVar.f135844a |= 1;
        C51779e b2 = m188106b(str4);
        aVar.copyOnWrite();
        C51776b bVar2 = (C51776b) aVar.instance;
        C51780f fVar2 = (C51780f) b2.build();
        fVar2.getClass();
        bVar2.f135846c = fVar2;
        bVar2.f135844a |= 2;
        C51776b bVar3 = (C51776b) aVar.build();
        C51905dl dlVar = (C51905dl) C51910dq.f136159t.createBuilder();
        dlVar.copyOnWrite();
        C51910dq dqVar = (C51910dq) dlVar.instance;
        str3.getClass();
        dqVar.f136161a |= 2;
        dqVar.f136163c = str3;
        dlVar.copyOnWrite();
        C51910dq dqVar2 = (C51910dq) dlVar.instance;
        str4.getClass();
        dqVar2.f136161a |= 4;
        dqVar2.f136164d = str4;
        dlVar.copyOnWrite();
        C51910dq dqVar3 = (C51910dq) dlVar.instance;
        bVar3.getClass();
        dqVar3.f136165e = bVar3;
        dqVar3.f136161a |= 32;
        dlVar.copyOnWrite();
        C51910dq dqVar4 = (C51910dq) dlVar.instance;
        str5.getClass();
        dqVar4.f136161a |= 1;
        dqVar4.f136162b = str5;
        dlVar.copyOnWrite();
        C51910dq dqVar5 = (C51910dq) dlVar.instance;
        dqVar5.f136161a |= 524288;
        dqVar5.f136176p = true;
        if (!(str == null || str2 == null)) {
            dlVar.copyOnWrite();
            C51910dq dqVar6 = (C51910dq) dlVar.instance;
            dqVar6.f136161a |= 64;
            dqVar6.f136166f = str;
            dlVar.copyOnWrite();
            C51910dq dqVar7 = (C51910dq) dlVar.instance;
            dqVar7.f136161a |= 128;
            dqVar7.f136167g = str2;
            dlVar.copyOnWrite();
            C51910dq dqVar8 = (C51910dq) dlVar.instance;
            dqVar8.f136161a |= 256;
            dqVar8.f136168h = z;
            C51908do doVar = (C51908do) C51909dp.f136155c.createBuilder();
            doVar.copyOnWrite();
            C51909dp dpVar = (C51909dp) doVar.instance;
            dpVar.f136157a |= 1;
            dpVar.f136158b = str;
            dlVar.copyOnWrite();
            C51910dq dqVar9 = (C51910dq) dlVar.instance;
            C51909dp dpVar2 = (C51909dp) doVar.build();
            dpVar2.getClass();
            dqVar9.f136173m = dpVar2;
            dqVar9.f136161a |= 65536;
            C51908do doVar2 = (C51908do) C51909dp.f136155c.createBuilder();
            doVar2.copyOnWrite();
            C51909dp dpVar3 = (C51909dp) doVar2.instance;
            dpVar3.f136157a |= 1;
            dpVar3.f136158b = str2;
            dlVar.copyOnWrite();
            C51910dq dqVar10 = (C51910dq) dlVar.instance;
            C51909dp dpVar4 = (C51909dp) doVar2.build();
            dpVar4.getClass();
            dqVar10.f136174n = dpVar4;
            dqVar10.f136161a |= C89885b.S3REQUEST_VALUE;
        }
        return (C51910dq) dlVar.build();
    }

    /* renamed from: b */
    private static C51779e m188106b(String str) {
        String language = Locale.forLanguageTag(str).getLanguage();
        Locale locale = new Locale(language);
        C51779e eVar = (C51779e) C51780f.f135862d.createBuilder();
        C51782h c = m188107c(locale.getDisplayName(locale));
        eVar.copyOnWrite();
        C51780f fVar = (C51780f) eVar.instance;
        c.getClass();
        fVar.f135865b = c;
        fVar.f135864a |= 1;
        C51777c cVar = (C51777c) C51778d.f135848m.createBuilder();
        C51782h c2 = m188107c((String) C113630i.f314649b.get(language));
        cVar.copyOnWrite();
        C51778d dVar = (C51778d) cVar.instance;
        c2.getClass();
        dVar.f135851b = c2;
        dVar.f135850a |= 1;
        C51782h c3 = m188107c((String) C113630i.f314650c.get(language));
        cVar.copyOnWrite();
        C51778d dVar2 = (C51778d) cVar.instance;
        c3.getClass();
        dVar2.f135852c = c3;
        dVar2.f135850a |= 2;
        C51782h c4 = m188107c((String) C113630i.f314651d.get(language));
        cVar.copyOnWrite();
        C51778d dVar3 = (C51778d) cVar.instance;
        c4.getClass();
        dVar3.f135853d = c4;
        dVar3.f135850a |= 4;
        C51782h c5 = m188107c((String) C113630i.f314652e.get(language));
        cVar.copyOnWrite();
        C51778d dVar4 = (C51778d) cVar.instance;
        c5.getClass();
        dVar4.f135854e = c5;
        dVar4.f135850a |= 8;
        C51782h c6 = m188107c((String) C113630i.f314653f.get(language));
        cVar.copyOnWrite();
        C51778d dVar5 = (C51778d) cVar.instance;
        c6.getClass();
        dVar5.f135855f = c6;
        dVar5.f135850a |= 16;
        C51782h c7 = m188107c((String) C113630i.f314654g.get(language));
        cVar.copyOnWrite();
        C51778d dVar6 = (C51778d) cVar.instance;
        c7.getClass();
        dVar6.f135856g = c7;
        dVar6.f135850a |= 32;
        C51782h c8 = m188107c((String) C113630i.f314655h.get(language));
        cVar.copyOnWrite();
        C51778d dVar7 = (C51778d) cVar.instance;
        c8.getClass();
        dVar7.f135857h = c8;
        dVar7.f135850a |= 64;
        C51782h c9 = m188107c((String) C113630i.f314656i.get(language));
        cVar.copyOnWrite();
        C51778d dVar8 = (C51778d) cVar.instance;
        c9.getClass();
        dVar8.f135858i = c9;
        dVar8.f135850a |= 128;
        C51782h c10 = m188107c((String) C113630i.f314657j.get(language));
        cVar.copyOnWrite();
        C51778d dVar9 = (C51778d) cVar.instance;
        c10.getClass();
        dVar9.f135859j = c10;
        dVar9.f135850a |= 256;
        C51782h c11 = m188107c((String) C113630i.f314658k.get(language));
        cVar.copyOnWrite();
        C51778d dVar10 = (C51778d) cVar.instance;
        c11.getClass();
        dVar10.f135860k = c11;
        dVar10.f135850a |= 512;
        C51782h c12 = m188107c((String) C113630i.f314659l.get(language));
        cVar.copyOnWrite();
        C51778d dVar11 = (C51778d) cVar.instance;
        c12.getClass();
        dVar11.f135861l = c12;
        dVar11.f135850a |= 1024;
        eVar.copyOnWrite();
        C51780f fVar2 = (C51780f) eVar.instance;
        C51778d dVar12 = (C51778d) cVar.build();
        dVar12.getClass();
        fVar2.f135866c = dVar12;
        fVar2.f135864a |= 8;
        return eVar;
    }

    /* renamed from: c */
    private static C51782h m188107c(String str) {
        C51781g gVar = (C51781g) C51782h.f135867c.createBuilder();
        str.getClass();
        gVar.copyOnWrite();
        C51782h hVar = (C51782h) gVar.instance;
        hVar.f135869a |= 4;
        hVar.f135870b = str;
        return (C51782h) gVar.build();
    }
}
