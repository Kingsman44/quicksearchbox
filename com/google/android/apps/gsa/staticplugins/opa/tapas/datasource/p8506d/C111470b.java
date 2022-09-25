package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8506d;

import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.d.a;
import com.google.android.apps.gsa.assistant.shared.p5810d.C73853f;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109399b;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109422u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.d.b */
/* compiled from: PG */
public final /* synthetic */ class C111470b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111472d f310105a;

    public /* synthetic */ C111470b(C111472d dVar) {
        this.f310105a = dVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar;
        C111472d dVar = this.f310105a;
        C73853f fVar = (C73853f) obj;
        C113407er p = C113408es.m187705p();
        if (fVar.mo65335a().isEmpty()) {
            Locale locale = Locale.US;
            C109399b bVar = dVar.f310106a;
            C109422u uVar = bVar.f304692b;
            guVar = (C58485gu) Collection.EL.stream(new a(locale, C58485gu.m89842j(C109422u.m182104f(((C73841bf) bVar.f304691a.mo27525b()).mo65322a()))).a).map(new C111471c()).collect(C58370cn.f155946a);
        } else {
            guVar = (C58485gu) Collection.EL.stream(fVar.mo65335a()).map(new C111471c()).collect(C58370cn.f155946a);
        }
        int a = (int) dVar.f310107b.mo79743a(C90063do.f249291ak);
        if (a >= 0 && a < guVar.size()) {
            ArrayList arrayList = new ArrayList(guVar);
            Collections.shuffle(arrayList);
            guVar = C58485gu.m89842j(arrayList.subList(0, a));
        }
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(guVar)));
        return p.mo100091a();
    }
}
