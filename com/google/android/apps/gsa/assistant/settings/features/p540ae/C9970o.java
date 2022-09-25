package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a.C9861b;
import com.google.android.apps.gsa.assistant.settings.shared.e.b;
import com.google.android.apps.gsa.assistant.settings.shared.e.c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46751h;
import com.google.apps.tiktok.dataservice.p3638c.C46752i;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import p3186j$.util.Objects;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.o */
/* compiled from: PG */
public final class C9970o {

    /* renamed from: a */
    public static final C59071e f34142a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ae.o");

    /* renamed from: b */
    public final C9964i f34143b;

    /* renamed from: c */
    public final c f34144c;

    /* renamed from: d */
    public final C9861b f34145d;

    /* renamed from: e */
    public final C46801dp f34146e;

    /* renamed from: f */
    public final C9969n f34147f = new C9969n();

    /* renamed from: g */
    public final C9911ax f34148g;

    /* renamed from: h */
    public final C46755l f34149h;

    /* renamed from: i */
    public final C9941bx f34150i;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.o$a */
    /* compiled from: PG */
    final class C9971a implements C46792di {

        /* renamed from: a */
        private final C9970o f34151a;

        /* renamed from: b */
        private final b f34152b;

        public C9971a(C9970o oVar, b bVar) {
            this.f34151a = oVar;
            this.f34152b = bVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) C9970o.f34142a.mo56224b()).mo56372aa(947)).mo56386p("#onError");
            this.f34152b.b(1);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            ((C59052c) ((C59052c) C9970o.f34142a.mo56224b()).mo56372aa(948)).mo56386p("#onNewData");
            C9941bx bxVar = this.f34151a.f34150i;
            C50282rh rhVar = ((act) obj).f128876C;
            if (rhVar == null) {
                rhVar = C50282rh.f130762c;
            }
            C62971cq cqVar = rhVar.f130764a;
            int size = cqVar.size();
            if (bxVar.f34068b == null || bxVar.f34069c != size) {
                bxVar.f34069c = size;
                C46755l lVar = bxVar.f34067a;
                int i = size + size;
                C58838bb.m90868c(i > 0);
                bxVar.f34068b = new C46751h(lVar, i);
                long j = (long) size;
                IntStream limit = IntStream.CC.iterate(0, C9937bt.f34062a).limit(j);
                C46751h hVar = bxVar.f34068b;
                Objects.requireNonNull(hVar);
                bxVar.f34070d = (C58485gu) limit.mapToObj(new C9938bu(hVar)).collect(C58370cn.f155946a);
                IntStream limit2 = IntStream.CC.iterate(1, C9939bv.f34064a).limit(j);
                C46751h hVar2 = bxVar.f34068b;
                Objects.requireNonNull(hVar2);
                bxVar.f34071e = (C58485gu) limit2.mapToObj(new C9938bu(hVar2)).collect(C58370cn.f155946a);
            }
            IntStream.CC.range(0, size).forEach(new C9940bw(bxVar, cqVar));
            this.f34152b.b(0);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C9970o(C9964i iVar, c cVar, C9861b bVar, C46801dp dpVar, C9912ay ayVar, C86124t tVar) {
        C58838bb.m90868c(tVar.mo79746e(C90059dk.f249057aT));
        this.f34143b = iVar;
        this.f34144c = cVar;
        this.f34145d = bVar;
        this.f34146e = dpVar;
        this.f34148g = ayVar.mo18115a("settings_main_page_categorized");
        C46753j jVar = new C46753j();
        jVar.f122102a = new C9965j(this);
        jVar.mo50771b(C9966k.f34139a);
        jVar.f122103b = new C46752i();
        C46755l a = jVar.mo50770a();
        this.f34149h = a;
        int i = C9967l.f34140a;
        this.f34150i = new C9941bx(a);
    }
}
