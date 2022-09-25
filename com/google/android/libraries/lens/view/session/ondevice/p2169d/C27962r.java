package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.android.libraries.lens.common.text.C24140p;
import com.google.android.libraries.lens.common.text.C24141q;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27942p;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4695b.C62155a;
import com.google.lens.p4695b.C62156b;
import com.google.lens.p4695b.C62157c;
import com.google.lens.p4695b.C62158d;
import com.google.p4017at.p4056g.p4057a.p4058a.C54039ct;
import com.google.p4017at.p4056g.p4057a.p4058a.C54040cu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.r */
/* compiled from: PG */
public final class C27962r implements C27965u {

    /* renamed from: b */
    public static final /* synthetic */ int f76122b = 0;

    /* renamed from: c */
    private static final C58974d f76123c = C58974d.m91135i("ServerTranslationProviderImpl");

    /* renamed from: a */
    public final C37215b f76124a;

    /* renamed from: d */
    private final C24105b f76125d;

    /* renamed from: e */
    private final Executor f76126e;

    public C27962r(C24105b bVar, Executor executor, C37215b bVar2) {
        this.f76125d = bVar;
        this.f76126e = executor;
        this.f76124a = bVar2;
    }

    /* renamed from: a */
    public final C60870cx mo33423a(String str, String str2, C27966v vVar) {
        ((C58970a) ((C58970a) f76123c.mo56224b()).mo56372aa(50124)).mo56354G("server translation request %s to %s", str, str2);
        C62156b bVar = (C62156b) C62157c.f167793d.createBuilder();
        bVar.copyOnWrite();
        C62157c cVar = (C62157c) bVar.instance;
        str.getClass();
        cVar.f167795a |= 1;
        cVar.f167796b = str;
        bVar.copyOnWrite();
        C62157c cVar2 = (C62157c) bVar.instance;
        str2.getClass();
        cVar2.f167795a |= 2;
        cVar2.f167797c = str2;
        C62157c cVar3 = (C62157c) bVar.build();
        C54039ct ctVar = (C54039ct) C54040cu.f141789d.createBuilder();
        C27946b bVar2 = (C27946b) vVar;
        C56244ay ayVar = bVar2.f76101a;
        ctVar.copyOnWrite();
        C54040cu cuVar = (C54040cu) ctVar.instance;
        cuVar.f141792b = ayVar;
        cuVar.f141791a |= 1;
        C58485gu guVar = bVar2.f76102b;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C27942p pVar = (C27942p) guVar.get(i2);
            String a = C24140p.m44838a(C24141q.m44842d(Locale.forLanguageTag(str)), (List) Collection.EL.stream(pVar.mo33400b()).map(C27960p.f76120a).collect(C58370cn.f155946a));
            C62155a aVar = (C62155a) C62158d.f167798e.createBuilder();
            String d = pVar.mo33402d();
            aVar.copyOnWrite();
            C62158d dVar = (C62158d) aVar.instance;
            d.getClass();
            dVar.f167800a |= 1;
            dVar.f167801b = d;
            aVar.copyOnWrite();
            C62158d dVar2 = (C62158d) aVar.instance;
            dVar2.f167800a |= 2;
            dVar2.f167802c = a;
            aVar.copyOnWrite();
            C62158d dVar3 = (C62158d) aVar.instance;
            cVar3.getClass();
            dVar3.f167803d = cVar3;
            dVar3.f167800a |= 4;
            ctVar.mo54060a((C62158d) aVar.build());
        }
        this.f76124a.mo19974a(C37194a.f98589ct);
        C60870cx c = this.f76125d.mo29500c((C54040cu) ctVar.build());
        C60856cj.m92911t(c, C47810es.m84974n(new C27961q(this)), this.f76126e);
        return C60922j.m93045h(c, C47810es.m84966f(C27959o.f76119a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo33424b(String str, String str2) {
    }

    /* renamed from: c */
    public final void mo33425c() {
        this.f76125d.mo29501d();
    }

    /* renamed from: d */
    public final void mo33426d() {
        this.f76125d.mo29502e();
    }

    /* renamed from: e */
    public final boolean mo33427e(String... strArr) {
        return true;
    }

    /* renamed from: f */
    public final boolean mo33428f() {
        return true;
    }
}
