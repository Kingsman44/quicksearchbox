package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.C90600q;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51540lm;
import com.google.assistant.p3897e.p3917i.p3918a.C51541ln;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d */
/* compiled from: PG */
public final class C102831d implements C90600q {

    /* renamed from: b */
    private static final C59071e f287139b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.d");

    /* renamed from: a */
    final C68214a f287140a;

    /* renamed from: c */
    private final C86794i f287141c;

    /* renamed from: d */
    private final C89331a f287142d;

    /* renamed from: e */
    private final C68214a f287143e;

    /* renamed from: f */
    private final SharedPreferences f287144f;

    public C102831d(C86794i iVar, C89331a aVar, C68214a aVar2, SharedPreferences sharedPreferences, C68214a aVar3) {
        this.f287141c = iVar;
        this.f287142d = aVar;
        this.f287143e = aVar2;
        this.f287144f = sharedPreferences;
        this.f287140a = aVar3;
    }

    /* renamed from: a */
    public final void mo84741a(C51541ln lnVar, C51195j jVar) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        if ((jVar.f133266a & 32768) != 0) {
            int length = jVar.f133277l.length();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160062a |= 64;
            cbVar.f160130k = length;
        } else {
            C59104x d = f287139b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MDHotwordTriggerLogger");
            ((C59052c) ((C59052c) d).mo56372aa(21044)).mo56386p("Context containing serverHotwordInfo does not contain AssistantResponse object; logs cannot obtain any metadata about respective query.");
        }
        int a = C51540lm.m86213a(lnVar.f134333b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.HOTWORD_VERIFIED_BY_SERVER;
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f287140a.mo27525b()).mo74236a(fVar.mo83699a());
        } else if (i != 2) {
            C59104x b = f287139b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MDHotwordTriggerLogger");
            ((C59052c) ((C59052c) b).mo56372aa(21045)).mo56386p("S3 did not contain any hotword results, indicating either a lack of hotword preamble or an unactionable preamble format (e.g. non-seamless).");
        } else {
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.HOTWORD_REJECTED_BY_SERVER;
            fVar2.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f287140a.mo27525b()).mo74236a(fVar2.mo83699a());
        }
    }

    /* renamed from: b */
    public final void mo84742b(amo amo, String str, int i, Query query, HotwordResult hotwordResult, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        boolean z4;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164075I = i2;
        ufVar2.f164146b |= 4096;
        amo b = C89949q.m146518b(amo, query.mo84337bV(), query.mo84412cs(), this.f287141c.mo80452c());
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164070D = b.f159234au;
        ufVar3.f164146b |= 8;
        String b2 = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        b2.getClass();
        ufVar4.f164093a |= 4;
        ufVar4.f164259n = b2;
        boolean bV = query.mo84337bV();
        tzVar.copyOnWrite();
        C60555uf ufVar5 = (C60555uf) tzVar.instance;
        ufVar5.f164146b |= C89885b.S3REQUEST_VALUE;
        ufVar5.f164079M = bV;
        C89331a aVar = this.f287142d;
        synchronized (aVar.f242191a) {
            i3 = aVar.f242193c;
        }
        boolean z5 = false;
        if (C89331a.m145281b(i3)) {
            C89331a aVar2 = this.f287142d;
            synchronized (aVar2.f242191a) {
                z4 = aVar2.f242194d;
            }
            if (!z4 && C89257aa.m145197o(this.f287144f)) {
                z5 = true;
            }
        }
        tzVar.copyOnWrite();
        C60555uf ufVar6 = (C60555uf) tzVar.instance;
        ufVar6.f164146b |= 134217728;
        ufVar6.f164087U = z5;
        if (hotwordResult == null) {
            C59104x d = f287139b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MDHotwordTriggerLogger");
            ((C59052c) ((C59052c) d).mo56372aa(21043)).mo56386p("hotwordResult is null!");
            int i4 = C90755l.f253831a;
            return;
        }
        float d2 = hotwordResult.mo84684d();
        tzVar.copyOnWrite();
        C60555uf ufVar7 = (C60555uf) tzVar.instance;
        ufVar7.f164146b |= 33554432;
        ufVar7.f164085S = d2;
        float c = hotwordResult.mo84683c();
        tzVar.copyOnWrite();
        C60555uf ufVar8 = (C60555uf) tzVar.instance;
        ufVar8.f164146b |= 16777216;
        ufVar8.f164084R = c;
        boolean C = hotwordResult.mo84678C();
        tzVar.copyOnWrite();
        C60555uf ufVar9 = (C60555uf) tzVar.instance;
        ufVar9.f164146b |= 67108864;
        ufVar9.f164086T = C;
        tzVar.copyOnWrite();
        C60555uf ufVar10 = (C60555uf) tzVar.instance;
        ufVar10.f164146b |= 268435456;
        ufVar10.f164088V = z;
        tzVar.copyOnWrite();
        C60555uf ufVar11 = (C60555uf) tzVar.instance;
        ufVar11.f164146b |= 536870912;
        ufVar11.f164089W = z2;
        tzVar.copyOnWrite();
        C60555uf ufVar12 = (C60555uf) tzVar.instance;
        ufVar12.f164146b |= 1073741824;
        ufVar12.f164090X = z3;
        if (str != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar13 = (C60555uf) tzVar.instance;
            ufVar13.f164199c |= 2;
            ufVar13.f164120aa = str;
        }
        String x = hotwordResult.mo84707x();
        if (x != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar14 = (C60555uf) tzVar.instance;
            ufVar14.f164146b |= 8388608;
            ufVar14.f164083Q = x;
        }
        int e = ((C118843f) this.f287143e.mo27525b()).mo71744e();
        tzVar.copyOnWrite();
        C60555uf ufVar15 = (C60555uf) tzVar.instance;
        ufVar15.f164199c |= 32;
        ufVar15.f164122ac = e;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
