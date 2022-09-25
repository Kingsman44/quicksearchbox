package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hv */
/* compiled from: PG */
final class C109257hv {

    /* renamed from: a */
    public final List f304223a;

    /* renamed from: b */
    private final C68214a f304224b;

    /* renamed from: c */
    private final long f304225c;

    /* renamed from: d */
    private final C21370a f304226d;

    public C109257hv(C68214a aVar, List list, long j, C21370a aVar2) {
        this.f304224b = aVar;
        this.f304223a = list;
        this.f304225c = j;
        this.f304226d = aVar2;
    }

    /* renamed from: a */
    public final void mo97712a() {
        long j;
        List<C60870cx> list = this.f304223a;
        C21370a aVar = this.f304226d;
        if (list == null || list.isEmpty()) {
            j = aVar.mo26872d();
        } else {
            try {
                j = 0;
                for (C60870cx f : list) {
                    j = Math.max(j, ((C19744c) C90877ak.m148472f(f)).f54848a);
                }
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C109258hw.f304227a.mo56225c()).mo56382g(e)).mo56372aa(22744)).mo56386p("#getMaxTimeReadyInfo");
                j = aVar.mo26872d();
            }
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_IMAGES_LOADED;
        fVar.mo83701c("rId", Long.toString(this.f304225c));
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String b = C39191a.m68623b(this.f304225c);
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        b.getClass();
        cbVar.f160062a |= 4;
        cbVar.f160127h = b;
        fVar.f246203c = (C59687cb) ajVar.build();
        fVar.f246204d = j;
        ((C89859i) this.f304224b.mo27525b()).mo74236a(fVar.mo83699a());
    }
}
