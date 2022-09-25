package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bt */
/* compiled from: PG */
final class C113804bt implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f315176a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f315177b;

    /* renamed from: c */
    final /* synthetic */ String f315178c;

    /* renamed from: d */
    final /* synthetic */ C113805bu f315179d;

    public C113804bt(C113805bu buVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f315179d = buVar;
        this.f315176a = cxVar;
        this.f315177b = cxVar2;
        this.f315178c = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (((Boolean) C60856cj.m92909r(this.f315176a)).booleanValue() && ((Boolean) C60856cj.m92909r(this.f315177b)).booleanValue()) {
            ((C89859i) this.f315179d.f315188i.mo27525b()).mo83702b(C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_SHOWN);
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String str = this.f315178c;
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160062a |= 256;
            cbVar.f160132m = str;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_TIMEOUT;
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f315179d.f315188i.mo27525b()).mo74236a(fVar.mo83699a());
            ((C106391p) this.f315179d.f315187h.mo27525b()).mo95494c(this.f315178c);
        }
        return true;
    }
}
