package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c;

import androidx.media.C2449z;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14047i;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b.C14016a;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16979c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16981e;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16983g;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16984h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16993q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g */
/* compiled from: PG */
public final class C14035g implements C14047i {

    /* renamed from: a */
    public static final C59071e f42652a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g");

    /* renamed from: b */
    public final Executor f42653b;

    /* renamed from: c */
    public final C14016a f42654c;

    /* renamed from: d */
    public final C21370a f42655d;

    /* renamed from: e */
    public final C69464a f42656e;

    /* renamed from: f */
    private final C42876ab f42657f;

    /* renamed from: g */
    private final C16941d f42658g;

    public C14035g(C16941d dVar, C14016a aVar, C42876ab abVar, C21370a aVar2, C69464a aVar3, Executor executor) {
        this.f42658g = dVar;
        this.f42657f = abVar;
        this.f42656e = aVar3;
        this.f42653b = executor;
        this.f42654c = aVar;
        this.f42655d = aVar2;
    }

    /* renamed from: a */
    public final void mo21389a(C2449z zVar) {
        C60870cx d = this.f42657f.mo46042d();
        C14034f fVar = new C14034f(this, zVar);
        C60856cj.m92911t(d, C47810es.m84974n(fVar), this.f42653b);
    }

    /* renamed from: b */
    public final C58485gu mo21390b(C52176ia iaVar) {
        C16941d dVar = this.f42658g;
        C16983g gVar = (C16983g) C16984h.f49615b.createBuilder();
        for (C52174hz hzVar : iaVar.f136914b) {
            C16979c cVar = (C16979c) C16980d.f49601e.createBuilder();
            String str = hzVar.f136895b;
            cVar.copyOnWrite();
            str.getClass();
            ((C16980d) cVar.instance).f49603a = str;
            C16981e eVar = (C16981e) C16982f.f49608e.createBuilder();
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            String str2 = woVar.f137998e;
            eVar.copyOnWrite();
            str2.getClass();
            ((C16982f) eVar.instance).f49610a = str2;
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            String str3 = woVar2.f138002i;
            eVar.copyOnWrite();
            str3.getClass();
            ((C16982f) eVar.instance).f49612c = str3;
            C52568wo woVar3 = hzVar.f136897d;
            if (woVar3 == null) {
                woVar3 = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar3.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            eVar.copyOnWrite();
            dcVar.getClass();
            ((C16982f) eVar.instance).f49613d = dcVar;
            C16982f fVar = (C16982f) eVar.build();
            cVar.copyOnWrite();
            fVar.getClass();
            ((C16980d) cVar.instance).f49604b = fVar;
            gVar.mo23168a(cVar);
        }
        int a = C16993q.m34086a(dVar.mo23092b((C16984h) gVar.build()).f49621a);
        if (a != 0 && a == 3) {
            C59104x d = f42652a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NewsBrowserCntPrvdr");
            ((C59052c) ((C59052c) d).mo56372aa(45304)).mo56386p("Amp preload is not successful.");
        }
        return (C58485gu) Collection.EL.stream(iaVar.f136914b).map(C14030b.f42646a).filter(C14031c.f42647a).map(C14032d.f42648a).collect(C58370cn.f155946a);
    }
}
